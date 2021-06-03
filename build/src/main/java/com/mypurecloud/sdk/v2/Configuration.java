package com.mypurecloud.sdk.v2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.ini4j.Ini;
import java.util.Map;


public class Configuration {
  private static ApiClient defaultApiClient = null;
  private static String configFilePath = null;
  private static Logger logger = null;
  private static FileWatcher configFileWatcher = null;
  private static FileWatcher.FileAdapter configListener = null;
  private static ApiClient.LoggingConfiguration loggingConfiguration;

  /**
   * Get the default API client, which would be used when creating API
   * instances without providing an API client.
   */
  public static ApiClient getDefaultApiClient() {
    if (defaultApiClient == null)
      defaultApiClient = new ApiClient();
    return defaultApiClient;
   }

  /**
   * Set the default API client, which would be used when creating API
   * instances without providing an API client.
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
    logger = defaultApiClient.getLogger();
    configFilePath = defaultApiClient.getConfigFilePath();
    loggingConfiguration = defaultApiClient.getLoggingConfiguration();
    Configuration configuration = new Configuration();
    configuration.applyConfigFromFile();
    configuration.configureAutoReload();
  }

  private boolean configureAutoReload() {
    boolean shouldUnsubscribeFromFileWatcher = !defaultApiClient.getAutoReloadConfig()
            && configFileWatcher != null
            && configFileWatcher.getListeners().contains(configListener);
    boolean shouldSubscribeToFileWatcher = defaultApiClient.getAutoReloadConfig()
            && (configFileWatcher == null || configFileWatcher.getListeners().size() == 0);
    if (shouldUnsubscribeFromFileWatcher) {
      return true;
    }
    if (shouldSubscribeToFileWatcher) {
      if (configFileWatcher == null) {
        initializeFileWatcher();
      } else {
        configFileWatcher.addListener(configListener);
      }
    }
    return false;
  }

  private String regexEscape(String str) {
    return str.replace("\\", "\\\\");
  }

  private void initializeFileWatcher() {
    File configFile = new File(configFilePath);
    File parentFolder = configFile.getParentFile();
    StringBuilder configFileName = new StringBuilder(Paths.get(configFilePath).getFileName().toString());
    while (parentFolder != null && !parentFolder.exists()) {
      File temp = parentFolder.getParentFile();
      if (temp != null) {
        parentFolder = temp;
        String[] splitPaths = regexEscape(configFile.getAbsolutePath()).split(regexEscape(parentFolder.getAbsolutePath()));
        configFileName = new StringBuilder(splitPaths[splitPaths.length - 1]);
      } else {
        break;
      }
    }
    if (parentFolder != null) {
      configListener = new FileWatcher.FileAdapter() {
        public boolean onModified(FileWatcher.FileEvent event) {
          applyConfigFromFile();
          return configureAutoReload();
        }
        public boolean onCreated(FileWatcher.FileEvent event) {
          applyConfigFromFile();
          return configureAutoReload();
        }
      };
      configFileWatcher = new FileWatcher(parentFolder, Paths.get(configFileName.toString())).addListener(configListener);
      configFileWatcher.watch();
    }
  }

  private void applyConfigFromFile() {
    ConfigurationParser parser = new ConfigurationParser(configFilePath);
    if (!parser.read()) {
      return;
    }
    // Logging
    String logLevel = parser.getString("logging", "log_level");
    if (logLevel != null && !logLevel.isEmpty()) {
        logger.setLevel(Logger.logLevelFromString(logLevel));
    }
    String logFormat = parser.getString("logging", "log_format");
    if (logFormat != null && !logFormat.isEmpty()) {
        logger.setFormat(Logger.logFormatFromString(logFormat));
    }
    String logToConsole = parser.getString("logging", "log_to_console");
    if (logToConsole != null && !logToConsole.isEmpty()) {
        logger.setLogToConsole(parser.getBool("logging", "log_to_console"));
    }
    String logFilePath = parser.getString("logging", "log_file_path");
    if (logFilePath != null && !logFilePath.isEmpty()) {
        logger.setLogFilePath(logFilePath);
    }
    String logRequestBody = parser.getString("logging", "log_request_body");
    if (logRequestBody != null && !logRequestBody.isEmpty()) {
        logger.setLogRequestBody(parser.getBool("logging", "log_request_body"));
    }
    String logResponseBody = parser.getString("logging", "log_response_body");
    if (logResponseBody != null && !logResponseBody.isEmpty()) {
        logger.setLogResponseBody(parser.getBool("logging", "log_response_body"));
    }
    // General
    String host = parser.getString("general", "host");
    if (host != null && !host.isEmpty()) {
        defaultApiClient.setBasePath(host);
    }
    String liveReloadConfig = parser.getString("general", "live_reload_config");
    if (liveReloadConfig != null && !liveReloadConfig.isEmpty()) {
        defaultApiClient.setAutoReloadConfig(parser.getBool("general", "live_reload_config"));
    }
    // Re-authentication
    String refreshAccessToken = parser.getString("reauthentication", "refresh_access_token");
    if (refreshAccessToken != null && !refreshAccessToken.isEmpty()) {
        defaultApiClient.setShouldRefreshAccessToken(parser.getBool("reauthentication", "refresh_access_token"));
    }
    String refreshTokenWaitTime = parser.getString("reauthentication", "refresh_token_wait_max");
    if (refreshTokenWaitTime != null && !refreshTokenWaitTime.isEmpty()) {
        defaultApiClient.setRefreshTokenWaitTime(parser.getInt("reauthentication", "refresh_token_wait_max"));
    }
    // Retry
    String maxRetryTimeSec = parser.getString("retry", "retry_wait_max");
    if (maxRetryTimeSec != null && !maxRetryTimeSec.isEmpty()) {
        ApiClient.RetryConfiguration retryConfiguration = defaultApiClient.getRetryConfiguration();
        retryConfiguration.setMaxRetryTimeSec(parser.getInt("retry", "retry_wait_max"));
        defaultApiClient.setRetryConfiguration(retryConfiguration);
    }
    String retryMax = parser.getString("retry", "retry_max");
    if (retryMax != null && !retryMax.isEmpty()) {
      ApiClient.RetryConfiguration retryConfiguration = defaultApiClient.getRetryConfiguration();
      retryConfiguration.setRetryMax(parser.getInt("retry", "retry_max"));
      defaultApiClient.setRetryConfiguration(retryConfiguration);
    }
  }
  
  private class ConfigurationParser {
    private String filePath;
    private FileFormat fileFormat;
    private Ini iniData;
    private Map<String, Object> jsonData;

    public ConfigurationParser(String filePath) {
      this.filePath = filePath;
      this.fileFormat = FileFormat.Invalid;
    }

    private boolean read() {
      boolean emptyData = true;
      try {
        byte[] data = Files.readAllBytes(Paths.get(filePath));
        String contents = new String(data).replaceAll("\\\\", "/");
        InputStream stream = new ByteArrayInputStream(contents.getBytes());

        iniData = new Ini(stream);
        
        fileFormat = FileFormat.INI;
        emptyData = iniData.isEmpty();
      } catch (FileNotFoundException e) {
        return false;
      } catch (Exception e) {
        try {
          ObjectMapper objectMapper = new ObjectMapper();
          File configFile = new File(filePath);
          jsonData = objectMapper.readValue(configFile, Map.class);
          fileFormat = FileFormat.JSON;
          emptyData = jsonData == null || jsonData.isEmpty();
        } catch (Exception ex) {
          return false;
        }
      }
      // don't parse config file if it is empty
      return !emptyData;
    }

    private String getString(String section, String key) {
      switch (fileFormat) {
        case INI:
          return getIniString(section, key);
        case JSON:
          return getJsonString(section, key);
        default: 
          return "";
      }
    }

    private boolean getBool(String section, String key) {
      switch (fileFormat) {
        case INI:
          return getIniBool(section, key);
        case JSON:
          return getJsonBool(section, key);
        default: 
          return false;
      }
    }

    private int getInt(String section, String key) {
      switch (fileFormat) {
        case INI:
          return getIniInt(section, key);
        case JSON:
          return getJsonInt(section, key);
        default: 
          return 0;
      }
    }

    private String getJsonString(String section, String key) {
      try {
        Map<String, Object> sectionData = (Map<String, Object>)jsonData.get(section);
        return sectionData.get(key).toString().trim();
      } catch (Exception e) {
        return "";
      }
    }

    private boolean getJsonBool(String section, String key) {
      try {
        Map<String, Object> sectionData = (Map<String, Object>)jsonData.get(section);
        return Boolean.parseBoolean(sectionData.get(key).toString().trim());
      } catch (Exception e) {
        return false;
      }
    }

    private int getJsonInt(String section, String key) {
      try {
        Map<String, Object> sectionData = (Map<String, Object>)jsonData.get(section);
        return Integer.parseInt(sectionData.get(key).toString().trim());
      } catch (Exception e) {
        return -1;
      }
    }

    private String getIniString(String section, String key) {
      try {
        Ini.Section sectionData = iniData.get(section);
        return sectionData.get(key).trim();
      } catch (Exception e) {
        return "";
      }
    }

    private boolean getIniBool(String section, String key) {
      try {
        Ini.Section sectionData = iniData.get(section);
        return Boolean.parseBoolean(sectionData.get(key).trim());
      } catch (Exception e) {
        return false;
      }
    }

    private int getIniInt(String section, String key) {
      try {
        Ini.Section sectionData = iniData.get(section);
        return Integer.parseInt(sectionData.get(key).trim());
      } catch (Exception e) {
        return -1;
      }
    }

  }

  private enum FileFormat {
    INI,
    Invalid,
    JSON
  }
}