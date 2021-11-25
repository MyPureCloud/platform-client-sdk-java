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
import com.mypurecloud.sdk.v2.model.ConversationProperties;
import com.mypurecloud.sdk.v2.model.NumericRange;
import com.mypurecloud.sdk.v2.model.TranscriptTopics;
import com.mypurecloud.sdk.v2.model.Transcripts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ViewFilter
 */

public class ViewFilter  implements Serializable {
  

  private static class MediaTypesEnumDeserializer extends StdDeserializer<MediaTypesEnum> {
    public MediaTypesEnumDeserializer() {
      super(MediaTypesEnumDeserializer.class);
    }

    @Override
    public MediaTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaTypes
   */
 @JsonDeserialize(using = MediaTypesEnumDeserializer.class)
  public enum MediaTypesEnum {
    CALLBACK("callback"),
    CHAT("chat"),
    COBROWSE("cobrowse"),
    EMAIL("email"),
    MESSAGE("message"),
    SCREENSHARE("screenshare"),
    UNKNOWN("unknown"),
    VIDEO("video"),
    VOICE("voice");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();
  private List<String> queueIds = new ArrayList<String>();
  private List<String> skillIds = new ArrayList<String>();
  private List<String> skillGroups = new ArrayList<String>();
  private List<String> languageIds = new ArrayList<String>();
  private List<String> languageGroups = new ArrayList<String>();

  private static class DirectionsEnumDeserializer extends StdDeserializer<DirectionsEnum> {
    public DirectionsEnumDeserializer() {
      super(DirectionsEnumDeserializer.class);
    }

    @Override
    public DirectionsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets directions
   */
 @JsonDeserialize(using = DirectionsEnumDeserializer.class)
  public enum DirectionsEnum {
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionsEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionsEnum value : DirectionsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DirectionsEnum> directions = new ArrayList<DirectionsEnum>();

  private static class OriginatingDirectionsEnumDeserializer extends StdDeserializer<OriginatingDirectionsEnum> {
    public OriginatingDirectionsEnumDeserializer() {
      super(OriginatingDirectionsEnumDeserializer.class);
    }

