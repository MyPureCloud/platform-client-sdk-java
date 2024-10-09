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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicAddress;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicInternalMessageDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEventTopicInternalMessage
 */

public class QueueConversationEventTopicInternalMessage  implements Serializable {
  
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
  private String provider = null;
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
    CLIENT("client"),
    SYSTEM("system"),
    PEER("peer"),
    TRANSFER("transfer");

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
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private String targetUserId = null;
  private String sourceUserId = null;
  private QueueConversationEventTopicAddress toAddress = null;
  private QueueConversationEventTopicAddress fromAddress = null;
  private List<QueueConversationEventTopicInternalMessageDetails> messages = new ArrayList<QueueConversationEventTopicInternalMessageDetails>();

  
  /**
   * A globally unique identifier for this communication.
   **/
  public QueueConversationEventTopicInternalMessage id(String id) {
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
  public QueueConversationEventTopicInternalMessage state(StateEnum state) {
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
  public QueueConversationEventTopicInternalMessage initialState(InitialStateEnum initialState) {
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
   * The source provider of the message.
   **/
  public QueueConversationEventTopicInternalMessage provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider of the message.")
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
  public QueueConversationEventTopicInternalMessage peerId(String peerId) {
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
  public QueueConversationEventTopicInternalMessage disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The timestamp when this communication was connected in the cloud clock.
   **/
  public QueueConversationEventTopicInternalMessage connectedTime(Date connectedTime) {
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
  public QueueConversationEventTopicInternalMessage disconnectedTime(Date disconnectedTime) {
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
   * The user ID for the participant on receiving side of the internal message conversation.
   **/
  public QueueConversationEventTopicInternalMessage targetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID for the participant on receiving side of the internal message conversation.")
  @JsonProperty("targetUserId")
  public String getTargetUserId() {
    return targetUserId;
  }
  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }


  /**
   * The user ID for the participant on sending side of the internal message conversation.
   **/
  public QueueConversationEventTopicInternalMessage sourceUserId(String sourceUserId) {
    this.sourceUserId = sourceUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID for the participant on sending side of the internal message conversation.")
  @JsonProperty("sourceUserId")
  public String getSourceUserId() {
    return sourceUserId;
  }
  public void setSourceUserId(String sourceUserId) {
    this.sourceUserId = sourceUserId;
  }


  /**
   * Address and name data for a call endpoint.
   **/
  public QueueConversationEventTopicInternalMessage toAddress(QueueConversationEventTopicAddress toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("toAddress")
  public QueueConversationEventTopicAddress getToAddress() {
    return toAddress;
  }
  public void setToAddress(QueueConversationEventTopicAddress toAddress) {
    this.toAddress = toAddress;
  }


  /**
   * Address and name data for a call endpoint.
   **/
  public QueueConversationEventTopicInternalMessage fromAddress(QueueConversationEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("fromAddress")
  public QueueConversationEventTopicAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(QueueConversationEventTopicAddress fromAddress) {
    this.fromAddress = fromAddress;
  }


  /**
   * The messages sent on this communication channel.
   **/
  public QueueConversationEventTopicInternalMessage messages(List<QueueConversationEventTopicInternalMessageDetails> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messages sent on this communication channel.")
  @JsonProperty("messages")
  public List<QueueConversationEventTopicInternalMessageDetails> getMessages() {
    return messages;
  }
  public void setMessages(List<QueueConversationEventTopicInternalMessageDetails> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicInternalMessage queueConversationEventTopicInternalMessage = (QueueConversationEventTopicInternalMessage) o;

    return Objects.equals(this.id, queueConversationEventTopicInternalMessage.id) &&
            Objects.equals(this.state, queueConversationEventTopicInternalMessage.state) &&
            Objects.equals(this.initialState, queueConversationEventTopicInternalMessage.initialState) &&
            Objects.equals(this.provider, queueConversationEventTopicInternalMessage.provider) &&
            Objects.equals(this.peerId, queueConversationEventTopicInternalMessage.peerId) &&
            Objects.equals(this.disconnectType, queueConversationEventTopicInternalMessage.disconnectType) &&
            Objects.equals(this.connectedTime, queueConversationEventTopicInternalMessage.connectedTime) &&
            Objects.equals(this.disconnectedTime, queueConversationEventTopicInternalMessage.disconnectedTime) &&
            Objects.equals(this.targetUserId, queueConversationEventTopicInternalMessage.targetUserId) &&
            Objects.equals(this.sourceUserId, queueConversationEventTopicInternalMessage.sourceUserId) &&
            Objects.equals(this.toAddress, queueConversationEventTopicInternalMessage.toAddress) &&
            Objects.equals(this.fromAddress, queueConversationEventTopicInternalMessage.fromAddress) &&
            Objects.equals(this.messages, queueConversationEventTopicInternalMessage.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, initialState, provider, peerId, disconnectType, connectedTime, disconnectedTime, targetUserId, sourceUserId, toAddress, fromAddress, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicInternalMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
    sb.append("    sourceUserId: ").append(toIndentedString(sourceUserId)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

