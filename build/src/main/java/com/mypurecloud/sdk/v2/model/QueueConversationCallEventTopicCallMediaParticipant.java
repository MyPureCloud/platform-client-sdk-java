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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicErrorBody;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicFaxStatus;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicUriReference;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicCallMediaParticipant
 */

public class QueueConversationCallEventTopicCallMediaParticipant  implements Serializable {
  
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
  private QueueConversationCallEventTopicUriReference user = null;
  private QueueConversationCallEventTopicUriReference queue = null;
  private QueueConversationCallEventTopicUriReference team = null;
  private Map<String, String> attributes = null;
  private QueueConversationCallEventTopicErrorBody errorInfo = null;
  private QueueConversationCallEventTopicUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Integer alertingTimeoutMs = null;
  private String provider = null;
  private QueueConversationCallEventTopicUriReference externalContact = null;
  private QueueConversationCallEventTopicUriReference externalOrganization = null;
  private QueueConversationCallEventTopicWrapup wrapup = null;
  private QueueConversationCallEventTopicConversationRoutingData conversationRoutingData = null;
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
  private QueueConversationCallEventTopicJourneyContext journeyContext = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private Boolean muted = null;
  private Boolean confined = null;
  private Boolean recording = null;

  private static class RecordingStateEnumDeserializer extends StdDeserializer<RecordingStateEnum> {
    public RecordingStateEnumDeserializer() {
      super(RecordingStateEnumDeserializer.class);
    }

    @Override
    public RecordingStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RecordingStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets recordingState
   */
 @JsonDeserialize(using = RecordingStateEnumDeserializer.class)
  public enum RecordingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("none"),
    ACTIVE("active"),
    PAUSED("paused");

    private String value;

    RecordingStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RecordingStateEnum fromString(String key) {
      if (key == null) return null;

      for (RecordingStateEnum value : RecordingStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RecordingStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RecordingStateEnum recordingState = null;
  private QueueConversationCallEventTopicUriReference group = null;
  private String ani = null;
  private String dnis = null;
  private String documentId = null;
  private String monitoredParticipantId = null;
  private String coachedParticipantId = null;
  private String consultParticipantId = null;
  private QueueConversationCallEventTopicFaxStatus faxStatus = null;

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant id(String id) {
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
  public QueueConversationCallEventTopicCallMediaParticipant name(String name) {
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
  public QueueConversationCallEventTopicCallMediaParticipant address(String address) {
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
  public QueueConversationCallEventTopicCallMediaParticipant startTime(Date startTime) {
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
  public QueueConversationCallEventTopicCallMediaParticipant connectedTime(Date connectedTime) {
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
  public QueueConversationCallEventTopicCallMediaParticipant endTime(Date endTime) {
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
  public QueueConversationCallEventTopicCallMediaParticipant startHoldTime(Date startHoldTime) {
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
  public QueueConversationCallEventTopicCallMediaParticipant purpose(String purpose) {
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
  public QueueConversationCallEventTopicCallMediaParticipant state(StateEnum state) {
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
  public QueueConversationCallEventTopicCallMediaParticipant direction(DirectionEnum direction) {
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
  public QueueConversationCallEventTopicCallMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationCallEventTopicCallMediaParticipant held(Boolean held) {
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
  public QueueConversationCallEventTopicCallMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public QueueConversationCallEventTopicCallMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
  public QueueConversationCallEventTopicCallMediaParticipant user(QueueConversationCallEventTopicUriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public QueueConversationCallEventTopicUriReference getUser() {
    return user;
  }
  public void setUser(QueueConversationCallEventTopicUriReference user) {
    this.user = user;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant queue(QueueConversationCallEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationCallEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationCallEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant team(QueueConversationCallEventTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public QueueConversationCallEventTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(QueueConversationCallEventTopicUriReference team) {
    this.team = team;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant attributes(Map<String, String> attributes) {
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
  public QueueConversationCallEventTopicCallMediaParticipant errorInfo(QueueConversationCallEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public QueueConversationCallEventTopicErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationCallEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant script(QueueConversationCallEventTopicUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public QueueConversationCallEventTopicUriReference getScript() {
    return script;
  }
  public void setScript(QueueConversationCallEventTopicUriReference script) {
    this.script = script;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public QueueConversationCallEventTopicCallMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
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
  public QueueConversationCallEventTopicCallMediaParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
  public QueueConversationCallEventTopicCallMediaParticipant provider(String provider) {
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
  public QueueConversationCallEventTopicCallMediaParticipant externalContact(QueueConversationCallEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public QueueConversationCallEventTopicUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(QueueConversationCallEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant externalOrganization(QueueConversationCallEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public QueueConversationCallEventTopicUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(QueueConversationCallEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant wrapup(QueueConversationCallEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationCallEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationCallEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant conversationRoutingData(QueueConversationCallEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public QueueConversationCallEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(QueueConversationCallEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant peer(String peer) {
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
  public QueueConversationCallEventTopicCallMediaParticipant screenRecordingState(String screenRecordingState) {
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
  public QueueConversationCallEventTopicCallMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
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
  public QueueConversationCallEventTopicCallMediaParticipant journeyContext(QueueConversationCallEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public QueueConversationCallEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(QueueConversationCallEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant startAcwTime(Date startAcwTime) {
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
  public QueueConversationCallEventTopicCallMediaParticipant endAcwTime(Date endAcwTime) {
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
  public QueueConversationCallEventTopicCallMediaParticipant muted(Boolean muted) {
    this.muted = muted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("muted")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant confined(Boolean confined) {
    this.confined = confined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("confined")
  public Boolean getConfined() {
    return confined;
  }
  public void setConfined(Boolean confined) {
    this.confined = confined;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant recording(Boolean recording) {
    this.recording = recording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recording")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant recordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordingState")
  public RecordingStateEnum getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant group(QueueConversationCallEventTopicUriReference group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public QueueConversationCallEventTopicUriReference getGroup() {
    return group;
  }
  public void setGroup(QueueConversationCallEventTopicUriReference group) {
    this.group = group;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicCallMediaParticipant monitoredParticipantId(String monitoredParticipantId) {
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
  public QueueConversationCallEventTopicCallMediaParticipant coachedParticipantId(String coachedParticipantId) {
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
  public QueueConversationCallEventTopicCallMediaParticipant consultParticipantId(String consultParticipantId) {
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
  public QueueConversationCallEventTopicCallMediaParticipant faxStatus(QueueConversationCallEventTopicFaxStatus faxStatus) {
    this.faxStatus = faxStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxStatus")
  public QueueConversationCallEventTopicFaxStatus getFaxStatus() {
    return faxStatus;
  }
  public void setFaxStatus(QueueConversationCallEventTopicFaxStatus faxStatus) {
    this.faxStatus = faxStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallEventTopicCallMediaParticipant queueConversationCallEventTopicCallMediaParticipant = (QueueConversationCallEventTopicCallMediaParticipant) o;
    return Objects.equals(this.id, queueConversationCallEventTopicCallMediaParticipant.id) &&
        Objects.equals(this.name, queueConversationCallEventTopicCallMediaParticipant.name) &&
        Objects.equals(this.address, queueConversationCallEventTopicCallMediaParticipant.address) &&
        Objects.equals(this.startTime, queueConversationCallEventTopicCallMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, queueConversationCallEventTopicCallMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, queueConversationCallEventTopicCallMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, queueConversationCallEventTopicCallMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, queueConversationCallEventTopicCallMediaParticipant.purpose) &&
        Objects.equals(this.state, queueConversationCallEventTopicCallMediaParticipant.state) &&
        Objects.equals(this.direction, queueConversationCallEventTopicCallMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, queueConversationCallEventTopicCallMediaParticipant.disconnectType) &&
        Objects.equals(this.held, queueConversationCallEventTopicCallMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, queueConversationCallEventTopicCallMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, queueConversationCallEventTopicCallMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, queueConversationCallEventTopicCallMediaParticipant.user) &&
        Objects.equals(this.queue, queueConversationCallEventTopicCallMediaParticipant.queue) &&
        Objects.equals(this.team, queueConversationCallEventTopicCallMediaParticipant.team) &&
        Objects.equals(this.attributes, queueConversationCallEventTopicCallMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, queueConversationCallEventTopicCallMediaParticipant.errorInfo) &&
        Objects.equals(this.script, queueConversationCallEventTopicCallMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, queueConversationCallEventTopicCallMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, queueConversationCallEventTopicCallMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.alertingTimeoutMs, queueConversationCallEventTopicCallMediaParticipant.alertingTimeoutMs) &&
        Objects.equals(this.provider, queueConversationCallEventTopicCallMediaParticipant.provider) &&
        Objects.equals(this.externalContact, queueConversationCallEventTopicCallMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, queueConversationCallEventTopicCallMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, queueConversationCallEventTopicCallMediaParticipant.wrapup) &&
        Objects.equals(this.conversationRoutingData, queueConversationCallEventTopicCallMediaParticipant.conversationRoutingData) &&
        Objects.equals(this.peer, queueConversationCallEventTopicCallMediaParticipant.peer) &&
        Objects.equals(this.screenRecordingState, queueConversationCallEventTopicCallMediaParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, queueConversationCallEventTopicCallMediaParticipant.flaggedReason) &&
        Objects.equals(this.journeyContext, queueConversationCallEventTopicCallMediaParticipant.journeyContext) &&
        Objects.equals(this.startAcwTime, queueConversationCallEventTopicCallMediaParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, queueConversationCallEventTopicCallMediaParticipant.endAcwTime) &&
        Objects.equals(this.muted, queueConversationCallEventTopicCallMediaParticipant.muted) &&
        Objects.equals(this.confined, queueConversationCallEventTopicCallMediaParticipant.confined) &&
        Objects.equals(this.recording, queueConversationCallEventTopicCallMediaParticipant.recording) &&
        Objects.equals(this.recordingState, queueConversationCallEventTopicCallMediaParticipant.recordingState) &&
        Objects.equals(this.group, queueConversationCallEventTopicCallMediaParticipant.group) &&
        Objects.equals(this.ani, queueConversationCallEventTopicCallMediaParticipant.ani) &&
        Objects.equals(this.dnis, queueConversationCallEventTopicCallMediaParticipant.dnis) &&
        Objects.equals(this.documentId, queueConversationCallEventTopicCallMediaParticipant.documentId) &&
        Objects.equals(this.monitoredParticipantId, queueConversationCallEventTopicCallMediaParticipant.monitoredParticipantId) &&
        Objects.equals(this.coachedParticipantId, queueConversationCallEventTopicCallMediaParticipant.coachedParticipantId) &&
        Objects.equals(this.consultParticipantId, queueConversationCallEventTopicCallMediaParticipant.consultParticipantId) &&
        Objects.equals(this.faxStatus, queueConversationCallEventTopicCallMediaParticipant.faxStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, team, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalOrganization, wrapup, conversationRoutingData, peer, screenRecordingState, flaggedReason, journeyContext, startAcwTime, endAcwTime, muted, confined, recording, recordingState, group, ani, dnis, documentId, monitoredParticipantId, coachedParticipantId, consultParticipantId, faxStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicCallMediaParticipant {\n");
    
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
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    alertingTimeoutMs: ").append(toIndentedString(alertingTimeoutMs)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    conversationRoutingData: ").append(toIndentedString(conversationRoutingData)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    screenRecordingState: ").append(toIndentedString(screenRecordingState)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    startAcwTime: ").append(toIndentedString(startAcwTime)).append("\n");
    sb.append("    endAcwTime: ").append(toIndentedString(endAcwTime)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    coachedParticipantId: ").append(toIndentedString(coachedParticipantId)).append("\n");
    sb.append("    consultParticipantId: ").append(toIndentedString(consultParticipantId)).append("\n");
    sb.append("    faxStatus: ").append(toIndentedString(faxStatus)).append("\n");
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

