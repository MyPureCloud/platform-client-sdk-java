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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.JourneyContext;
import com.mypurecloud.sdk.v2.model.MessageDetails;
import com.mypurecloud.sdk.v2.model.Segment;
import com.mypurecloud.sdk.v2.model.Wrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Message
 */

public class Message  implements Serializable {
  

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
    CONNECTED("connected"),
    DISCONNECTED("disconnected");

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
  private Boolean held = null;
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
   * The direction of the message.
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
  private String recordingId = null;
  private ErrorBody errorInfo = null;

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
  private Date startAlertingTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private String provider = null;
  private Boolean authenticated = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the type of message platform from which the message originated.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    SMS("sms"),
    TWITTER("twitter"),
    FACEBOOK("facebook"),
    LINE("line"),
    WHATSAPP("whatsapp"),
    TELEGRAM("telegram"),
    KAKAO("kakao"),
    WEBMESSAGING("webmessaging"),
    OPEN("open"),
    INSTAGRAM("instagram");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String recipientCountry = null;
  private String recipientType = null;
  private String scriptId = null;
  private String peerId = null;
  private Address toAddress = null;
  private Address fromAddress = null;
  private List<MessageDetails> messages = new ArrayList<MessageDetails>();
  private JourneyContext journeyContext = null;
  private Wrapup wrapup = null;
  private AfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String agentAssistantId = null;

  
  /**
   * The connection state of this communication.
   **/
  public Message state(StateEnum state) {
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
  public Message id(String id) {
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
   * True if this call is held and the person on this side hears silence.
   **/
  public Message held(Boolean held) {
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
   * The time line of the participant's message, divided into activity segments.
   **/
  public Message segments(List<Segment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time line of the participant's message, divided into activity segments.")
  @JsonProperty("segments")
  public List<Segment> getSegments() {
    return segments;
  }
  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }

  
  /**
   * The direction of the message.
   **/
  public Message direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the message.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * A globally unique identifier for the recording associated with this message.
   **/
  public Message recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the recording associated with this message.")
  @JsonProperty("recordingId")
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }

  
  /**
   **/
  public Message errorInfo(ErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public ErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public Message disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The timestamp the message was placed on hold in the cloud clock if the message is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Message startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the message was placed on hold in the cloud clock if the message is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   * The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Message startAlertingTime(Date startAlertingTime) {
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
  public Message connectedTime(Date connectedTime) {
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
  public Message disconnectedTime(Date disconnectedTime) {
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
   * The source provider for the message.
   **/
  public Message provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider for the message.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * If true, the participant member is authenticated.
   **/
  public Message authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the participant member is authenticated.")
  @JsonProperty("authenticated")
  public Boolean getAuthenticated() {
    return authenticated;
  }
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  
  /**
   * Indicates the type of message platform from which the message originated.
   **/
  public Message type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the type of message platform from which the message originated.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Indicates the country where the recipient is associated in ISO 3166-1 alpha-2 format.
   **/
  public Message recipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the country where the recipient is associated in ISO 3166-1 alpha-2 format.")
  @JsonProperty("recipientCountry")
  public String getRecipientCountry() {
    return recipientCountry;
  }
  public void setRecipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
  }

  
  /**
   * The type of the recipient. Eg: Provisioned phoneNumber is the recipient for sms message type.
   **/
  public Message recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the recipient. Eg: Provisioned phoneNumber is the recipient for sms message type.")
  @JsonProperty("recipientType")
  public String getRecipientType() {
    return recipientType;
  }
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  
  /**
   * The UUID of the script to use.
   **/
  public Message scriptId(String scriptId) {
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
  public Message peerId(String peerId) {
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
   * Address and name data for a call endpoint.
   **/
  public Message toAddress(Address toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("toAddress")
  public Address getToAddress() {
    return toAddress;
  }
  public void setToAddress(Address toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   * Address and name data for a call endpoint.
   **/
  public Message fromAddress(Address fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("fromAddress")
  public Address getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(Address fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   * The messages sent on this communication channel.
   **/
  public Message messages(List<MessageDetails> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messages sent on this communication channel.")
  @JsonProperty("messages")
  public List<MessageDetails> getMessages() {
    return messages;
  }
  public void setMessages(List<MessageDetails> messages) {
    this.messages = messages;
  }

  
  /**
   * A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context).
   **/
  public Message journeyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context).")
  @JsonProperty("journeyContext")
  public JourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   * Call wrap up or disposition data.
   **/
  public Message wrapup(Wrapup wrapup) {
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
  public Message afterCallWork(AfterCallWork afterCallWork) {
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
  public Message afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
  public Message agentAssistantId(String agentAssistantId) {
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
    Message message = (Message) o;
    return Objects.equals(this.state, message.state) &&
        Objects.equals(this.id, message.id) &&
        Objects.equals(this.held, message.held) &&
        Objects.equals(this.segments, message.segments) &&
        Objects.equals(this.direction, message.direction) &&
        Objects.equals(this.recordingId, message.recordingId) &&
        Objects.equals(this.errorInfo, message.errorInfo) &&
        Objects.equals(this.disconnectType, message.disconnectType) &&
        Objects.equals(this.startHoldTime, message.startHoldTime) &&
        Objects.equals(this.startAlertingTime, message.startAlertingTime) &&
        Objects.equals(this.connectedTime, message.connectedTime) &&
        Objects.equals(this.disconnectedTime, message.disconnectedTime) &&
        Objects.equals(this.provider, message.provider) &&
        Objects.equals(this.authenticated, message.authenticated) &&
        Objects.equals(this.type, message.type) &&
        Objects.equals(this.recipientCountry, message.recipientCountry) &&
        Objects.equals(this.recipientType, message.recipientType) &&
        Objects.equals(this.scriptId, message.scriptId) &&
        Objects.equals(this.peerId, message.peerId) &&
        Objects.equals(this.toAddress, message.toAddress) &&
        Objects.equals(this.fromAddress, message.fromAddress) &&
        Objects.equals(this.messages, message.messages) &&
        Objects.equals(this.journeyContext, message.journeyContext) &&
        Objects.equals(this.wrapup, message.wrapup) &&
        Objects.equals(this.afterCallWork, message.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, message.afterCallWorkRequired) &&
        Objects.equals(this.agentAssistantId, message.agentAssistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, held, segments, direction, recordingId, errorInfo, disconnectType, startHoldTime, startAlertingTime, connectedTime, disconnectedTime, provider, authenticated, type, recipientCountry, recipientType, scriptId, peerId, toAddress, fromAddress, messages, journeyContext, wrapup, afterCallWork, afterCallWorkRequired, agentAssistantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    startAlertingTime: ").append(toIndentedString(startAlertingTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
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

