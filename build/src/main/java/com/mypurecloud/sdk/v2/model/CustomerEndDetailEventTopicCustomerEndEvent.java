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
 * CustomerEndDetailEventTopicCustomerEndEvent
 */

public class CustomerEndDetailEventTopicCustomerEndEvent  implements Serializable {
  
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
  private String externalOrganizationId = null;
  private String externalContactId = null;
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
  private Integer interactingDurationMs = null;

  
  /**
   **/
  public CustomerEndDetailEventTopicCustomerEndEvent eventTime(Integer eventTime) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent conversationId(String conversationId) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent participantId(String participantId) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent sessionId(String sessionId) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent disconnectType(DisconnectTypeEnum disconnectType) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent mediaType(MediaTypeEnum mediaType) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent externalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganizationId")
  public String getExternalOrganizationId() {
    return externalOrganizationId;
  }
  public void setExternalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
  }

  
  /**
   **/
  public CustomerEndDetailEventTopicCustomerEndEvent externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }

  
  /**
   **/
  public CustomerEndDetailEventTopicCustomerEndEvent provider(String provider) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent direction(DirectionEnum direction) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent ani(String ani) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent dnis(String dnis) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent addressTo(String addressTo) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent addressFrom(String addressFrom) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent callbackUserName(String callbackUserName) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent callbackNumbers(List<String> callbackNumbers) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent callbackScheduledTime(Integer callbackScheduledTime) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent subject(String subject) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent messageType(MessageTypeEnum messageType) {
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
  public CustomerEndDetailEventTopicCustomerEndEvent interactingDurationMs(Integer interactingDurationMs) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerEndDetailEventTopicCustomerEndEvent customerEndDetailEventTopicCustomerEndEvent = (CustomerEndDetailEventTopicCustomerEndEvent) o;
    return Objects.equals(this.eventTime, customerEndDetailEventTopicCustomerEndEvent.eventTime) &&
        Objects.equals(this.conversationId, customerEndDetailEventTopicCustomerEndEvent.conversationId) &&
        Objects.equals(this.participantId, customerEndDetailEventTopicCustomerEndEvent.participantId) &&
        Objects.equals(this.sessionId, customerEndDetailEventTopicCustomerEndEvent.sessionId) &&
        Objects.equals(this.disconnectType, customerEndDetailEventTopicCustomerEndEvent.disconnectType) &&
        Objects.equals(this.mediaType, customerEndDetailEventTopicCustomerEndEvent.mediaType) &&
        Objects.equals(this.externalOrganizationId, customerEndDetailEventTopicCustomerEndEvent.externalOrganizationId) &&
        Objects.equals(this.externalContactId, customerEndDetailEventTopicCustomerEndEvent.externalContactId) &&
        Objects.equals(this.provider, customerEndDetailEventTopicCustomerEndEvent.provider) &&
        Objects.equals(this.direction, customerEndDetailEventTopicCustomerEndEvent.direction) &&
        Objects.equals(this.ani, customerEndDetailEventTopicCustomerEndEvent.ani) &&
        Objects.equals(this.dnis, customerEndDetailEventTopicCustomerEndEvent.dnis) &&
        Objects.equals(this.addressTo, customerEndDetailEventTopicCustomerEndEvent.addressTo) &&
        Objects.equals(this.addressFrom, customerEndDetailEventTopicCustomerEndEvent.addressFrom) &&
        Objects.equals(this.callbackUserName, customerEndDetailEventTopicCustomerEndEvent.callbackUserName) &&
        Objects.equals(this.callbackNumbers, customerEndDetailEventTopicCustomerEndEvent.callbackNumbers) &&
        Objects.equals(this.callbackScheduledTime, customerEndDetailEventTopicCustomerEndEvent.callbackScheduledTime) &&
        Objects.equals(this.subject, customerEndDetailEventTopicCustomerEndEvent.subject) &&
        Objects.equals(this.messageType, customerEndDetailEventTopicCustomerEndEvent.messageType) &&
        Objects.equals(this.interactingDurationMs, customerEndDetailEventTopicCustomerEndEvent.interactingDurationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, sessionId, disconnectType, mediaType, externalOrganizationId, externalContactId, provider, direction, ani, dnis, addressTo, addressFrom, callbackUserName, callbackNumbers, callbackScheduledTime, subject, messageType, interactingDurationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerEndDetailEventTopicCustomerEndEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    externalOrganizationId: ").append(toIndentedString(externalOrganizationId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
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
    sb.append("    interactingDurationMs: ").append(toIndentedString(interactingDurationMs)).append("\n");
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

