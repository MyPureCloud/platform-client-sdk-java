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
import com.mypurecloud.sdk.v2.model.ConversationEventTopicAddress;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicDisconnectReason;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicFaxStatus;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationEventTopicCall
 */

public class ConversationEventTopicCall  implements Serializable {
  
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
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("ALERTING"),
    DIALING("DIALING"),
    CONTACTING("CONTACTING"),
    OFFERING("OFFERING"),
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED"),
    TERMINATED("TERMINATED"),
    UPLOADING("UPLOADING"),
    CONVERTING("CONVERTING"),
    TRANSMITTING("TRANSMITTING"),
    NONE("NONE");

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
   * Gets or Sets recordingState
   */
 @JsonDeserialize(using = RecordingStateEnumDeserializer.class)
  public enum RecordingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("NONE"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED");

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
  private ConversationEventTopicErrorDetails errorInfo = null;

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
    ENDPOINT("ENDPOINT"),
    CLIENT("CLIENT"),
    SYSTEM("SYSTEM"),
    TIMEOUT("TIMEOUT"),
    TRANSFER("TRANSFER"),
    TRANSFER_CONFERENCE("TRANSFER_CONFERENCE"),
    TRANSFER_CONSULT("TRANSFER_CONSULT"),
    TRANSFER_FORWARD("TRANSFER_FORWARD"),
    TRANSFER_NOANSWER("TRANSFER_NOANSWER"),
    TRANSFER_NOTAVAILABLE("TRANSFER_NOTAVAILABLE"),
    TRANSPORT_FAILURE("TRANSPORT_FAILURE"),
    ERROR("ERROR"),
    PEER("PEER"),
    OTHER("OTHER"),
    SPAM("SPAM"),
    UNCALLABLE("UNCALLABLE");

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
   * Gets or Sets direction
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OUTBOUND("OUTBOUND"),
    INBOUND("INBOUND");

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
  private ConversationEventTopicAddress self = null;
  private ConversationEventTopicAddress other = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private List<ConversationEventTopicDisconnectReason> disconnectReasons = new ArrayList<ConversationEventTopicDisconnectReason>();
  private ConversationEventTopicFaxStatus faxStatus = null;
  private String uuiData = null;
  private ConversationEventTopicWrapup wrapup = null;
  private ConversationEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String agentAssistantId = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public ConversationEventTopicCall id(String id) {
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
  public ConversationEventTopicCall state(StateEnum state) {
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
  public ConversationEventTopicCall recording(Boolean recording) {
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
  public ConversationEventTopicCall recordingState(RecordingStateEnum recordingState) {
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
  public ConversationEventTopicCall muted(Boolean muted) {
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
  public ConversationEventTopicCall confined(Boolean confined) {
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
  public ConversationEventTopicCall held(Boolean held) {
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
  public ConversationEventTopicCall errorInfo(ConversationEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public ConversationEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ConversationEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public ConversationEventTopicCall disconnectType(DisconnectTypeEnum disconnectType) {
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
  public ConversationEventTopicCall startHoldTime(Date startHoldTime) {
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
  public ConversationEventTopicCall direction(DirectionEnum direction) {
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
  public ConversationEventTopicCall documentId(String documentId) {
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
  public ConversationEventTopicCall self(ConversationEventTopicAddress self) {
    this.self = self;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("self")
  public ConversationEventTopicAddress getSelf() {
    return self;
  }
  public void setSelf(ConversationEventTopicAddress self) {
    this.self = self;
  }

  
  /**
   **/
  public ConversationEventTopicCall other(ConversationEventTopicAddress other) {
    this.other = other;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("other")
  public ConversationEventTopicAddress getOther() {
    return other;
  }
  public void setOther(ConversationEventTopicAddress other) {
    this.other = other;
  }

  
  /**
   **/
  public ConversationEventTopicCall provider(String provider) {
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
  public ConversationEventTopicCall scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   **/
  public ConversationEventTopicCall peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  
  /**
   **/
  public ConversationEventTopicCall connectedTime(Date connectedTime) {
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
  public ConversationEventTopicCall disconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disconnectedTime")
  public Date getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }

  
  /**
   **/
  public ConversationEventTopicCall disconnectReasons(List<ConversationEventTopicDisconnectReason> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disconnectReasons")
  public List<ConversationEventTopicDisconnectReason> getDisconnectReasons() {
    return disconnectReasons;
  }
  public void setDisconnectReasons(List<ConversationEventTopicDisconnectReason> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
  }

  
  /**
   **/
  public ConversationEventTopicCall faxStatus(ConversationEventTopicFaxStatus faxStatus) {
    this.faxStatus = faxStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxStatus")
  public ConversationEventTopicFaxStatus getFaxStatus() {
    return faxStatus;
  }
  public void setFaxStatus(ConversationEventTopicFaxStatus faxStatus) {
    this.faxStatus = faxStatus;
  }

  
  /**
   **/
  public ConversationEventTopicCall uuiData(String uuiData) {
    this.uuiData = uuiData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uuiData")
  public String getUuiData() {
    return uuiData;
  }
  public void setUuiData(String uuiData) {
    this.uuiData = uuiData;
  }

  
  /**
   **/
  public ConversationEventTopicCall wrapup(ConversationEventTopicWrapup wrapup) {
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
  public ConversationEventTopicCall afterCallWork(ConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("afterCallWork")
  public ConversationEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(ConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   **/
  public ConversationEventTopicCall afterCallWorkRequired(Boolean afterCallWorkRequired) {
    this.afterCallWorkRequired = afterCallWorkRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("afterCallWorkRequired")
  public Boolean getAfterCallWorkRequired() {
    return afterCallWorkRequired;
  }
  public void setAfterCallWorkRequired(Boolean afterCallWorkRequired) {
    this.afterCallWorkRequired = afterCallWorkRequired;
  }

  
  /**
   **/
  public ConversationEventTopicCall agentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentAssistantId")
  public String getAgentAssistantId() {
    return agentAssistantId;
  }
  public void setAgentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
  }

  
  /**
   **/
  public ConversationEventTopicCall additionalProperties(Object additionalProperties) {
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
    ConversationEventTopicCall conversationEventTopicCall = (ConversationEventTopicCall) o;
    return Objects.equals(this.id, conversationEventTopicCall.id) &&
        Objects.equals(this.state, conversationEventTopicCall.state) &&
        Objects.equals(this.recording, conversationEventTopicCall.recording) &&
        Objects.equals(this.recordingState, conversationEventTopicCall.recordingState) &&
        Objects.equals(this.muted, conversationEventTopicCall.muted) &&
        Objects.equals(this.confined, conversationEventTopicCall.confined) &&
        Objects.equals(this.held, conversationEventTopicCall.held) &&
        Objects.equals(this.errorInfo, conversationEventTopicCall.errorInfo) &&
        Objects.equals(this.disconnectType, conversationEventTopicCall.disconnectType) &&
        Objects.equals(this.startHoldTime, conversationEventTopicCall.startHoldTime) &&
        Objects.equals(this.direction, conversationEventTopicCall.direction) &&
        Objects.equals(this.documentId, conversationEventTopicCall.documentId) &&
        Objects.equals(this.self, conversationEventTopicCall.self) &&
        Objects.equals(this.other, conversationEventTopicCall.other) &&
        Objects.equals(this.provider, conversationEventTopicCall.provider) &&
        Objects.equals(this.scriptId, conversationEventTopicCall.scriptId) &&
        Objects.equals(this.peerId, conversationEventTopicCall.peerId) &&
        Objects.equals(this.connectedTime, conversationEventTopicCall.connectedTime) &&
        Objects.equals(this.disconnectedTime, conversationEventTopicCall.disconnectedTime) &&
        Objects.equals(this.disconnectReasons, conversationEventTopicCall.disconnectReasons) &&
        Objects.equals(this.faxStatus, conversationEventTopicCall.faxStatus) &&
        Objects.equals(this.uuiData, conversationEventTopicCall.uuiData) &&
        Objects.equals(this.wrapup, conversationEventTopicCall.wrapup) &&
        Objects.equals(this.afterCallWork, conversationEventTopicCall.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, conversationEventTopicCall.afterCallWorkRequired) &&
        Objects.equals(this.agentAssistantId, conversationEventTopicCall.agentAssistantId) &&
        Objects.equals(this.additionalProperties, conversationEventTopicCall.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, recording, recordingState, muted, confined, held, errorInfo, disconnectType, startHoldTime, direction, documentId, self, other, provider, scriptId, peerId, connectedTime, disconnectedTime, disconnectReasons, faxStatus, uuiData, wrapup, afterCallWork, afterCallWorkRequired, agentAssistantId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicCall {\n");
    
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
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
    sb.append("    agentAssistantId: ").append(toIndentedString(agentAssistantId)).append("\n");
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

