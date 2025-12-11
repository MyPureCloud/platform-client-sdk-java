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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ChecklistActivationPayload
 */

public class ChecklistActivationPayload  implements Serializable {
  

  private static class ActivationTriggerTypeEnumDeserializer extends StdDeserializer<ActivationTriggerTypeEnum> {
    public ActivationTriggerTypeEnumDeserializer() {
      super(ActivationTriggerTypeEnumDeserializer.class);
    }

    @Override
    public ActivationTriggerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivationTriggerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Trigger type that activated this checklist.
   */
 @JsonDeserialize(using = ActivationTriggerTypeEnumDeserializer.class)
  public enum ActivationTriggerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTENT("Intent"),
    CONVERSATIONSTART("ConversationStart");

    private String value;

    ActivationTriggerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivationTriggerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActivationTriggerTypeEnum value : ActivationTriggerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivationTriggerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivationTriggerTypeEnum activationTriggerType = null;
  private String intentId = null;
  private String intentName = null;
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

  public ChecklistActivationPayload() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Trigger type that activated this checklist.
   **/
  public ChecklistActivationPayload activationTriggerType(ActivationTriggerTypeEnum activationTriggerType) {
    this.activationTriggerType = activationTriggerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Trigger type that activated this checklist.")
  @JsonProperty("activationTriggerType")
  public ActivationTriggerTypeEnum getActivationTriggerType() {
    return activationTriggerType;
  }
  public void setActivationTriggerType(ActivationTriggerTypeEnum activationTriggerType) {
    this.activationTriggerType = activationTriggerType;
  }


  /**
   * The intent ID if checklist was triggered by an intent.
   **/
  public ChecklistActivationPayload intentId(String intentId) {
    this.intentId = intentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent ID if checklist was triggered by an intent.")
  @JsonProperty("intentId")
  public String getIntentId() {
    return intentId;
  }
  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }


  /**
   * The intent name if checklist was triggered by an intent.
   **/
  public ChecklistActivationPayload intentName(String intentName) {
    this.intentName = intentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent name if checklist was triggered by an intent.")
  @JsonProperty("intentName")
  public String getIntentName() {
    return intentName;
  }
  public void setIntentName(String intentName) {
    this.intentName = intentName;
  }


  /**
   * Language associated with the checklist.
   **/
  public ChecklistActivationPayload language(String language) {
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
  public ChecklistActivationPayload agentId(String agentId) {
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
  public ChecklistActivationPayload participantId(String participantId) {
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
  public ChecklistActivationPayload queueId(String queueId) {
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
  public ChecklistActivationPayload assistantId(String assistantId) {
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
  public ChecklistActivationPayload mediaType(MediaTypeEnum mediaType) {
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
  public ChecklistActivationPayload direction(DirectionEnum direction) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecklistActivationPayload checklistActivationPayload = (ChecklistActivationPayload) o;

    return Objects.equals(this.activationTriggerType, checklistActivationPayload.activationTriggerType) &&
            Objects.equals(this.intentId, checklistActivationPayload.intentId) &&
            Objects.equals(this.intentName, checklistActivationPayload.intentName) &&
            Objects.equals(this.language, checklistActivationPayload.language) &&
            Objects.equals(this.agentId, checklistActivationPayload.agentId) &&
            Objects.equals(this.participantId, checklistActivationPayload.participantId) &&
            Objects.equals(this.queueId, checklistActivationPayload.queueId) &&
            Objects.equals(this.assistantId, checklistActivationPayload.assistantId) &&
            Objects.equals(this.mediaType, checklistActivationPayload.mediaType) &&
            Objects.equals(this.direction, checklistActivationPayload.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationTriggerType, intentId, intentName, language, agentId, participantId, queueId, assistantId, mediaType, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecklistActivationPayload {\n");
    
    sb.append("    activationTriggerType: ").append(toIndentedString(activationTriggerType)).append("\n");
    sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
    sb.append("    intentName: ").append(toIndentedString(intentName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

