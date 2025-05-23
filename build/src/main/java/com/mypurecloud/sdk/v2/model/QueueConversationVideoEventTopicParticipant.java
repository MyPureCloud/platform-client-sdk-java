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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicCall;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicCallback;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicChat;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicCobrowse;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicEmail;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicInternalMessage;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicMessage;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicScreenShare;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicSocialExpression;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicVideo;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicWorkflow;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicParticipant
 */

public class QueueConversationVideoEventTopicParticipant  implements Serializable {
  
  private String id = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private String userId = null;
  private String externalContactId = null;
  private String externalContactInitialDivisionId = null;
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
  private Long wrapupTimeoutMs = null;
  private QueueConversationVideoEventTopicWrapup wrapup = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private QueueConversationVideoEventTopicConversationRoutingData conversationRoutingData = null;
  private Long alertingTimeoutMs = null;
  private String monitoredParticipantId = null;
  private String coachedParticipantId = null;
  private String bargedParticipantId = null;
  private List<String> mediaRoles = null;

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
  private List<QueueConversationVideoEventTopicCall> calls = null;
  private List<QueueConversationVideoEventTopicCallback> callbacks = null;
  private List<QueueConversationVideoEventTopicChat> chats = null;
  private List<QueueConversationVideoEventTopicCobrowse> cobrowsesessions = null;
  private List<QueueConversationVideoEventTopicEmail> emails = null;
  private List<QueueConversationVideoEventTopicMessage> messages = null;
  private List<QueueConversationVideoEventTopicInternalMessage> internalMessages = null;
  private List<QueueConversationVideoEventTopicScreenShare> screenshares = null;
  private List<QueueConversationVideoEventTopicSocialExpression> socialExpressions = null;
  private List<QueueConversationVideoEventTopicVideo> videos = null;
  private QueueConversationVideoEventTopicWorkflow workflow = null;

