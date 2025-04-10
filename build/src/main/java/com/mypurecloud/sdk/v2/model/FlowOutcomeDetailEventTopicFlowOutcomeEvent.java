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
import com.mypurecloud.sdk.v2.model.FlowOutcomeDetailEventTopicFlowMilestone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowOutcomeDetailEventTopicFlowOutcomeEvent
 */

public class FlowOutcomeDetailEventTopicFlowOutcomeEvent  implements Serializable {
  
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
  private String flowOutcomeId = null;
  private Long flowOutcomeStartTime = null;
  private Long flowOutcomeEndTime = null;

  private static class FlowOutcomeValueEnumDeserializer extends StdDeserializer<FlowOutcomeValueEnum> {
    public FlowOutcomeValueEnumDeserializer() {
      super(FlowOutcomeValueEnumDeserializer.class);
    }

    @Override
    public FlowOutcomeValueEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowOutcomeValueEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowOutcomeValue
   */
 @JsonDeserialize(using = FlowOutcomeValueEnumDeserializer.class)
  public enum FlowOutcomeValueEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE");

    private String value;

    FlowOutcomeValueEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowOutcomeValueEnum fromString(String key) {
      if (key == null) return null;

      for (FlowOutcomeValueEnum value : FlowOutcomeValueEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowOutcomeValueEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlowOutcomeValueEnum flowOutcomeValue = null;
  private List<FlowOutcomeDetailEventTopicFlowMilestone> flowMilestones = null;
  private List<String> conversationExternalContactIds = null;
  private List<String> conversationExternalOrganizationIds = null;

  public FlowOutcomeDetailEventTopicFlowOutcomeEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      flowMilestones = new ArrayList<FlowOutcomeDetailEventTopicFlowMilestone>();
      conversationExternalContactIds = new ArrayList<String>();
      conversationExternalOrganizationIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent eventTime(Long eventTime) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent conversationId(String conversationId) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent participantId(String participantId) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent sessionId(String sessionId) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent mediaType(MediaTypeEnum mediaType) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent provider(String provider) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent direction(DirectionEnum direction) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent ani(String ani) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent dnis(String dnis) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent addressTo(String addressTo) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent addressFrom(String addressFrom) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent subject(String subject) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent messageType(MessageTypeEnum messageType) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowType(FlowTypeEnum flowType) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowId(String flowId) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent divisionId(String divisionId) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowVersion(String flowVersion) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowOutcomeId")
  public String getFlowOutcomeId() {
    return flowOutcomeId;
  }
  public void setFlowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
  }


  /**
   **/
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowOutcomeStartTime(Long flowOutcomeStartTime) {
    this.flowOutcomeStartTime = flowOutcomeStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowOutcomeStartTime")
  public Long getFlowOutcomeStartTime() {
    return flowOutcomeStartTime;
  }
  public void setFlowOutcomeStartTime(Long flowOutcomeStartTime) {
    this.flowOutcomeStartTime = flowOutcomeStartTime;
  }


  /**
   **/
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowOutcomeEndTime(Long flowOutcomeEndTime) {
    this.flowOutcomeEndTime = flowOutcomeEndTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowOutcomeEndTime")
  public Long getFlowOutcomeEndTime() {
    return flowOutcomeEndTime;
  }
  public void setFlowOutcomeEndTime(Long flowOutcomeEndTime) {
    this.flowOutcomeEndTime = flowOutcomeEndTime;
  }


  /**
   **/
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowOutcomeValue(FlowOutcomeValueEnum flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowOutcomeValue")
  public FlowOutcomeValueEnum getFlowOutcomeValue() {
    return flowOutcomeValue;
  }
  public void setFlowOutcomeValue(FlowOutcomeValueEnum flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
  }


  /**
   **/
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent flowMilestones(List<FlowOutcomeDetailEventTopicFlowMilestone> flowMilestones) {
    this.flowMilestones = flowMilestones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowMilestones")
  public List<FlowOutcomeDetailEventTopicFlowMilestone> getFlowMilestones() {
    return flowMilestones;
  }
  public void setFlowMilestones(List<FlowOutcomeDetailEventTopicFlowMilestone> flowMilestones) {
    this.flowMilestones = flowMilestones;
  }


  /**
   **/
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent conversationExternalContactIds(List<String> conversationExternalContactIds) {
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
  public FlowOutcomeDetailEventTopicFlowOutcomeEvent conversationExternalOrganizationIds(List<String> conversationExternalOrganizationIds) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowOutcomeDetailEventTopicFlowOutcomeEvent flowOutcomeDetailEventTopicFlowOutcomeEvent = (FlowOutcomeDetailEventTopicFlowOutcomeEvent) o;

    return Objects.equals(this.eventTime, flowOutcomeDetailEventTopicFlowOutcomeEvent.eventTime) &&
            Objects.equals(this.conversationId, flowOutcomeDetailEventTopicFlowOutcomeEvent.conversationId) &&
            Objects.equals(this.participantId, flowOutcomeDetailEventTopicFlowOutcomeEvent.participantId) &&
            Objects.equals(this.sessionId, flowOutcomeDetailEventTopicFlowOutcomeEvent.sessionId) &&
            Objects.equals(this.mediaType, flowOutcomeDetailEventTopicFlowOutcomeEvent.mediaType) &&
            Objects.equals(this.provider, flowOutcomeDetailEventTopicFlowOutcomeEvent.provider) &&
            Objects.equals(this.direction, flowOutcomeDetailEventTopicFlowOutcomeEvent.direction) &&
            Objects.equals(this.ani, flowOutcomeDetailEventTopicFlowOutcomeEvent.ani) &&
            Objects.equals(this.dnis, flowOutcomeDetailEventTopicFlowOutcomeEvent.dnis) &&
            Objects.equals(this.addressTo, flowOutcomeDetailEventTopicFlowOutcomeEvent.addressTo) &&
            Objects.equals(this.addressFrom, flowOutcomeDetailEventTopicFlowOutcomeEvent.addressFrom) &&
            Objects.equals(this.subject, flowOutcomeDetailEventTopicFlowOutcomeEvent.subject) &&
            Objects.equals(this.messageType, flowOutcomeDetailEventTopicFlowOutcomeEvent.messageType) &&
            Objects.equals(this.flowType, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowType) &&
            Objects.equals(this.flowId, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowId) &&
            Objects.equals(this.divisionId, flowOutcomeDetailEventTopicFlowOutcomeEvent.divisionId) &&
            Objects.equals(this.flowVersion, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowVersion) &&
            Objects.equals(this.flowOutcomeId, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowOutcomeId) &&
            Objects.equals(this.flowOutcomeStartTime, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowOutcomeStartTime) &&
            Objects.equals(this.flowOutcomeEndTime, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowOutcomeEndTime) &&
            Objects.equals(this.flowOutcomeValue, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowOutcomeValue) &&
            Objects.equals(this.flowMilestones, flowOutcomeDetailEventTopicFlowOutcomeEvent.flowMilestones) &&
            Objects.equals(this.conversationExternalContactIds, flowOutcomeDetailEventTopicFlowOutcomeEvent.conversationExternalContactIds) &&
            Objects.equals(this.conversationExternalOrganizationIds, flowOutcomeDetailEventTopicFlowOutcomeEvent.conversationExternalOrganizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, sessionId, mediaType, provider, direction, ani, dnis, addressTo, addressFrom, subject, messageType, flowType, flowId, divisionId, flowVersion, flowOutcomeId, flowOutcomeStartTime, flowOutcomeEndTime, flowOutcomeValue, flowMilestones, conversationExternalContactIds, conversationExternalOrganizationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowOutcomeDetailEventTopicFlowOutcomeEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
    sb.append("    flowOutcomeId: ").append(toIndentedString(flowOutcomeId)).append("\n");
    sb.append("    flowOutcomeStartTime: ").append(toIndentedString(flowOutcomeStartTime)).append("\n");
    sb.append("    flowOutcomeEndTime: ").append(toIndentedString(flowOutcomeEndTime)).append("\n");
    sb.append("    flowOutcomeValue: ").append(toIndentedString(flowOutcomeValue)).append("\n");
    sb.append("    flowMilestones: ").append(toIndentedString(flowMilestones)).append("\n");
    sb.append("    conversationExternalContactIds: ").append(toIndentedString(conversationExternalContactIds)).append("\n");
    sb.append("    conversationExternalOrganizationIds: ").append(toIndentedString(conversationExternalOrganizationIds)).append("\n");
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

