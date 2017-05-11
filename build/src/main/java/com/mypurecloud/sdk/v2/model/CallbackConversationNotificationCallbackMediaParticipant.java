package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CallbackConversationNotificationErrorInfo;
import com.mypurecloud.sdk.v2.model.CallbackConversationNotificationUriReference;
import com.mypurecloud.sdk.v2.model.ConversationNotificationDialerPreview;
import com.mypurecloud.sdk.v2.model.ConversationNotificationWrapup;
import com.mypurecloud.sdk.v2.model.DependencyTrackingBuildNotificationNotificationUser;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CallbackConversationNotificationCallbackMediaParticipant
 */

public class CallbackConversationNotificationCallbackMediaParticipant  implements Serializable {
  
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
  private DependencyTrackingBuildNotificationNotificationUser user = null;
  private CallbackConversationNotificationUriReference queue = null;
  private Map<String, String> attributes = new HashMap<String, String>();
  private CallbackConversationNotificationErrorInfo errorInfo = null;
  private CallbackConversationNotificationUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private String provider = null;
  private CallbackConversationNotificationUriReference externalContact = null;
  private CallbackConversationNotificationUriReference externalOrganization = null;
  private ConversationNotificationWrapup wrapup = null;
  private ConversationNotificationDialerPreview outboundPreview = null;
  private DocumentDataV2NotificationWorkspace voicemail = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private String callbackUserName = null;
  private Boolean skipEnabled = null;
  private Integer timeoutSeconds = null;
  private Date callbackScheduledTime = null;
  private String automatedCallbackConfigId = null;

  
  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant id(String id) {
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
  public CallbackConversationNotificationCallbackMediaParticipant name(String name) {
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
  public CallbackConversationNotificationCallbackMediaParticipant address(String address) {
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
  public CallbackConversationNotificationCallbackMediaParticipant startTime(Date startTime) {
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
  public CallbackConversationNotificationCallbackMediaParticipant connectedTime(Date connectedTime) {
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
  public CallbackConversationNotificationCallbackMediaParticipant endTime(Date endTime) {
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
  public CallbackConversationNotificationCallbackMediaParticipant startHoldTime(Date startHoldTime) {
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
  public CallbackConversationNotificationCallbackMediaParticipant purpose(String purpose) {
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
  public CallbackConversationNotificationCallbackMediaParticipant state(StateEnum state) {
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
  public CallbackConversationNotificationCallbackMediaParticipant direction(DirectionEnum direction) {
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
  public CallbackConversationNotificationCallbackMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public CallbackConversationNotificationCallbackMediaParticipant held(Boolean held) {
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
  public CallbackConversationNotificationCallbackMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public CallbackConversationNotificationCallbackMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
  public CallbackConversationNotificationCallbackMediaParticipant user(DependencyTrackingBuildNotificationNotificationUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DependencyTrackingBuildNotificationNotificationUser getUser() {
    return user;
  }
  public void setUser(DependencyTrackingBuildNotificationNotificationUser user) {
    this.user = user;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant queue(CallbackConversationNotificationUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public CallbackConversationNotificationUriReference getQueue() {
    return queue;
  }
  public void setQueue(CallbackConversationNotificationUriReference queue) {
    this.queue = queue;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant attributes(Map<String, String> attributes) {
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
  public CallbackConversationNotificationCallbackMediaParticipant errorInfo(CallbackConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public CallbackConversationNotificationErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(CallbackConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant script(CallbackConversationNotificationUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public CallbackConversationNotificationUriReference getScript() {
    return script;
  }
  public void setScript(CallbackConversationNotificationUriReference script) {
    this.script = script;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public CallbackConversationNotificationCallbackMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
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
  public CallbackConversationNotificationCallbackMediaParticipant provider(String provider) {
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
  public CallbackConversationNotificationCallbackMediaParticipant externalContact(CallbackConversationNotificationUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public CallbackConversationNotificationUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(CallbackConversationNotificationUriReference externalContact) {
    this.externalContact = externalContact;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant externalOrganization(CallbackConversationNotificationUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public CallbackConversationNotificationUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(CallbackConversationNotificationUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant wrapup(ConversationNotificationWrapup wrapup) {
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
  public CallbackConversationNotificationCallbackMediaParticipant outboundPreview(ConversationNotificationDialerPreview outboundPreview) {
    this.outboundPreview = outboundPreview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundPreview")
  public ConversationNotificationDialerPreview getOutboundPreview() {
    return outboundPreview;
  }
  public void setOutboundPreview(ConversationNotificationDialerPreview outboundPreview) {
    this.outboundPreview = outboundPreview;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant voicemail(DocumentDataV2NotificationWorkspace voicemail) {
    this.voicemail = voicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voicemail")
  public DocumentDataV2NotificationWorkspace getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(DocumentDataV2NotificationWorkspace voicemail) {
    this.voicemail = voicemail;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant callbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackUserName")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant skipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skipEnabled")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }


  /**
   **/
  public CallbackConversationNotificationCallbackMediaParticipant automatedCallbackConfigId(String automatedCallbackConfigId) {
    this.automatedCallbackConfigId = automatedCallbackConfigId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("automatedCallbackConfigId")
  public String getAutomatedCallbackConfigId() {
    return automatedCallbackConfigId;
  }
  public void setAutomatedCallbackConfigId(String automatedCallbackConfigId) {
    this.automatedCallbackConfigId = automatedCallbackConfigId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackConversationNotificationCallbackMediaParticipant callbackConversationNotificationCallbackMediaParticipant = (CallbackConversationNotificationCallbackMediaParticipant) o;
    return Objects.equals(this.id, callbackConversationNotificationCallbackMediaParticipant.id) &&
        Objects.equals(this.name, callbackConversationNotificationCallbackMediaParticipant.name) &&
        Objects.equals(this.address, callbackConversationNotificationCallbackMediaParticipant.address) &&
        Objects.equals(this.startTime, callbackConversationNotificationCallbackMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, callbackConversationNotificationCallbackMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, callbackConversationNotificationCallbackMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, callbackConversationNotificationCallbackMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, callbackConversationNotificationCallbackMediaParticipant.purpose) &&
        Objects.equals(this.state, callbackConversationNotificationCallbackMediaParticipant.state) &&
        Objects.equals(this.direction, callbackConversationNotificationCallbackMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, callbackConversationNotificationCallbackMediaParticipant.disconnectType) &&
        Objects.equals(this.held, callbackConversationNotificationCallbackMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, callbackConversationNotificationCallbackMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, callbackConversationNotificationCallbackMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, callbackConversationNotificationCallbackMediaParticipant.user) &&
        Objects.equals(this.queue, callbackConversationNotificationCallbackMediaParticipant.queue) &&
        Objects.equals(this.attributes, callbackConversationNotificationCallbackMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, callbackConversationNotificationCallbackMediaParticipant.errorInfo) &&
        Objects.equals(this.script, callbackConversationNotificationCallbackMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, callbackConversationNotificationCallbackMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, callbackConversationNotificationCallbackMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.provider, callbackConversationNotificationCallbackMediaParticipant.provider) &&
        Objects.equals(this.externalContact, callbackConversationNotificationCallbackMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, callbackConversationNotificationCallbackMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, callbackConversationNotificationCallbackMediaParticipant.wrapup) &&
        Objects.equals(this.outboundPreview, callbackConversationNotificationCallbackMediaParticipant.outboundPreview) &&
        Objects.equals(this.voicemail, callbackConversationNotificationCallbackMediaParticipant.voicemail) &&
        Objects.equals(this.callbackNumbers, callbackConversationNotificationCallbackMediaParticipant.callbackNumbers) &&
        Objects.equals(this.callbackUserName, callbackConversationNotificationCallbackMediaParticipant.callbackUserName) &&
        Objects.equals(this.skipEnabled, callbackConversationNotificationCallbackMediaParticipant.skipEnabled) &&
        Objects.equals(this.timeoutSeconds, callbackConversationNotificationCallbackMediaParticipant.timeoutSeconds) &&
        Objects.equals(this.callbackScheduledTime, callbackConversationNotificationCallbackMediaParticipant.callbackScheduledTime) &&
        Objects.equals(this.automatedCallbackConfigId, callbackConversationNotificationCallbackMediaParticipant.automatedCallbackConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, provider, externalContact, externalOrganization, wrapup, outboundPreview, voicemail, callbackNumbers, callbackUserName, skipEnabled, timeoutSeconds, callbackScheduledTime, automatedCallbackConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackConversationNotificationCallbackMediaParticipant {\n");
    
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
    sb.append("    outboundPreview: ").append(toIndentedString(outboundPreview)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    automatedCallbackConfigId: ").append(toIndentedString(automatedCallbackConfigId)).append("\n");
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

