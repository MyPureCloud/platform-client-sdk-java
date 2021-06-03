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
import com.mypurecloud.sdk.v2.model.AfterCallWork;
import com.mypurecloud.sdk.v2.model.DialerPreview;
import com.mypurecloud.sdk.v2.model.Segment;
import com.mypurecloud.sdk.v2.model.Voicemail;
import com.mypurecloud.sdk.v2.model.Wrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CallbackBasic
 */

public class CallbackBasic  implements Serializable {
  

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
  private String id = null;
  private List<Segment> segments = new ArrayList<Segment>();

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
  private Boolean held = null;

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
  private DialerPreview dialerPreview = null;
  private Voicemail voicemail = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private String callbackUserName = null;
  private String scriptId = null;
  private Boolean externalCampaign = null;
  private Boolean skipEnabled = null;
  private Integer timeoutSeconds = null;
  private Date startAlertingTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private Date callbackScheduledTime = null;
  private String automatedCallbackConfigId = null;
  private String provider = null;
  private String peerId = null;
  private Wrapup wrapup = null;
  private AfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String callerId = null;
  private String callerIdName = null;

  
  /**
   * The connection state of this communication.
   **/
  public CallbackBasic state(StateEnum state) {
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
  public CallbackBasic id(String id) {
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
   * The time line of the participant's callback, divided into activity segments.
   **/
  public CallbackBasic segments(List<Segment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time line of the participant's callback, divided into activity segments.")
  @JsonProperty("segments")
  public List<Segment> getSegments() {
    return segments;
  }
  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }

  
  /**
   * The direction of the call
   **/
  public CallbackBasic direction(DirectionEnum direction) {
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
   * True if this call is held and the person on this side hears silence.
   **/
  public CallbackBasic held(Boolean held) {
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
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public CallbackBasic disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The timestamp the callback was placed on hold in the cloud clock if the callback is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CallbackBasic startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the callback was placed on hold in the cloud clock if the callback is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   * The preview data to be used when this callback is a Preview.
   **/
  public CallbackBasic dialerPreview(DialerPreview dialerPreview) {
    this.dialerPreview = dialerPreview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The preview data to be used when this callback is a Preview.")
  @JsonProperty("dialerPreview")
  public DialerPreview getDialerPreview() {
    return dialerPreview;
  }
  public void setDialerPreview(DialerPreview dialerPreview) {
    this.dialerPreview = dialerPreview;
  }

  
  /**
   * The voicemail data to be used when this callback is an ACD voicemail.
   **/
  public CallbackBasic voicemail(Voicemail voicemail) {
    this.voicemail = voicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The voicemail data to be used when this callback is an ACD voicemail.")
  @JsonProperty("voicemail")
  public Voicemail getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(Voicemail voicemail) {
    this.voicemail = voicemail;
  }

  
  /**
   * The phone number(s) to use to place the callback.
   **/
  public CallbackBasic callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number(s) to use to place the callback.")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  
  /**
   * The name of the user requesting a callback.
   **/
  public CallbackBasic callbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the user requesting a callback.")
  @JsonProperty("callbackUserName")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  
  /**
   * The UUID of the script to use.
   **/
  public CallbackBasic scriptId(String scriptId) {
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
   * True if the call for the callback uses external dialing.
   **/
  public CallbackBasic externalCampaign(Boolean externalCampaign) {
    this.externalCampaign = externalCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the call for the callback uses external dialing.")
  @JsonProperty("externalCampaign")
  public Boolean getExternalCampaign() {
    return externalCampaign;
  }
  public void setExternalCampaign(Boolean externalCampaign) {
    this.externalCampaign = externalCampaign;
  }

  
  /**
   * True if the ability to skip a callback should be enabled.
   **/
  public CallbackBasic skipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the ability to skip a callback should be enabled.")
  @JsonProperty("skipEnabled")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }

  
  /**
   * The number of seconds before the system automatically places a call for a callback.  0 means the automatic placement is disabled.
   **/
  public CallbackBasic timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds before the system automatically places a call for a callback.  0 means the automatic placement is disabled.")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  
  /**
   * The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CallbackBasic startAlertingTime(Date startAlertingTime) {
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
  public CallbackBasic connectedTime(Date connectedTime) {
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
  public CallbackBasic disconnectedTime(Date disconnectedTime) {
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
   * The timestamp when this communication is scheduled in the provider clock. If this value is missing it indicates the callback will be placed immediately. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CallbackBasic callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication is scheduled in the provider clock. If this value is missing it indicates the callback will be placed immediately. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }

  
  /**
   * The id of the config for automatically placing the callback (and handling the disposition). If null, the callback will not be placed automatically but routed to an agent as per normal.
   **/
  public CallbackBasic automatedCallbackConfigId(String automatedCallbackConfigId) {
    this.automatedCallbackConfigId = automatedCallbackConfigId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the config for automatically placing the callback (and handling the disposition). If null, the callback will not be placed automatically but routed to an agent as per normal.")
  @JsonProperty("automatedCallbackConfigId")
  public String getAutomatedCallbackConfigId() {
    return automatedCallbackConfigId;
  }
  public void setAutomatedCallbackConfigId(String automatedCallbackConfigId) {
    this.automatedCallbackConfigId = automatedCallbackConfigId;
  }

  
  /**
   * The source provider for the callback.
   **/
  public CallbackBasic provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider for the callback.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * The id of the peer communication corresponding to a matching leg for this communication.
   **/
  public CallbackBasic peerId(String peerId) {
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
   * Call wrap up or disposition data.
   **/
  public CallbackBasic wrapup(Wrapup wrapup) {
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
  public CallbackBasic afterCallWork(AfterCallWork afterCallWork) {
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
  public CallbackBasic afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
   * The phone number displayed to recipients of the phone call. The value should conform to the E164 format.
   **/
  public CallbackBasic callerId(String callerId) {
    this.callerId = callerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number displayed to recipients of the phone call. The value should conform to the E164 format.")
  @JsonProperty("callerId")
  public String getCallerId() {
    return callerId;
  }
  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  
  /**
   * The name displayed to recipients of the phone call.
   **/
  public CallbackBasic callerIdName(String callerIdName) {
    this.callerIdName = callerIdName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name displayed to recipients of the phone call.")
  @JsonProperty("callerIdName")
  public String getCallerIdName() {
    return callerIdName;
  }
  public void setCallerIdName(String callerIdName) {
    this.callerIdName = callerIdName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackBasic callbackBasic = (CallbackBasic) o;
    return Objects.equals(this.state, callbackBasic.state) &&
        Objects.equals(this.id, callbackBasic.id) &&
        Objects.equals(this.segments, callbackBasic.segments) &&
        Objects.equals(this.direction, callbackBasic.direction) &&
        Objects.equals(this.held, callbackBasic.held) &&
        Objects.equals(this.disconnectType, callbackBasic.disconnectType) &&
        Objects.equals(this.startHoldTime, callbackBasic.startHoldTime) &&
        Objects.equals(this.dialerPreview, callbackBasic.dialerPreview) &&
        Objects.equals(this.voicemail, callbackBasic.voicemail) &&
        Objects.equals(this.callbackNumbers, callbackBasic.callbackNumbers) &&
        Objects.equals(this.callbackUserName, callbackBasic.callbackUserName) &&
        Objects.equals(this.scriptId, callbackBasic.scriptId) &&
        Objects.equals(this.externalCampaign, callbackBasic.externalCampaign) &&
        Objects.equals(this.skipEnabled, callbackBasic.skipEnabled) &&
        Objects.equals(this.timeoutSeconds, callbackBasic.timeoutSeconds) &&
        Objects.equals(this.startAlertingTime, callbackBasic.startAlertingTime) &&
        Objects.equals(this.connectedTime, callbackBasic.connectedTime) &&
        Objects.equals(this.disconnectedTime, callbackBasic.disconnectedTime) &&
        Objects.equals(this.callbackScheduledTime, callbackBasic.callbackScheduledTime) &&
        Objects.equals(this.automatedCallbackConfigId, callbackBasic.automatedCallbackConfigId) &&
        Objects.equals(this.provider, callbackBasic.provider) &&
        Objects.equals(this.peerId, callbackBasic.peerId) &&
        Objects.equals(this.wrapup, callbackBasic.wrapup) &&
        Objects.equals(this.afterCallWork, callbackBasic.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, callbackBasic.afterCallWorkRequired) &&
        Objects.equals(this.callerId, callbackBasic.callerId) &&
        Objects.equals(this.callerIdName, callbackBasic.callerIdName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, segments, direction, held, disconnectType, startHoldTime, dialerPreview, voicemail, callbackNumbers, callbackUserName, scriptId, externalCampaign, skipEnabled, timeoutSeconds, startAlertingTime, connectedTime, disconnectedTime, callbackScheduledTime, automatedCallbackConfigId, provider, peerId, wrapup, afterCallWork, afterCallWorkRequired, callerId, callerIdName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackBasic {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    dialerPreview: ").append(toIndentedString(dialerPreview)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    externalCampaign: ").append(toIndentedString(externalCampaign)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    startAlertingTime: ").append(toIndentedString(startAlertingTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    automatedCallbackConfigId: ").append(toIndentedString(automatedCallbackConfigId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    callerIdName: ").append(toIndentedString(callerIdName)).append("\n");
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

