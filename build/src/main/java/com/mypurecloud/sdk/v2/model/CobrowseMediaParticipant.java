package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.Wrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CobrowseMediaParticipant
 */

public class CobrowseMediaParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private Date startHoldTime = null;
  private String purpose = null;

  /**
   * The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting
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
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
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
   * The reason the participant was disconnected from the conversation.
   */
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam");

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
  private UriReference user = null;
  private UriReference queue = null;
  private Map<String, String> attributes = null;
  private ErrorBody errorInfo = null;
  private UriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private String provider = null;
  private UriReference externalContact = null;
  private UriReference externalOrganization = null;
  private Wrapup wrapup = null;
  private String peer = null;
  private String cobrowseSessionId = null;
  private String cobrowseRole = null;
  private List<String> controlling = new ArrayList<String>();
  private String viewerUrl = null;
  private Date providerEventTime = null;

  
  /**
   * The unique participant ID.
   **/
  public CobrowseMediaParticipant id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique participant ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The display friendly name of the participant.
   **/
  public CobrowseMediaParticipant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display friendly name of the participant.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The participant address.
   **/
  public CobrowseMediaParticipant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant address.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CobrowseMediaParticipant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CobrowseMediaParticipant connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   * The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CobrowseMediaParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CobrowseMediaParticipant startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   * The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr
   **/
  public CobrowseMediaParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   * The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting
   **/
  public CobrowseMediaParticipant state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
   **/
  public CobrowseMediaParticipant direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's direction.  Values can be: 'inbound' or 'outbound'")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * The reason the participant was disconnected from the conversation.
   **/
  public CobrowseMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the participant was disconnected from the conversation.")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   * Value is true when the participant is on hold.
   **/
  public CobrowseMediaParticipant held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value is true when the participant is on hold.")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   * Value is true when the participant requires wrap-up.
   **/
  public CobrowseMediaParticipant wrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value is true when the participant requires wrap-up.")
  @JsonProperty("wrapupRequired")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  
  /**
   * The wrap-up prompt indicating the type of wrap-up to be performed.
   **/
  public CobrowseMediaParticipant wrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The wrap-up prompt indicating the type of wrap-up to be performed.")
  @JsonProperty("wrapupPrompt")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  
  /**
   * The PureCloud user for this participant.
   **/
  public CobrowseMediaParticipant user(UriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud user for this participant.")
  @JsonProperty("user")
  public UriReference getUser() {
    return user;
  }
  public void setUser(UriReference user) {
    this.user = user;
  }

  
  /**
   * The PureCloud queue for this participant.
   **/
  public CobrowseMediaParticipant queue(UriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud queue for this participant.")
  @JsonProperty("queue")
  public UriReference getQueue() {
    return queue;
  }
  public void setQueue(UriReference queue) {
    this.queue = queue;
  }

  
  /**
   * A list of ad-hoc attributes for the participant.
   **/
  public CobrowseMediaParticipant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of ad-hoc attributes for the participant.")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  
  /**
   * If the conversation ends in error, contains additional error details.
   **/
  public CobrowseMediaParticipant errorInfo(ErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the conversation ends in error, contains additional error details.")
  @JsonProperty("errorInfo")
  public ErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   * The Engage script that should be used by this participant.
   **/
  public CobrowseMediaParticipant script(UriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Engage script that should be used by this participant.")
  @JsonProperty("script")
  public UriReference getScript() {
    return script;
  }
  public void setScript(UriReference script) {
    this.script = script;
  }

  
  /**
   * The amount of time the participant has to complete wrap-up.
   **/
  public CobrowseMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time the participant has to complete wrap-up.")
  @JsonProperty("wrapupTimeoutMs")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }

  
  /**
   * Value is true when the participant has skipped wrap-up.
   **/
  public CobrowseMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value is true when the participant has skipped wrap-up.")
  @JsonProperty("wrapupSkipped")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  
  /**
   * The source provider for the communication.
   **/
  public CobrowseMediaParticipant provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider for the communication.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * If this participant represents an external contact, then this will be the reference for the external contact.
   **/
  public CobrowseMediaParticipant externalContact(UriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external contact, then this will be the reference for the external contact.")
  @JsonProperty("externalContact")
  public UriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(UriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   * If this participant represents an external org, then this will be the reference for the external org.
   **/
  public CobrowseMediaParticipant externalOrganization(UriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external org, then this will be the reference for the external org.")
  @JsonProperty("externalOrganization")
  public UriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(UriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   * Wrapup for this participant, if it has been applied.
   **/
  public CobrowseMediaParticipant wrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wrapup for this participant, if it has been applied.")
  @JsonProperty("wrapup")
  public Wrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * The peer communication corresponding to a matching leg for this communication.
   **/
  public CobrowseMediaParticipant peer(String peer) {
    this.peer = peer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The peer communication corresponding to a matching leg for this communication.")
  @JsonProperty("peer")
  public String getPeer() {
    return peer;
  }
  public void setPeer(String peer) {
    this.peer = peer;
  }

  
  /**
   * The co-browse session ID.
   **/
  public CobrowseMediaParticipant cobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The co-browse session ID.")
  @JsonProperty("cobrowseSessionId")
  public String getCobrowseSessionId() {
    return cobrowseSessionId;
  }
  public void setCobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
  }

  
  /**
   * This value identifies the role of the co-browse client within the co-browse session (a client is a sharer or a viewer).
   **/
  public CobrowseMediaParticipant cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value identifies the role of the co-browse client within the co-browse session (a client is a sharer or a viewer).")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }

  
  /**
   * ID of co-browse participants for which this client has been granted control (list is empty if this client cannot control any shared pages).
   **/
  public CobrowseMediaParticipant controlling(List<String> controlling) {
    this.controlling = controlling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of co-browse participants for which this client has been granted control (list is empty if this client cannot control any shared pages).")
  @JsonProperty("controlling")
  public List<String> getControlling() {
    return controlling;
  }
  public void setControlling(List<String> controlling) {
    this.controlling = controlling;
  }

  
  /**
   * The URL that can be used to open co-browse session in web browser.
   **/
  public CobrowseMediaParticipant viewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL that can be used to open co-browse session in web browser.")
  @JsonProperty("viewerUrl")
  public String getViewerUrl() {
    return viewerUrl;
  }
  public void setViewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
  }

  
  /**
   * The time when the provider event which triggered this conversation update happened in the corrected provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CobrowseMediaParticipant providerEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the provider event which triggered this conversation update happened in the corrected provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("providerEventTime")
  public Date getProviderEventTime() {
    return providerEventTime;
  }
  public void setProviderEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobrowseMediaParticipant cobrowseMediaParticipant = (CobrowseMediaParticipant) o;
    return Objects.equals(this.id, cobrowseMediaParticipant.id) &&
        Objects.equals(this.name, cobrowseMediaParticipant.name) &&
        Objects.equals(this.address, cobrowseMediaParticipant.address) &&
        Objects.equals(this.startTime, cobrowseMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, cobrowseMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, cobrowseMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, cobrowseMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, cobrowseMediaParticipant.purpose) &&
        Objects.equals(this.state, cobrowseMediaParticipant.state) &&
        Objects.equals(this.direction, cobrowseMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, cobrowseMediaParticipant.disconnectType) &&
        Objects.equals(this.held, cobrowseMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, cobrowseMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, cobrowseMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, cobrowseMediaParticipant.user) &&
        Objects.equals(this.queue, cobrowseMediaParticipant.queue) &&
        Objects.equals(this.attributes, cobrowseMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, cobrowseMediaParticipant.errorInfo) &&
        Objects.equals(this.script, cobrowseMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, cobrowseMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, cobrowseMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.provider, cobrowseMediaParticipant.provider) &&
        Objects.equals(this.externalContact, cobrowseMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, cobrowseMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, cobrowseMediaParticipant.wrapup) &&
        Objects.equals(this.peer, cobrowseMediaParticipant.peer) &&
        Objects.equals(this.cobrowseSessionId, cobrowseMediaParticipant.cobrowseSessionId) &&
        Objects.equals(this.cobrowseRole, cobrowseMediaParticipant.cobrowseRole) &&
        Objects.equals(this.controlling, cobrowseMediaParticipant.controlling) &&
        Objects.equals(this.viewerUrl, cobrowseMediaParticipant.viewerUrl) &&
        Objects.equals(this.providerEventTime, cobrowseMediaParticipant.providerEventTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, provider, externalContact, externalOrganization, wrapup, peer, cobrowseSessionId, cobrowseRole, controlling, viewerUrl, providerEventTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobrowseMediaParticipant {\n");
    
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
    sb.append("    cobrowseSessionId: ").append(toIndentedString(cobrowseSessionId)).append("\n");
    sb.append("    cobrowseRole: ").append(toIndentedString(cobrowseRole)).append("\n");
    sb.append("    controlling: ").append(toIndentedString(controlling)).append("\n");
    sb.append("    viewerUrl: ").append(toIndentedString(viewerUrl)).append("\n");
    sb.append("    providerEventTime: ").append(toIndentedString(providerEventTime)).append("\n");
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