    @Override
    public OriginatingDirectionsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginatingDirectionsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets originatingDirections
   */
 @JsonDeserialize(using = OriginatingDirectionsEnumDeserializer.class)
  public enum OriginatingDirectionsEnum {
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    OriginatingDirectionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginatingDirectionsEnum fromString(String key) {
      if (key == null) return null;

      for (OriginatingDirectionsEnum value : OriginatingDirectionsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginatingDirectionsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<OriginatingDirectionsEnum> originatingDirections = new ArrayList<OriginatingDirectionsEnum>();
  private List<String> wrapUpCodes = new ArrayList<String>();
  private List<String> dnisList = new ArrayList<String>();
  private List<String> sessionDnisList = new ArrayList<String>();
  private List<String> filterQueuesByUserIds = new ArrayList<String>();
  private List<String> filterUsersByQueueIds = new ArrayList<String>();
  private List<String> userIds = new ArrayList<String>();
  private List<String> addressTos = new ArrayList<String>();
  private List<String> addressFroms = new ArrayList<String>();
  private List<String> outboundCampaignIds = new ArrayList<String>();
  private List<String> outboundContactListIds = new ArrayList<String>();
  private List<String> contactIds = new ArrayList<String>();
  private List<String> externalContactIds = new ArrayList<String>();
  private List<String> externalOrgIds = new ArrayList<String>();
  private List<String> aniList = new ArrayList<String>();
  private List<NumericRange> durationsMilliseconds = new ArrayList<NumericRange>();
  private List<NumericRange> acdDurationsMilliseconds = new ArrayList<NumericRange>();
  private List<NumericRange> talkDurationsMilliseconds = new ArrayList<NumericRange>();
  private List<NumericRange> acwDurationsMilliseconds = new ArrayList<NumericRange>();
  private List<NumericRange> handleDurationsMilliseconds = new ArrayList<NumericRange>();
  private List<NumericRange> holdDurationsMilliseconds = new ArrayList<NumericRange>();
  private List<NumericRange> abandonDurationsMilliseconds = new ArrayList<NumericRange>();
  private NumericRange evaluationScore = null;
  private NumericRange evaluationCriticalScore = null;
  private List<String> evaluationFormIds = new ArrayList<String>();
  private List<String> evaluatedAgentIds = new ArrayList<String>();
  private List<String> evaluatorIds = new ArrayList<String>();
  private Boolean transferred = null;
  private Boolean abandoned = null;
  private Boolean answered = null;

  private static class MessageTypesEnumDeserializer extends StdDeserializer<MessageTypesEnum> {
    public MessageTypesEnumDeserializer() {
      super(MessageTypesEnumDeserializer.class);
    }

    @Override
    public MessageTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessageTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets messageTypes
   */
 @JsonDeserialize(using = MessageTypesEnumDeserializer.class)
  public enum MessageTypesEnum {
    SMS("sms"),
    TWITTER("twitter"),
    LINE("line"),
    FACEBOOK("facebook"),
    WHATSAPP("whatsapp"),
    WEBMESSAGING("webmessaging"),
    OPEN("open"),
    INSTAGRAM("instagram");

    private String value;

    MessageTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypesEnum value : MessageTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MessageTypesEnum> messageTypes = new ArrayList<MessageTypesEnum>();
  private List<String> divisionIds = new ArrayList<String>();
  private List<String> surveyFormIds = new ArrayList<String>();
  private NumericRange surveyTotalScore = null;
  private NumericRange surveyNpsScore = null;
  private NumericRange mos = null;
  private NumericRange surveyQuestionGroupScore = null;
  private NumericRange surveyPromoterScore = null;
  private List<String> surveyFormContextIds = new ArrayList<String>();
  private List<String> conversationIds = new ArrayList<String>();
  private List<String> sipCallIds = new ArrayList<String>();
  private Boolean isEnded = null;
  private Boolean isSurveyed = null;
  private List<NumericRange> surveyScores = new ArrayList<NumericRange>();
  private List<NumericRange> promoterScores = new ArrayList<NumericRange>();
  private Boolean isCampaign = null;
  private List<String> surveyStatuses = new ArrayList<String>();
  private ConversationProperties conversationProperties = null;
  private Boolean isBlindTransferred = null;
  private Boolean isConsulted = null;
  private Boolean isConsultTransferred = null;
  private List<String> remoteParticipants = new ArrayList<String>();
  private List<String> flowIds = new ArrayList<String>();
  private List<String> flowOutcomeIds = new ArrayList<String>();

  private static class FlowOutcomeValuesEnumDeserializer extends StdDeserializer<FlowOutcomeValuesEnum> {
    public FlowOutcomeValuesEnumDeserializer() {
      super(FlowOutcomeValuesEnumDeserializer.class);
    }

    @Override
    public FlowOutcomeValuesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowOutcomeValuesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowOutcomeValues
   */
 @JsonDeserialize(using = FlowOutcomeValuesEnumDeserializer.class)
  public enum FlowOutcomeValuesEnum {
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE");

    private String value;

    FlowOutcomeValuesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowOutcomeValuesEnum fromString(String key) {
      if (key == null) return null;

      for (FlowOutcomeValuesEnum value : FlowOutcomeValuesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowOutcomeValuesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FlowOutcomeValuesEnum> flowOutcomeValues = new ArrayList<FlowOutcomeValuesEnum>();

  private static class FlowDestinationTypesEnumDeserializer extends StdDeserializer<FlowDestinationTypesEnum> {
    public FlowDestinationTypesEnumDeserializer() {
      super(FlowDestinationTypesEnumDeserializer.class);
    }

    @Override
    public FlowDestinationTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowDestinationTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowDestinationTypes
   */
 @JsonDeserialize(using = FlowDestinationTypesEnumDeserializer.class)
  public enum FlowDestinationTypesEnum {
    ACD("ACD"),
    USER("USER"),
    GROUP("GROUP"),
    NUMBER("NUMBER"),
    FLOW("FLOW"),
    SECURE_FLOW("SECURE_FLOW"),
    ACD_VOICEMAIL("ACD_VOICEMAIL"),
    USER_VOICEMAIL("USER_VOICEMAIL"),
    GROUP_VOICEMAIL("GROUP_VOICEMAIL"),
    RETURN_TO_AGENT("RETURN_TO_AGENT");

    private String value;

    FlowDestinationTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowDestinationTypesEnum fromString(String key) {
      if (key == null) return null;

      for (FlowDestinationTypesEnum value : FlowDestinationTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowDestinationTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FlowDestinationTypesEnum> flowDestinationTypes = new ArrayList<FlowDestinationTypesEnum>();

  private static class FlowDisconnectReasonsEnumDeserializer extends StdDeserializer<FlowDisconnectReasonsEnum> {
    public FlowDisconnectReasonsEnumDeserializer() {
      super(FlowDisconnectReasonsEnumDeserializer.class);
    }

    @Override
    public FlowDisconnectReasonsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowDisconnectReasonsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowDisconnectReasons
   */
 @JsonDeserialize(using = FlowDisconnectReasonsEnumDeserializer.class)
  public enum FlowDisconnectReasonsEnum {
    FLOW_DISCONNECT("FLOW_DISCONNECT"),
    FLOW_ERROR_DISCONNECT("FLOW_ERROR_DISCONNECT"),
    DISCONNECT("DISCONNECT");

    private String value;

    FlowDisconnectReasonsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowDisconnectReasonsEnum fromString(String key) {
      if (key == null) return null;

      for (FlowDisconnectReasonsEnum value : FlowDisconnectReasonsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowDisconnectReasonsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FlowDisconnectReasonsEnum> flowDisconnectReasons = new ArrayList<FlowDisconnectReasonsEnum>();

  private static class FlowTypesEnumDeserializer extends StdDeserializer<FlowTypesEnum> {
    public FlowTypesEnumDeserializer() {
      super(FlowTypesEnumDeserializer.class);
    }

    @Override
    public FlowTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowTypes
   */
 @JsonDeserialize(using = FlowTypesEnumDeserializer.class)
  public enum FlowTypesEnum {
    BOT("bot"),
    COMMONMODULE("commonmodule"),
    INBOUNDCALL("inboundcall"),
    INBOUNDCHAT("inboundchat"),
    INBOUNDEMAIL("inboundemail"),
    INBOUNDSHORTMESSAGE("inboundshortmessage"),
    INQUEUECALL("inqueuecall"),
    INQUEUESHORTMESSAGE("inqueueshortmessage"),
    INQUEUEEMAIL("inqueueemail"),
    OUTBOUNDCALL("outboundcall"),
    SECURECALL("securecall"),
    SURVEYINVITE("surveyinvite"),
    VOICEMAIL("voicemail"),
    WORKFLOW("workflow"),
    WORKITEM("workitem");

    private String value;

    FlowTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowTypesEnum fromString(String key) {
      if (key == null) return null;

      for (FlowTypesEnum value : FlowTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FlowTypesEnum> flowTypes = new ArrayList<FlowTypesEnum>();

  private static class FlowEntryTypesEnumDeserializer extends StdDeserializer<FlowEntryTypesEnum> {
    public FlowEntryTypesEnumDeserializer() {
      super(FlowEntryTypesEnumDeserializer.class);
    }

    @Override
    public FlowEntryTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowEntryTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowEntryTypes
   */
 @JsonDeserialize(using = FlowEntryTypesEnumDeserializer.class)
  public enum FlowEntryTypesEnum {
    AGENT("agent"),
    DIRECT("direct"),
    DNIS("dnis"),
    FLOW("flow"),
    OUTBOUND("outbound");

    private String value;

    FlowEntryTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowEntryTypesEnum fromString(String key) {
      if (key == null) return null;

      for (FlowEntryTypesEnum value : FlowEntryTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowEntryTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FlowEntryTypesEnum> flowEntryTypes = new ArrayList<FlowEntryTypesEnum>();
  private List<String> flowEntryReasons = new ArrayList<String>();
  private List<String> flowVersions = new ArrayList<String>();
  private List<String> groupIds = new ArrayList<String>();
  private Boolean hasJourneyCustomerId = null;
  private Boolean hasJourneyActionMapId = null;
  private Boolean hasJourneyVisitId = null;
  private Boolean hasMedia = null;
  private List<String> roleIds = new ArrayList<String>();
  private List<String> reportsTos = new ArrayList<String>();
  private List<String> locationIds = new ArrayList<String>();
  private List<String> flowOutTypes = new ArrayList<String>();
  private List<String> providerList = new ArrayList<String>();
  private List<String> callbackNumberList = new ArrayList<String>();
  private String callbackInterval = null;

  private static class UsedRoutingTypesEnumDeserializer extends StdDeserializer<UsedRoutingTypesEnum> {
    public UsedRoutingTypesEnumDeserializer() {
      super(UsedRoutingTypesEnumDeserializer.class);
    }

    @Override
    public UsedRoutingTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UsedRoutingTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets usedRoutingTypes
   */
 @JsonDeserialize(using = UsedRoutingTypesEnumDeserializer.class)
  public enum UsedRoutingTypesEnum {
    BULLSEYE("Bullseye"),
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard");

    private String value;

    UsedRoutingTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UsedRoutingTypesEnum fromString(String key) {
      if (key == null) return null;

      for (UsedRoutingTypesEnum value : UsedRoutingTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UsedRoutingTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<UsedRoutingTypesEnum> usedRoutingTypes = new ArrayList<UsedRoutingTypesEnum>();

  private static class RequestedRoutingTypesEnumDeserializer extends StdDeserializer<RequestedRoutingTypesEnum> {
    public RequestedRoutingTypesEnumDeserializer() {
      super(RequestedRoutingTypesEnumDeserializer.class);
    }

    @Override
    public RequestedRoutingTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RequestedRoutingTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets requestedRoutingTypes
   */
 @JsonDeserialize(using = RequestedRoutingTypesEnumDeserializer.class)
  public enum RequestedRoutingTypesEnum {
    BULLSEYE("Bullseye"),
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard");

    private String value;

    RequestedRoutingTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RequestedRoutingTypesEnum fromString(String key) {
      if (key == null) return null;

      for (RequestedRoutingTypesEnum value : RequestedRoutingTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RequestedRoutingTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<RequestedRoutingTypesEnum> requestedRoutingTypes = new ArrayList<RequestedRoutingTypesEnum>();
  private Boolean hasAgentAssistId = null;
  private List<Transcripts> transcripts = new ArrayList<Transcripts>();
  private List<String> transcriptLanguages = new ArrayList<String>();

  private static class ParticipantPurposesEnumDeserializer extends StdDeserializer<ParticipantPurposesEnum> {
    public ParticipantPurposesEnumDeserializer() {
      super(ParticipantPurposesEnumDeserializer.class);
    }

    @Override
    public ParticipantPurposesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ParticipantPurposesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets participantPurposes
   */
 @JsonDeserialize(using = ParticipantPurposesEnumDeserializer.class)
  public enum ParticipantPurposesEnum {
    INTERNAL("internal"),
    EXTERNAL("external");

    private String value;

    ParticipantPurposesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParticipantPurposesEnum fromString(String key) {
      if (key == null) return null;

      for (ParticipantPurposesEnum value : ParticipantPurposesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParticipantPurposesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ParticipantPurposesEnum> participantPurposes = new ArrayList<ParticipantPurposesEnum>();
  private Boolean showFirstQueue = null;
  private List<String> teamIds = new ArrayList<String>();
  private List<String> filterUsersByTeamIds = new ArrayList<String>();
  private List<String> journeyActionMapIds = new ArrayList<String>();
  private List<String> journeyOutcomeIds = new ArrayList<String>();
  private List<String> journeySegmentIds = new ArrayList<String>();

  private static class JourneyActionMapTypesEnumDeserializer extends StdDeserializer<JourneyActionMapTypesEnum> {
    public JourneyActionMapTypesEnumDeserializer() {
      super(JourneyActionMapTypesEnumDeserializer.class);
    }

    @Override
    public JourneyActionMapTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return JourneyActionMapTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets journeyActionMapTypes
   */
 @JsonDeserialize(using = JourneyActionMapTypesEnumDeserializer.class)
  public enum JourneyActionMapTypesEnum {
    WEBCHAT("webchat"),
    WEBMESSAGINGOFFER("webMessagingOffer"),
    CONTENTOFFER("contentOffer"),
    INTEGRATIONACTION("integrationAction"),
    ARCHITECTFLOW("architectFlow"),
    OPENACTION("openAction");

    private String value;

    JourneyActionMapTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static JourneyActionMapTypesEnum fromString(String key) {
      if (key == null) return null;

      for (JourneyActionMapTypesEnum value : JourneyActionMapTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return JourneyActionMapTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<JourneyActionMapTypesEnum> journeyActionMapTypes = new ArrayList<JourneyActionMapTypesEnum>();

  private static class DevelopmentRoleListEnumDeserializer extends StdDeserializer<DevelopmentRoleListEnum> {
    public DevelopmentRoleListEnumDeserializer() {
      super(DevelopmentRoleListEnumDeserializer.class);
    }

    @Override
    public DevelopmentRoleListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DevelopmentRoleListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets developmentRoleList
   */
 @JsonDeserialize(using = DevelopmentRoleListEnumDeserializer.class)
  public enum DevelopmentRoleListEnum {
    CREATOR("Creator"),
    FACILITATOR("Facilitator"),
    ATTENDEE("Attendee");

    private String value;

    DevelopmentRoleListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DevelopmentRoleListEnum fromString(String key) {
      if (key == null) return null;

      for (DevelopmentRoleListEnum value : DevelopmentRoleListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DevelopmentRoleListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DevelopmentRoleListEnum> developmentRoleList = new ArrayList<DevelopmentRoleListEnum>();

  private static class DevelopmentTypeListEnumDeserializer extends StdDeserializer<DevelopmentTypeListEnum> {
    public DevelopmentTypeListEnumDeserializer() {
      super(DevelopmentTypeListEnumDeserializer.class);
    }

    @Override
    public DevelopmentTypeListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DevelopmentTypeListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets developmentTypeList
   */
 @JsonDeserialize(using = DevelopmentTypeListEnumDeserializer.class)
  public enum DevelopmentTypeListEnum {
    INFORMATIONAL("Informational"),
    COACHING("Coaching"),
    ASSESSMENT("Assessment"),
    ASSESSEDCONTENT("AssessedContent");

    private String value;

    DevelopmentTypeListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DevelopmentTypeListEnum fromString(String key) {
      if (key == null) return null;

      for (DevelopmentTypeListEnum value : DevelopmentTypeListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DevelopmentTypeListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DevelopmentTypeListEnum> developmentTypeList = new ArrayList<DevelopmentTypeListEnum>();

  private static class DevelopmentStatusListEnumDeserializer extends StdDeserializer<DevelopmentStatusListEnum> {
    public DevelopmentStatusListEnumDeserializer() {
      super(DevelopmentStatusListEnumDeserializer.class);
    }

    @Override
    public DevelopmentStatusListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DevelopmentStatusListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets developmentStatusList
   */
 @JsonDeserialize(using = DevelopmentStatusListEnumDeserializer.class)
  public enum DevelopmentStatusListEnum {
    PLANNED("Planned"),
    SCHEDULED("Scheduled"),
    INVALIDSCHEDULE("InvalidSchedule"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed");

    private String value;

    DevelopmentStatusListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DevelopmentStatusListEnum fromString(String key) {
      if (key == null) return null;

      for (DevelopmentStatusListEnum value : DevelopmentStatusListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DevelopmentStatusListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DevelopmentStatusListEnum> developmentStatusList = new ArrayList<DevelopmentStatusListEnum>();
  private List<String> developmentModuleIds = new ArrayList<String>();
  private Boolean developmentActivityOverdue = null;
  private NumericRange customerSentimentScore = null;
  private NumericRange customerSentimentTrend = null;
  private List<String> flowTransferTargets = new ArrayList<String>();
  private String developmentName = null;
  private List<String> topicIds = new ArrayList<String>();
  private List<String> externalTags = new ArrayList<String>();
  private Boolean isNotResponding = null;
  private Boolean isAuthenticated = null;
  private List<String> botIds = new ArrayList<String>();
  private List<String> botVersions = new ArrayList<String>();

  private static class BotMessageTypesEnumDeserializer extends StdDeserializer<BotMessageTypesEnum> {
    public BotMessageTypesEnumDeserializer() {
      super(BotMessageTypesEnumDeserializer.class);
    }

    @Override
    public BotMessageTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotMessageTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets botMessageTypes
   */
 @JsonDeserialize(using = BotMessageTypesEnumDeserializer.class)
  public enum BotMessageTypesEnum {
    UNKNOWN("Unknown"),
    PHONE("Phone"),
    SMS("SMS"),
    GENESYSCHATWIDGET("GenesysChatWidget"),
    FACEBOOKMESSENGER("FacebookMessenger"),
    WECHAT("WeChat"),
    WHATSAPP("Whatsapp"),
    APPLEBUSINESSCHAT("AppleBusinessChat"),
    TELEGRAM("Telegram"),
    SLACK("Slack"),
    SIGNAL("Signal"),
    LINE("Line"),
    DISCORD("Discord"),
    TWITTERDIRECTMESSAGE("TwitterDirectMessage"),
    OTHER("Other");

    private String value;

    BotMessageTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotMessageTypesEnum fromString(String key) {
      if (key == null) return null;

      for (BotMessageTypesEnum value : BotMessageTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotMessageTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BotMessageTypesEnum> botMessageTypes = new ArrayList<BotMessageTypesEnum>();

  private static class BotProviderListEnumDeserializer extends StdDeserializer<BotProviderListEnum> {
    public BotProviderListEnumDeserializer() {
      super(BotProviderListEnumDeserializer.class);
    }

    @Override
    public BotProviderListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotProviderListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets botProviderList
   */
 @JsonDeserialize(using = BotProviderListEnumDeserializer.class)
  public enum BotProviderListEnum {
    UNKNOWN("Unknown"),
    GENESYS("Genesys"),
    AMAZON("Amazon"),
    GOOGLE("Google"),
    NUANCE("Nuance");

    private String value;

    BotProviderListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotProviderListEnum fromString(String key) {
      if (key == null) return null;

      for (BotProviderListEnum value : BotProviderListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotProviderListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BotProviderListEnum> botProviderList = new ArrayList<BotProviderListEnum>();

  private static class BotProductListEnumDeserializer extends StdDeserializer<BotProductListEnum> {
    public BotProductListEnumDeserializer() {
      super(BotProductListEnumDeserializer.class);
    }

    @Override
    public BotProductListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotProductListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets botProductList
   */
 @JsonDeserialize(using = BotProductListEnumDeserializer.class)
  public enum BotProductListEnum {
    UNKNOWN("Unknown"),
    GENESYSDIALOGENGINE("GenesysDialogEngine"),
    AMAZONLEX("AmazonLex"),
    GOOGLEDIALOGFLOW("GoogleDialogFlow"),
    GOOGLEDIALOGFLOWRESELL("GoogleDialogFlowResell"),
    GENESYSBOTFLOW("GenesysBotFlow"),
    NUANCEDLG("NuanceDlg"),
    GOOGLEDIALOGFLOWCX("GoogleDialogFlowCx"),
    GENESYSBYOB("GenesysByob");

    private String value;

    BotProductListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotProductListEnum fromString(String key) {
      if (key == null) return null;

      for (BotProductListEnum value : BotProductListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotProductListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BotProductListEnum> botProductList = new ArrayList<BotProductListEnum>();

  private static class BotRecognitionFailureReasonListEnumDeserializer extends StdDeserializer<BotRecognitionFailureReasonListEnum> {
    public BotRecognitionFailureReasonListEnumDeserializer() {
      super(BotRecognitionFailureReasonListEnumDeserializer.class);
    }

    @Override
    public BotRecognitionFailureReasonListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotRecognitionFailureReasonListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets botRecognitionFailureReasonList
   */
 @JsonDeserialize(using = BotRecognitionFailureReasonListEnumDeserializer.class)
  public enum BotRecognitionFailureReasonListEnum {
    UNKNOWN("Unknown"),
    NOINPUTCOLLECTION("NoInputCollection"),
    NOINPUTCONFIRMATION("NoInputConfirmation"),
    NOMATCHCOLLECTION("NoMatchCollection"),
    NOMATCHCONFIRMATION("NoMatchConfirmation"),
    MAXWRONGMATCH("MaxWrongMatch");

    private String value;

    BotRecognitionFailureReasonListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotRecognitionFailureReasonListEnum fromString(String key) {
      if (key == null) return null;

      for (BotRecognitionFailureReasonListEnum value : BotRecognitionFailureReasonListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotRecognitionFailureReasonListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BotRecognitionFailureReasonListEnum> botRecognitionFailureReasonList = new ArrayList<BotRecognitionFailureReasonListEnum>();
  private List<String> botIntentList = new ArrayList<String>();
  private List<String> botFinalIntentList = new ArrayList<String>();
  private List<String> botSlotList = new ArrayList<String>();

  private static class BotResultListEnumDeserializer extends StdDeserializer<BotResultListEnum> {
    public BotResultListEnumDeserializer() {
      super(BotResultListEnumDeserializer.class);
    }

    @Override
    public BotResultListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotResultListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets botResultList
   */
 @JsonDeserialize(using = BotResultListEnumDeserializer.class)
  public enum BotResultListEnum {
    UNKNOWN("Unknown"),
    EXITREQUESTEDBYUSER("ExitRequestedByUser"),
    EXITREQUESTEDBYBOT("ExitRequestedByBot"),
    EXITERROR("ExitError"),
    EXITRECOGNITIONFAILURE("ExitRecognitionFailure"),
    DISCONNECTREQUESTEDBYUSER("DisconnectRequestedByUser"),
    DISCONNECTREQUESTEDBYBOT("DisconnectRequestedByBot"),
    DISCONNECTSESSIONEXPIRED("DisconnectSessionExpired"),
    DISCONNECTERROR("DisconnectError"),
    DISCONNECTRECOGNITIONFAILURE("DisconnectRecognitionFailure");

    private String value;

    BotResultListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotResultListEnum fromString(String key) {
      if (key == null) return null;

      for (BotResultListEnum value : BotResultListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotResultListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BotResultListEnum> botResultList = new ArrayList<BotResultListEnum>();

  private static class BlockedReasonsEnumDeserializer extends StdDeserializer<BlockedReasonsEnum> {
    public BlockedReasonsEnumDeserializer() {
      super(BlockedReasonsEnumDeserializer.class);
    }

    @Override
    public BlockedReasonsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BlockedReasonsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets blockedReasons
   */
 @JsonDeserialize(using = BlockedReasonsEnumDeserializer.class)
  public enum BlockedReasonsEnum {
    PAGEURLCONDITIONSNOTMATCHING("PageUrlConditionsNotMatching"),
    ALREADYEXISTINGOFFER("AlreadyExistingOffer"),
    TRIGGERDATEINFUTURE("TriggerDateInFuture"),
    MULTIPLESIMULTANEOUSOFFERS("MultipleSimultaneousOffers"),
    FREQUENCYCAPPING("FrequencyCapping"),
    OFFEREDOUTSIDESCHEDULE("OfferedOutsideSchedule"),
    SERVICELEVELTHROTTLING("ServiceLevelThrottling"),
    NOAVAILABLEAGENTS("NoAvailableAgents");

    private String value;

    BlockedReasonsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BlockedReasonsEnum fromString(String key) {
      if (key == null) return null;

      for (BlockedReasonsEnum value : BlockedReasonsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BlockedReasonsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BlockedReasonsEnum> blockedReasons = new ArrayList<BlockedReasonsEnum>();
  private Boolean isRecorded = null;
  private Boolean hasEvaluation = null;
  private Boolean hasScoredEvaluation = null;

  private static class EmailDeliveryStatusListEnumDeserializer extends StdDeserializer<EmailDeliveryStatusListEnum> {
    public EmailDeliveryStatusListEnumDeserializer() {
      super(EmailDeliveryStatusListEnumDeserializer.class);
    }

    @Override
    public EmailDeliveryStatusListEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EmailDeliveryStatusListEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets emailDeliveryStatusList
   */
 @JsonDeserialize(using = EmailDeliveryStatusListEnumDeserializer.class)
  public enum EmailDeliveryStatusListEnum {
    DELIVERYFAILED("DeliveryFailed"),
    DELIVERYSUCCESS("DeliverySuccess"),
    FAILED("Failed"),
    QUEUED("Queued"),
    READ("Read"),
    RECEIVED("Received"),
    SENT("Sent");

    private String value;

    EmailDeliveryStatusListEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EmailDeliveryStatusListEnum fromString(String key) {
      if (key == null) return null;

      for (EmailDeliveryStatusListEnum value : EmailDeliveryStatusListEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EmailDeliveryStatusListEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<EmailDeliveryStatusListEnum> emailDeliveryStatusList = new ArrayList<EmailDeliveryStatusListEnum>();
  private Boolean isAgentOwnedCallback = null;
  private List<String> agentCallbackOwnerIds = new ArrayList<String>();
  private List<TranscriptTopics> transcriptTopics = new ArrayList<TranscriptTopics>();
  private List<String> journeyFrequencyCapReasons = new ArrayList<String>();
  private List<String> journeyBlockingActionMapIds = new ArrayList<String>();
  private List<String> journeyActionTargetIds = new ArrayList<String>();
  private List<String> journeyBlockingScheduleGroupIds = new ArrayList<String>();
  private List<String> journeyBlockingEmergencyScheduleGroupIds = new ArrayList<String>();
  private List<String> journeyUrlEqualConditions = new ArrayList<String>();
  private List<String> journeyUrlNotEqualConditions = new ArrayList<String>();
  private List<String> journeyUrlStartsWithConditions = new ArrayList<String>();
  private List<String> journeyUrlEndsWithConditions = new ArrayList<String>();
  private List<String> journeyUrlContainsAnyConditions = new ArrayList<String>();
  private List<String> journeyUrlNotContainsAnyConditions = new ArrayList<String>();
  private List<String> journeyUrlContainsAllConditions = new ArrayList<String>();
  private List<String> journeyUrlNotContainsAllConditions = new ArrayList<String>();
  private List<String> flowMilestoneIds = new ArrayList<String>();

  
  /**
   * The media types are used to filter the view
   **/
  public ViewFilter mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media types are used to filter the view")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  /**
   * The queue ids are used to filter the view
   **/
  public ViewFilter queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ids are used to filter the view")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }

  
  /**
   * The skill ids are used to filter the view
   **/
  public ViewFilter skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill ids are used to filter the view")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * The skill groups used to filter the view
   **/
  public ViewFilter skillGroups(List<String> skillGroups) {
    this.skillGroups = skillGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill groups used to filter the view")
  @JsonProperty("skillGroups")
  public List<String> getSkillGroups() {
    return skillGroups;
  }
  public void setSkillGroups(List<String> skillGroups) {
    this.skillGroups = skillGroups;
  }

  
  /**
   * The language ids are used to filter the view
   **/
  public ViewFilter languageIds(List<String> languageIds) {
    this.languageIds = languageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language ids are used to filter the view")
  @JsonProperty("languageIds")
  public List<String> getLanguageIds() {
    return languageIds;
  }
  public void setLanguageIds(List<String> languageIds) {
    this.languageIds = languageIds;
  }

  
  /**
   * The language groups used to filter the view
   **/
  public ViewFilter languageGroups(List<String> languageGroups) {
    this.languageGroups = languageGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language groups used to filter the view")
  @JsonProperty("languageGroups")
  public List<String> getLanguageGroups() {
    return languageGroups;
  }
  public void setLanguageGroups(List<String> languageGroups) {
    this.languageGroups = languageGroups;
  }

  
  /**
   * The directions are used to filter the view
   **/
  public ViewFilter directions(List<DirectionsEnum> directions) {
    this.directions = directions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The directions are used to filter the view")
  @JsonProperty("directions")
  public List<DirectionsEnum> getDirections() {
    return directions;
  }
  public void setDirections(List<DirectionsEnum> directions) {
    this.directions = directions;
  }

  
  /**
   * The list of orginating directions used to filter the view
   **/
  public ViewFilter originatingDirections(List<OriginatingDirectionsEnum> originatingDirections) {
    this.originatingDirections = originatingDirections;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of orginating directions used to filter the view")
  @JsonProperty("originatingDirections")
  public List<OriginatingDirectionsEnum> getOriginatingDirections() {
    return originatingDirections;
  }
  public void setOriginatingDirections(List<OriginatingDirectionsEnum> originatingDirections) {
    this.originatingDirections = originatingDirections;
  }

  
  /**
   * The wrap up codes are used to filter the view
   **/
  public ViewFilter wrapUpCodes(List<String> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The wrap up codes are used to filter the view")
  @JsonProperty("wrapUpCodes")
  public List<String> getWrapUpCodes() {
    return wrapUpCodes;
  }
  public void setWrapUpCodes(List<String> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
  }

  
  /**
   * The dnis list is used to filter the view
   **/
  public ViewFilter dnisList(List<String> dnisList) {
    this.dnisList = dnisList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dnis list is used to filter the view")
  @JsonProperty("dnisList")
  public List<String> getDnisList() {
    return dnisList;
  }
  public void setDnisList(List<String> dnisList) {
    this.dnisList = dnisList;
  }

  
  /**
   * The list of session dnis used to filter the view
   **/
  public ViewFilter sessionDnisList(List<String> sessionDnisList) {
    this.sessionDnisList = sessionDnisList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of session dnis used to filter the view")
  @JsonProperty("sessionDnisList")
  public List<String> getSessionDnisList() {
    return sessionDnisList;
  }
  public void setSessionDnisList(List<String> sessionDnisList) {
    this.sessionDnisList = sessionDnisList;
  }

  
  /**
   * The user ids are used to fetch associated queues for the view
   **/
  public ViewFilter filterQueuesByUserIds(List<String> filterQueuesByUserIds) {
    this.filterQueuesByUserIds = filterQueuesByUserIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ids are used to fetch associated queues for the view")
  @JsonProperty("filterQueuesByUserIds")
  public List<String> getFilterQueuesByUserIds() {
    return filterQueuesByUserIds;
  }
  public void setFilterQueuesByUserIds(List<String> filterQueuesByUserIds) {
    this.filterQueuesByUserIds = filterQueuesByUserIds;
  }

  
  /**
   * The queue ids are used to fetch associated users for the view
   **/
  public ViewFilter filterUsersByQueueIds(List<String> filterUsersByQueueIds) {
    this.filterUsersByQueueIds = filterUsersByQueueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ids are used to fetch associated users for the view")
  @JsonProperty("filterUsersByQueueIds")
  public List<String> getFilterUsersByQueueIds() {
    return filterUsersByQueueIds;
  }
  public void setFilterUsersByQueueIds(List<String> filterUsersByQueueIds) {
    this.filterUsersByQueueIds = filterUsersByQueueIds;
  }

  
  /**
   * The user ids are used to filter the view
   **/
  public ViewFilter userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ids are used to filter the view")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  
  /**
   * The address To values are used to filter the view
   **/
  public ViewFilter addressTos(List<String> addressTos) {
    this.addressTos = addressTos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address To values are used to filter the view")
  @JsonProperty("addressTos")
  public List<String> getAddressTos() {
    return addressTos;
  }
  public void setAddressTos(List<String> addressTos) {
    this.addressTos = addressTos;
  }

  
  /**
   * The address from values are used to filter the view
   **/
  public ViewFilter addressFroms(List<String> addressFroms) {
    this.addressFroms = addressFroms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address from values are used to filter the view")
  @JsonProperty("addressFroms")
  public List<String> getAddressFroms() {
    return addressFroms;
  }
  public void setAddressFroms(List<String> addressFroms) {
    this.addressFroms = addressFroms;
  }

  
  /**
   * The outbound campaign ids are used to filter the view
   **/
  public ViewFilter outboundCampaignIds(List<String> outboundCampaignIds) {
    this.outboundCampaignIds = outboundCampaignIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outbound campaign ids are used to filter the view")
  @JsonProperty("outboundCampaignIds")
  public List<String> getOutboundCampaignIds() {
    return outboundCampaignIds;
  }
  public void setOutboundCampaignIds(List<String> outboundCampaignIds) {
    this.outboundCampaignIds = outboundCampaignIds;
  }

  
  /**
   * The outbound contact list ids are used to filter the view
   **/
  public ViewFilter outboundContactListIds(List<String> outboundContactListIds) {
    this.outboundContactListIds = outboundContactListIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outbound contact list ids are used to filter the view")
  @JsonProperty("outboundContactListIds")
  public List<String> getOutboundContactListIds() {
    return outboundContactListIds;
  }
  public void setOutboundContactListIds(List<String> outboundContactListIds) {
    this.outboundContactListIds = outboundContactListIds;
  }

  
  /**
   * The contact ids are used to filter the view
   **/
  public ViewFilter contactIds(List<String> contactIds) {
    this.contactIds = contactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact ids are used to filter the view")
  @JsonProperty("contactIds")
  public List<String> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<String> contactIds) {
    this.contactIds = contactIds;
  }

  
  /**
   * The external contact ids are used to filter the view
   **/
  public ViewFilter externalContactIds(List<String> externalContactIds) {
    this.externalContactIds = externalContactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external contact ids are used to filter the view")
  @JsonProperty("externalContactIds")
  public List<String> getExternalContactIds() {
    return externalContactIds;
  }
  public void setExternalContactIds(List<String> externalContactIds) {
    this.externalContactIds = externalContactIds;
  }

  
  /**
   * The external org ids are used to filter the view
   **/
  public ViewFilter externalOrgIds(List<String> externalOrgIds) {
    this.externalOrgIds = externalOrgIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external org ids are used to filter the view")
  @JsonProperty("externalOrgIds")
  public List<String> getExternalOrgIds() {
    return externalOrgIds;
  }
  public void setExternalOrgIds(List<String> externalOrgIds) {
    this.externalOrgIds = externalOrgIds;
  }

  
  /**
   * The ani list ids are used to filter the view
   **/
  public ViewFilter aniList(List<String> aniList) {
    this.aniList = aniList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ani list ids are used to filter the view")
  @JsonProperty("aniList")
  public List<String> getAniList() {
    return aniList;
  }
  public void setAniList(List<String> aniList) {
    this.aniList = aniList;
  }

  
  /**
   * The durations in milliseconds used to filter the view
   **/
  public ViewFilter durationsMilliseconds(List<NumericRange> durationsMilliseconds) {
    this.durationsMilliseconds = durationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The durations in milliseconds used to filter the view")
  @JsonProperty("durationsMilliseconds")
  public List<NumericRange> getDurationsMilliseconds() {
    return durationsMilliseconds;
  }
  public void setDurationsMilliseconds(List<NumericRange> durationsMilliseconds) {
    this.durationsMilliseconds = durationsMilliseconds;
  }

  
  /**
   * The acd durations in milliseconds used to filter the view
   **/
  public ViewFilter acdDurationsMilliseconds(List<NumericRange> acdDurationsMilliseconds) {
    this.acdDurationsMilliseconds = acdDurationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The acd durations in milliseconds used to filter the view")
  @JsonProperty("acdDurationsMilliseconds")
  public List<NumericRange> getAcdDurationsMilliseconds() {
    return acdDurationsMilliseconds;
  }
  public void setAcdDurationsMilliseconds(List<NumericRange> acdDurationsMilliseconds) {
    this.acdDurationsMilliseconds = acdDurationsMilliseconds;
  }

  
  /**
   * The talk durations in milliseconds used to filter the view
   **/
  public ViewFilter talkDurationsMilliseconds(List<NumericRange> talkDurationsMilliseconds) {
    this.talkDurationsMilliseconds = talkDurationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The talk durations in milliseconds used to filter the view")
  @JsonProperty("talkDurationsMilliseconds")
  public List<NumericRange> getTalkDurationsMilliseconds() {
    return talkDurationsMilliseconds;
  }
  public void setTalkDurationsMilliseconds(List<NumericRange> talkDurationsMilliseconds) {
    this.talkDurationsMilliseconds = talkDurationsMilliseconds;
  }

  
  /**
   * The acw durations in milliseconds used to filter the view
   **/
  public ViewFilter acwDurationsMilliseconds(List<NumericRange> acwDurationsMilliseconds) {
    this.acwDurationsMilliseconds = acwDurationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The acw durations in milliseconds used to filter the view")
  @JsonProperty("acwDurationsMilliseconds")
  public List<NumericRange> getAcwDurationsMilliseconds() {
    return acwDurationsMilliseconds;
  }
  public void setAcwDurationsMilliseconds(List<NumericRange> acwDurationsMilliseconds) {
    this.acwDurationsMilliseconds = acwDurationsMilliseconds;
  }

  
  /**
   * The handle durations in milliseconds used to filter the view
   **/
  public ViewFilter handleDurationsMilliseconds(List<NumericRange> handleDurationsMilliseconds) {
    this.handleDurationsMilliseconds = handleDurationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The handle durations in milliseconds used to filter the view")
  @JsonProperty("handleDurationsMilliseconds")
  public List<NumericRange> getHandleDurationsMilliseconds() {
    return handleDurationsMilliseconds;
  }
  public void setHandleDurationsMilliseconds(List<NumericRange> handleDurationsMilliseconds) {
    this.handleDurationsMilliseconds = handleDurationsMilliseconds;
  }

  
  /**
   * The hold durations in milliseconds used to filter the view
   **/
  public ViewFilter holdDurationsMilliseconds(List<NumericRange> holdDurationsMilliseconds) {
    this.holdDurationsMilliseconds = holdDurationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The hold durations in milliseconds used to filter the view")
  @JsonProperty("holdDurationsMilliseconds")
  public List<NumericRange> getHoldDurationsMilliseconds() {
    return holdDurationsMilliseconds;
  }
  public void setHoldDurationsMilliseconds(List<NumericRange> holdDurationsMilliseconds) {
    this.holdDurationsMilliseconds = holdDurationsMilliseconds;
  }

  
  /**
   * The abandon durations in milliseconds used to filter the view
   **/
  public ViewFilter abandonDurationsMilliseconds(List<NumericRange> abandonDurationsMilliseconds) {
    this.abandonDurationsMilliseconds = abandonDurationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The abandon durations in milliseconds used to filter the view")
  @JsonProperty("abandonDurationsMilliseconds")
  public List<NumericRange> getAbandonDurationsMilliseconds() {
    return abandonDurationsMilliseconds;
  }
  public void setAbandonDurationsMilliseconds(List<NumericRange> abandonDurationsMilliseconds) {
    this.abandonDurationsMilliseconds = abandonDurationsMilliseconds;
  }

  
  /**
   * The evaluationScore is used to filter the view
   **/
  public ViewFilter evaluationScore(NumericRange evaluationScore) {
    this.evaluationScore = evaluationScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluationScore is used to filter the view")
  @JsonProperty("evaluationScore")
  public NumericRange getEvaluationScore() {
    return evaluationScore;
  }
  public void setEvaluationScore(NumericRange evaluationScore) {
    this.evaluationScore = evaluationScore;
  }

  
  /**
   * The evaluationCriticalScore is used to filter the view
   **/
  public ViewFilter evaluationCriticalScore(NumericRange evaluationCriticalScore) {
    this.evaluationCriticalScore = evaluationCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluationCriticalScore is used to filter the view")
  @JsonProperty("evaluationCriticalScore")
  public NumericRange getEvaluationCriticalScore() {
    return evaluationCriticalScore;
  }
  public void setEvaluationCriticalScore(NumericRange evaluationCriticalScore) {
    this.evaluationCriticalScore = evaluationCriticalScore;
  }

  
  /**
   * The evaluation form ids are used to filter the view
   **/
  public ViewFilter evaluationFormIds(List<String> evaluationFormIds) {
    this.evaluationFormIds = evaluationFormIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluation form ids are used to filter the view")
  @JsonProperty("evaluationFormIds")
  public List<String> getEvaluationFormIds() {
    return evaluationFormIds;
  }
  public void setEvaluationFormIds(List<String> evaluationFormIds) {
    this.evaluationFormIds = evaluationFormIds;
  }

  
  /**
   * The evaluated agent ids are used to filter the view
   **/
  public ViewFilter evaluatedAgentIds(List<String> evaluatedAgentIds) {
    this.evaluatedAgentIds = evaluatedAgentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluated agent ids are used to filter the view")
  @JsonProperty("evaluatedAgentIds")
  public List<String> getEvaluatedAgentIds() {
    return evaluatedAgentIds;
  }
  public void setEvaluatedAgentIds(List<String> evaluatedAgentIds) {
    this.evaluatedAgentIds = evaluatedAgentIds;
  }

  
  /**
   * The evaluator ids are used to filter the view
   **/
  public ViewFilter evaluatorIds(List<String> evaluatorIds) {
    this.evaluatorIds = evaluatorIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluator ids are used to filter the view")
  @JsonProperty("evaluatorIds")
  public List<String> getEvaluatorIds() {
    return evaluatorIds;
  }
  public void setEvaluatorIds(List<String> evaluatorIds) {
    this.evaluatorIds = evaluatorIds;
  }

  
  /**
   * Indicates filtering for transfers
   **/
  public ViewFilter transferred(Boolean transferred) {
    this.transferred = transferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for transfers")
  @JsonProperty("transferred")
  public Boolean getTransferred() {
    return transferred;
  }
  public void setTransferred(Boolean transferred) {
    this.transferred = transferred;
  }

  
  /**
   * Indicates filtering for abandons
   **/
  public ViewFilter abandoned(Boolean abandoned) {
    this.abandoned = abandoned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for abandons")
  @JsonProperty("abandoned")
  public Boolean getAbandoned() {
    return abandoned;
  }
  public void setAbandoned(Boolean abandoned) {
    this.abandoned = abandoned;
  }

  
  /**
   * Indicates filtering for answered interactions
   **/
  public ViewFilter answered(Boolean answered) {
    this.answered = answered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for answered interactions")
  @JsonProperty("answered")
  public Boolean getAnswered() {
    return answered;
  }
  public void setAnswered(Boolean answered) {
    this.answered = answered;
  }

  
  /**
   * The message media types used to filter the view
   **/
  public ViewFilter messageTypes(List<MessageTypesEnum> messageTypes) {
    this.messageTypes = messageTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message media types used to filter the view")
  @JsonProperty("messageTypes")
  public List<MessageTypesEnum> getMessageTypes() {
    return messageTypes;
  }
  public void setMessageTypes(List<MessageTypesEnum> messageTypes) {
    this.messageTypes = messageTypes;
  }

  
  /**
   * The divison Ids used to filter the view
   **/
  public ViewFilter divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The divison Ids used to filter the view")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }

  
  /**
   * The survey form ids used to filter the view
   **/
  public ViewFilter surveyFormIds(List<String> surveyFormIds) {
    this.surveyFormIds = surveyFormIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey form ids used to filter the view")
  @JsonProperty("surveyFormIds")
  public List<String> getSurveyFormIds() {
    return surveyFormIds;
  }
  public void setSurveyFormIds(List<String> surveyFormIds) {
    this.surveyFormIds = surveyFormIds;
  }

  
  /**
   * The survey total score used to filter the view
   **/
  public ViewFilter surveyTotalScore(NumericRange surveyTotalScore) {
    this.surveyTotalScore = surveyTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey total score used to filter the view")
  @JsonProperty("surveyTotalScore")
  public NumericRange getSurveyTotalScore() {
    return surveyTotalScore;
  }
  public void setSurveyTotalScore(NumericRange surveyTotalScore) {
    this.surveyTotalScore = surveyTotalScore;
  }

  
  /**
   * The survey NPS score used to filter the view
   **/
  public ViewFilter surveyNpsScore(NumericRange surveyNpsScore) {
    this.surveyNpsScore = surveyNpsScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey NPS score used to filter the view")
  @JsonProperty("surveyNpsScore")
  public NumericRange getSurveyNpsScore() {
    return surveyNpsScore;
  }
  public void setSurveyNpsScore(NumericRange surveyNpsScore) {
    this.surveyNpsScore = surveyNpsScore;
  }

  
  /**
   * The desired range for mos values
   **/
  public ViewFilter mos(NumericRange mos) {
    this.mos = mos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The desired range for mos values")
  @JsonProperty("mos")
  public NumericRange getMos() {
    return mos;
  }
  public void setMos(NumericRange mos) {
    this.mos = mos;
  }

  
  /**
   * The survey question group score used to filter the view
   **/
  public ViewFilter surveyQuestionGroupScore(NumericRange surveyQuestionGroupScore) {
    this.surveyQuestionGroupScore = surveyQuestionGroupScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey question group score used to filter the view")
  @JsonProperty("surveyQuestionGroupScore")
  public NumericRange getSurveyQuestionGroupScore() {
    return surveyQuestionGroupScore;
  }
  public void setSurveyQuestionGroupScore(NumericRange surveyQuestionGroupScore) {
    this.surveyQuestionGroupScore = surveyQuestionGroupScore;
  }

  
  /**
   * The survey promoter score used to filter the view
   **/
  public ViewFilter surveyPromoterScore(NumericRange surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey promoter score used to filter the view")
  @JsonProperty("surveyPromoterScore")
  public NumericRange getSurveyPromoterScore() {
    return surveyPromoterScore;
  }
  public void setSurveyPromoterScore(NumericRange surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
  }

  
  /**
   * The list of survey form context ids used to filter the view
   **/
  public ViewFilter surveyFormContextIds(List<String> surveyFormContextIds) {
    this.surveyFormContextIds = surveyFormContextIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of survey form context ids used to filter the view")
  @JsonProperty("surveyFormContextIds")
  public List<String> getSurveyFormContextIds() {
    return surveyFormContextIds;
  }
  public void setSurveyFormContextIds(List<String> surveyFormContextIds) {
    this.surveyFormContextIds = surveyFormContextIds;
  }

  
  /**
   * The list of conversation ids used to filter the view
   **/
  public ViewFilter conversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of conversation ids used to filter the view")
  @JsonProperty("conversationIds")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }

  
  /**
   * The list of SIP call ids used to filter the view
   **/
  public ViewFilter sipCallIds(List<String> sipCallIds) {
    this.sipCallIds = sipCallIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of SIP call ids used to filter the view")
  @JsonProperty("sipCallIds")
  public List<String> getSipCallIds() {
    return sipCallIds;
  }
  public void setSipCallIds(List<String> sipCallIds) {
    this.sipCallIds = sipCallIds;
  }

  
  /**
   * Indicates filtering for ended
   **/
  public ViewFilter isEnded(Boolean isEnded) {
    this.isEnded = isEnded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for ended")
  @JsonProperty("isEnded")
  public Boolean getIsEnded() {
    return isEnded;
  }
  public void setIsEnded(Boolean isEnded) {
    this.isEnded = isEnded;
  }

  
  /**
   * Indicates filtering for survey
   **/
  public ViewFilter isSurveyed(Boolean isSurveyed) {
    this.isSurveyed = isSurveyed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for survey")
  @JsonProperty("isSurveyed")
  public Boolean getIsSurveyed() {
    return isSurveyed;
  }
  public void setIsSurveyed(Boolean isSurveyed) {
    this.isSurveyed = isSurveyed;
  }

  
  /**
   * The list of survey score ranges used to filter the view
   **/
  public ViewFilter surveyScores(List<NumericRange> surveyScores) {
    this.surveyScores = surveyScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of survey score ranges used to filter the view")
  @JsonProperty("surveyScores")
  public List<NumericRange> getSurveyScores() {
    return surveyScores;
  }
  public void setSurveyScores(List<NumericRange> surveyScores) {
    this.surveyScores = surveyScores;
  }

  
  /**
   * The list of promoter score ranges used to filter the view
   **/
  public ViewFilter promoterScores(List<NumericRange> promoterScores) {
    this.promoterScores = promoterScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of promoter score ranges used to filter the view")
  @JsonProperty("promoterScores")
  public List<NumericRange> getPromoterScores() {
    return promoterScores;
  }
  public void setPromoterScores(List<NumericRange> promoterScores) {
    this.promoterScores = promoterScores;
  }

  
  /**
   * Indicates filtering for campaign
   **/
  public ViewFilter isCampaign(Boolean isCampaign) {
    this.isCampaign = isCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for campaign")
  @JsonProperty("isCampaign")
  public Boolean getIsCampaign() {
    return isCampaign;
  }
  public void setIsCampaign(Boolean isCampaign) {
    this.isCampaign = isCampaign;
  }

  
  /**
   * The list of survey statuses used to filter the view
   **/
  public ViewFilter surveyStatuses(List<String> surveyStatuses) {
    this.surveyStatuses = surveyStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of survey statuses used to filter the view")
  @JsonProperty("surveyStatuses")
  public List<String> getSurveyStatuses() {
    return surveyStatuses;
  }
  public void setSurveyStatuses(List<String> surveyStatuses) {
    this.surveyStatuses = surveyStatuses;
  }

  
  /**
   * A grouping of conversation level filters
   **/
  public ViewFilter conversationProperties(ConversationProperties conversationProperties) {
    this.conversationProperties = conversationProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A grouping of conversation level filters")
  @JsonProperty("conversationProperties")
  public ConversationProperties getConversationProperties() {
    return conversationProperties;
  }
  public void setConversationProperties(ConversationProperties conversationProperties) {
    this.conversationProperties = conversationProperties;
  }

  
  /**
   * Indicates filtering for blind transferred
   **/
  public ViewFilter isBlindTransferred(Boolean isBlindTransferred) {
    this.isBlindTransferred = isBlindTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for blind transferred")
  @JsonProperty("isBlindTransferred")
  public Boolean getIsBlindTransferred() {
    return isBlindTransferred;
  }
  public void setIsBlindTransferred(Boolean isBlindTransferred) {
    this.isBlindTransferred = isBlindTransferred;
  }

  
  /**
   * Indicates filtering for consulted
   **/
  public ViewFilter isConsulted(Boolean isConsulted) {
    this.isConsulted = isConsulted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for consulted")
  @JsonProperty("isConsulted")
  public Boolean getIsConsulted() {
    return isConsulted;
  }
  public void setIsConsulted(Boolean isConsulted) {
    this.isConsulted = isConsulted;
  }

  
  /**
   * Indicates filtering for consult transferred
   **/
  public ViewFilter isConsultTransferred(Boolean isConsultTransferred) {
    this.isConsultTransferred = isConsultTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for consult transferred")
  @JsonProperty("isConsultTransferred")
  public Boolean getIsConsultTransferred() {
    return isConsultTransferred;
  }
  public void setIsConsultTransferred(Boolean isConsultTransferred) {
    this.isConsultTransferred = isConsultTransferred;
  }

  
  /**
   * The list of remote participants used to filter the view
   **/
  public ViewFilter remoteParticipants(List<String> remoteParticipants) {
    this.remoteParticipants = remoteParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of remote participants used to filter the view")
  @JsonProperty("remoteParticipants")
  public List<String> getRemoteParticipants() {
    return remoteParticipants;
  }
  public void setRemoteParticipants(List<String> remoteParticipants) {
    this.remoteParticipants = remoteParticipants;
  }

  
  /**
   * The list of flow Ids
   **/
  public ViewFilter flowIds(List<String> flowIds) {
    this.flowIds = flowIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of flow Ids")
  @JsonProperty("flowIds")
  public List<String> getFlowIds() {
    return flowIds;
  }
  public void setFlowIds(List<String> flowIds) {
    this.flowIds = flowIds;
  }

  
  /**
   * A list of outcome ids of the flow
   **/
  public ViewFilter flowOutcomeIds(List<String> flowOutcomeIds) {
    this.flowOutcomeIds = flowOutcomeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of outcome ids of the flow")
  @JsonProperty("flowOutcomeIds")
  public List<String> getFlowOutcomeIds() {
    return flowOutcomeIds;
  }
  public void setFlowOutcomeIds(List<String> flowOutcomeIds) {
    this.flowOutcomeIds = flowOutcomeIds;
  }

  
  /**
   * A list of outcome values of the flow
   **/
  public ViewFilter flowOutcomeValues(List<FlowOutcomeValuesEnum> flowOutcomeValues) {
    this.flowOutcomeValues = flowOutcomeValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of outcome values of the flow")
  @JsonProperty("flowOutcomeValues")
  public List<FlowOutcomeValuesEnum> getFlowOutcomeValues() {
    return flowOutcomeValues;
  }
  public void setFlowOutcomeValues(List<FlowOutcomeValuesEnum> flowOutcomeValues) {
    this.flowOutcomeValues = flowOutcomeValues;
  }

  
  /**
   * The list of destination types of the flow
   **/
  public ViewFilter flowDestinationTypes(List<FlowDestinationTypesEnum> flowDestinationTypes) {
    this.flowDestinationTypes = flowDestinationTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of destination types of the flow")
  @JsonProperty("flowDestinationTypes")
  public List<FlowDestinationTypesEnum> getFlowDestinationTypes() {
    return flowDestinationTypes;
  }
  public void setFlowDestinationTypes(List<FlowDestinationTypesEnum> flowDestinationTypes) {
    this.flowDestinationTypes = flowDestinationTypes;
  }

  
  /**
   * The list of reasons for the flow to disconnect
   **/
  public ViewFilter flowDisconnectReasons(List<FlowDisconnectReasonsEnum> flowDisconnectReasons) {
    this.flowDisconnectReasons = flowDisconnectReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of reasons for the flow to disconnect")
  @JsonProperty("flowDisconnectReasons")
  public List<FlowDisconnectReasonsEnum> getFlowDisconnectReasons() {
    return flowDisconnectReasons;
  }
  public void setFlowDisconnectReasons(List<FlowDisconnectReasonsEnum> flowDisconnectReasons) {
    this.flowDisconnectReasons = flowDisconnectReasons;
  }

  
  /**
   * A list of types of the flow
   **/
  public ViewFilter flowTypes(List<FlowTypesEnum> flowTypes) {
    this.flowTypes = flowTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of types of the flow")
  @JsonProperty("flowTypes")
  public List<FlowTypesEnum> getFlowTypes() {
    return flowTypes;
  }
  public void setFlowTypes(List<FlowTypesEnum> flowTypes) {
    this.flowTypes = flowTypes;
  }

  
  /**
   * A list of types of the flow entry
   **/
  public ViewFilter flowEntryTypes(List<FlowEntryTypesEnum> flowEntryTypes) {
    this.flowEntryTypes = flowEntryTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of types of the flow entry")
  @JsonProperty("flowEntryTypes")
  public List<FlowEntryTypesEnum> getFlowEntryTypes() {
    return flowEntryTypes;
  }
  public void setFlowEntryTypes(List<FlowEntryTypesEnum> flowEntryTypes) {
    this.flowEntryTypes = flowEntryTypes;
  }

  
  /**
   * A list of reasons of flow entry
   **/
  public ViewFilter flowEntryReasons(List<String> flowEntryReasons) {
    this.flowEntryReasons = flowEntryReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of reasons of flow entry")
  @JsonProperty("flowEntryReasons")
  public List<String> getFlowEntryReasons() {
    return flowEntryReasons;
  }
  public void setFlowEntryReasons(List<String> flowEntryReasons) {
    this.flowEntryReasons = flowEntryReasons;
  }

  
  /**
   * A list of versions of a flow
   **/
  public ViewFilter flowVersions(List<String> flowVersions) {
    this.flowVersions = flowVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of versions of a flow")
  @JsonProperty("flowVersions")
  public List<String> getFlowVersions() {
    return flowVersions;
  }
  public void setFlowVersions(List<String> flowVersions) {
    this.flowVersions = flowVersions;
  }

  
  /**
   * A list of directory group ids
   **/
  public ViewFilter groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of directory group ids")
  @JsonProperty("groupIds")
  public List<String> getGroupIds() {
    return groupIds;
  }
  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  
  /**
   * Indicates filtering for journey customer id
   **/
  public ViewFilter hasJourneyCustomerId(Boolean hasJourneyCustomerId) {
    this.hasJourneyCustomerId = hasJourneyCustomerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for journey customer id")
  @JsonProperty("hasJourneyCustomerId")
  public Boolean getHasJourneyCustomerId() {
    return hasJourneyCustomerId;
  }
  public void setHasJourneyCustomerId(Boolean hasJourneyCustomerId) {
    this.hasJourneyCustomerId = hasJourneyCustomerId;
  }

  
  /**
   * Indicates filtering for Journey action map id
   **/
  public ViewFilter hasJourneyActionMapId(Boolean hasJourneyActionMapId) {
    this.hasJourneyActionMapId = hasJourneyActionMapId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for Journey action map id")
  @JsonProperty("hasJourneyActionMapId")
  public Boolean getHasJourneyActionMapId() {
    return hasJourneyActionMapId;
  }
  public void setHasJourneyActionMapId(Boolean hasJourneyActionMapId) {
    this.hasJourneyActionMapId = hasJourneyActionMapId;
  }

  
  /**
   * Indicates filtering for Journey visit id
   **/
  public ViewFilter hasJourneyVisitId(Boolean hasJourneyVisitId) {
    this.hasJourneyVisitId = hasJourneyVisitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for Journey visit id")
  @JsonProperty("hasJourneyVisitId")
  public Boolean getHasJourneyVisitId() {
    return hasJourneyVisitId;
  }
  public void setHasJourneyVisitId(Boolean hasJourneyVisitId) {
    this.hasJourneyVisitId = hasJourneyVisitId;
  }

  
  /**
   * Indicates filtering for presence of MMS media
   **/
  public ViewFilter hasMedia(Boolean hasMedia) {
    this.hasMedia = hasMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for presence of MMS media")
  @JsonProperty("hasMedia")
  public Boolean getHasMedia() {
    return hasMedia;
  }
  public void setHasMedia(Boolean hasMedia) {
    this.hasMedia = hasMedia;
  }

  
  /**
   * The role Ids used to filter the view
   **/
  public ViewFilter roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The role Ids used to filter the view")
  @JsonProperty("roleIds")
  public List<String> getRoleIds() {
    return roleIds;
  }
  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }

  
  /**
   * The report to user IDs used to filter the view
   **/
  public ViewFilter reportsTos(List<String> reportsTos) {
    this.reportsTos = reportsTos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The report to user IDs used to filter the view")
  @JsonProperty("reportsTos")
  public List<String> getReportsTos() {
    return reportsTos;
  }
  public void setReportsTos(List<String> reportsTos) {
    this.reportsTos = reportsTos;
  }

  
  /**
   * The location Ids used to filter the view
   **/
  public ViewFilter locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location Ids used to filter the view")
  @JsonProperty("locationIds")
  public List<String> getLocationIds() {
    return locationIds;
  }
  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  
  /**
   * A list of flow out types
   **/
  public ViewFilter flowOutTypes(List<String> flowOutTypes) {
    this.flowOutTypes = flowOutTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of flow out types")
  @JsonProperty("flowOutTypes")
  public List<String> getFlowOutTypes() {
    return flowOutTypes;
  }
  public void setFlowOutTypes(List<String> flowOutTypes) {
    this.flowOutTypes = flowOutTypes;
  }

  
  /**
   * A list of providers
   **/
  public ViewFilter providerList(List<String> providerList) {
    this.providerList = providerList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of providers")
  @JsonProperty("providerList")
  public List<String> getProviderList() {
    return providerList;
  }
  public void setProviderList(List<String> providerList) {
    this.providerList = providerList;
  }

  
  /**
   * A list of callback numbers or substrings of numbers (ex: [\"317\", \"13172222222\"])
   **/
  public ViewFilter callbackNumberList(List<String> callbackNumberList) {
    this.callbackNumberList = callbackNumberList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of callback numbers or substrings of numbers (ex: [\"317\", \"13172222222\"])")
  @JsonProperty("callbackNumberList")
  public List<String> getCallbackNumberList() {
    return callbackNumberList;
  }
  public void setCallbackNumberList(List<String> callbackNumberList) {
    this.callbackNumberList = callbackNumberList;
  }

  
  /**
   * An interval of time to filter for scheduled callbacks. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public ViewFilter callbackInterval(String callbackInterval) {
    this.callbackInterval = callbackInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An interval of time to filter for scheduled callbacks. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("callbackInterval")
  public String getCallbackInterval() {
    return callbackInterval;
  }
  public void setCallbackInterval(String callbackInterval) {
    this.callbackInterval = callbackInterval;
  }

  
  /**
   * A list of routing types used
   **/
  public ViewFilter usedRoutingTypes(List<UsedRoutingTypesEnum> usedRoutingTypes) {
    this.usedRoutingTypes = usedRoutingTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of routing types used")
  @JsonProperty("usedRoutingTypes")
  public List<UsedRoutingTypesEnum> getUsedRoutingTypes() {
    return usedRoutingTypes;
  }
  public void setUsedRoutingTypes(List<UsedRoutingTypesEnum> usedRoutingTypes) {
    this.usedRoutingTypes = usedRoutingTypes;
  }

  
  /**
   * A list of routing types requested
   **/
  public ViewFilter requestedRoutingTypes(List<RequestedRoutingTypesEnum> requestedRoutingTypes) {
    this.requestedRoutingTypes = requestedRoutingTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of routing types requested")
  @JsonProperty("requestedRoutingTypes")
  public List<RequestedRoutingTypesEnum> getRequestedRoutingTypes() {
    return requestedRoutingTypes;
  }
  public void setRequestedRoutingTypes(List<RequestedRoutingTypesEnum> requestedRoutingTypes) {
    this.requestedRoutingTypes = requestedRoutingTypes;
  }

  
  /**
   * Indicates filtering for agent assist id
   **/
  public ViewFilter hasAgentAssistId(Boolean hasAgentAssistId) {
    this.hasAgentAssistId = hasAgentAssistId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for agent assist id")
  @JsonProperty("hasAgentAssistId")
  public Boolean getHasAgentAssistId() {
    return hasAgentAssistId;
  }
  public void setHasAgentAssistId(Boolean hasAgentAssistId) {
    this.hasAgentAssistId = hasAgentAssistId;
  }

  
  /**
   * A list of transcript contents requested
   **/
  public ViewFilter transcripts(List<Transcripts> transcripts) {
    this.transcripts = transcripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of transcript contents requested")
  @JsonProperty("transcripts")
  public List<Transcripts> getTranscripts() {
    return transcripts;
  }
  public void setTranscripts(List<Transcripts> transcripts) {
    this.transcripts = transcripts;
  }

  
  /**
   * A list of transcript languages requested
   **/
  public ViewFilter transcriptLanguages(List<String> transcriptLanguages) {
    this.transcriptLanguages = transcriptLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of transcript languages requested")
  @JsonProperty("transcriptLanguages")
  public List<String> getTranscriptLanguages() {
    return transcriptLanguages;
  }
  public void setTranscriptLanguages(List<String> transcriptLanguages) {
    this.transcriptLanguages = transcriptLanguages;
  }

  
  /**
   * A list of participant purpose requested
   **/
  public ViewFilter participantPurposes(List<ParticipantPurposesEnum> participantPurposes) {
    this.participantPurposes = participantPurposes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of participant purpose requested")
  @JsonProperty("participantPurposes")
  public List<ParticipantPurposesEnum> getParticipantPurposes() {
    return participantPurposes;
  }
  public void setParticipantPurposes(List<ParticipantPurposesEnum> participantPurposes) {
    this.participantPurposes = participantPurposes;
  }

  
  /**
   * Indicates filtering for first queue data
   **/
  public ViewFilter showFirstQueue(Boolean showFirstQueue) {
    this.showFirstQueue = showFirstQueue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for first queue data")
  @JsonProperty("showFirstQueue")
  public Boolean getShowFirstQueue() {
    return showFirstQueue;
  }
  public void setShowFirstQueue(Boolean showFirstQueue) {
    this.showFirstQueue = showFirstQueue;
  }

  
  /**
   * The team ids used to filter the view data
   **/
  public ViewFilter teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team ids used to filter the view data")
  @JsonProperty("teamIds")
  public List<String> getTeamIds() {
    return teamIds;
  }
  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }

  
  /**
   * The team ids are used to fetch associated users for the view
   **/
  public ViewFilter filterUsersByTeamIds(List<String> filterUsersByTeamIds) {
    this.filterUsersByTeamIds = filterUsersByTeamIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team ids are used to fetch associated users for the view")
  @JsonProperty("filterUsersByTeamIds")
  public List<String> getFilterUsersByTeamIds() {
    return filterUsersByTeamIds;
  }
  public void setFilterUsersByTeamIds(List<String> filterUsersByTeamIds) {
    this.filterUsersByTeamIds = filterUsersByTeamIds;
  }

  
  /**
   * The journey action map ids are used to fetch action maps for the associated view
   **/
  public ViewFilter journeyActionMapIds(List<String> journeyActionMapIds) {
    this.journeyActionMapIds = journeyActionMapIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The journey action map ids are used to fetch action maps for the associated view")
  @JsonProperty("journeyActionMapIds")
  public List<String> getJourneyActionMapIds() {
    return journeyActionMapIds;
  }
  public void setJourneyActionMapIds(List<String> journeyActionMapIds) {
    this.journeyActionMapIds = journeyActionMapIds;
  }

  
  /**
   * The journey outcome ids are used to fetch outcomes for the associated view
   **/
  public ViewFilter journeyOutcomeIds(List<String> journeyOutcomeIds) {
    this.journeyOutcomeIds = journeyOutcomeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The journey outcome ids are used to fetch outcomes for the associated view")
  @JsonProperty("journeyOutcomeIds")
  public List<String> getJourneyOutcomeIds() {
    return journeyOutcomeIds;
  }
  public void setJourneyOutcomeIds(List<String> journeyOutcomeIds) {
    this.journeyOutcomeIds = journeyOutcomeIds;
  }

  
  /**
   * The journey segment ids are used to fetch segments for the associated view
   **/
  public ViewFilter journeySegmentIds(List<String> journeySegmentIds) {
    this.journeySegmentIds = journeySegmentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The journey segment ids are used to fetch segments for the associated view")
  @JsonProperty("journeySegmentIds")
  public List<String> getJourneySegmentIds() {
    return journeySegmentIds;
  }
  public void setJourneySegmentIds(List<String> journeySegmentIds) {
    this.journeySegmentIds = journeySegmentIds;
  }

  
  /**
   * The journey action map types are used to filter action map data for the associated view
   **/
  public ViewFilter journeyActionMapTypes(List<JourneyActionMapTypesEnum> journeyActionMapTypes) {
    this.journeyActionMapTypes = journeyActionMapTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The journey action map types are used to filter action map data for the associated view")
  @JsonProperty("journeyActionMapTypes")
  public List<JourneyActionMapTypesEnum> getJourneyActionMapTypes() {
    return journeyActionMapTypes;
  }
  public void setJourneyActionMapTypes(List<JourneyActionMapTypesEnum> journeyActionMapTypes) {
    this.journeyActionMapTypes = journeyActionMapTypes;
  }

  
  /**
   * The list of development roles used to filter agent development view
   **/
  public ViewFilter developmentRoleList(List<DevelopmentRoleListEnum> developmentRoleList) {
    this.developmentRoleList = developmentRoleList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of development roles used to filter agent development view")
  @JsonProperty("developmentRoleList")
  public List<DevelopmentRoleListEnum> getDevelopmentRoleList() {
    return developmentRoleList;
  }
  public void setDevelopmentRoleList(List<DevelopmentRoleListEnum> developmentRoleList) {
    this.developmentRoleList = developmentRoleList;
  }

  
  /**
   * The list of development types used to filter agent development view
   **/
  public ViewFilter developmentTypeList(List<DevelopmentTypeListEnum> developmentTypeList) {
    this.developmentTypeList = developmentTypeList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of development types used to filter agent development view")
  @JsonProperty("developmentTypeList")
  public List<DevelopmentTypeListEnum> getDevelopmentTypeList() {
    return developmentTypeList;
  }
  public void setDevelopmentTypeList(List<DevelopmentTypeListEnum> developmentTypeList) {
    this.developmentTypeList = developmentTypeList;
  }

  
  /**
   * The list of development status used to filter agent development view
   **/
  public ViewFilter developmentStatusList(List<DevelopmentStatusListEnum> developmentStatusList) {
    this.developmentStatusList = developmentStatusList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of development status used to filter agent development view")
  @JsonProperty("developmentStatusList")
  public List<DevelopmentStatusListEnum> getDevelopmentStatusList() {
    return developmentStatusList;
  }
  public void setDevelopmentStatusList(List<DevelopmentStatusListEnum> developmentStatusList) {
    this.developmentStatusList = developmentStatusList;
  }

  
  /**
   * The list of development moduleIds used to filter agent development view
   **/
  public ViewFilter developmentModuleIds(List<String> developmentModuleIds) {
    this.developmentModuleIds = developmentModuleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of development moduleIds used to filter agent development view")
  @JsonProperty("developmentModuleIds")
  public List<String> getDevelopmentModuleIds() {
    return developmentModuleIds;
  }
  public void setDevelopmentModuleIds(List<String> developmentModuleIds) {
    this.developmentModuleIds = developmentModuleIds;
  }

  
  /**
   * Indicates filtering for development activities
   **/
  public ViewFilter developmentActivityOverdue(Boolean developmentActivityOverdue) {
    this.developmentActivityOverdue = developmentActivityOverdue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for development activities")
  @JsonProperty("developmentActivityOverdue")
  public Boolean getDevelopmentActivityOverdue() {
    return developmentActivityOverdue;
  }
  public void setDevelopmentActivityOverdue(Boolean developmentActivityOverdue) {
    this.developmentActivityOverdue = developmentActivityOverdue;
  }

  
  /**
   * The customer sentiment score used to filter the view
   **/
  public ViewFilter customerSentimentScore(NumericRange customerSentimentScore) {
    this.customerSentimentScore = customerSentimentScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer sentiment score used to filter the view")
  @JsonProperty("customerSentimentScore")
  public NumericRange getCustomerSentimentScore() {
    return customerSentimentScore;
  }
  public void setCustomerSentimentScore(NumericRange customerSentimentScore) {
    this.customerSentimentScore = customerSentimentScore;
  }

  
  /**
   * The customer sentiment trend used to filter the view
   **/
  public ViewFilter customerSentimentTrend(NumericRange customerSentimentTrend) {
    this.customerSentimentTrend = customerSentimentTrend;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer sentiment trend used to filter the view")
  @JsonProperty("customerSentimentTrend")
  public NumericRange getCustomerSentimentTrend() {
    return customerSentimentTrend;
  }
  public void setCustomerSentimentTrend(NumericRange customerSentimentTrend) {
    this.customerSentimentTrend = customerSentimentTrend;
  }

  
  /**
   * The list of transfer targets used to filter flow data
   **/
  public ViewFilter flowTransferTargets(List<String> flowTransferTargets) {
    this.flowTransferTargets = flowTransferTargets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of transfer targets used to filter flow data")
  @JsonProperty("flowTransferTargets")
  public List<String> getFlowTransferTargets() {
    return flowTransferTargets;
  }
  public void setFlowTransferTargets(List<String> flowTransferTargets) {
    this.flowTransferTargets = flowTransferTargets;
  }

  
  /**
   * Filter for development name
   **/
  public ViewFilter developmentName(String developmentName) {
    this.developmentName = developmentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter for development name")
  @JsonProperty("developmentName")
  public String getDevelopmentName() {
    return developmentName;
  }
  public void setDevelopmentName(String developmentName) {
    this.developmentName = developmentName;
  }

  
  /**
   * Represents the topics detected in the transcript
   **/
  public ViewFilter topicIds(List<String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the topics detected in the transcript")
  @JsonProperty("topicIds")
  public List<String> getTopicIds() {
    return topicIds;
  }
  public void setTopicIds(List<String> topicIds) {
    this.topicIds = topicIds;
  }

  
  /**
   * The list of external Tags used to filter conversation data
   **/
  public ViewFilter externalTags(List<String> externalTags) {
    this.externalTags = externalTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of external Tags used to filter conversation data")
  @JsonProperty("externalTags")
  public List<String> getExternalTags() {
    return externalTags;
  }
  public void setExternalTags(List<String> externalTags) {
    this.externalTags = externalTags;
  }

  
  /**
   * Indicates filtering for not responding users
   **/
  public ViewFilter isNotResponding(Boolean isNotResponding) {
    this.isNotResponding = isNotResponding;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for not responding users")
  @JsonProperty("isNotResponding")
  public Boolean getIsNotResponding() {
    return isNotResponding;
  }
  public void setIsNotResponding(Boolean isNotResponding) {
    this.isNotResponding = isNotResponding;
  }

  
  /**
   * Indicates filtering for the authenticated chat
   **/
  public ViewFilter isAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for the authenticated chat")
  @JsonProperty("isAuthenticated")
  public Boolean getIsAuthenticated() {
    return isAuthenticated;
  }
  public void setIsAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }

  
  /**
   * The list of bot IDs used to filter bot views
   **/
  public ViewFilter botIds(List<String> botIds) {
    this.botIds = botIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot IDs used to filter bot views")
  @JsonProperty("botIds")
  public List<String> getBotIds() {
    return botIds;
  }
  public void setBotIds(List<String> botIds) {
    this.botIds = botIds;
  }

  
  /**
   * The list of bot versions used to filter bot views
   **/
  public ViewFilter botVersions(List<String> botVersions) {
    this.botVersions = botVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot versions used to filter bot views")
  @JsonProperty("botVersions")
  public List<String> getBotVersions() {
    return botVersions;
  }
  public void setBotVersions(List<String> botVersions) {
    this.botVersions = botVersions;
  }

  
  /**
   * The list of bot message types used to filter bot views
   **/
  public ViewFilter botMessageTypes(List<BotMessageTypesEnum> botMessageTypes) {
    this.botMessageTypes = botMessageTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot message types used to filter bot views")
  @JsonProperty("botMessageTypes")
  public List<BotMessageTypesEnum> getBotMessageTypes() {
    return botMessageTypes;
  }
  public void setBotMessageTypes(List<BotMessageTypesEnum> botMessageTypes) {
    this.botMessageTypes = botMessageTypes;
  }

  
  /**
   * The list of bot providers used to filter bot views
   **/
  public ViewFilter botProviderList(List<BotProviderListEnum> botProviderList) {
    this.botProviderList = botProviderList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot providers used to filter bot views")
  @JsonProperty("botProviderList")
  public List<BotProviderListEnum> getBotProviderList() {
    return botProviderList;
  }
  public void setBotProviderList(List<BotProviderListEnum> botProviderList) {
    this.botProviderList = botProviderList;
  }

  
  /**
   * The list of bot products used to filter bot views
   **/
  public ViewFilter botProductList(List<BotProductListEnum> botProductList) {
    this.botProductList = botProductList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot products used to filter bot views")
  @JsonProperty("botProductList")
  public List<BotProductListEnum> getBotProductList() {
    return botProductList;
  }
  public void setBotProductList(List<BotProductListEnum> botProductList) {
    this.botProductList = botProductList;
  }

  
  /**
   * The list of bot recognition failure reasons used to filter bot views
   **/
  public ViewFilter botRecognitionFailureReasonList(List<BotRecognitionFailureReasonListEnum> botRecognitionFailureReasonList) {
    this.botRecognitionFailureReasonList = botRecognitionFailureReasonList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot recognition failure reasons used to filter bot views")
  @JsonProperty("botRecognitionFailureReasonList")
  public List<BotRecognitionFailureReasonListEnum> getBotRecognitionFailureReasonList() {
    return botRecognitionFailureReasonList;
  }
  public void setBotRecognitionFailureReasonList(List<BotRecognitionFailureReasonListEnum> botRecognitionFailureReasonList) {
    this.botRecognitionFailureReasonList = botRecognitionFailureReasonList;
  }

  
  /**
   * The list of bot intents used to filter bot views
   **/
  public ViewFilter botIntentList(List<String> botIntentList) {
    this.botIntentList = botIntentList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot intents used to filter bot views")
  @JsonProperty("botIntentList")
  public List<String> getBotIntentList() {
    return botIntentList;
  }
  public void setBotIntentList(List<String> botIntentList) {
    this.botIntentList = botIntentList;
  }

  
  /**
   * The list of bot final intents used to filter bot views
   **/
  public ViewFilter botFinalIntentList(List<String> botFinalIntentList) {
    this.botFinalIntentList = botFinalIntentList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot final intents used to filter bot views")
  @JsonProperty("botFinalIntentList")
  public List<String> getBotFinalIntentList() {
    return botFinalIntentList;
  }
  public void setBotFinalIntentList(List<String> botFinalIntentList) {
    this.botFinalIntentList = botFinalIntentList;
  }

  
  /**
   * The list of bot slots used to filter bot views
   **/
  public ViewFilter botSlotList(List<String> botSlotList) {
    this.botSlotList = botSlotList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot slots used to filter bot views")
  @JsonProperty("botSlotList")
  public List<String> getBotSlotList() {
    return botSlotList;
  }
  public void setBotSlotList(List<String> botSlotList) {
    this.botSlotList = botSlotList;
  }

  
  /**
   * The list of bot results used to filter bot views
   **/
  public ViewFilter botResultList(List<BotResultListEnum> botResultList) {
    this.botResultList = botResultList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of bot results used to filter bot views")
  @JsonProperty("botResultList")
  public List<BotResultListEnum> getBotResultList() {
    return botResultList;
  }
  public void setBotResultList(List<BotResultListEnum> botResultList) {
    this.botResultList = botResultList;
  }

  
  /**
   * The list of blocked reason used to filter action map constraints views
   **/
  public ViewFilter blockedReasons(List<BlockedReasonsEnum> blockedReasons) {
    this.blockedReasons = blockedReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of blocked reason used to filter action map constraints views")
  @JsonProperty("blockedReasons")
  public List<BlockedReasonsEnum> getBlockedReasons() {
    return blockedReasons;
  }
  public void setBlockedReasons(List<BlockedReasonsEnum> blockedReasons) {
    this.blockedReasons = blockedReasons;
  }

  
  /**
   * Indicates filtering for recorded
   **/
  public ViewFilter isRecorded(Boolean isRecorded) {
    this.isRecorded = isRecorded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for recorded")
  @JsonProperty("isRecorded")
  public Boolean getIsRecorded() {
    return isRecorded;
  }
  public void setIsRecorded(Boolean isRecorded) {
    this.isRecorded = isRecorded;
  }

  
  /**
   * Indicates filtering for evaluation
   **/
  public ViewFilter hasEvaluation(Boolean hasEvaluation) {
    this.hasEvaluation = hasEvaluation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for evaluation")
  @JsonProperty("hasEvaluation")
  public Boolean getHasEvaluation() {
    return hasEvaluation;
  }
  public void setHasEvaluation(Boolean hasEvaluation) {
    this.hasEvaluation = hasEvaluation;
  }

  
  /**
   * Indicates filtering for scored evaluation
   **/
  public ViewFilter hasScoredEvaluation(Boolean hasScoredEvaluation) {
    this.hasScoredEvaluation = hasScoredEvaluation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for scored evaluation")
  @JsonProperty("hasScoredEvaluation")
  public Boolean getHasScoredEvaluation() {
    return hasScoredEvaluation;
  }
  public void setHasScoredEvaluation(Boolean hasScoredEvaluation) {
    this.hasScoredEvaluation = hasScoredEvaluation;
  }

  
  /**
   * The list of email delivery statuses used to filter views
   **/
  public ViewFilter emailDeliveryStatusList(List<EmailDeliveryStatusListEnum> emailDeliveryStatusList) {
    this.emailDeliveryStatusList = emailDeliveryStatusList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of email delivery statuses used to filter views")
  @JsonProperty("emailDeliveryStatusList")
  public List<EmailDeliveryStatusListEnum> getEmailDeliveryStatusList() {
    return emailDeliveryStatusList;
  }
  public void setEmailDeliveryStatusList(List<EmailDeliveryStatusListEnum> emailDeliveryStatusList) {
    this.emailDeliveryStatusList = emailDeliveryStatusList;
  }

  
  /**
   * Indicates filtering for agent owned callback interactions
   **/
  public ViewFilter isAgentOwnedCallback(Boolean isAgentOwnedCallback) {
    this.isAgentOwnedCallback = isAgentOwnedCallback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for agent owned callback interactions")
  @JsonProperty("isAgentOwnedCallback")
  public Boolean getIsAgentOwnedCallback() {
    return isAgentOwnedCallback;
  }
  public void setIsAgentOwnedCallback(Boolean isAgentOwnedCallback) {
    this.isAgentOwnedCallback = isAgentOwnedCallback;
  }

  
  /**
   * The list of callback owners used to filter interactions
   **/
  public ViewFilter agentCallbackOwnerIds(List<String> agentCallbackOwnerIds) {
    this.agentCallbackOwnerIds = agentCallbackOwnerIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of callback owners used to filter interactions")
  @JsonProperty("agentCallbackOwnerIds")
  public List<String> getAgentCallbackOwnerIds() {
    return agentCallbackOwnerIds;
  }
  public void setAgentCallbackOwnerIds(List<String> agentCallbackOwnerIds) {
    this.agentCallbackOwnerIds = agentCallbackOwnerIds;
  }

  
  /**
   * The list of transcript topics requested in filter
   **/
  public ViewFilter transcriptTopics(List<TranscriptTopics> transcriptTopics) {
    this.transcriptTopics = transcriptTopics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of transcript topics requested in filter")
  @JsonProperty("transcriptTopics")
  public List<TranscriptTopics> getTranscriptTopics() {
    return transcriptTopics;
  }
  public void setTranscriptTopics(List<TranscriptTopics> transcriptTopics) {
    this.transcriptTopics = transcriptTopics;
  }

  
  /**
   * The list of frequency cap reasons to filter offer constraints
   **/
  public ViewFilter journeyFrequencyCapReasons(List<String> journeyFrequencyCapReasons) {
    this.journeyFrequencyCapReasons = journeyFrequencyCapReasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of frequency cap reasons to filter offer constraints")
  @JsonProperty("journeyFrequencyCapReasons")
  public List<String> getJourneyFrequencyCapReasons() {
    return journeyFrequencyCapReasons;
  }
  public void setJourneyFrequencyCapReasons(List<String> journeyFrequencyCapReasons) {
    this.journeyFrequencyCapReasons = journeyFrequencyCapReasons;
  }

  
  /**
   * The list of blocking action maps to filter offer constraints
   **/
  public ViewFilter journeyBlockingActionMapIds(List<String> journeyBlockingActionMapIds) {
    this.journeyBlockingActionMapIds = journeyBlockingActionMapIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of blocking action maps to filter offer constraints")
  @JsonProperty("journeyBlockingActionMapIds")
  public List<String> getJourneyBlockingActionMapIds() {
    return journeyBlockingActionMapIds;
  }
  public void setJourneyBlockingActionMapIds(List<String> journeyBlockingActionMapIds) {
    this.journeyBlockingActionMapIds = journeyBlockingActionMapIds;
  }

  
  /**
   * The list of action targets to filter offer constraints
   **/
  public ViewFilter journeyActionTargetIds(List<String> journeyActionTargetIds) {
    this.journeyActionTargetIds = journeyActionTargetIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of action targets to filter offer constraints")
  @JsonProperty("journeyActionTargetIds")
  public List<String> getJourneyActionTargetIds() {
    return journeyActionTargetIds;
  }
  public void setJourneyActionTargetIds(List<String> journeyActionTargetIds) {
    this.journeyActionTargetIds = journeyActionTargetIds;
  }

  
  /**
   * The list of blocking schedule groups to filter offer constraints
   **/
  public ViewFilter journeyBlockingScheduleGroupIds(List<String> journeyBlockingScheduleGroupIds) {
    this.journeyBlockingScheduleGroupIds = journeyBlockingScheduleGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of blocking schedule groups to filter offer constraints")
  @JsonProperty("journeyBlockingScheduleGroupIds")
  public List<String> getJourneyBlockingScheduleGroupIds() {
    return journeyBlockingScheduleGroupIds;
  }
  public void setJourneyBlockingScheduleGroupIds(List<String> journeyBlockingScheduleGroupIds) {
    this.journeyBlockingScheduleGroupIds = journeyBlockingScheduleGroupIds;
  }

  
  /**
   * The list of emergency schedule groups to filter offer constraints
   **/
  public ViewFilter journeyBlockingEmergencyScheduleGroupIds(List<String> journeyBlockingEmergencyScheduleGroupIds) {
    this.journeyBlockingEmergencyScheduleGroupIds = journeyBlockingEmergencyScheduleGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of emergency schedule groups to filter offer constraints")
  @JsonProperty("journeyBlockingEmergencyScheduleGroupIds")
  public List<String> getJourneyBlockingEmergencyScheduleGroupIds() {
    return journeyBlockingEmergencyScheduleGroupIds;
  }
  public void setJourneyBlockingEmergencyScheduleGroupIds(List<String> journeyBlockingEmergencyScheduleGroupIds) {
    this.journeyBlockingEmergencyScheduleGroupIds = journeyBlockingEmergencyScheduleGroupIds;
  }

  
  /**
   * The list of url equal conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlEqualConditions(List<String> journeyUrlEqualConditions) {
    this.journeyUrlEqualConditions = journeyUrlEqualConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url equal conditions to filter offer constraints")
  @JsonProperty("journeyUrlEqualConditions")
  public List<String> getJourneyUrlEqualConditions() {
    return journeyUrlEqualConditions;
  }
  public void setJourneyUrlEqualConditions(List<String> journeyUrlEqualConditions) {
    this.journeyUrlEqualConditions = journeyUrlEqualConditions;
  }

  
  /**
   * The list of url not equal conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlNotEqualConditions(List<String> journeyUrlNotEqualConditions) {
    this.journeyUrlNotEqualConditions = journeyUrlNotEqualConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url not equal conditions to filter offer constraints")
  @JsonProperty("journeyUrlNotEqualConditions")
  public List<String> getJourneyUrlNotEqualConditions() {
    return journeyUrlNotEqualConditions;
  }
  public void setJourneyUrlNotEqualConditions(List<String> journeyUrlNotEqualConditions) {
    this.journeyUrlNotEqualConditions = journeyUrlNotEqualConditions;
  }

  
  /**
   * The list of url starts with conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlStartsWithConditions(List<String> journeyUrlStartsWithConditions) {
    this.journeyUrlStartsWithConditions = journeyUrlStartsWithConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url starts with conditions to filter offer constraints")
  @JsonProperty("journeyUrlStartsWithConditions")
  public List<String> getJourneyUrlStartsWithConditions() {
    return journeyUrlStartsWithConditions;
  }
  public void setJourneyUrlStartsWithConditions(List<String> journeyUrlStartsWithConditions) {
    this.journeyUrlStartsWithConditions = journeyUrlStartsWithConditions;
  }

  
  /**
   * The list of url ends with conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlEndsWithConditions(List<String> journeyUrlEndsWithConditions) {
    this.journeyUrlEndsWithConditions = journeyUrlEndsWithConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url ends with conditions to filter offer constraints")
  @JsonProperty("journeyUrlEndsWithConditions")
  public List<String> getJourneyUrlEndsWithConditions() {
    return journeyUrlEndsWithConditions;
  }
  public void setJourneyUrlEndsWithConditions(List<String> journeyUrlEndsWithConditions) {
    this.journeyUrlEndsWithConditions = journeyUrlEndsWithConditions;
  }

  
  /**
   * The list of url contains any conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlContainsAnyConditions(List<String> journeyUrlContainsAnyConditions) {
    this.journeyUrlContainsAnyConditions = journeyUrlContainsAnyConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url contains any conditions to filter offer constraints")
  @JsonProperty("journeyUrlContainsAnyConditions")
  public List<String> getJourneyUrlContainsAnyConditions() {
    return journeyUrlContainsAnyConditions;
  }
  public void setJourneyUrlContainsAnyConditions(List<String> journeyUrlContainsAnyConditions) {
    this.journeyUrlContainsAnyConditions = journeyUrlContainsAnyConditions;
  }

  
  /**
   * The list of url not contains any conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlNotContainsAnyConditions(List<String> journeyUrlNotContainsAnyConditions) {
    this.journeyUrlNotContainsAnyConditions = journeyUrlNotContainsAnyConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url not contains any conditions to filter offer constraints")
  @JsonProperty("journeyUrlNotContainsAnyConditions")
  public List<String> getJourneyUrlNotContainsAnyConditions() {
    return journeyUrlNotContainsAnyConditions;
  }
  public void setJourneyUrlNotContainsAnyConditions(List<String> journeyUrlNotContainsAnyConditions) {
    this.journeyUrlNotContainsAnyConditions = journeyUrlNotContainsAnyConditions;
  }

  
  /**
   * The list of url contains all conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlContainsAllConditions(List<String> journeyUrlContainsAllConditions) {
    this.journeyUrlContainsAllConditions = journeyUrlContainsAllConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url contains all conditions to filter offer constraints")
  @JsonProperty("journeyUrlContainsAllConditions")
  public List<String> getJourneyUrlContainsAllConditions() {
    return journeyUrlContainsAllConditions;
  }
  public void setJourneyUrlContainsAllConditions(List<String> journeyUrlContainsAllConditions) {
    this.journeyUrlContainsAllConditions = journeyUrlContainsAllConditions;
  }

  
  /**
   * The list of url not contains all conditions to filter offer constraints
   **/
  public ViewFilter journeyUrlNotContainsAllConditions(List<String> journeyUrlNotContainsAllConditions) {
    this.journeyUrlNotContainsAllConditions = journeyUrlNotContainsAllConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of url not contains all conditions to filter offer constraints")
  @JsonProperty("journeyUrlNotContainsAllConditions")
  public List<String> getJourneyUrlNotContainsAllConditions() {
    return journeyUrlNotContainsAllConditions;
  }
  public void setJourneyUrlNotContainsAllConditions(List<String> journeyUrlNotContainsAllConditions) {
    this.journeyUrlNotContainsAllConditions = journeyUrlNotContainsAllConditions;
  }

  
  /**
   * The list of flow milestones to filter exports
   **/
  public ViewFilter flowMilestoneIds(List<String> flowMilestoneIds) {
    this.flowMilestoneIds = flowMilestoneIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of flow milestones to filter exports")
  @JsonProperty("flowMilestoneIds")
  public List<String> getFlowMilestoneIds() {
    return flowMilestoneIds;
  }
  public void setFlowMilestoneIds(List<String> flowMilestoneIds) {
    this.flowMilestoneIds = flowMilestoneIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewFilter viewFilter = (ViewFilter) o;
    return Objects.equals(this.mediaTypes, viewFilter.mediaTypes) &&
        Objects.equals(this.queueIds, viewFilter.queueIds) &&
        Objects.equals(this.skillIds, viewFilter.skillIds) &&
        Objects.equals(this.skillGroups, viewFilter.skillGroups) &&
        Objects.equals(this.languageIds, viewFilter.languageIds) &&
        Objects.equals(this.languageGroups, viewFilter.languageGroups) &&
        Objects.equals(this.directions, viewFilter.directions) &&
        Objects.equals(this.originatingDirections, viewFilter.originatingDirections) &&
        Objects.equals(this.wrapUpCodes, viewFilter.wrapUpCodes) &&
        Objects.equals(this.dnisList, viewFilter.dnisList) &&
        Objects.equals(this.sessionDnisList, viewFilter.sessionDnisList) &&
        Objects.equals(this.filterQueuesByUserIds, viewFilter.filterQueuesByUserIds) &&
        Objects.equals(this.filterUsersByQueueIds, viewFilter.filterUsersByQueueIds) &&
        Objects.equals(this.userIds, viewFilter.userIds) &&
        Objects.equals(this.addressTos, viewFilter.addressTos) &&
        Objects.equals(this.addressFroms, viewFilter.addressFroms) &&
        Objects.equals(this.outboundCampaignIds, viewFilter.outboundCampaignIds) &&
        Objects.equals(this.outboundContactListIds, viewFilter.outboundContactListIds) &&
        Objects.equals(this.contactIds, viewFilter.contactIds) &&
        Objects.equals(this.externalContactIds, viewFilter.externalContactIds) &&
        Objects.equals(this.externalOrgIds, viewFilter.externalOrgIds) &&
        Objects.equals(this.aniList, viewFilter.aniList) &&
        Objects.equals(this.durationsMilliseconds, viewFilter.durationsMilliseconds) &&
        Objects.equals(this.acdDurationsMilliseconds, viewFilter.acdDurationsMilliseconds) &&
        Objects.equals(this.talkDurationsMilliseconds, viewFilter.talkDurationsMilliseconds) &&
        Objects.equals(this.acwDurationsMilliseconds, viewFilter.acwDurationsMilliseconds) &&
        Objects.equals(this.handleDurationsMilliseconds, viewFilter.handleDurationsMilliseconds) &&
        Objects.equals(this.holdDurationsMilliseconds, viewFilter.holdDurationsMilliseconds) &&
        Objects.equals(this.abandonDurationsMilliseconds, viewFilter.abandonDurationsMilliseconds) &&
        Objects.equals(this.evaluationScore, viewFilter.evaluationScore) &&
        Objects.equals(this.evaluationCriticalScore, viewFilter.evaluationCriticalScore) &&
        Objects.equals(this.evaluationFormIds, viewFilter.evaluationFormIds) &&
        Objects.equals(this.evaluatedAgentIds, viewFilter.evaluatedAgentIds) &&
        Objects.equals(this.evaluatorIds, viewFilter.evaluatorIds) &&
        Objects.equals(this.transferred, viewFilter.transferred) &&
        Objects.equals(this.abandoned, viewFilter.abandoned) &&
        Objects.equals(this.answered, viewFilter.answered) &&
        Objects.equals(this.messageTypes, viewFilter.messageTypes) &&
        Objects.equals(this.divisionIds, viewFilter.divisionIds) &&
        Objects.equals(this.surveyFormIds, viewFilter.surveyFormIds) &&
        Objects.equals(this.surveyTotalScore, viewFilter.surveyTotalScore) &&
        Objects.equals(this.surveyNpsScore, viewFilter.surveyNpsScore) &&
        Objects.equals(this.mos, viewFilter.mos) &&
        Objects.equals(this.surveyQuestionGroupScore, viewFilter.surveyQuestionGroupScore) &&
        Objects.equals(this.surveyPromoterScore, viewFilter.surveyPromoterScore) &&
        Objects.equals(this.surveyFormContextIds, viewFilter.surveyFormContextIds) &&
        Objects.equals(this.conversationIds, viewFilter.conversationIds) &&
        Objects.equals(this.sipCallIds, viewFilter.sipCallIds) &&
        Objects.equals(this.isEnded, viewFilter.isEnded) &&
        Objects.equals(this.isSurveyed, viewFilter.isSurveyed) &&
        Objects.equals(this.surveyScores, viewFilter.surveyScores) &&
        Objects.equals(this.promoterScores, viewFilter.promoterScores) &&
        Objects.equals(this.isCampaign, viewFilter.isCampaign) &&
        Objects.equals(this.surveyStatuses, viewFilter.surveyStatuses) &&
        Objects.equals(this.conversationProperties, viewFilter.conversationProperties) &&
        Objects.equals(this.isBlindTransferred, viewFilter.isBlindTransferred) &&
        Objects.equals(this.isConsulted, viewFilter.isConsulted) &&
        Objects.equals(this.isConsultTransferred, viewFilter.isConsultTransferred) &&
        Objects.equals(this.remoteParticipants, viewFilter.remoteParticipants) &&
        Objects.equals(this.flowIds, viewFilter.flowIds) &&
        Objects.equals(this.flowOutcomeIds, viewFilter.flowOutcomeIds) &&
        Objects.equals(this.flowOutcomeValues, viewFilter.flowOutcomeValues) &&
        Objects.equals(this.flowDestinationTypes, viewFilter.flowDestinationTypes) &&
        Objects.equals(this.flowDisconnectReasons, viewFilter.flowDisconnectReasons) &&
        Objects.equals(this.flowTypes, viewFilter.flowTypes) &&
        Objects.equals(this.flowEntryTypes, viewFilter.flowEntryTypes) &&
        Objects.equals(this.flowEntryReasons, viewFilter.flowEntryReasons) &&
        Objects.equals(this.flowVersions, viewFilter.flowVersions) &&
        Objects.equals(this.groupIds, viewFilter.groupIds) &&
        Objects.equals(this.hasJourneyCustomerId, viewFilter.hasJourneyCustomerId) &&
        Objects.equals(this.hasJourneyActionMapId, viewFilter.hasJourneyActionMapId) &&
        Objects.equals(this.hasJourneyVisitId, viewFilter.hasJourneyVisitId) &&
        Objects.equals(this.hasMedia, viewFilter.hasMedia) &&
        Objects.equals(this.roleIds, viewFilter.roleIds) &&
        Objects.equals(this.reportsTos, viewFilter.reportsTos) &&
        Objects.equals(this.locationIds, viewFilter.locationIds) &&
        Objects.equals(this.flowOutTypes, viewFilter.flowOutTypes) &&
        Objects.equals(this.providerList, viewFilter.providerList) &&
        Objects.equals(this.callbackNumberList, viewFilter.callbackNumberList) &&
        Objects.equals(this.callbackInterval, viewFilter.callbackInterval) &&
        Objects.equals(this.usedRoutingTypes, viewFilter.usedRoutingTypes) &&
        Objects.equals(this.requestedRoutingTypes, viewFilter.requestedRoutingTypes) &&
        Objects.equals(this.hasAgentAssistId, viewFilter.hasAgentAssistId) &&
        Objects.equals(this.transcripts, viewFilter.transcripts) &&
        Objects.equals(this.transcriptLanguages, viewFilter.transcriptLanguages) &&
        Objects.equals(this.participantPurposes, viewFilter.participantPurposes) &&
        Objects.equals(this.showFirstQueue, viewFilter.showFirstQueue) &&
        Objects.equals(this.teamIds, viewFilter.teamIds) &&
        Objects.equals(this.filterUsersByTeamIds, viewFilter.filterUsersByTeamIds) &&
        Objects.equals(this.journeyActionMapIds, viewFilter.journeyActionMapIds) &&
        Objects.equals(this.journeyOutcomeIds, viewFilter.journeyOutcomeIds) &&
        Objects.equals(this.journeySegmentIds, viewFilter.journeySegmentIds) &&
        Objects.equals(this.journeyActionMapTypes, viewFilter.journeyActionMapTypes) &&
        Objects.equals(this.developmentRoleList, viewFilter.developmentRoleList) &&
        Objects.equals(this.developmentTypeList, viewFilter.developmentTypeList) &&
        Objects.equals(this.developmentStatusList, viewFilter.developmentStatusList) &&
        Objects.equals(this.developmentModuleIds, viewFilter.developmentModuleIds) &&
        Objects.equals(this.developmentActivityOverdue, viewFilter.developmentActivityOverdue) &&
        Objects.equals(this.customerSentimentScore, viewFilter.customerSentimentScore) &&
        Objects.equals(this.customerSentimentTrend, viewFilter.customerSentimentTrend) &&
        Objects.equals(this.flowTransferTargets, viewFilter.flowTransferTargets) &&
        Objects.equals(this.developmentName, viewFilter.developmentName) &&
        Objects.equals(this.topicIds, viewFilter.topicIds) &&
        Objects.equals(this.externalTags, viewFilter.externalTags) &&
        Objects.equals(this.isNotResponding, viewFilter.isNotResponding) &&
        Objects.equals(this.isAuthenticated, viewFilter.isAuthenticated) &&
        Objects.equals(this.botIds, viewFilter.botIds) &&
        Objects.equals(this.botVersions, viewFilter.botVersions) &&
        Objects.equals(this.botMessageTypes, viewFilter.botMessageTypes) &&
        Objects.equals(this.botProviderList, viewFilter.botProviderList) &&
        Objects.equals(this.botProductList, viewFilter.botProductList) &&
        Objects.equals(this.botRecognitionFailureReasonList, viewFilter.botRecognitionFailureReasonList) &&
        Objects.equals(this.botIntentList, viewFilter.botIntentList) &&
        Objects.equals(this.botFinalIntentList, viewFilter.botFinalIntentList) &&
        Objects.equals(this.botSlotList, viewFilter.botSlotList) &&
        Objects.equals(this.botResultList, viewFilter.botResultList) &&
        Objects.equals(this.blockedReasons, viewFilter.blockedReasons) &&
        Objects.equals(this.isRecorded, viewFilter.isRecorded) &&
        Objects.equals(this.hasEvaluation, viewFilter.hasEvaluation) &&
        Objects.equals(this.hasScoredEvaluation, viewFilter.hasScoredEvaluation) &&
        Objects.equals(this.emailDeliveryStatusList, viewFilter.emailDeliveryStatusList) &&
        Objects.equals(this.isAgentOwnedCallback, viewFilter.isAgentOwnedCallback) &&
        Objects.equals(this.agentCallbackOwnerIds, viewFilter.agentCallbackOwnerIds) &&
        Objects.equals(this.transcriptTopics, viewFilter.transcriptTopics) &&
        Objects.equals(this.journeyFrequencyCapReasons, viewFilter.journeyFrequencyCapReasons) &&
        Objects.equals(this.journeyBlockingActionMapIds, viewFilter.journeyBlockingActionMapIds) &&
        Objects.equals(this.journeyActionTargetIds, viewFilter.journeyActionTargetIds) &&
        Objects.equals(this.journeyBlockingScheduleGroupIds, viewFilter.journeyBlockingScheduleGroupIds) &&
        Objects.equals(this.journeyBlockingEmergencyScheduleGroupIds, viewFilter.journeyBlockingEmergencyScheduleGroupIds) &&
        Objects.equals(this.journeyUrlEqualConditions, viewFilter.journeyUrlEqualConditions) &&
        Objects.equals(this.journeyUrlNotEqualConditions, viewFilter.journeyUrlNotEqualConditions) &&
        Objects.equals(this.journeyUrlStartsWithConditions, viewFilter.journeyUrlStartsWithConditions) &&
        Objects.equals(this.journeyUrlEndsWithConditions, viewFilter.journeyUrlEndsWithConditions) &&
        Objects.equals(this.journeyUrlContainsAnyConditions, viewFilter.journeyUrlContainsAnyConditions) &&
        Objects.equals(this.journeyUrlNotContainsAnyConditions, viewFilter.journeyUrlNotContainsAnyConditions) &&
        Objects.equals(this.journeyUrlContainsAllConditions, viewFilter.journeyUrlContainsAllConditions) &&
        Objects.equals(this.journeyUrlNotContainsAllConditions, viewFilter.journeyUrlNotContainsAllConditions) &&
        Objects.equals(this.flowMilestoneIds, viewFilter.flowMilestoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaTypes, queueIds, skillIds, skillGroups, languageIds, languageGroups, directions, originatingDirections, wrapUpCodes, dnisList, sessionDnisList, filterQueuesByUserIds, filterUsersByQueueIds, userIds, addressTos, addressFroms, outboundCampaignIds, outboundContactListIds, contactIds, externalContactIds, externalOrgIds, aniList, durationsMilliseconds, acdDurationsMilliseconds, talkDurationsMilliseconds, acwDurationsMilliseconds, handleDurationsMilliseconds, holdDurationsMilliseconds, abandonDurationsMilliseconds, evaluationScore, evaluationCriticalScore, evaluationFormIds, evaluatedAgentIds, evaluatorIds, transferred, abandoned, answered, messageTypes, divisionIds, surveyFormIds, surveyTotalScore, surveyNpsScore, mos, surveyQuestionGroupScore, surveyPromoterScore, surveyFormContextIds, conversationIds, sipCallIds, isEnded, isSurveyed, surveyScores, promoterScores, isCampaign, surveyStatuses, conversationProperties, isBlindTransferred, isConsulted, isConsultTransferred, remoteParticipants, flowIds, flowOutcomeIds, flowOutcomeValues, flowDestinationTypes, flowDisconnectReasons, flowTypes, flowEntryTypes, flowEntryReasons, flowVersions, groupIds, hasJourneyCustomerId, hasJourneyActionMapId, hasJourneyVisitId, hasMedia, roleIds, reportsTos, locationIds, flowOutTypes, providerList, callbackNumberList, callbackInterval, usedRoutingTypes, requestedRoutingTypes, hasAgentAssistId, transcripts, transcriptLanguages, participantPurposes, showFirstQueue, teamIds, filterUsersByTeamIds, journeyActionMapIds, journeyOutcomeIds, journeySegmentIds, journeyActionMapTypes, developmentRoleList, developmentTypeList, developmentStatusList, developmentModuleIds, developmentActivityOverdue, customerSentimentScore, customerSentimentTrend, flowTransferTargets, developmentName, topicIds, externalTags, isNotResponding, isAuthenticated, botIds, botVersions, botMessageTypes, botProviderList, botProductList, botRecognitionFailureReasonList, botIntentList, botFinalIntentList, botSlotList, botResultList, blockedReasons, isRecorded, hasEvaluation, hasScoredEvaluation, emailDeliveryStatusList, isAgentOwnedCallback, agentCallbackOwnerIds, transcriptTopics, journeyFrequencyCapReasons, journeyBlockingActionMapIds, journeyActionTargetIds, journeyBlockingScheduleGroupIds, journeyBlockingEmergencyScheduleGroupIds, journeyUrlEqualConditions, journeyUrlNotEqualConditions, journeyUrlStartsWithConditions, journeyUrlEndsWithConditions, journeyUrlContainsAnyConditions, journeyUrlNotContainsAnyConditions, journeyUrlContainsAllConditions, journeyUrlNotContainsAllConditions, flowMilestoneIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewFilter {\n");
    
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    skillGroups: ").append(toIndentedString(skillGroups)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
    sb.append("    languageGroups: ").append(toIndentedString(languageGroups)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    originatingDirections: ").append(toIndentedString(originatingDirections)).append("\n");
    sb.append("    wrapUpCodes: ").append(toIndentedString(wrapUpCodes)).append("\n");
    sb.append("    dnisList: ").append(toIndentedString(dnisList)).append("\n");
    sb.append("    sessionDnisList: ").append(toIndentedString(sessionDnisList)).append("\n");
    sb.append("    filterQueuesByUserIds: ").append(toIndentedString(filterQueuesByUserIds)).append("\n");
    sb.append("    filterUsersByQueueIds: ").append(toIndentedString(filterUsersByQueueIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    addressTos: ").append(toIndentedString(addressTos)).append("\n");
    sb.append("    addressFroms: ").append(toIndentedString(addressFroms)).append("\n");
    sb.append("    outboundCampaignIds: ").append(toIndentedString(outboundCampaignIds)).append("\n");
    sb.append("    outboundContactListIds: ").append(toIndentedString(outboundContactListIds)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    externalContactIds: ").append(toIndentedString(externalContactIds)).append("\n");
    sb.append("    externalOrgIds: ").append(toIndentedString(externalOrgIds)).append("\n");
    sb.append("    aniList: ").append(toIndentedString(aniList)).append("\n");
    sb.append("    durationsMilliseconds: ").append(toIndentedString(durationsMilliseconds)).append("\n");
    sb.append("    acdDurationsMilliseconds: ").append(toIndentedString(acdDurationsMilliseconds)).append("\n");
    sb.append("    talkDurationsMilliseconds: ").append(toIndentedString(talkDurationsMilliseconds)).append("\n");
    sb.append("    acwDurationsMilliseconds: ").append(toIndentedString(acwDurationsMilliseconds)).append("\n");
    sb.append("    handleDurationsMilliseconds: ").append(toIndentedString(handleDurationsMilliseconds)).append("\n");
    sb.append("    holdDurationsMilliseconds: ").append(toIndentedString(holdDurationsMilliseconds)).append("\n");
    sb.append("    abandonDurationsMilliseconds: ").append(toIndentedString(abandonDurationsMilliseconds)).append("\n");
    sb.append("    evaluationScore: ").append(toIndentedString(evaluationScore)).append("\n");
    sb.append("    evaluationCriticalScore: ").append(toIndentedString(evaluationCriticalScore)).append("\n");
    sb.append("    evaluationFormIds: ").append(toIndentedString(evaluationFormIds)).append("\n");
    sb.append("    evaluatedAgentIds: ").append(toIndentedString(evaluatedAgentIds)).append("\n");
    sb.append("    evaluatorIds: ").append(toIndentedString(evaluatorIds)).append("\n");
    sb.append("    transferred: ").append(toIndentedString(transferred)).append("\n");
    sb.append("    abandoned: ").append(toIndentedString(abandoned)).append("\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
    sb.append("    messageTypes: ").append(toIndentedString(messageTypes)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    surveyFormIds: ").append(toIndentedString(surveyFormIds)).append("\n");
    sb.append("    surveyTotalScore: ").append(toIndentedString(surveyTotalScore)).append("\n");
    sb.append("    surveyNpsScore: ").append(toIndentedString(surveyNpsScore)).append("\n");
    sb.append("    mos: ").append(toIndentedString(mos)).append("\n");
    sb.append("    surveyQuestionGroupScore: ").append(toIndentedString(surveyQuestionGroupScore)).append("\n");
    sb.append("    surveyPromoterScore: ").append(toIndentedString(surveyPromoterScore)).append("\n");
    sb.append("    surveyFormContextIds: ").append(toIndentedString(surveyFormContextIds)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    sipCallIds: ").append(toIndentedString(sipCallIds)).append("\n");
    sb.append("    isEnded: ").append(toIndentedString(isEnded)).append("\n");
    sb.append("    isSurveyed: ").append(toIndentedString(isSurveyed)).append("\n");
    sb.append("    surveyScores: ").append(toIndentedString(surveyScores)).append("\n");
    sb.append("    promoterScores: ").append(toIndentedString(promoterScores)).append("\n");
    sb.append("    isCampaign: ").append(toIndentedString(isCampaign)).append("\n");
    sb.append("    surveyStatuses: ").append(toIndentedString(surveyStatuses)).append("\n");
    sb.append("    conversationProperties: ").append(toIndentedString(conversationProperties)).append("\n");
    sb.append("    isBlindTransferred: ").append(toIndentedString(isBlindTransferred)).append("\n");
    sb.append("    isConsulted: ").append(toIndentedString(isConsulted)).append("\n");
    sb.append("    isConsultTransferred: ").append(toIndentedString(isConsultTransferred)).append("\n");
    sb.append("    remoteParticipants: ").append(toIndentedString(remoteParticipants)).append("\n");
    sb.append("    flowIds: ").append(toIndentedString(flowIds)).append("\n");
    sb.append("    flowOutcomeIds: ").append(toIndentedString(flowOutcomeIds)).append("\n");
    sb.append("    flowOutcomeValues: ").append(toIndentedString(flowOutcomeValues)).append("\n");
    sb.append("    flowDestinationTypes: ").append(toIndentedString(flowDestinationTypes)).append("\n");
    sb.append("    flowDisconnectReasons: ").append(toIndentedString(flowDisconnectReasons)).append("\n");
    sb.append("    flowTypes: ").append(toIndentedString(flowTypes)).append("\n");
    sb.append("    flowEntryTypes: ").append(toIndentedString(flowEntryTypes)).append("\n");
    sb.append("    flowEntryReasons: ").append(toIndentedString(flowEntryReasons)).append("\n");
    sb.append("    flowVersions: ").append(toIndentedString(flowVersions)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    hasJourneyCustomerId: ").append(toIndentedString(hasJourneyCustomerId)).append("\n");
    sb.append("    hasJourneyActionMapId: ").append(toIndentedString(hasJourneyActionMapId)).append("\n");
    sb.append("    hasJourneyVisitId: ").append(toIndentedString(hasJourneyVisitId)).append("\n");
    sb.append("    hasMedia: ").append(toIndentedString(hasMedia)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    reportsTos: ").append(toIndentedString(reportsTos)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    flowOutTypes: ").append(toIndentedString(flowOutTypes)).append("\n");
    sb.append("    providerList: ").append(toIndentedString(providerList)).append("\n");
    sb.append("    callbackNumberList: ").append(toIndentedString(callbackNumberList)).append("\n");
    sb.append("    callbackInterval: ").append(toIndentedString(callbackInterval)).append("\n");
    sb.append("    usedRoutingTypes: ").append(toIndentedString(usedRoutingTypes)).append("\n");
    sb.append("    requestedRoutingTypes: ").append(toIndentedString(requestedRoutingTypes)).append("\n");
    sb.append("    hasAgentAssistId: ").append(toIndentedString(hasAgentAssistId)).append("\n");
    sb.append("    transcripts: ").append(toIndentedString(transcripts)).append("\n");
    sb.append("    transcriptLanguages: ").append(toIndentedString(transcriptLanguages)).append("\n");
    sb.append("    participantPurposes: ").append(toIndentedString(participantPurposes)).append("\n");
    sb.append("    showFirstQueue: ").append(toIndentedString(showFirstQueue)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("    filterUsersByTeamIds: ").append(toIndentedString(filterUsersByTeamIds)).append("\n");
    sb.append("    journeyActionMapIds: ").append(toIndentedString(journeyActionMapIds)).append("\n");
    sb.append("    journeyOutcomeIds: ").append(toIndentedString(journeyOutcomeIds)).append("\n");
    sb.append("    journeySegmentIds: ").append(toIndentedString(journeySegmentIds)).append("\n");
    sb.append("    journeyActionMapTypes: ").append(toIndentedString(journeyActionMapTypes)).append("\n");
    sb.append("    developmentRoleList: ").append(toIndentedString(developmentRoleList)).append("\n");
    sb.append("    developmentTypeList: ").append(toIndentedString(developmentTypeList)).append("\n");
    sb.append("    developmentStatusList: ").append(toIndentedString(developmentStatusList)).append("\n");
    sb.append("    developmentModuleIds: ").append(toIndentedString(developmentModuleIds)).append("\n");
    sb.append("    developmentActivityOverdue: ").append(toIndentedString(developmentActivityOverdue)).append("\n");
    sb.append("    customerSentimentScore: ").append(toIndentedString(customerSentimentScore)).append("\n");
    sb.append("    customerSentimentTrend: ").append(toIndentedString(customerSentimentTrend)).append("\n");
    sb.append("    flowTransferTargets: ").append(toIndentedString(flowTransferTargets)).append("\n");
    sb.append("    developmentName: ").append(toIndentedString(developmentName)).append("\n");
    sb.append("    topicIds: ").append(toIndentedString(topicIds)).append("\n");
    sb.append("    externalTags: ").append(toIndentedString(externalTags)).append("\n");
    sb.append("    isNotResponding: ").append(toIndentedString(isNotResponding)).append("\n");
    sb.append("    isAuthenticated: ").append(toIndentedString(isAuthenticated)).append("\n");
    sb.append("    botIds: ").append(toIndentedString(botIds)).append("\n");
    sb.append("    botVersions: ").append(toIndentedString(botVersions)).append("\n");
    sb.append("    botMessageTypes: ").append(toIndentedString(botMessageTypes)).append("\n");
    sb.append("    botProviderList: ").append(toIndentedString(botProviderList)).append("\n");
    sb.append("    botProductList: ").append(toIndentedString(botProductList)).append("\n");
    sb.append("    botRecognitionFailureReasonList: ").append(toIndentedString(botRecognitionFailureReasonList)).append("\n");
    sb.append("    botIntentList: ").append(toIndentedString(botIntentList)).append("\n");
    sb.append("    botFinalIntentList: ").append(toIndentedString(botFinalIntentList)).append("\n");
    sb.append("    botSlotList: ").append(toIndentedString(botSlotList)).append("\n");
    sb.append("    botResultList: ").append(toIndentedString(botResultList)).append("\n");
    sb.append("    blockedReasons: ").append(toIndentedString(blockedReasons)).append("\n");
    sb.append("    isRecorded: ").append(toIndentedString(isRecorded)).append("\n");
    sb.append("    hasEvaluation: ").append(toIndentedString(hasEvaluation)).append("\n");
    sb.append("    hasScoredEvaluation: ").append(toIndentedString(hasScoredEvaluation)).append("\n");
    sb.append("    emailDeliveryStatusList: ").append(toIndentedString(emailDeliveryStatusList)).append("\n");
    sb.append("    isAgentOwnedCallback: ").append(toIndentedString(isAgentOwnedCallback)).append("\n");
    sb.append("    agentCallbackOwnerIds: ").append(toIndentedString(agentCallbackOwnerIds)).append("\n");
    sb.append("    transcriptTopics: ").append(toIndentedString(transcriptTopics)).append("\n");
    sb.append("    journeyFrequencyCapReasons: ").append(toIndentedString(journeyFrequencyCapReasons)).append("\n");
    sb.append("    journeyBlockingActionMapIds: ").append(toIndentedString(journeyBlockingActionMapIds)).append("\n");
    sb.append("    journeyActionTargetIds: ").append(toIndentedString(journeyActionTargetIds)).append("\n");
    sb.append("    journeyBlockingScheduleGroupIds: ").append(toIndentedString(journeyBlockingScheduleGroupIds)).append("\n");
    sb.append("    journeyBlockingEmergencyScheduleGroupIds: ").append(toIndentedString(journeyBlockingEmergencyScheduleGroupIds)).append("\n");
    sb.append("    journeyUrlEqualConditions: ").append(toIndentedString(journeyUrlEqualConditions)).append("\n");
    sb.append("    journeyUrlNotEqualConditions: ").append(toIndentedString(journeyUrlNotEqualConditions)).append("\n");
    sb.append("    journeyUrlStartsWithConditions: ").append(toIndentedString(journeyUrlStartsWithConditions)).append("\n");
    sb.append("    journeyUrlEndsWithConditions: ").append(toIndentedString(journeyUrlEndsWithConditions)).append("\n");
    sb.append("    journeyUrlContainsAnyConditions: ").append(toIndentedString(journeyUrlContainsAnyConditions)).append("\n");
    sb.append("    journeyUrlNotContainsAnyConditions: ").append(toIndentedString(journeyUrlNotContainsAnyConditions)).append("\n");
    sb.append("    journeyUrlContainsAllConditions: ").append(toIndentedString(journeyUrlContainsAllConditions)).append("\n");
    sb.append("    journeyUrlNotContainsAllConditions: ").append(toIndentedString(journeyUrlNotContainsAllConditions)).append("\n");
    sb.append("    flowMilestoneIds: ").append(toIndentedString(flowMilestoneIds)).append("\n");
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

