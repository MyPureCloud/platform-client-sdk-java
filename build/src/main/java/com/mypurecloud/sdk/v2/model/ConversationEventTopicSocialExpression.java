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
import com.mypurecloud.sdk.v2.model.ConversationEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ConversationEventTopicSocialExpression
 */

public class ConversationEventTopicSocialExpression  implements Serializable {
  

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
  private String id = null;
  private String socialMediaId = null;
  private String socialMediaHub = null;
  private String socialUserName = null;
  private String previewText = null;
  private String recordingId = null;
  private Boolean held = null;
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
  private ConversationEventTopicWrapup wrapup = null;
  private ConversationEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public ConversationEventTopicSocialExpression state(StateEnum state) {
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
  public ConversationEventTopicSocialExpression id(String id) {
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
  public ConversationEventTopicSocialExpression socialMediaId(String socialMediaId) {
    this.socialMediaId = socialMediaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialMediaId")
  public String getSocialMediaId() {
    return socialMediaId;
  }
  public void setSocialMediaId(String socialMediaId) {
    this.socialMediaId = socialMediaId;
  }

  
  /**
   **/
  public ConversationEventTopicSocialExpression socialMediaHub(String socialMediaHub) {
    this.socialMediaHub = socialMediaHub;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialMediaHub")
  public String getSocialMediaHub() {
    return socialMediaHub;
  }
  public void setSocialMediaHub(String socialMediaHub) {
    this.socialMediaHub = socialMediaHub;
  }

  
  /**
   **/
  public ConversationEventTopicSocialExpression socialUserName(String socialUserName) {
    this.socialUserName = socialUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialUserName")
  public String getSocialUserName() {
    return socialUserName;
  }
  public void setSocialUserName(String socialUserName) {
    this.socialUserName = socialUserName;
  }

  
  /**
   **/
  public ConversationEventTopicSocialExpression previewText(String previewText) {
    this.previewText = previewText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewText")
  public String getPreviewText() {
    return previewText;
  }
  public void setPreviewText(String previewText) {
    this.previewText = previewText;
  }

  
  /**
   **/
  public ConversationEventTopicSocialExpression recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordingId")
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }

  
  /**
   **/
  public ConversationEventTopicSocialExpression held(Boolean held) {
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
  public ConversationEventTopicSocialExpression provider(String provider) {
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
  public ConversationEventTopicSocialExpression scriptId(String scriptId) {
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
  public ConversationEventTopicSocialExpression peerId(String peerId) {
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
  public ConversationEventTopicSocialExpression disconnectType(DisconnectTypeEnum disconnectType) {
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
  public ConversationEventTopicSocialExpression startHoldTime(Date startHoldTime) {
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
  public ConversationEventTopicSocialExpression connectedTime(Date connectedTime) {
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
  public ConversationEventTopicSocialExpression disconnectedTime(Date disconnectedTime) {
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
  public ConversationEventTopicSocialExpression wrapup(ConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public ConversationEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public ConversationEventTopicSocialExpression afterCallWork(ConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("afterCallWork")
  public ConversationEventTopicAfterCallWork getAfterCallWork() {
    return afterCallWork;
  }
  public void setAfterCallWork(ConversationEventTopicAfterCallWork afterCallWork) {
    this.afterCallWork = afterCallWork;
  }

  
  /**
   **/
  public ConversationEventTopicSocialExpression afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
  public ConversationEventTopicSocialExpression additionalProperties(Object additionalProperties) {
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
    ConversationEventTopicSocialExpression conversationEventTopicSocialExpression = (ConversationEventTopicSocialExpression) o;
    return Objects.equals(this.state, conversationEventTopicSocialExpression.state) &&
        Objects.equals(this.id, conversationEventTopicSocialExpression.id) &&
        Objects.equals(this.socialMediaId, conversationEventTopicSocialExpression.socialMediaId) &&
        Objects.equals(this.socialMediaHub, conversationEventTopicSocialExpression.socialMediaHub) &&
        Objects.equals(this.socialUserName, conversationEventTopicSocialExpression.socialUserName) &&
        Objects.equals(this.previewText, conversationEventTopicSocialExpression.previewText) &&
        Objects.equals(this.recordingId, conversationEventTopicSocialExpression.recordingId) &&
        Objects.equals(this.held, conversationEventTopicSocialExpression.held) &&
        Objects.equals(this.provider, conversationEventTopicSocialExpression.provider) &&
        Objects.equals(this.scriptId, conversationEventTopicSocialExpression.scriptId) &&
        Objects.equals(this.peerId, conversationEventTopicSocialExpression.peerId) &&
        Objects.equals(this.disconnectType, conversationEventTopicSocialExpression.disconnectType) &&
        Objects.equals(this.startHoldTime, conversationEventTopicSocialExpression.startHoldTime) &&
        Objects.equals(this.connectedTime, conversationEventTopicSocialExpression.connectedTime) &&
        Objects.equals(this.disconnectedTime, conversationEventTopicSocialExpression.disconnectedTime) &&
        Objects.equals(this.wrapup, conversationEventTopicSocialExpression.wrapup) &&
        Objects.equals(this.afterCallWork, conversationEventTopicSocialExpression.afterCallWork) &&
        Objects.equals(this.afterCallWorkRequired, conversationEventTopicSocialExpression.afterCallWorkRequired) &&
        Objects.equals(this.additionalProperties, conversationEventTopicSocialExpression.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, socialMediaId, socialMediaHub, socialUserName, previewText, recordingId, held, provider, scriptId, peerId, disconnectType, startHoldTime, connectedTime, disconnectedTime, wrapup, afterCallWork, afterCallWorkRequired, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicSocialExpression {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    socialMediaId: ").append(toIndentedString(socialMediaId)).append("\n");
    sb.append("    socialMediaHub: ").append(toIndentedString(socialMediaHub)).append("\n");
    sb.append("    socialUserName: ").append(toIndentedString(socialUserName)).append("\n");
    sb.append("    previewText: ").append(toIndentedString(previewText)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
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

