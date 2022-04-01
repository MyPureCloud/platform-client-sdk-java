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
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicCall;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicCallback;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicChat;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicCobrowse;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicEmail;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicMessage;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicScreenshare;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicSocialExpression;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicVideo;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicParticipant
 */

public class QueueConversationSocialExpressionEventTopicParticipant  implements Serializable {
  
  private String id = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private String userId = null;
  private String externalContactId = null;
  private String externalOrganizationId = null;
  private String name = null;
  private String queueId = null;
  private String groupId = null;
  private String teamId = null;
  private String purpose = null;
  private String consultParticipantId = null;
  private String address = null;
  private Boolean wrapupRequired = null;
  private Boolean wrapupExpected = null;
  private String wrapupPrompt = null;
  private Integer wrapupTimeoutMs = null;
  private QueueConversationSocialExpressionEventTopicWrapup wrapup = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private QueueConversationSocialExpressionEventTopicConversationRoutingData conversationRoutingData = null;
  private Integer alertingTimeoutMs = null;
  private String monitoredParticipantId = null;
  private String coachedParticipantId = null;
  private String bargedParticipantId = null;

  private static class ScreenRecordingStateEnumDeserializer extends StdDeserializer<ScreenRecordingStateEnum> {
    public ScreenRecordingStateEnumDeserializer() {
      super(ScreenRecordingStateEnumDeserializer.class);
    }

    @Override
    public ScreenRecordingStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScreenRecordingStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current screen recording state for this participant.
   */
 @JsonDeserialize(using = ScreenRecordingStateEnumDeserializer.class)
  public enum ScreenRecordingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REQUESTED("requested"),
    ACTIVE("active"),
    PAUSED("paused"),
    STOPPED("stopped"),
    ERROR("error"),
    TIMEOUT("timeout");

    private String value;

    ScreenRecordingStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScreenRecordingStateEnum fromString(String key) {
      if (key == null) return null;

      for (ScreenRecordingStateEnum value : ScreenRecordingStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScreenRecordingStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScreenRecordingStateEnum screenRecordingState = null;
  private String flaggedReason = null;
  private Map<String, String> attributes = null;
  private List<QueueConversationSocialExpressionEventTopicCall> calls = new ArrayList<QueueConversationSocialExpressionEventTopicCall>();
  private List<QueueConversationSocialExpressionEventTopicCallback> callbacks = new ArrayList<QueueConversationSocialExpressionEventTopicCallback>();
  private List<QueueConversationSocialExpressionEventTopicChat> chats = new ArrayList<QueueConversationSocialExpressionEventTopicChat>();
  private List<QueueConversationSocialExpressionEventTopicCobrowse> cobrowsesessions = new ArrayList<QueueConversationSocialExpressionEventTopicCobrowse>();
  private List<QueueConversationSocialExpressionEventTopicEmail> emails = new ArrayList<QueueConversationSocialExpressionEventTopicEmail>();
  private List<QueueConversationSocialExpressionEventTopicMessage> messages = new ArrayList<QueueConversationSocialExpressionEventTopicMessage>();
  private List<QueueConversationSocialExpressionEventTopicScreenshare> screenshares = new ArrayList<QueueConversationSocialExpressionEventTopicScreenshare>();
  private List<QueueConversationSocialExpressionEventTopicSocialExpression> socialExpressions = new ArrayList<QueueConversationSocialExpressionEventTopicSocialExpression>();
  private List<QueueConversationSocialExpressionEventTopicVideo> videos = new ArrayList<QueueConversationSocialExpressionEventTopicVideo>();

  
  /**
   * A globally unique identifier for this conversation.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for this conversation.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The timestamp when this participant was connected to the conversation in the provider clock.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant was connected to the conversation in the provider clock.")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   * The timestamp when this participant disconnected from the conversation in the provider clock.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant disconnected from the conversation in the provider clock.")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * If this participant represents a user, then this will be the globally unique identifier for the user.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents a user, then this will be the globally unique identifier for the user.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * If this participant represents an external contact, then this will be the globally unique identifier for the external contact.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external contact, then this will be the globally unique identifier for the external contact.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }

  
  /**
   * If this participant represents an external org, then this will be the globally unique identifier for the external org.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant externalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external org, then this will be the globally unique identifier for the external org.")
  @JsonProperty("externalOrganizationId")
  public String getExternalOrganizationId() {
    return externalOrganizationId;
  }
  public void setExternalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
  }

  
  /**
   * A human readable name identifying the participant.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human readable name identifying the participant.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * If present, the queue id that the communication channel came in on.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If present, the queue id that the communication channel came in on.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * If present, the group id that the participant represents.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If present, the group id that the participant represents.")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * The team id that this participant is a member of when added to the conversation.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team id that this participant is a member of when added to the conversation.")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  
  /**
   * A well known string that specifies the purpose or type of this participant.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A well known string that specifies the purpose or type of this participant.")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   * If this participant is part of a consult transfer, then this will be the participant id of the participant being transferred.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant consultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant is part of a consult transfer, then this will be the participant id of the participant being transferred.")
  @JsonProperty("consultParticipantId")
  public String getConsultParticipantId() {
    return consultParticipantId;
  }
  public void setConsultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
  }

  
  /**
   * The address for the this participant. For a phone call this will be the ANI.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address for the this participant. For a phone call this will be the ANI.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * True iff this participant is required to enter wrapup for this conversation.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant wrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True iff this participant is required to enter wrapup for this conversation.")
  @JsonProperty("wrapupRequired")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  
  /**
   * True when a participant is expected to enter a wrapup code once the call connects.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant wrapupExpected(Boolean wrapupExpected) {
    this.wrapupExpected = wrapupExpected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True when a participant is expected to enter a wrapup code once the call connects.")
  @JsonProperty("wrapupExpected")
  public Boolean getWrapupExpected() {
    return wrapupExpected;
  }
  public void setWrapupExpected(Boolean wrapupExpected) {
    this.wrapupExpected = wrapupExpected;
  }

  
  /**
   * This field controls how the UI prompts the agent for a wrapup.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant wrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field controls how the UI prompts the agent for a wrapup.")
  @JsonProperty("wrapupPrompt")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  
  /**
   * Specifies how long a timed ACW session will last.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long a timed ACW session will last.")
  @JsonProperty("wrapupTimeoutMs")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant wrapup(QueueConversationSocialExpressionEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationSocialExpressionEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationSocialExpressionEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * The timestamp when this participant started after-call work.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant startAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant started after-call work.")
  @JsonProperty("startAcwTime")
  public Date getStartAcwTime() {
    return startAcwTime;
  }
  public void setStartAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
  }

  
  /**
   * The timestamp when this participant ended after-call work.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant endAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant ended after-call work.")
  @JsonProperty("endAcwTime")
  public Date getEndAcwTime() {
    return endAcwTime;
  }
  public void setEndAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant conversationRoutingData(QueueConversationSocialExpressionEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public QueueConversationSocialExpressionEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(QueueConversationSocialExpressionEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   * Specifies how long the agent has to answer an interaction before being marked as not responding.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long the agent has to answer an interaction before being marked as not responding.")
  @JsonProperty("alertingTimeoutMs")
  public Integer getAlertingTimeoutMs() {
    return alertingTimeoutMs;
  }
  public void setAlertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
  }

  
  /**
   * If this participant is a monitor, then this will be the id of the participant that is being monitored.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant monitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant is a monitor, then this will be the id of the participant that is being monitored.")
  @JsonProperty("monitoredParticipantId")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }

  
  /**
   * If this participant is a coach, then this will be the id of the participant that is being coached.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant coachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant is a coach, then this will be the id of the participant that is being coached.")
  @JsonProperty("coachedParticipantId")
  public String getCoachedParticipantId() {
    return coachedParticipantId;
  }
  public void setCoachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
  }

  
  /**
   * If this participant created a barge in conference, then this will be the id of the participant that is barged in.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant bargedParticipantId(String bargedParticipantId) {
    this.bargedParticipantId = bargedParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant created a barge in conference, then this will be the id of the participant that is barged in.")
  @JsonProperty("bargedParticipantId")
  public String getBargedParticipantId() {
    return bargedParticipantId;
  }
  public void setBargedParticipantId(String bargedParticipantId) {
    this.bargedParticipantId = bargedParticipantId;
  }

  
  /**
   * The current screen recording state for this participant.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current screen recording state for this participant.")
  @JsonProperty("screenRecordingState")
  public ScreenRecordingStateEnum getScreenRecordingState() {
    return screenRecordingState;
  }
  public void setScreenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
  }

  
  /**
   * If this participant has flagged the conversation, the reason code given.
   **/
  public QueueConversationSocialExpressionEventTopicParticipant flaggedReason(String flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant has flagged the conversation, the reason code given.")
  @JsonProperty("flaggedReason")
  public String getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(String flaggedReason) {
    this.flaggedReason = flaggedReason;
  }

  
  /**
   * Additional participant attributes
   **/
  public QueueConversationSocialExpressionEventTopicParticipant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional participant attributes")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant calls(List<QueueConversationSocialExpressionEventTopicCall> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<QueueConversationSocialExpressionEventTopicCall> getCalls() {
    return calls;
  }
  public void setCalls(List<QueueConversationSocialExpressionEventTopicCall> calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant callbacks(List<QueueConversationSocialExpressionEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbacks")
  public List<QueueConversationSocialExpressionEventTopicCallback> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<QueueConversationSocialExpressionEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant chats(List<QueueConversationSocialExpressionEventTopicChat> chats) {
    this.chats = chats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chats")
  public List<QueueConversationSocialExpressionEventTopicChat> getChats() {
    return chats;
  }
  public void setChats(List<QueueConversationSocialExpressionEventTopicChat> chats) {
    this.chats = chats;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant cobrowsesessions(List<QueueConversationSocialExpressionEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowsesessions")
  public List<QueueConversationSocialExpressionEventTopicCobrowse> getCobrowsesessions() {
    return cobrowsesessions;
  }
  public void setCobrowsesessions(List<QueueConversationSocialExpressionEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant emails(List<QueueConversationSocialExpressionEventTopicEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emails")
  public List<QueueConversationSocialExpressionEventTopicEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<QueueConversationSocialExpressionEventTopicEmail> emails) {
    this.emails = emails;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant messages(List<QueueConversationSocialExpressionEventTopicMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<QueueConversationSocialExpressionEventTopicMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<QueueConversationSocialExpressionEventTopicMessage> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant screenshares(List<QueueConversationSocialExpressionEventTopicScreenshare> screenshares) {
    this.screenshares = screenshares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenshares")
  public List<QueueConversationSocialExpressionEventTopicScreenshare> getScreenshares() {
    return screenshares;
  }
  public void setScreenshares(List<QueueConversationSocialExpressionEventTopicScreenshare> screenshares) {
    this.screenshares = screenshares;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant socialExpressions(List<QueueConversationSocialExpressionEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpressions")
  public List<QueueConversationSocialExpressionEventTopicSocialExpression> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<QueueConversationSocialExpressionEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicParticipant videos(List<QueueConversationSocialExpressionEventTopicVideo> videos) {
    this.videos = videos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videos")
  public List<QueueConversationSocialExpressionEventTopicVideo> getVideos() {
    return videos;
  }
  public void setVideos(List<QueueConversationSocialExpressionEventTopicVideo> videos) {
    this.videos = videos;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicParticipant queueConversationSocialExpressionEventTopicParticipant = (QueueConversationSocialExpressionEventTopicParticipant) o;
    return Objects.equals(this.id, queueConversationSocialExpressionEventTopicParticipant.id) &&
        Objects.equals(this.connectedTime, queueConversationSocialExpressionEventTopicParticipant.connectedTime) &&
        Objects.equals(this.endTime, queueConversationSocialExpressionEventTopicParticipant.endTime) &&
        Objects.equals(this.userId, queueConversationSocialExpressionEventTopicParticipant.userId) &&
        Objects.equals(this.externalContactId, queueConversationSocialExpressionEventTopicParticipant.externalContactId) &&
        Objects.equals(this.externalOrganizationId, queueConversationSocialExpressionEventTopicParticipant.externalOrganizationId) &&
        Objects.equals(this.name, queueConversationSocialExpressionEventTopicParticipant.name) &&
        Objects.equals(this.queueId, queueConversationSocialExpressionEventTopicParticipant.queueId) &&
        Objects.equals(this.groupId, queueConversationSocialExpressionEventTopicParticipant.groupId) &&
        Objects.equals(this.teamId, queueConversationSocialExpressionEventTopicParticipant.teamId) &&
        Objects.equals(this.purpose, queueConversationSocialExpressionEventTopicParticipant.purpose) &&
        Objects.equals(this.consultParticipantId, queueConversationSocialExpressionEventTopicParticipant.consultParticipantId) &&
        Objects.equals(this.address, queueConversationSocialExpressionEventTopicParticipant.address) &&
        Objects.equals(this.wrapupRequired, queueConversationSocialExpressionEventTopicParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupExpected, queueConversationSocialExpressionEventTopicParticipant.wrapupExpected) &&
        Objects.equals(this.wrapupPrompt, queueConversationSocialExpressionEventTopicParticipant.wrapupPrompt) &&
        Objects.equals(this.wrapupTimeoutMs, queueConversationSocialExpressionEventTopicParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapup, queueConversationSocialExpressionEventTopicParticipant.wrapup) &&
        Objects.equals(this.startAcwTime, queueConversationSocialExpressionEventTopicParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, queueConversationSocialExpressionEventTopicParticipant.endAcwTime) &&
        Objects.equals(this.conversationRoutingData, queueConversationSocialExpressionEventTopicParticipant.conversationRoutingData) &&
        Objects.equals(this.alertingTimeoutMs, queueConversationSocialExpressionEventTopicParticipant.alertingTimeoutMs) &&
        Objects.equals(this.monitoredParticipantId, queueConversationSocialExpressionEventTopicParticipant.monitoredParticipantId) &&
        Objects.equals(this.coachedParticipantId, queueConversationSocialExpressionEventTopicParticipant.coachedParticipantId) &&
        Objects.equals(this.bargedParticipantId, queueConversationSocialExpressionEventTopicParticipant.bargedParticipantId) &&
        Objects.equals(this.screenRecordingState, queueConversationSocialExpressionEventTopicParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, queueConversationSocialExpressionEventTopicParticipant.flaggedReason) &&
        Objects.equals(this.attributes, queueConversationSocialExpressionEventTopicParticipant.attributes) &&
        Objects.equals(this.calls, queueConversationSocialExpressionEventTopicParticipant.calls) &&
        Objects.equals(this.callbacks, queueConversationSocialExpressionEventTopicParticipant.callbacks) &&
        Objects.equals(this.chats, queueConversationSocialExpressionEventTopicParticipant.chats) &&
        Objects.equals(this.cobrowsesessions, queueConversationSocialExpressionEventTopicParticipant.cobrowsesessions) &&
        Objects.equals(this.emails, queueConversationSocialExpressionEventTopicParticipant.emails) &&
        Objects.equals(this.messages, queueConversationSocialExpressionEventTopicParticipant.messages) &&
        Objects.equals(this.screenshares, queueConversationSocialExpressionEventTopicParticipant.screenshares) &&
        Objects.equals(this.socialExpressions, queueConversationSocialExpressionEventTopicParticipant.socialExpressions) &&
        Objects.equals(this.videos, queueConversationSocialExpressionEventTopicParticipant.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, externalOrganizationId, name, queueId, groupId, teamId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, startAcwTime, endAcwTime, conversationRoutingData, alertingTimeoutMs, monitoredParticipantId, coachedParticipantId, bargedParticipantId, screenRecordingState, flaggedReason, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, screenshares, socialExpressions, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalOrganizationId: ").append(toIndentedString(externalOrganizationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    consultParticipantId: ").append(toIndentedString(consultParticipantId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupExpected: ").append(toIndentedString(wrapupExpected)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    startAcwTime: ").append(toIndentedString(startAcwTime)).append("\n");
    sb.append("    endAcwTime: ").append(toIndentedString(endAcwTime)).append("\n");
    sb.append("    conversationRoutingData: ").append(toIndentedString(conversationRoutingData)).append("\n");
    sb.append("    alertingTimeoutMs: ").append(toIndentedString(alertingTimeoutMs)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    coachedParticipantId: ").append(toIndentedString(coachedParticipantId)).append("\n");
    sb.append("    bargedParticipantId: ").append(toIndentedString(bargedParticipantId)).append("\n");
    sb.append("    screenRecordingState: ").append(toIndentedString(screenRecordingState)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
    sb.append("    chats: ").append(toIndentedString(chats)).append("\n");
    sb.append("    cobrowsesessions: ").append(toIndentedString(cobrowsesessions)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    screenshares: ").append(toIndentedString(screenshares)).append("\n");
    sb.append("    socialExpressions: ").append(toIndentedString(socialExpressions)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

