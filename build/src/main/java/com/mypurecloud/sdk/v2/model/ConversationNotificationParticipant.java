package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationNotificationCallbacks;
import com.mypurecloud.sdk.v2.model.ConversationNotificationCalls;
import com.mypurecloud.sdk.v2.model.ConversationNotificationChats;
import com.mypurecloud.sdk.v2.model.ConversationNotificationCobrowsesessions;
import com.mypurecloud.sdk.v2.model.ConversationNotificationEmails;
import com.mypurecloud.sdk.v2.model.ConversationNotificationMessages1;
import com.mypurecloud.sdk.v2.model.ConversationNotificationScreenshares;
import com.mypurecloud.sdk.v2.model.ConversationNotificationSocialExpressions;
import com.mypurecloud.sdk.v2.model.ConversationNotificationVideos;
import com.mypurecloud.sdk.v2.model.ConversationNotificationWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationNotificationParticipant
 */

public class ConversationNotificationParticipant  implements Serializable {
  
  private String id = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private String userId = null;
  private String externalContactId = null;
  private String externalOrganizationId = null;
  private String name = null;
  private String queueId = null;
  private String groupId = null;
  private String purpose = null;
  private String consultParticipantId = null;
  private String address = null;
  private Boolean wrapupRequired = null;
  private Boolean wrapupExpected = null;
  private String wrapupPrompt = null;
  private Integer wrapupTimeoutMs = null;
  private ConversationNotificationWrapup wrapup = null;
  private String monitoredParticipantId = null;

