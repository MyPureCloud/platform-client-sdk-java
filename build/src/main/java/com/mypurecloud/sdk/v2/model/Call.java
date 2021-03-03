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
import com.mypurecloud.sdk.v2.model.Address;
import com.mypurecloud.sdk.v2.model.AfterCallWork;
import com.mypurecloud.sdk.v2.model.DisconnectReason;
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.FaxStatus;
import com.mypurecloud.sdk.v2.model.Segment;
import com.mypurecloud.sdk.v2.model.Wrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Call
 */

public class Call  implements Serializable {
  

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
  private String id = null;

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
   * The direction of the call
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
  private String recordingId = null;
  private List<Segment> segments = new ArrayList<Segment>();
  private ErrorInfo errorInfo = null;

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
  private String documentId = null;
  private Date startAlertingTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private List<DisconnectReason> disconnectReasons = new ArrayList<DisconnectReason>();
  private FaxStatus faxStatus = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;
  private String uuiData = null;
  private Address self = null;
  private Address other = null;
  private Wrapup wrapup = null;
  private AfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String agentAssistantId = null;

  
  /**
   * The connection state of this communication.
   **/
  public Call state(StateEnum state) {
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
   * A globally unique identifier for this communication.
   **/
  public Call id(String id) {
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
   * The direction of the call
   **/
  public Call direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the call")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * True if this call is being recorded.
   **/
  public Call recording(Boolean recording) {
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
  public Call recordingState(RecordingStateEnum recordingState) {
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
  public Call muted(Boolean muted) {
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
  public Call confined(Boolean confined) {
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
  public Call held(Boolean held) {
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
   * A globally unique identifier for the recording associated with this call.
   **/
  public Call recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the recording associated with this call.")
  @JsonProperty("recordingId")
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }

  
  /**
   * The time line of the participant's call, divided into activity segments.
   **/
  public Call segments(List<Segment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time line of the participant's call, divided into activity segments.")
  @JsonProperty("segments")
  public List<Segment> getSegments() {
    return segments;
  }
  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }

  
  /**
   **/
  public Call errorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public ErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public Call disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The timestamp the call was placed on hold in the cloud clock if the call is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Call startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the call was placed on hold in the cloud clock if the call is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   * If call is an outbound fax of a document from content management, then this is the id in content management.
   **/
  public Call documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If call is an outbound fax of a document from content management, then this is the id in content management.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   * The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Call startAlertingTime(Date startAlertingTime) {
    this.startAlertingTime = startAlertingTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startAlertingTime")
  public Date getStartAlertingTime() {
    return startAlertingTime;
  }
  public void setStartAlertingTime(Date startAlertingTime) {
    this.startAlertingTime = startAlertingTime;
  }

  
  /**
   * The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Call connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   * The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Call disconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
  public Call disconnectReasons(List<DisconnectReason> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of reasons that this call was disconnected. This will be set once the call disconnects.")
  @JsonProperty("disconnectReasons")
  public List<DisconnectReason> getDisconnectReasons() {
    return disconnectReasons;
  }
  public void setDisconnectReasons(List<DisconnectReason> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
  }

  
  /**
   * Extra information on fax transmission.
   **/
  public Call faxStatus(FaxStatus faxStatus) {
    this.faxStatus = faxStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Extra information on fax transmission.")
  @JsonProperty("faxStatus")
  public FaxStatus getFaxStatus() {
    return faxStatus;
  }
  public void setFaxStatus(FaxStatus faxStatus) {
    this.faxStatus = faxStatus;
  }

  
  /**
   * The source provider for the call.
   **/
  public Call provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider for the call.")
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
  public Call scriptId(String scriptId) {
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
  public Call peerId(String peerId) {
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
   * User to User Information (UUI) data managed by SIP session application.
   **/
  public Call uuiData(String uuiData) {
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
   * Address and name data for a call endpoint.
   **/
  public Call self(Address self) {
    this.self = self;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("self")
  public Address getSelf() {
    return self;
  }
  public void setSelf(Address self) {
    this.self = self;
  }

  
  /**
   * Address and name data for a call endpoint.
   **/
  public Call other(Address other) {
    this.other = other;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("other")
  public Address getOther() {
    return other;
  }
  public void setOther(Address other) {
    this.other = other;
  }

  
  /**
   * Call wrap up or disposition data.
   **/
  public Call wrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Call wrap up or disposition data.")
  @JsonProperty("wrapup")
  public Wrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * After-call work for the communication.
   **/
  public Call afterCallWork(AfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "After-call work for the communication.")
  @JsonProperty("afterCallWork")
  public AfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(AfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   * Indicates if after-call work is required for a communication. Only used when the ACW Setting is Agent Requested.
   **/
  public Call afterCallWorkRequired(Boolean afterCallWorkRequired) {
    this.afterCallWorkRequired = afterCallWorkRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if after-call work is required for a communication. Only used when the ACW Setting is Agent Requested.")
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
  public Call agentAssistantId(String agentAssistantId) {
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
    Call call = (Call) o;
    return Objects.equals(this.state, call.state) &&
        Objects.equals(this.id, call.id) &&
        Objects.equals(this.direction, call.direction) &&
        Objects.equals(this.recording, call.recording) &&
        Objects.equals(this.recordingState, call.recordingState) &&
        Objects.equals(this.muted, call.muted) &&
        Objects.equals(this.confined, call.confined) &&
        Objects.equals(this.held, call.held) &&
        Objects.equals(this.recordingId, call.recordingId) &&
        Objects.equals(this.segments, call.segments) &&
        Objects.equals(this.errorInfo, call.errorInfo) &&
        Objects.equals(this.disconnectType, call.disconnectType) &&
        Objects.equals(this.startHoldTime, call.startHoldTime) &&
        Objects.equals(this.documentId, call.documentId) &&
        Objects.equals(this.startAlertingTime, call.startAlertingTime) &&
        Objects.equals(this.connectedTime, call.connectedTime) &&
        Objects.equals(this.disconnectedTime, call.disconnectedTime) &&
        Objects.equals(this.disconnectReasons, call.disconnectReasons) &&
        Objects.equals(this.faxStatus, call.faxStatus) &&
        Objects.equals(this.provider, call.provider) &&
        Objects.equals(this.scriptId, call.scriptId) &&
        Objects.equals(this.peerId, call.peerId) &&
        Objects.equals(this.uuiData, call.uuiData) &&
        Objects.equals(this.self, call.self) &&
        Objects.equals(this.other, call.other) &&
        Objects.equals(this.wrapup, call.wrapup) &&
        Objects.equals(this.afterCallWork, call.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, call.afterCallWorkRequired) &&
        Objects.equals(this.agentAssistantId, call.agentAssistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, direction, recording, recordingState, muted, confined, held, recordingId, segments, errorInfo, disconnectType, startHoldTime, documentId, startAlertingTime, connectedTime, disconnectedTime, disconnectReasons, faxStatus, provider, scriptId, peerId, uuiData, self, other, wrapup, afterCallWork, afterCallWorkRequired, agentAssistantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    startAlertingTime: ").append(toIndentedString(startAlertingTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    disconnectReasons: ").append(toIndentedString(disconnectReasons)).append("\n");
    sb.append("    faxStatus: ").append(toIndentedString(faxStatus)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    uuiData: ").append(toIndentedString(uuiData)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

