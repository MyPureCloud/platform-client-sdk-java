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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicAddress;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicQueueMediaSettings;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicCobrowse
 */

public class QueueConversationVideoEventTopicCobrowse  implements Serializable {
  

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
    DIALING("dialing"),
    CONTACTING("contacting"),
    OFFERING("offering"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    TERMINATED("terminated"),
    NONE("none");

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
  private String id = null;
  private QueueConversationVideoEventTopicAddress self = null;
  private String roomId = null;
  private String cobrowseSessionId = null;
  private String cobrowseRole = null;
  private List<String> controlling = new ArrayList<String>();
  private String viewerUrl = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;
  private Date providerEventTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private QueueConversationVideoEventTopicWrapup wrapup = null;
  private QueueConversationVideoEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private QueueConversationVideoEventTopicQueueMediaSettings queueMediaSettings = null;

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse state(StateEnum state) {
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
  public QueueConversationVideoEventTopicCobrowse initialState(InitialStateEnum initialState) {
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
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public QueueConversationVideoEventTopicCobrowse disconnectType(DisconnectTypeEnum disconnectType) {
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
   * A globally unique identifier for this communication.
   **/
  public QueueConversationVideoEventTopicCobrowse id(String id) {
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
   * Address and name data for a call endpoint.
   **/
  public QueueConversationVideoEventTopicCobrowse self(QueueConversationVideoEventTopicAddress self) {
    this.self = self;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("self")
  public QueueConversationVideoEventTopicAddress getSelf() {
    return self;
  }
  public void setSelf(QueueConversationVideoEventTopicAddress self) {
    this.self = self;
  }


  /**
   * The room id for the chat.
   **/
  public QueueConversationVideoEventTopicCobrowse roomId(String roomId) {
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
   * The co-browse session ID.
   **/
  public QueueConversationVideoEventTopicCobrowse cobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The co-browse session ID.")
  @JsonProperty("cobrowseSessionId")
  public String getCobrowseSessionId() {
    return cobrowseSessionId;
  }
  public void setCobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
  }


  /**
   * This value identifies the role of the co-browse client within the co-browse session (a client is a sharer or a viewer).
   **/
  public QueueConversationVideoEventTopicCobrowse cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value identifies the role of the co-browse client within the co-browse session (a client is a sharer or a viewer).")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }


  /**
   * ID of co-browse participants for which this client has been granted control (list is empty if this client cannot control any shared pages).
   **/
  public QueueConversationVideoEventTopicCobrowse controlling(List<String> controlling) {
    this.controlling = controlling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of co-browse participants for which this client has been granted control (list is empty if this client cannot control any shared pages).")
  @JsonProperty("controlling")
  public List<String> getControlling() {
    return controlling;
  }
  public void setControlling(List<String> controlling) {
    this.controlling = controlling;
  }


  /**
   * The URL that can be used to open co-browse session in web browser.
   **/
  public QueueConversationVideoEventTopicCobrowse viewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL that can be used to open co-browse session in web browser.")
  @JsonProperty("viewerUrl")
  public String getViewerUrl() {
    return viewerUrl;
  }
  public void setViewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
  }


  /**
   * The source provider of the co-browse communication.
   **/
  public QueueConversationVideoEventTopicCobrowse provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider of the co-browse communication.")
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
  public QueueConversationVideoEventTopicCobrowse scriptId(String scriptId) {
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
  public QueueConversationVideoEventTopicCobrowse peerId(String peerId) {
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
   * The time when the provider event which triggered this conversation update happened in the corrected provider clock (milliseconds since 1970-01-01 00:00:00 UTC).
   **/
  public QueueConversationVideoEventTopicCobrowse providerEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the provider event which triggered this conversation update happened in the corrected provider clock (milliseconds since 1970-01-01 00:00:00 UTC).")
  @JsonProperty("providerEventTime")
  public Date getProviderEventTime() {
    return providerEventTime;
  }
  public void setProviderEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
  }


  /**
   * The timestamp when this communication was connected in the cloud clock.
   **/
  public QueueConversationVideoEventTopicCobrowse connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicCobrowse disconnectedTime(Date disconnectedTime) {
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
   * Call wrap up or disposition data.
   **/
  public QueueConversationVideoEventTopicCobrowse wrapup(QueueConversationVideoEventTopicWrapup wrapup) {
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
  public QueueConversationVideoEventTopicCobrowse afterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
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
  public QueueConversationVideoEventTopicCobrowse afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
   * Represents the queue setting for this media.
   **/
  public QueueConversationVideoEventTopicCobrowse queueMediaSettings(QueueConversationVideoEventTopicQueueMediaSettings queueMediaSettings) {
    this.queueMediaSettings = queueMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the queue setting for this media.")
  @JsonProperty("queueMediaSettings")
  public QueueConversationVideoEventTopicQueueMediaSettings getQueueMediaSettings() {
    return queueMediaSettings;
  }
  public void setQueueMediaSettings(QueueConversationVideoEventTopicQueueMediaSettings queueMediaSettings) {
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
    QueueConversationVideoEventTopicCobrowse queueConversationVideoEventTopicCobrowse = (QueueConversationVideoEventTopicCobrowse) o;

    return Objects.equals(this.state, queueConversationVideoEventTopicCobrowse.state) &&
            Objects.equals(this.initialState, queueConversationVideoEventTopicCobrowse.initialState) &&
            Objects.equals(this.disconnectType, queueConversationVideoEventTopicCobrowse.disconnectType) &&
            Objects.equals(this.id, queueConversationVideoEventTopicCobrowse.id) &&
            Objects.equals(this.self, queueConversationVideoEventTopicCobrowse.self) &&
            Objects.equals(this.roomId, queueConversationVideoEventTopicCobrowse.roomId) &&
            Objects.equals(this.cobrowseSessionId, queueConversationVideoEventTopicCobrowse.cobrowseSessionId) &&
            Objects.equals(this.cobrowseRole, queueConversationVideoEventTopicCobrowse.cobrowseRole) &&
            Objects.equals(this.controlling, queueConversationVideoEventTopicCobrowse.controlling) &&
            Objects.equals(this.viewerUrl, queueConversationVideoEventTopicCobrowse.viewerUrl) &&
            Objects.equals(this.provider, queueConversationVideoEventTopicCobrowse.provider) &&
            Objects.equals(this.scriptId, queueConversationVideoEventTopicCobrowse.scriptId) &&
            Objects.equals(this.peerId, queueConversationVideoEventTopicCobrowse.peerId) &&
            Objects.equals(this.providerEventTime, queueConversationVideoEventTopicCobrowse.providerEventTime) &&
            Objects.equals(this.connectedTime, queueConversationVideoEventTopicCobrowse.connectedTime) &&
            Objects.equals(this.disconnectedTime, queueConversationVideoEventTopicCobrowse.disconnectedTime) &&
            Objects.equals(this.wrapup, queueConversationVideoEventTopicCobrowse.wrapup) &&
            Objects.equals(this.afterCallWork, queueConversationVideoEventTopicCobrowse.afterCallWork) &&
            Objects.equals(this.afterCallWorkRequired, queueConversationVideoEventTopicCobrowse.afterCallWorkRequired) &&
            Objects.equals(this.queueMediaSettings, queueConversationVideoEventTopicCobrowse.queueMediaSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, initialState, disconnectType, id, self, roomId, cobrowseSessionId, cobrowseRole, controlling, viewerUrl, provider, scriptId, peerId, providerEventTime, connectedTime, disconnectedTime, wrapup, afterCallWork, afterCallWorkRequired, queueMediaSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicCobrowse {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    cobrowseSessionId: ").append(toIndentedString(cobrowseSessionId)).append("\n");
    sb.append("    cobrowseRole: ").append(toIndentedString(cobrowseRole)).append("\n");
    sb.append("    controlling: ").append(toIndentedString(controlling)).append("\n");
    sb.append("    viewerUrl: ").append(toIndentedString(viewerUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    providerEventTime: ").append(toIndentedString(providerEventTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
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

