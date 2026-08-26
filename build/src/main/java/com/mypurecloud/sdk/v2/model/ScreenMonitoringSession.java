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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ScreenMonitoringSession
 */

public class ScreenMonitoringSession  implements Serializable {
  
  private AddressableEntityRef sourceUser = null;
  private AddressableEntityRef targetUser = null;
  private AddressableEntityRef conversation = null;
  private String participantId = null;

  private static class MonitoringTypeEnumDeserializer extends StdDeserializer<MonitoringTypeEnum> {
    public MonitoringTypeEnumDeserializer() {
      super(MonitoringTypeEnumDeserializer.class);
    }

    @Override
    public MonitoringTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MonitoringTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of screen monitoring session
   */
 @JsonDeserialize(using = MonitoringTypeEnumDeserializer.class)
  public enum MonitoringTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLEVEL("AgentLevel"),
    CONVERSATIONLEVEL("ConversationLevel");

    private String value;

    MonitoringTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MonitoringTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MonitoringTypeEnum value : MonitoringTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MonitoringTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MonitoringTypeEnum monitoringType = null;
  private Date dateCreated = null;
  private String selfUri = null;
  private String screenMonitoringId = null;

  public ScreenMonitoringSession() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScreenMonitoringSession(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The user who initiated the screen monitoring session
   **/
  public ScreenMonitoringSession sourceUser(AddressableEntityRef sourceUser) {
    this.sourceUser = sourceUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who initiated the screen monitoring session")
  @JsonProperty("sourceUser")
  public AddressableEntityRef getSourceUser() {
    return sourceUser;
  }
  public void setSourceUser(AddressableEntityRef sourceUser) {
    this.sourceUser = sourceUser;
  }


  /**
   * The user being monitored (for agent-level monitoring)
   **/
  public ScreenMonitoringSession targetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user being monitored (for agent-level monitoring)")
  @JsonProperty("targetUser")
  public AddressableEntityRef getTargetUser() {
    return targetUser;
  }
  public void setTargetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
  }


  /**
   * The conversation being monitored (for conversation-level monitoring)
   **/
  public ScreenMonitoringSession conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation being monitored (for conversation-level monitoring)")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }


  /**
   * The ID of the participant being monitored (for conversation-level monitoring)
   **/
  public ScreenMonitoringSession participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the participant being monitored (for conversation-level monitoring)")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }


  /**
   * The type of screen monitoring session
   **/
  public ScreenMonitoringSession monitoringType(MonitoringTypeEnum monitoringType) {
    this.monitoringType = monitoringType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of screen monitoring session")
  @JsonProperty("monitoringType")
  public MonitoringTypeEnum getMonitoringType() {
    return monitoringType;
  }
  public void setMonitoringType(MonitoringTypeEnum monitoringType) {
    this.monitoringType = monitoringType;
  }


  /**
   * The date and time when the screen monitoring session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ScreenMonitoringSession dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date and time when the screen monitoring session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * The unique identifier for this screen monitoring session
   **/
  public ScreenMonitoringSession screenMonitoringId(String screenMonitoringId) {
    this.screenMonitoringId = screenMonitoringId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for this screen monitoring session")
  @JsonProperty("screenMonitoringId")
  public String getScreenMonitoringId() {
    return screenMonitoringId;
  }
  public void setScreenMonitoringId(String screenMonitoringId) {
    this.screenMonitoringId = screenMonitoringId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenMonitoringSession screenMonitoringSession = (ScreenMonitoringSession) o;

    return Objects.equals(this.sourceUser, screenMonitoringSession.sourceUser) &&
            Objects.equals(this.targetUser, screenMonitoringSession.targetUser) &&
            Objects.equals(this.conversation, screenMonitoringSession.conversation) &&
            Objects.equals(this.participantId, screenMonitoringSession.participantId) &&
            Objects.equals(this.monitoringType, screenMonitoringSession.monitoringType) &&
            Objects.equals(this.dateCreated, screenMonitoringSession.dateCreated) &&
            Objects.equals(this.selfUri, screenMonitoringSession.selfUri) &&
            Objects.equals(this.screenMonitoringId, screenMonitoringSession.screenMonitoringId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceUser, targetUser, conversation, participantId, monitoringType, dateCreated, selfUri, screenMonitoringId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenMonitoringSession {\n");
    
    sb.append("    sourceUser: ").append(toIndentedString(sourceUser)).append("\n");
    sb.append("    targetUser: ").append(toIndentedString(targetUser)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    monitoringType: ").append(toIndentedString(monitoringType)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    screenMonitoringId: ").append(toIndentedString(screenMonitoringId)).append("\n");
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

