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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowEndDetailEventTopicFlowEndEvent
 */

public class FlowEndDetailEventTopicFlowEndEvent  implements Serializable {
  
  private Long eventTime = null;
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
    UNCALLABLE("UNCALLABLE"),
    DND_ENDPOINT("DND_ENDPOINT"),
    DND_TRANSFER("DND_TRANSFER"),
    INACTIVITY("INACTIVITY");

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

  private static class FlowTypeEnumDeserializer extends StdDeserializer<FlowTypeEnum> {
    public FlowTypeEnumDeserializer() {
      super(FlowTypeEnumDeserializer.class);
    }

    @Override
    public FlowTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowType
   */
 @JsonDeserialize(using = FlowTypeEnumDeserializer.class)
  public enum FlowTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    INBOUNDCALL("INBOUNDCALL"),
    OUTBOUNDCALL("OUTBOUNDCALL"),
    INQUEUECALL("INQUEUECALL"),
    SECURECALL("SECURECALL"),
    INBOUNDEMAIL("INBOUNDEMAIL"),
    SURVEYINVITE("SURVEYINVITE"),
    INBOUNDSHORTMESSAGE("INBOUNDSHORTMESSAGE"),
    INBOUNDCHAT("INBOUNDCHAT"),
    WORKFLOW("WORKFLOW"),
    BOT("BOT"),
    DIGITALBOT("DIGITALBOT"),
    COMMONMODULE("COMMONMODULE"),
    INQUEUEEMAIL("INQUEUEEMAIL"),
    INQUEUESHORTMESSAGE("INQUEUESHORTMESSAGE"),
    VOICE("VOICE"),
    VOICEMAIL("VOICEMAIL"),
    WORKITEM("WORKITEM"),
    VOICESURVEY("VOICESURVEY");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FlowTypeEnum value : FlowTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlowTypeEnum flowType = null;
  private String flowId = null;
  private String divisionId = null;
  private String flowVersion = null;
  private Long connectedDurationMs = null;
  private List<String> conversationExternalContactIds = null;
  private List<String> conversationExternalOrganizationIds = null;

  private static class ExitReasonEnumDeserializer extends StdDeserializer<ExitReasonEnum> {
    public ExitReasonEnumDeserializer() {
      super(ExitReasonEnumDeserializer.class);
    }

    @Override
    public ExitReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExitReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets exitReason
   */
 @JsonDeserialize(using = ExitReasonEnumDeserializer.class)
  public enum ExitReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    DISCONNECT("DISCONNECT"),
    FLOW_DISCONNECT("FLOW_DISCONNECT"),
    FLOW_ERROR_DISCONNECT("FLOW_ERROR_DISCONNECT"),
    TRANSFER("TRANSFER"),
    SESSION_EXPIRE_DISCONNECT("SESSION_EXPIRE_DISCONNECT"),
    RECOGNITION_FAILURE_DISCONNECT("RECOGNITION_FAILURE_DISCONNECT"),
    RECOGNITION_FAILURE_EXIT("RECOGNITION_FAILURE_EXIT"),
    USER_EXIT("USER_EXIT"),
    FLOW_EXIT("FLOW_EXIT"),
    FLOW_ERROR_EXIT("FLOW_ERROR_EXIT");

    private String value;

    ExitReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExitReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ExitReasonEnum value : ExitReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExitReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExitReasonEnum exitReason = null;

  private static class TransferTypeEnumDeserializer extends StdDeserializer<TransferTypeEnum> {
    public TransferTypeEnumDeserializer() {
      super(TransferTypeEnumDeserializer.class);
    }

    @Override
    public TransferTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TransferTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets transferType
   */
 @JsonDeserialize(using = TransferTypeEnumDeserializer.class)
  public enum TransferTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    ACD("ACD"),
    USER("USER"),
    NUMBER("NUMBER"),
    ACD_VOICEMAIL("ACD_VOICEMAIL"),
    USER_VOICEMAIL("USER_VOICEMAIL"),
    GROUP_VOICEMAIL("GROUP_VOICEMAIL"),
    GROUP("GROUP"),
    FLOW("FLOW"),
    SECURE_FLOW("SECURE_FLOW"),
    RETURN_TO_AGENT("RETURN_TO_AGENT");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransferTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TransferTypeEnum value : TransferTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransferTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TransferTypeEnum transferType = null;

  public FlowEndDetailEventTopicFlowEndEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conversationExternalContactIds = new ArrayList<String>();
      conversationExternalOrganizationIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public FlowEndDetailEventTopicFlowEndEvent eventTime(Long eventTime) {
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
  public FlowEndDetailEventTopicFlowEndEvent conversationId(String conversationId) {
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
  public FlowEndDetailEventTopicFlowEndEvent participantId(String participantId) {
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
  public FlowEndDetailEventTopicFlowEndEvent sessionId(String sessionId) {
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
  public FlowEndDetailEventTopicFlowEndEvent disconnectType(DisconnectTypeEnum disconnectType) {
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
  public FlowEndDetailEventTopicFlowEndEvent mediaType(MediaTypeEnum mediaType) {
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
  public FlowEndDetailEventTopicFlowEndEvent provider(String provider) {
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
  public FlowEndDetailEventTopicFlowEndEvent direction(DirectionEnum direction) {
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
  public FlowEndDetailEventTopicFlowEndEvent ani(String ani) {
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
  public FlowEndDetailEventTopicFlowEndEvent dnis(String dnis) {
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
  public FlowEndDetailEventTopicFlowEndEvent addressTo(String addressTo) {
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
  public FlowEndDetailEventTopicFlowEndEvent addressFrom(String addressFrom) {
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
  public FlowEndDetailEventTopicFlowEndEvent subject(String subject) {
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
  public FlowEndDetailEventTopicFlowEndEvent messageType(MessageTypeEnum messageType) {
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
  public FlowEndDetailEventTopicFlowEndEvent flowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowType")
  public FlowTypeEnum getFlowType() {
    return flowType;
  }
  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }


  /**
   **/
  public FlowEndDetailEventTopicFlowEndEvent flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  /**
   **/
  public FlowEndDetailEventTopicFlowEndEvent divisionId(String divisionId) {
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
  public FlowEndDetailEventTopicFlowEndEvent flowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowVersion")
  public String getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
  }


  /**
   **/
  public FlowEndDetailEventTopicFlowEndEvent connectedDurationMs(Long connectedDurationMs) {
    this.connectedDurationMs = connectedDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedDurationMs")
  public Long getConnectedDurationMs() {
    return connectedDurationMs;
  }
  public void setConnectedDurationMs(Long connectedDurationMs) {
    this.connectedDurationMs = connectedDurationMs;
  }


  /**
   **/
  public FlowEndDetailEventTopicFlowEndEvent conversationExternalContactIds(List<String> conversationExternalContactIds) {
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
  public FlowEndDetailEventTopicFlowEndEvent conversationExternalOrganizationIds(List<String> conversationExternalOrganizationIds) {
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
  public FlowEndDetailEventTopicFlowEndEvent exitReason(ExitReasonEnum exitReason) {
    this.exitReason = exitReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exitReason")
  public ExitReasonEnum getExitReason() {
    return exitReason;
  }
  public void setExitReason(ExitReasonEnum exitReason) {
    this.exitReason = exitReason;
  }


  /**
   **/
  public FlowEndDetailEventTopicFlowEndEvent transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transferType")
  public TransferTypeEnum getTransferType() {
    return transferType;
  }
  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowEndDetailEventTopicFlowEndEvent flowEndDetailEventTopicFlowEndEvent = (FlowEndDetailEventTopicFlowEndEvent) o;

    return Objects.equals(this.eventTime, flowEndDetailEventTopicFlowEndEvent.eventTime) &&
            Objects.equals(this.conversationId, flowEndDetailEventTopicFlowEndEvent.conversationId) &&
            Objects.equals(this.participantId, flowEndDetailEventTopicFlowEndEvent.participantId) &&
            Objects.equals(this.sessionId, flowEndDetailEventTopicFlowEndEvent.sessionId) &&
            Objects.equals(this.disconnectType, flowEndDetailEventTopicFlowEndEvent.disconnectType) &&
            Objects.equals(this.mediaType, flowEndDetailEventTopicFlowEndEvent.mediaType) &&
            Objects.equals(this.provider, flowEndDetailEventTopicFlowEndEvent.provider) &&
            Objects.equals(this.direction, flowEndDetailEventTopicFlowEndEvent.direction) &&
            Objects.equals(this.ani, flowEndDetailEventTopicFlowEndEvent.ani) &&
            Objects.equals(this.dnis, flowEndDetailEventTopicFlowEndEvent.dnis) &&
            Objects.equals(this.addressTo, flowEndDetailEventTopicFlowEndEvent.addressTo) &&
            Objects.equals(this.addressFrom, flowEndDetailEventTopicFlowEndEvent.addressFrom) &&
            Objects.equals(this.subject, flowEndDetailEventTopicFlowEndEvent.subject) &&
            Objects.equals(this.messageType, flowEndDetailEventTopicFlowEndEvent.messageType) &&
            Objects.equals(this.flowType, flowEndDetailEventTopicFlowEndEvent.flowType) &&
            Objects.equals(this.flowId, flowEndDetailEventTopicFlowEndEvent.flowId) &&
            Objects.equals(this.divisionId, flowEndDetailEventTopicFlowEndEvent.divisionId) &&
            Objects.equals(this.flowVersion, flowEndDetailEventTopicFlowEndEvent.flowVersion) &&
            Objects.equals(this.connectedDurationMs, flowEndDetailEventTopicFlowEndEvent.connectedDurationMs) &&
            Objects.equals(this.conversationExternalContactIds, flowEndDetailEventTopicFlowEndEvent.conversationExternalContactIds) &&
            Objects.equals(this.conversationExternalOrganizationIds, flowEndDetailEventTopicFlowEndEvent.conversationExternalOrganizationIds) &&
            Objects.equals(this.exitReason, flowEndDetailEventTopicFlowEndEvent.exitReason) &&
            Objects.equals(this.transferType, flowEndDetailEventTopicFlowEndEvent.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, sessionId, disconnectType, mediaType, provider, direction, ani, dnis, addressTo, addressFrom, subject, messageType, flowType, flowId, divisionId, flowVersion, connectedDurationMs, conversationExternalContactIds, conversationExternalOrganizationIds, exitReason, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowEndDetailEventTopicFlowEndEvent {\n");
    
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
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    connectedDurationMs: ").append(toIndentedString(connectedDurationMs)).append("\n");
    sb.append("    conversationExternalContactIds: ").append(toIndentedString(conversationExternalContactIds)).append("\n");
    sb.append("    conversationExternalOrganizationIds: ").append(toIndentedString(conversationExternalOrganizationIds)).append("\n");
    sb.append("    exitReason: ").append(toIndentedString(exitReason)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

