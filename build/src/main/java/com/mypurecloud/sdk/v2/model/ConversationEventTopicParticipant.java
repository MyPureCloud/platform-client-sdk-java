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
import com.mypurecloud.sdk.v2.model.ConversationEventTopicCall;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicCallback;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicChat;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicCobrowse;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicEmail;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicMessage;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicScreenshare;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicSocialExpression;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicVideo;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationEventTopicParticipant
 */

public class ConversationEventTopicParticipant  implements Serializable {
  
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
  private ConversationEventTopicWrapup wrapup = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private ConversationEventTopicConversationRoutingData conversationRoutingData = null;
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
  private List<ConversationEventTopicCall> calls = new ArrayList<ConversationEventTopicCall>();
  private List<ConversationEventTopicCallback> callbacks = new ArrayList<ConversationEventTopicCallback>();
  private List<ConversationEventTopicChat> chats = new ArrayList<ConversationEventTopicChat>();
  private List<ConversationEventTopicCobrowse> cobrowsesessions = new ArrayList<ConversationEventTopicCobrowse>();
  private List<ConversationEventTopicEmail> emails = new ArrayList<ConversationEventTopicEmail>();
  private List<ConversationEventTopicMessage> messages = new ArrayList<ConversationEventTopicMessage>();
  private List<ConversationEventTopicScreenshare> screenshares = new ArrayList<ConversationEventTopicScreenshare>();
  private List<ConversationEventTopicSocialExpression> socialExpressions = new ArrayList<ConversationEventTopicSocialExpression>();
  private List<ConversationEventTopicVideo> videos = new ArrayList<ConversationEventTopicVideo>();
  private Object additionalProperties = null;

  
  /**
   **/
  public ConversationEventTopicParticipant id(String id) {
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
  public ConversationEventTopicParticipant connectedTime(Date connectedTime) {
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
  public ConversationEventTopicParticipant endTime(Date endTime) {
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
  public ConversationEventTopicParticipant userId(String userId) {
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
  public ConversationEventTopicParticipant externalContactId(String externalContactId) {
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
  public ConversationEventTopicParticipant externalOrganizationId(String externalOrganizationId) {
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
  public ConversationEventTopicParticipant name(String name) {
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
  public ConversationEventTopicParticipant queueId(String queueId) {
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
  public ConversationEventTopicParticipant groupId(String groupId) {
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
  public ConversationEventTopicParticipant teamId(String teamId) {
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
  public ConversationEventTopicParticipant purpose(String purpose) {
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
  public ConversationEventTopicParticipant consultParticipantId(String consultParticipantId) {
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
  public ConversationEventTopicParticipant address(String address) {
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
  public ConversationEventTopicParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public ConversationEventTopicParticipant wrapupExpected(Boolean wrapupExpected) {
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
  public ConversationEventTopicParticipant wrapupPrompt(String wrapupPrompt) {
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
  public ConversationEventTopicParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public ConversationEventTopicParticipant wrapup(ConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public ConversationEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant startAcwTime(Date startAcwTime) {
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
  public ConversationEventTopicParticipant endAcwTime(Date endAcwTime) {
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
  public ConversationEventTopicParticipant conversationRoutingData(ConversationEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public ConversationEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(ConversationEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
  public ConversationEventTopicParticipant monitoredParticipantId(String monitoredParticipantId) {
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
  public ConversationEventTopicParticipant coachedParticipantId(String coachedParticipantId) {
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
  public ConversationEventTopicParticipant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
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
  public ConversationEventTopicParticipant flaggedReason(String flaggedReason) {
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
  public ConversationEventTopicParticipant attributes(Map<String, String> attributes) {
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
  public ConversationEventTopicParticipant calls(List<ConversationEventTopicCall> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<ConversationEventTopicCall> getCalls() {
    return calls;
  }
  public void setCalls(List<ConversationEventTopicCall> calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant callbacks(List<ConversationEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbacks")
  public List<ConversationEventTopicCallback> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<ConversationEventTopicCallback> callbacks) {
    this.callbacks = callbacks;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant chats(List<ConversationEventTopicChat> chats) {
    this.chats = chats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chats")
  public List<ConversationEventTopicChat> getChats() {
    return chats;
  }
  public void setChats(List<ConversationEventTopicChat> chats) {
    this.chats = chats;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant cobrowsesessions(List<ConversationEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowsesessions")
  public List<ConversationEventTopicCobrowse> getCobrowsesessions() {
    return cobrowsesessions;
  }
  public void setCobrowsesessions(List<ConversationEventTopicCobrowse> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant emails(List<ConversationEventTopicEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emails")
  public List<ConversationEventTopicEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<ConversationEventTopicEmail> emails) {
    this.emails = emails;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant messages(List<ConversationEventTopicMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<ConversationEventTopicMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<ConversationEventTopicMessage> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant screenshares(List<ConversationEventTopicScreenshare> screenshares) {
    this.screenshares = screenshares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenshares")
  public List<ConversationEventTopicScreenshare> getScreenshares() {
    return screenshares;
  }
  public void setScreenshares(List<ConversationEventTopicScreenshare> screenshares) {
    this.screenshares = screenshares;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant socialExpressions(List<ConversationEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpressions")
  public List<ConversationEventTopicSocialExpression> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<ConversationEventTopicSocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant videos(List<ConversationEventTopicVideo> videos) {
    this.videos = videos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videos")
  public List<ConversationEventTopicVideo> getVideos() {
    return videos;
  }
  public void setVideos(List<ConversationEventTopicVideo> videos) {
    this.videos = videos;
  }

  
  /**
   **/
  public ConversationEventTopicParticipant additionalProperties(Object additionalProperties) {
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
    ConversationEventTopicParticipant conversationEventTopicParticipant = (ConversationEventTopicParticipant) o;
    return Objects.equals(this.id, conversationEventTopicParticipant.id) &&
        Objects.equals(this.connectedTime, conversationEventTopicParticipant.connectedTime) &&
        Objects.equals(this.endTime, conversationEventTopicParticipant.endTime) &&
        Objects.equals(this.userId, conversationEventTopicParticipant.userId) &&
        Objects.equals(this.externalContactId, conversationEventTopicParticipant.externalContactId) &&
        Objects.equals(this.externalOrganizationId, conversationEventTopicParticipant.externalOrganizationId) &&
        Objects.equals(this.name, conversationEventTopicParticipant.name) &&
        Objects.equals(this.queueId, conversationEventTopicParticipant.queueId) &&
        Objects.equals(this.groupId, conversationEventTopicParticipant.groupId) &&
        Objects.equals(this.teamId, conversationEventTopicParticipant.teamId) &&
        Objects.equals(this.purpose, conversationEventTopicParticipant.purpose) &&
        Objects.equals(this.consultParticipantId, conversationEventTopicParticipant.consultParticipantId) &&
        Objects.equals(this.address, conversationEventTopicParticipant.address) &&
        Objects.equals(this.wrapupRequired, conversationEventTopicParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupExpected, conversationEventTopicParticipant.wrapupExpected) &&
        Objects.equals(this.wrapupPrompt, conversationEventTopicParticipant.wrapupPrompt) &&
        Objects.equals(this.wrapupTimeoutMs, conversationEventTopicParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapup, conversationEventTopicParticipant.wrapup) &&
        Objects.equals(this.startAcwTime, conversationEventTopicParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, conversationEventTopicParticipant.endAcwTime) &&
        Objects.equals(this.conversationRoutingData, conversationEventTopicParticipant.conversationRoutingData) &&
        Objects.equals(this.alertingTimeoutMs, conversationEventTopicParticipant.alertingTimeoutMs) &&
        Objects.equals(this.monitoredParticipantId, conversationEventTopicParticipant.monitoredParticipantId) &&
        Objects.equals(this.coachedParticipantId, conversationEventTopicParticipant.coachedParticipantId) &&
        Objects.equals(this.screenRecordingState, conversationEventTopicParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, conversationEventTopicParticipant.flaggedReason) &&
        Objects.equals(this.attributes, conversationEventTopicParticipant.attributes) &&
        Objects.equals(this.calls, conversationEventTopicParticipant.calls) &&
        Objects.equals(this.callbacks, conversationEventTopicParticipant.callbacks) &&
        Objects.equals(this.chats, conversationEventTopicParticipant.chats) &&
        Objects.equals(this.cobrowsesessions, conversationEventTopicParticipant.cobrowsesessions) &&
        Objects.equals(this.emails, conversationEventTopicParticipant.emails) &&
        Objects.equals(this.messages, conversationEventTopicParticipant.messages) &&
        Objects.equals(this.screenshares, conversationEventTopicParticipant.screenshares) &&
        Objects.equals(this.socialExpressions, conversationEventTopicParticipant.socialExpressions) &&
        Objects.equals(this.videos, conversationEventTopicParticipant.videos) &&
        Objects.equals(this.additionalProperties, conversationEventTopicParticipant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, externalOrganizationId, name, queueId, groupId, teamId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, startAcwTime, endAcwTime, conversationRoutingData, alertingTimeoutMs, monitoredParticipantId, coachedParticipantId, screenRecordingState, flaggedReason, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, screenshares, socialExpressions, videos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicParticipant {\n");
    
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

