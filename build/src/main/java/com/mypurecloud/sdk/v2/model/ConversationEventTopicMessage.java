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
import com.mypurecloud.sdk.v2.model.ConversationEventTopicAddress;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicMessageDetails;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicQueueMediaSettings;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationEventTopicMessage
 */

public class ConversationEventTopicMessage  implements Serializable {
  
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
    CONNECTED("connected"),
    DISCONNECTED("disconnected");

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
   * Whether a message is inbound or outbound.
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
  private Boolean held = null;
  private ConversationEventTopicErrorDetails errorInfo = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;

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
    ENDPOINT_DND("endpoint.dnd"),
    CLIENT("client"),
    SYSTEM("system"),
    TIMEOUT("timeout"),
    TRANSFER("transfer"),
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
  private Date startHoldTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private ConversationEventTopicAddress toAddress = null;
  private ConversationEventTopicAddress fromAddress = null;
  private List<ConversationEventTopicMessageDetails> messages = null;
  private String messagesTranscriptUri = null;

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
    VIBER("viber"),
    WECHAT("wechat"),
    WHATSAPP("whatsapp"),
    TELEGRAM("telegram"),
    KAKAO("kakao"),
    WEBMESSAGING("webmessaging"),
    OPEN("open"),
    INSTAGRAM("instagram"),
    APPLE("apple");

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
  private ConversationEventTopicJourneyContext journeyContext = null;
  private ConversationEventTopicWrapup wrapup = null;
  private ConversationEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String agentAssistantId = null;
  private String engagementSource = null;
  private String byoSmsIntegrationId = null;
  private ConversationEventTopicQueueMediaSettings queueMediaSettings = null;

