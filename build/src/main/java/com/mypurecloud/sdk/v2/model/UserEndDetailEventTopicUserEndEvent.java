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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserEndDetailEventTopicUserEndEvent
 */

public class UserEndDetailEventTopicUserEndEvent  implements Serializable {
  
  private Integer eventTime = null;
  private String conversationId = null;
  private String participantId = null;
  private String sessionId = null;

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
    UNKNOWN("UNKNOWN"),
    ENDPOINT("ENDPOINT"),
    CLIENT("CLIENT"),
    SYSTEM("SYSTEM"),
    TRANSFER("TRANSFER"),
    ERROR("ERROR"),
    PEER("PEER"),
    OTHER("OTHER"),
    SPAM("SPAM"),
    TIMEOUT("TIMEOUT"),
    TRANSPORT_FAILURE("TRANSPORT_FAILURE"),
    CONFERENCE_TRANSFER("CONFERENCE_TRANSFER"),
    CONSULT_TRANSFER("CONSULT_TRANSFER"),
    FORWARD_TRANSFER("FORWARD_TRANSFER"),
    NO_ANSWER_TRANSFER("NO_ANSWER_TRANSFER"),
    NOT_AVAILABLE_TRANSFER("NOT_AVAILABLE_TRANSFER"),
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

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    VOICE("VOICE"),
    CHAT("CHAT"),
    EMAIL("EMAIL"),
    CALLBACK("CALLBACK"),
    COBROWSE("COBROWSE"),
    VIDEO("VIDEO"),
    SCREENSHARE("SCREENSHARE"),
    MESSAGE("MESSAGE");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String provider = null;

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
   * Gets or Sets direction
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    INBOUND("INBOUND"),
    OUTBOUND("OUTBOUND");

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
  private String ani = null;
  private String dnis = null;
  private String addressTo = null;
  private String addressFrom = null;
  private String callbackUserName = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private Integer callbackScheduledTime = null;
  private String subject = null;

  private static class MessageTypeEnumDeserializer extends StdDeserializer<MessageTypeEnum> {
    public MessageTypeEnumDeserializer() {
      super(MessageTypeEnumDeserializer.class);
    }

