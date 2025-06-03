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
import com.mypurecloud.sdk.v2.model.BotEntityValue;
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.ReplyMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Outgoing Message request
 */
@ApiModel(description = "Outgoing Message request")

public class OutgoingMessageRequest  implements Serializable {
  
  private String botId = null;
  private String botVersion = null;
  private String botSessionId = null;

  private static class BotStateEnumDeserializer extends StdDeserializer<BotStateEnum> {
    public BotStateEnumDeserializer() {
      super(BotStateEnumDeserializer.class);
    }

    @Override
    public BotStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the bot reported
   */
 @JsonDeserialize(using = BotStateEnumDeserializer.class)
  public enum BotStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("Complete"),
    FAILED("Failed"),
    MOREDATA("MoreData");

    private String value;

    BotStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotStateEnum fromString(String key) {
      if (key == null) return null;

      for (BotStateEnum value : BotStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BotStateEnum botState = null;
  private String languageCode = null;
  private List<ReplyMessage> replyMessages = null;
  private String intent = null;
  private Double confidence = null;
  private ErrorInfo errorInfo = null;
  private Map<String, String> parameters = null;
  private List<BotEntityValue> entities = null;

  public OutgoingMessageRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      replyMessages = new ArrayList<ReplyMessage>();
      entities = new ArrayList<BotEntityValue>();
    }
  }

  
  /**
   * The unique id of the bot.
   **/
  public OutgoingMessageRequest botId(String botId) {
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
   * The version of the bot.
   **/
  public OutgoingMessageRequest botVersion(String botVersion) {
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
   * The id of the session. This id will be used for an entire conversation with the bot (a series of back and forth between the bot until the bot has fulfilled its intent).
   **/
  public OutgoingMessageRequest botSessionId(String botSessionId) {
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
   * The state of the bot reported
   **/
  public OutgoingMessageRequest botState(BotStateEnum botState) {
    this.botState = botState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the bot reported")
  @JsonProperty("botState")
  public BotStateEnum getBotState() {
    return botState;
  }
  public void setBotState(BotStateEnum botState) {
    this.botState = botState;
  }


  /**
   * The language used for this message. EG 'en-us' or 'es', etc; These language codes are W3C language identification tags (ISO 639-1 for the language name and ISO 3166 for the country code).
   **/
  public OutgoingMessageRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The language used for this message. EG 'en-us' or 'es', etc; These language codes are W3C language identification tags (ISO 639-1 for the language name and ISO 3166 for the country code).")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  /**
   * This is a list of messages to send back to the user, this field can be null or an empty list.
   **/
  public OutgoingMessageRequest replyMessages(List<ReplyMessage> replyMessages) {
    this.replyMessages = replyMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a list of messages to send back to the user, this field can be null or an empty list.")
  @JsonProperty("replyMessages")
  public List<ReplyMessage> getReplyMessages() {
    return replyMessages;
  }
  public void setReplyMessages(List<ReplyMessage> replyMessages) {
    this.replyMessages = replyMessages;
  }


  /**
   * The name of the intent the bot is either processing or has processed, this will be blank if no intent could be detected.
   **/
  public OutgoingMessageRequest intent(String intent) {
    this.intent = intent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the intent the bot is either processing or has processed, this will be blank if no intent could be detected.")
  @JsonProperty("intent")
  public String getIntent() {
    return intent;
  }
  public void setIntent(String intent) {
    this.intent = intent;
  }


  /**
   * A value between 0 and 1.0 denoting the confidence of the discovered intent (if found) this is optional and if left null genesys assumes a confidence of 1.0 on success and 0 on fail.
   **/
  public OutgoingMessageRequest confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value between 0 and 1.0 denoting the confidence of the discovered intent (if found) this is optional and if left null genesys assumes a confidence of 1.0 on success and 0 on fail.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  /**
   * If the botState is Failed the bot can add this error object with more details about the error.
   **/
  public OutgoingMessageRequest errorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the botState is Failed the bot can add this error object with more details about the error.")
  @JsonProperty("errorInfo")
  public ErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * This is a map of string-string key, value pairs containing optional fields that can be passed from the bot for custom behavior, tracking, etc, which can be used by the flow.
   **/
  public OutgoingMessageRequest parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a map of string-string key, value pairs containing optional fields that can be passed from the bot for custom behavior, tracking, etc, which can be used by the flow.")
  @JsonProperty("parameters")
  public Map<String, String> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  /**
   * A set of entity values that go along with the intent.
   **/
  public OutgoingMessageRequest entities(List<BotEntityValue> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of entity values that go along with the intent.")
  @JsonProperty("entities")
  public List<BotEntityValue> getEntities() {
    return entities;
  }
  public void setEntities(List<BotEntityValue> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingMessageRequest outgoingMessageRequest = (OutgoingMessageRequest) o;

    return Objects.equals(this.botId, outgoingMessageRequest.botId) &&
            Objects.equals(this.botVersion, outgoingMessageRequest.botVersion) &&
            Objects.equals(this.botSessionId, outgoingMessageRequest.botSessionId) &&
            Objects.equals(this.botState, outgoingMessageRequest.botState) &&
            Objects.equals(this.languageCode, outgoingMessageRequest.languageCode) &&
            Objects.equals(this.replyMessages, outgoingMessageRequest.replyMessages) &&
            Objects.equals(this.intent, outgoingMessageRequest.intent) &&
            Objects.equals(this.confidence, outgoingMessageRequest.confidence) &&
            Objects.equals(this.errorInfo, outgoingMessageRequest.errorInfo) &&
            Objects.equals(this.parameters, outgoingMessageRequest.parameters) &&
            Objects.equals(this.entities, outgoingMessageRequest.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, botVersion, botSessionId, botState, languageCode, replyMessages, intent, confidence, errorInfo, parameters, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingMessageRequest {\n");
    
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    botVersion: ").append(toIndentedString(botVersion)).append("\n");
    sb.append("    botSessionId: ").append(toIndentedString(botSessionId)).append("\n");
    sb.append("    botState: ").append(toIndentedString(botState)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    replyMessages: ").append(toIndentedString(replyMessages)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

