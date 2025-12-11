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
import com.mypurecloud.sdk.v2.model.ActivationTrigger;
import com.mypurecloud.sdk.v2.model.ChecklistItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentChecklistResponse
 */

public class AgentChecklistResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ChecklistItem> checklistItems = null;
  private List<ActivationTrigger> activationTriggers = null;

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
   * The evaluation status of the checklist.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EVALUATIONSTARTED("EvaluationStarted"),
    EVALUATIONINPROGRESS("EvaluationInProgress"),
    EVALUATIONFINALIZED("EvaluationFinalized"),
    EVALUATIONFINALIZEDWITHACW("EvaluationFinalizedWithAcw");

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
  private String exitReason = null;
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
  private Date evaluationStartDate = null;
  private Date evaluationLastModifiedDate = null;
  private Date evaluationFinalizedDate = null;
  private Date evaluationFinalizedWithAcwDate = null;
  private String selfUri = null;

  public AgentChecklistResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      checklistItems = new ArrayList<ChecklistItem>();
      activationTriggers = new ArrayList<ActivationTrigger>();
    }
  }

  
  /**
   * ID of the checklist.
   **/
  public AgentChecklistResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the checklist.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of the checklist.
   **/
  public AgentChecklistResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the checklist.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * List of individual Checklist Items.
   **/
  public AgentChecklistResponse checklistItems(List<ChecklistItem> checklistItems) {
    this.checklistItems = checklistItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of individual Checklist Items.")
  @JsonProperty("checklistItems")
  public List<ChecklistItem> getChecklistItems() {
    return checklistItems;
  }
  public void setChecklistItems(List<ChecklistItem> checklistItems) {
    this.checklistItems = checklistItems;
  }


  /**
   * List of triggers that activated this checklist.
   **/
  public AgentChecklistResponse activationTriggers(List<ActivationTrigger> activationTriggers) {
    this.activationTriggers = activationTriggers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of triggers that activated this checklist.")
  @JsonProperty("activationTriggers")
  public List<ActivationTrigger> getActivationTriggers() {
    return activationTriggers;
  }
  public void setActivationTriggers(List<ActivationTrigger> activationTriggers) {
    this.activationTriggers = activationTriggers;
  }


  /**
   * The evaluation status of the checklist.
   **/
  public AgentChecklistResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The evaluation status of the checklist.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Exit reason provided at the time of finalizing the checklist.
   **/
  public AgentChecklistResponse exitReason(String exitReason) {
    this.exitReason = exitReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exit reason provided at the time of finalizing the checklist.")
  @JsonProperty("exitReason")
  public String getExitReason() {
    return exitReason;
  }
  public void setExitReason(String exitReason) {
    this.exitReason = exitReason;
  }


  /**
   * Language associated with the checklist.
   **/
  public AgentChecklistResponse language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Language associated with the checklist.")
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
  public AgentChecklistResponse agentId(String agentId) {
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
  public AgentChecklistResponse participantId(String participantId) {
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
  public AgentChecklistResponse queueId(String queueId) {
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
  public AgentChecklistResponse assistantId(String assistantId) {
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
  public AgentChecklistResponse mediaType(MediaTypeEnum mediaType) {
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
  public AgentChecklistResponse direction(DirectionEnum direction) {
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


  /**
   * Date when the checklist evaluation began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentChecklistResponse evaluationStartDate(Date evaluationStartDate) {
    this.evaluationStartDate = evaluationStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the checklist evaluation began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("evaluationStartDate")
  public Date getEvaluationStartDate() {
    return evaluationStartDate;
  }
  public void setEvaluationStartDate(Date evaluationStartDate) {
    this.evaluationStartDate = evaluationStartDate;
  }


  /**
   * Date when the checklist was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentChecklistResponse evaluationLastModifiedDate(Date evaluationLastModifiedDate) {
    this.evaluationLastModifiedDate = evaluationLastModifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the checklist was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("evaluationLastModifiedDate")
  public Date getEvaluationLastModifiedDate() {
    return evaluationLastModifiedDate;
  }
  public void setEvaluationLastModifiedDate(Date evaluationLastModifiedDate) {
    this.evaluationLastModifiedDate = evaluationLastModifiedDate;
  }


  /**
   * Date when the checklist was finalized. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentChecklistResponse evaluationFinalizedDate(Date evaluationFinalizedDate) {
    this.evaluationFinalizedDate = evaluationFinalizedDate;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the checklist was finalized. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("evaluationFinalizedDate")
  public Date getEvaluationFinalizedDate() {
    return evaluationFinalizedDate;
  }
  public void setEvaluationFinalizedDate(Date evaluationFinalizedDate) {
    this.evaluationFinalizedDate = evaluationFinalizedDate;
  }


  /**
   * Date when the checklist was finalized with ACW. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentChecklistResponse evaluationFinalizedWithAcwDate(Date evaluationFinalizedWithAcwDate) {
    this.evaluationFinalizedWithAcwDate = evaluationFinalizedWithAcwDate;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the checklist was finalized with ACW. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("evaluationFinalizedWithAcwDate")
  public Date getEvaluationFinalizedWithAcwDate() {
    return evaluationFinalizedWithAcwDate;
  }
  public void setEvaluationFinalizedWithAcwDate(Date evaluationFinalizedWithAcwDate) {
    this.evaluationFinalizedWithAcwDate = evaluationFinalizedWithAcwDate;
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
    AgentChecklistResponse agentChecklistResponse = (AgentChecklistResponse) o;

    return Objects.equals(this.id, agentChecklistResponse.id) &&
            Objects.equals(this.name, agentChecklistResponse.name) &&
            Objects.equals(this.checklistItems, agentChecklistResponse.checklistItems) &&
            Objects.equals(this.activationTriggers, agentChecklistResponse.activationTriggers) &&
            Objects.equals(this.status, agentChecklistResponse.status) &&
            Objects.equals(this.exitReason, agentChecklistResponse.exitReason) &&
            Objects.equals(this.language, agentChecklistResponse.language) &&
            Objects.equals(this.agentId, agentChecklistResponse.agentId) &&
            Objects.equals(this.participantId, agentChecklistResponse.participantId) &&
            Objects.equals(this.queueId, agentChecklistResponse.queueId) &&
            Objects.equals(this.assistantId, agentChecklistResponse.assistantId) &&
            Objects.equals(this.mediaType, agentChecklistResponse.mediaType) &&
            Objects.equals(this.direction, agentChecklistResponse.direction) &&
            Objects.equals(this.evaluationStartDate, agentChecklistResponse.evaluationStartDate) &&
            Objects.equals(this.evaluationLastModifiedDate, agentChecklistResponse.evaluationLastModifiedDate) &&
            Objects.equals(this.evaluationFinalizedDate, agentChecklistResponse.evaluationFinalizedDate) &&
            Objects.equals(this.evaluationFinalizedWithAcwDate, agentChecklistResponse.evaluationFinalizedWithAcwDate) &&
            Objects.equals(this.selfUri, agentChecklistResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, checklistItems, activationTriggers, status, exitReason, language, agentId, participantId, queueId, assistantId, mediaType, direction, evaluationStartDate, evaluationLastModifiedDate, evaluationFinalizedDate, evaluationFinalizedWithAcwDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChecklistResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checklistItems: ").append(toIndentedString(checklistItems)).append("\n");
    sb.append("    activationTriggers: ").append(toIndentedString(activationTriggers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    exitReason: ").append(toIndentedString(exitReason)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    evaluationStartDate: ").append(toIndentedString(evaluationStartDate)).append("\n");
    sb.append("    evaluationLastModifiedDate: ").append(toIndentedString(evaluationLastModifiedDate)).append("\n");
    sb.append("    evaluationFinalizedDate: ").append(toIndentedString(evaluationFinalizedDate)).append("\n");
    sb.append("    evaluationFinalizedWithAcwDate: ").append(toIndentedString(evaluationFinalizedWithAcwDate)).append("\n");
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

