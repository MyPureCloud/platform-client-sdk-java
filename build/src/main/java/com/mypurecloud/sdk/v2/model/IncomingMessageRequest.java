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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.InputMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Incoming Message request
 */
@ApiModel(description = "Incoming Message request")

public class IncomingMessageRequest  implements Serializable {
  
  private String botId = null;
  private String botName = null;
  private String botVersion = null;
  private String integrationId = null;
  private String botSessionId = null;
  private String automateFlowExecId = null;
  private String conversationId = null;
  private String languageCode = null;
  private InputMessage inputMessage = null;

  private static class MessagingPlatformTypeEnumDeserializer extends StdDeserializer<MessagingPlatformTypeEnum> {
    public MessagingPlatformTypeEnumDeserializer() {
      super(MessagingPlatformTypeEnumDeserializer.class);
    }

    @Override
    public MessagingPlatformTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessagingPlatformTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of messaging platform being used
   */
 @JsonDeserialize(using = MessagingPlatformTypeEnumDeserializer.class)
  public enum MessagingPlatformTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PHONE("Phone"),
    SMS("SMS"),
    GENESYSWEBWIDGET("GenesysWebWidget"),
    FACEBOOKMESSENGER("FacebookMessenger"),
    WECHAT("WeChat"),
    WHATSAPP("Whatsapp"),
    APPLEBUSINESSCHAT("AppleBusinessChat"),
    APPLE("Apple"),
    TELEGRAM("Telegram"),
    SLACK("Slack"),
    SIGNAL("Signal"),
    LINE("Line"),
    DISCORD("Discord"),
    TWITTERDIRECTMESSAGE("TwitterDirectMessage"),
    OPEN("Open"),
    INSTAGRAM("Instagram"),
    OTHER("Other"),
    UNKNOWN("Unknown");

    private String value;

    MessagingPlatformTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessagingPlatformTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessagingPlatformTypeEnum value : MessagingPlatformTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessagingPlatformTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessagingPlatformTypeEnum messagingPlatformType = null;

  private static class ChannelsEnumDeserializer extends StdDeserializer<ChannelsEnum> {
    public ChannelsEnumDeserializer() {
      super(ChannelsEnumDeserializer.class);
    }

    @Override
    public ChannelsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ChannelsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets channels
   */
 @JsonDeserialize(using = ChannelsEnumDeserializer.class)
  public enum ChannelsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("Call"),
    CALLBACK("Callback"),
    MESSAGING("Messaging"),
    WEBCHAT("Webchat");

    private String value;

    ChannelsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChannelsEnum fromString(String key) {
      if (key == null) return null;

      for (ChannelsEnum value : ChannelsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ChannelsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ChannelsEnum> channels = null;
  private Integer botSessionTimeout = null;
  private Map<String, String> parameters = null;

  public IncomingMessageRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      channels = new ArrayList<ChannelsEnum>();
    }
  }

  
  /**
   * The unique id of the bot.
   **/
  public IncomingMessageRequest botId(String botId) {
    this.botId = botId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique id of the bot.")
  @JsonProperty("botId")
  public String getBotId() {
    return botId;
  }
  public void setBotId(String botId) {
    this.botId = botId;
  }


  /**
   * Name of the bot
   **/
  public IncomingMessageRequest botName(String botName) {
    this.botName = botName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the bot")
  @JsonProperty("botName")
  public String getBotName() {
    return botName;
  }
  public void setBotName(String botName) {
    this.botName = botName;
  }


  /**
   * The version of the bot.
   **/
  public IncomingMessageRequest botVersion(String botVersion) {
    this.botVersion = botVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of the bot.")
  @JsonProperty("botVersion")
  public String getBotVersion() {
    return botVersion;
  }
  public void setBotVersion(String botVersion) {
    this.botVersion = botVersion;
  }


  /**
   * The Integration Id for the bot's configuration
   **/
  public IncomingMessageRequest integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Integration Id for the bot's configuration")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * The id of the session. This id will be used for an entire conversation with the bot (a series of back and forth between the bot until the bot has fulfilled its intent).
   **/
  public IncomingMessageRequest botSessionId(String botSessionId) {
    this.botSessionId = botSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the session. This id will be used for an entire conversation with the bot (a series of back and forth between the bot until the bot has fulfilled its intent).")
  @JsonProperty("botSessionId")
  public String getBotSessionId() {
    return botSessionId;
  }
  public void setBotSessionId(String botSessionId) {
    this.botSessionId = botSessionId;
  }


  /**
   * Execution ID of the Automate Flow.
   **/
  public IncomingMessageRequest automateFlowExecId(String automateFlowExecId) {
    this.automateFlowExecId = automateFlowExecId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Execution ID of the Automate Flow.")
  @JsonProperty("automateFlowExecId")
  public String getAutomateFlowExecId() {
    return automateFlowExecId;
  }
  public void setAutomateFlowExecId(String automateFlowExecId) {
    this.automateFlowExecId = automateFlowExecId;
  }


  /**
   * Genesys conversation ID.
   **/
  public IncomingMessageRequest conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Genesys conversation ID.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * Language code for the conversation (e.g., 'en-US').
   **/
  public IncomingMessageRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Language code for the conversation (e.g., 'en-US').")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  /**
   * Message received from the user to send to the bot
   **/
  public IncomingMessageRequest inputMessage(InputMessage inputMessage) {
    this.inputMessage = inputMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message received from the user to send to the bot")
  @JsonProperty("inputMessage")
  public InputMessage getInputMessage() {
    return inputMessage;
  }
  public void setInputMessage(InputMessage inputMessage) {
    this.inputMessage = inputMessage;
  }


  /**
   * Type of messaging platform being used
   **/
  public IncomingMessageRequest messagingPlatformType(MessagingPlatformTypeEnum messagingPlatformType) {
    this.messagingPlatformType = messagingPlatformType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of messaging platform being used")
  @JsonProperty("messagingPlatformType")
  public MessagingPlatformTypeEnum getMessagingPlatformType() {
    return messagingPlatformType;
  }
  public void setMessagingPlatformType(MessagingPlatformTypeEnum messagingPlatformType) {
    this.messagingPlatformType = messagingPlatformType;
  }


  /**
   * The channels this bot is utilizing.
   **/
  public IncomingMessageRequest channels(List<ChannelsEnum> channels) {
    this.channels = channels;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channels this bot is utilizing.")
  @JsonProperty("channels")
  public List<ChannelsEnum> getChannels() {
    return channels;
  }
  public void setChannels(List<ChannelsEnum> channels) {
    this.channels = channels;
  }


  /**
   * Timeout duration for bot session in minutes.
   **/
  public IncomingMessageRequest botSessionTimeout(Integer botSessionTimeout) {
    this.botSessionTimeout = botSessionTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timeout duration for bot session in minutes.")
  @JsonProperty("botSessionTimeout")
  public Integer getBotSessionTimeout() {
    return botSessionTimeout;
  }
  public void setBotSessionTimeout(Integer botSessionTimeout) {
    this.botSessionTimeout = botSessionTimeout;
  }


  /**
   * This is a map of string-string key, value pairs containing optional fields that can be passed to the bot for custom behavior, tracking, etc.
   **/
  public IncomingMessageRequest parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a map of string-string key, value pairs containing optional fields that can be passed to the bot for custom behavior, tracking, etc.")
  @JsonProperty("parameters")
  public Map<String, String> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomingMessageRequest incomingMessageRequest = (IncomingMessageRequest) o;

    return Objects.equals(this.botId, incomingMessageRequest.botId) &&
            Objects.equals(this.botName, incomingMessageRequest.botName) &&
            Objects.equals(this.botVersion, incomingMessageRequest.botVersion) &&
            Objects.equals(this.integrationId, incomingMessageRequest.integrationId) &&
            Objects.equals(this.botSessionId, incomingMessageRequest.botSessionId) &&
            Objects.equals(this.automateFlowExecId, incomingMessageRequest.automateFlowExecId) &&
            Objects.equals(this.conversationId, incomingMessageRequest.conversationId) &&
            Objects.equals(this.languageCode, incomingMessageRequest.languageCode) &&
            Objects.equals(this.inputMessage, incomingMessageRequest.inputMessage) &&
            Objects.equals(this.messagingPlatformType, incomingMessageRequest.messagingPlatformType) &&
            Objects.equals(this.channels, incomingMessageRequest.channels) &&
            Objects.equals(this.botSessionTimeout, incomingMessageRequest.botSessionTimeout) &&
            Objects.equals(this.parameters, incomingMessageRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, botName, botVersion, integrationId, botSessionId, automateFlowExecId, conversationId, languageCode, inputMessage, messagingPlatformType, channels, botSessionTimeout, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomingMessageRequest {\n");
    
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    botName: ").append(toIndentedString(botName)).append("\n");
    sb.append("    botVersion: ").append(toIndentedString(botVersion)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    botSessionId: ").append(toIndentedString(botSessionId)).append("\n");
    sb.append("    automateFlowExecId: ").append(toIndentedString(automateFlowExecId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    inputMessage: ").append(toIndentedString(inputMessage)).append("\n");
    sb.append("    messagingPlatformType: ").append(toIndentedString(messagingPlatformType)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    botSessionTimeout: ").append(toIndentedString(botSessionTimeout)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

