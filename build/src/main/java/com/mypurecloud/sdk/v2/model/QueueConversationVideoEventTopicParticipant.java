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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicCall;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicCallback;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicChat;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicCobrowse;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicEmail;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicMessage;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicScreenshare;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicSocialExpression;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicVideo;
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
  private QueueConversationVideoEventTopicWrapup wrapup = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private QueueConversationVideoEventTopicConversationRoutingData conversationRoutingData = null;
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
  private List<QueueConversationVideoEventTopicCall> calls = new ArrayList<QueueConversationVideoEventTopicCall>();
  private List<QueueConversationVideoEventTopicCallback> callbacks = new ArrayList<QueueConversationVideoEventTopicCallback>();
  private List<QueueConversationVideoEventTopicChat> chats = new ArrayList<QueueConversationVideoEventTopicChat>();
  private List<QueueConversationVideoEventTopicCobrowse> cobrowsesessions = new ArrayList<QueueConversationVideoEventTopicCobrowse>();
  private List<QueueConversationVideoEventTopicEmail> emails = new ArrayList<QueueConversationVideoEventTopicEmail>();
  private List<QueueConversationVideoEventTopicMessage> messages = new ArrayList<QueueConversationVideoEventTopicMessage>();
  private List<QueueConversationVideoEventTopicScreenshare> screenshares = new ArrayList<QueueConversationVideoEventTopicScreenshare>();
  private List<QueueConversationVideoEventTopicSocialExpression> socialExpressions = new ArrayList<QueueConversationVideoEventTopicSocialExpression>();
  private List<QueueConversationVideoEventTopicVideo> videos = new ArrayList<QueueConversationVideoEventTopicVideo>();
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationVideoEventTopicParticipant id(String id) {
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
  public QueueConversationVideoEventTopicParticipant connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicParticipant endTime(Date endTime) {
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
  public QueueConversationVideoEventTopicParticipant userId(String userId) {
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
  public QueueConversationVideoEventTopicParticipant externalContactId(String externalContactId) {
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
  public QueueConversationVideoEventTopicParticipant externalOrganizationId(String externalOrganizationId) {
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
  public QueueConversationVideoEventTopicParticipant name(String name) {
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
  public QueueConversationVideoEventTopicParticipant queueId(String queueId) {
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
  public QueueConversationVideoEventTopicParticipant groupId(String groupId) {
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
  public QueueConversationVideoEventTopicParticipant teamId(String teamId) {
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
  public QueueConversationVideoEventTopicParticipant purpose(String purpose) {
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
  public QueueConversationVideoEventTopicParticipant consultParticipantId(String consultParticipantId) {
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
  public QueueConversationVideoEventTopicParticipant address(String address) {
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
  public QueueConversationVideoEventTopicParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public QueueConversationVideoEventTopicParticipant wrapupExpected(Boolean wrapupExpected) {
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
  public QueueConversationVideoEventTopicParticipant wrapupPrompt(String wrapupPrompt) {
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
  public QueueConversationVideoEventTopicParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
   **/
  public QueueConversationVideoEventTopicParticipant startAcwTime(Date startAcwTime) {
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
  public QueueConversationVideoEventTopicParticipant endAcwTime(Date endAcwTime) {
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
   **/
  public QueueConversationVideoEventTopicParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
  public QueueConversationVideoEventTopicParticipant monitoredParticipantId(String monitoredParticipantId) {
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
  public QueueConversationVideoEventTopicParticipant coachedParticipantId(String coachedParticipantId) {
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
  public QueueConversationVideoEventTopicParticipant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
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
  public QueueConversationVideoEventTopicParticipant flaggedReason(String flaggedReason) {
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
  public QueueConversationVideoEventTopicParticipant attributes(Map<String, String> attributes) {
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
  public QueueConversationVideoEventTopicParticipant screenshares(List<QueueConversationVideoEventTopicScreenshare> screenshares) {
    this.screenshares = screenshares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenshares")
  public List<QueueConversationVideoEventTopicScreenshare> getScreenshares() {
    return screenshares;
  }
  public void setScreenshares(List<QueueConversationVideoEventTopicScreenshare> screenshares) {
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
  public QueueConversationVideoEventTopicParticipant additionalProperties(Object additionalProperties) {
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
    QueueConversationVideoEventTopicParticipant queueConversationVideoEventTopicParticipant = (QueueConversationVideoEventTopicParticipant) o;
    return Objects.equals(this.id, queueConversationVideoEventTopicParticipant.id) &&
        Objects.equals(this.connectedTime, queueConversationVideoEventTopicParticipant.connectedTime) &&
        Objects.equals(this.endTime, queueConversationVideoEventTopicParticipant.endTime) &&
        Objects.equals(this.userId, queueConversationVideoEventTopicParticipant.userId) &&
        Objects.equals(this.externalContactId, queueConversationVideoEventTopicParticipant.externalContactId) &&
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
        Objects.equals(this.screenRecordingState, queueConversationVideoEventTopicParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, queueConversationVideoEventTopicParticipant.flaggedReason) &&
        Objects.equals(this.attributes, queueConversationVideoEventTopicParticipant.attributes) &&
        Objects.equals(this.calls, queueConversationVideoEventTopicParticipant.calls) &&
        Objects.equals(this.callbacks, queueConversationVideoEventTopicParticipant.callbacks) &&
        Objects.equals(this.chats, queueConversationVideoEventTopicParticipant.chats) &&
        Objects.equals(this.cobrowsesessions, queueConversationVideoEventTopicParticipant.cobrowsesessions) &&
        Objects.equals(this.emails, queueConversationVideoEventTopicParticipant.emails) &&
        Objects.equals(this.messages, queueConversationVideoEventTopicParticipant.messages) &&
        Objects.equals(this.screenshares, queueConversationVideoEventTopicParticipant.screenshares) &&
        Objects.equals(this.socialExpressions, queueConversationVideoEventTopicParticipant.socialExpressions) &&
        Objects.equals(this.videos, queueConversationVideoEventTopicParticipant.videos) &&
        Objects.equals(this.additionalProperties, queueConversationVideoEventTopicParticipant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, externalOrganizationId, name, queueId, groupId, teamId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, startAcwTime, endAcwTime, conversationRoutingData, alertingTimeoutMs, monitoredParticipantId, coachedParticipantId, screenRecordingState, flaggedReason, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, screenshares, socialExpressions, videos, additionalProperties);
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