  public QueueConversationVideoEventTopicParticipant() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mediaRoles = new ArrayList<String>();
      calls = new ArrayList<QueueConversationVideoEventTopicCall>();
      callbacks = new ArrayList<QueueConversationVideoEventTopicCallback>();
      chats = new ArrayList<QueueConversationVideoEventTopicChat>();
      cobrowsesessions = new ArrayList<QueueConversationVideoEventTopicCobrowse>();
      emails = new ArrayList<QueueConversationVideoEventTopicEmail>();
      messages = new ArrayList<QueueConversationVideoEventTopicMessage>();
      internalMessages = new ArrayList<QueueConversationVideoEventTopicInternalMessage>();
      screenshares = new ArrayList<QueueConversationVideoEventTopicScreenShare>();
      socialExpressions = new ArrayList<QueueConversationVideoEventTopicSocialExpression>();
      videos = new ArrayList<QueueConversationVideoEventTopicVideo>();
    }
  }

  
  /**
   * A globally unique identifier for this conversation.
   **/
  public QueueConversationVideoEventTopicParticipant id(String id) {
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
  public QueueConversationVideoEventTopicParticipant connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicParticipant endTime(Date endTime) {
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
  public QueueConversationVideoEventTopicParticipant userId(String userId) {
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
  public QueueConversationVideoEventTopicParticipant externalContactId(String externalContactId) {
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
   * If this participant represents an external contact, then this will be the initial division for the external contact. This value will not be updated if the external contact is reassigned.
   **/
  public QueueConversationVideoEventTopicParticipant externalContactInitialDivisionId(String externalContactInitialDivisionId) {
    this.externalContactInitialDivisionId = externalContactInitialDivisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external contact, then this will be the initial division for the external contact. This value will not be updated if the external contact is reassigned.")
  @JsonProperty("externalContactInitialDivisionId")
  public String getExternalContactInitialDivisionId() {
    return externalContactInitialDivisionId;
  }
  public void setExternalContactInitialDivisionId(String externalContactInitialDivisionId) {
    this.externalContactInitialDivisionId = externalContactInitialDivisionId;
  }


  /**
   * If this participant represents an external org, then this will be the globally unique identifier for the external org.
   **/
  public QueueConversationVideoEventTopicParticipant externalOrganizationId(String externalOrganizationId) {
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
  public QueueConversationVideoEventTopicParticipant name(String name) {
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
  public QueueConversationVideoEventTopicParticipant queueId(String queueId) {
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
  public QueueConversationVideoEventTopicParticipant groupId(String groupId) {
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
  public QueueConversationVideoEventTopicParticipant teamId(String teamId) {
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
  public QueueConversationVideoEventTopicParticipant purpose(String purpose) {
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
  public QueueConversationVideoEventTopicParticipant consultParticipantId(String consultParticipantId) {
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
  public QueueConversationVideoEventTopicParticipant address(String address) {
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
  public QueueConversationVideoEventTopicParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public QueueConversationVideoEventTopicParticipant wrapupExpected(Boolean wrapupExpected) {
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
  public QueueConversationVideoEventTopicParticipant wrapupPrompt(String wrapupPrompt) {
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
  public QueueConversationVideoEventTopicParticipant wrapupTimeoutMs(Long wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long a timed ACW session will last.")
  @JsonProperty("wrapupTimeoutMs")
  public Long getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Long wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant wrapup(QueueConversationVideoEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationVideoEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationVideoEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }


  /**
   * The timestamp when this participant started after-call work.
   **/
  public QueueConversationVideoEventTopicParticipant startAcwTime(Date startAcwTime) {
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
  public QueueConversationVideoEventTopicParticipant endAcwTime(Date endAcwTime) {
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
  public QueueConversationVideoEventTopicParticipant conversationRoutingData(QueueConversationVideoEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public QueueConversationVideoEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(QueueConversationVideoEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }


  /**
   * Specifies how long the agent has to answer an interaction before being marked as not responding.
   **/
  public QueueConversationVideoEventTopicParticipant alertingTimeoutMs(Long alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long the agent has to answer an interaction before being marked as not responding.")
  @JsonProperty("alertingTimeoutMs")
  public Long getAlertingTimeoutMs() {
    return alertingTimeoutMs;
  }
  public void setAlertingTimeoutMs(Long alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
  }


  /**
   * If this participant is a monitor, then this will be the id of the participant that is being monitored.
   **/
  public QueueConversationVideoEventTopicParticipant monitoredParticipantId(String monitoredParticipantId) {
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
  public QueueConversationVideoEventTopicParticipant coachedParticipantId(String coachedParticipantId) {
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
  public QueueConversationVideoEventTopicParticipant bargedParticipantId(String bargedParticipantId) {
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
   * List of roles this participant's media has had on the conversation, ie monitor, coach, etc.
   **/
  public QueueConversationVideoEventTopicParticipant mediaRoles(List<String> mediaRoles) {
    this.mediaRoles = mediaRoles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of roles this participant's media has had on the conversation, ie monitor, coach, etc.")
  @JsonProperty("mediaRoles")
  public List<String> getMediaRoles() {
    return mediaRoles;
  }
  public void setMediaRoles(List<String> mediaRoles) {
    this.mediaRoles = mediaRoles;
  }


  /**
   * The current screen recording state for this participant.
   **/
  public QueueConversationVideoEventTopicParticipant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
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
  public QueueConversationVideoEventTopicParticipant flaggedReason(String flaggedReason) {
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
  public QueueConversationVideoEventTopicParticipant attributes(Map<String, String> attributes) {
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
  public QueueConversationVideoEventTopicParticipant calls(List<QueueConversationVideoEventTopicCall> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<QueueConversationVideoEventTopicCall> getCalls() {
    return calls;
  }
  public void setCalls(List<QueueConversationVideoEventTopicCall> calls) {
    this.calls = calls;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant callbacks(List<QueueConversationVideoEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbacks")
  public List<QueueConversationVideoEventTopicCallback> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<QueueConversationVideoEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant chats(List<QueueConversationVideoEventTopicChat> chats) {
    this.chats = chats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chats")
  public List<QueueConversationVideoEventTopicChat> getChats() {
    return chats;
  }
  public void setChats(List<QueueConversationVideoEventTopicChat> chats) {
    this.chats = chats;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant cobrowsesessions(List<QueueConversationVideoEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowsesessions")
  public List<QueueConversationVideoEventTopicCobrowse> getCobrowsesessions() {
    return cobrowsesessions;
  }
  public void setCobrowsesessions(List<QueueConversationVideoEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant emails(List<QueueConversationVideoEventTopicEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emails")
  public List<QueueConversationVideoEventTopicEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<QueueConversationVideoEventTopicEmail> emails) {
    this.emails = emails;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant messages(List<QueueConversationVideoEventTopicMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<QueueConversationVideoEventTopicMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<QueueConversationVideoEventTopicMessage> messages) {
    this.messages = messages;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant internalMessages(List<QueueConversationVideoEventTopicInternalMessage> internalMessages) {
    this.internalMessages = internalMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("internalMessages")
  public List<QueueConversationVideoEventTopicInternalMessage> getInternalMessages() {
    return internalMessages;
  }
  public void setInternalMessages(List<QueueConversationVideoEventTopicInternalMessage> internalMessages) {
    this.internalMessages = internalMessages;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant screenshares(List<QueueConversationVideoEventTopicScreenShare> screenshares) {
    this.screenshares = screenshares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenshares")
  public List<QueueConversationVideoEventTopicScreenShare> getScreenshares() {
    return screenshares;
  }
  public void setScreenshares(List<QueueConversationVideoEventTopicScreenShare> screenshares) {
    this.screenshares = screenshares;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant socialExpressions(List<QueueConversationVideoEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpressions")
  public List<QueueConversationVideoEventTopicSocialExpression> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<QueueConversationVideoEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant videos(List<QueueConversationVideoEventTopicVideo> videos) {
    this.videos = videos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videos")
  public List<QueueConversationVideoEventTopicVideo> getVideos() {
    return videos;
  }
  public void setVideos(List<QueueConversationVideoEventTopicVideo> videos) {
    this.videos = videos;
  }


  /**
   **/
  public QueueConversationVideoEventTopicParticipant workflow(QueueConversationVideoEventTopicWorkflow workflow) {
    this.workflow = workflow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workflow")
  public QueueConversationVideoEventTopicWorkflow getWorkflow() {
    return workflow;
  }
  public void setWorkflow(QueueConversationVideoEventTopicWorkflow workflow) {
    this.workflow = workflow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationVideoEventTopicParticipant queueConversationVideoEventTopicParticipant = (QueueConversationVideoEventTopicParticipant) o;

    return Objects.equals(this.id, queueConversationVideoEventTopicParticipant.id) &&
            Objects.equals(this.connectedTime, queueConversationVideoEventTopicParticipant.connectedTime) &&
            Objects.equals(this.endTime, queueConversationVideoEventTopicParticipant.endTime) &&
            Objects.equals(this.userId, queueConversationVideoEventTopicParticipant.userId) &&
            Objects.equals(this.externalContactId, queueConversationVideoEventTopicParticipant.externalContactId) &&
            Objects.equals(this.externalContactInitialDivisionId, queueConversationVideoEventTopicParticipant.externalContactInitialDivisionId) &&
            Objects.equals(this.externalOrganizationId, queueConversationVideoEventTopicParticipant.externalOrganizationId) &&
            Objects.equals(this.name, queueConversationVideoEventTopicParticipant.name) &&
            Objects.equals(this.queueId, queueConversationVideoEventTopicParticipant.queueId) &&
            Objects.equals(this.groupId, queueConversationVideoEventTopicParticipant.groupId) &&
            Objects.equals(this.teamId, queueConversationVideoEventTopicParticipant.teamId) &&
            Objects.equals(this.purpose, queueConversationVideoEventTopicParticipant.purpose) &&
            Objects.equals(this.consultParticipantId, queueConversationVideoEventTopicParticipant.consultParticipantId) &&
            Objects.equals(this.address, queueConversationVideoEventTopicParticipant.address) &&
            Objects.equals(this.wrapupRequired, queueConversationVideoEventTopicParticipant.wrapupRequired) &&
            Objects.equals(this.wrapupExpected, queueConversationVideoEventTopicParticipant.wrapupExpected) &&
            Objects.equals(this.wrapupPrompt, queueConversationVideoEventTopicParticipant.wrapupPrompt) &&
            Objects.equals(this.wrapupTimeoutMs, queueConversationVideoEventTopicParticipant.wrapupTimeoutMs) &&
            Objects.equals(this.wrapup, queueConversationVideoEventTopicParticipant.wrapup) &&
            Objects.equals(this.startAcwTime, queueConversationVideoEventTopicParticipant.startAcwTime) &&
            Objects.equals(this.endAcwTime, queueConversationVideoEventTopicParticipant.endAcwTime) &&
            Objects.equals(this.conversationRoutingData, queueConversationVideoEventTopicParticipant.conversationRoutingData) &&
            Objects.equals(this.alertingTimeoutMs, queueConversationVideoEventTopicParticipant.alertingTimeoutMs) &&
            Objects.equals(this.monitoredParticipantId, queueConversationVideoEventTopicParticipant.monitoredParticipantId) &&
            Objects.equals(this.coachedParticipantId, queueConversationVideoEventTopicParticipant.coachedParticipantId) &&
            Objects.equals(this.bargedParticipantId, queueConversationVideoEventTopicParticipant.bargedParticipantId) &&
            Objects.equals(this.mediaRoles, queueConversationVideoEventTopicParticipant.mediaRoles) &&
            Objects.equals(this.screenRecordingState, queueConversationVideoEventTopicParticipant.screenRecordingState) &&
            Objects.equals(this.flaggedReason, queueConversationVideoEventTopicParticipant.flaggedReason) &&
            Objects.equals(this.attributes, queueConversationVideoEventTopicParticipant.attributes) &&
            Objects.equals(this.calls, queueConversationVideoEventTopicParticipant.calls) &&
            Objects.equals(this.callbacks, queueConversationVideoEventTopicParticipant.callbacks) &&
            Objects.equals(this.chats, queueConversationVideoEventTopicParticipant.chats) &&
            Objects.equals(this.cobrowsesessions, queueConversationVideoEventTopicParticipant.cobrowsesessions) &&
            Objects.equals(this.emails, queueConversationVideoEventTopicParticipant.emails) &&
            Objects.equals(this.messages, queueConversationVideoEventTopicParticipant.messages) &&
            Objects.equals(this.internalMessages, queueConversationVideoEventTopicParticipant.internalMessages) &&
            Objects.equals(this.screenshares, queueConversationVideoEventTopicParticipant.screenshares) &&
            Objects.equals(this.socialExpressions, queueConversationVideoEventTopicParticipant.socialExpressions) &&
            Objects.equals(this.videos, queueConversationVideoEventTopicParticipant.videos) &&
            Objects.equals(this.workflow, queueConversationVideoEventTopicParticipant.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, externalContactInitialDivisionId, externalOrganizationId, name, queueId, groupId, teamId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, startAcwTime, endAcwTime, conversationRoutingData, alertingTimeoutMs, monitoredParticipantId, coachedParticipantId, bargedParticipantId, mediaRoles, screenRecordingState, flaggedReason, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, internalMessages, screenshares, socialExpressions, videos, workflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalContactInitialDivisionId: ").append(toIndentedString(externalContactInitialDivisionId)).append("\n");
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
    sb.append("    mediaRoles: ").append(toIndentedString(mediaRoles)).append("\n");
    sb.append("    screenRecordingState: ").append(toIndentedString(screenRecordingState)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
    sb.append("    chats: ").append(toIndentedString(chats)).append("\n");
    sb.append("    cobrowsesessions: ").append(toIndentedString(cobrowsesessions)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    internalMessages: ").append(toIndentedString(internalMessages)).append("\n");
    sb.append("    screenshares: ").append(toIndentedString(screenshares)).append("\n");
    sb.append("    socialExpressions: ").append(toIndentedString(socialExpressions)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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