    @Override
    public MessageTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessageTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets messageType
   */
 @JsonDeserialize(using = MessageTypeEnumDeserializer.class)
  public enum MessageTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    SMS("SMS"),
    TWITTER("TWITTER"),
    FACEBOOK("FACEBOOK"),
    LINE("LINE"),
    WHATSAPP("WHATSAPP"),
    WEBMESSAGING("WEBMESSAGING"),
    OPEN("OPEN"),
    INSTAGRAM("INSTAGRAM");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypeEnum value : MessageTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageTypeEnum messageType = null;
  private String userId = null;
  private String divisionId = null;
  private String queueId = null;
  private Integer interactingDurationMs = null;
  private Integer heldDurationMs = null;
  private Integer alertingDurationMs = null;
  private Integer contactingDurationMs = null;
  private Integer dialingDurationMs = null;

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent eventTime(Integer eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Integer getEventTime() {
    return eventTime;
  }
  public void setEventTime(Integer eventTime) {
    this.eventTime = eventTime;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent disconnectType(DisconnectTypeEnum disconnectType) {
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
  public UserEndDetailEventTopicUserEndEvent mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent provider(String provider) {
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
  public UserEndDetailEventTopicUserEndEvent direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent addressTo(String addressTo) {
    this.addressTo = addressTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressTo")
  public String getAddressTo() {
    return addressTo;
  }
  public void setAddressTo(String addressTo) {
    this.addressTo = addressTo;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent addressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressFrom")
  public String getAddressFrom() {
    return addressFrom;
  }
  public void setAddressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent callbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackUserName")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent callbackScheduledTime(Integer callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackScheduledTime")
  public Integer getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Integer callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageType")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent interactingDurationMs(Integer interactingDurationMs) {
    this.interactingDurationMs = interactingDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interactingDurationMs")
  public Integer getInteractingDurationMs() {
    return interactingDurationMs;
  }
  public void setInteractingDurationMs(Integer interactingDurationMs) {
    this.interactingDurationMs = interactingDurationMs;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent heldDurationMs(Integer heldDurationMs) {
    this.heldDurationMs = heldDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("heldDurationMs")
  public Integer getHeldDurationMs() {
    return heldDurationMs;
  }
  public void setHeldDurationMs(Integer heldDurationMs) {
    this.heldDurationMs = heldDurationMs;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent alertingDurationMs(Integer alertingDurationMs) {
    this.alertingDurationMs = alertingDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertingDurationMs")
  public Integer getAlertingDurationMs() {
    return alertingDurationMs;
  }
  public void setAlertingDurationMs(Integer alertingDurationMs) {
    this.alertingDurationMs = alertingDurationMs;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent contactingDurationMs(Integer contactingDurationMs) {
    this.contactingDurationMs = contactingDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactingDurationMs")
  public Integer getContactingDurationMs() {
    return contactingDurationMs;
  }
  public void setContactingDurationMs(Integer contactingDurationMs) {
    this.contactingDurationMs = contactingDurationMs;
  }

  
  /**
   **/
  public UserEndDetailEventTopicUserEndEvent dialingDurationMs(Integer dialingDurationMs) {
    this.dialingDurationMs = dialingDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialingDurationMs")
  public Integer getDialingDurationMs() {
    return dialingDurationMs;
  }
  public void setDialingDurationMs(Integer dialingDurationMs) {
    this.dialingDurationMs = dialingDurationMs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEndDetailEventTopicUserEndEvent userEndDetailEventTopicUserEndEvent = (UserEndDetailEventTopicUserEndEvent) o;
    return Objects.equals(this.eventTime, userEndDetailEventTopicUserEndEvent.eventTime) &&
        Objects.equals(this.conversationId, userEndDetailEventTopicUserEndEvent.conversationId) &&
        Objects.equals(this.participantId, userEndDetailEventTopicUserEndEvent.participantId) &&
        Objects.equals(this.sessionId, userEndDetailEventTopicUserEndEvent.sessionId) &&
        Objects.equals(this.disconnectType, userEndDetailEventTopicUserEndEvent.disconnectType) &&
        Objects.equals(this.mediaType, userEndDetailEventTopicUserEndEvent.mediaType) &&
        Objects.equals(this.provider, userEndDetailEventTopicUserEndEvent.provider) &&
        Objects.equals(this.direction, userEndDetailEventTopicUserEndEvent.direction) &&
        Objects.equals(this.ani, userEndDetailEventTopicUserEndEvent.ani) &&
        Objects.equals(this.dnis, userEndDetailEventTopicUserEndEvent.dnis) &&
        Objects.equals(this.addressTo, userEndDetailEventTopicUserEndEvent.addressTo) &&
        Objects.equals(this.addressFrom, userEndDetailEventTopicUserEndEvent.addressFrom) &&
        Objects.equals(this.callbackUserName, userEndDetailEventTopicUserEndEvent.callbackUserName) &&
        Objects.equals(this.callbackNumbers, userEndDetailEventTopicUserEndEvent.callbackNumbers) &&
        Objects.equals(this.callbackScheduledTime, userEndDetailEventTopicUserEndEvent.callbackScheduledTime) &&
        Objects.equals(this.subject, userEndDetailEventTopicUserEndEvent.subject) &&
        Objects.equals(this.messageType, userEndDetailEventTopicUserEndEvent.messageType) &&
        Objects.equals(this.userId, userEndDetailEventTopicUserEndEvent.userId) &&
        Objects.equals(this.divisionId, userEndDetailEventTopicUserEndEvent.divisionId) &&
        Objects.equals(this.queueId, userEndDetailEventTopicUserEndEvent.queueId) &&
        Objects.equals(this.interactingDurationMs, userEndDetailEventTopicUserEndEvent.interactingDurationMs) &&
        Objects.equals(this.heldDurationMs, userEndDetailEventTopicUserEndEvent.heldDurationMs) &&
        Objects.equals(this.alertingDurationMs, userEndDetailEventTopicUserEndEvent.alertingDurationMs) &&
        Objects.equals(this.contactingDurationMs, userEndDetailEventTopicUserEndEvent.contactingDurationMs) &&
        Objects.equals(this.dialingDurationMs, userEndDetailEventTopicUserEndEvent.dialingDurationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, sessionId, disconnectType, mediaType, provider, direction, ani, dnis, addressTo, addressFrom, callbackUserName, callbackNumbers, callbackScheduledTime, subject, messageType, userId, divisionId, queueId, interactingDurationMs, heldDurationMs, alertingDurationMs, contactingDurationMs, dialingDurationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEndDetailEventTopicUserEndEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    interactingDurationMs: ").append(toIndentedString(interactingDurationMs)).append("\n");
    sb.append("    heldDurationMs: ").append(toIndentedString(heldDurationMs)).append("\n");
    sb.append("    alertingDurationMs: ").append(toIndentedString(alertingDurationMs)).append("\n");
    sb.append("    contactingDurationMs: ").append(toIndentedString(contactingDurationMs)).append("\n");
    sb.append("    dialingDurationMs: ").append(toIndentedString(dialingDurationMs)).append("\n");
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

