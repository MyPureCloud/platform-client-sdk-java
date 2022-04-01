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
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicAddress;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicObject;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicVideo
 */

public class QueueConversationSocialExpressionEventTopicVideo  implements Serializable {
  

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
  private QueueConversationSocialExpressionEventTopicAddress self = null;
  private String id = null;
  private String context = null;
  private Boolean audioMuted = null;
  private Boolean videoMuted = null;
  private Boolean sharingScreen = null;
  private QueueConversationSocialExpressionEventTopicObject peerCount = null;
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
  private QueueConversationSocialExpressionEventTopicWrapup wrapup = null;
  private QueueConversationSocialExpressionEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;

  
  /**
   * The connection state of this communication.
   **/
  public QueueConversationSocialExpressionEventTopicVideo state(StateEnum state) {
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
  public QueueConversationSocialExpressionEventTopicVideo self(QueueConversationSocialExpressionEventTopicAddress self) {
    this.self = self;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address and name data for a call endpoint.")
  @JsonProperty("self")
  public QueueConversationSocialExpressionEventTopicAddress getSelf() {
    return self;
  }
  public void setSelf(QueueConversationSocialExpressionEventTopicAddress self) {
    this.self = self;
  }

  
  /**
   * A globally unique identifier for this communication.
   **/
  public QueueConversationSocialExpressionEventTopicVideo id(String id) {
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
  public QueueConversationSocialExpressionEventTopicVideo context(String context) {
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
  public QueueConversationSocialExpressionEventTopicVideo audioMuted(Boolean audioMuted) {
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
  public QueueConversationSocialExpressionEventTopicVideo videoMuted(Boolean videoMuted) {
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
  public QueueConversationSocialExpressionEventTopicVideo sharingScreen(Boolean sharingScreen) {
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
  public QueueConversationSocialExpressionEventTopicVideo peerCount(QueueConversationSocialExpressionEventTopicObject peerCount) {
    this.peerCount = peerCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of peer participants from the perspective of the participant in the conference.")
  @JsonProperty("peerCount")
  public QueueConversationSocialExpressionEventTopicObject getPeerCount() {
    return peerCount;
  }
  public void setPeerCount(QueueConversationSocialExpressionEventTopicObject peerCount) {
    this.peerCount = peerCount;
  }

  
  /**
   * The media provider controlling the video.
   **/
  public QueueConversationSocialExpressionEventTopicVideo provider(String provider) {
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
  public QueueConversationSocialExpressionEventTopicVideo scriptId(String scriptId) {
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
  public QueueConversationSocialExpressionEventTopicVideo peerId(String peerId) {
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
  public QueueConversationSocialExpressionEventTopicVideo disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationSocialExpressionEventTopicVideo connectedTime(Date connectedTime) {
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
  public QueueConversationSocialExpressionEventTopicVideo disconnectedTime(Date disconnectedTime) {
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
  public QueueConversationSocialExpressionEventTopicVideo msids(List<String> msids) {
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
  public QueueConversationSocialExpressionEventTopicVideo wrapup(QueueConversationSocialExpressionEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Call wrap up or disposition data.")
  @JsonProperty("wrapup")
  public QueueConversationSocialExpressionEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationSocialExpressionEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * A communication's after-call work data.
   **/
  public QueueConversationSocialExpressionEventTopicVideo afterCallWork(QueueConversationSocialExpressionEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A communication's after-call work data.")
  @JsonProperty("afterCallWork")
  public QueueConversationSocialExpressionEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(QueueConversationSocialExpressionEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   * Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested.
   **/
  public QueueConversationSocialExpressionEventTopicVideo afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
    QueueConversationSocialExpressionEventTopicVideo queueConversationSocialExpressionEventTopicVideo = (QueueConversationSocialExpressionEventTopicVideo) o;
    return Objects.equals(this.state, queueConversationSocialExpressionEventTopicVideo.state) &&
        Objects.equals(this.self, queueConversationSocialExpressionEventTopicVideo.self) &&
        Objects.equals(this.id, queueConversationSocialExpressionEventTopicVideo.id) &&
        Objects.equals(this.context, queueConversationSocialExpressionEventTopicVideo.context) &&
        Objects.equals(this.audioMuted, queueConversationSocialExpressionEventTopicVideo.audioMuted) &&
        Objects.equals(this.videoMuted, queueConversationSocialExpressionEventTopicVideo.videoMuted) &&
        Objects.equals(this.sharingScreen, queueConversationSocialExpressionEventTopicVideo.sharingScreen) &&
        Objects.equals(this.peerCount, queueConversationSocialExpressionEventTopicVideo.peerCount) &&
        Objects.equals(this.provider, queueConversationSocialExpressionEventTopicVideo.provider) &&
        Objects.equals(this.scriptId, queueConversationSocialExpressionEventTopicVideo.scriptId) &&
        Objects.equals(this.peerId, queueConversationSocialExpressionEventTopicVideo.peerId) &&
        Objects.equals(this.disconnectType, queueConversationSocialExpressionEventTopicVideo.disconnectType) &&
        Objects.equals(this.connectedTime, queueConversationSocialExpressionEventTopicVideo.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationSocialExpressionEventTopicVideo.disconnectedTime) &&
        Objects.equals(this.msids, queueConversationSocialExpressionEventTopicVideo.msids) &&
        Objects.equals(this.wrapup, queueConversationSocialExpressionEventTopicVideo.wrapup) &&
        Objects.equals(this.afterCallWork, queueConversationSocialExpressionEventTopicVideo.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, queueConversationSocialExpressionEventTopicVideo.afterCallWorkRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, self, id, context, audioMuted, videoMuted, sharingScreen, peerCount, provider, scriptId, peerId, disconnectType, connectedTime, disconnectedTime, msids, wrapup, afterCallWork, afterCallWorkRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicVideo {\n");
    
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

