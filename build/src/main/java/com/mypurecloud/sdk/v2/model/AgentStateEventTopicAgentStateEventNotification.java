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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentStateEventTopicAgentStateEventNotification
 */

public class AgentStateEventTopicAgentStateEventNotification  implements Serializable {
  
  private String conversationId = null;
  private String sessionId = null;
  private Long sessionStart = null;
  private Long currentStateStart = null;

  private static class CurrentStateEnumDeserializer extends StdDeserializer<CurrentStateEnum> {
    public CurrentStateEnumDeserializer() {
      super(CurrentStateEnumDeserializer.class);
    }

    @Override
    public CurrentStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CurrentStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets currentState
   */
 @JsonDeserialize(using = CurrentStateEnumDeserializer.class)
  public enum CurrentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    ALERT("ALERT"),
    INTERACT("INTERACT"),
    WRAPUP("WRAPUP"),
    BARGING("BARGING"),
    CALLBACK("CALLBACK"),
    COACHING("COACHING"),
    CONTACTING("CONTACTING"),
    CONVERTING("CONVERTING"),
    DELAY("DELAY"),
    DIALING("DIALING"),
    HOLD("HOLD"),
    IVR("IVR"),
    MONITORING("MONITORING"),
    PARKED("PARKED"),
    SCHEDULED("SCHEDULED"),
    SHARING("SHARING"),
    SYSTEM("SYSTEM"),
    TRANSMITTING("TRANSMITTING"),
    UPLOADING("UPLOADING"),
    VOICEMAIL("VOICEMAIL"),
    TERMINATED("TERMINATED");

    private String value;

    CurrentStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CurrentStateEnum fromString(String key) {
      if (key == null) return null;

      for (CurrentStateEnum value : CurrentStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CurrentStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CurrentStateEnum currentState = null;
  private String userId = null;

  private static class OriginatingDirectionEnumDeserializer extends StdDeserializer<OriginatingDirectionEnum> {
    public OriginatingDirectionEnumDeserializer() {
      super(OriginatingDirectionEnumDeserializer.class);
    }

    @Override
    public OriginatingDirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginatingDirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets originatingDirection
   */
 @JsonDeserialize(using = OriginatingDirectionEnumDeserializer.class)
  public enum OriginatingDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    INBOUND("INBOUND"),
    OUTBOUND("OUTBOUND");

    private String value;

    OriginatingDirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginatingDirectionEnum fromString(String key) {
      if (key == null) return null;

      for (OriginatingDirectionEnum value : OriginatingDirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginatingDirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OriginatingDirectionEnum originatingDirection = null;

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
    VOICE("VOICE"),
    CHAT("CHAT"),
    EMAIL("EMAIL"),
    CALLBACK("CALLBACK"),
    COBROWSE("COBROWSE"),
    VIDEO("VIDEO"),
    SCREENSHARE("SCREENSHARE"),
    MESSAGE("MESSAGE"),
    INTERNALMESSAGE("INTERNALMESSAGE"),
    SCREENMONITORING("SCREENMONITORING");

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
  private String queueId = null;
  private String requestedLanguageId = null;
  private List<String> requestedSkillIds = null;

  public AgentStateEventTopicAgentStateEventNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requestedSkillIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification conversationId(String conversationId) {
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
  public AgentStateEventTopicAgentStateEventNotification sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification sessionStart(Long sessionStart) {
    this.sessionStart = sessionStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionStart")
  public Long getSessionStart() {
    return sessionStart;
  }
  public void setSessionStart(Long sessionStart) {
    this.sessionStart = sessionStart;
  }


  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification currentStateStart(Long currentStateStart) {
    this.currentStateStart = currentStateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentStateStart")
  public Long getCurrentStateStart() {
    return currentStateStart;
  }
  public void setCurrentStateStart(Long currentStateStart) {
    this.currentStateStart = currentStateStart;
  }


  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification currentState(CurrentStateEnum currentState) {
    this.currentState = currentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentState")
  public CurrentStateEnum getCurrentState() {
    return currentState;
  }
  public void setCurrentState(CurrentStateEnum currentState) {
    this.currentState = currentState;
  }


  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification originatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originatingDirection")
  public OriginatingDirectionEnum getOriginatingDirection() {
    return originatingDirection;
  }
  public void setOriginatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
  }


  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification mediaType(MediaTypeEnum mediaType) {
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
  public AgentStateEventTopicAgentStateEventNotification queueId(String queueId) {
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
  public AgentStateEventTopicAgentStateEventNotification requestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedLanguageId")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }


  /**
   **/
  public AgentStateEventTopicAgentStateEventNotification requestedSkillIds(List<String> requestedSkillIds) {
    this.requestedSkillIds = requestedSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedSkillIds")
  public List<String> getRequestedSkillIds() {
    return requestedSkillIds;
  }
  public void setRequestedSkillIds(List<String> requestedSkillIds) {
    this.requestedSkillIds = requestedSkillIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateEventTopicAgentStateEventNotification agentStateEventTopicAgentStateEventNotification = (AgentStateEventTopicAgentStateEventNotification) o;

    return Objects.equals(this.conversationId, agentStateEventTopicAgentStateEventNotification.conversationId) &&
            Objects.equals(this.sessionId, agentStateEventTopicAgentStateEventNotification.sessionId) &&
            Objects.equals(this.sessionStart, agentStateEventTopicAgentStateEventNotification.sessionStart) &&
            Objects.equals(this.currentStateStart, agentStateEventTopicAgentStateEventNotification.currentStateStart) &&
            Objects.equals(this.currentState, agentStateEventTopicAgentStateEventNotification.currentState) &&
            Objects.equals(this.userId, agentStateEventTopicAgentStateEventNotification.userId) &&
            Objects.equals(this.originatingDirection, agentStateEventTopicAgentStateEventNotification.originatingDirection) &&
            Objects.equals(this.mediaType, agentStateEventTopicAgentStateEventNotification.mediaType) &&
            Objects.equals(this.queueId, agentStateEventTopicAgentStateEventNotification.queueId) &&
            Objects.equals(this.requestedLanguageId, agentStateEventTopicAgentStateEventNotification.requestedLanguageId) &&
            Objects.equals(this.requestedSkillIds, agentStateEventTopicAgentStateEventNotification.requestedSkillIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, sessionId, sessionStart, currentStateStart, currentState, userId, originatingDirection, mediaType, queueId, requestedLanguageId, requestedSkillIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateEventTopicAgentStateEventNotification {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionStart: ").append(toIndentedString(sessionStart)).append("\n");
    sb.append("    currentStateStart: ").append(toIndentedString(currentStateStart)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    originatingDirection: ").append(toIndentedString(originatingDirection)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    requestedSkillIds: ").append(toIndentedString(requestedSkillIds)).append("\n");
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