  public ConversationEventTopicMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      messages = new ArrayList<ConversationEventTopicMessageDetails>();
    }
  }

  
  /**
   * A globally unique identifier for this communication.
   **/
  public ConversationEventTopicMessage id(String id) {
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
   **/
  public ConversationEventTopicMessage state(StateEnum state) {
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
  public ConversationEventTopicMessage initialState(InitialStateEnum initialState) {
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
   * Whether a message is inbound or outbound.
   **/
  public ConversationEventTopicMessage direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether a message is inbound or outbound.")
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
  public ConversationEventTopicMessage held(Boolean held) {
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
   * Detailed information about an error response.
   **/
  public ConversationEventTopicMessage errorInfo(ConversationEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed information about an error response.")
  @JsonProperty("errorInfo")
  public ConversationEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ConversationEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * The source provider of the email.
   **/
  public ConversationEventTopicMessage provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider of the email.")
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
  public ConversationEventTopicMessage scriptId(String scriptId) {
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
  public ConversationEventTopicMessage peerId(String peerId) {
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
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public ConversationEventTopicMessage disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The timestamp the email was placed on hold in the cloud clock if the email is currently on hold.
   **/
  public ConversationEventTopicMessage startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the email was placed on hold in the cloud clock if the email is currently on hold.")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }


  /**
   * The timestamp when this communication was connected in the cloud clock.
   **/
  public ConversationEventTopicMessage connectedTime(Date connectedTime) {
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
  public ConversationEventTopicMessage disconnectedTime(Date disconnectedTime) {
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
   * Address and name data for a call endpoint.
   **/
  public ConversationEventTopicMessage toAddress(ConversationEventTopicAddress toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("toAddress")
  public ConversationEventTopicAddress getToAddress() {
    return toAddress;
  }
  public void setToAddress(ConversationEventTopicAddress toAddress) {
    this.toAddress = toAddress;
  }


  /**
   * Address and name data for a call endpoint.
   **/
  public ConversationEventTopicMessage fromAddress(ConversationEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("fromAddress")
  public ConversationEventTopicAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(ConversationEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
  }


  /**
   * The messages sent on this communication channel.
   **/
  public ConversationEventTopicMessage messages(List<ConversationEventTopicMessageDetails> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messages sent on this communication channel.")
  @JsonProperty("messages")
  public List<ConversationEventTopicMessageDetails> getMessages() {
    return messages;
  }
  public void setMessages(List<ConversationEventTopicMessageDetails> messages) {
    this.messages = messages;
  }


  /**
   * the messages transcript file uri.
   **/
  public ConversationEventTopicMessage messagesTranscriptUri(String messagesTranscriptUri) {
    this.messagesTranscriptUri = messagesTranscriptUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the messages transcript file uri.")
  @JsonProperty("messagesTranscriptUri")
  public String getMessagesTranscriptUri() {
    return messagesTranscriptUri;
  }
  public void setMessagesTranscriptUri(String messagesTranscriptUri) {
    this.messagesTranscriptUri = messagesTranscriptUri;
  }


  /**
   * Indicates the type of message platform from which the message originated.
   **/
  public ConversationEventTopicMessage type(TypeEnum type) {
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
  public ConversationEventTopicMessage recipientCountry(String recipientCountry) {
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
  public ConversationEventTopicMessage recipientType(String recipientType) {
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
   * A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context).
   **/
  public ConversationEventTopicMessage journeyContext(ConversationEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context).")
  @JsonProperty("journeyContext")
  public ConversationEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(ConversationEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }


  /**
   * Call wrap up or disposition data.
   **/
  public ConversationEventTopicMessage wrapup(ConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Call wrap up or disposition data.")
  @JsonProperty("wrapup")
  public ConversationEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }


  /**
   * A communication's after-call work data.
   **/
  public ConversationEventTopicMessage afterCallWork(ConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A communication's after-call work data.")
  @JsonProperty("afterCallWork")
  public ConversationEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(ConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }


  /**
   * Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested.
   **/
  public ConversationEventTopicMessage afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
  public ConversationEventTopicMessage agentAssistantId(String agentAssistantId) {
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


  /**
   * Provide more visibility into what integrations customers are creating with Open Messaging. String values are defined in the Constants.java named ENGAGEMENT_SOURCE_*
   **/
  public ConversationEventTopicMessage engagementSource(String engagementSource) {
    this.engagementSource = engagementSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provide more visibility into what integrations customers are creating with Open Messaging. String values are defined in the Constants.java named ENGAGEMENT_SOURCE_*")
  @JsonProperty("engagementSource")
  public String getEngagementSource() {
    return engagementSource;
  }
  public void setEngagementSource(String engagementSource) {
    this.engagementSource = engagementSource;
  }


  /**
   **/
  public ConversationEventTopicMessage byoSmsIntegrationId(String byoSmsIntegrationId) {
    this.byoSmsIntegrationId = byoSmsIntegrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("byoSmsIntegrationId")
  public String getByoSmsIntegrationId() {
    return byoSmsIntegrationId;
  }
  public void setByoSmsIntegrationId(String byoSmsIntegrationId) {
    this.byoSmsIntegrationId = byoSmsIntegrationId;
  }


  /**
   * Represents the queue setting for this media.
   **/
  public ConversationEventTopicMessage queueMediaSettings(ConversationEventTopicQueueMediaSettings queueMediaSettings) {
    this.queueMediaSettings = queueMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the queue setting for this media.")
  @JsonProperty("queueMediaSettings")
  public ConversationEventTopicQueueMediaSettings getQueueMediaSettings() {
    return queueMediaSettings;
  }
  public void setQueueMediaSettings(ConversationEventTopicQueueMediaSettings queueMediaSettings) {
    this.queueMediaSettings = queueMediaSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventTopicMessage conversationEventTopicMessage = (ConversationEventTopicMessage) o;

    return Objects.equals(this.id, conversationEventTopicMessage.id) &&
            Objects.equals(this.state, conversationEventTopicMessage.state) &&
            Objects.equals(this.initialState, conversationEventTopicMessage.initialState) &&
            Objects.equals(this.direction, conversationEventTopicMessage.direction) &&
            Objects.equals(this.held, conversationEventTopicMessage.held) &&
            Objects.equals(this.errorInfo, conversationEventTopicMessage.errorInfo) &&
            Objects.equals(this.provider, conversationEventTopicMessage.provider) &&
            Objects.equals(this.scriptId, conversationEventTopicMessage.scriptId) &&
            Objects.equals(this.peerId, conversationEventTopicMessage.peerId) &&
            Objects.equals(this.disconnectType, conversationEventTopicMessage.disconnectType) &&
            Objects.equals(this.startHoldTime, conversationEventTopicMessage.startHoldTime) &&
            Objects.equals(this.connectedTime, conversationEventTopicMessage.connectedTime) &&
            Objects.equals(this.disconnectedTime, conversationEventTopicMessage.disconnectedTime) &&
            Objects.equals(this.toAddress, conversationEventTopicMessage.toAddress) &&
            Objects.equals(this.fromAddress, conversationEventTopicMessage.fromAddress) &&
            Objects.equals(this.messages, conversationEventTopicMessage.messages) &&
            Objects.equals(this.messagesTranscriptUri, conversationEventTopicMessage.messagesTranscriptUri) &&
            Objects.equals(this.type, conversationEventTopicMessage.type) &&
            Objects.equals(this.recipientCountry, conversationEventTopicMessage.recipientCountry) &&
            Objects.equals(this.recipientType, conversationEventTopicMessage.recipientType) &&
            Objects.equals(this.journeyContext, conversationEventTopicMessage.journeyContext) &&
            Objects.equals(this.wrapup, conversationEventTopicMessage.wrapup) &&
            Objects.equals(this.afterCallWork, conversationEventTopicMessage.afterCallWork) &&
            Objects.equals(this.afterCallWorkRequired, conversationEventTopicMessage.afterCallWorkRequired) &&
            Objects.equals(this.agentAssistantId, conversationEventTopicMessage.agentAssistantId) &&
            Objects.equals(this.engagementSource, conversationEventTopicMessage.engagementSource) &&
            Objects.equals(this.byoSmsIntegrationId, conversationEventTopicMessage.byoSmsIntegrationId) &&
            Objects.equals(this.queueMediaSettings, conversationEventTopicMessage.queueMediaSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, initialState, direction, held, errorInfo, provider, scriptId, peerId, disconnectType, startHoldTime, connectedTime, disconnectedTime, toAddress, fromAddress, messages, messagesTranscriptUri, type, recipientCountry, recipientType, journeyContext, wrapup, afterCallWork, afterCallWorkRequired, agentAssistantId, engagementSource, byoSmsIntegrationId, queueMediaSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    messagesTranscriptUri: ").append(toIndentedString(messagesTranscriptUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
    sb.append("    agentAssistantId: ").append(toIndentedString(agentAssistantId)).append("\n");
    sb.append("    engagementSource: ").append(toIndentedString(engagementSource)).append("\n");
    sb.append("    byoSmsIntegrationId: ").append(toIndentedString(byoSmsIntegrationId)).append("\n");
    sb.append("    queueMediaSettings: ").append(toIndentedString(queueMediaSettings)).append("\n");
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

