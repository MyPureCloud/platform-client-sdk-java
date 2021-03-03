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
    ALERTING("ALERTING"),
    DIALING("DIALING"),
    CONTACTING("CONTACTING"),
    OFFERING("OFFERING"),
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED"),
    TERMINATED("TERMINATED"),
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
  private Object additionalProperties = null;

  
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
  public QueueConversationVideoEventTopicCobrowse disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationVideoEventTopicCobrowse id(String id) {
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
  public QueueConversationVideoEventTopicCobrowse self(QueueConversationVideoEventTopicAddress self) {
    this.self = self;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("self")
  public QueueConversationVideoEventTopicAddress getSelf() {
    return self;
  }
  public void setSelf(QueueConversationVideoEventTopicAddress self) {
    this.self = self;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse cobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseSessionId")
  public String getCobrowseSessionId() {
    return cobrowseSessionId;
  }
  public void setCobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse controlling(List<String> controlling) {
    this.controlling = controlling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("controlling")
  public List<String> getControlling() {
    return controlling;
  }
  public void setControlling(List<String> controlling) {
    this.controlling = controlling;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse viewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("viewerUrl")
  public String getViewerUrl() {
    return viewerUrl;
  }
  public void setViewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse provider(String provider) {
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
  public QueueConversationVideoEventTopicCobrowse scriptId(String scriptId) {
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
  public QueueConversationVideoEventTopicCobrowse peerId(String peerId) {
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
  public QueueConversationVideoEventTopicCobrowse providerEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providerEventTime")
  public Date getProviderEventTime() {
    return providerEventTime;
  }
  public void setProviderEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicCobrowse connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicCobrowse disconnectedTime(Date disconnectedTime) {
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
  public QueueConversationVideoEventTopicCobrowse wrapup(QueueConversationVideoEventTopicWrapup wrapup) {
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
  public QueueConversationVideoEventTopicCobrowse afterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
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
  public QueueConversationVideoEventTopicCobrowse afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
  public QueueConversationVideoEventTopicCobrowse additionalProperties(Object additionalProperties) {
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
    QueueConversationVideoEventTopicCobrowse queueConversationVideoEventTopicCobrowse = (QueueConversationVideoEventTopicCobrowse) o;
    return Objects.equals(this.state, queueConversationVideoEventTopicCobrowse.state) &&
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
        Objects.equals(this.additionalProperties, queueConversationVideoEventTopicCobrowse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, disconnectType, id, self, roomId, cobrowseSessionId, cobrowseRole, controlling, viewerUrl, provider, scriptId, peerId, providerEventTime, connectedTime, disconnectedTime, wrapup, afterCallWork, afterCallWorkRequired, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicCobrowse {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

