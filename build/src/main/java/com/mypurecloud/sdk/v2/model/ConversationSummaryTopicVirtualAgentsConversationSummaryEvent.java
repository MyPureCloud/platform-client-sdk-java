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
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsConversationFollowupAction;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsConversationHeadline;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsConversationReason;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsConversationResolution;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsConversationSummary;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsConversationWrapUpCode;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicVirtualAgentsTriggerSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationSummaryTopicVirtualAgentsConversationSummaryEvent
 */

public class ConversationSummaryTopicVirtualAgentsConversationSummaryEvent  implements Serializable {
  
  private String conversationId = null;
  private String queueId = null;
  private List<ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant> participants = null;
  private List<String> communicationIds = null;
  private Date createdDate = null;

  private static class MessageTypeEnumDeserializer extends StdDeserializer<MessageTypeEnum> {
    public MessageTypeEnumDeserializer() {
      super(MessageTypeEnumDeserializer.class);
    }

    @Override
    public MessageTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessageTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets messageType
   */
 @JsonDeserialize(using = MessageTypeEnumDeserializer.class)
  public enum MessageTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    SMS("SMS"),
    TWITTER("TWITTER"),
    FACEBOOK("FACEBOOK"),
    INSTAGRAM("INSTAGRAM"),
    LINE("LINE"),
    WHATSAPP("WHATSAPP"),
    WEBMESSAGING("WEBMESSAGING"),
    OPEN("OPEN"),
    APPLE("APPLE");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypeEnum value : MessageTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageTypeEnum messageType = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    MESSAGE("MESSAGE"),
    CALL("CALL"),
    EMAIL("EMAIL");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String summaryId = null;
  private String language = null;
  private ConversationSummaryTopicVirtualAgentsConversationSummary summary = null;
  private ConversationSummaryTopicVirtualAgentsConversationHeadline headline = null;
  private ConversationSummaryTopicVirtualAgentsConversationReason reason = null;
  private ConversationSummaryTopicVirtualAgentsConversationResolution resolution = null;
  private List<ConversationSummaryTopicVirtualAgentsConversationFollowupAction> followupActions = null;
  private List<ConversationSummaryTopicVirtualAgentsConversationWrapUpCode> wrapUpCodes = null;
  private ConversationSummaryTopicVirtualAgentsTriggerSource triggerSource = null;
  private ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant lastEditedBy = null;

  private static class ErrorTypeEnumDeserializer extends StdDeserializer<ErrorTypeEnum> {
    public ErrorTypeEnumDeserializer() {
      super(ErrorTypeEnumDeserializer.class);
    }

    @Override
    public ErrorTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ErrorTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets errorType
   */
 @JsonDeserialize(using = ErrorTypeEnumDeserializer.class)
  public enum ErrorTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    CONVERSATION_TOO_LONG("CONVERSATION_TOO_LONG"),
    CONVERSATION_TOO_SHORT("CONVERSATION_TOO_SHORT"),
    RATE_LIMITED("RATE_LIMITED");

    private String value;

    ErrorTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ErrorTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ErrorTypeEnum value : ErrorTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ErrorTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ErrorTypeEnum errorType = null;
  private Long durationMs = null;

  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant>();
      communicationIds = new ArrayList<String>();
      followupActions = new ArrayList<ConversationSummaryTopicVirtualAgentsConversationFollowupAction>();
      wrapUpCodes = new ArrayList<ConversationSummaryTopicVirtualAgentsConversationWrapUpCode>();
    }
  }

  
  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent participants(List<ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant> participants) {
    this.participants = participants;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent communicationIds(List<String> communicationIds) {
    this.communicationIds = communicationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communicationIds")
  public List<String> getCommunicationIds() {
    return communicationIds;
  }
  public void setCommunicationIds(List<String> communicationIds) {
    this.communicationIds = communicationIds;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageType")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent summaryId(String summaryId) {
    this.summaryId = summaryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summaryId")
  public String getSummaryId() {
    return summaryId;
  }
  public void setSummaryId(String summaryId) {
    this.summaryId = summaryId;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent summary(ConversationSummaryTopicVirtualAgentsConversationSummary summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summary")
  public ConversationSummaryTopicVirtualAgentsConversationSummary getSummary() {
    return summary;
  }
  public void setSummary(ConversationSummaryTopicVirtualAgentsConversationSummary summary) {
    this.summary = summary;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent headline(ConversationSummaryTopicVirtualAgentsConversationHeadline headline) {
    this.headline = headline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("headline")
  public ConversationSummaryTopicVirtualAgentsConversationHeadline getHeadline() {
    return headline;
  }
  public void setHeadline(ConversationSummaryTopicVirtualAgentsConversationHeadline headline) {
    this.headline = headline;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent reason(ConversationSummaryTopicVirtualAgentsConversationReason reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reason")
  public ConversationSummaryTopicVirtualAgentsConversationReason getReason() {
    return reason;
  }
  public void setReason(ConversationSummaryTopicVirtualAgentsConversationReason reason) {
    this.reason = reason;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent resolution(ConversationSummaryTopicVirtualAgentsConversationResolution resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resolution")
  public ConversationSummaryTopicVirtualAgentsConversationResolution getResolution() {
    return resolution;
  }
  public void setResolution(ConversationSummaryTopicVirtualAgentsConversationResolution resolution) {
    this.resolution = resolution;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent followupActions(List<ConversationSummaryTopicVirtualAgentsConversationFollowupAction> followupActions) {
    this.followupActions = followupActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("followupActions")
  public List<ConversationSummaryTopicVirtualAgentsConversationFollowupAction> getFollowupActions() {
    return followupActions;
  }
  public void setFollowupActions(List<ConversationSummaryTopicVirtualAgentsConversationFollowupAction> followupActions) {
    this.followupActions = followupActions;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent wrapUpCodes(List<ConversationSummaryTopicVirtualAgentsConversationWrapUpCode> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapUpCodes")
  public List<ConversationSummaryTopicVirtualAgentsConversationWrapUpCode> getWrapUpCodes() {
    return wrapUpCodes;
  }
  public void setWrapUpCodes(List<ConversationSummaryTopicVirtualAgentsConversationWrapUpCode> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent triggerSource(ConversationSummaryTopicVirtualAgentsTriggerSource triggerSource) {
    this.triggerSource = triggerSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggerSource")
  public ConversationSummaryTopicVirtualAgentsTriggerSource getTriggerSource() {
    return triggerSource;
  }
  public void setTriggerSource(ConversationSummaryTopicVirtualAgentsTriggerSource triggerSource) {
    this.triggerSource = triggerSource;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent lastEditedBy(ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant lastEditedBy) {
    this.lastEditedBy = lastEditedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastEditedBy")
  public ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant getLastEditedBy() {
    return lastEditedBy;
  }
  public void setLastEditedBy(ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant lastEditedBy) {
    this.lastEditedBy = lastEditedBy;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent errorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorType")
  public ErrorTypeEnum getErrorType() {
    return errorType;
  }
  public void setErrorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationSummaryEvent durationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMs")
  public Long getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSummaryTopicVirtualAgentsConversationSummaryEvent conversationSummaryTopicVirtualAgentsConversationSummaryEvent = (ConversationSummaryTopicVirtualAgentsConversationSummaryEvent) o;

    return Objects.equals(this.conversationId, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.conversationId) &&
            Objects.equals(this.queueId, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.queueId) &&
            Objects.equals(this.participants, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.participants) &&
            Objects.equals(this.communicationIds, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.communicationIds) &&
            Objects.equals(this.createdDate, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.createdDate) &&
            Objects.equals(this.messageType, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.messageType) &&
            Objects.equals(this.mediaType, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.mediaType) &&
            Objects.equals(this.summaryId, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.summaryId) &&
            Objects.equals(this.language, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.language) &&
            Objects.equals(this.summary, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.summary) &&
            Objects.equals(this.headline, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.headline) &&
            Objects.equals(this.reason, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.reason) &&
            Objects.equals(this.resolution, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.resolution) &&
            Objects.equals(this.followupActions, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.followupActions) &&
            Objects.equals(this.wrapUpCodes, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.wrapUpCodes) &&
            Objects.equals(this.triggerSource, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.triggerSource) &&
            Objects.equals(this.lastEditedBy, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.lastEditedBy) &&
            Objects.equals(this.errorType, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.errorType) &&
            Objects.equals(this.durationMs, conversationSummaryTopicVirtualAgentsConversationSummaryEvent.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, queueId, participants, communicationIds, createdDate, messageType, mediaType, summaryId, language, summary, headline, reason, resolution, followupActions, wrapUpCodes, triggerSource, lastEditedBy, errorType, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummaryTopicVirtualAgentsConversationSummaryEvent {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    communicationIds: ").append(toIndentedString(communicationIds)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    followupActions: ").append(toIndentedString(followupActions)).append("\n");
    sb.append("    wrapUpCodes: ").append(toIndentedString(wrapUpCodes)).append("\n");
    sb.append("    triggerSource: ").append(toIndentedString(triggerSource)).append("\n");
    sb.append("    lastEditedBy: ").append(toIndentedString(lastEditedBy)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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

