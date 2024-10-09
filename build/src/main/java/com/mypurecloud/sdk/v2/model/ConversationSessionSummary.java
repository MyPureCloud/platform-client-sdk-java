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
import com.mypurecloud.sdk.v2.model.ConversationEditedSummary;
import com.mypurecloud.sdk.v2.model.ConversationSummaryFollowup;
import com.mypurecloud.sdk.v2.model.ConversationSummaryReason;
import com.mypurecloud.sdk.v2.model.ConversationSummaryResolution;
import com.mypurecloud.sdk.v2.model.ConversationSummaryWrapupCode;
import com.mypurecloud.sdk.v2.model.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationSessionSummary
 */

public class ConversationSessionSummary  implements Serializable {
  
  private String text = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the conversation summary.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    QUEUED("Queued"),
    STARTED("Started"),
    COMPLETED("Completed"),
    ERROR("Error"),
    PROCESSING("Processing");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

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
   * The media type of the conversation.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMAIL("Email"),
    CALL("Call"),
    CHAT("Chat"),
    MESSAGE("Message"),
    WEBMESSAGING("Webmessaging"),
    UNKNOWN("Unknown");

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
  private String language = null;
  private List<ConversationSummaryWrapupCode> predictedWrapupCodes = new ArrayList<ConversationSummaryWrapupCode>();
  private ConversationEditedSummary editedSummary = null;
  private ConversationSummaryReason reason = null;
  private ConversationSummaryFollowup followup = null;
  private ConversationSummaryResolution resolution = null;
  private Date dateCreated = null;
  private String id = null;
  private Float confidence = null;
  private List<AddressableEntityRef> participants = new ArrayList<AddressableEntityRef>();
  private Entity communication = null;

  
  /**
   * The text of the summary.
   **/
  public ConversationSessionSummary text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text of the summary.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * The status of the conversation summary.
   **/
  public ConversationSessionSummary status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the conversation summary.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The media type of the conversation.
   **/
  public ConversationSessionSummary mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type of the conversation.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * The language of the conversation.
   **/
  public ConversationSessionSummary language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language of the conversation.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * The wrapup codes of the conversation summary.
   **/
  public ConversationSessionSummary predictedWrapupCodes(List<ConversationSummaryWrapupCode> predictedWrapupCodes) {
    this.predictedWrapupCodes = predictedWrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The wrapup codes of the conversation summary.")
  @JsonProperty("predictedWrapupCodes")
  public List<ConversationSummaryWrapupCode> getPredictedWrapupCodes() {
    return predictedWrapupCodes;
  }
  public void setPredictedWrapupCodes(List<ConversationSummaryWrapupCode> predictedWrapupCodes) {
    this.predictedWrapupCodes = predictedWrapupCodes;
  }


  /**
   * The edited summary of the conversation.
   **/
  public ConversationSessionSummary editedSummary(ConversationEditedSummary editedSummary) {
    this.editedSummary = editedSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The edited summary of the conversation.")
  @JsonProperty("editedSummary")
  public ConversationEditedSummary getEditedSummary() {
    return editedSummary;
  }
  public void setEditedSummary(ConversationEditedSummary editedSummary) {
    this.editedSummary = editedSummary;
  }


  /**
   * The reason of the conversation summary.
   **/
  public ConversationSessionSummary reason(ConversationSummaryReason reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason of the conversation summary.")
  @JsonProperty("reason")
  public ConversationSummaryReason getReason() {
    return reason;
  }
  public void setReason(ConversationSummaryReason reason) {
    this.reason = reason;
  }


  /**
   * The followup of the conversation summary.
   **/
  public ConversationSessionSummary followup(ConversationSummaryFollowup followup) {
    this.followup = followup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The followup of the conversation summary.")
  @JsonProperty("followup")
  public ConversationSummaryFollowup getFollowup() {
    return followup;
  }
  public void setFollowup(ConversationSummaryFollowup followup) {
    this.followup = followup;
  }


  /**
   * The resolution of the conversation summary.
   **/
  public ConversationSessionSummary resolution(ConversationSummaryResolution resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The resolution of the conversation summary.")
  @JsonProperty("resolution")
  public ConversationSummaryResolution getResolution() {
    return resolution;
  }
  public void setResolution(ConversationSummaryResolution resolution) {
    this.resolution = resolution;
  }


  /**
   * The created date of the summary. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ConversationSessionSummary dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The created date of the summary. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The id of the summary.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The AI confidence value.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }


  /**
   * The list of participants.
   **/
  public ConversationSessionSummary participants(List<AddressableEntityRef> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of participants.")
  @JsonProperty("participants")
  public List<AddressableEntityRef> getParticipants() {
    return participants;
  }
  public void setParticipants(List<AddressableEntityRef> participants) {
    this.participants = participants;
  }


  @ApiModelProperty(example = "null", value = "The communication object of the summary.")
  @JsonProperty("communication")
  public Entity getCommunication() {
    return communication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSessionSummary conversationSessionSummary = (ConversationSessionSummary) o;

    return Objects.equals(this.text, conversationSessionSummary.text) &&
            Objects.equals(this.status, conversationSessionSummary.status) &&
            Objects.equals(this.mediaType, conversationSessionSummary.mediaType) &&
            Objects.equals(this.language, conversationSessionSummary.language) &&
            Objects.equals(this.predictedWrapupCodes, conversationSessionSummary.predictedWrapupCodes) &&
            Objects.equals(this.editedSummary, conversationSessionSummary.editedSummary) &&
            Objects.equals(this.reason, conversationSessionSummary.reason) &&
            Objects.equals(this.followup, conversationSessionSummary.followup) &&
            Objects.equals(this.resolution, conversationSessionSummary.resolution) &&
            Objects.equals(this.dateCreated, conversationSessionSummary.dateCreated) &&
            Objects.equals(this.id, conversationSessionSummary.id) &&
            Objects.equals(this.confidence, conversationSessionSummary.confidence) &&
            Objects.equals(this.participants, conversationSessionSummary.participants) &&
            Objects.equals(this.communication, conversationSessionSummary.communication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, status, mediaType, language, predictedWrapupCodes, editedSummary, reason, followup, resolution, dateCreated, id, confidence, participants, communication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSessionSummary {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    predictedWrapupCodes: ").append(toIndentedString(predictedWrapupCodes)).append("\n");
    sb.append("    editedSummary: ").append(toIndentedString(editedSummary)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    followup: ").append(toIndentedString(followup)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
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

