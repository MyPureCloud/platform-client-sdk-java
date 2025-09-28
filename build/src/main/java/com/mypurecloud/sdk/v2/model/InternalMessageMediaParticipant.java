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
import com.mypurecloud.sdk.v2.model.Address;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ConversationRoutingData;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.InternalMessageDetails;
import com.mypurecloud.sdk.v2.model.JourneyContext;
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
 * InternalMessageMediaParticipant
 */

public class InternalMessageMediaParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
  private Date startAlertingTime = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private Date startHoldTime = null;
  private String purpose = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
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
    PARKED("parked"),
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

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
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

  private static class DisconnectTypeEnumDeserializer extends StdDeserializer<DisconnectTypeEnum> {
    public DisconnectTypeEnumDeserializer() {
      super(DisconnectTypeEnumDeserializer.class);
    }

    @Override
    public DisconnectTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DisconnectTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason the participant was disconnected from the conversation.
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    ENDPOINT_DONOTDISTURB("endpoint.donotdisturb"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_DONOTDISTURB("transfer.donotdisturb"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam"),
    INACTIVITY("inactivity"),
    SESSION_EXPIRED("session.expired");

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
  private List<String> mediaRoles = null;
  private DomainEntityRef user = null;
  private DomainEntityRef queue = null;
  private DomainEntityRef team = null;
  private Map<String, String> attributes = null;
  private ErrorInfo errorInfo = null;
  private DomainEntityRef script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Integer alertingTimeoutMs = null;
  private String provider = null;
  private DomainEntityRef externalContact = null;
  private String externalContactInitialDivisionId = null;
  private DomainEntityRef externalOrganization = null;
  private Wrapup wrapup = null;
  private String peer = null;

  private static class FlaggedReasonEnumDeserializer extends StdDeserializer<FlaggedReasonEnum> {
    public FlaggedReasonEnumDeserializer() {
      super(FlaggedReasonEnumDeserializer.class);
    }

    @Override
    public FlaggedReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlaggedReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason specifying why participant flagged the conversation.
   */
 @JsonDeserialize(using = FlaggedReasonEnumDeserializer.class)
  public enum FlaggedReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENERAL("general");

    private String value;

    FlaggedReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlaggedReasonEnum fromString(String key) {
      if (key == null) return null;

      for (FlaggedReasonEnum value : FlaggedReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlaggedReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlaggedReasonEnum flaggedReason = null;
  private JourneyContext journeyContext = null;
  private ConversationRoutingData conversationRoutingData = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private Date parkTime = null;
  private Date resumeTime = null;
  private String internalMessageId = null;
  private AddressableEntityRef targetUser = null;
  private AddressableEntityRef sourceUser = null;
  private Address toAddress = null;
  private Address fromAddress = null;
  private List<InternalMessageDetails> messages = null;

  public InternalMessageMediaParticipant() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mediaRoles = new ArrayList<String>();
      messages = new ArrayList<InternalMessageDetails>();
    }
  }

  
  /**
   * The unique participant ID.
   **/
  public InternalMessageMediaParticipant id(String id) {
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
  public InternalMessageMediaParticipant name(String name) {
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
  public InternalMessageMediaParticipant address(String address) {
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
   * The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  /**
   * The timestamp when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant startAlertingTime(Date startAlertingTime) {
    this.startAlertingTime = startAlertingTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startAlertingTime")
  public Date getStartAlertingTime() {
    return startAlertingTime;
  }
  public void setStartAlertingTime(Date startAlertingTime) {
    this.startAlertingTime = startAlertingTime;
  }


  /**
   * The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }


  /**
   * The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  /**
   * The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
  public InternalMessageMediaParticipant purpose(String purpose) {
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
  public InternalMessageMediaParticipant state(StateEnum state) {
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
  public InternalMessageMediaParticipant direction(DirectionEnum direction) {
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
  public InternalMessageMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public InternalMessageMediaParticipant held(Boolean held) {
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
  public InternalMessageMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public InternalMessageMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
   * List of roles this participant's media has had on the conversation, ie monitor, coach, etc
   **/
  public InternalMessageMediaParticipant mediaRoles(List<String> mediaRoles) {
    this.mediaRoles = mediaRoles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of roles this participant's media has had on the conversation, ie monitor, coach, etc")
  @JsonProperty("mediaRoles")
  public List<String> getMediaRoles() {
    return mediaRoles;
  }
  public void setMediaRoles(List<String> mediaRoles) {
    this.mediaRoles = mediaRoles;
  }


  /**
   * The PureCloud user for this participant.
   **/
  public InternalMessageMediaParticipant user(DomainEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud user for this participant.")
  @JsonProperty("user")
  public DomainEntityRef getUser() {
    return user;
  }
  public void setUser(DomainEntityRef user) {
    this.user = user;
  }


  /**
   * The PureCloud queue for this participant.
   **/
  public InternalMessageMediaParticipant queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud queue for this participant.")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }


  /**
   * The PureCloud team for this participant.
   **/
  public InternalMessageMediaParticipant team(DomainEntityRef team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud team for this participant.")
  @JsonProperty("team")
  public DomainEntityRef getTeam() {
    return team;
  }
  public void setTeam(DomainEntityRef team) {
    this.team = team;
  }


  /**
   * A list of ad-hoc attributes for the participant.
   **/
  public InternalMessageMediaParticipant attributes(Map<String, String> attributes) {
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
  public InternalMessageMediaParticipant errorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the conversation ends in error, contains additional error details.")
  @JsonProperty("errorInfo")
  public ErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * The Engage script that should be used by this participant.
   **/
  public InternalMessageMediaParticipant script(DomainEntityRef script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Engage script that should be used by this participant.")
  @JsonProperty("script")
  public DomainEntityRef getScript() {
    return script;
  }
  public void setScript(DomainEntityRef script) {
    this.script = script;
  }


  /**
   * The amount of time the participant has to complete wrap-up.
   **/
  public InternalMessageMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public InternalMessageMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
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
   * Specifies how long the agent has to answer an interaction before being marked as not responding.
   **/
  public InternalMessageMediaParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
   * The source provider for the communication.
   **/
  public InternalMessageMediaParticipant provider(String provider) {
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
  public InternalMessageMediaParticipant externalContact(DomainEntityRef externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external contact, then this will be the reference for the external contact.")
  @JsonProperty("externalContact")
  public DomainEntityRef getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(DomainEntityRef externalContact) {
    this.externalContact = externalContact;
  }


  /**
   * If this participant represents an external contact, then this will be the initial division for the external contact. This value will not be updated if the external contact is reassigned.
   **/
  public InternalMessageMediaParticipant externalContactInitialDivisionId(String externalContactInitialDivisionId) {
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
   * If this participant represents an external org, then this will be the reference for the external org.
   **/
  public InternalMessageMediaParticipant externalOrganization(DomainEntityRef externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external org, then this will be the reference for the external org.")
  @JsonProperty("externalOrganization")
  public DomainEntityRef getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(DomainEntityRef externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   * Wrapup for this participant, if it has been applied.
   **/
  public InternalMessageMediaParticipant wrapup(Wrapup wrapup) {
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
  public InternalMessageMediaParticipant peer(String peer) {
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
   * The reason specifying why participant flagged the conversation.
   **/
  public InternalMessageMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason specifying why participant flagged the conversation.")
  @JsonProperty("flaggedReason")
  public FlaggedReasonEnum getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
  }


  /**
   * Journey System data/context that is applicable to this communication.  When used for historical purposes, the context should be immutable.  When null, there is no applicable Journey System context.
   **/
  public InternalMessageMediaParticipant journeyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Journey System data/context that is applicable to this communication.  When used for historical purposes, the context should be immutable.  When null, there is no applicable Journey System context.")
  @JsonProperty("journeyContext")
  public JourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }


  /**
   * Information on how a communication should be routed to an agent.
   **/
  public InternalMessageMediaParticipant conversationRoutingData(ConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information on how a communication should be routed to an agent.")
  @JsonProperty("conversationRoutingData")
  public ConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(ConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }


  /**
   * The timestamp when this participant started after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant startAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant started after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startAcwTime")
  public Date getStartAcwTime() {
    return startAcwTime;
  }
  public void setStartAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
  }


  /**
   * The timestamp when this participant ended after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant endAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant ended after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endAcwTime")
  public Date getEndAcwTime() {
    return endAcwTime;
  }
  public void setEndAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
  }


  /**
   * The time when this participant's communication was last parked.  Does not reset on resume. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant parkTime(Date parkTime) {
    this.parkTime = parkTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant's communication was last parked.  Does not reset on resume. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("parkTime")
  public Date getParkTime() {
    return parkTime;
  }
  public void setParkTime(Date parkTime) {
    this.parkTime = parkTime;
  }


  /**
   * The time when this participant's communications will resume. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageMediaParticipant resumeTime(Date resumeTime) {
    this.resumeTime = resumeTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant's communications will resume. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("resumeTime")
  public Date getResumeTime() {
    return resumeTime;
  }
  public void setResumeTime(Date resumeTime) {
    this.resumeTime = resumeTime;
  }


  /**
   * The internal message communication ID.
   **/
  public InternalMessageMediaParticipant internalMessageId(String internalMessageId) {
    this.internalMessageId = internalMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The internal message communication ID.")
  @JsonProperty("internalMessageId")
  public String getInternalMessageId() {
    return internalMessageId;
  }
  public void setInternalMessageId(String internalMessageId) {
    this.internalMessageId = internalMessageId;
  }


  /**
   * The user participant on receiving side of the internal message conversation.
   **/
  public InternalMessageMediaParticipant targetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user participant on receiving side of the internal message conversation.")
  @JsonProperty("targetUser")
  public AddressableEntityRef getTargetUser() {
    return targetUser;
  }
  public void setTargetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
  }


  /**
   * The user participant on sending side of the internal message conversation.
   **/
  public InternalMessageMediaParticipant sourceUser(AddressableEntityRef sourceUser) {
    this.sourceUser = sourceUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user participant on sending side of the internal message conversation.")
  @JsonProperty("sourceUser")
  public AddressableEntityRef getSourceUser() {
    return sourceUser;
  }
  public void setSourceUser(AddressableEntityRef sourceUser) {
    this.sourceUser = sourceUser;
  }


  /**
   * Address for the participant on receiving side of the internal message communication.
   **/
  public InternalMessageMediaParticipant toAddress(Address toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address for the participant on receiving side of the internal message communication.")
  @JsonProperty("toAddress")
  public Address getToAddress() {
    return toAddress;
  }
  public void setToAddress(Address toAddress) {
    this.toAddress = toAddress;
  }


  /**
   * Address for the participant on the sending side of the internal message communication.
   **/
  public InternalMessageMediaParticipant fromAddress(Address fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address for the participant on the sending side of the internal message communication.")
  @JsonProperty("fromAddress")
  public Address getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(Address fromAddress) {
    this.fromAddress = fromAddress;
  }


  /**
   * Message instance details on the communication.
   **/
  public InternalMessageMediaParticipant messages(List<InternalMessageDetails> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message instance details on the communication.")
  @JsonProperty("messages")
  public List<InternalMessageDetails> getMessages() {
    return messages;
  }
  public void setMessages(List<InternalMessageDetails> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalMessageMediaParticipant internalMessageMediaParticipant = (InternalMessageMediaParticipant) o;

    return Objects.equals(this.id, internalMessageMediaParticipant.id) &&
            Objects.equals(this.name, internalMessageMediaParticipant.name) &&
            Objects.equals(this.address, internalMessageMediaParticipant.address) &&
            Objects.equals(this.startTime, internalMessageMediaParticipant.startTime) &&
            Objects.equals(this.startAlertingTime, internalMessageMediaParticipant.startAlertingTime) &&
            Objects.equals(this.connectedTime, internalMessageMediaParticipant.connectedTime) &&
            Objects.equals(this.endTime, internalMessageMediaParticipant.endTime) &&
            Objects.equals(this.startHoldTime, internalMessageMediaParticipant.startHoldTime) &&
            Objects.equals(this.purpose, internalMessageMediaParticipant.purpose) &&
            Objects.equals(this.state, internalMessageMediaParticipant.state) &&
            Objects.equals(this.direction, internalMessageMediaParticipant.direction) &&
            Objects.equals(this.disconnectType, internalMessageMediaParticipant.disconnectType) &&
            Objects.equals(this.held, internalMessageMediaParticipant.held) &&
            Objects.equals(this.wrapupRequired, internalMessageMediaParticipant.wrapupRequired) &&
            Objects.equals(this.wrapupPrompt, internalMessageMediaParticipant.wrapupPrompt) &&
            Objects.equals(this.mediaRoles, internalMessageMediaParticipant.mediaRoles) &&
            Objects.equals(this.user, internalMessageMediaParticipant.user) &&
            Objects.equals(this.queue, internalMessageMediaParticipant.queue) &&
            Objects.equals(this.team, internalMessageMediaParticipant.team) &&
            Objects.equals(this.attributes, internalMessageMediaParticipant.attributes) &&
            Objects.equals(this.errorInfo, internalMessageMediaParticipant.errorInfo) &&
            Objects.equals(this.script, internalMessageMediaParticipant.script) &&
            Objects.equals(this.wrapupTimeoutMs, internalMessageMediaParticipant.wrapupTimeoutMs) &&
            Objects.equals(this.wrapupSkipped, internalMessageMediaParticipant.wrapupSkipped) &&
            Objects.equals(this.alertingTimeoutMs, internalMessageMediaParticipant.alertingTimeoutMs) &&
            Objects.equals(this.provider, internalMessageMediaParticipant.provider) &&
            Objects.equals(this.externalContact, internalMessageMediaParticipant.externalContact) &&
            Objects.equals(this.externalContactInitialDivisionId, internalMessageMediaParticipant.externalContactInitialDivisionId) &&
            Objects.equals(this.externalOrganization, internalMessageMediaParticipant.externalOrganization) &&
            Objects.equals(this.wrapup, internalMessageMediaParticipant.wrapup) &&
            Objects.equals(this.peer, internalMessageMediaParticipant.peer) &&
            Objects.equals(this.flaggedReason, internalMessageMediaParticipant.flaggedReason) &&
            Objects.equals(this.journeyContext, internalMessageMediaParticipant.journeyContext) &&
            Objects.equals(this.conversationRoutingData, internalMessageMediaParticipant.conversationRoutingData) &&
            Objects.equals(this.startAcwTime, internalMessageMediaParticipant.startAcwTime) &&
            Objects.equals(this.endAcwTime, internalMessageMediaParticipant.endAcwTime) &&
            Objects.equals(this.parkTime, internalMessageMediaParticipant.parkTime) &&
            Objects.equals(this.resumeTime, internalMessageMediaParticipant.resumeTime) &&
            Objects.equals(this.internalMessageId, internalMessageMediaParticipant.internalMessageId) &&
            Objects.equals(this.targetUser, internalMessageMediaParticipant.targetUser) &&
            Objects.equals(this.sourceUser, internalMessageMediaParticipant.sourceUser) &&
            Objects.equals(this.toAddress, internalMessageMediaParticipant.toAddress) &&
            Objects.equals(this.fromAddress, internalMessageMediaParticipant.fromAddress) &&
            Objects.equals(this.messages, internalMessageMediaParticipant.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, startAlertingTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, mediaRoles, user, queue, team, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalContactInitialDivisionId, externalOrganization, wrapup, peer, flaggedReason, journeyContext, conversationRoutingData, startAcwTime, endAcwTime, parkTime, resumeTime, internalMessageId, targetUser, sourceUser, toAddress, fromAddress, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalMessageMediaParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startAlertingTime: ").append(toIndentedString(startAlertingTime)).append("\n");
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
    sb.append("    mediaRoles: ").append(toIndentedString(mediaRoles)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    alertingTimeoutMs: ").append(toIndentedString(alertingTimeoutMs)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalContactInitialDivisionId: ").append(toIndentedString(externalContactInitialDivisionId)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    conversationRoutingData: ").append(toIndentedString(conversationRoutingData)).append("\n");
    sb.append("    startAcwTime: ").append(toIndentedString(startAcwTime)).append("\n");
    sb.append("    endAcwTime: ").append(toIndentedString(endAcwTime)).append("\n");
    sb.append("    parkTime: ").append(toIndentedString(parkTime)).append("\n");
    sb.append("    resumeTime: ").append(toIndentedString(resumeTime)).append("\n");
    sb.append("    internalMessageId: ").append(toIndentedString(internalMessageId)).append("\n");
    sb.append("    targetUser: ").append(toIndentedString(targetUser)).append("\n");
    sb.append("    sourceUser: ").append(toIndentedString(sourceUser)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

