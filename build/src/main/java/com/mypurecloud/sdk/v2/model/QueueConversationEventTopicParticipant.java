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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicCall;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicCallback;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicChat;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicCobrowse;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicEmail;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicMessage;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicScreenshare;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicSocialExpression;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicVideo;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationEventTopicParticipant
 */

public class QueueConversationEventTopicParticipant  implements Serializable {
  
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
  private QueueConversationEventTopicWrapup wrapup = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private QueueConversationEventTopicConversationRoutingData conversationRoutingData = null;
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
  private List<QueueConversationEventTopicCall> calls = new ArrayList<QueueConversationEventTopicCall>();
  private List<QueueConversationEventTopicCallback> callbacks = new ArrayList<QueueConversationEventTopicCallback>();
  private List<QueueConversationEventTopicChat> chats = new ArrayList<QueueConversationEventTopicChat>();
  private List<QueueConversationEventTopicCobrowse> cobrowsesessions = new ArrayList<QueueConversationEventTopicCobrowse>();
  private List<QueueConversationEventTopicEmail> emails = new ArrayList<QueueConversationEventTopicEmail>();
  private List<QueueConversationEventTopicMessage> messages = new ArrayList<QueueConversationEventTopicMessage>();
  private List<QueueConversationEventTopicScreenshare> screenshares = new ArrayList<QueueConversationEventTopicScreenshare>();
  private List<QueueConversationEventTopicSocialExpression> socialExpressions = new ArrayList<QueueConversationEventTopicSocialExpression>();
  private List<QueueConversationEventTopicVideo> videos = new ArrayList<QueueConversationEventTopicVideo>();

  
  /**
   * A globally unique identifier for this conversation.
   **/
  public QueueConversationEventTopicParticipant id(String id) {
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
  public QueueConversationEventTopicParticipant connectedTime(Date connectedTime) {
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
  public QueueConversationEventTopicParticipant endTime(Date endTime) {
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
  public QueueConversationEventTopicParticipant userId(String userId) {
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
  public QueueConversationEventTopicParticipant externalContactId(String externalContactId) {
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
  public QueueConversationEventTopicParticipant externalOrganizationId(String externalOrganizationId) {
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
  public QueueConversationEventTopicParticipant name(String name) {
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
  public QueueConversationEventTopicParticipant queueId(String queueId) {
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
  public QueueConversationEventTopicParticipant groupId(String groupId) {
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
  public QueueConversationEventTopicParticipant teamId(String teamId) {
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
  public QueueConversationEventTopicParticipant purpose(String purpose) {
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
  public QueueConversationEventTopicParticipant consultParticipantId(String consultParticipantId) {
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
  public QueueConversationEventTopicParticipant address(String address) {
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
  public QueueConversationEventTopicParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public QueueConversationEventTopicParticipant wrapupExpected(Boolean wrapupExpected) {
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
  public QueueConversationEventTopicParticipant wrapupPrompt(String wrapupPrompt) {
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
  public QueueConversationEventTopicParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public QueueConversationEventTopicParticipant wrapup(QueueConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * The timestamp when this participant started after-call work.
   **/
  public QueueConversationEventTopicParticipant startAcwTime(Date startAcwTime) {
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
  public QueueConversationEventTopicParticipant endAcwTime(Date endAcwTime) {
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
  public QueueConversationEventTopicParticipant conversationRoutingData(QueueConversationEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public QueueConversationEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(QueueConversationEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   * Specifies how long the agent has to answer an interaction before being marked as not responding.
   **/
  public QueueConversationEventTopicParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
  public QueueConversationEventTopicParticipant monitoredParticipantId(String monitoredParticipantId) {
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
  public QueueConversationEventTopicParticipant coachedParticipantId(String coachedParticipantId) {
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
  public QueueConversationEventTopicParticipant bargedParticipantId(String bargedParticipantId) {
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
  public QueueConversationEventTopicParticipant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
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
  public QueueConversationEventTopicParticipant flaggedReason(String flaggedReason) {
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
  public QueueConversationEventTopicParticipant attributes(Map<String, String> attributes) {
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
  public QueueConversationEventTopicParticipant calls(List<QueueConversationEventTopicCall> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<QueueConversationEventTopicCall> getCalls() {
    return calls;
  }
  public void setCalls(List<QueueConversationEventTopicCall> calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant callbacks(List<QueueConversationEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbacks")
  public List<QueueConversationEventTopicCallback> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<QueueConversationEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant chats(List<QueueConversationEventTopicChat> chats) {
    this.chats = chats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chats")
  public List<QueueConversationEventTopicChat> getChats() {
    return chats;
  }
  public void setChats(List<QueueConversationEventTopicChat> chats) {
    this.chats = chats;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant cobrowsesessions(List<QueueConversationEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowsesessions")
  public List<QueueConversationEventTopicCobrowse> getCobrowsesessions() {
    return cobrowsesessions;
  }
  public void setCobrowsesessions(List<QueueConversationEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant emails(List<QueueConversationEventTopicEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emails")
  public List<QueueConversationEventTopicEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<QueueConversationEventTopicEmail> emails) {
    this.emails = emails;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant messages(List<QueueConversationEventTopicMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<QueueConversationEventTopicMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<QueueConversationEventTopicMessage> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant screenshares(List<QueueConversationEventTopicScreenshare> screenshares) {
    this.screenshares = screenshares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenshares")
  public List<QueueConversationEventTopicScreenshare> getScreenshares() {
    return screenshares;
  }
  public void setScreenshares(List<QueueConversationEventTopicScreenshare> screenshares) {
    this.screenshares = screenshares;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant socialExpressions(List<QueueConversationEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpressions")
  public List<QueueConversationEventTopicSocialExpression> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<QueueConversationEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant videos(List<QueueConversationEventTopicVideo> videos) {
    this.videos = videos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videos")
  public List<QueueConversationEventTopicVideo> getVideos() {
    return videos;
  }
  public void setVideos(List<QueueConversationEventTopicVideo> videos) {
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
    QueueConversationEventTopicParticipant queueConversationEventTopicParticipant = (QueueConversationEventTopicParticipant) o;
    return Objects.equals(this.id, queueConversationEventTopicParticipant.id) &&
        Objects.equals(this.connectedTime, queueConversationEventTopicParticipant.connectedTime) &&
        Objects.equals(this.endTime, queueConversationEventTopicParticipant.endTime) &&
        Objects.equals(this.userId, queueConversationEventTopicParticipant.userId) &&
        Objects.equals(this.externalContactId, queueConversationEventTopicParticipant.externalContactId) &&
        Objects.equals(this.externalOrganizationId, queueConversationEventTopicParticipant.externalOrganizationId) &&
        Objects.equals(this.name, queueConversationEventTopicParticipant.name) &&
        Objects.equals(this.queueId, queueConversationEventTopicParticipant.queueId) &&
        Objects.equals(this.groupId, queueConversationEventTopicParticipant.groupId) &&
        Objects.equals(this.teamId, queueConversationEventTopicParticipant.teamId) &&
        Objects.equals(this.purpose, queueConversationEventTopicParticipant.purpose) &&
        Objects.equals(this.consultParticipantId, queueConversationEventTopicParticipant.consultParticipantId) &&
        Objects.equals(this.address, queueConversationEventTopicParticipant.address) &&
        Objects.equals(this.wrapupRequired, queueConversationEventTopicParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupExpected, queueConversationEventTopicParticipant.wrapupExpected) &&
        Objects.equals(this.wrapupPrompt, queueConversationEventTopicParticipant.wrapupPrompt) &&
        Objects.equals(this.wrapupTimeoutMs, queueConversationEventTopicParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapup, queueConversationEventTopicParticipant.wrapup) &&
        Objects.equals(this.startAcwTime, queueConversationEventTopicParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, queueConversationEventTopicParticipant.endAcwTime) &&
        Objects.equals(this.conversationRoutingData, queueConversationEventTopicParticipant.conversationRoutingData) &&
        Objects.equals(this.alertingTimeoutMs, queueConversationEventTopicParticipant.alertingTimeoutMs) &&
        Objects.equals(this.monitoredParticipantId, queueConversationEventTopicParticipant.monitoredParticipantId) &&
        Objects.equals(this.coachedParticipantId, queueConversationEventTopicParticipant.coachedParticipantId) &&
        Objects.equals(this.bargedParticipantId, queueConversationEventTopicParticipant.bargedParticipantId) &&
        Objects.equals(this.screenRecordingState, queueConversationEventTopicParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, queueConversationEventTopicParticipant.flaggedReason) &&
        Objects.equals(this.attributes, queueConversationEventTopicParticipant.attributes) &&
        Objects.equals(this.calls, queueConversationEventTopicParticipant.calls) &&
        Objects.equals(this.callbacks, queueConversationEventTopicParticipant.callbacks) &&
        Objects.equals(this.chats, queueConversationEventTopicParticipant.chats) &&
        Objects.equals(this.cobrowsesessions, queueConversationEventTopicParticipant.cobrowsesessions) &&
        Objects.equals(this.emails, queueConversationEventTopicParticipant.emails) &&
        Objects.equals(this.messages, queueConversationEventTopicParticipant.messages) &&
        Objects.equals(this.screenshares, queueConversationEventTopicParticipant.screenshares) &&
        Objects.equals(this.socialExpressions, queueConversationEventTopicParticipant.socialExpressions) &&
        Objects.equals(this.videos, queueConversationEventTopicParticipant.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, externalOrganizationId, name, queueId, groupId, teamId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, startAcwTime, endAcwTime, conversationRoutingData, alertingTimeoutMs, monitoredParticipantId, coachedParticipantId, bargedParticipantId, screenRecordingState, flaggedReason, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, screenshares, socialExpressions, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicParticipant {\n");
    
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

