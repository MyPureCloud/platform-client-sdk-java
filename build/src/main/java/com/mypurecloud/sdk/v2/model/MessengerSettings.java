package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.FileUploadSettings;
import com.mypurecloud.sdk.v2.model.LauncherButtonSettings;
import com.mypurecloud.sdk.v2.model.MessengerApps;
import com.mypurecloud.sdk.v2.model.MessengerHomeScreen;
import com.mypurecloud.sdk.v2.model.MessengerStyles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings concerning messenger
 */
@ApiModel(description = "Settings concerning messenger")

public class MessengerSettings  implements Serializable {
  
  private Boolean enabled = null;
  private MessengerStyles styles = null;
  private LauncherButtonSettings launcherButton = null;
  private FileUploadSettings fileUpload = null;
  private MessengerApps apps = null;
  private MessengerHomeScreen homeScreen = null;

  private static class SessionPersistenceTypeEnumDeserializer extends StdDeserializer<SessionPersistenceTypeEnum> {
    public SessionPersistenceTypeEnumDeserializer() {
      super(SessionPersistenceTypeEnumDeserializer.class);
    }

    @Override
    public SessionPersistenceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SessionPersistenceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The session persistence type for messenger
   */
 @JsonDeserialize(using = SessionPersistenceTypeEnumDeserializer.class)
  public enum SessionPersistenceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACROSSSUBDOMAINS("AcrossSubdomains"),
    DOMAINORSUBDOMAINONLY("DomainOrSubdomainOnly");

    private String value;

    SessionPersistenceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SessionPersistenceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SessionPersistenceTypeEnum value : SessionPersistenceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SessionPersistenceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SessionPersistenceTypeEnum sessionPersistenceType = null;

  
  /**
   * Whether or not messenger is enabled
   **/
  public MessengerSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not messenger is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The style settings for messenger
   **/
  public MessengerSettings styles(MessengerStyles styles) {
    this.styles = styles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The style settings for messenger")
  @JsonProperty("styles")
  public MessengerStyles getStyles() {
    return styles;
  }
  public void setStyles(MessengerStyles styles) {
    this.styles = styles;
  }


  /**
   * The launcher button settings for messenger
   **/
  public MessengerSettings launcherButton(LauncherButtonSettings launcherButton) {
    this.launcherButton = launcherButton;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The launcher button settings for messenger")
  @JsonProperty("launcherButton")
  public LauncherButtonSettings getLauncherButton() {
    return launcherButton;
  }
  public void setLauncherButton(LauncherButtonSettings launcherButton) {
    this.launcherButton = launcherButton;
  }


  /**
   * The file upload settings for messenger
   **/
  public MessengerSettings fileUpload(FileUploadSettings fileUpload) {
    this.fileUpload = fileUpload;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The file upload settings for messenger")
  @JsonProperty("fileUpload")
  public FileUploadSettings getFileUpload() {
    return fileUpload;
  }
  public void setFileUpload(FileUploadSettings fileUpload) {
    this.fileUpload = fileUpload;
  }


  /**
   * The apps embedded in the messenger
   **/
  public MessengerSettings apps(MessengerApps apps) {
    this.apps = apps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The apps embedded in the messenger")
  @JsonProperty("apps")
  public MessengerApps getApps() {
    return apps;
  }
  public void setApps(MessengerApps apps) {
    this.apps = apps;
  }


  /**
   * The homescreen settings for messenger
   **/
  public MessengerSettings homeScreen(MessengerHomeScreen homeScreen) {
    this.homeScreen = homeScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The homescreen settings for messenger")
  @JsonProperty("homeScreen")
  public MessengerHomeScreen getHomeScreen() {
    return homeScreen;
  }
  public void setHomeScreen(MessengerHomeScreen homeScreen) {
    this.homeScreen = homeScreen;
  }


  /**
   * The session persistence type for messenger
   **/
  public MessengerSettings sessionPersistenceType(SessionPersistenceTypeEnum sessionPersistenceType) {
    this.sessionPersistenceType = sessionPersistenceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session persistence type for messenger")
  @JsonProperty("sessionPersistenceType")
  public SessionPersistenceTypeEnum getSessionPersistenceType() {
    return sessionPersistenceType;
  }
  public void setSessionPersistenceType(SessionPersistenceTypeEnum sessionPersistenceType) {
    this.sessionPersistenceType = sessionPersistenceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessengerSettings messengerSettings = (MessengerSettings) o;

    return Objects.equals(this.enabled, messengerSettings.enabled) &&
            Objects.equals(this.styles, messengerSettings.styles) &&
            Objects.equals(this.launcherButton, messengerSettings.launcherButton) &&
            Objects.equals(this.fileUpload, messengerSettings.fileUpload) &&
            Objects.equals(this.apps, messengerSettings.apps) &&
            Objects.equals(this.homeScreen, messengerSettings.homeScreen) &&
            Objects.equals(this.sessionPersistenceType, messengerSettings.sessionPersistenceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, styles, launcherButton, fileUpload, apps, homeScreen, sessionPersistenceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessengerSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
    sb.append("    launcherButton: ").append(toIndentedString(launcherButton)).append("\n");
    sb.append("    fileUpload: ").append(toIndentedString(fileUpload)).append("\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    homeScreen: ").append(toIndentedString(homeScreen)).append("\n");
    sb.append("    sessionPersistenceType: ").append(toIndentedString(sessionPersistenceType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

