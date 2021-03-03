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
   * Gets or Sets screenRecordingState
   */
 @JsonDeserialize(using = ScreenRecordingStateEnumDeserializer.class)
  public enum ScreenRecordingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REQUESTED("REQUESTED"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    STOPPED("STOPPED"),
    ERROR("ERROR"),
    TIMEOUT("TIMEOUT");

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
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationEventTopicParticipant id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant userId(String userId) {
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
  public QueueConversationEventTopicParticipant externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant externalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganizationId")
  public String getExternalOrganizationId() {
    return externalOrganizationId;
  }
  public void setExternalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant name(String name) {
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
  public QueueConversationEventTopicParticipant queueId(String queueId) {
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
  public QueueConversationEventTopicParticipant groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant consultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("consultParticipantId")
  public String getConsultParticipantId() {
    return consultParticipantId;
  }
  public void setConsultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant wrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupRequired")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant wrapupExpected(Boolean wrapupExpected) {
    this.wrapupExpected = wrapupExpected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupExpected")
  public Boolean getWrapupExpected() {
    return wrapupExpected;
  }
  public void setWrapupExpected(Boolean wrapupExpected) {
    this.wrapupExpected = wrapupExpected;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant wrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupPrompt")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
   **/
  public QueueConversationEventTopicParticipant startAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startAcwTime")
  public Date getStartAcwTime() {
    return startAcwTime;
  }
  public void setStartAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant endAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
   **/
  public QueueConversationEventTopicParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertingTimeoutMs")
  public Integer getAlertingTimeoutMs() {
    return alertingTimeoutMs;
  }
  public void setAlertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant monitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("monitoredParticipantId")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant coachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("coachedParticipantId")
  public String getCoachedParticipantId() {
    return coachedParticipantId;
  }
  public void setCoachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenRecordingState")
  public ScreenRecordingStateEnum getScreenRecordingState() {
    return screenRecordingState;
  }
  public void setScreenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant flaggedReason(String flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flaggedReason")
  public String getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(String flaggedReason) {
    this.flaggedReason = flaggedReason;
  }

  
  /**
   **/
  public QueueConversationEventTopicParticipant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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

  
  /**
   **/
  public QueueConversationEventTopicParticipant additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
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
        Objects.equals(this.videos, queueConversationEventTopicParticipant.videos) &&
        Objects.equals(this.additionalProperties, queueConversationEventTopicParticipant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, externalOrganizationId, name, queueId, groupId, teamId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, startAcwTime, endAcwTime, conversationRoutingData, alertingTimeoutMs, monitoredParticipantId, coachedParticipantId, screenRecordingState, flaggedReason, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, screenshares, socialExpressions, videos, additionalProperties);
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

