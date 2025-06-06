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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicAfterCallWork;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicAttachment;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicQueueMediaSettings;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEventTopicEmail
 */

public class QueueConversationEventTopicEmail  implements Serializable {
  
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
    DISCONNECTED("disconnected"),
    NONE("none"),
    TRANSMITTING("transmitting"),
    PARKED("parked");

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
    DISCONNECTED("disconnected"),
    NONE("none"),
    TRANSMITTING("transmitting"),
    PARKED("parked");

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
  private Boolean held = null;
  private Boolean autoGenerated = null;
  private String subject = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;
  private Long messagesSent = null;
  private QueueConversationEventTopicErrorDetails errorInfo = null;

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
  private Date startHoldTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private String messageId = null;

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
   * Whether an email is inbound or outbound.
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
  private List<QueueConversationEventTopicAttachment> draftAttachments = null;
  private Boolean spam = null;
  private QueueConversationEventTopicWrapup wrapup = null;
  private QueueConversationEventTopicAfterCallWork afterCallWork = null;
  private Boolean afterCallWorkRequired = null;
  private QueueConversationEventTopicQueueMediaSettings queueMediaSettings = null;
  private Date resumeTime = null;
  private Date parkTime = null;

  public QueueConversationEventTopicEmail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      draftAttachments = new ArrayList<QueueConversationEventTopicAttachment>();
    }
  }

  
  /**
   * A globally unique identifier for this communication.
   **/
  public QueueConversationEventTopicEmail id(String id) {
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
  public QueueConversationEventTopicEmail state(StateEnum state) {
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
  public QueueConversationEventTopicEmail initialState(InitialStateEnum initialState) {
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
   * True if this call is held and the person on this side hears silence.
   **/
  public QueueConversationEventTopicEmail held(Boolean held) {
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
   * Indicates that the email was auto-generated like an Out of Office reply.
   **/
  public QueueConversationEventTopicEmail autoGenerated(Boolean autoGenerated) {
    this.autoGenerated = autoGenerated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that the email was auto-generated like an Out of Office reply.")
  @JsonProperty("autoGenerated")
  public Boolean getAutoGenerated() {
    return autoGenerated;
  }
  public void setAutoGenerated(Boolean autoGenerated) {
    this.autoGenerated = autoGenerated;
  }


  /**
   * The subject for the initial email that started this conversation.
   **/
  public QueueConversationEventTopicEmail subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject for the initial email that started this conversation.")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * The source provider of the email.
   **/
  public QueueConversationEventTopicEmail provider(String provider) {
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
  public QueueConversationEventTopicEmail scriptId(String scriptId) {
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
  public QueueConversationEventTopicEmail peerId(String peerId) {
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
   * The number of email messages sent by this participant.
   **/
  public QueueConversationEventTopicEmail messagesSent(Long messagesSent) {
    this.messagesSent = messagesSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of email messages sent by this participant.")
  @JsonProperty("messagesSent")
  public Long getMessagesSent() {
    return messagesSent;
  }
  public void setMessagesSent(Long messagesSent) {
    this.messagesSent = messagesSent;
  }


  /**
   * Detailed information about an error response.
   **/
  public QueueConversationEventTopicEmail errorInfo(QueueConversationEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed information about an error response.")
  @JsonProperty("errorInfo")
  public QueueConversationEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects.
   **/
  public QueueConversationEventTopicEmail disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationEventTopicEmail startHoldTime(Date startHoldTime) {
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
  public QueueConversationEventTopicEmail connectedTime(Date connectedTime) {
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
  public QueueConversationEventTopicEmail disconnectedTime(Date disconnectedTime) {
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
   * A globally unique identifier for the stored content of this communication.
   **/
  public QueueConversationEventTopicEmail messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the stored content of this communication.")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  /**
   * Whether an email is inbound or outbound.
   **/
  public QueueConversationEventTopicEmail direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether an email is inbound or outbound.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   * A list of uploaded attachments on the email draft.
   **/
  public QueueConversationEventTopicEmail draftAttachments(List<QueueConversationEventTopicAttachment> draftAttachments) {
    this.draftAttachments = draftAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of uploaded attachments on the email draft.")
  @JsonProperty("draftAttachments")
  public List<QueueConversationEventTopicAttachment> getDraftAttachments() {
    return draftAttachments;
  }
  public void setDraftAttachments(List<QueueConversationEventTopicAttachment> draftAttachments) {
    this.draftAttachments = draftAttachments;
  }


  /**
   * Indicates if the inbound email was marked as spam.
   **/
  public QueueConversationEventTopicEmail spam(Boolean spam) {
    this.spam = spam;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the inbound email was marked as spam.")
  @JsonProperty("spam")
  public Boolean getSpam() {
    return spam;
  }
  public void setSpam(Boolean spam) {
    this.spam = spam;
  }


  /**
   * Call wrap up or disposition data.
   **/
  public QueueConversationEventTopicEmail wrapup(QueueConversationEventTopicWrapup wrapup) {
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
  public QueueConversationEventTopicEmail afterCallWork(QueueConversationEventTopicAfterCallWork afterCallWork) {
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
  public QueueConversationEventTopicEmail afterCallWorkRequired(Boolean afterCallWorkRequired) {
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
  public QueueConversationEventTopicEmail queueMediaSettings(QueueConversationEventTopicQueueMediaSettings queueMediaSettings) {
    this.queueMediaSettings = queueMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the queue setting for this media.")
  @JsonProperty("queueMediaSettings")
  public QueueConversationEventTopicQueueMediaSettings getQueueMediaSettings() {
    return queueMediaSettings;
  }
  public void setQueueMediaSettings(QueueConversationEventTopicQueueMediaSettings queueMediaSettings) {
    this.queueMediaSettings = queueMediaSettings;
  }


  /**
   * The time when a parked email should resume.
   **/
  public QueueConversationEventTopicEmail resumeTime(Date resumeTime) {
    this.resumeTime = resumeTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when a parked email should resume.")
  @JsonProperty("resumeTime")
  public Date getResumeTime() {
    return resumeTime;
  }
  public void setResumeTime(Date resumeTime) {
    this.resumeTime = resumeTime;
  }


  /**
   * The time when an  parked email was parked.
   **/
  public QueueConversationEventTopicEmail parkTime(Date parkTime) {
    this.parkTime = parkTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when an  parked email was parked.")
  @JsonProperty("parkTime")
  public Date getParkTime() {
    return parkTime;
  }
  public void setParkTime(Date parkTime) {
    this.parkTime = parkTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicEmail queueConversationEventTopicEmail = (QueueConversationEventTopicEmail) o;

    return Objects.equals(this.id, queueConversationEventTopicEmail.id) &&
            Objects.equals(this.state, queueConversationEventTopicEmail.state) &&
            Objects.equals(this.initialState, queueConversationEventTopicEmail.initialState) &&
            Objects.equals(this.held, queueConversationEventTopicEmail.held) &&
            Objects.equals(this.autoGenerated, queueConversationEventTopicEmail.autoGenerated) &&
            Objects.equals(this.subject, queueConversationEventTopicEmail.subject) &&
            Objects.equals(this.provider, queueConversationEventTopicEmail.provider) &&
            Objects.equals(this.scriptId, queueConversationEventTopicEmail.scriptId) &&
            Objects.equals(this.peerId, queueConversationEventTopicEmail.peerId) &&
            Objects.equals(this.messagesSent, queueConversationEventTopicEmail.messagesSent) &&
            Objects.equals(this.errorInfo, queueConversationEventTopicEmail.errorInfo) &&
            Objects.equals(this.disconnectType, queueConversationEventTopicEmail.disconnectType) &&
            Objects.equals(this.startHoldTime, queueConversationEventTopicEmail.startHoldTime) &&
            Objects.equals(this.connectedTime, queueConversationEventTopicEmail.connectedTime) &&
            Objects.equals(this.disconnectedTime, queueConversationEventTopicEmail.disconnectedTime) &&
            Objects.equals(this.messageId, queueConversationEventTopicEmail.messageId) &&
            Objects.equals(this.direction, queueConversationEventTopicEmail.direction) &&
            Objects.equals(this.draftAttachments, queueConversationEventTopicEmail.draftAttachments) &&
            Objects.equals(this.spam, queueConversationEventTopicEmail.spam) &&
            Objects.equals(this.wrapup, queueConversationEventTopicEmail.wrapup) &&
            Objects.equals(this.afterCallWork, queueConversationEventTopicEmail.afterCallWork) &&
            Objects.equals(this.afterCallWorkRequired, queueConversationEventTopicEmail.afterCallWorkRequired) &&
            Objects.equals(this.queueMediaSettings, queueConversationEventTopicEmail.queueMediaSettings) &&
            Objects.equals(this.resumeTime, queueConversationEventTopicEmail.resumeTime) &&
            Objects.equals(this.parkTime, queueConversationEventTopicEmail.parkTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, initialState, held, autoGenerated, subject, provider, scriptId, peerId, messagesSent, errorInfo, disconnectType, startHoldTime, connectedTime, disconnectedTime, messageId, direction, draftAttachments, spam, wrapup, afterCallWork, afterCallWorkRequired, queueMediaSettings, resumeTime, parkTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicEmail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    autoGenerated: ").append(toIndentedString(autoGenerated)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    messagesSent: ").append(toIndentedString(messagesSent)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    draftAttachments: ").append(toIndentedString(draftAttachments)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    afterCallWork: ").append(toIndentedString(afterCallWork)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
    sb.append("    queueMediaSettings: ").append(toIndentedString(queueMediaSettings)).append("\n");
    sb.append("    resumeTime: ").append(toIndentedString(resumeTime)).append("\n");
    sb.append("    parkTime: ").append(toIndentedString(parkTime)).append("\n");
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

