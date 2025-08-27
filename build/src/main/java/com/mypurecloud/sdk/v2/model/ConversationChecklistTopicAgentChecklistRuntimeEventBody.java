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
import com.mypurecloud.sdk.v2.model.ConversationChecklistTopicAgentChecklistActivationTrigger;
import com.mypurecloud.sdk.v2.model.ConversationChecklistTopicAgentChecklistItemState;
import com.mypurecloud.sdk.v2.model.ConversationChecklistTopicConversationContextTurnInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationChecklistTopicAgentChecklistRuntimeEventBody
 */

public class ConversationChecklistTopicAgentChecklistRuntimeEventBody  implements Serializable {
  
  private Date evaluationStartDate = null;
  private Date evaluationLastModifiedDate = null;
  private Date evaluationFinalizedDate = null;
  private Date evaluationFinalizedWithAcwDate = null;
  private String conversationId = null;
  private String communicationId = null;
  private String agentChecklistId = null;
  private String name = null;
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
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
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
   * Gets or Sets direction
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
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
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
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
  private List<ConversationChecklistTopicAgentChecklistActivationTrigger> activationTriggers = null;
  private List<ConversationChecklistTopicConversationContextTurnInfo> conversationContext = null;
  private List<ConversationChecklistTopicAgentChecklistItemState> agentChecklistItems = null;

