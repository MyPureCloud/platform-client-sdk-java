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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicDialerPreview;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicVoicemail;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicCallback
 */

public class QueueConversationVideoEventTopicCallback  implements Serializable {
  

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
    UPLOADING("uploading"),
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
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSFER_FORWARD("transfer.forward"),
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
  private QueueConversationVideoEventTopicDialerPreview dialerPreview = null;
  private QueueConversationVideoEventTopicVoicemail voicemail = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private String callbackUserName = null;
  private String scriptId = null;
  private String peerId = null;
  private Boolean externalCampaign = null;
  private Boolean skipEnabled = null;
  private String provider = null;
  private Integer timeoutSeconds = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private Date callbackScheduledTime = null;
  private String automatedCallbackConfigId = null;
  private QueueConversationVideoEventTopicWrapup wrapup = null;
  private QueueConversationVideoEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String callerId = null;
  private String callerIdName = null;

  
  /**
   * The connection state of this communication.
   **/
  public QueueConversationVideoEventTopicCallback state(StateEnum state) {
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
  public QueueConversationVideoEventTopicCallback id(String id) {
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
  public QueueConversationVideoEventTopicCallback direction(DirectionEnum direction) {
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
  public QueueConversationVideoEventTopicCallback held(Boolean held) {
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
  public QueueConversationVideoEventTopicCallback disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The timestamp the callback was placed on hold in the cloud clock if the callback is currently on hold.
   **/
  public QueueConversationVideoEventTopicCallback startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the callback was placed on hold in the cloud clock if the callback is currently on hold.")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCallback dialerPreview(QueueConversationVideoEventTopicDialerPreview dialerPreview) {
    this.dialerPreview = dialerPreview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialerPreview")
  public QueueConversationVideoEventTopicDialerPreview getDialerPreview() {
    return dialerPreview;
  }
  public void setDialerPreview(QueueConversationVideoEventTopicDialerPreview dialerPreview) {
    this.dialerPreview = dialerPreview;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCallback voicemail(QueueConversationVideoEventTopicVoicemail voicemail) {
    this.voicemail = voicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voicemail")
  public QueueConversationVideoEventTopicVoicemail getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(QueueConversationVideoEventTopicVoicemail voicemail) {
    this.voicemail = voicemail;
  }

  
  /**
   * The phone number(s) to use to place the callback.
   **/
  public QueueConversationVideoEventTopicCallback callbackNumbers(List<String> callbackNumbers) {
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
  public QueueConversationVideoEventTopicCallback callbackUserName(String callbackUserName) {
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
  public QueueConversationVideoEventTopicCallback scriptId(String scriptId) {
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
  public QueueConversationVideoEventTopicCallback peerId(String peerId) {
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
   * True if the call for the callback uses external dialing.
   **/
  public QueueConversationVideoEventTopicCallback externalCampaign(Boolean externalCampaign) {
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
  public QueueConversationVideoEventTopicCallback skipEnabled(Boolean skipEnabled) {
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
   * The source provider of the callback.
   **/
  public QueueConversationVideoEventTopicCallback provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider of the callback.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * The number of seconds before the system automatically places a call for a callback.  0 means the automatic placement is disabled.
   **/
  public QueueConversationVideoEventTopicCallback timeoutSeconds(Integer timeoutSeconds) {
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
   * The timestamp when this communication was connected in the cloud clock.
   **/
  public QueueConversationVideoEventTopicCallback connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicCallback disconnectedTime(Date disconnectedTime) {
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
   * The timestamp when this communication is scheduled in the provider clock. If this value is missing it indicates the callback will be placed immediately.
   **/
  public QueueConversationVideoEventTopicCallback callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this communication is scheduled in the provider clock. If this value is missing it indicates the callback will be placed immediately.")
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
  public QueueConversationVideoEventTopicCallback automatedCallbackConfigId(String automatedCallbackConfigId) {
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
   * Call wrap up or disposition data.
   **/
  public QueueConversationVideoEventTopicCallback wrapup(QueueConversationVideoEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Call wrap up or disposition data.")
  @JsonProperty("wrapup")
  public QueueConversationVideoEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationVideoEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * A communication's after-call work data.
   **/
  public QueueConversationVideoEventTopicCallback afterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A communication's after-call work data.")
  @JsonProperty("afterCallWork")
  public QueueConversationVideoEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   * Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested.
   **/
  public QueueConversationVideoEventTopicCallback afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
   * The phone number displayed to recipients of the phone call. The value should conform to the E164 format.
   **/
  public QueueConversationVideoEventTopicCallback callerId(String callerId) {
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
  public QueueConversationVideoEventTopicCallback callerIdName(String callerIdName) {
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
    QueueConversationVideoEventTopicCallback queueConversationVideoEventTopicCallback = (QueueConversationVideoEventTopicCallback) o;
    return Objects.equals(this.state, queueConversationVideoEventTopicCallback.state) &&
        Objects.equals(this.id, queueConversationVideoEventTopicCallback.id) &&
        Objects.equals(this.direction, queueConversationVideoEventTopicCallback.direction) &&
        Objects.equals(this.held, queueConversationVideoEventTopicCallback.held) &&
        Objects.equals(this.disconnectType, queueConversationVideoEventTopicCallback.disconnectType) &&
        Objects.equals(this.startHoldTime, queueConversationVideoEventTopicCallback.startHoldTime) &&
        Objects.equals(this.dialerPreview, queueConversationVideoEventTopicCallback.dialerPreview) &&
        Objects.equals(this.voicemail, queueConversationVideoEventTopicCallback.voicemail) &&
        Objects.equals(this.callbackNumbers, queueConversationVideoEventTopicCallback.callbackNumbers) &&
        Objects.equals(this.callbackUserName, queueConversationVideoEventTopicCallback.callbackUserName) &&
        Objects.equals(this.scriptId, queueConversationVideoEventTopicCallback.scriptId) &&
        Objects.equals(this.peerId, queueConversationVideoEventTopicCallback.peerId) &&
        Objects.equals(this.externalCampaign, queueConversationVideoEventTopicCallback.externalCampaign) &&
        Objects.equals(this.skipEnabled, queueConversationVideoEventTopicCallback.skipEnabled) &&
        Objects.equals(this.provider, queueConversationVideoEventTopicCallback.provider) &&
        Objects.equals(this.timeoutSeconds, queueConversationVideoEventTopicCallback.timeoutSeconds) &&
        Objects.equals(this.connectedTime, queueConversationVideoEventTopicCallback.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationVideoEventTopicCallback.disconnectedTime) &&
        Objects.equals(this.callbackScheduledTime, queueConversationVideoEventTopicCallback.callbackScheduledTime) &&
        Objects.equals(this.automatedCallbackConfigId, queueConversationVideoEventTopicCallback.automatedCallbackConfigId) &&
        Objects.equals(this.wrapup, queueConversationVideoEventTopicCallback.wrapup) &&
        Objects.equals(this.afterCallWork, queueConversationVideoEventTopicCallback.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, queueConversationVideoEventTopicCallback.afterCallWorkRequired) &&
        Objects.equals(this.callerId, queueConversationVideoEventTopicCallback.callerId) &&
        Objects.equals(this.callerIdName, queueConversationVideoEventTopicCallback.callerIdName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, direction, held, disconnectType, startHoldTime, dialerPreview, voicemail, callbackNumbers, callbackUserName, scriptId, peerId, externalCampaign, skipEnabled, provider, timeoutSeconds, connectedTime, disconnectedTime, callbackScheduledTime, automatedCallbackConfigId, wrapup, afterCallWork, afterCallWorkRequired, callerId, callerIdName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicCallback {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    dialerPreview: ").append(toIndentedString(dialerPreview)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    externalCampaign: ").append(toIndentedString(externalCampaign)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    automatedCallbackConfigId: ").append(toIndentedString(automatedCallbackConfigId)).append("\n");
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

