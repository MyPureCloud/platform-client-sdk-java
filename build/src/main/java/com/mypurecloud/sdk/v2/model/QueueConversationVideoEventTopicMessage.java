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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicAddress;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicMessageDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicMessage
 */

public class QueueConversationVideoEventTopicMessage  implements Serializable {
  
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
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED");

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
  private Boolean held = null;
  private QueueConversationVideoEventTopicErrorDetails errorInfo = null;
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
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private QueueConversationVideoEventTopicAddress toAddress = null;
  private QueueConversationVideoEventTopicAddress fromAddress = null;
  private List<QueueConversationVideoEventTopicMessageDetails> messages = new ArrayList<QueueConversationVideoEventTopicMessageDetails>();
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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    SMS("SMS"),
    TWITTER("TWITTER"),
    FACEBOOK("FACEBOOK"),
    LINE("LINE"),
    VIBER("VIBER"),
    WECHAT("WECHAT"),
    WHATSAPP("WHATSAPP"),
    TELEGRAM("TELEGRAM"),
    KAKAO("KAKAO"),
    WEBMESSAGING("WEBMESSAGING"),
    OPEN("OPEN"),
    INSTAGRAM("INSTAGRAM");

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
  private QueueConversationVideoEventTopicJourneyContext journeyContext = null;
  private QueueConversationVideoEventTopicWrapup wrapup = null;
  private QueueConversationVideoEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private String agentAssistantId = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage id(String id) {
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
  public QueueConversationVideoEventTopicMessage state(StateEnum state) {
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
  public QueueConversationVideoEventTopicMessage held(Boolean held) {
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
  public QueueConversationVideoEventTopicMessage errorInfo(QueueConversationVideoEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public QueueConversationVideoEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationVideoEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage provider(String provider) {
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
  public QueueConversationVideoEventTopicMessage scriptId(String scriptId) {
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
  public QueueConversationVideoEventTopicMessage peerId(String peerId) {
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
  public QueueConversationVideoEventTopicMessage disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationVideoEventTopicMessage startHoldTime(Date startHoldTime) {
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
  public QueueConversationVideoEventTopicMessage connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicMessage disconnectedTime(Date disconnectedTime) {
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
  public QueueConversationVideoEventTopicMessage toAddress(QueueConversationVideoEventTopicAddress toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("toAddress")
  public QueueConversationVideoEventTopicAddress getToAddress() {
    return toAddress;
  }
  public void setToAddress(QueueConversationVideoEventTopicAddress toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage fromAddress(QueueConversationVideoEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromAddress")
  public QueueConversationVideoEventTopicAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(QueueConversationVideoEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage messages(List<QueueConversationVideoEventTopicMessageDetails> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<QueueConversationVideoEventTopicMessageDetails> getMessages() {
    return messages;
  }
  public void setMessages(List<QueueConversationVideoEventTopicMessageDetails> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage messagesTranscriptUri(String messagesTranscriptUri) {
    this.messagesTranscriptUri = messagesTranscriptUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messagesTranscriptUri")
  public String getMessagesTranscriptUri() {
    return messagesTranscriptUri;
  }
  public void setMessagesTranscriptUri(String messagesTranscriptUri) {
    this.messagesTranscriptUri = messagesTranscriptUri;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage recipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientCountry")
  public String getRecipientCountry() {
    return recipientCountry;
  }
  public void setRecipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientType")
  public String getRecipientType() {
    return recipientType;
  }
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage journeyContext(QueueConversationVideoEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public QueueConversationVideoEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(QueueConversationVideoEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage wrapup(QueueConversationVideoEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationVideoEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationVideoEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage afterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("afterCallWork")
  public QueueConversationVideoEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicMessage afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
  public QueueConversationVideoEventTopicMessage agentAssistantId(String agentAssistantId) {
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
  public QueueConversationVideoEventTopicMessage additionalProperties(Object additionalProperties) {
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
    QueueConversationVideoEventTopicMessage queueConversationVideoEventTopicMessage = (QueueConversationVideoEventTopicMessage) o;
    return Objects.equals(this.id, queueConversationVideoEventTopicMessage.id) &&
        Objects.equals(this.state, queueConversationVideoEventTopicMessage.state) &&
        Objects.equals(this.held, queueConversationVideoEventTopicMessage.held) &&
        Objects.equals(this.errorInfo, queueConversationVideoEventTopicMessage.errorInfo) &&
        Objects.equals(this.provider, queueConversationVideoEventTopicMessage.provider) &&
        Objects.equals(this.scriptId, queueConversationVideoEventTopicMessage.scriptId) &&
        Objects.equals(this.peerId, queueConversationVideoEventTopicMessage.peerId) &&
        Objects.equals(this.disconnectType, queueConversationVideoEventTopicMessage.disconnectType) &&
        Objects.equals(this.startHoldTime, queueConversationVideoEventTopicMessage.startHoldTime) &&
        Objects.equals(this.connectedTime, queueConversationVideoEventTopicMessage.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationVideoEventTopicMessage.disconnectedTime) &&
        Objects.equals(this.toAddress, queueConversationVideoEventTopicMessage.toAddress) &&
        Objects.equals(this.fromAddress, queueConversationVideoEventTopicMessage.fromAddress) &&
        Objects.equals(this.messages, queueConversationVideoEventTopicMessage.messages) &&
        Objects.equals(this.messagesTranscriptUri, queueConversationVideoEventTopicMessage.messagesTranscriptUri) &&
        Objects.equals(this.type, queueConversationVideoEventTopicMessage.type) &&
        Objects.equals(this.recipientCountry, queueConversationVideoEventTopicMessage.recipientCountry) &&
        Objects.equals(this.recipientType, queueConversationVideoEventTopicMessage.recipientType) &&
        Objects.equals(this.journeyContext, queueConversationVideoEventTopicMessage.journeyContext) &&
        Objects.equals(this.wrapup, queueConversationVideoEventTopicMessage.wrapup) &&
        Objects.equals(this.afterCallWork, queueConversationVideoEventTopicMessage.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, queueConversationVideoEventTopicMessage.afterCallWorkRequired) &&
        Objects.equals(this.agentAssistantId, queueConversationVideoEventTopicMessage.agentAssistantId) &&
        Objects.equals(this.additionalProperties, queueConversationVideoEventTopicMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, held, errorInfo, provider, scriptId, peerId, disconnectType, startHoldTime, connectedTime, disconnectedTime, toAddress, fromAddress, messages, messagesTranscriptUri, type, recipientCountry, recipientType, journeyContext, wrapup, afterCallWork, afterCallWorkRequired, agentAssistantId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

