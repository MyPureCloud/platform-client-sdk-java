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
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicErrorBody;
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicQueueMediaSettings;
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicUriReference;
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationCobrowseEventTopicCobrowseMediaParticipant
 */

public class QueueConversationCobrowseEventTopicCobrowseMediaParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
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
   * Gets or Sets state
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
    SCHEDULED("scheduled"),
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

  private static class InitialStateEnumDeserializer extends StdDeserializer<InitialStateEnum> {
    public InitialStateEnumDeserializer() {
      super(InitialStateEnumDeserializer.class);
    }

    @Override
    public InitialStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InitialStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets initialState
   */
 @JsonDeserialize(using = InitialStateEnumDeserializer.class)
  public enum InitialStateEnum {
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
    PARKED("parked"),
    NONE("none");

    private String value;

    InitialStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InitialStateEnum fromString(String key) {
      if (key == null) return null;

      for (InitialStateEnum value : InitialStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InitialStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InitialStateEnum initialState = null;

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
   * Gets or Sets direction
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
   * Gets or Sets disconnectType
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    ENDPOINT_DND("endpoint.dnd"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TIMEOUT("timeout"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSFER_DND("transfer.dnd"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam"),
    UNCALLABLE("uncallable"),
    INACTIVITY("inactivity");

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
  private QueueConversationCobrowseEventTopicUriReference user = null;
  private QueueConversationCobrowseEventTopicUriReference queue = null;
  private QueueConversationCobrowseEventTopicUriReference team = null;
  private Map<String, String> attributes = null;
  private QueueConversationCobrowseEventTopicErrorBody errorInfo = null;
  private QueueConversationCobrowseEventTopicUriReference script = null;
  private Long wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Long alertingTimeoutMs = null;
  private String provider = null;
  private QueueConversationCobrowseEventTopicUriReference externalContact = null;
  private String externalContactInitialDivisionId = null;
  private QueueConversationCobrowseEventTopicUriReference externalOrganization = null;
  private QueueConversationCobrowseEventTopicWrapup wrapup = null;
  private QueueConversationCobrowseEventTopicConversationRoutingData conversationRoutingData = null;
  private String peer = null;
  private String screenRecordingState = null;

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
   * Gets or Sets flaggedReason
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
  private QueueConversationCobrowseEventTopicJourneyContext journeyContext = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private Date resumeTime = null;
  private Date parkTime = null;
  private List<String> mediaRoles = null;
  private QueueConversationCobrowseEventTopicQueueMediaSettings queueMediaSettings = null;
  private String cobrowseSessionId = null;
  private String cobrowseRole = null;
  private String viewerUrl = null;
  private Date providerEventTime = null;
  private List<String> controlling = null;

  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mediaRoles = new ArrayList<String>();
      controlling = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant id(String id) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant name(String name) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant address(String address) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant startTime(Date startTime) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant connectedTime(Date connectedTime) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant endTime(Date endTime) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant startHoldTime(Date startHoldTime) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant purpose(String purpose) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant state(StateEnum state) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant initialState(InitialStateEnum initialState) {
    this.initialState = initialState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initialState")
  public InitialStateEnum getInitialState() {
    return initialState;
  }
  public void setInitialState(InitialStateEnum initialState) {
    this.initialState = initialState;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant direction(DirectionEnum direction) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant held(Boolean held) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant user(QueueConversationCobrowseEventTopicUriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public QueueConversationCobrowseEventTopicUriReference getUser() {
    return user;
  }
  public void setUser(QueueConversationCobrowseEventTopicUriReference user) {
    this.user = user;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant queue(QueueConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationCobrowseEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant team(QueueConversationCobrowseEventTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public QueueConversationCobrowseEventTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(QueueConversationCobrowseEventTopicUriReference team) {
    this.team = team;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant attributes(Map<String, String> attributes) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant errorInfo(QueueConversationCobrowseEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public QueueConversationCobrowseEventTopicErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationCobrowseEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant script(QueueConversationCobrowseEventTopicUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public QueueConversationCobrowseEventTopicUriReference getScript() {
    return script;
  }
  public void setScript(QueueConversationCobrowseEventTopicUriReference script) {
    this.script = script;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant wrapupTimeoutMs(Long wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupTimeoutMs")
  public Long getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Long wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant alertingTimeoutMs(Long alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertingTimeoutMs")
  public Long getAlertingTimeoutMs() {
    return alertingTimeoutMs;
  }
  public void setAlertingTimeoutMs(Long alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant provider(String provider) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant externalContact(QueueConversationCobrowseEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public QueueConversationCobrowseEventTopicUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(QueueConversationCobrowseEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant externalContactInitialDivisionId(String externalContactInitialDivisionId) {
    this.externalContactInitialDivisionId = externalContactInitialDivisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactInitialDivisionId")
  public String getExternalContactInitialDivisionId() {
    return externalContactInitialDivisionId;
  }
  public void setExternalContactInitialDivisionId(String externalContactInitialDivisionId) {
    this.externalContactInitialDivisionId = externalContactInitialDivisionId;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant externalOrganization(QueueConversationCobrowseEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public QueueConversationCobrowseEventTopicUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(QueueConversationCobrowseEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant wrapup(QueueConversationCobrowseEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationCobrowseEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationCobrowseEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant conversationRoutingData(QueueConversationCobrowseEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public QueueConversationCobrowseEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(QueueConversationCobrowseEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant peer(String peer) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant screenRecordingState(String screenRecordingState) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flaggedReason")
  public FlaggedReasonEnum getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant journeyContext(QueueConversationCobrowseEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public QueueConversationCobrowseEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(QueueConversationCobrowseEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant startAcwTime(Date startAcwTime) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant endAcwTime(Date endAcwTime) {
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
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant resumeTime(Date resumeTime) {
    this.resumeTime = resumeTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resumeTime")
  public Date getResumeTime() {
    return resumeTime;
  }
  public void setResumeTime(Date resumeTime) {
    this.resumeTime = resumeTime;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant parkTime(Date parkTime) {
    this.parkTime = parkTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parkTime")
  public Date getParkTime() {
    return parkTime;
  }
  public void setParkTime(Date parkTime) {
    this.parkTime = parkTime;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant mediaRoles(List<String> mediaRoles) {
    this.mediaRoles = mediaRoles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaRoles")
  public List<String> getMediaRoles() {
    return mediaRoles;
  }
  public void setMediaRoles(List<String> mediaRoles) {
    this.mediaRoles = mediaRoles;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant queueMediaSettings(QueueConversationCobrowseEventTopicQueueMediaSettings queueMediaSettings) {
    this.queueMediaSettings = queueMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueMediaSettings")
  public QueueConversationCobrowseEventTopicQueueMediaSettings getQueueMediaSettings() {
    return queueMediaSettings;
  }
  public void setQueueMediaSettings(QueueConversationCobrowseEventTopicQueueMediaSettings queueMediaSettings) {
    this.queueMediaSettings = queueMediaSettings;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant cobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseSessionId")
  public String getCobrowseSessionId() {
    return cobrowseSessionId;
  }
  public void setCobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant viewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("viewerUrl")
  public String getViewerUrl() {
    return viewerUrl;
  }
  public void setViewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant providerEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providerEventTime")
  public Date getProviderEventTime() {
    return providerEventTime;
  }
  public void setProviderEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicCobrowseMediaParticipant controlling(List<String> controlling) {
    this.controlling = controlling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("controlling")
  public List<String> getControlling() {
    return controlling;
  }
  public void setControlling(List<String> controlling) {
    this.controlling = controlling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCobrowseEventTopicCobrowseMediaParticipant queueConversationCobrowseEventTopicCobrowseMediaParticipant = (QueueConversationCobrowseEventTopicCobrowseMediaParticipant) o;

    return Objects.equals(this.id, queueConversationCobrowseEventTopicCobrowseMediaParticipant.id) &&
            Objects.equals(this.name, queueConversationCobrowseEventTopicCobrowseMediaParticipant.name) &&
            Objects.equals(this.address, queueConversationCobrowseEventTopicCobrowseMediaParticipant.address) &&
            Objects.equals(this.startTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.startTime) &&
            Objects.equals(this.connectedTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.connectedTime) &&
            Objects.equals(this.endTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.endTime) &&
            Objects.equals(this.startHoldTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.startHoldTime) &&
            Objects.equals(this.purpose, queueConversationCobrowseEventTopicCobrowseMediaParticipant.purpose) &&
            Objects.equals(this.state, queueConversationCobrowseEventTopicCobrowseMediaParticipant.state) &&
            Objects.equals(this.initialState, queueConversationCobrowseEventTopicCobrowseMediaParticipant.initialState) &&
            Objects.equals(this.direction, queueConversationCobrowseEventTopicCobrowseMediaParticipant.direction) &&
            Objects.equals(this.disconnectType, queueConversationCobrowseEventTopicCobrowseMediaParticipant.disconnectType) &&
            Objects.equals(this.held, queueConversationCobrowseEventTopicCobrowseMediaParticipant.held) &&
            Objects.equals(this.wrapupRequired, queueConversationCobrowseEventTopicCobrowseMediaParticipant.wrapupRequired) &&
            Objects.equals(this.wrapupPrompt, queueConversationCobrowseEventTopicCobrowseMediaParticipant.wrapupPrompt) &&
            Objects.equals(this.user, queueConversationCobrowseEventTopicCobrowseMediaParticipant.user) &&
            Objects.equals(this.queue, queueConversationCobrowseEventTopicCobrowseMediaParticipant.queue) &&
            Objects.equals(this.team, queueConversationCobrowseEventTopicCobrowseMediaParticipant.team) &&
            Objects.equals(this.attributes, queueConversationCobrowseEventTopicCobrowseMediaParticipant.attributes) &&
            Objects.equals(this.errorInfo, queueConversationCobrowseEventTopicCobrowseMediaParticipant.errorInfo) &&
            Objects.equals(this.script, queueConversationCobrowseEventTopicCobrowseMediaParticipant.script) &&
            Objects.equals(this.wrapupTimeoutMs, queueConversationCobrowseEventTopicCobrowseMediaParticipant.wrapupTimeoutMs) &&
            Objects.equals(this.wrapupSkipped, queueConversationCobrowseEventTopicCobrowseMediaParticipant.wrapupSkipped) &&
            Objects.equals(this.alertingTimeoutMs, queueConversationCobrowseEventTopicCobrowseMediaParticipant.alertingTimeoutMs) &&
            Objects.equals(this.provider, queueConversationCobrowseEventTopicCobrowseMediaParticipant.provider) &&
            Objects.equals(this.externalContact, queueConversationCobrowseEventTopicCobrowseMediaParticipant.externalContact) &&
            Objects.equals(this.externalContactInitialDivisionId, queueConversationCobrowseEventTopicCobrowseMediaParticipant.externalContactInitialDivisionId) &&
            Objects.equals(this.externalOrganization, queueConversationCobrowseEventTopicCobrowseMediaParticipant.externalOrganization) &&
            Objects.equals(this.wrapup, queueConversationCobrowseEventTopicCobrowseMediaParticipant.wrapup) &&
            Objects.equals(this.conversationRoutingData, queueConversationCobrowseEventTopicCobrowseMediaParticipant.conversationRoutingData) &&
            Objects.equals(this.peer, queueConversationCobrowseEventTopicCobrowseMediaParticipant.peer) &&
            Objects.equals(this.screenRecordingState, queueConversationCobrowseEventTopicCobrowseMediaParticipant.screenRecordingState) &&
            Objects.equals(this.flaggedReason, queueConversationCobrowseEventTopicCobrowseMediaParticipant.flaggedReason) &&
            Objects.equals(this.journeyContext, queueConversationCobrowseEventTopicCobrowseMediaParticipant.journeyContext) &&
            Objects.equals(this.startAcwTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.startAcwTime) &&
            Objects.equals(this.endAcwTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.endAcwTime) &&
            Objects.equals(this.resumeTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.resumeTime) &&
            Objects.equals(this.parkTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.parkTime) &&
            Objects.equals(this.mediaRoles, queueConversationCobrowseEventTopicCobrowseMediaParticipant.mediaRoles) &&
            Objects.equals(this.queueMediaSettings, queueConversationCobrowseEventTopicCobrowseMediaParticipant.queueMediaSettings) &&
            Objects.equals(this.cobrowseSessionId, queueConversationCobrowseEventTopicCobrowseMediaParticipant.cobrowseSessionId) &&
            Objects.equals(this.cobrowseRole, queueConversationCobrowseEventTopicCobrowseMediaParticipant.cobrowseRole) &&
            Objects.equals(this.viewerUrl, queueConversationCobrowseEventTopicCobrowseMediaParticipant.viewerUrl) &&
            Objects.equals(this.providerEventTime, queueConversationCobrowseEventTopicCobrowseMediaParticipant.providerEventTime) &&
            Objects.equals(this.controlling, queueConversationCobrowseEventTopicCobrowseMediaParticipant.controlling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, initialState, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, team, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalContactInitialDivisionId, externalOrganization, wrapup, conversationRoutingData, peer, screenRecordingState, flaggedReason, journeyContext, startAcwTime, endAcwTime, resumeTime, parkTime, mediaRoles, queueMediaSettings, cobrowseSessionId, cobrowseRole, viewerUrl, providerEventTime, controlling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCobrowseEventTopicCobrowseMediaParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
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
    sb.append("    conversationRoutingData: ").append(toIndentedString(conversationRoutingData)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    screenRecordingState: ").append(toIndentedString(screenRecordingState)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    startAcwTime: ").append(toIndentedString(startAcwTime)).append("\n");
    sb.append("    endAcwTime: ").append(toIndentedString(endAcwTime)).append("\n");
    sb.append("    resumeTime: ").append(toIndentedString(resumeTime)).append("\n");
    sb.append("    parkTime: ").append(toIndentedString(parkTime)).append("\n");
    sb.append("    mediaRoles: ").append(toIndentedString(mediaRoles)).append("\n");
    sb.append("    queueMediaSettings: ").append(toIndentedString(queueMediaSettings)).append("\n");
    sb.append("    cobrowseSessionId: ").append(toIndentedString(cobrowseSessionId)).append("\n");
    sb.append("    cobrowseRole: ").append(toIndentedString(cobrowseRole)).append("\n");
    sb.append("    viewerUrl: ").append(toIndentedString(viewerUrl)).append("\n");
    sb.append("    providerEventTime: ").append(toIndentedString(providerEventTime)).append("\n");
    sb.append("    controlling: ").append(toIndentedString(controlling)).append("\n");
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

