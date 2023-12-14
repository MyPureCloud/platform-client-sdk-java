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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.BotChannel;
import com.mypurecloud.sdk.v2.model.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * BotFlowSession
 */

public class BotFlowSession  implements Serializable {
  
  private String id = null;
  private Entity flow = null;
  private BotChannel channel = null;
  private String language = null;
  private String endLanguage = null;

  private static class BotResultEnumDeserializer extends StdDeserializer<BotResultEnum> {
    public BotResultEnumDeserializer() {
      super(BotResultEnumDeserializer.class);
    }

    @Override
    public BotResultEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotResultEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason for session termination.
   */
 @JsonDeserialize(using = BotResultEnumDeserializer.class)
  public enum BotResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    EXITREQUESTEDBYUSER("ExitRequestedByUser"),
    EXITREQUESTEDBYBOT("ExitRequestedByBot"),
    EXITERROR("ExitError"),
    EXITRECOGNITIONFAILURE("ExitRecognitionFailure"),
    DISCONNECTREQUESTEDBYUSER("DisconnectRequestedByUser"),
    DISCONNECTREQUESTEDBYBOT("DisconnectRequestedByBot"),
    DISCONNECTSESSIONEXPIRED("DisconnectSessionExpired"),
    DISCONNECTERROR("DisconnectError"),
    DISCONNECTRECOGNITIONFAILURE("DisconnectRecognitionFailure"),
    TRANSFERTOACD("TransferToACD");

    private String value;

    BotResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotResultEnum fromString(String key) {
      if (key == null) return null;

      for (BotResultEnum value : BotResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BotResultEnum botResult = null;

  private static class BotResultCategoryEnumDeserializer extends StdDeserializer<BotResultCategoryEnum> {
    public BotResultCategoryEnumDeserializer() {
      super(BotResultCategoryEnumDeserializer.class);
    }

    @Override
    public BotResultCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotResultCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The category of result for the session.
   */
 @JsonDeserialize(using = BotResultCategoryEnumDeserializer.class)
  public enum BotResultCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    USEREXIT("UserExit"),
    BOTEXIT("BotExit"),
    ERROR("Error"),
    RECOGNITIONFAILURE("RecognitionFailure"),
    USERDISCONNECT("UserDisconnect"),
    BOTDISCONNECT("BotDisconnect"),
    SESSIONEXPIRED("SessionExpired"),
    TRANSFER("Transfer");

    private String value;

    BotResultCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotResultCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (BotResultCategoryEnum value : BotResultCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotResultCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BotResultCategoryEnum botResultCategory = null;
  private Date dateCreated = null;
  private AddressableEntityRef conversation = null;

  
  /**
   * The ID of the bot session.
   **/
  public BotFlowSession id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the bot session.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The flow associated to this bot session.
   **/
  public BotFlowSession flow(Entity flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow associated to this bot session.")
  @JsonProperty("flow")
  public Entity getFlow() {
    return flow;
  }
  public void setFlow(Entity flow) {
    this.flow = flow;
  }


  /**
   * Channel-specific information that describes the message channel/provider.
   **/
  public BotFlowSession channel(BotChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Channel-specific information that describes the message channel/provider.")
  @JsonProperty("channel")
  public BotChannel getChannel() {
    return channel;
  }
  public void setChannel(BotChannel channel) {
    this.channel = channel;
  }


  /**
   * The initial language of operation for the session.
   **/
  public BotFlowSession language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The initial language of operation for the session.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * The language of the session at the time the session ended
   **/
  public BotFlowSession endLanguage(String endLanguage) {
    this.endLanguage = endLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language of the session at the time the session ended")
  @JsonProperty("endLanguage")
  public String getEndLanguage() {
    return endLanguage;
  }
  public void setEndLanguage(String endLanguage) {
    this.endLanguage = endLanguage;
  }


  /**
   * The reason for session termination.
   **/
  public BotFlowSession botResult(BotResultEnum botResult) {
    this.botResult = botResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason for session termination.")
  @JsonProperty("botResult")
  public BotResultEnum getBotResult() {
    return botResult;
  }
  public void setBotResult(BotResultEnum botResult) {
    this.botResult = botResult;
  }


  /**
   * The category of result for the session.
   **/
  public BotFlowSession botResultCategory(BotResultCategoryEnum botResultCategory) {
    this.botResultCategory = botResultCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of result for the session.")
  @JsonProperty("botResultCategory")
  public BotResultCategoryEnum getBotResultCategory() {
    return botResultCategory;
  }
  public void setBotResultCategory(BotResultCategoryEnum botResultCategory) {
    this.botResultCategory = botResultCategory;
  }


  /**
   * Timestamp indicating when the session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BotFlowSession dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The conversation details, across potentially multiple Bot Flow sessions.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotFlowSession botFlowSession = (BotFlowSession) o;

    return Objects.equals(this.id, botFlowSession.id) &&
            Objects.equals(this.flow, botFlowSession.flow) &&
            Objects.equals(this.channel, botFlowSession.channel) &&
            Objects.equals(this.language, botFlowSession.language) &&
            Objects.equals(this.endLanguage, botFlowSession.endLanguage) &&
            Objects.equals(this.botResult, botFlowSession.botResult) &&
            Objects.equals(this.botResultCategory, botFlowSession.botResultCategory) &&
            Objects.equals(this.dateCreated, botFlowSession.dateCreated) &&
            Objects.equals(this.conversation, botFlowSession.conversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flow, channel, language, endLanguage, botResult, botResultCategory, dateCreated, conversation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotFlowSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    endLanguage: ").append(toIndentedString(endLanguage)).append("\n");
    sb.append("    botResult: ").append(toIndentedString(botResult)).append("\n");
    sb.append("    botResultCategory: ").append(toIndentedString(botResultCategory)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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

