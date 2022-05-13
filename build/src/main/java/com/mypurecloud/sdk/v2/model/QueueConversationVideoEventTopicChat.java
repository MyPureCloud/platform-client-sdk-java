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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicChat
 */

public class QueueConversationVideoEventTopicChat  implements Serializable {
  

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
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;
  private String roomId = null;
  private String avatarImageUrl = null;
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
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private QueueConversationVideoEventTopicJourneyContext journeyContext = null;
  private QueueConversationVideoEventTopicWrapup wrapup = null;
  private QueueConversationVideoEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;

  
  /**
   * The connection state of this communication.
   **/
  public QueueConversationVideoEventTopicChat state(StateEnum state) {
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
  public QueueConversationVideoEventTopicChat id(String id) {
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
   * The source provider of the chat.
   **/
  public QueueConversationVideoEventTopicChat provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider of the chat.")
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
  public QueueConversationVideoEventTopicChat scriptId(String scriptId) {
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
  public QueueConversationVideoEventTopicChat peerId(String peerId) {
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
   * The room id for the chat.
   **/
  public QueueConversationVideoEventTopicChat roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The room id for the chat.")
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  /**
   * The avatar for the chat (if available).
   **/
  public QueueConversationVideoEventTopicChat avatarImageUrl(String avatarImageUrl) {
    this.avatarImageUrl = avatarImageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The avatar for the chat (if available).")
  @JsonProperty("avatarImageUrl")
  public String getAvatarImageUrl() {
    return avatarImageUrl;
  }
  public void setAvatarImageUrl(String avatarImageUrl) {
    this.avatarImageUrl = avatarImageUrl;
  }


  /**
   * True if this call is held and the person on this side hears silence.
   **/
  public QueueConversationVideoEventTopicChat held(Boolean held) {
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
  public QueueConversationVideoEventTopicChat disconnectType(DisconnectTypeEnum disconnectType) {
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
   * The timestamp the chat was placed on hold in the cloud clock if the chat is currently on hold.
   **/
  public QueueConversationVideoEventTopicChat startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp the chat was placed on hold in the cloud clock if the chat is currently on hold.")
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
  public QueueConversationVideoEventTopicChat connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicChat disconnectedTime(Date disconnectedTime) {
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
   **/
  public QueueConversationVideoEventTopicChat journeyContext(QueueConversationVideoEventTopicJourneyContext journeyContext) {
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
   * Call wrap up or disposition data.
   **/
  public QueueConversationVideoEventTopicChat wrapup(QueueConversationVideoEventTopicWrapup wrapup) {
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
  public QueueConversationVideoEventTopicChat afterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
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
  public QueueConversationVideoEventTopicChat afterCallWorkRequired(Boolean afterCallWorkRequired) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationVideoEventTopicChat queueConversationVideoEventTopicChat = (QueueConversationVideoEventTopicChat) o;

    return Objects.equals(this.state, queueConversationVideoEventTopicChat.state) &&
            Objects.equals(this.id, queueConversationVideoEventTopicChat.id) &&
            Objects.equals(this.provider, queueConversationVideoEventTopicChat.provider) &&
            Objects.equals(this.scriptId, queueConversationVideoEventTopicChat.scriptId) &&
            Objects.equals(this.peerId, queueConversationVideoEventTopicChat.peerId) &&
            Objects.equals(this.roomId, queueConversationVideoEventTopicChat.roomId) &&
            Objects.equals(this.avatarImageUrl, queueConversationVideoEventTopicChat.avatarImageUrl) &&
            Objects.equals(this.held, queueConversationVideoEventTopicChat.held) &&
            Objects.equals(this.disconnectType, queueConversationVideoEventTopicChat.disconnectType) &&
            Objects.equals(this.startHoldTime, queueConversationVideoEventTopicChat.startHoldTime) &&
            Objects.equals(this.connectedTime, queueConversationVideoEventTopicChat.connectedTime) &&
            Objects.equals(this.disconnectedTime, queueConversationVideoEventTopicChat.disconnectedTime) &&
            Objects.equals(this.journeyContext, queueConversationVideoEventTopicChat.journeyContext) &&
            Objects.equals(this.wrapup, queueConversationVideoEventTopicChat.wrapup) &&
            Objects.equals(this.afterCallWork, queueConversationVideoEventTopicChat.afterCallWork) &&
            Objects.equals(this.afterCallWorkRequired, queueConversationVideoEventTopicChat.afterCallWorkRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, provider, scriptId, peerId, roomId, avatarImageUrl, held, disconnectType, startHoldTime, connectedTime, disconnectedTime, journeyContext, wrapup, afterCallWork, afterCallWorkRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicChat {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    avatarImageUrl: ").append(toIndentedString(avatarImageUrl)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
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

