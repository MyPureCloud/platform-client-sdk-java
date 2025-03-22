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
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicConversationHeadline;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicConversationReason;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicConversationResolution;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicConversationSummary;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicConversationSummaryParticipant;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicConversationWrapUpCode;
import com.mypurecloud.sdk.v2.model.ConversationSummaryTopicTriggerSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationSummaryTopicConversationSummaryEvent
 */

public class ConversationSummaryTopicConversationSummaryEvent  implements Serializable {
  
  private String conversationId = null;
  private String queueId = null;
  private List<ConversationSummaryTopicConversationSummaryParticipant> participants = new ArrayList<ConversationSummaryTopicConversationSummaryParticipant>();
  private List<String> communicationIds = new ArrayList<String>();
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
  private ConversationSummaryTopicConversationSummary summary = null;
  private ConversationSummaryTopicConversationHeadline headline = null;
  private ConversationSummaryTopicConversationReason reason = null;
  private ConversationSummaryTopicConversationResolution resolution = null;
  private List<ConversationSummaryTopicConversationWrapUpCode> wrapUpCodes = new ArrayList<ConversationSummaryTopicConversationWrapUpCode>();
  private ConversationSummaryTopicTriggerSource triggerSource = null;
  private ConversationSummaryTopicConversationSummaryParticipant lastEditedBy = null;

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
  private Integer durationMs = null;

  
  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent conversationId(String conversationId) {
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
  public ConversationSummaryTopicConversationSummaryEvent queueId(String queueId) {
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
  public ConversationSummaryTopicConversationSummaryEvent participants(List<ConversationSummaryTopicConversationSummaryParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<ConversationSummaryTopicConversationSummaryParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationSummaryTopicConversationSummaryParticipant> participants) {
    this.participants = participants;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent communicationIds(List<String> communicationIds) {
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
  public ConversationSummaryTopicConversationSummaryEvent createdDate(Date createdDate) {
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
  public ConversationSummaryTopicConversationSummaryEvent messageType(MessageTypeEnum messageType) {
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
  public ConversationSummaryTopicConversationSummaryEvent mediaType(MediaTypeEnum mediaType) {
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
  public ConversationSummaryTopicConversationSummaryEvent summaryId(String summaryId) {
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
  public ConversationSummaryTopicConversationSummaryEvent language(String language) {
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
  public ConversationSummaryTopicConversationSummaryEvent summary(ConversationSummaryTopicConversationSummary summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summary")
  public ConversationSummaryTopicConversationSummary getSummary() {
    return summary;
  }
  public void setSummary(ConversationSummaryTopicConversationSummary summary) {
    this.summary = summary;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent headline(ConversationSummaryTopicConversationHeadline headline) {
    this.headline = headline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("headline")
  public ConversationSummaryTopicConversationHeadline getHeadline() {
    return headline;
  }
  public void setHeadline(ConversationSummaryTopicConversationHeadline headline) {
    this.headline = headline;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent reason(ConversationSummaryTopicConversationReason reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reason")
  public ConversationSummaryTopicConversationReason getReason() {
    return reason;
  }
  public void setReason(ConversationSummaryTopicConversationReason reason) {
    this.reason = reason;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent resolution(ConversationSummaryTopicConversationResolution resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resolution")
  public ConversationSummaryTopicConversationResolution getResolution() {
    return resolution;
  }
  public void setResolution(ConversationSummaryTopicConversationResolution resolution) {
    this.resolution = resolution;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent wrapUpCodes(List<ConversationSummaryTopicConversationWrapUpCode> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapUpCodes")
  public List<ConversationSummaryTopicConversationWrapUpCode> getWrapUpCodes() {
    return wrapUpCodes;
  }
  public void setWrapUpCodes(List<ConversationSummaryTopicConversationWrapUpCode> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent triggerSource(ConversationSummaryTopicTriggerSource triggerSource) {
    this.triggerSource = triggerSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggerSource")
  public ConversationSummaryTopicTriggerSource getTriggerSource() {
    return triggerSource;
  }
  public void setTriggerSource(ConversationSummaryTopicTriggerSource triggerSource) {
    this.triggerSource = triggerSource;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent lastEditedBy(ConversationSummaryTopicConversationSummaryParticipant lastEditedBy) {
    this.lastEditedBy = lastEditedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastEditedBy")
  public ConversationSummaryTopicConversationSummaryParticipant getLastEditedBy() {
    return lastEditedBy;
  }
  public void setLastEditedBy(ConversationSummaryTopicConversationSummaryParticipant lastEditedBy) {
    this.lastEditedBy = lastEditedBy;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryEvent errorType(ErrorTypeEnum errorType) {
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
  public ConversationSummaryTopicConversationSummaryEvent durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMs")
  public Integer getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Integer durationMs) {
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
    ConversationSummaryTopicConversationSummaryEvent conversationSummaryTopicConversationSummaryEvent = (ConversationSummaryTopicConversationSummaryEvent) o;

    return Objects.equals(this.conversationId, conversationSummaryTopicConversationSummaryEvent.conversationId) &&
            Objects.equals(this.queueId, conversationSummaryTopicConversationSummaryEvent.queueId) &&
            Objects.equals(this.participants, conversationSummaryTopicConversationSummaryEvent.participants) &&
            Objects.equals(this.communicationIds, conversationSummaryTopicConversationSummaryEvent.communicationIds) &&
            Objects.equals(this.createdDate, conversationSummaryTopicConversationSummaryEvent.createdDate) &&
            Objects.equals(this.messageType, conversationSummaryTopicConversationSummaryEvent.messageType) &&
            Objects.equals(this.mediaType, conversationSummaryTopicConversationSummaryEvent.mediaType) &&
            Objects.equals(this.summaryId, conversationSummaryTopicConversationSummaryEvent.summaryId) &&
            Objects.equals(this.language, conversationSummaryTopicConversationSummaryEvent.language) &&
            Objects.equals(this.summary, conversationSummaryTopicConversationSummaryEvent.summary) &&
            Objects.equals(this.headline, conversationSummaryTopicConversationSummaryEvent.headline) &&
            Objects.equals(this.reason, conversationSummaryTopicConversationSummaryEvent.reason) &&
            Objects.equals(this.resolution, conversationSummaryTopicConversationSummaryEvent.resolution) &&
            Objects.equals(this.wrapUpCodes, conversationSummaryTopicConversationSummaryEvent.wrapUpCodes) &&
            Objects.equals(this.triggerSource, conversationSummaryTopicConversationSummaryEvent.triggerSource) &&
            Objects.equals(this.lastEditedBy, conversationSummaryTopicConversationSummaryEvent.lastEditedBy) &&
            Objects.equals(this.errorType, conversationSummaryTopicConversationSummaryEvent.errorType) &&
            Objects.equals(this.durationMs, conversationSummaryTopicConversationSummaryEvent.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, queueId, participants, communicationIds, createdDate, messageType, mediaType, summaryId, language, summary, headline, reason, resolution, wrapUpCodes, triggerSource, lastEditedBy, errorType, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummaryTopicConversationSummaryEvent {\n");
    
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

