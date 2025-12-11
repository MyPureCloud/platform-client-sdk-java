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
import com.mypurecloud.sdk.v2.model.AgentChecklistInfo;
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ChecklistInferenceJobResponse
 */

public class ChecklistInferenceJobResponse  implements Serializable {
  
  private String id = null;

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
   * Status of the checklist inference job.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    ERROR("Error"),
    COMPLETE("Complete");

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
  private ErrorInfo error = null;
  private AgentChecklistInfo agentChecklistInfo = null;
  private Date jobStartTime = null;
  private Date jobEndTime = null;
  private String language = null;
  private String agentId = null;
  private String participantId = null;
  private String queueId = null;
  private String assistantId = null;

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
   * Media type.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("Voice"),
    MESSAGE("Message"),
    EMAIL("Email");

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

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Direction of the conversation.
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("Inbound"),
    OUTBOUND("Outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;
  private String selfUri = null;

  public ChecklistInferenceJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * ID of the inference job.
   **/
  public ChecklistInferenceJobResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the inference job.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Status of the checklist inference job.
   **/
  public ChecklistInferenceJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status of the checklist inference job.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Error information associated with a job in case of any errors.
   **/
  public ChecklistInferenceJobResponse error(ErrorInfo error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error information associated with a job in case of any errors.")
  @JsonProperty("error")
  public ErrorInfo getError() {
    return error;
  }
  public void setError(ErrorInfo error) {
    this.error = error;
  }


  /**
   * Agent checklist info.
   **/
  public ChecklistInferenceJobResponse agentChecklistInfo(AgentChecklistInfo agentChecklistInfo) {
    this.agentChecklistInfo = agentChecklistInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agent checklist info.")
  @JsonProperty("agentChecklistInfo")
  public AgentChecklistInfo getAgentChecklistInfo() {
    return agentChecklistInfo;
  }
  public void setAgentChecklistInfo(AgentChecklistInfo agentChecklistInfo) {
    this.agentChecklistInfo = agentChecklistInfo;
  }


  /**
   * Date when the inference job started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChecklistInferenceJobResponse jobStartTime(Date jobStartTime) {
    this.jobStartTime = jobStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the inference job started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("jobStartTime")
  public Date getJobStartTime() {
    return jobStartTime;
  }
  public void setJobStartTime(Date jobStartTime) {
    this.jobStartTime = jobStartTime;
  }


  /**
   * Date when the inference job finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChecklistInferenceJobResponse jobEndTime(Date jobEndTime) {
    this.jobEndTime = jobEndTime;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the inference job finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("jobEndTime")
  public Date getJobEndTime() {
    return jobEndTime;
  }
  public void setJobEndTime(Date jobEndTime) {
    this.jobEndTime = jobEndTime;
  }


  /**
   * Language associated with the checklist.
   **/
  public ChecklistInferenceJobResponse language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language associated with the checklist.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Agent ID.
   **/
  public ChecklistInferenceJobResponse agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agent ID.")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * Participant ID.
   **/
  public ChecklistInferenceJobResponse participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Participant ID.")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }


  /**
   * Queue ID.
   **/
  public ChecklistInferenceJobResponse queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queue ID.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * Assistant ID.
   **/
  public ChecklistInferenceJobResponse assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assistant ID.")
  @JsonProperty("assistantId")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  /**
   * Media type.
   **/
  public ChecklistInferenceJobResponse mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media type.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Direction of the conversation.
   **/
  public ChecklistInferenceJobResponse direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direction of the conversation.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecklistInferenceJobResponse checklistInferenceJobResponse = (ChecklistInferenceJobResponse) o;

    return Objects.equals(this.id, checklistInferenceJobResponse.id) &&
            Objects.equals(this.status, checklistInferenceJobResponse.status) &&
            Objects.equals(this.error, checklistInferenceJobResponse.error) &&
            Objects.equals(this.agentChecklistInfo, checklistInferenceJobResponse.agentChecklistInfo) &&
            Objects.equals(this.jobStartTime, checklistInferenceJobResponse.jobStartTime) &&
            Objects.equals(this.jobEndTime, checklistInferenceJobResponse.jobEndTime) &&
            Objects.equals(this.language, checklistInferenceJobResponse.language) &&
            Objects.equals(this.agentId, checklistInferenceJobResponse.agentId) &&
            Objects.equals(this.participantId, checklistInferenceJobResponse.participantId) &&
            Objects.equals(this.queueId, checklistInferenceJobResponse.queueId) &&
            Objects.equals(this.assistantId, checklistInferenceJobResponse.assistantId) &&
            Objects.equals(this.mediaType, checklistInferenceJobResponse.mediaType) &&
            Objects.equals(this.direction, checklistInferenceJobResponse.direction) &&
            Objects.equals(this.selfUri, checklistInferenceJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, error, agentChecklistInfo, jobStartTime, jobEndTime, language, agentId, participantId, queueId, assistantId, mediaType, direction, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecklistInferenceJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    agentChecklistInfo: ").append(toIndentedString(agentChecklistInfo)).append("\n");
    sb.append("    jobStartTime: ").append(toIndentedString(jobStartTime)).append("\n");
    sb.append("    jobEndTime: ").append(toIndentedString(jobEndTime)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

