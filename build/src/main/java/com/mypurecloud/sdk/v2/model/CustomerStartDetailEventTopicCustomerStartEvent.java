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
import com.mypurecloud.sdk.v2.model.CustomerStartDetailEventTopicJourneyContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CustomerStartDetailEventTopicCustomerStartEvent
 */

public class CustomerStartDetailEventTopicCustomerStartEvent  implements Serializable {
  
  private Long eventTime = null;
  private String conversationId = null;
  private String participantId = null;
  private String sessionId = null;

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
    MESSAGE("MESSAGE"),
    INTERNALMESSAGE("INTERNALMESSAGE");

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
  private List<String> callbackNumbers = null;
  private Long callbackScheduledTime = null;
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
    INSTAGRAM("INSTAGRAM"),
    APPLE("APPLE");

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
  private List<String> conversationExternalContactIds = null;
  private List<String> conversationExternalOrganizationIds = null;
  private CustomerStartDetailEventTopicJourneyContext journeyContext = null;
  private String divisionId = null;

  public CustomerStartDetailEventTopicCustomerStartEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      callbackNumbers = new ArrayList<String>();
      conversationExternalContactIds = new ArrayList<String>();
      conversationExternalOrganizationIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public CustomerStartDetailEventTopicCustomerStartEvent eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public CustomerStartDetailEventTopicCustomerStartEvent conversationId(String conversationId) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent participantId(String participantId) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent sessionId(String sessionId) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent mediaType(MediaTypeEnum mediaType) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent externalOrganizationId(String externalOrganizationId) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent externalContactId(String externalContactId) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent provider(String provider) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent direction(DirectionEnum direction) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent ani(String ani) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent dnis(String dnis) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent addressTo(String addressTo) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent addressFrom(String addressFrom) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent callbackUserName(String callbackUserName) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent callbackNumbers(List<String> callbackNumbers) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent callbackScheduledTime(Long callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackScheduledTime")
  public Long getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Long callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }


  /**
   **/
  public CustomerStartDetailEventTopicCustomerStartEvent subject(String subject) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent messageType(MessageTypeEnum messageType) {
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
  public CustomerStartDetailEventTopicCustomerStartEvent conversationExternalContactIds(List<String> conversationExternalContactIds) {
    this.conversationExternalContactIds = conversationExternalContactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationExternalContactIds")
  public List<String> getConversationExternalContactIds() {
    return conversationExternalContactIds;
  }
  public void setConversationExternalContactIds(List<String> conversationExternalContactIds) {
    this.conversationExternalContactIds = conversationExternalContactIds;
  }


  /**
   **/
  public CustomerStartDetailEventTopicCustomerStartEvent conversationExternalOrganizationIds(List<String> conversationExternalOrganizationIds) {
    this.conversationExternalOrganizationIds = conversationExternalOrganizationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationExternalOrganizationIds")
  public List<String> getConversationExternalOrganizationIds() {
    return conversationExternalOrganizationIds;
  }
  public void setConversationExternalOrganizationIds(List<String> conversationExternalOrganizationIds) {
    this.conversationExternalOrganizationIds = conversationExternalOrganizationIds;
  }


  /**
   **/
  public CustomerStartDetailEventTopicCustomerStartEvent journeyContext(CustomerStartDetailEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public CustomerStartDetailEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(CustomerStartDetailEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }


  /**
   **/
  public CustomerStartDetailEventTopicCustomerStartEvent divisionId(String divisionId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerStartDetailEventTopicCustomerStartEvent customerStartDetailEventTopicCustomerStartEvent = (CustomerStartDetailEventTopicCustomerStartEvent) o;

    return Objects.equals(this.eventTime, customerStartDetailEventTopicCustomerStartEvent.eventTime) &&
            Objects.equals(this.conversationId, customerStartDetailEventTopicCustomerStartEvent.conversationId) &&
            Objects.equals(this.participantId, customerStartDetailEventTopicCustomerStartEvent.participantId) &&
            Objects.equals(this.sessionId, customerStartDetailEventTopicCustomerStartEvent.sessionId) &&
            Objects.equals(this.mediaType, customerStartDetailEventTopicCustomerStartEvent.mediaType) &&
            Objects.equals(this.externalOrganizationId, customerStartDetailEventTopicCustomerStartEvent.externalOrganizationId) &&
            Objects.equals(this.externalContactId, customerStartDetailEventTopicCustomerStartEvent.externalContactId) &&
            Objects.equals(this.provider, customerStartDetailEventTopicCustomerStartEvent.provider) &&
            Objects.equals(this.direction, customerStartDetailEventTopicCustomerStartEvent.direction) &&
            Objects.equals(this.ani, customerStartDetailEventTopicCustomerStartEvent.ani) &&
            Objects.equals(this.dnis, customerStartDetailEventTopicCustomerStartEvent.dnis) &&
            Objects.equals(this.addressTo, customerStartDetailEventTopicCustomerStartEvent.addressTo) &&
            Objects.equals(this.addressFrom, customerStartDetailEventTopicCustomerStartEvent.addressFrom) &&
            Objects.equals(this.callbackUserName, customerStartDetailEventTopicCustomerStartEvent.callbackUserName) &&
            Objects.equals(this.callbackNumbers, customerStartDetailEventTopicCustomerStartEvent.callbackNumbers) &&
            Objects.equals(this.callbackScheduledTime, customerStartDetailEventTopicCustomerStartEvent.callbackScheduledTime) &&
            Objects.equals(this.subject, customerStartDetailEventTopicCustomerStartEvent.subject) &&
            Objects.equals(this.messageType, customerStartDetailEventTopicCustomerStartEvent.messageType) &&
            Objects.equals(this.conversationExternalContactIds, customerStartDetailEventTopicCustomerStartEvent.conversationExternalContactIds) &&
            Objects.equals(this.conversationExternalOrganizationIds, customerStartDetailEventTopicCustomerStartEvent.conversationExternalOrganizationIds) &&
            Objects.equals(this.journeyContext, customerStartDetailEventTopicCustomerStartEvent.journeyContext) &&
            Objects.equals(this.divisionId, customerStartDetailEventTopicCustomerStartEvent.divisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, sessionId, mediaType, externalOrganizationId, externalContactId, provider, direction, ani, dnis, addressTo, addressFrom, callbackUserName, callbackNumbers, callbackScheduledTime, subject, messageType, conversationExternalContactIds, conversationExternalOrganizationIds, journeyContext, divisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerStartDetailEventTopicCustomerStartEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
    sb.append("    conversationExternalContactIds: ").append(toIndentedString(conversationExternalContactIds)).append("\n");
    sb.append("    conversationExternalOrganizationIds: ").append(toIndentedString(conversationExternalOrganizationIds)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
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

