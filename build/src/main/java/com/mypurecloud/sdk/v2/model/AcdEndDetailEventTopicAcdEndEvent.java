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
 * AcdEndDetailEventTopicAcdEndEvent
 */

public class AcdEndDetailEventTopicAcdEndEvent  implements Serializable {
  
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
  private String queueId = null;
  private String divisionId = null;

  private static class AcdOutcomeEnumDeserializer extends StdDeserializer<AcdOutcomeEnum> {
    public AcdOutcomeEnumDeserializer() {
      super(AcdOutcomeEnumDeserializer.class);
    }

    @Override
    public AcdOutcomeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AcdOutcomeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets acdOutcome
   */
 @JsonDeserialize(using = AcdOutcomeEnumDeserializer.class)
  public enum AcdOutcomeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    ABANDON("ABANDON"),
    ANSWERED("ANSWERED"),
    FLOW_OUT("FLOW_OUT");

    private String value;

    AcdOutcomeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AcdOutcomeEnum fromString(String key) {
      if (key == null) return null;

      for (AcdOutcomeEnum value : AcdOutcomeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AcdOutcomeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AcdOutcomeEnum acdOutcome = null;
  private String answeredUserId = null;

  private static class RequestedRoutingsEnumDeserializer extends StdDeserializer<RequestedRoutingsEnum> {
    public RequestedRoutingsEnumDeserializer() {
      super(RequestedRoutingsEnumDeserializer.class);
    }

    @Override
    public RequestedRoutingsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RequestedRoutingsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets requestedRoutings
   */
 @JsonDeserialize(using = RequestedRoutingsEnumDeserializer.class)
  public enum RequestedRoutingsEnum {
    UNKNOWN("UNKNOWN"),
    MANUAL("MANUAL"),
    PREDICTIVE("PREDICTIVE"),
    PREFERRED("PREFERRED"),
    LAST("LAST"),
    BULLSEYE("BULLSEYE"),
    STANDARD("STANDARD"),
    OTHER("OTHER");

    private String value;

    RequestedRoutingsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RequestedRoutingsEnum fromString(String key) {
      if (key == null) return null;

      for (RequestedRoutingsEnum value : RequestedRoutingsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RequestedRoutingsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<RequestedRoutingsEnum> requestedRoutings = new ArrayList<RequestedRoutingsEnum>();

  private static class UsedRoutingEnumDeserializer extends StdDeserializer<UsedRoutingEnum> {
    public UsedRoutingEnumDeserializer() {
      super(UsedRoutingEnumDeserializer.class);
    }

    @Override
    public UsedRoutingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UsedRoutingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets usedRouting
   */
 @JsonDeserialize(using = UsedRoutingEnumDeserializer.class)
  public enum UsedRoutingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    MANUAL("MANUAL"),
    PREDICTIVE("PREDICTIVE"),
    PREFERRED("PREFERRED"),
    LAST("LAST"),
    BULLSEYE("BULLSEYE"),
    STANDARD("STANDARD"),
    OTHER("OTHER");

    private String value;

    UsedRoutingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UsedRoutingEnum fromString(String key) {
      if (key == null) return null;

      for (UsedRoutingEnum value : UsedRoutingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UsedRoutingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UsedRoutingEnum usedRouting = null;
  private List<String> requestedRoutingSkillIds = new ArrayList<String>();
  private String requestedLanguageId = null;
  private List<String> requestedRoutingUserIds = new ArrayList<String>();
  private Integer routingPriority = null;
  private Integer connectedDurationMs = null;

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent eventTime(Integer eventTime) {
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
  public AcdEndDetailEventTopicAcdEndEvent conversationId(String conversationId) {
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
  public AcdEndDetailEventTopicAcdEndEvent participantId(String participantId) {
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
  public AcdEndDetailEventTopicAcdEndEvent sessionId(String sessionId) {
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
  public AcdEndDetailEventTopicAcdEndEvent disconnectType(DisconnectTypeEnum disconnectType) {
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
  public AcdEndDetailEventTopicAcdEndEvent mediaType(MediaTypeEnum mediaType) {
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
  public AcdEndDetailEventTopicAcdEndEvent provider(String provider) {
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
  public AcdEndDetailEventTopicAcdEndEvent direction(DirectionEnum direction) {
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
  public AcdEndDetailEventTopicAcdEndEvent ani(String ani) {
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
  public AcdEndDetailEventTopicAcdEndEvent dnis(String dnis) {
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
  public AcdEndDetailEventTopicAcdEndEvent addressTo(String addressTo) {
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
  public AcdEndDetailEventTopicAcdEndEvent addressFrom(String addressFrom) {
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
  public AcdEndDetailEventTopicAcdEndEvent callbackUserName(String callbackUserName) {
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
  public AcdEndDetailEventTopicAcdEndEvent callbackNumbers(List<String> callbackNumbers) {
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
  public AcdEndDetailEventTopicAcdEndEvent callbackScheduledTime(Integer callbackScheduledTime) {
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
  public AcdEndDetailEventTopicAcdEndEvent subject(String subject) {
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
  public AcdEndDetailEventTopicAcdEndEvent messageType(MessageTypeEnum messageType) {
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
  public AcdEndDetailEventTopicAcdEndEvent queueId(String queueId) {
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
  public AcdEndDetailEventTopicAcdEndEvent divisionId(String divisionId) {
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
  public AcdEndDetailEventTopicAcdEndEvent acdOutcome(AcdOutcomeEnum acdOutcome) {
    this.acdOutcome = acdOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acdOutcome")
  public AcdOutcomeEnum getAcdOutcome() {
    return acdOutcome;
  }
  public void setAcdOutcome(AcdOutcomeEnum acdOutcome) {
    this.acdOutcome = acdOutcome;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent answeredUserId(String answeredUserId) {
    this.answeredUserId = answeredUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answeredUserId")
  public String getAnsweredUserId() {
    return answeredUserId;
  }
  public void setAnsweredUserId(String answeredUserId) {
    this.answeredUserId = answeredUserId;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent requestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedRoutings")
  public List<RequestedRoutingsEnum> getRequestedRoutings() {
    return requestedRoutings;
  }
  public void setRequestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent usedRouting(UsedRoutingEnum usedRouting) {
    this.usedRouting = usedRouting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("usedRouting")
  public UsedRoutingEnum getUsedRouting() {
    return usedRouting;
  }
  public void setUsedRouting(UsedRoutingEnum usedRouting) {
    this.usedRouting = usedRouting;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent requestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedRoutingSkillIds")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent requestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedLanguageId")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent requestedRoutingUserIds(List<String> requestedRoutingUserIds) {
    this.requestedRoutingUserIds = requestedRoutingUserIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedRoutingUserIds")
  public List<String> getRequestedRoutingUserIds() {
    return requestedRoutingUserIds;
  }
  public void setRequestedRoutingUserIds(List<String> requestedRoutingUserIds) {
    this.requestedRoutingUserIds = requestedRoutingUserIds;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent routingPriority(Integer routingPriority) {
    this.routingPriority = routingPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routingPriority")
  public Integer getRoutingPriority() {
    return routingPriority;
  }
  public void setRoutingPriority(Integer routingPriority) {
    this.routingPriority = routingPriority;
  }

  
  /**
   **/
  public AcdEndDetailEventTopicAcdEndEvent connectedDurationMs(Integer connectedDurationMs) {
    this.connectedDurationMs = connectedDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedDurationMs")
  public Integer getConnectedDurationMs() {
    return connectedDurationMs;
  }
  public void setConnectedDurationMs(Integer connectedDurationMs) {
    this.connectedDurationMs = connectedDurationMs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcdEndDetailEventTopicAcdEndEvent acdEndDetailEventTopicAcdEndEvent = (AcdEndDetailEventTopicAcdEndEvent) o;
    return Objects.equals(this.eventTime, acdEndDetailEventTopicAcdEndEvent.eventTime) &&
        Objects.equals(this.conversationId, acdEndDetailEventTopicAcdEndEvent.conversationId) &&
        Objects.equals(this.participantId, acdEndDetailEventTopicAcdEndEvent.participantId) &&
        Objects.equals(this.sessionId, acdEndDetailEventTopicAcdEndEvent.sessionId) &&
        Objects.equals(this.disconnectType, acdEndDetailEventTopicAcdEndEvent.disconnectType) &&
        Objects.equals(this.mediaType, acdEndDetailEventTopicAcdEndEvent.mediaType) &&
        Objects.equals(this.provider, acdEndDetailEventTopicAcdEndEvent.provider) &&
        Objects.equals(this.direction, acdEndDetailEventTopicAcdEndEvent.direction) &&
        Objects.equals(this.ani, acdEndDetailEventTopicAcdEndEvent.ani) &&
        Objects.equals(this.dnis, acdEndDetailEventTopicAcdEndEvent.dnis) &&
        Objects.equals(this.addressTo, acdEndDetailEventTopicAcdEndEvent.addressTo) &&
        Objects.equals(this.addressFrom, acdEndDetailEventTopicAcdEndEvent.addressFrom) &&
        Objects.equals(this.callbackUserName, acdEndDetailEventTopicAcdEndEvent.callbackUserName) &&
        Objects.equals(this.callbackNumbers, acdEndDetailEventTopicAcdEndEvent.callbackNumbers) &&
        Objects.equals(this.callbackScheduledTime, acdEndDetailEventTopicAcdEndEvent.callbackScheduledTime) &&
        Objects.equals(this.subject, acdEndDetailEventTopicAcdEndEvent.subject) &&
        Objects.equals(this.messageType, acdEndDetailEventTopicAcdEndEvent.messageType) &&
        Objects.equals(this.queueId, acdEndDetailEventTopicAcdEndEvent.queueId) &&
        Objects.equals(this.divisionId, acdEndDetailEventTopicAcdEndEvent.divisionId) &&
        Objects.equals(this.acdOutcome, acdEndDetailEventTopicAcdEndEvent.acdOutcome) &&
        Objects.equals(this.answeredUserId, acdEndDetailEventTopicAcdEndEvent.answeredUserId) &&
        Objects.equals(this.requestedRoutings, acdEndDetailEventTopicAcdEndEvent.requestedRoutings) &&
        Objects.equals(this.usedRouting, acdEndDetailEventTopicAcdEndEvent.usedRouting) &&
        Objects.equals(this.requestedRoutingSkillIds, acdEndDetailEventTopicAcdEndEvent.requestedRoutingSkillIds) &&
        Objects.equals(this.requestedLanguageId, acdEndDetailEventTopicAcdEndEvent.requestedLanguageId) &&
        Objects.equals(this.requestedRoutingUserIds, acdEndDetailEventTopicAcdEndEvent.requestedRoutingUserIds) &&
        Objects.equals(this.routingPriority, acdEndDetailEventTopicAcdEndEvent.routingPriority) &&
        Objects.equals(this.connectedDurationMs, acdEndDetailEventTopicAcdEndEvent.connectedDurationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, sessionId, disconnectType, mediaType, provider, direction, ani, dnis, addressTo, addressFrom, callbackUserName, callbackNumbers, callbackScheduledTime, subject, messageType, queueId, divisionId, acdOutcome, answeredUserId, requestedRoutings, usedRouting, requestedRoutingSkillIds, requestedLanguageId, requestedRoutingUserIds, routingPriority, connectedDurationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcdEndDetailEventTopicAcdEndEvent {\n");
    
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
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    acdOutcome: ").append(toIndentedString(acdOutcome)).append("\n");
    sb.append("    answeredUserId: ").append(toIndentedString(answeredUserId)).append("\n");
    sb.append("    requestedRoutings: ").append(toIndentedString(requestedRoutings)).append("\n");
    sb.append("    usedRouting: ").append(toIndentedString(usedRouting)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    requestedRoutingUserIds: ").append(toIndentedString(requestedRoutingUserIds)).append("\n");
    sb.append("    routingPriority: ").append(toIndentedString(routingPriority)).append("\n");
    sb.append("    connectedDurationMs: ").append(toIndentedString(connectedDurationMs)).append("\n");
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