  /**
   * Gets or Sets screenRecordingState
   */
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
  private List<ConversationNotificationCalls> calls = new ArrayList<ConversationNotificationCalls>();
  private List<ConversationNotificationCallbacks> callbacks = new ArrayList<ConversationNotificationCallbacks>();
  private List<ConversationNotificationChats> chats = new ArrayList<ConversationNotificationChats>();
  private List<ConversationNotificationCobrowsesessions> cobrowsesessions = new ArrayList<ConversationNotificationCobrowsesessions>();
  private List<ConversationNotificationEmails> emails = new ArrayList<ConversationNotificationEmails>();
  private List<ConversationNotificationMessages1> messages = new ArrayList<ConversationNotificationMessages1>();
  private List<ConversationNotificationScreenshares> screenshares = new ArrayList<ConversationNotificationScreenshares>();
  private List<ConversationNotificationSocialExpressions> socialExpressions = new ArrayList<ConversationNotificationSocialExpressions>();
  private List<ConversationNotificationVideos> videos = new ArrayList<ConversationNotificationVideos>();
  private Object additionalProperties = null;

  
  /**
   **/
  public ConversationNotificationParticipant id(String id) {
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
  public ConversationNotificationParticipant connectedTime(Date connectedTime) {
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
  public ConversationNotificationParticipant endTime(Date endTime) {
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
  public ConversationNotificationParticipant userId(String userId) {
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
  public ConversationNotificationParticipant externalContactId(String externalContactId) {
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
  public ConversationNotificationParticipant externalOrganizationId(String externalOrganizationId) {
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
  public ConversationNotificationParticipant name(String name) {
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
  public ConversationNotificationParticipant queueId(String queueId) {
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
  public ConversationNotificationParticipant groupId(String groupId) {
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
  public ConversationNotificationParticipant purpose(String purpose) {
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
  public ConversationNotificationParticipant consultParticipantId(String consultParticipantId) {
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
  public ConversationNotificationParticipant address(String address) {
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
  public ConversationNotificationParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public ConversationNotificationParticipant wrapupExpected(Boolean wrapupExpected) {
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
  public ConversationNotificationParticipant wrapupPrompt(String wrapupPrompt) {
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
  public ConversationNotificationParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public ConversationNotificationParticipant wrapup(ConversationNotificationWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public ConversationNotificationWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationNotificationWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public ConversationNotificationParticipant monitoredParticipantId(String monitoredParticipantId) {
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
  public ConversationNotificationParticipant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
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
  public ConversationNotificationParticipant flaggedReason(String flaggedReason) {
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
  public ConversationNotificationParticipant attributes(Map<String, String> attributes) {
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
  public ConversationNotificationParticipant calls(List<ConversationNotificationCalls> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<ConversationNotificationCalls> getCalls() {
    return calls;
  }
  public void setCalls(List<ConversationNotificationCalls> calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public ConversationNotificationParticipant callbacks(List<ConversationNotificationCallbacks> callbacks) {
    this.callbacks = callbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbacks")
  public List<ConversationNotificationCallbacks> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<ConversationNotificationCallbacks> callbacks) {
    this.callbacks = callbacks;
  }

  
  /**
   **/
  public ConversationNotificationParticipant chats(List<ConversationNotificationChats> chats) {
    this.chats = chats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chats")
  public List<ConversationNotificationChats> getChats() {
    return chats;
  }
  public void setChats(List<ConversationNotificationChats> chats) {
    this.chats = chats;
  }

  
  /**
   **/
  public ConversationNotificationParticipant cobrowsesessions(List<ConversationNotificationCobrowsesessions> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowsesessions")
  public List<ConversationNotificationCobrowsesessions> getCobrowsesessions() {
    return cobrowsesessions;
  }
  public void setCobrowsesessions(List<ConversationNotificationCobrowsesessions> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
  }

  
  /**
   **/
  public ConversationNotificationParticipant emails(List<ConversationNotificationEmails> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emails")
  public List<ConversationNotificationEmails> getEmails() {
    return emails;
  }
  public void setEmails(List<ConversationNotificationEmails> emails) {
    this.emails = emails;
  }

  
  /**
   **/
  public ConversationNotificationParticipant messages(List<ConversationNotificationMessages1> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<ConversationNotificationMessages1> getMessages() {
    return messages;
  }
  public void setMessages(List<ConversationNotificationMessages1> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public ConversationNotificationParticipant screenshares(List<ConversationNotificationScreenshares> screenshares) {
    this.screenshares = screenshares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenshares")
  public List<ConversationNotificationScreenshares> getScreenshares() {
    return screenshares;
  }
  public void setScreenshares(List<ConversationNotificationScreenshares> screenshares) {
    this.screenshares = screenshares;
  }

  
  /**
   **/
  public ConversationNotificationParticipant socialExpressions(List<ConversationNotificationSocialExpressions> socialExpressions) {
    this.socialExpressions = socialExpressions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpressions")
  public List<ConversationNotificationSocialExpressions> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<ConversationNotificationSocialExpressions> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }

  
  /**
   **/
  public ConversationNotificationParticipant videos(List<ConversationNotificationVideos> videos) {
    this.videos = videos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videos")
  public List<ConversationNotificationVideos> getVideos() {
    return videos;
  }
  public void setVideos(List<ConversationNotificationVideos> videos) {
    this.videos = videos;
  }

  
  /**
   **/
  public ConversationNotificationParticipant additionalProperties(Object additionalProperties) {
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
    ConversationNotificationParticipant conversationNotificationParticipant = (ConversationNotificationParticipant) o;
    return Objects.equals(this.id, conversationNotificationParticipant.id) &&
        Objects.equals(this.connectedTime, conversationNotificationParticipant.connectedTime) &&
        Objects.equals(this.endTime, conversationNotificationParticipant.endTime) &&
        Objects.equals(this.userId, conversationNotificationParticipant.userId) &&
        Objects.equals(this.externalContactId, conversationNotificationParticipant.externalContactId) &&
        Objects.equals(this.externalOrganizationId, conversationNotificationParticipant.externalOrganizationId) &&
        Objects.equals(this.name, conversationNotificationParticipant.name) &&
        Objects.equals(this.queueId, conversationNotificationParticipant.queueId) &&
        Objects.equals(this.groupId, conversationNotificationParticipant.groupId) &&
        Objects.equals(this.purpose, conversationNotificationParticipant.purpose) &&
        Objects.equals(this.consultParticipantId, conversationNotificationParticipant.consultParticipantId) &&
        Objects.equals(this.address, conversationNotificationParticipant.address) &&
        Objects.equals(this.wrapupRequired, conversationNotificationParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupExpected, conversationNotificationParticipant.wrapupExpected) &&
        Objects.equals(this.wrapupPrompt, conversationNotificationParticipant.wrapupPrompt) &&
        Objects.equals(this.wrapupTimeoutMs, conversationNotificationParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapup, conversationNotificationParticipant.wrapup) &&
        Objects.equals(this.monitoredParticipantId, conversationNotificationParticipant.monitoredParticipantId) &&
        Objects.equals(this.screenRecordingState, conversationNotificationParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, conversationNotificationParticipant.flaggedReason) &&
        Objects.equals(this.attributes, conversationNotificationParticipant.attributes) &&
        Objects.equals(this.calls, conversationNotificationParticipant.calls) &&
        Objects.equals(this.callbacks, conversationNotificationParticipant.callbacks) &&
        Objects.equals(this.chats, conversationNotificationParticipant.chats) &&
        Objects.equals(this.cobrowsesessions, conversationNotificationParticipant.cobrowsesessions) &&
        Objects.equals(this.emails, conversationNotificationParticipant.emails) &&
        Objects.equals(this.messages, conversationNotificationParticipant.messages) &&
        Objects.equals(this.screenshares, conversationNotificationParticipant.screenshares) &&
        Objects.equals(this.socialExpressions, conversationNotificationParticipant.socialExpressions) &&
        Objects.equals(this.videos, conversationNotificationParticipant.videos) &&
        Objects.equals(this.additionalProperties, conversationNotificationParticipant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, externalOrganizationId, name, queueId, groupId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, monitoredParticipantId, screenRecordingState, flaggedReason, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, screenshares, socialExpressions, videos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalOrganizationId: ").append(toIndentedString(externalOrganizationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    consultParticipantId: ").append(toIndentedString(consultParticipantId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupExpected: ").append(toIndentedString(wrapupExpected)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
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

