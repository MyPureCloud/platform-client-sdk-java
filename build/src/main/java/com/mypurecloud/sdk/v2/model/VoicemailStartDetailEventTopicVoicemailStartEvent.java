package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VoicemailStartDetailEventTopicVoicemailStartEvent
 */

public class VoicemailStartDetailEventTopicVoicemailStartEvent  implements Serializable {
  
  private Integer eventTime = null;
  private String conversationId = null;
  private String participantId = null;
  private String sessionId = null;

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
    MESSAGE("MESSAGE");

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
  private String provider = null;

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
    UNKNOWN("UNKNOWN"),
    INBOUND("INBOUND"),
    OUTBOUND("OUTBOUND");

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
  private String ani = null;
  private String dnis = null;
  private String userId = null;
  private String queueId = null;
  private String divisionId = null;

  
  /**
   **/
  public VoicemailStartDetailEventTopicVoicemailStartEvent eventTime(Integer eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Integer getEventTime() {
    return eventTime;
  }
  public void setEventTime(Integer eventTime) {
    this.eventTime = eventTime;
  }

  
  /**
   **/
  public VoicemailStartDetailEventTopicVoicemailStartEvent conversationId(String conversationId) {
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
  public VoicemailStartDetailEventTopicVoicemailStartEvent participantId(String participantId) {
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
  public VoicemailStartDetailEventTopicVoicemailStartEvent sessionId(String sessionId) {
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
  public VoicemailStartDetailEventTopicVoicemailStartEvent mediaType(MediaTypeEnum mediaType) {
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
  public VoicemailStartDetailEventTopicVoicemailStartEvent provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   **/
  public VoicemailStartDetailEventTopicVoicemailStartEvent direction(DirectionEnum direction) {
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
  public VoicemailStartDetailEventTopicVoicemailStartEvent ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  
  /**
   **/
  public VoicemailStartDetailEventTopicVoicemailStartEvent dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  
  /**
   **/
  public VoicemailStartDetailEventTopicVoicemailStartEvent userId(String userId) {
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
  public VoicemailStartDetailEventTopicVoicemailStartEvent queueId(String queueId) {
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
  public VoicemailStartDetailEventTopicVoicemailStartEvent divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailStartDetailEventTopicVoicemailStartEvent voicemailStartDetailEventTopicVoicemailStartEvent = (VoicemailStartDetailEventTopicVoicemailStartEvent) o;
    return Objects.equals(this.eventTime, voicemailStartDetailEventTopicVoicemailStartEvent.eventTime) &&
        Objects.equals(this.conversationId, voicemailStartDetailEventTopicVoicemailStartEvent.conversationId) &&
        Objects.equals(this.participantId, voicemailStartDetailEventTopicVoicemailStartEvent.participantId) &&
        Objects.equals(this.sessionId, voicemailStartDetailEventTopicVoicemailStartEvent.sessionId) &&
        Objects.equals(this.mediaType, voicemailStartDetailEventTopicVoicemailStartEvent.mediaType) &&
        Objects.equals(this.provider, voicemailStartDetailEventTopicVoicemailStartEvent.provider) &&
        Objects.equals(this.direction, voicemailStartDetailEventTopicVoicemailStartEvent.direction) &&
        Objects.equals(this.ani, voicemailStartDetailEventTopicVoicemailStartEvent.ani) &&
        Objects.equals(this.dnis, voicemailStartDetailEventTopicVoicemailStartEvent.dnis) &&
        Objects.equals(this.userId, voicemailStartDetailEventTopicVoicemailStartEvent.userId) &&
        Objects.equals(this.queueId, voicemailStartDetailEventTopicVoicemailStartEvent.queueId) &&
        Objects.equals(this.divisionId, voicemailStartDetailEventTopicVoicemailStartEvent.divisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, sessionId, mediaType, provider, direction, ani, dnis, userId, queueId, divisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailStartDetailEventTopicVoicemailStartEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
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

