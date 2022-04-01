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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicAddress;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicObject;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEventTopicVideo
 */

public class QueueConversationEventTopicVideo  implements Serializable {
  

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
  private QueueConversationEventTopicAddress self = null;
  private String id = null;
  private String context = null;
  private Boolean audioMuted = null;
  private Boolean videoMuted = null;
  private Boolean sharingScreen = null;
  private QueueConversationEventTopicObject peerCount = null;
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
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private List<String> msids = new ArrayList<String>();
  private QueueConversationEventTopicWrapup wrapup = null;
  private QueueConversationEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;

  
  /**
   * The connection state of this communication.
   **/
  public QueueConversationEventTopicVideo state(StateEnum state) {
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
   * Address and name data for a call endpoint.
   **/
  public QueueConversationEventTopicVideo self(QueueConversationEventTopicAddress self) {
    this.self = self;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("self")
  public QueueConversationEventTopicAddress getSelf() {
    return self;
  }
  public void setSelf(QueueConversationEventTopicAddress self) {
    this.self = self;
  }

  
  /**
   * A globally unique identifier for this communication.
   **/
  public QueueConversationEventTopicVideo id(String id) {
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
   * The room id context (xmpp jid) for the conference session.
   **/
  public QueueConversationEventTopicVideo context(String context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The room id context (xmpp jid) for the conference session.")
  @JsonProperty("context")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  
  /**
   * Indicates whether this participant has muted their outgoing audio.
   **/
  public QueueConversationEventTopicVideo audioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this participant has muted their outgoing audio.")
  @JsonProperty("audioMuted")
  public Boolean getAudioMuted() {
    return audioMuted;
  }
  public void setAudioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
  }

  
  /**
   * Indicates whether this participant has muted/paused their outgoing video.
   **/
  public QueueConversationEventTopicVideo videoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this participant has muted/paused their outgoing video.")
  @JsonProperty("videoMuted")
  public Boolean getVideoMuted() {
    return videoMuted;
  }
  public void setVideoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
  }

  
  /**
   * Indicates whether this participant is sharing their screen to the session.
   **/
  public QueueConversationEventTopicVideo sharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this participant is sharing their screen to the session.")
  @JsonProperty("sharingScreen")
  public Boolean getSharingScreen() {
    return sharingScreen;
  }
  public void setSharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
  }

  
  /**
   * The number of peer participants from the perspective of the participant in the conference.
   **/
  public QueueConversationEventTopicVideo peerCount(QueueConversationEventTopicObject peerCount) {
    this.peerCount = peerCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of peer participants from the perspective of the participant in the conference.")
  @JsonProperty("peerCount")
  public QueueConversationEventTopicObject getPeerCount() {
    return peerCount;
  }
  public void setPeerCount(QueueConversationEventTopicObject peerCount) {
    this.peerCount = peerCount;
  }

  
  /**
   * The media provider controlling the video.
   **/
  public QueueConversationEventTopicVideo provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media provider controlling the video.")
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
  public QueueConversationEventTopicVideo scriptId(String scriptId) {
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
  public QueueConversationEventTopicVideo peerId(String peerId) {
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
  public QueueConversationEventTopicVideo disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationEventTopicVideo connectedTime(Date connectedTime) {
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
  public QueueConversationEventTopicVideo disconnectedTime(Date disconnectedTime) {
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
   * List of media stream ids
   **/
  public QueueConversationEventTopicVideo msids(List<String> msids) {
    this.msids = msids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of media stream ids")
  @JsonProperty("msids")
  public List<String> getMsids() {
    return msids;
  }
  public void setMsids(List<String> msids) {
    this.msids = msids;
  }

  
  /**
   * Call wrap up or disposition data.
   **/
  public QueueConversationEventTopicVideo wrapup(QueueConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Call wrap up or disposition data.")
  @JsonProperty("wrapup")
  public QueueConversationEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * A communication's after-call work data.
   **/
  public QueueConversationEventTopicVideo afterCallWork(QueueConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A communication's after-call work data.")
  @JsonProperty("afterCallWork")
  public QueueConversationEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(QueueConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   * Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested.
   **/
  public QueueConversationEventTopicVideo afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
    QueueConversationEventTopicVideo queueConversationEventTopicVideo = (QueueConversationEventTopicVideo) o;
    return Objects.equals(this.state, queueConversationEventTopicVideo.state) &&
        Objects.equals(this.self, queueConversationEventTopicVideo.self) &&
        Objects.equals(this.id, queueConversationEventTopicVideo.id) &&
        Objects.equals(this.context, queueConversationEventTopicVideo.context) &&
        Objects.equals(this.audioMuted, queueConversationEventTopicVideo.audioMuted) &&
        Objects.equals(this.videoMuted, queueConversationEventTopicVideo.videoMuted) &&
        Objects.equals(this.sharingScreen, queueConversationEventTopicVideo.sharingScreen) &&
        Objects.equals(this.peerCount, queueConversationEventTopicVideo.peerCount) &&
        Objects.equals(this.provider, queueConversationEventTopicVideo.provider) &&
        Objects.equals(this.scriptId, queueConversationEventTopicVideo.scriptId) &&
        Objects.equals(this.peerId, queueConversationEventTopicVideo.peerId) &&
        Objects.equals(this.disconnectType, queueConversationEventTopicVideo.disconnectType) &&
        Objects.equals(this.connectedTime, queueConversationEventTopicVideo.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationEventTopicVideo.disconnectedTime) &&
        Objects.equals(this.msids, queueConversationEventTopicVideo.msids) &&
        Objects.equals(this.wrapup, queueConversationEventTopicVideo.wrapup) &&
        Objects.equals(this.afterCallWork, queueConversationEventTopicVideo.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, queueConversationEventTopicVideo.afterCallWorkRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, self, id, context, audioMuted, videoMuted, sharingScreen, peerCount, provider, scriptId, peerId, disconnectType, connectedTime, disconnectedTime, msids, wrapup, afterCallWork, afterCallWorkRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicVideo {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    audioMuted: ").append(toIndentedString(audioMuted)).append("\n");
    sb.append("    videoMuted: ").append(toIndentedString(videoMuted)).append("\n");
    sb.append("    sharingScreen: ").append(toIndentedString(sharingScreen)).append("\n");
    sb.append("    peerCount: ").append(toIndentedString(peerCount)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    msids: ").append(toIndentedString(msids)).append("\n");
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