  public ConversationChecklistTopicAgentChecklistRuntimeEventBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activationTriggers = new ArrayList<ConversationChecklistTopicAgentChecklistActivationTrigger>();
      conversationContext = new ArrayList<ConversationChecklistTopicConversationContextTurnInfo>();
      agentChecklistItems = new ArrayList<ConversationChecklistTopicAgentChecklistItemState>();
    }
  }

  
  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody evaluationStartDate(Date evaluationStartDate) {
    this.evaluationStartDate = evaluationStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationStartDate")
  public Date getEvaluationStartDate() {
    return evaluationStartDate;
  }
  public void setEvaluationStartDate(Date evaluationStartDate) {
    this.evaluationStartDate = evaluationStartDate;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody evaluationLastModifiedDate(Date evaluationLastModifiedDate) {
    this.evaluationLastModifiedDate = evaluationLastModifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationLastModifiedDate")
  public Date getEvaluationLastModifiedDate() {
    return evaluationLastModifiedDate;
  }
  public void setEvaluationLastModifiedDate(Date evaluationLastModifiedDate) {
    this.evaluationLastModifiedDate = evaluationLastModifiedDate;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody evaluationFinalizedDate(Date evaluationFinalizedDate) {
    this.evaluationFinalizedDate = evaluationFinalizedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationFinalizedDate")
  public Date getEvaluationFinalizedDate() {
    return evaluationFinalizedDate;
  }
  public void setEvaluationFinalizedDate(Date evaluationFinalizedDate) {
    this.evaluationFinalizedDate = evaluationFinalizedDate;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody evaluationFinalizedWithAcwDate(Date evaluationFinalizedWithAcwDate) {
    this.evaluationFinalizedWithAcwDate = evaluationFinalizedWithAcwDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationFinalizedWithAcwDate")
  public Date getEvaluationFinalizedWithAcwDate() {
    return evaluationFinalizedWithAcwDate;
  }
  public void setEvaluationFinalizedWithAcwDate(Date evaluationFinalizedWithAcwDate) {
    this.evaluationFinalizedWithAcwDate = evaluationFinalizedWithAcwDate;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody conversationId(String conversationId) {
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
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody agentChecklistId(String agentChecklistId) {
    this.agentChecklistId = agentChecklistId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentChecklistId")
  public String getAgentChecklistId() {
    return agentChecklistId;
  }
  public void setAgentChecklistId(String agentChecklistId) {
    this.agentChecklistId = agentChecklistId;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody language(String language) {
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
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody queueId(String queueId) {
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
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assistantId")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody mediaType(MediaTypeEnum mediaType) {
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
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody exitReason(String exitReason) {
    this.exitReason = exitReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exitReason")
  public String getExitReason() {
    return exitReason;
  }
  public void setExitReason(String exitReason) {
    this.exitReason = exitReason;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody activationTriggers(List<ConversationChecklistTopicAgentChecklistActivationTrigger> activationTriggers) {
    this.activationTriggers = activationTriggers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activationTriggers")
  public List<ConversationChecklistTopicAgentChecklistActivationTrigger> getActivationTriggers() {
    return activationTriggers;
  }
  public void setActivationTriggers(List<ConversationChecklistTopicAgentChecklistActivationTrigger> activationTriggers) {
    this.activationTriggers = activationTriggers;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody conversationContext(List<ConversationChecklistTopicConversationContextTurnInfo> conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationContext")
  public List<ConversationChecklistTopicConversationContextTurnInfo> getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(List<ConversationChecklistTopicConversationContextTurnInfo> conversationContext) {
    this.conversationContext = conversationContext;
  }


  /**
   **/
  public ConversationChecklistTopicAgentChecklistRuntimeEventBody agentChecklistItems(List<ConversationChecklistTopicAgentChecklistItemState> agentChecklistItems) {
    this.agentChecklistItems = agentChecklistItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentChecklistItems")
  public List<ConversationChecklistTopicAgentChecklistItemState> getAgentChecklistItems() {
    return agentChecklistItems;
  }
  public void setAgentChecklistItems(List<ConversationChecklistTopicAgentChecklistItemState> agentChecklistItems) {
    this.agentChecklistItems = agentChecklistItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationChecklistTopicAgentChecklistRuntimeEventBody conversationChecklistTopicAgentChecklistRuntimeEventBody = (ConversationChecklistTopicAgentChecklistRuntimeEventBody) o;

    return Objects.equals(this.evaluationStartDate, conversationChecklistTopicAgentChecklistRuntimeEventBody.evaluationStartDate) &&
            Objects.equals(this.evaluationLastModifiedDate, conversationChecklistTopicAgentChecklistRuntimeEventBody.evaluationLastModifiedDate) &&
            Objects.equals(this.evaluationFinalizedDate, conversationChecklistTopicAgentChecklistRuntimeEventBody.evaluationFinalizedDate) &&
            Objects.equals(this.evaluationFinalizedWithAcwDate, conversationChecklistTopicAgentChecklistRuntimeEventBody.evaluationFinalizedWithAcwDate) &&
            Objects.equals(this.conversationId, conversationChecklistTopicAgentChecklistRuntimeEventBody.conversationId) &&
            Objects.equals(this.communicationId, conversationChecklistTopicAgentChecklistRuntimeEventBody.communicationId) &&
            Objects.equals(this.agentChecklistId, conversationChecklistTopicAgentChecklistRuntimeEventBody.agentChecklistId) &&
            Objects.equals(this.name, conversationChecklistTopicAgentChecklistRuntimeEventBody.name) &&
            Objects.equals(this.language, conversationChecklistTopicAgentChecklistRuntimeEventBody.language) &&
            Objects.equals(this.agentId, conversationChecklistTopicAgentChecklistRuntimeEventBody.agentId) &&
            Objects.equals(this.participantId, conversationChecklistTopicAgentChecklistRuntimeEventBody.participantId) &&
            Objects.equals(this.queueId, conversationChecklistTopicAgentChecklistRuntimeEventBody.queueId) &&
            Objects.equals(this.assistantId, conversationChecklistTopicAgentChecklistRuntimeEventBody.assistantId) &&
            Objects.equals(this.mediaType, conversationChecklistTopicAgentChecklistRuntimeEventBody.mediaType) &&
            Objects.equals(this.direction, conversationChecklistTopicAgentChecklistRuntimeEventBody.direction) &&
            Objects.equals(this.status, conversationChecklistTopicAgentChecklistRuntimeEventBody.status) &&
            Objects.equals(this.exitReason, conversationChecklistTopicAgentChecklistRuntimeEventBody.exitReason) &&
            Objects.equals(this.activationTriggers, conversationChecklistTopicAgentChecklistRuntimeEventBody.activationTriggers) &&
            Objects.equals(this.conversationContext, conversationChecklistTopicAgentChecklistRuntimeEventBody.conversationContext) &&
            Objects.equals(this.agentChecklistItems, conversationChecklistTopicAgentChecklistRuntimeEventBody.agentChecklistItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationStartDate, evaluationLastModifiedDate, evaluationFinalizedDate, evaluationFinalizedWithAcwDate, conversationId, communicationId, agentChecklistId, name, language, agentId, participantId, queueId, assistantId, mediaType, direction, status, exitReason, activationTriggers, conversationContext, agentChecklistItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationChecklistTopicAgentChecklistRuntimeEventBody {\n");
    
    sb.append("    evaluationStartDate: ").append(toIndentedString(evaluationStartDate)).append("\n");
    sb.append("    evaluationLastModifiedDate: ").append(toIndentedString(evaluationLastModifiedDate)).append("\n");
    sb.append("    evaluationFinalizedDate: ").append(toIndentedString(evaluationFinalizedDate)).append("\n");
    sb.append("    evaluationFinalizedWithAcwDate: ").append(toIndentedString(evaluationFinalizedWithAcwDate)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    agentChecklistId: ").append(toIndentedString(agentChecklistId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    exitReason: ").append(toIndentedString(exitReason)).append("\n");
    sb.append("    activationTriggers: ").append(toIndentedString(activationTriggers)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
    sb.append("    agentChecklistItems: ").append(toIndentedString(agentChecklistItems)).append("\n");
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

