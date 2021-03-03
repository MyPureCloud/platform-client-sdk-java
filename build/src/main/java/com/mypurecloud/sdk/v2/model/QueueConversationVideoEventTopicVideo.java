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
 * QueueConversationVideoEventTopicVideo
 */

public class QueueConversationVideoEventTopicVideo  implements Serializable {
  

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
  private QueueConversationVideoEventTopicAddress self = null;
  private String id = null;
  private String context = null;
  private Boolean audioMuted = null;
  private Boolean videoMuted = null;
  private Boolean sharingScreen = null;
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
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private List<String> msids = new ArrayList<String>();
  private QueueConversationVideoEventTopicWrapup wrapup = null;
  private QueueConversationVideoEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationVideoEventTopicVideo state(StateEnum state) {
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
  public QueueConversationVideoEventTopicVideo self(QueueConversationVideoEventTopicAddress self) {
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
  public QueueConversationVideoEventTopicVideo id(String id) {
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
  public QueueConversationVideoEventTopicVideo context(String context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("context")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicVideo audioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("audioMuted")
  public Boolean getAudioMuted() {
    return audioMuted;
  }
  public void setAudioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicVideo videoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videoMuted")
  public Boolean getVideoMuted() {
    return videoMuted;
  }
  public void setVideoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicVideo sharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharingScreen")
  public Boolean getSharingScreen() {
    return sharingScreen;
  }
  public void setSharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicVideo provider(String provider) {
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
  public QueueConversationVideoEventTopicVideo scriptId(String scriptId) {
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
  public QueueConversationVideoEventTopicVideo peerId(String peerId) {
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
  public QueueConversationVideoEventTopicVideo disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationVideoEventTopicVideo connectedTime(Date connectedTime) {
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
  public QueueConversationVideoEventTopicVideo disconnectedTime(Date disconnectedTime) {
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
  public QueueConversationVideoEventTopicVideo msids(List<String> msids) {
    this.msids = msids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("msids")
  public List<String> getMsids() {
    return msids;
  }
  public void setMsids(List<String> msids) {
    this.msids = msids;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicVideo wrapup(QueueConversationVideoEventTopicWrapup wrapup) {
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
  public QueueConversationVideoEventTopicVideo afterCallWork(QueueConversationVideoEventTopicAfterCallWork afterCallWork) {
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
  public QueueConversationVideoEventTopicVideo afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
  public QueueConversationVideoEventTopicVideo additionalProperties(Object additionalProperties) {
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
    QueueConversationVideoEventTopicVideo queueConversationVideoEventTopicVideo = (QueueConversationVideoEventTopicVideo) o;
    return Objects.equals(this.state, queueConversationVideoEventTopicVideo.state) &&
        Objects.equals(this.self, queueConversationVideoEventTopicVideo.self) &&
        Objects.equals(this.id, queueConversationVideoEventTopicVideo.id) &&
        Objects.equals(this.context, queueConversationVideoEventTopicVideo.context) &&
        Objects.equals(this.audioMuted, queueConversationVideoEventTopicVideo.audioMuted) &&
        Objects.equals(this.videoMuted, queueConversationVideoEventTopicVideo.videoMuted) &&
        Objects.equals(this.sharingScreen, queueConversationVideoEventTopicVideo.sharingScreen) &&
        Objects.equals(this.provider, queueConversationVideoEventTopicVideo.provider) &&
        Objects.equals(this.scriptId, queueConversationVideoEventTopicVideo.scriptId) &&
        Objects.equals(this.peerId, queueConversationVideoEventTopicVideo.peerId) &&
        Objects.equals(this.disconnectType, queueConversationVideoEventTopicVideo.disconnectType) &&
        Objects.equals(this.connectedTime, queueConversationVideoEventTopicVideo.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationVideoEventTopicVideo.disconnectedTime) &&
        Objects.equals(this.msids, queueConversationVideoEventTopicVideo.msids) &&
        Objects.equals(this.wrapup, queueConversationVideoEventTopicVideo.wrapup) &&
        Objects.equals(this.afterCallWork, queueConversationVideoEventTopicVideo.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, queueConversationVideoEventTopicVideo.afterCallWorkRequired) &&
        Objects.equals(this.additionalProperties, queueConversationVideoEventTopicVideo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, self, id, context, audioMuted, videoMuted, sharingScreen, provider, scriptId, peerId, disconnectType, connectedTime, disconnectedTime, msids, wrapup, afterCallWork, afterCallWorkRequired, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicVideo {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    audioMuted: ").append(toIndentedString(audioMuted)).append("\n");
    sb.append("    videoMuted: ").append(toIndentedString(videoMuted)).append("\n");
    sb.append("    sharingScreen: ").append(toIndentedString(sharingScreen)).append("\n");
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

