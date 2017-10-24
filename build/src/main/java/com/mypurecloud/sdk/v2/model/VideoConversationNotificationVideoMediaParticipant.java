package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationNotificationWrapup;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import com.mypurecloud.sdk.v2.model.VideoConversationNotificationErrorInfo;
import com.mypurecloud.sdk.v2.model.VideoConversationNotificationUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * VideoConversationNotificationVideoMediaParticipant
 */

public class VideoConversationNotificationVideoMediaParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private Date startHoldTime = null;
  private String purpose = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("alerting"),
    DIALING("dialing"),
    CONTACTING("contacting"),
    OFFERING("offering"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    TERMINATED("terminated"),
    CONVERTING("converting"),
    UPLOADING("uploading"),
    TRANSMITTING("transmitting"),
    SCHEDULED("scheduled"),
    NONE("none");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

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

  /**
   * Gets or Sets disconnectType
   */
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TIMEOUT("timeout"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam"),
    UNCALLABLE("uncallable");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DisconnectTypeEnum value : DisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisconnectTypeEnum disconnectType = null;
  private Boolean held = null;
  private Boolean wrapupRequired = null;
  private String wrapupPrompt = null;
  private DocumentDataV2NotificationCreatedBy user = null;
  private VideoConversationNotificationUriReference queue = null;
  private Map<String, String> attributes = null;
  private VideoConversationNotificationErrorInfo errorInfo = null;
  private VideoConversationNotificationUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private String provider = null;
  private VideoConversationNotificationUriReference externalContact = null;
  private VideoConversationNotificationUriReference externalOrganization = null;
  private ConversationNotificationWrapup wrapup = null;
  private String peer = null;
  private String screenRecordingState = null;
  private Boolean audioMuted = null;
  private Boolean videoMuted = null;
  private Boolean sharingScreen = null;
  private Integer peerCount = null;
  private String context = null;

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant id(String id) {
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
  public VideoConversationNotificationVideoMediaParticipant name(String name) {
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
  public VideoConversationNotificationVideoMediaParticipant address(String address) {
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
  public VideoConversationNotificationVideoMediaParticipant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant connectedTime(Date connectedTime) {
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
  public VideoConversationNotificationVideoMediaParticipant endTime(Date endTime) {
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
  public VideoConversationNotificationVideoMediaParticipant startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant purpose(String purpose) {
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
  public VideoConversationNotificationVideoMediaParticipant state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant direction(DirectionEnum direction) {
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
  public VideoConversationNotificationVideoMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public VideoConversationNotificationVideoMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
  public VideoConversationNotificationVideoMediaParticipant user(DocumentDataV2NotificationCreatedBy user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DocumentDataV2NotificationCreatedBy getUser() {
    return user;
  }
  public void setUser(DocumentDataV2NotificationCreatedBy user) {
    this.user = user;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant queue(VideoConversationNotificationUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public VideoConversationNotificationUriReference getQueue() {
    return queue;
  }
  public void setQueue(VideoConversationNotificationUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant attributes(Map<String, String> attributes) {
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
  public VideoConversationNotificationVideoMediaParticipant errorInfo(VideoConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public VideoConversationNotificationErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(VideoConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant script(VideoConversationNotificationUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public VideoConversationNotificationUriReference getScript() {
    return script;
  }
  public void setScript(VideoConversationNotificationUriReference script) {
    this.script = script;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public VideoConversationNotificationVideoMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupSkipped")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant provider(String provider) {
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
  public VideoConversationNotificationVideoMediaParticipant externalContact(VideoConversationNotificationUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public VideoConversationNotificationUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(VideoConversationNotificationUriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant externalOrganization(VideoConversationNotificationUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public VideoConversationNotificationUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(VideoConversationNotificationUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant wrapup(ConversationNotificationWrapup wrapup) {
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
  public VideoConversationNotificationVideoMediaParticipant peer(String peer) {
    this.peer = peer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peer")
  public String getPeer() {
    return peer;
  }
  public void setPeer(String peer) {
    this.peer = peer;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant screenRecordingState(String screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenRecordingState")
  public String getScreenRecordingState() {
    return screenRecordingState;
  }
  public void setScreenRecordingState(String screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant audioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("audioMuted")
  public Boolean getAudioMuted() {
    return audioMuted;
  }
  public void setAudioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant videoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videoMuted")
  public Boolean getVideoMuted() {
    return videoMuted;
  }
  public void setVideoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant sharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharingScreen")
  public Boolean getSharingScreen() {
    return sharingScreen;
  }
  public void setSharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant peerCount(Integer peerCount) {
    this.peerCount = peerCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peerCount")
  public Integer getPeerCount() {
    return peerCount;
  }
  public void setPeerCount(Integer peerCount) {
    this.peerCount = peerCount;
  }

  
  /**
   **/
  public VideoConversationNotificationVideoMediaParticipant context(String context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("context")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoConversationNotificationVideoMediaParticipant videoConversationNotificationVideoMediaParticipant = (VideoConversationNotificationVideoMediaParticipant) o;
    return Objects.equals(this.id, videoConversationNotificationVideoMediaParticipant.id) &&
        Objects.equals(this.name, videoConversationNotificationVideoMediaParticipant.name) &&
        Objects.equals(this.address, videoConversationNotificationVideoMediaParticipant.address) &&
        Objects.equals(this.startTime, videoConversationNotificationVideoMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, videoConversationNotificationVideoMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, videoConversationNotificationVideoMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, videoConversationNotificationVideoMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, videoConversationNotificationVideoMediaParticipant.purpose) &&
        Objects.equals(this.state, videoConversationNotificationVideoMediaParticipant.state) &&
        Objects.equals(this.direction, videoConversationNotificationVideoMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, videoConversationNotificationVideoMediaParticipant.disconnectType) &&
        Objects.equals(this.held, videoConversationNotificationVideoMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, videoConversationNotificationVideoMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, videoConversationNotificationVideoMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, videoConversationNotificationVideoMediaParticipant.user) &&
        Objects.equals(this.queue, videoConversationNotificationVideoMediaParticipant.queue) &&
        Objects.equals(this.attributes, videoConversationNotificationVideoMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, videoConversationNotificationVideoMediaParticipant.errorInfo) &&
        Objects.equals(this.script, videoConversationNotificationVideoMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, videoConversationNotificationVideoMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, videoConversationNotificationVideoMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.provider, videoConversationNotificationVideoMediaParticipant.provider) &&
        Objects.equals(this.externalContact, videoConversationNotificationVideoMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, videoConversationNotificationVideoMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, videoConversationNotificationVideoMediaParticipant.wrapup) &&
        Objects.equals(this.peer, videoConversationNotificationVideoMediaParticipant.peer) &&
        Objects.equals(this.screenRecordingState, videoConversationNotificationVideoMediaParticipant.screenRecordingState) &&
        Objects.equals(this.audioMuted, videoConversationNotificationVideoMediaParticipant.audioMuted) &&
        Objects.equals(this.videoMuted, videoConversationNotificationVideoMediaParticipant.videoMuted) &&
        Objects.equals(this.sharingScreen, videoConversationNotificationVideoMediaParticipant.sharingScreen) &&
        Objects.equals(this.peerCount, videoConversationNotificationVideoMediaParticipant.peerCount) &&
        Objects.equals(this.context, videoConversationNotificationVideoMediaParticipant.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, provider, externalContact, externalOrganization, wrapup, peer, screenRecordingState, audioMuted, videoMuted, sharingScreen, peerCount, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoConversationNotificationVideoMediaParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    screenRecordingState: ").append(toIndentedString(screenRecordingState)).append("\n");
    sb.append("    audioMuted: ").append(toIndentedString(audioMuted)).append("\n");
    sb.append("    videoMuted: ").append(toIndentedString(videoMuted)).append("\n");
    sb.append("    sharingScreen: ").append(toIndentedString(sharingScreen)).append("\n");
    sb.append("    peerCount: ").append(toIndentedString(peerCount)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

