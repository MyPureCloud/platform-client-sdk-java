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
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicAddress;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicDisconnectReason;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicFaxStatus;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicCall
 */

public class QueueConversationSocialExpressionEventTopicCall  implements Serializable {
  
  private String id = null;

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
   * The connection state of this communication.
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
    UPLOADING("uploading"),
    CONVERTING("converting"),
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
   * State of recording on this call.
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
  private Boolean muted = null;
  private Boolean confined = null;
  private Boolean held = null;
  private QueueConversationSocialExpressionEventTopicErrorDetails errorInfo = null;

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
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    CLIENT("client"),
    SYSTEM("system"),
    TIMEOUT("timeout"),
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
  private Date startHoldTime = null;

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
   * Whether a call is inbound or outbound.
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OUTBOUND("outbound"),
    INBOUND("inbound");

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
  private String documentId = null;
  private QueueConversationSocialExpressionEventTopicAddress self = null;
  private QueueConversationSocialExpressionEventTopicAddress other = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private List<QueueConversationSocialExpressionEventTopicDisconnectReason> disconnectReasons = new ArrayList<QueueConversationSocialExpressionEventTopicDisconnectReason>();
  private QueueConversationSocialExpressionEventTopicFaxStatus faxStatus = null;
  private String uuiData = null;
  private Date bargedTime = null;
  private QueueConversationSocialExpressionEventTopicWrapup wrapup = null;
  private QueueConversationSocialExpressionEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String agentAssistantId = null;

  
  /**
   * A globally unique identifier for this communication.
   **/
  public QueueConversationSocialExpressionEventTopicCall id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for this communication.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The connection state of this communication.
   **/
  public QueueConversationSocialExpressionEventTopicCall state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The connection state of this communication.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * True if this call is being recorded.
   **/
  public QueueConversationSocialExpressionEventTopicCall recording(Boolean recording) {
    this.recording = recording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this call is being recorded.")
  @JsonProperty("recording")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
  }

  
  /**
   * State of recording on this call.
   **/
  public QueueConversationSocialExpressionEventTopicCall recordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State of recording on this call.")
  @JsonProperty("recordingState")
  public RecordingStateEnum getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
  }

  
  /**
   * True if this call is muted so that remote participants can't hear any audio from this end.
   **/
  public QueueConversationSocialExpressionEventTopicCall muted(Boolean muted) {
    this.muted = muted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this call is muted so that remote participants can't hear any audio from this end.")
  @JsonProperty("muted")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  
  /**
   * True if this call is held and the person on this side hears hold music.
   **/
  public QueueConversationSocialExpressionEventTopicCall confined(Boolean confined) {
    this.confined = confined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this call is held and the person on this side hears hold music.")
  @JsonProperty("confined")
  public Boolean getConfined() {
    return confined;
  }
  public void setConfined(Boolean confined) {
    this.confined = confined;
  }

  
  /**
   * True if this call is held and the person on this side hears silence.
   **/
  public QueueConversationSocialExpressionEventTopicCall held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this call is held and the person on this side hears silence.")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicCall errorInfo(QueueConversationSocialExpressionEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public QueueConversationSocialExpressionEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationSocialExpressionEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public QueueConversationSocialExpressionEventTopicCall disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   * The timestamp the call was placed on hold in the cloud clock if the call is currently on hold.
   **/
  public QueueConversationSocialExpressionEventTopicCall startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the call was placed on hold in the cloud clock if the call is currently on hold.")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   * Whether a call is inbound or outbound.
   **/
  public QueueConversationSocialExpressionEventTopicCall direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether a call is inbound or outbound.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * If call is a fax of a document in content management, the id of the document in content management.
   **/
  public QueueConversationSocialExpressionEventTopicCall documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If call is a fax of a document in content management, the id of the document in content management.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicCall self(QueueConversationSocialExpressionEventTopicAddress self) {
    this.self = self;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("self")
  public QueueConversationSocialExpressionEventTopicAddress getSelf() {
    return self;
  }
  public void setSelf(QueueConversationSocialExpressionEventTopicAddress self) {
    this.self = self;
  }

  
  /**
   * Address and name data for a call endpoint.
   **/
  public QueueConversationSocialExpressionEventTopicCall other(QueueConversationSocialExpressionEventTopicAddress other) {
    this.other = other;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("other")
  public QueueConversationSocialExpressionEventTopicAddress getOther() {
    return other;
  }
  public void setOther(QueueConversationSocialExpressionEventTopicAddress other) {
    this.other = other;
  }

  
  /**
   * The source provider of the call.
   **/
  public QueueConversationSocialExpressionEventTopicCall provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider of the call.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * The UUID of the script to use.
   **/
  public QueueConversationSocialExpressionEventTopicCall scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UUID of the script to use.")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   * The id of the peer communication corresponding to a matching leg for this communication.
   **/
  public QueueConversationSocialExpressionEventTopicCall peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the peer communication corresponding to a matching leg for this communication.")
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  
  /**
   * The timestamp when this communication was connected in the cloud clock.
   **/
  public QueueConversationSocialExpressionEventTopicCall connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication was connected in the cloud clock.")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   * The timestamp when this communication disconnected from the conversation in the provider clock.
   **/
  public QueueConversationSocialExpressionEventTopicCall disconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication disconnected from the conversation in the provider clock.")
  @JsonProperty("disconnectedTime")
  public Date getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }

  
  /**
   * List of reasons that this call was disconnected. This will be set once the call disconnects.
   **/
  public QueueConversationSocialExpressionEventTopicCall disconnectReasons(List<QueueConversationSocialExpressionEventTopicDisconnectReason> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of reasons that this call was disconnected. This will be set once the call disconnects.")
  @JsonProperty("disconnectReasons")
  public List<QueueConversationSocialExpressionEventTopicDisconnectReason> getDisconnectReasons() {
    return disconnectReasons;
  }
  public void setDisconnectReasons(List<QueueConversationSocialExpressionEventTopicDisconnectReason> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicCall faxStatus(QueueConversationSocialExpressionEventTopicFaxStatus faxStatus) {
    this.faxStatus = faxStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxStatus")
  public QueueConversationSocialExpressionEventTopicFaxStatus getFaxStatus() {
    return faxStatus;
  }
  public void setFaxStatus(QueueConversationSocialExpressionEventTopicFaxStatus faxStatus) {
    this.faxStatus = faxStatus;
  }

  
  /**
   * User to User Information (UUI) data managed by SIP session application.
   **/
  public QueueConversationSocialExpressionEventTopicCall uuiData(String uuiData) {
    this.uuiData = uuiData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User to User Information (UUI) data managed by SIP session application.")
  @JsonProperty("uuiData")
  public String getUuiData() {
    return uuiData;
  }
  public void setUuiData(String uuiData) {
    this.uuiData = uuiData;
  }

  
  /**
   * The timestamp when this participant was connected to the barge conference in the provider clock.
   **/
  public QueueConversationSocialExpressionEventTopicCall bargedTime(Date bargedTime) {
    this.bargedTime = bargedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant was connected to the barge conference in the provider clock.")
  @JsonProperty("bargedTime")
  public Date getBargedTime() {
    return bargedTime;
  }
  public void setBargedTime(Date bargedTime) {
    this.bargedTime = bargedTime;
  }

  
  /**
   * Call wrap up or disposition data.
   **/
  public QueueConversationSocialExpressionEventTopicCall wrapup(QueueConversationSocialExpressionEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Call wrap up or disposition data.")
  @JsonProperty("wrapup")
  public QueueConversationSocialExpressionEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationSocialExpressionEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicCall afterCallWork(QueueConversationSocialExpressionEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("afterCallWork")
  public QueueConversationSocialExpressionEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(QueueConversationSocialExpressionEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   * Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested.
   **/
  public QueueConversationSocialExpressionEventTopicCall afterCallWorkRequired(Boolean afterCallWorkRequired) {
    this.afterCallWorkRequired = afterCallWorkRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested.")
  @JsonProperty("afterCallWorkRequired")
  public Boolean getAfterCallWorkRequired() {
    return afterCallWorkRequired;
  }
  public void setAfterCallWorkRequired(Boolean afterCallWorkRequired) {
    this.afterCallWorkRequired = afterCallWorkRequired;
  }

  
  /**
   * UUID of virtual agent assistant that provide suggestions to the agent participant during the conversation.
   **/
  public QueueConversationSocialExpressionEventTopicCall agentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UUID of virtual agent assistant that provide suggestions to the agent participant during the conversation.")
  @JsonProperty("agentAssistantId")
  public String getAgentAssistantId() {
    return agentAssistantId;
  }
  public void setAgentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicCall queueConversationSocialExpressionEventTopicCall = (QueueConversationSocialExpressionEventTopicCall) o;
    return Objects.equals(this.id, queueConversationSocialExpressionEventTopicCall.id) &&
        Objects.equals(this.state, queueConversationSocialExpressionEventTopicCall.state) &&
        Objects.equals(this.recording, queueConversationSocialExpressionEventTopicCall.recording) &&
        Objects.equals(this.recordingState, queueConversationSocialExpressionEventTopicCall.recordingState) &&
        Objects.equals(this.muted, queueConversationSocialExpressionEventTopicCall.muted) &&
        Objects.equals(this.confined, queueConversationSocialExpressionEventTopicCall.confined) &&
        Objects.equals(this.held, queueConversationSocialExpressionEventTopicCall.held) &&
        Objects.equals(this.errorInfo, queueConversationSocialExpressionEventTopicCall.errorInfo) &&
        Objects.equals(this.disconnectType, queueConversationSocialExpressionEventTopicCall.disconnectType) &&
        Objects.equals(this.startHoldTime, queueConversationSocialExpressionEventTopicCall.startHoldTime) &&
        Objects.equals(this.direction, queueConversationSocialExpressionEventTopicCall.direction) &&
        Objects.equals(this.documentId, queueConversationSocialExpressionEventTopicCall.documentId) &&
        Objects.equals(this.self, queueConversationSocialExpressionEventTopicCall.self) &&
        Objects.equals(this.other, queueConversationSocialExpressionEventTopicCall.other) &&
        Objects.equals(this.provider, queueConversationSocialExpressionEventTopicCall.provider) &&
        Objects.equals(this.scriptId, queueConversationSocialExpressionEventTopicCall.scriptId) &&
        Objects.equals(this.peerId, queueConversationSocialExpressionEventTopicCall.peerId) &&
        Objects.equals(this.connectedTime, queueConversationSocialExpressionEventTopicCall.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationSocialExpressionEventTopicCall.disconnectedTime) &&
        Objects.equals(this.disconnectReasons, queueConversationSocialExpressionEventTopicCall.disconnectReasons) &&
        Objects.equals(this.faxStatus, queueConversationSocialExpressionEventTopicCall.faxStatus) &&
        Objects.equals(this.uuiData, queueConversationSocialExpressionEventTopicCall.uuiData) &&
        Objects.equals(this.bargedTime, queueConversationSocialExpressionEventTopicCall.bargedTime) &&
        Objects.equals(this.wrapup, queueConversationSocialExpressionEventTopicCall.wrapup) &&
        Objects.equals(this.afterCallWork, queueConversationSocialExpressionEventTopicCall.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, queueConversationSocialExpressionEventTopicCall.afterCallWorkRequired) &&
        Objects.equals(this.agentAssistantId, queueConversationSocialExpressionEventTopicCall.agentAssistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, recording, recordingState, muted, confined, held, errorInfo, disconnectType, startHoldTime, direction, documentId, self, other, provider, scriptId, peerId, connectedTime, disconnectedTime, disconnectReasons, faxStatus, uuiData, bargedTime, wrapup, afterCallWork, afterCallWorkRequired, agentAssistantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicCall {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    disconnectReasons: ").append(toIndentedString(disconnectReasons)).append("\n");
    sb.append("    faxStatus: ").append(toIndentedString(faxStatus)).append("\n");
    sb.append("    uuiData: ").append(toIndentedString(uuiData)).append("\n");
    sb.append("    bargedTime: ").append(toIndentedString(bargedTime)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
    sb.append("    agentAssistantId: ").append(toIndentedString(agentAssistantId)).append("\n");
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

