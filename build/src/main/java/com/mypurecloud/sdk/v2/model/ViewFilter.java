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
import com.mypurecloud.sdk.v2.model.ConversationProperties;
import com.mypurecloud.sdk.v2.model.NumericRange;
import com.mypurecloud.sdk.v2.model.SocialKeyword;
import com.mypurecloud.sdk.v2.model.TranscriptTopics;
import com.mypurecloud.sdk.v2.model.Transcripts;
import com.mypurecloud.sdk.v2.model.WorkitemStatusFilter;
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
    INTERNALMESSAGE("internalmessage"),
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
  private List<MediaTypesEnum> mediaTypes = null;
  private List<String> queueIds = null;
  private List<String> skillIds = null;
  private List<String> assignedSkillIds = null;
  private List<String> skillGroups = null;
  private List<String> languageIds = null;
  private List<String> assignedLanguageIds = null;
  private List<String> languageGroups = null;

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
  private List<DirectionsEnum> directions = null;

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
  private List<OriginatingDirectionsEnum> originatingDirections = null;
  private List<String> wrapUpCodes = null;
  private List<String> dnisList = null;
  private List<String> sessionDnisList = null;
  private List<String> filterQueuesByUserIds = null;
  private List<String> filterUsersByQueueIds = null;
  private List<String> userIds = null;
  private List<String> managementUnitIds = null;
  private List<String> addressTos = null;
  private List<String> addressFroms = null;
  private List<String> outboundCampaignIds = null;
  private List<String> outboundContactListIds = null;
  private List<String> contactIds = null;
  private List<String> externalContactIds = null;
  private List<String> externalOrgIds = null;
  private List<String> aniList = null;
  private List<NumericRange> durationsMilliseconds = null;
  private List<NumericRange> acdDurationsMilliseconds = null;
  private List<NumericRange> talkDurationsMilliseconds = null;
  private List<NumericRange> acwDurationsMilliseconds = null;
  private List<NumericRange> handleDurationsMilliseconds = null;
  private List<NumericRange> holdDurationsMilliseconds = null;
  private List<NumericRange> abandonDurationsMilliseconds = null;
  private NumericRange evaluationScore = null;
  private NumericRange evaluationCriticalScore = null;
  private List<String> evaluationFormIds = null;
  private List<String> evaluatedAgentIds = null;
  private List<String> evaluatorIds = null;
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
    INSTAGRAM("instagram"),
    APPLE("apple");

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
  private List<MessageTypesEnum> messageTypes = null;
  private List<String> divisionIds = null;
  private List<String> surveyFormIds = null;
  private NumericRange surveyTotalScore = null;
  private NumericRange surveyNpsScore = null;
  private NumericRange mos = null;
  private NumericRange surveyQuestionGroupScore = null;
  private NumericRange surveyPromoterScore = null;
  private List<String> surveyFormContextIds = null;
  private List<String> conversationIds = null;
  private List<String> sipCallIds = null;
  private Boolean isEnded = null;
  private Boolean isSurveyed = null;
  private List<NumericRange> surveyScores = null;
  private List<NumericRange> promoterScores = null;
  private Boolean isCampaign = null;
  private List<String> surveyStatuses = null;
  private ConversationProperties conversationProperties = null;
  private Boolean isBlindTransferred = null;
  private Boolean isConsulted = null;
  private Boolean isConsultTransferred = null;
  private List<String> remoteParticipants = null;
  private List<String> flowIds = null;
  private List<String> flowOutcomeIds = null;

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
  private List<FlowOutcomeValuesEnum> flowOutcomeValues = null;

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
  private List<FlowDestinationTypesEnum> flowDestinationTypes = null;

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
  private List<FlowDisconnectReasonsEnum> flowDisconnectReasons = null;

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
    DIGITALBOT("digitalbot"),
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
    VOICE("voice"),
    VOICEMAIL("voicemail"),
    VOICESURVEY("voicesurvey"),
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
  private List<FlowTypesEnum> flowTypes = null;

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
  private List<FlowEntryTypesEnum> flowEntryTypes = null;
  private List<String> flowEntryReasons = null;
  private List<String> flowVersions = null;
  private List<String> groupIds = null;
  private Boolean hasJourneyCustomerId = null;
  private Boolean hasJourneyActionMapId = null;
  private Boolean hasJourneyVisitId = null;
  private Boolean hasMedia = null;
  private List<String> roleIds = null;
  private List<String> reportsTos = null;
  private List<String> locationIds = null;
  private List<String> flowOutTypes = null;
  private List<String> providerList = null;
  private List<String> callbackNumberList = null;
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
    CONDITIONAL("Conditional"),
    DIRECT("Direct"),
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard"),
    VIP("Vip");

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
  private List<UsedRoutingTypesEnum> usedRoutingTypes = null;

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
    CONDITIONAL("Conditional"),
    DIRECT("Direct"),
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard"),
    VIP("Vip");

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
  private List<RequestedRoutingTypesEnum> requestedRoutingTypes = null;
  private Boolean hasAgentAssistId = null;
  private List<Transcripts> transcripts = null;
  private List<String> transcriptLanguages = null;

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
  private List<ParticipantPurposesEnum> participantPurposes = null;
  private Boolean showFirstQueue = null;
  private List<String> teamIds = null;
  private List<String> filterUsersByTeamIds = null;
  private List<String> journeyActionMapIds = null;
  private List<String> journeyOutcomeIds = null;
  private List<String> journeySegmentIds = null;

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
  private List<JourneyActionMapTypesEnum> journeyActionMapTypes = null;

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
  private List<DevelopmentRoleListEnum> developmentRoleList = null;

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
    ASSESSEDCONTENT("AssessedContent"),
    EXTERNAL("External"),
    NATIVE("Native");

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
  private List<DevelopmentTypeListEnum> developmentTypeList = null;

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
    COMPLETED("Completed"),
    NOTCOMPLETED("NotCompleted");

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
  private List<DevelopmentStatusListEnum> developmentStatusList = null;
  private List<String> developmentModuleIds = null;
  private Boolean developmentActivityOverdue = null;
  private NumericRange customerSentimentScore = null;
  private NumericRange customerSentimentTrend = null;
  private List<String> flowTransferTargets = null;
  private String developmentName = null;
  private List<String> topicIds = null;
  private List<String> externalTags = null;
  private Boolean isNotResponding = null;
  private Boolean isAuthenticated = null;
  private List<String> botIds = null;
  private List<String> botVersions = null;

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
    OPEN("Open"),
    INSTAGRAM("Instagram"),
    APPLE("Apple"),
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
  private List<BotMessageTypesEnum> botMessageTypes = null;

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
  private List<BotProviderListEnum> botProviderList = null;

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
    GENESYSBYOB("GenesysByob"),
    AMAZONLEXV2("AmazonLexV2"),
    GOOGLEDIALOGFLOWCXRESELL("GoogleDialogFlowCxResell"),
    GOOGLESTTBOTFLOW("GoogleSttBotFlow"),
    MICROSOFTSTTBOTFLOW("MicrosoftSttBotFlow"),
    AUDIOCONNECTOR("AudioConnector"),
    BOTCONNECTOR("BotConnector");

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
  private List<BotProductListEnum> botProductList = null;

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
    NOINPUTDISAMBIGUATION("NoInputDisambiguation"),
    NOMATCHCOLLECTION("NoMatchCollection"),
    NOMATCHCONFIRMATION("NoMatchConfirmation"),
    NOMATCHDISAMBIGUATION("NoMatchDisambiguation"),
    MAXWRONGMATCH("MaxWrongMatch"),
    ALLOPTIONSREJECTED("AllOptionsRejected");

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
  private List<BotRecognitionFailureReasonListEnum> botRecognitionFailureReasonList = null;
  private List<String> botIntentList = null;
  private List<String> botFinalIntentList = null;
  private List<String> botSlotList = null;

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
    DISCONNECTRECOGNITIONFAILURE("DisconnectRecognitionFailure"),
    TRANSFERTOACD("TransferToACD");

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
  private List<BotResultListEnum> botResultList = null;

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
  private List<BlockedReasonsEnum> blockedReasons = null;
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
    DELIVERYPUSHED("DeliveryPushed"),
    DELIVERYSUCCESS("DeliverySuccess"),
    FAILED("Failed"),
    PUBLISHED("Published"),
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
  private List<EmailDeliveryStatusListEnum> emailDeliveryStatusList = null;
  private Boolean isAgentOwnedCallback = null;
  private List<String> agentCallbackOwnerIds = null;
  private List<TranscriptTopics> transcriptTopics = null;
  private List<String> journeyFrequencyCapReasons = null;
  private List<String> journeyBlockingActionMapIds = null;
  private List<String> journeyActionTargetIds = null;
  private List<String> journeyBlockingScheduleGroupIds = null;
  private List<String> journeyBlockingEmergencyScheduleGroupIds = null;
  private List<String> journeyUrlEqualConditions = null;
  private List<String> journeyUrlNotEqualConditions = null;
  private List<String> journeyUrlStartsWithConditions = null;
  private List<String> journeyUrlEndsWithConditions = null;
  private List<String> journeyUrlContainsAnyConditions = null;
  private List<String> journeyUrlNotContainsAnyConditions = null;
  private List<String> journeyUrlContainsAllConditions = null;
  private List<String> journeyUrlNotContainsAllConditions = null;
  private List<String> flowMilestoneIds = null;
  private Boolean isAssessmentPassed = null;
  private List<String> conversationInitiators = null;
  private Boolean hasCustomerParticipated = null;
  private Boolean isAcdInteraction = null;
  private Boolean hasFax = null;
  private List<String> dataActionIds = null;
  private String actionCategoryName = null;
  private List<String> integrationIds = null;
  private List<String> responseStatuses = null;

  private static class AvailableDashboardEnumDeserializer extends StdDeserializer<AvailableDashboardEnum> {
    public AvailableDashboardEnumDeserializer() {
      super(AvailableDashboardEnumDeserializer.class);
    }

    @Override
    public AvailableDashboardEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AvailableDashboardEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Filter to indicate the availability of the dashboard is public or private.
   */
 @JsonDeserialize(using = AvailableDashboardEnumDeserializer.class)
  public enum AvailableDashboardEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLIC("Public"),
    PRIVATE("Private");

    private String value;

    AvailableDashboardEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AvailableDashboardEnum fromString(String key) {
      if (key == null) return null;

      for (AvailableDashboardEnum value : AvailableDashboardEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AvailableDashboardEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AvailableDashboardEnum availableDashboard = null;
  private Boolean favouriteDashboard = null;
  private Boolean myDashboard = null;
  private List<String> stationErrors = null;
  private List<String> canonicalContactIds = null;
  private List<String> alertRuleIds = null;
  private List<String> evaluationFormContextIds = null;

  private static class EvaluationStatusesEnumDeserializer extends StdDeserializer<EvaluationStatusesEnum> {
    public EvaluationStatusesEnumDeserializer() {
      super(EvaluationStatusesEnumDeserializer.class);
    }

    @Override
    public EvaluationStatusesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EvaluationStatusesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets evaluationStatuses
   */
 @JsonDeserialize(using = EvaluationStatusesEnumDeserializer.class)
  public enum EvaluationStatusesEnum {
    FINISHED("Finished"),
    INPROGRESS("InProgress"),
    INREVIEW("InReview"),
    PENDING("Pending"),
    RETRACTED("Retracted");

    private String value;

    EvaluationStatusesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EvaluationStatusesEnum fromString(String key) {
      if (key == null) return null;

      for (EvaluationStatusesEnum value : EvaluationStatusesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EvaluationStatusesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<EvaluationStatusesEnum> evaluationStatuses = null;
  private List<String> workbinIds = null;
  private List<String> worktypeIds = null;
  private List<String> workitemIds = null;
  private List<String> workitemAssigneeIds = null;
  private List<String> workitemStatuses = null;
  private Boolean isAnalyzedForSensitiveData = null;
  private Boolean hasSensitiveData = null;
  private Boolean hasPciData = null;
  private Boolean hasPiiData = null;
  private String subPath = null;

  private static class UserStateEnumDeserializer extends StdDeserializer<UserStateEnum> {
    public UserStateEnumDeserializer() {
      super(UserStateEnumDeserializer.class);
    }

    @Override
    public UserStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UserStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user supplied state value in the view
   */
 @JsonDeserialize(using = UserStateEnumDeserializer.class)
  public enum UserStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVEANDINACTIVE("ActiveAndInactive"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    DELETED("Deleted");

    private String value;

    UserStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UserStateEnum fromString(String key) {
      if (key == null) return null;

      for (UserStateEnum value : UserStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UserStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UserStateEnum userState = null;
  private Boolean isClearedByCustomer = null;
  private List<String> evaluationAssigneeIds = null;
  private Boolean evaluationAssigned = null;
  private List<String> assistantIds = null;
  private List<String> knowledgeBaseIds = null;
  private Boolean isParked = null;
  private NumericRange agentEmpathyScore = null;

  private static class SurveyTypesEnumDeserializer extends StdDeserializer<SurveyTypesEnum> {
    public SurveyTypesEnumDeserializer() {
      super(SurveyTypesEnumDeserializer.class);
    }

    @Override
    public SurveyTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SurveyTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets surveyTypes
   */
 @JsonDeserialize(using = SurveyTypesEnumDeserializer.class)
  public enum SurveyTypesEnum {
    WEB("Web"),
    VOICE("Voice");

    private String value;

    SurveyTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SurveyTypesEnum fromString(String key) {
      if (key == null) return null;

      for (SurveyTypesEnum value : SurveyTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SurveyTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SurveyTypesEnum> surveyTypes = null;

  private static class SurveyResponseStatusesEnumDeserializer extends StdDeserializer<SurveyResponseStatusesEnum> {
    public SurveyResponseStatusesEnumDeserializer() {
      super(SurveyResponseStatusesEnumDeserializer.class);
    }

    @Override
    public SurveyResponseStatusesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SurveyResponseStatusesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets surveyResponseStatuses
   */
 @JsonDeserialize(using = SurveyResponseStatusesEnumDeserializer.class)
  public enum SurveyResponseStatusesEnum {
    UNKNOWN("Unknown"),
    FULLRESPONSE("FullResponse"),
    PARTIALRESPONSE("PartialResponse");

    private String value;

    SurveyResponseStatusesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SurveyResponseStatusesEnum fromString(String key) {
      if (key == null) return null;

      for (SurveyResponseStatusesEnum value : SurveyResponseStatusesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SurveyResponseStatusesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SurveyResponseStatusesEnum> surveyResponseStatuses = null;

  private static class BotFlowTypesEnumDeserializer extends StdDeserializer<BotFlowTypesEnum> {
    public BotFlowTypesEnumDeserializer() {
      super(BotFlowTypesEnumDeserializer.class);
    }

    @Override
    public BotFlowTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BotFlowTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets botFlowTypes
   */
 @JsonDeserialize(using = BotFlowTypesEnumDeserializer.class)
  public enum BotFlowTypesEnum {
    UNKNOWN("Unknown"),
    BOT("Bot"),
    DIGITALBOT("DigitalBot"),
    VOICESURVEY("VoiceSurvey");

    private String value;

    BotFlowTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BotFlowTypesEnum fromString(String key) {
      if (key == null) return null;

      for (BotFlowTypesEnum value : BotFlowTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BotFlowTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<BotFlowTypesEnum> botFlowTypes = null;
  private List<NumericRange> agentTalkDurationMilliseconds = null;
  private List<NumericRange> customerTalkDurationMilliseconds = null;
  private List<NumericRange> overtalkDurationMilliseconds = null;
  private List<NumericRange> silenceDurationMilliseconds = null;
  private List<NumericRange> acdDurationMilliseconds = null;
  private List<NumericRange> ivrDurationMilliseconds = null;
  private List<NumericRange> otherDurationMilliseconds = null;
  private NumericRange agentTalkPercentage = null;
  private NumericRange customerTalkPercentage = null;
  private NumericRange overtalkPercentage = null;
  private NumericRange silencePercentage = null;
  private NumericRange acdPercentage = null;
  private NumericRange ivrPercentage = null;
  private NumericRange otherPercentage = null;
  private NumericRange overtalkInstances = null;
  private Boolean isScreenRecorded = null;
  private List<String> screenMonitorUserIds = null;

  private static class DashboardStateEnumDeserializer extends StdDeserializer<DashboardStateEnum> {
    public DashboardStateEnumDeserializer() {
      super(DashboardStateEnumDeserializer.class);
    }

    @Override
    public DashboardStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DashboardStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of dashboard being filtered
   */
 @JsonDeserialize(using = DashboardStateEnumDeserializer.class)
  public enum DashboardStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    DELETED("Deleted");

    private String value;

    DashboardStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DashboardStateEnum fromString(String key) {
      if (key == null) return null;

      for (DashboardStateEnum value : DashboardStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DashboardStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DashboardStateEnum dashboardState = null;

  private static class DashboardTypeEnumDeserializer extends StdDeserializer<DashboardTypeEnum> {
    public DashboardTypeEnumDeserializer() {
      super(DashboardTypeEnumDeserializer.class);
    }

    @Override
    public DashboardTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DashboardTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of dashboard being filtered
   */
 @JsonDeserialize(using = DashboardTypeEnumDeserializer.class)
  public enum DashboardTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    PUBLIC("Public"),
    PRIVATE("Private"),
    SHARED("Shared"),
    FAVORITES("Favorites");

    private String value;

    DashboardTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DashboardTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DashboardTypeEnum value : DashboardTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DashboardTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DashboardTypeEnum dashboardType = null;

  private static class DashboardAccessFilterEnumDeserializer extends StdDeserializer<DashboardAccessFilterEnum> {
    public DashboardAccessFilterEnumDeserializer() {
      super(DashboardAccessFilterEnumDeserializer.class);
    }

    @Override
    public DashboardAccessFilterEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DashboardAccessFilterEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of dashboard access being filtered
   */
 @JsonDeserialize(using = DashboardAccessFilterEnumDeserializer.class)
  public enum DashboardAccessFilterEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OWNEDBYME("OwnedByMe"),
    OWNEDBYANYONE("OwnedByAnyone"),
    NOTOWNEDBYME("NotOwnedByMe");

    private String value;

    DashboardAccessFilterEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DashboardAccessFilterEnum fromString(String key) {
      if (key == null) return null;

      for (DashboardAccessFilterEnum value : DashboardAccessFilterEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DashboardAccessFilterEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DashboardAccessFilterEnum dashboardAccessFilter = null;
  private List<NumericRange> transcriptDurationMilliseconds = null;
  private List<WorkitemStatusFilter> workitemsStatuses = null;
  private List<String> socialCountries = null;
  private List<String> socialLanguages = null;

  private static class SocialChannelsEnumDeserializer extends StdDeserializer<SocialChannelsEnum> {
    public SocialChannelsEnumDeserializer() {
      super(SocialChannelsEnumDeserializer.class);
    }

    @Override
    public SocialChannelsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SocialChannelsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets socialChannels
   */
 @JsonDeserialize(using = SocialChannelsEnumDeserializer.class)
  public enum SocialChannelsEnum {
    TWITTER("Twitter"),
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram"),
    OPEN("Open");

    private String value;

    SocialChannelsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SocialChannelsEnum fromString(String key) {
      if (key == null) return null;

      for (SocialChannelsEnum value : SocialChannelsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SocialChannelsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SocialChannelsEnum> socialChannels = null;

  private static class SocialSentimentCategoryEnumDeserializer extends StdDeserializer<SocialSentimentCategoryEnum> {
    public SocialSentimentCategoryEnumDeserializer() {
      super(SocialSentimentCategoryEnumDeserializer.class);
    }

    @Override
    public SocialSentimentCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SocialSentimentCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets socialSentimentCategory
   */
 @JsonDeserialize(using = SocialSentimentCategoryEnumDeserializer.class)
  public enum SocialSentimentCategoryEnum {
    POSITIVE("Positive"),
    NEGATIVE("Negative"),
    NEUTRAL("Neutral"),
    UNKNOWN("Unknown");

    private String value;

    SocialSentimentCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SocialSentimentCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (SocialSentimentCategoryEnum value : SocialSentimentCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SocialSentimentCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SocialSentimentCategoryEnum> socialSentimentCategory = null;
  private List<String> socialTopicIds = null;
  private List<String> socialIngestionRuleIds = null;
  private Boolean socialConversationCreated = null;

  private static class SocialContentTypeEnumDeserializer extends StdDeserializer<SocialContentTypeEnum> {
    public SocialContentTypeEnumDeserializer() {
      super(SocialContentTypeEnumDeserializer.class);
    }

    @Override
    public SocialContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SocialContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets socialContentType
   */
 @JsonDeserialize(using = SocialContentTypeEnumDeserializer.class)
  public enum SocialContentTypeEnum {
    TEXT("Text"),
    IMAGE("Image"),
    VIDEO("Video");

    private String value;

    SocialContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SocialContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SocialContentTypeEnum value : SocialContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SocialContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SocialContentTypeEnum> socialContentType = null;
  private List<SocialKeyword> socialKeywords = null;
  private Boolean socialPostEscalated = null;

  private static class SocialClassificationsEnumDeserializer extends StdDeserializer<SocialClassificationsEnum> {
    public SocialClassificationsEnumDeserializer() {
      super(SocialClassificationsEnumDeserializer.class);
    }

    @Override
    public SocialClassificationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SocialClassificationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets socialClassifications
   */
 @JsonDeserialize(using = SocialClassificationsEnumDeserializer.class)
  public enum SocialClassificationsEnum {
    PUBLIC("Public"),
    PRIVATE("Private");

    private String value;

    SocialClassificationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SocialClassificationsEnum fromString(String key) {
      if (key == null) return null;

      for (SocialClassificationsEnum value : SocialClassificationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SocialClassificationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SocialClassificationsEnum> socialClassifications = null;
  private List<String> filterUsersByManagerIds = null;
  private List<String> slideshowIds = null;
  private Boolean conferenced = null;
  private Boolean video = null;
  private Boolean linkedInteraction = null;

  private static class RecommendationSourcesEnumDeserializer extends StdDeserializer<RecommendationSourcesEnum> {
    public RecommendationSourcesEnumDeserializer() {
      super(RecommendationSourcesEnumDeserializer.class);
    }

    @Override
    public RecommendationSourcesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RecommendationSourcesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets recommendationSources
   */
 @JsonDeserialize(using = RecommendationSourcesEnumDeserializer.class)
  public enum RecommendationSourcesEnum {
    KNOWLEDGESEARCH("KnowledgeSearch"),
    RULESENGINE("RulesEngine"),
    MANUALSEARCH("ManualSearch");

    private String value;

    RecommendationSourcesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RecommendationSourcesEnum fromString(String key) {
      if (key == null) return null;

      for (RecommendationSourcesEnum value : RecommendationSourcesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RecommendationSourcesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<RecommendationSourcesEnum> recommendationSources = null;

  private static class EvaluationRoleEnumDeserializer extends StdDeserializer<EvaluationRoleEnum> {
    public EvaluationRoleEnumDeserializer() {
      super(EvaluationRoleEnumDeserializer.class);
    }

    @Override
    public EvaluationRoleEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EvaluationRoleEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Sets the role when viewing agent evaluations
   */
 @JsonDeserialize(using = EvaluationRoleEnumDeserializer.class)
  public enum EvaluationRoleEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EVALUATOR("Evaluator"),
    SUPERVISOR("Supervisor");

    private String value;

    EvaluationRoleEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EvaluationRoleEnum fromString(String key) {
      if (key == null) return null;

      for (EvaluationRoleEnum value : EvaluationRoleEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EvaluationRoleEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EvaluationRoleEnum evaluationRole = null;
  private List<String> comparisonQueueIds = null;

  private static class ViewMetricsEnumDeserializer extends StdDeserializer<ViewMetricsEnum> {
    public ViewMetricsEnumDeserializer() {
      super(ViewMetricsEnumDeserializer.class);
    }

    @Override
    public ViewMetricsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ViewMetricsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets viewMetrics
   */
 @JsonDeserialize(using = ViewMetricsEnumDeserializer.class)
  public enum ViewMetricsEnum {
    AVG_TALK_TIME("AVG_TALK_TIME"),
    AVG_HOLD_TIME("AVG_HOLD_TIME"),
    AVG_ACW_TIME("AVG_ACW_TIME"),
    AVG_WAIT_TIME("AVG_WAIT_TIME"),
    AVG_HANDLE_TIME("AVG_HANDLE_TIME"),
    AVG_ALERT_TIME("AVG_ALERT_TIME"),
    AVG_ANSWER_TIME("AVG_ANSWER_TIME"),
    AVG_ABANDON_TIME("AVG_ABANDON_TIME"),
    TOTAL_TALK_TIME("TOTAL_TALK_TIME"),
    TOTAL_HANDLE_TIME("TOTAL_HANDLE_TIME"),
    TOTAL_HOLD_TIME("TOTAL_HOLD_TIME"),
    TOTAL_ACW_TIME("TOTAL_ACW_TIME"),
    TOTAL_ALERT_TIME("TOTAL_ALERT_TIME"),
    MAX_ABANDON_TIME("MAX_ABANDON_TIME"),
    MAX_WAIT_TIME("MAX_WAIT_TIME"),
    MAX_TALK_TIME("MAX_TALK_TIME"),
    MAX_HOLD_TIME("MAX_HOLD_TIME"),
    MAX_ACW_TIME("MAX_ACW_TIME"),
    MIN_ABANDON_TIME("MIN_ABANDON_TIME"),
    MIN_WAIT_TIME("MIN_WAIT_TIME"),
    MIN_TALK_TIME("MIN_TALK_TIME"),
    MIN_HOLD_TIME("MIN_HOLD_TIME"),
    MIN_ACW_TIME("MIN_ACW_TIME"),
    ALERT_COUNT("ALERT_COUNT"),
    OFFERED_COUNT("OFFERED_COUNT"),
    ABANDONED_COUNT("ABANDONED_COUNT"),
    ABANDONED_PERCENT("ABANDONED_PERCENT"),
    SHORT_ABANDONED_COUNT("SHORT_ABANDONED_COUNT"),
    SHORT_ABANDONED_PERCENT("SHORT_ABANDONED_PERCENT"),
    ABANDONED_NO_SHORT_COUNT("ABANDONED_NO_SHORT_COUNT"),
    ABANDONED_NO_SHORT_PERCENT("ABANDONED_NO_SHORT_PERCENT"),
    ANSWERED_COUNT("ANSWERED_COUNT"),
    ANSWERED_PERCENT("ANSWERED_PERCENT"),
    FLOWOUT_COUNT("FLOWOUT_COUNT"),
    FLOWOUT_PERCENT("FLOWOUT_PERCENT"),
    OUTBOUND_COUNT("OUTBOUND_COUNT"),
    OUTBOUND_ATTEMPTED_COUNT("OUTBOUND_ATTEMPTED_COUNT"),
    VOICEMAIL_COUNT("VOICEMAIL_COUNT"),
    HANDLED_COUNT("HANDLED_COUNT"),
    HELD_COUNT("HELD_COUNT"),
    TRANSFERRED_COUNT("TRANSFERRED_COUNT"),
    TRANSFERRED_PERCENT("TRANSFERRED_PERCENT"),
    WAITING_CURRENT("WAITING_CURRENT"),
    INTERACTING_CURRENT("INTERACTING_CURRENT"),
    HELD_CURRENT("HELD_CURRENT"),
    ALERTING_CURRENT("ALERTING_CURRENT"),
    SERVICE_LEVEL("SERVICE_LEVEL"),
    OVER_SERVICE_LEVEL("OVER_SERVICE_LEVEL"),
    ONLINE_AGENTS("ONLINE_AGENTS"),
    AVAILABLE_AGENTS("AVAILABLE_AGENTS"),
    AWAY_AGENTS("AWAY_AGENTS"),
    BREAK_AGENTS("BREAK_AGENTS"),
    MEAL_AGENTS("MEAL_AGENTS"),
    TRAINING_AGENTS("TRAINING_AGENTS"),
    BUSY_AGENTS("BUSY_AGENTS"),
    MEETING_AGENTS("MEETING_AGENTS"),
    SYSTEM_AWAY_AGENTS("SYSTEM_AWAY_AGENTS"),
    OFFLINE_AGENTS("OFFLINE_AGENTS"),
    ON_QUEUE_AGENTS("ON_QUEUE_AGENTS"),
    OFF_QUEUE_AGENTS("OFF_QUEUE_AGENTS"),
    INTERACTING_AGENTS("INTERACTING_AGENTS"),
    ACW_AGENTS("ACW_AGENTS"),
    COMMUNICATING_AGENTS("COMMUNICATING_AGENTS"),
    IDLE_AGENTS("IDLE_AGENTS"),
    NOT_RESPONDING_AGENTS("NOT_RESPONDING_AGENTS"),
    LONGEST_WAITING("LONGEST_WAITING"),
    LONGEST_INTERACTING("LONGEST_INTERACTING"),
    FLOW_ACTIVE_LONGEST("FLOW_ACTIVE_LONGEST"),
    FLOW_ACTIVE_CURRENT("FLOW_ACTIVE_CURRENT"),
    FLOW_ENTRIES_COUNT("FLOW_ENTRIES_COUNT"),
    FLOW_TOTAL_DURATION("FLOW_TOTAL_DURATION"),
    FLOW_MAX_DURATION("FLOW_MAX_DURATION"),
    FLOW_AVG_DURATION("FLOW_AVG_DURATION"),
    FLOW_DISCONNECT_COUNT("FLOW_DISCONNECT_COUNT"),
    FLOW_DISCONNECT_PERCENT("FLOW_DISCONNECT_PERCENT"),
    FLOW_TOTAL_DISCONNECT_DURATION("FLOW_TOTAL_DISCONNECT_DURATION"),
    FLOW_AVG_DISCONNECT_DURATION("FLOW_AVG_DISCONNECT_DURATION"),
    FLOW_MAX_DISCONNECT_DURATION("FLOW_MAX_DISCONNECT_DURATION"),
    FLOW_FLOW_DISCONNECT("FLOW_FLOW_DISCONNECT"),
    FLOW_FLOW_DISCONNECT_PERCENT("FLOW_FLOW_DISCONNECT_PERCENT"),
    FLOW_SYSTEM_ERROR_DISCONNECT("FLOW_SYSTEM_ERROR_DISCONNECT"),
    FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT("FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT"),
    FLOW_CUSTOMER_DISCONNECT("FLOW_CUSTOMER_DISCONNECT"),
    FLOW_CUSTOMER_DISCONNECT_PERCENT("FLOW_CUSTOMER_DISCONNECT_PERCENT"),
    FLOW_SHORT_DISCONNECT("FLOW_SHORT_DISCONNECT"),
    FLOW_SHORT_DISCONNECT_PERCENT("FLOW_SHORT_DISCONNECT_PERCENT"),
    FLOW_EXIT_COUNT("FLOW_EXIT_COUNT"),
    FLOW_EXIT_PERCENT("FLOW_EXIT_PERCENT"),
    FLOW_TOTAL_EXIT_DURATION("FLOW_TOTAL_EXIT_DURATION"),
    FLOW_MAX_EXIT_DURATION("FLOW_MAX_EXIT_DURATION"),
    FLOW_AVG_EXIT_DURATION("FLOW_AVG_EXIT_DURATION"),
    FLOW_ACD_EXIT_COUNT("FLOW_ACD_EXIT_COUNT"),
    FLOW_ACD_EXIT_PERCENT("FLOW_ACD_EXIT_PERCENT"),
    FLOW_GROUP_EXIT_COUNT("FLOW_GROUP_EXIT_COUNT"),
    FLOW_GROUP_EXIT_PERCENT("FLOW_GROUP_EXIT_PERCENT"),
    FLOW_NUMBER_EXIT_COUNT("FLOW_NUMBER_EXIT_COUNT"),
    FLOW_NUMBER_EXIT_PERCENT("FLOW_NUMBER_EXIT_PERCENT"),
    FLOW_USER_EXIT_COUNT("FLOW_USER_EXIT_COUNT"),
    FLOW_USER_EXIT_PERCENT("FLOW_USER_EXIT_PERCENT"),
    FLOW_FLOW_EXIT_COUNT("FLOW_FLOW_EXIT_COUNT"),
    FLOW_FLOW_EXIT_PERCENT("FLOW_FLOW_EXIT_PERCENT"),
    FLOW_SECURE_FLOW_EXIT_COUNT("FLOW_SECURE_FLOW_EXIT_COUNT"),
    FLOW_SECURE_FLOW_EXIT_PERCENT("FLOW_SECURE_FLOW_EXIT_PERCENT"),
    FLOW_ACD_VOICEMAIL_EXIT_COUNT("FLOW_ACD_VOICEMAIL_EXIT_COUNT"),
    FLOW_ACD_VOICEMAIL_EXIT_PERCENT("FLOW_ACD_VOICEMAIL_EXIT_PERCENT"),
    FLOW_USER_VOICEMAIL_EXIT_COUNT("FLOW_USER_VOICEMAIL_EXIT_COUNT"),
    FLOW_USER_VOICEMAIL_EXIT_PERCENT("FLOW_USER_VOICEMAIL_EXIT_PERCENT"),
    FLOW_OUTCOME_COUNT("FLOW_OUTCOME_COUNT"),
    FLOW_AVG_OUTCOME_DECIMAL("FLOW_AVG_OUTCOME_DECIMAL"),
    FLOW_OUTCOME_FAILURE_COUNT("FLOW_OUTCOME_FAILURE_COUNT"),
    FLOW_OUTCOME_FAILURE_PERCENT("FLOW_OUTCOME_FAILURE_PERCENT"),
    FLOW_OUTCOME_SUCCESS_COUNT("FLOW_OUTCOME_SUCCESS_COUNT"),
    FLOW_OUTCOME_SUCCESS_PERCENT("FLOW_OUTCOME_SUCCESS_PERCENT"),
    FLOW_OUTCOME_TOTAL_DURATION("FLOW_OUTCOME_TOTAL_DURATION"),
    FLOW_OUTCOME_MAX_DURATION("FLOW_OUTCOME_MAX_DURATION"),
    FLOW_OUTCOME_AVG_DURATION("FLOW_OUTCOME_AVG_DURATION"),
    FLOW_OUTCOME_MIN_DURATION("FLOW_OUTCOME_MIN_DURATION"),
    OFF_QUEUE_TIME("OFF_QUEUE_TIME"),
    OFF_QUEUE_PERCENT("OFF_QUEUE_PERCENT"),
    AVAILABLE_TIME("AVAILABLE_TIME"),
    AVAILABLE_PERCENT("AVAILABLE_PERCENT"),
    BUSY_TIME("BUSY_TIME"),
    BUSY_PERCENT("BUSY_PERCENT"),
    AWAY_TIME("AWAY_TIME"),
    AWAY_PERCENT("AWAY_PERCENT"),
    BREAK_TIME("BREAK_TIME"),
    BREAK_PERCENT("BREAK_PERCENT"),
    MEAL_TIME("MEAL_TIME"),
    MEAL_PERCENT("MEAL_PERCENT"),
    MEETING_TIME("MEETING_TIME"),
    MEETING_PERCENT("MEETING_PERCENT"),
    TRAINING_TIME("TRAINING_TIME"),
    TRAINING_PERCENT("TRAINING_PERCENT"),
    INTERACTING_TIME("INTERACTING_TIME"),
    INTERACTING_PERCENT("INTERACTING_PERCENT"),
    COMMUNICATING_TIME("COMMUNICATING_TIME"),
    COMMUNICATING_PERCENT("COMMUNICATING_PERCENT"),
    SYSTEM_AWAY_TIME("SYSTEM_AWAY_TIME"),
    SYSTEM_AWAY_PERCENT("SYSTEM_AWAY_PERCENT"),
    ON_QUEUE_TIME("ON_QUEUE_TIME"),
    ON_QUEUE_PERCENT("ON_QUEUE_PERCENT"),
    IDLE_TIME("IDLE_TIME"),
    IDLE_PERCENT("IDLE_PERCENT"),
    NOT_RESPONDING_TIME("NOT_RESPONDING_TIME"),
    NOT_RESPONDING_PERCENT("NOT_RESPONDING_PERCENT"),
    LOGGED_IN_TIME("LOGGED_IN_TIME"),
    OCCUPANCY_PERCENT("OCCUPANCY_PERCENT"),
    MIN_ALERT_TIME("MIN_ALERT_TIME"),
    MAX_ALERT_TIME("MAX_ALERT_TIME"),
    MIN_HANDLE_TIME("MIN_HANDLE_TIME"),
    MAX_HANDLE_TIME("MAX_HANDLE_TIME"),
    MIN_ANSWERED_TIME("MIN_ANSWERED_TIME"),
    MAX_ANSWERED_TIME("MAX_ANSWERED_TIME"),
    MIN_NOT_RESPONDING_TIME("MIN_NOT_RESPONDING_TIME"),
    MAX_NOT_RESPONDING_TIME("MAX_NOT_RESPONDING_TIME"),
    MET_SERVICE_LEVEL("MET_SERVICE_LEVEL"),
    WFM_ADHERENCE_STATUS("WFM_ADHERENCE_STATUS"),
    WFM_SCHEDULED_ACTIVITY("WFM_SCHEDULED_ACTIVITY"),
    WFM_ADHERENCE_DURATION("WFM_ADHERENCE_DURATION"),
    AGENT_TITLE("AGENT_TITLE"),
    AGENT_DEPARTMENT("AGENT_DEPARTMENT"),
    AGENT_EXTENSION("AGENT_EXTENSION"),
    AGENT_SKILLS("AGENT_SKILLS"),
    AGENT_LOCATION("AGENT_LOCATION"),
    AGENT_REPORTS_TO("AGENT_REPORTS_TO"),
    AGENT_EMAIL("AGENT_EMAIL"),
    AGENT_ROLE("AGENT_ROLE"),
    AGENT_GROUP("AGENT_GROUP"),
    AGENT_TIME_IN_STATUS("AGENT_TIME_IN_STATUS"),
    AGENT_TIME_IN_ROUTING_STATUS("AGENT_TIME_IN_ROUTING_STATUS"),
    AGENT_STATUS("AGENT_STATUS"),
    AGENT_SECONDARY_STATUS("AGENT_SECONDARY_STATUS"),
    AGENT_ROUTING_STATUS("AGENT_ROUTING_STATUS"),
    AGENT_MEDIA_TYPES("AGENT_MEDIA_TYPES"),
    ACW_COUNT("ACW_COUNT"),
    ANSWER_TRANSFERRED_PERCENT("ANSWER_TRANSFERRED_PERCENT"),
    FLOW_AVG_MILESTONE_DECIMAL("FLOW_AVG_MILESTONE_DECIMAL"),
    NOT_RESPONDING_COUNT("NOT_RESPONDING_COUNT"),
    AVG_ACW_HANDLED("AVG_ACW_HANDLED"),
    AVG_CONTACTING_TIME("AVG_CONTACTING_TIME"),
    AVG_DIALING_TIME("AVG_DIALING_TIME"),
    AVG_FLOWOUT_TIME("AVG_FLOWOUT_TIME"),
    AVG_HOLD_HANDLED("AVG_HOLD_HANDLED"),
    AVG_MONITOR("AVG_MONITOR"),
    BLIND_TRANSFER_COUNT("BLIND_TRANSFER_COUNT"),
    BLIND_TRANSFER_PERCENT("BLIND_TRANSFER_PERCENT"),
    CONNECTED_COUNT("CONNECTED_COUNT"),
    CONSULT_COUNT("CONSULT_COUNT"),
    CONSULT_TRANSFER_COUNT("CONSULT_TRANSFER_COUNT"),
    CONSULT_TRANSFER_PERCENT("CONSULT_TRANSFER_PERCENT"),
    CONTACTING_COUNT("CONTACTING_COUNT"),
    DIALING_COUNT("DIALING_COUNT"),
    ERROR_COUNT("ERROR_COUNT"),
    EXTERNAL_MEDIA_COUNT("EXTERNAL_MEDIA_COUNT"),
    MAX_CONTACTING_TIME("MAX_CONTACTING_TIME"),
    MAX_DIALING_TIME("MAX_DIALING_TIME"),
    MAX_FLOWOUT_TIME("MAX_FLOWOUT_TIME"),
    FLOW_MILESTONE_COUNT("FLOW_MILESTONE_COUNT"),
    MIN_FLOWOUT_TIME("MIN_FLOWOUT_TIME"),
    MAX_MONITOR("MAX_MONITOR"),
    MIN_CONTACTING_TIME("MIN_CONTACTING_TIME"),
    MIN_DIALING_TIME("MIN_DIALING_TIME"),
    MIN_MONITOR("MIN_MONITOR"),
    MONITOR_COUNT("MONITOR_COUNT"),
    MEDIA_COUNT("MEDIA_COUNT"),
    SERVICE_LEVEL_TARGET("SERVICE_LEVEL_TARGET"),
    SERVICE_LEVEL_TARGET_CURRENT("SERVICE_LEVEL_TARGET_CURRENT"),
    TALK_COUNT("TALK_COUNT"),
    TOTAL_ABANDON_TIME("TOTAL_ABANDON_TIME"),
    TOTAL_NOT_RESPONDING_TIME("TOTAL_NOT_RESPONDING_TIME"),
    TOTAL_CONTACTING("TOTAL_CONTACTING"),
    TOTAL_DIALING("TOTAL_DIALING"),
    TOTAL_MONITOR("TOTAL_MONITOR"),
    TOTAL_WAIT_TIME("TOTAL_WAIT_TIME"),
    WAIT_COUNT("WAIT_COUNT"),
    PARK_COUNT("PARK_COUNT"),
    AVG_PARK_TIME("AVG_PARK_TIME"),
    TOTAL_PARK_TIME("TOTAL_PARK_TIME"),
    MIN_PARK_TIME("MIN_PARK_TIME"),
    MAX_PARK_TIME("MAX_PARK_TIME");

    private String value;

    ViewMetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ViewMetricsEnum fromString(String key) {
      if (key == null) return null;

      for (ViewMetricsEnum value : ViewMetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ViewMetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ViewMetricsEnum> viewMetrics = null;
  private List<String> timelineCategories = null;
  private Boolean acw = null;

  private static class SegmentTypesEnumDeserializer extends StdDeserializer<SegmentTypesEnum> {
    public SegmentTypesEnumDeserializer() {
      super(SegmentTypesEnumDeserializer.class);
    }

    @Override
    public SegmentTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SegmentTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets segmentTypes
   */
 @JsonDeserialize(using = SegmentTypesEnumDeserializer.class)
  public enum SegmentTypesEnum {
    ALERT("alert"),
    BARGING("barging"),
    CALLBACK("callback"),
    COACHING("coaching"),
    CONTACTING("contacting"),
    CONVERTING("converting"),
    DELAY("delay"),
    DIALING("dialing"),
    HOLD("hold"),
    INTERACT("interact"),
    IVR("ivr"),
    MONITORING("monitoring"),
    PARKED("parked"),
    SCHEDULED("scheduled"),
    SHARING("sharing"),
    SYSTEM("system"),
    TRANSMITTING("transmitting"),
    UNKNOWN("unknown"),
    UPLOADING("uploading"),
    VOICEMAIL("voicemail"),
    WRAPUP("wrapup");

    private String value;

    SegmentTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SegmentTypesEnum fromString(String key) {
      if (key == null) return null;

      for (SegmentTypesEnum value : SegmentTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SegmentTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SegmentTypesEnum> segmentTypes = null;
  private List<String> programIds = null;
  private List<String> categoryIds = null;

  public ViewFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mediaTypes = new ArrayList<MediaTypesEnum>();
      queueIds = new ArrayList<String>();
      skillIds = new ArrayList<String>();
      assignedSkillIds = new ArrayList<String>();
      skillGroups = new ArrayList<String>();
      languageIds = new ArrayList<String>();
      assignedLanguageIds = new ArrayList<String>();
      languageGroups = new ArrayList<String>();
      directions = new ArrayList<DirectionsEnum>();
      originatingDirections = new ArrayList<OriginatingDirectionsEnum>();
      wrapUpCodes = new ArrayList<String>();
      dnisList = new ArrayList<String>();
      sessionDnisList = new ArrayList<String>();
      filterQueuesByUserIds = new ArrayList<String>();
      filterUsersByQueueIds = new ArrayList<String>();
      userIds = new ArrayList<String>();
      managementUnitIds = new ArrayList<String>();
      addressTos = new ArrayList<String>();
      addressFroms = new ArrayList<String>();
      outboundCampaignIds = new ArrayList<String>();
      outboundContactListIds = new ArrayList<String>();
      contactIds = new ArrayList<String>();
      externalContactIds = new ArrayList<String>();
      externalOrgIds = new ArrayList<String>();
      aniList = new ArrayList<String>();
      durationsMilliseconds = new ArrayList<NumericRange>();
      acdDurationsMilliseconds = new ArrayList<NumericRange>();
      talkDurationsMilliseconds = new ArrayList<NumericRange>();
      acwDurationsMilliseconds = new ArrayList<NumericRange>();
      handleDurationsMilliseconds = new ArrayList<NumericRange>();
      holdDurationsMilliseconds = new ArrayList<NumericRange>();
      abandonDurationsMilliseconds = new ArrayList<NumericRange>();
      evaluationFormIds = new ArrayList<String>();
      evaluatedAgentIds = new ArrayList<String>();
      evaluatorIds = new ArrayList<String>();
      messageTypes = new ArrayList<MessageTypesEnum>();
      divisionIds = new ArrayList<String>();
      surveyFormIds = new ArrayList<String>();
      surveyFormContextIds = new ArrayList<String>();
      conversationIds = new ArrayList<String>();
      sipCallIds = new ArrayList<String>();
      surveyScores = new ArrayList<NumericRange>();
      promoterScores = new ArrayList<NumericRange>();
      surveyStatuses = new ArrayList<String>();
      remoteParticipants = new ArrayList<String>();
      flowIds = new ArrayList<String>();
      flowOutcomeIds = new ArrayList<String>();
      flowOutcomeValues = new ArrayList<FlowOutcomeValuesEnum>();
      flowDestinationTypes = new ArrayList<FlowDestinationTypesEnum>();
      flowDisconnectReasons = new ArrayList<FlowDisconnectReasonsEnum>();
      flowTypes = new ArrayList<FlowTypesEnum>();
      flowEntryTypes = new ArrayList<FlowEntryTypesEnum>();
      flowEntryReasons = new ArrayList<String>();
      flowVersions = new ArrayList<String>();
      groupIds = new ArrayList<String>();
      roleIds = new ArrayList<String>();
      reportsTos = new ArrayList<String>();
      locationIds = new ArrayList<String>();
      flowOutTypes = new ArrayList<String>();
      providerList = new ArrayList<String>();
      callbackNumberList = new ArrayList<String>();
      usedRoutingTypes = new ArrayList<UsedRoutingTypesEnum>();
      requestedRoutingTypes = new ArrayList<RequestedRoutingTypesEnum>();
      transcripts = new ArrayList<Transcripts>();
      transcriptLanguages = new ArrayList<String>();
      participantPurposes = new ArrayList<ParticipantPurposesEnum>();
      teamIds = new ArrayList<String>();
      filterUsersByTeamIds = new ArrayList<String>();
      journeyActionMapIds = new ArrayList<String>();
      journeyOutcomeIds = new ArrayList<String>();
      journeySegmentIds = new ArrayList<String>();
      journeyActionMapTypes = new ArrayList<JourneyActionMapTypesEnum>();
      developmentRoleList = new ArrayList<DevelopmentRoleListEnum>();
      developmentTypeList = new ArrayList<DevelopmentTypeListEnum>();
      developmentStatusList = new ArrayList<DevelopmentStatusListEnum>();
      developmentModuleIds = new ArrayList<String>();
      flowTransferTargets = new ArrayList<String>();
      topicIds = new ArrayList<String>();
      externalTags = new ArrayList<String>();
      botIds = new ArrayList<String>();
      botVersions = new ArrayList<String>();
      botMessageTypes = new ArrayList<BotMessageTypesEnum>();
      botProviderList = new ArrayList<BotProviderListEnum>();
      botProductList = new ArrayList<BotProductListEnum>();
      botRecognitionFailureReasonList = new ArrayList<BotRecognitionFailureReasonListEnum>();
      botIntentList = new ArrayList<String>();
      botFinalIntentList = new ArrayList<String>();
      botSlotList = new ArrayList<String>();
      botResultList = new ArrayList<BotResultListEnum>();
      blockedReasons = new ArrayList<BlockedReasonsEnum>();
      emailDeliveryStatusList = new ArrayList<EmailDeliveryStatusListEnum>();
      agentCallbackOwnerIds = new ArrayList<String>();
      transcriptTopics = new ArrayList<TranscriptTopics>();
      journeyFrequencyCapReasons = new ArrayList<String>();
      journeyBlockingActionMapIds = new ArrayList<String>();
      journeyActionTargetIds = new ArrayList<String>();
      journeyBlockingScheduleGroupIds = new ArrayList<String>();
      journeyBlockingEmergencyScheduleGroupIds = new ArrayList<String>();
      journeyUrlEqualConditions = new ArrayList<String>();
      journeyUrlNotEqualConditions = new ArrayList<String>();
      journeyUrlStartsWithConditions = new ArrayList<String>();
      journeyUrlEndsWithConditions = new ArrayList<String>();
      journeyUrlContainsAnyConditions = new ArrayList<String>();
      journeyUrlNotContainsAnyConditions = new ArrayList<String>();
      journeyUrlContainsAllConditions = new ArrayList<String>();
      journeyUrlNotContainsAllConditions = new ArrayList<String>();
      flowMilestoneIds = new ArrayList<String>();
      conversationInitiators = new ArrayList<String>();
      dataActionIds = new ArrayList<String>();
      integrationIds = new ArrayList<String>();
      responseStatuses = new ArrayList<String>();
      stationErrors = new ArrayList<String>();
      canonicalContactIds = new ArrayList<String>();
      alertRuleIds = new ArrayList<String>();
      evaluationFormContextIds = new ArrayList<String>();
      evaluationStatuses = new ArrayList<EvaluationStatusesEnum>();
      workbinIds = new ArrayList<String>();
      worktypeIds = new ArrayList<String>();
      workitemIds = new ArrayList<String>();
      workitemAssigneeIds = new ArrayList<String>();
      workitemStatuses = new ArrayList<String>();
      evaluationAssigneeIds = new ArrayList<String>();
      assistantIds = new ArrayList<String>();
      knowledgeBaseIds = new ArrayList<String>();
      surveyTypes = new ArrayList<SurveyTypesEnum>();
      surveyResponseStatuses = new ArrayList<SurveyResponseStatusesEnum>();
      botFlowTypes = new ArrayList<BotFlowTypesEnum>();
      agentTalkDurationMilliseconds = new ArrayList<NumericRange>();
      customerTalkDurationMilliseconds = new ArrayList<NumericRange>();
      overtalkDurationMilliseconds = new ArrayList<NumericRange>();
      silenceDurationMilliseconds = new ArrayList<NumericRange>();
      acdDurationMilliseconds = new ArrayList<NumericRange>();
      ivrDurationMilliseconds = new ArrayList<NumericRange>();
      otherDurationMilliseconds = new ArrayList<NumericRange>();
      screenMonitorUserIds = new ArrayList<String>();
      transcriptDurationMilliseconds = new ArrayList<NumericRange>();
      workitemsStatuses = new ArrayList<WorkitemStatusFilter>();
      socialCountries = new ArrayList<String>();
      socialLanguages = new ArrayList<String>();
      socialChannels = new ArrayList<SocialChannelsEnum>();
      socialSentimentCategory = new ArrayList<SocialSentimentCategoryEnum>();
      socialTopicIds = new ArrayList<String>();
      socialIngestionRuleIds = new ArrayList<String>();
      socialContentType = new ArrayList<SocialContentTypeEnum>();
      socialKeywords = new ArrayList<SocialKeyword>();
      socialClassifications = new ArrayList<SocialClassificationsEnum>();
      filterUsersByManagerIds = new ArrayList<String>();
      slideshowIds = new ArrayList<String>();
      recommendationSources = new ArrayList<RecommendationSourcesEnum>();
      comparisonQueueIds = new ArrayList<String>();
      viewMetrics = new ArrayList<ViewMetricsEnum>();
      timelineCategories = new ArrayList<String>();
      segmentTypes = new ArrayList<SegmentTypesEnum>();
      programIds = new ArrayList<String>();
      categoryIds = new ArrayList<String>();
    }
  }

  
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
   * The assigned user skill ids are used to filter the view
   **/
  public ViewFilter assignedSkillIds(List<String> assignedSkillIds) {
    this.assignedSkillIds = assignedSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assigned user skill ids are used to filter the view")
  @JsonProperty("assignedSkillIds")
  public List<String> getAssignedSkillIds() {
    return assignedSkillIds;
  }
  public void setAssignedSkillIds(List<String> assignedSkillIds) {
    this.assignedSkillIds = assignedSkillIds;
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
   * The assigned user language ids are used to filter the view
   **/
  public ViewFilter assignedLanguageIds(List<String> assignedLanguageIds) {
    this.assignedLanguageIds = assignedLanguageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assigned user language ids are used to filter the view")
  @JsonProperty("assignedLanguageIds")
  public List<String> getAssignedLanguageIds() {
    return assignedLanguageIds;
  }
  public void setAssignedLanguageIds(List<String> assignedLanguageIds) {
    this.assignedLanguageIds = assignedLanguageIds;
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
   * The management unit ids are used to filter the view
   **/
  public ViewFilter managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit ids are used to filter the view")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
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


  /**
   * Filter to indicate if Agent passed assessment or not
   **/
  public ViewFilter isAssessmentPassed(Boolean isAssessmentPassed) {
    this.isAssessmentPassed = isAssessmentPassed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if Agent passed assessment or not")
  @JsonProperty("isAssessmentPassed")
  public Boolean getIsAssessmentPassed() {
    return isAssessmentPassed;
  }
  public void setIsAssessmentPassed(Boolean isAssessmentPassed) {
    this.isAssessmentPassed = isAssessmentPassed;
  }


  /**
   * The list to filter based on Brands (Bot/User/Agent) or End User who initiated the first message in the conversation
   **/
  public ViewFilter conversationInitiators(List<String> conversationInitiators) {
    this.conversationInitiators = conversationInitiators;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list to filter based on Brands (Bot/User/Agent) or End User who initiated the first message in the conversation")
  @JsonProperty("conversationInitiators")
  public List<String> getConversationInitiators() {
    return conversationInitiators;
  }
  public void setConversationInitiators(List<String> conversationInitiators) {
    this.conversationInitiators = conversationInitiators;
  }


  /**
   * Indicates if the customer has participated in an initiated conversation
   **/
  public ViewFilter hasCustomerParticipated(Boolean hasCustomerParticipated) {
    this.hasCustomerParticipated = hasCustomerParticipated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the customer has participated in an initiated conversation")
  @JsonProperty("hasCustomerParticipated")
  public Boolean getHasCustomerParticipated() {
    return hasCustomerParticipated;
  }
  public void setHasCustomerParticipated(Boolean hasCustomerParticipated) {
    this.hasCustomerParticipated = hasCustomerParticipated;
  }


  /**
   * Filter to indicate if interaction was ACD or non-ACD
   **/
  public ViewFilter isAcdInteraction(Boolean isAcdInteraction) {
    this.isAcdInteraction = isAcdInteraction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if interaction was ACD or non-ACD")
  @JsonProperty("isAcdInteraction")
  public Boolean getIsAcdInteraction() {
    return isAcdInteraction;
  }
  public void setIsAcdInteraction(Boolean isAcdInteraction) {
    this.isAcdInteraction = isAcdInteraction;
  }


  /**
   * Filters to indicate if interaction has FAX
   **/
  public ViewFilter hasFax(Boolean hasFax) {
    this.hasFax = hasFax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters to indicate if interaction has FAX")
  @JsonProperty("hasFax")
  public Boolean getHasFax() {
    return hasFax;
  }
  public void setHasFax(Boolean hasFax) {
    this.hasFax = hasFax;
  }


  /**
   * The list of Data Action IDs 
   **/
  public ViewFilter dataActionIds(List<String> dataActionIds) {
    this.dataActionIds = dataActionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Data Action IDs ")
  @JsonProperty("dataActionIds")
  public List<String> getDataActionIds() {
    return dataActionIds;
  }
  public void setDataActionIds(List<String> dataActionIds) {
    this.dataActionIds = dataActionIds;
  }


  /**
   * Deprecated - Please use integrationIds instead
   **/
  public ViewFilter actionCategoryName(String actionCategoryName) {
    this.actionCategoryName = actionCategoryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deprecated - Please use integrationIds instead")
  @JsonProperty("actionCategoryName")
  public String getActionCategoryName() {
    return actionCategoryName;
  }
  public void setActionCategoryName(String actionCategoryName) {
    this.actionCategoryName = actionCategoryName;
  }


  /**
   * The list of integration IDs for Data Action
   **/
  public ViewFilter integrationIds(List<String> integrationIds) {
    this.integrationIds = integrationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of integration IDs for Data Action")
  @JsonProperty("integrationIds")
  public List<String> getIntegrationIds() {
    return integrationIds;
  }
  public void setIntegrationIds(List<String> integrationIds) {
    this.integrationIds = integrationIds;
  }


  /**
   * The list of Response codes for Data Action
   **/
  public ViewFilter responseStatuses(List<String> responseStatuses) {
    this.responseStatuses = responseStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Response codes for Data Action")
  @JsonProperty("responseStatuses")
  public List<String> getResponseStatuses() {
    return responseStatuses;
  }
  public void setResponseStatuses(List<String> responseStatuses) {
    this.responseStatuses = responseStatuses;
  }


  /**
   * Filter to indicate the availability of the dashboard is public or private.
   **/
  public ViewFilter availableDashboard(AvailableDashboardEnum availableDashboard) {
    this.availableDashboard = availableDashboard;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate the availability of the dashboard is public or private.")
  @JsonProperty("availableDashboard")
  public AvailableDashboardEnum getAvailableDashboard() {
    return availableDashboard;
  }
  public void setAvailableDashboard(AvailableDashboardEnum availableDashboard) {
    this.availableDashboard = availableDashboard;
  }


  /**
   * Filter to indicate whether the dashboard is favorite or unfavorite.
   **/
  public ViewFilter favouriteDashboard(Boolean favouriteDashboard) {
    this.favouriteDashboard = favouriteDashboard;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate whether the dashboard is favorite or unfavorite.")
  @JsonProperty("favouriteDashboard")
  public Boolean getFavouriteDashboard() {
    return favouriteDashboard;
  }
  public void setFavouriteDashboard(Boolean favouriteDashboard) {
    this.favouriteDashboard = favouriteDashboard;
  }


  /**
   * Filter to indicate the dashboard owned by the user.
   **/
  public ViewFilter myDashboard(Boolean myDashboard) {
    this.myDashboard = myDashboard;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate the dashboard owned by the user.")
  @JsonProperty("myDashboard")
  public Boolean getMyDashboard() {
    return myDashboard;
  }
  public void setMyDashboard(Boolean myDashboard) {
    this.myDashboard = myDashboard;
  }


  /**
   * The list of agent errors that are related to station
   **/
  public ViewFilter stationErrors(List<String> stationErrors) {
    this.stationErrors = stationErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of agent errors that are related to station")
  @JsonProperty("stationErrors")
  public List<String> getStationErrors() {
    return stationErrors;
  }
  public void setStationErrors(List<String> stationErrors) {
    this.stationErrors = stationErrors;
  }


  /**
   * The canonical contact ids are used to filter the view
   **/
  public ViewFilter canonicalContactIds(List<String> canonicalContactIds) {
    this.canonicalContactIds = canonicalContactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The canonical contact ids are used to filter the view")
  @JsonProperty("canonicalContactIds")
  public List<String> getCanonicalContactIds() {
    return canonicalContactIds;
  }
  public void setCanonicalContactIds(List<String> canonicalContactIds) {
    this.canonicalContactIds = canonicalContactIds;
  }


  /**
   * The list of Alert Rule IDs
   **/
  public ViewFilter alertRuleIds(List<String> alertRuleIds) {
    this.alertRuleIds = alertRuleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Alert Rule IDs")
  @JsonProperty("alertRuleIds")
  public List<String> getAlertRuleIds() {
    return alertRuleIds;
  }
  public void setAlertRuleIds(List<String> alertRuleIds) {
    this.alertRuleIds = alertRuleIds;
  }


  /**
   * The list of Evaluation Form Context IDs
   **/
  public ViewFilter evaluationFormContextIds(List<String> evaluationFormContextIds) {
    this.evaluationFormContextIds = evaluationFormContextIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Evaluation Form Context IDs")
  @JsonProperty("evaluationFormContextIds")
  public List<String> getEvaluationFormContextIds() {
    return evaluationFormContextIds;
  }
  public void setEvaluationFormContextIds(List<String> evaluationFormContextIds) {
    this.evaluationFormContextIds = evaluationFormContextIds;
  }


  /**
   * The evaluation statuses that are used to filter the view
   **/
  public ViewFilter evaluationStatuses(List<EvaluationStatusesEnum> evaluationStatuses) {
    this.evaluationStatuses = evaluationStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluation statuses that are used to filter the view")
  @JsonProperty("evaluationStatuses")
  public List<EvaluationStatusesEnum> getEvaluationStatuses() {
    return evaluationStatuses;
  }
  public void setEvaluationStatuses(List<EvaluationStatusesEnum> evaluationStatuses) {
    this.evaluationStatuses = evaluationStatuses;
  }


  /**
   * The list of Workbin IDs
   **/
  public ViewFilter workbinIds(List<String> workbinIds) {
    this.workbinIds = workbinIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Workbin IDs")
  @JsonProperty("workbinIds")
  public List<String> getWorkbinIds() {
    return workbinIds;
  }
  public void setWorkbinIds(List<String> workbinIds) {
    this.workbinIds = workbinIds;
  }


  /**
   * The list of Worktype IDs
   **/
  public ViewFilter worktypeIds(List<String> worktypeIds) {
    this.worktypeIds = worktypeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Worktype IDs")
  @JsonProperty("worktypeIds")
  public List<String> getWorktypeIds() {
    return worktypeIds;
  }
  public void setWorktypeIds(List<String> worktypeIds) {
    this.worktypeIds = worktypeIds;
  }


  /**
   * The list of Workitem IDs
   **/
  public ViewFilter workitemIds(List<String> workitemIds) {
    this.workitemIds = workitemIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Workitem IDs")
  @JsonProperty("workitemIds")
  public List<String> getWorkitemIds() {
    return workitemIds;
  }
  public void setWorkitemIds(List<String> workitemIds) {
    this.workitemIds = workitemIds;
  }


  /**
   * The list of Workitem Assignee IDs
   **/
  public ViewFilter workitemAssigneeIds(List<String> workitemAssigneeIds) {
    this.workitemAssigneeIds = workitemAssigneeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Workitem Assignee IDs")
  @JsonProperty("workitemAssigneeIds")
  public List<String> getWorkitemAssigneeIds() {
    return workitemAssigneeIds;
  }
  public void setWorkitemAssigneeIds(List<String> workitemAssigneeIds) {
    this.workitemAssigneeIds = workitemAssigneeIds;
  }


  /**
   * The list of Workitem Statuses IDs
   **/
  public ViewFilter workitemStatuses(List<String> workitemStatuses) {
    this.workitemStatuses = workitemStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Workitem Statuses IDs")
  @JsonProperty("workitemStatuses")
  public List<String> getWorkitemStatuses() {
    return workitemStatuses;
  }
  public void setWorkitemStatuses(List<String> workitemStatuses) {
    this.workitemStatuses = workitemStatuses;
  }


  /**
   * Deprecated - Use hasPciData or hasPiiData instead.
   **/
  public ViewFilter isAnalyzedForSensitiveData(Boolean isAnalyzedForSensitiveData) {
    this.isAnalyzedForSensitiveData = isAnalyzedForSensitiveData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deprecated - Use hasPciData or hasPiiData instead.")
  @JsonProperty("isAnalyzedForSensitiveData")
  public Boolean getIsAnalyzedForSensitiveData() {
    return isAnalyzedForSensitiveData;
  }
  public void setIsAnalyzedForSensitiveData(Boolean isAnalyzedForSensitiveData) {
    this.isAnalyzedForSensitiveData = isAnalyzedForSensitiveData;
  }


  /**
   * Deprecated. Use hasPciData or hasPiiData instead.
   **/
  public ViewFilter hasSensitiveData(Boolean hasSensitiveData) {
    this.hasSensitiveData = hasSensitiveData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deprecated. Use hasPciData or hasPiiData instead.")
  @JsonProperty("hasSensitiveData")
  public Boolean getHasSensitiveData() {
    return hasSensitiveData;
  }
  public void setHasSensitiveData(Boolean hasSensitiveData) {
    this.hasSensitiveData = hasSensitiveData;
  }


  /**
   * Filter to indicate the transcript contains Pci data.
   **/
  public ViewFilter hasPciData(Boolean hasPciData) {
    this.hasPciData = hasPciData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate the transcript contains Pci data.")
  @JsonProperty("hasPciData")
  public Boolean getHasPciData() {
    return hasPciData;
  }
  public void setHasPciData(Boolean hasPciData) {
    this.hasPciData = hasPciData;
  }


  /**
   * Filter to indicate the transcript contains Pii data.
   **/
  public ViewFilter hasPiiData(Boolean hasPiiData) {
    this.hasPiiData = hasPiiData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate the transcript contains Pii data.")
  @JsonProperty("hasPiiData")
  public Boolean getHasPiiData() {
    return hasPiiData;
  }
  public void setHasPiiData(Boolean hasPiiData) {
    this.hasPiiData = hasPiiData;
  }


  /**
   * Filter for Sub Path
   **/
  public ViewFilter subPath(String subPath) {
    this.subPath = subPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter for Sub Path")
  @JsonProperty("subPath")
  public String getSubPath() {
    return subPath;
  }
  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  /**
   * The user supplied state value in the view
   **/
  public ViewFilter userState(UserStateEnum userState) {
    this.userState = userState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user supplied state value in the view")
  @JsonProperty("userState")
  public UserStateEnum getUserState() {
    return userState;
  }
  public void setUserState(UserStateEnum userState) {
    this.userState = userState;
  }


  /**
   * Filter to indicate if the customer cleared the conversation.
   **/
  public ViewFilter isClearedByCustomer(Boolean isClearedByCustomer) {
    this.isClearedByCustomer = isClearedByCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the customer cleared the conversation.")
  @JsonProperty("isClearedByCustomer")
  public Boolean getIsClearedByCustomer() {
    return isClearedByCustomer;
  }
  public void setIsClearedByCustomer(Boolean isClearedByCustomer) {
    this.isClearedByCustomer = isClearedByCustomer;
  }


  /**
   * The evaluation assignee ids that are used to filter the view.
   **/
  public ViewFilter evaluationAssigneeIds(List<String> evaluationAssigneeIds) {
    this.evaluationAssigneeIds = evaluationAssigneeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluation assignee ids that are used to filter the view.")
  @JsonProperty("evaluationAssigneeIds")
  public List<String> getEvaluationAssigneeIds() {
    return evaluationAssigneeIds;
  }
  public void setEvaluationAssigneeIds(List<String> evaluationAssigneeIds) {
    this.evaluationAssigneeIds = evaluationAssigneeIds;
  }


  /**
   * Filter to indicate that the user has no assigned evaluation.
   **/
  public ViewFilter evaluationAssigned(Boolean evaluationAssigned) {
    this.evaluationAssigned = evaluationAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate that the user has no assigned evaluation.")
  @JsonProperty("evaluationAssigned")
  public Boolean getEvaluationAssigned() {
    return evaluationAssigned;
  }
  public void setEvaluationAssigned(Boolean evaluationAssigned) {
    this.evaluationAssigned = evaluationAssigned;
  }


  /**
   * The assistant ids that are used to filter the view.
   **/
  public ViewFilter assistantIds(List<String> assistantIds) {
    this.assistantIds = assistantIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assistant ids that are used to filter the view.")
  @JsonProperty("assistantIds")
  public List<String> getAssistantIds() {
    return assistantIds;
  }
  public void setAssistantIds(List<String> assistantIds) {
    this.assistantIds = assistantIds;
  }


  /**
   * The knowledge base ids that are used to filter the view.
   **/
  public ViewFilter knowledgeBaseIds(List<String> knowledgeBaseIds) {
    this.knowledgeBaseIds = knowledgeBaseIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge base ids that are used to filter the view.")
  @JsonProperty("knowledgeBaseIds")
  public List<String> getKnowledgeBaseIds() {
    return knowledgeBaseIds;
  }
  public void setKnowledgeBaseIds(List<String> knowledgeBaseIds) {
    this.knowledgeBaseIds = knowledgeBaseIds;
  }


  /**
   * Filter to indicate if the interactions are parked.
   **/
  public ViewFilter isParked(Boolean isParked) {
    this.isParked = isParked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the interactions are parked.")
  @JsonProperty("isParked")
  public Boolean getIsParked() {
    return isParked;
  }
  public void setIsParked(Boolean isParked) {
    this.isParked = isParked;
  }


  /**
   * The agentEmpathyScore is used to filter the view
   **/
  public ViewFilter agentEmpathyScore(NumericRange agentEmpathyScore) {
    this.agentEmpathyScore = agentEmpathyScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agentEmpathyScore is used to filter the view")
  @JsonProperty("agentEmpathyScore")
  public NumericRange getAgentEmpathyScore() {
    return agentEmpathyScore;
  }
  public void setAgentEmpathyScore(NumericRange agentEmpathyScore) {
    this.agentEmpathyScore = agentEmpathyScore;
  }


  /**
   * The surveyTypes is used to filter the view
   **/
  public ViewFilter surveyTypes(List<SurveyTypesEnum> surveyTypes) {
    this.surveyTypes = surveyTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The surveyTypes is used to filter the view")
  @JsonProperty("surveyTypes")
  public List<SurveyTypesEnum> getSurveyTypes() {
    return surveyTypes;
  }
  public void setSurveyTypes(List<SurveyTypesEnum> surveyTypes) {
    this.surveyTypes = surveyTypes;
  }


  /**
   * The list of Survey Response Status
   **/
  public ViewFilter surveyResponseStatuses(List<SurveyResponseStatusesEnum> surveyResponseStatuses) {
    this.surveyResponseStatuses = surveyResponseStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Survey Response Status")
  @JsonProperty("surveyResponseStatuses")
  public List<SurveyResponseStatusesEnum> getSurveyResponseStatuses() {
    return surveyResponseStatuses;
  }
  public void setSurveyResponseStatuses(List<SurveyResponseStatusesEnum> surveyResponseStatuses) {
    this.surveyResponseStatuses = surveyResponseStatuses;
  }


  /**
   * The botFlowTypes is used to filter the view
   **/
  public ViewFilter botFlowTypes(List<BotFlowTypesEnum> botFlowTypes) {
    this.botFlowTypes = botFlowTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The botFlowTypes is used to filter the view")
  @JsonProperty("botFlowTypes")
  public List<BotFlowTypesEnum> getBotFlowTypes() {
    return botFlowTypes;
  }
  public void setBotFlowTypes(List<BotFlowTypesEnum> botFlowTypes) {
    this.botFlowTypes = botFlowTypes;
  }


  /**
   * The agent talk durations in milliseconds used to filter the view
   **/
  public ViewFilter agentTalkDurationMilliseconds(List<NumericRange> agentTalkDurationMilliseconds) {
    this.agentTalkDurationMilliseconds = agentTalkDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent talk durations in milliseconds used to filter the view")
  @JsonProperty("agentTalkDurationMilliseconds")
  public List<NumericRange> getAgentTalkDurationMilliseconds() {
    return agentTalkDurationMilliseconds;
  }
  public void setAgentTalkDurationMilliseconds(List<NumericRange> agentTalkDurationMilliseconds) {
    this.agentTalkDurationMilliseconds = agentTalkDurationMilliseconds;
  }


  /**
   * The customer talk durations in milliseconds used to filter the view
   **/
  public ViewFilter customerTalkDurationMilliseconds(List<NumericRange> customerTalkDurationMilliseconds) {
    this.customerTalkDurationMilliseconds = customerTalkDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer talk durations in milliseconds used to filter the view")
  @JsonProperty("customerTalkDurationMilliseconds")
  public List<NumericRange> getCustomerTalkDurationMilliseconds() {
    return customerTalkDurationMilliseconds;
  }
  public void setCustomerTalkDurationMilliseconds(List<NumericRange> customerTalkDurationMilliseconds) {
    this.customerTalkDurationMilliseconds = customerTalkDurationMilliseconds;
  }


  /**
   * The overtalk durations in milliseconds used to filter the view
   **/
  public ViewFilter overtalkDurationMilliseconds(List<NumericRange> overtalkDurationMilliseconds) {
    this.overtalkDurationMilliseconds = overtalkDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The overtalk durations in milliseconds used to filter the view")
  @JsonProperty("overtalkDurationMilliseconds")
  public List<NumericRange> getOvertalkDurationMilliseconds() {
    return overtalkDurationMilliseconds;
  }
  public void setOvertalkDurationMilliseconds(List<NumericRange> overtalkDurationMilliseconds) {
    this.overtalkDurationMilliseconds = overtalkDurationMilliseconds;
  }


  /**
   * The silence durations in milliseconds used to filter the view
   **/
  public ViewFilter silenceDurationMilliseconds(List<NumericRange> silenceDurationMilliseconds) {
    this.silenceDurationMilliseconds = silenceDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The silence durations in milliseconds used to filter the view")
  @JsonProperty("silenceDurationMilliseconds")
  public List<NumericRange> getSilenceDurationMilliseconds() {
    return silenceDurationMilliseconds;
  }
  public void setSilenceDurationMilliseconds(List<NumericRange> silenceDurationMilliseconds) {
    this.silenceDurationMilliseconds = silenceDurationMilliseconds;
  }


  /**
   * The acd durations in milliseconds used to filter the view
   **/
  public ViewFilter acdDurationMilliseconds(List<NumericRange> acdDurationMilliseconds) {
    this.acdDurationMilliseconds = acdDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The acd durations in milliseconds used to filter the view")
  @JsonProperty("acdDurationMilliseconds")
  public List<NumericRange> getAcdDurationMilliseconds() {
    return acdDurationMilliseconds;
  }
  public void setAcdDurationMilliseconds(List<NumericRange> acdDurationMilliseconds) {
    this.acdDurationMilliseconds = acdDurationMilliseconds;
  }


  /**
   * The ivr durations in milliseconds used to filter the view
   **/
  public ViewFilter ivrDurationMilliseconds(List<NumericRange> ivrDurationMilliseconds) {
    this.ivrDurationMilliseconds = ivrDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ivr durations in milliseconds used to filter the view")
  @JsonProperty("ivrDurationMilliseconds")
  public List<NumericRange> getIvrDurationMilliseconds() {
    return ivrDurationMilliseconds;
  }
  public void setIvrDurationMilliseconds(List<NumericRange> ivrDurationMilliseconds) {
    this.ivrDurationMilliseconds = ivrDurationMilliseconds;
  }


  /**
   * The other (hold/music) durations in milliseconds used to filter the view
   **/
  public ViewFilter otherDurationMilliseconds(List<NumericRange> otherDurationMilliseconds) {
    this.otherDurationMilliseconds = otherDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The other (hold/music) durations in milliseconds used to filter the view")
  @JsonProperty("otherDurationMilliseconds")
  public List<NumericRange> getOtherDurationMilliseconds() {
    return otherDurationMilliseconds;
  }
  public void setOtherDurationMilliseconds(List<NumericRange> otherDurationMilliseconds) {
    this.otherDurationMilliseconds = otherDurationMilliseconds;
  }


  /**
   * The agent talk percentage used to filter the view
   **/
  public ViewFilter agentTalkPercentage(NumericRange agentTalkPercentage) {
    this.agentTalkPercentage = agentTalkPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent talk percentage used to filter the view")
  @JsonProperty("agentTalkPercentage")
  public NumericRange getAgentTalkPercentage() {
    return agentTalkPercentage;
  }
  public void setAgentTalkPercentage(NumericRange agentTalkPercentage) {
    this.agentTalkPercentage = agentTalkPercentage;
  }


  /**
   * The customer talk percentage used to filter the view
   **/
  public ViewFilter customerTalkPercentage(NumericRange customerTalkPercentage) {
    this.customerTalkPercentage = customerTalkPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer talk percentage used to filter the view")
  @JsonProperty("customerTalkPercentage")
  public NumericRange getCustomerTalkPercentage() {
    return customerTalkPercentage;
  }
  public void setCustomerTalkPercentage(NumericRange customerTalkPercentage) {
    this.customerTalkPercentage = customerTalkPercentage;
  }


  /**
   * The overtalk percentage used to filter the view
   **/
  public ViewFilter overtalkPercentage(NumericRange overtalkPercentage) {
    this.overtalkPercentage = overtalkPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The overtalk percentage used to filter the view")
  @JsonProperty("overtalkPercentage")
  public NumericRange getOvertalkPercentage() {
    return overtalkPercentage;
  }
  public void setOvertalkPercentage(NumericRange overtalkPercentage) {
    this.overtalkPercentage = overtalkPercentage;
  }


  /**
   * The silence percentage used to filter the view
   **/
  public ViewFilter silencePercentage(NumericRange silencePercentage) {
    this.silencePercentage = silencePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The silence percentage used to filter the view")
  @JsonProperty("silencePercentage")
  public NumericRange getSilencePercentage() {
    return silencePercentage;
  }
  public void setSilencePercentage(NumericRange silencePercentage) {
    this.silencePercentage = silencePercentage;
  }


  /**
   * The acd percentage used to filter the view
   **/
  public ViewFilter acdPercentage(NumericRange acdPercentage) {
    this.acdPercentage = acdPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The acd percentage used to filter the view")
  @JsonProperty("acdPercentage")
  public NumericRange getAcdPercentage() {
    return acdPercentage;
  }
  public void setAcdPercentage(NumericRange acdPercentage) {
    this.acdPercentage = acdPercentage;
  }


  /**
   * The ivr percentage used to filter the view
   **/
  public ViewFilter ivrPercentage(NumericRange ivrPercentage) {
    this.ivrPercentage = ivrPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ivr percentage used to filter the view")
  @JsonProperty("ivrPercentage")
  public NumericRange getIvrPercentage() {
    return ivrPercentage;
  }
  public void setIvrPercentage(NumericRange ivrPercentage) {
    this.ivrPercentage = ivrPercentage;
  }


  /**
   * The other (hold/music percentage used to filter the view
   **/
  public ViewFilter otherPercentage(NumericRange otherPercentage) {
    this.otherPercentage = otherPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The other (hold/music percentage used to filter the view")
  @JsonProperty("otherPercentage")
  public NumericRange getOtherPercentage() {
    return otherPercentage;
  }
  public void setOtherPercentage(NumericRange otherPercentage) {
    this.otherPercentage = otherPercentage;
  }


  /**
   * The overtalk instance range used to filter the view
   **/
  public ViewFilter overtalkInstances(NumericRange overtalkInstances) {
    this.overtalkInstances = overtalkInstances;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The overtalk instance range used to filter the view")
  @JsonProperty("overtalkInstances")
  public NumericRange getOvertalkInstances() {
    return overtalkInstances;
  }
  public void setOvertalkInstances(NumericRange overtalkInstances) {
    this.overtalkInstances = overtalkInstances;
  }


  /**
   * Filter to indicate if the screen is recorded
   **/
  public ViewFilter isScreenRecorded(Boolean isScreenRecorded) {
    this.isScreenRecorded = isScreenRecorded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the screen is recorded")
  @JsonProperty("isScreenRecorded")
  public Boolean getIsScreenRecorded() {
    return isScreenRecorded;
  }
  public void setIsScreenRecorded(Boolean isScreenRecorded) {
    this.isScreenRecorded = isScreenRecorded;
  }


  /**
   * The list of Screen Monitor User Ids
   **/
  public ViewFilter screenMonitorUserIds(List<String> screenMonitorUserIds) {
    this.screenMonitorUserIds = screenMonitorUserIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Screen Monitor User Ids")
  @JsonProperty("screenMonitorUserIds")
  public List<String> getScreenMonitorUserIds() {
    return screenMonitorUserIds;
  }
  public void setScreenMonitorUserIds(List<String> screenMonitorUserIds) {
    this.screenMonitorUserIds = screenMonitorUserIds;
  }


  /**
   * The state of dashboard being filtered
   **/
  public ViewFilter dashboardState(DashboardStateEnum dashboardState) {
    this.dashboardState = dashboardState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of dashboard being filtered")
  @JsonProperty("dashboardState")
  public DashboardStateEnum getDashboardState() {
    return dashboardState;
  }
  public void setDashboardState(DashboardStateEnum dashboardState) {
    this.dashboardState = dashboardState;
  }


  /**
   * The type of dashboard being filtered
   **/
  public ViewFilter dashboardType(DashboardTypeEnum dashboardType) {
    this.dashboardType = dashboardType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of dashboard being filtered")
  @JsonProperty("dashboardType")
  public DashboardTypeEnum getDashboardType() {
    return dashboardType;
  }
  public void setDashboardType(DashboardTypeEnum dashboardType) {
    this.dashboardType = dashboardType;
  }


  /**
   * The type of dashboard access being filtered
   **/
  public ViewFilter dashboardAccessFilter(DashboardAccessFilterEnum dashboardAccessFilter) {
    this.dashboardAccessFilter = dashboardAccessFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of dashboard access being filtered")
  @JsonProperty("dashboardAccessFilter")
  public DashboardAccessFilterEnum getDashboardAccessFilter() {
    return dashboardAccessFilter;
  }
  public void setDashboardAccessFilter(DashboardAccessFilterEnum dashboardAccessFilter) {
    this.dashboardAccessFilter = dashboardAccessFilter;
  }


  /**
   * The transcript durations in milliseconds used to filter the view
   **/
  public ViewFilter transcriptDurationMilliseconds(List<NumericRange> transcriptDurationMilliseconds) {
    this.transcriptDurationMilliseconds = transcriptDurationMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The transcript durations in milliseconds used to filter the view")
  @JsonProperty("transcriptDurationMilliseconds")
  public List<NumericRange> getTranscriptDurationMilliseconds() {
    return transcriptDurationMilliseconds;
  }
  public void setTranscriptDurationMilliseconds(List<NumericRange> transcriptDurationMilliseconds) {
    this.transcriptDurationMilliseconds = transcriptDurationMilliseconds;
  }


  /**
   * The list of workitem status with worktype
   **/
  public ViewFilter workitemsStatuses(List<WorkitemStatusFilter> workitemsStatuses) {
    this.workitemsStatuses = workitemsStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of workitem status with worktype")
  @JsonProperty("workitemsStatuses")
  public List<WorkitemStatusFilter> getWorkitemsStatuses() {
    return workitemsStatuses;
  }
  public void setWorkitemsStatuses(List<WorkitemStatusFilter> workitemsStatuses) {
    this.workitemsStatuses = workitemsStatuses;
  }


  /**
   * List of countries for social filtering
   **/
  public ViewFilter socialCountries(List<String> socialCountries) {
    this.socialCountries = socialCountries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of countries for social filtering")
  @JsonProperty("socialCountries")
  public List<String> getSocialCountries() {
    return socialCountries;
  }
  public void setSocialCountries(List<String> socialCountries) {
    this.socialCountries = socialCountries;
  }


  /**
   * List of languages for social filtering
   **/
  public ViewFilter socialLanguages(List<String> socialLanguages) {
    this.socialLanguages = socialLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of languages for social filtering")
  @JsonProperty("socialLanguages")
  public List<String> getSocialLanguages() {
    return socialLanguages;
  }
  public void setSocialLanguages(List<String> socialLanguages) {
    this.socialLanguages = socialLanguages;
  }


  /**
   * List of channels for social filtering
   **/
  public ViewFilter socialChannels(List<SocialChannelsEnum> socialChannels) {
    this.socialChannels = socialChannels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of channels for social filtering")
  @JsonProperty("socialChannels")
  public List<SocialChannelsEnum> getSocialChannels() {
    return socialChannels;
  }
  public void setSocialChannels(List<SocialChannelsEnum> socialChannels) {
    this.socialChannels = socialChannels;
  }


  /**
   * The sentiment of the social post
   **/
  public ViewFilter socialSentimentCategory(List<SocialSentimentCategoryEnum> socialSentimentCategory) {
    this.socialSentimentCategory = socialSentimentCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sentiment of the social post")
  @JsonProperty("socialSentimentCategory")
  public List<SocialSentimentCategoryEnum> getSocialSentimentCategory() {
    return socialSentimentCategory;
  }
  public void setSocialSentimentCategory(List<SocialSentimentCategoryEnum> socialSentimentCategory) {
    this.socialSentimentCategory = socialSentimentCategory;
  }


  /**
   * The list of topicIds for social filtering
   **/
  public ViewFilter socialTopicIds(List<String> socialTopicIds) {
    this.socialTopicIds = socialTopicIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of topicIds for social filtering")
  @JsonProperty("socialTopicIds")
  public List<String> getSocialTopicIds() {
    return socialTopicIds;
  }
  public void setSocialTopicIds(List<String> socialTopicIds) {
    this.socialTopicIds = socialTopicIds;
  }


  /**
   * The list of ingestion ruleIds for social filtering
   **/
  public ViewFilter socialIngestionRuleIds(List<String> socialIngestionRuleIds) {
    this.socialIngestionRuleIds = socialIngestionRuleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of ingestion ruleIds for social filtering")
  @JsonProperty("socialIngestionRuleIds")
  public List<String> getSocialIngestionRuleIds() {
    return socialIngestionRuleIds;
  }
  public void setSocialIngestionRuleIds(List<String> socialIngestionRuleIds) {
    this.socialIngestionRuleIds = socialIngestionRuleIds;
  }


  /**
   * Filter to indicate if the post has created a conversation
   **/
  public ViewFilter socialConversationCreated(Boolean socialConversationCreated) {
    this.socialConversationCreated = socialConversationCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the post has created a conversation")
  @JsonProperty("socialConversationCreated")
  public Boolean getSocialConversationCreated() {
    return socialConversationCreated;
  }
  public void setSocialConversationCreated(Boolean socialConversationCreated) {
    this.socialConversationCreated = socialConversationCreated;
  }


  /**
   * The list of content Type for social filtering
   **/
  public ViewFilter socialContentType(List<SocialContentTypeEnum> socialContentType) {
    this.socialContentType = socialContentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of content Type for social filtering")
  @JsonProperty("socialContentType")
  public List<SocialContentTypeEnum> getSocialContentType() {
    return socialContentType;
  }
  public void setSocialContentType(List<SocialContentTypeEnum> socialContentType) {
    this.socialContentType = socialContentType;
  }


  /**
   * The list of keywords for social filtering
   **/
  public ViewFilter socialKeywords(List<SocialKeyword> socialKeywords) {
    this.socialKeywords = socialKeywords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of keywords for social filtering")
  @JsonProperty("socialKeywords")
  public List<SocialKeyword> getSocialKeywords() {
    return socialKeywords;
  }
  public void setSocialKeywords(List<SocialKeyword> socialKeywords) {
    this.socialKeywords = socialKeywords;
  }


  /**
   * Filter to indicate if the post is escalated
   **/
  public ViewFilter socialPostEscalated(Boolean socialPostEscalated) {
    this.socialPostEscalated = socialPostEscalated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the post is escalated")
  @JsonProperty("socialPostEscalated")
  public Boolean getSocialPostEscalated() {
    return socialPostEscalated;
  }
  public void setSocialPostEscalated(Boolean socialPostEscalated) {
    this.socialPostEscalated = socialPostEscalated;
  }


  /**
   * Indicates if a social message was public or private
   **/
  public ViewFilter socialClassifications(List<SocialClassificationsEnum> socialClassifications) {
    this.socialClassifications = socialClassifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if a social message was public or private")
  @JsonProperty("socialClassifications")
  public List<SocialClassificationsEnum> getSocialClassifications() {
    return socialClassifications;
  }
  public void setSocialClassifications(List<SocialClassificationsEnum> socialClassifications) {
    this.socialClassifications = socialClassifications;
  }


  /**
   * The manager ids used to fetch associated users for the view
   **/
  public ViewFilter filterUsersByManagerIds(List<String> filterUsersByManagerIds) {
    this.filterUsersByManagerIds = filterUsersByManagerIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The manager ids used to fetch associated users for the view")
  @JsonProperty("filterUsersByManagerIds")
  public List<String> getFilterUsersByManagerIds() {
    return filterUsersByManagerIds;
  }
  public void setFilterUsersByManagerIds(List<String> filterUsersByManagerIds) {
    this.filterUsersByManagerIds = filterUsersByManagerIds;
  }


  /**
   * List of Dashboard slideshowIds to be filtered
   **/
  public ViewFilter slideshowIds(List<String> slideshowIds) {
    this.slideshowIds = slideshowIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Dashboard slideshowIds to be filtered")
  @JsonProperty("slideshowIds")
  public List<String> getSlideshowIds() {
    return slideshowIds;
  }
  public void setSlideshowIds(List<String> slideshowIds) {
    this.slideshowIds = slideshowIds;
  }


  /**
   * Filter to indicate if the conversation has conference
   **/
  public ViewFilter conferenced(Boolean conferenced) {
    this.conferenced = conferenced;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the conversation has conference")
  @JsonProperty("conferenced")
  public Boolean getConferenced() {
    return conferenced;
  }
  public void setConferenced(Boolean conferenced) {
    this.conferenced = conferenced;
  }


  /**
   * Filter to indicate if the conversation has video
   **/
  public ViewFilter video(Boolean video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the conversation has video")
  @JsonProperty("video")
  public Boolean getVideo() {
    return video;
  }
  public void setVideo(Boolean video) {
    this.video = video;
  }


  /**
   * Filter to indicate if the conversation has linked interaction
   **/
  public ViewFilter linkedInteraction(Boolean linkedInteraction) {
    this.linkedInteraction = linkedInteraction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate if the conversation has linked interaction")
  @JsonProperty("linkedInteraction")
  public Boolean getLinkedInteraction() {
    return linkedInteraction;
  }
  public void setLinkedInteraction(Boolean linkedInteraction) {
    this.linkedInteraction = linkedInteraction;
  }


  /**
   * List of recommendation sources for filtering recommendation details pane
   **/
  public ViewFilter recommendationSources(List<RecommendationSourcesEnum> recommendationSources) {
    this.recommendationSources = recommendationSources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of recommendation sources for filtering recommendation details pane")
  @JsonProperty("recommendationSources")
  public List<RecommendationSourcesEnum> getRecommendationSources() {
    return recommendationSources;
  }
  public void setRecommendationSources(List<RecommendationSourcesEnum> recommendationSources) {
    this.recommendationSources = recommendationSources;
  }


  /**
   * Sets the role when viewing agent evaluations
   **/
  public ViewFilter evaluationRole(EvaluationRoleEnum evaluationRole) {
    this.evaluationRole = evaluationRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets the role when viewing agent evaluations")
  @JsonProperty("evaluationRole")
  public EvaluationRoleEnum getEvaluationRole() {
    return evaluationRole;
  }
  public void setEvaluationRole(EvaluationRoleEnum evaluationRole) {
    this.evaluationRole = evaluationRole;
  }


  /**
   * The queue ids are used to for comparison to the primary queue filter in reporting
   **/
  public ViewFilter comparisonQueueIds(List<String> comparisonQueueIds) {
    this.comparisonQueueIds = comparisonQueueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ids are used to for comparison to the primary queue filter in reporting")
  @JsonProperty("comparisonQueueIds")
  public List<String> getComparisonQueueIds() {
    return comparisonQueueIds;
  }
  public void setComparisonQueueIds(List<String> comparisonQueueIds) {
    this.comparisonQueueIds = comparisonQueueIds;
  }


  /**
   * A list of metrics selected for the view
   **/
  public ViewFilter viewMetrics(List<ViewMetricsEnum> viewMetrics) {
    this.viewMetrics = viewMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of metrics selected for the view")
  @JsonProperty("viewMetrics")
  public List<ViewMetricsEnum> getViewMetrics() {
    return viewMetrics;
  }
  public void setViewMetrics(List<ViewMetricsEnum> viewMetrics) {
    this.viewMetrics = viewMetrics;
  }


  /**
   * A list of timeline categories
   **/
  public ViewFilter timelineCategories(List<String> timelineCategories) {
    this.timelineCategories = timelineCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of timeline categories")
  @JsonProperty("timelineCategories")
  public List<String> getTimelineCategories() {
    return timelineCategories;
  }
  public void setTimelineCategories(List<String> timelineCategories) {
    this.timelineCategories = timelineCategories;
  }


  /**
   * Filter to indicate for acw state
   **/
  public ViewFilter acw(Boolean acw) {
    this.acw = acw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to indicate for acw state")
  @JsonProperty("acw")
  public Boolean getAcw() {
    return acw;
  }
  public void setAcw(Boolean acw) {
    this.acw = acw;
  }


  /**
   * A list of filtered segment types
   **/
  public ViewFilter segmentTypes(List<SegmentTypesEnum> segmentTypes) {
    this.segmentTypes = segmentTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of filtered segment types")
  @JsonProperty("segmentTypes")
  public List<SegmentTypesEnum> getSegmentTypes() {
    return segmentTypes;
  }
  public void setSegmentTypes(List<SegmentTypesEnum> segmentTypes) {
    this.segmentTypes = segmentTypes;
  }


  /**
   * A list of program ids for filtering
   **/
  public ViewFilter programIds(List<String> programIds) {
    this.programIds = programIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of program ids for filtering")
  @JsonProperty("programIds")
  public List<String> getProgramIds() {
    return programIds;
  }
  public void setProgramIds(List<String> programIds) {
    this.programIds = programIds;
  }


  /**
   * A list of category ids for filtering
   **/
  public ViewFilter categoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of category ids for filtering")
  @JsonProperty("categoryIds")
  public List<String> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
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
            Objects.equals(this.assignedSkillIds, viewFilter.assignedSkillIds) &&
            Objects.equals(this.skillGroups, viewFilter.skillGroups) &&
            Objects.equals(this.languageIds, viewFilter.languageIds) &&
            Objects.equals(this.assignedLanguageIds, viewFilter.assignedLanguageIds) &&
            Objects.equals(this.languageGroups, viewFilter.languageGroups) &&
            Objects.equals(this.directions, viewFilter.directions) &&
            Objects.equals(this.originatingDirections, viewFilter.originatingDirections) &&
            Objects.equals(this.wrapUpCodes, viewFilter.wrapUpCodes) &&
            Objects.equals(this.dnisList, viewFilter.dnisList) &&
            Objects.equals(this.sessionDnisList, viewFilter.sessionDnisList) &&
            Objects.equals(this.filterQueuesByUserIds, viewFilter.filterQueuesByUserIds) &&
            Objects.equals(this.filterUsersByQueueIds, viewFilter.filterUsersByQueueIds) &&
            Objects.equals(this.userIds, viewFilter.userIds) &&
            Objects.equals(this.managementUnitIds, viewFilter.managementUnitIds) &&
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
            Objects.equals(this.flowMilestoneIds, viewFilter.flowMilestoneIds) &&
            Objects.equals(this.isAssessmentPassed, viewFilter.isAssessmentPassed) &&
            Objects.equals(this.conversationInitiators, viewFilter.conversationInitiators) &&
            Objects.equals(this.hasCustomerParticipated, viewFilter.hasCustomerParticipated) &&
            Objects.equals(this.isAcdInteraction, viewFilter.isAcdInteraction) &&
            Objects.equals(this.hasFax, viewFilter.hasFax) &&
            Objects.equals(this.dataActionIds, viewFilter.dataActionIds) &&
            Objects.equals(this.actionCategoryName, viewFilter.actionCategoryName) &&
            Objects.equals(this.integrationIds, viewFilter.integrationIds) &&
            Objects.equals(this.responseStatuses, viewFilter.responseStatuses) &&
            Objects.equals(this.availableDashboard, viewFilter.availableDashboard) &&
            Objects.equals(this.favouriteDashboard, viewFilter.favouriteDashboard) &&
            Objects.equals(this.myDashboard, viewFilter.myDashboard) &&
            Objects.equals(this.stationErrors, viewFilter.stationErrors) &&
            Objects.equals(this.canonicalContactIds, viewFilter.canonicalContactIds) &&
            Objects.equals(this.alertRuleIds, viewFilter.alertRuleIds) &&
            Objects.equals(this.evaluationFormContextIds, viewFilter.evaluationFormContextIds) &&
            Objects.equals(this.evaluationStatuses, viewFilter.evaluationStatuses) &&
            Objects.equals(this.workbinIds, viewFilter.workbinIds) &&
            Objects.equals(this.worktypeIds, viewFilter.worktypeIds) &&
            Objects.equals(this.workitemIds, viewFilter.workitemIds) &&
            Objects.equals(this.workitemAssigneeIds, viewFilter.workitemAssigneeIds) &&
            Objects.equals(this.workitemStatuses, viewFilter.workitemStatuses) &&
            Objects.equals(this.isAnalyzedForSensitiveData, viewFilter.isAnalyzedForSensitiveData) &&
            Objects.equals(this.hasSensitiveData, viewFilter.hasSensitiveData) &&
            Objects.equals(this.hasPciData, viewFilter.hasPciData) &&
            Objects.equals(this.hasPiiData, viewFilter.hasPiiData) &&
            Objects.equals(this.subPath, viewFilter.subPath) &&
            Objects.equals(this.userState, viewFilter.userState) &&
            Objects.equals(this.isClearedByCustomer, viewFilter.isClearedByCustomer) &&
            Objects.equals(this.evaluationAssigneeIds, viewFilter.evaluationAssigneeIds) &&
            Objects.equals(this.evaluationAssigned, viewFilter.evaluationAssigned) &&
            Objects.equals(this.assistantIds, viewFilter.assistantIds) &&
            Objects.equals(this.knowledgeBaseIds, viewFilter.knowledgeBaseIds) &&
            Objects.equals(this.isParked, viewFilter.isParked) &&
            Objects.equals(this.agentEmpathyScore, viewFilter.agentEmpathyScore) &&
            Objects.equals(this.surveyTypes, viewFilter.surveyTypes) &&
            Objects.equals(this.surveyResponseStatuses, viewFilter.surveyResponseStatuses) &&
            Objects.equals(this.botFlowTypes, viewFilter.botFlowTypes) &&
            Objects.equals(this.agentTalkDurationMilliseconds, viewFilter.agentTalkDurationMilliseconds) &&
            Objects.equals(this.customerTalkDurationMilliseconds, viewFilter.customerTalkDurationMilliseconds) &&
            Objects.equals(this.overtalkDurationMilliseconds, viewFilter.overtalkDurationMilliseconds) &&
            Objects.equals(this.silenceDurationMilliseconds, viewFilter.silenceDurationMilliseconds) &&
            Objects.equals(this.acdDurationMilliseconds, viewFilter.acdDurationMilliseconds) &&
            Objects.equals(this.ivrDurationMilliseconds, viewFilter.ivrDurationMilliseconds) &&
            Objects.equals(this.otherDurationMilliseconds, viewFilter.otherDurationMilliseconds) &&
            Objects.equals(this.agentTalkPercentage, viewFilter.agentTalkPercentage) &&
            Objects.equals(this.customerTalkPercentage, viewFilter.customerTalkPercentage) &&
            Objects.equals(this.overtalkPercentage, viewFilter.overtalkPercentage) &&
            Objects.equals(this.silencePercentage, viewFilter.silencePercentage) &&
            Objects.equals(this.acdPercentage, viewFilter.acdPercentage) &&
            Objects.equals(this.ivrPercentage, viewFilter.ivrPercentage) &&
            Objects.equals(this.otherPercentage, viewFilter.otherPercentage) &&
            Objects.equals(this.overtalkInstances, viewFilter.overtalkInstances) &&
            Objects.equals(this.isScreenRecorded, viewFilter.isScreenRecorded) &&
            Objects.equals(this.screenMonitorUserIds, viewFilter.screenMonitorUserIds) &&
            Objects.equals(this.dashboardState, viewFilter.dashboardState) &&
            Objects.equals(this.dashboardType, viewFilter.dashboardType) &&
            Objects.equals(this.dashboardAccessFilter, viewFilter.dashboardAccessFilter) &&
            Objects.equals(this.transcriptDurationMilliseconds, viewFilter.transcriptDurationMilliseconds) &&
            Objects.equals(this.workitemsStatuses, viewFilter.workitemsStatuses) &&
            Objects.equals(this.socialCountries, viewFilter.socialCountries) &&
            Objects.equals(this.socialLanguages, viewFilter.socialLanguages) &&
            Objects.equals(this.socialChannels, viewFilter.socialChannels) &&
            Objects.equals(this.socialSentimentCategory, viewFilter.socialSentimentCategory) &&
            Objects.equals(this.socialTopicIds, viewFilter.socialTopicIds) &&
            Objects.equals(this.socialIngestionRuleIds, viewFilter.socialIngestionRuleIds) &&
            Objects.equals(this.socialConversationCreated, viewFilter.socialConversationCreated) &&
            Objects.equals(this.socialContentType, viewFilter.socialContentType) &&
            Objects.equals(this.socialKeywords, viewFilter.socialKeywords) &&
            Objects.equals(this.socialPostEscalated, viewFilter.socialPostEscalated) &&
            Objects.equals(this.socialClassifications, viewFilter.socialClassifications) &&
            Objects.equals(this.filterUsersByManagerIds, viewFilter.filterUsersByManagerIds) &&
            Objects.equals(this.slideshowIds, viewFilter.slideshowIds) &&
            Objects.equals(this.conferenced, viewFilter.conferenced) &&
            Objects.equals(this.video, viewFilter.video) &&
            Objects.equals(this.linkedInteraction, viewFilter.linkedInteraction) &&
            Objects.equals(this.recommendationSources, viewFilter.recommendationSources) &&
            Objects.equals(this.evaluationRole, viewFilter.evaluationRole) &&
            Objects.equals(this.comparisonQueueIds, viewFilter.comparisonQueueIds) &&
            Objects.equals(this.viewMetrics, viewFilter.viewMetrics) &&
            Objects.equals(this.timelineCategories, viewFilter.timelineCategories) &&
            Objects.equals(this.acw, viewFilter.acw) &&
            Objects.equals(this.segmentTypes, viewFilter.segmentTypes) &&
            Objects.equals(this.programIds, viewFilter.programIds) &&
            Objects.equals(this.categoryIds, viewFilter.categoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaTypes, queueIds, skillIds, assignedSkillIds, skillGroups, languageIds, assignedLanguageIds, languageGroups, directions, originatingDirections, wrapUpCodes, dnisList, sessionDnisList, filterQueuesByUserIds, filterUsersByQueueIds, userIds, managementUnitIds, addressTos, addressFroms, outboundCampaignIds, outboundContactListIds, contactIds, externalContactIds, externalOrgIds, aniList, durationsMilliseconds, acdDurationsMilliseconds, talkDurationsMilliseconds, acwDurationsMilliseconds, handleDurationsMilliseconds, holdDurationsMilliseconds, abandonDurationsMilliseconds, evaluationScore, evaluationCriticalScore, evaluationFormIds, evaluatedAgentIds, evaluatorIds, transferred, abandoned, answered, messageTypes, divisionIds, surveyFormIds, surveyTotalScore, surveyNpsScore, mos, surveyQuestionGroupScore, surveyPromoterScore, surveyFormContextIds, conversationIds, sipCallIds, isEnded, isSurveyed, surveyScores, promoterScores, isCampaign, surveyStatuses, conversationProperties, isBlindTransferred, isConsulted, isConsultTransferred, remoteParticipants, flowIds, flowOutcomeIds, flowOutcomeValues, flowDestinationTypes, flowDisconnectReasons, flowTypes, flowEntryTypes, flowEntryReasons, flowVersions, groupIds, hasJourneyCustomerId, hasJourneyActionMapId, hasJourneyVisitId, hasMedia, roleIds, reportsTos, locationIds, flowOutTypes, providerList, callbackNumberList, callbackInterval, usedRoutingTypes, requestedRoutingTypes, hasAgentAssistId, transcripts, transcriptLanguages, participantPurposes, showFirstQueue, teamIds, filterUsersByTeamIds, journeyActionMapIds, journeyOutcomeIds, journeySegmentIds, journeyActionMapTypes, developmentRoleList, developmentTypeList, developmentStatusList, developmentModuleIds, developmentActivityOverdue, customerSentimentScore, customerSentimentTrend, flowTransferTargets, developmentName, topicIds, externalTags, isNotResponding, isAuthenticated, botIds, botVersions, botMessageTypes, botProviderList, botProductList, botRecognitionFailureReasonList, botIntentList, botFinalIntentList, botSlotList, botResultList, blockedReasons, isRecorded, hasEvaluation, hasScoredEvaluation, emailDeliveryStatusList, isAgentOwnedCallback, agentCallbackOwnerIds, transcriptTopics, journeyFrequencyCapReasons, journeyBlockingActionMapIds, journeyActionTargetIds, journeyBlockingScheduleGroupIds, journeyBlockingEmergencyScheduleGroupIds, journeyUrlEqualConditions, journeyUrlNotEqualConditions, journeyUrlStartsWithConditions, journeyUrlEndsWithConditions, journeyUrlContainsAnyConditions, journeyUrlNotContainsAnyConditions, journeyUrlContainsAllConditions, journeyUrlNotContainsAllConditions, flowMilestoneIds, isAssessmentPassed, conversationInitiators, hasCustomerParticipated, isAcdInteraction, hasFax, dataActionIds, actionCategoryName, integrationIds, responseStatuses, availableDashboard, favouriteDashboard, myDashboard, stationErrors, canonicalContactIds, alertRuleIds, evaluationFormContextIds, evaluationStatuses, workbinIds, worktypeIds, workitemIds, workitemAssigneeIds, workitemStatuses, isAnalyzedForSensitiveData, hasSensitiveData, hasPciData, hasPiiData, subPath, userState, isClearedByCustomer, evaluationAssigneeIds, evaluationAssigned, assistantIds, knowledgeBaseIds, isParked, agentEmpathyScore, surveyTypes, surveyResponseStatuses, botFlowTypes, agentTalkDurationMilliseconds, customerTalkDurationMilliseconds, overtalkDurationMilliseconds, silenceDurationMilliseconds, acdDurationMilliseconds, ivrDurationMilliseconds, otherDurationMilliseconds, agentTalkPercentage, customerTalkPercentage, overtalkPercentage, silencePercentage, acdPercentage, ivrPercentage, otherPercentage, overtalkInstances, isScreenRecorded, screenMonitorUserIds, dashboardState, dashboardType, dashboardAccessFilter, transcriptDurationMilliseconds, workitemsStatuses, socialCountries, socialLanguages, socialChannels, socialSentimentCategory, socialTopicIds, socialIngestionRuleIds, socialConversationCreated, socialContentType, socialKeywords, socialPostEscalated, socialClassifications, filterUsersByManagerIds, slideshowIds, conferenced, video, linkedInteraction, recommendationSources, evaluationRole, comparisonQueueIds, viewMetrics, timelineCategories, acw, segmentTypes, programIds, categoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewFilter {\n");
    
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    assignedSkillIds: ").append(toIndentedString(assignedSkillIds)).append("\n");
    sb.append("    skillGroups: ").append(toIndentedString(skillGroups)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
    sb.append("    assignedLanguageIds: ").append(toIndentedString(assignedLanguageIds)).append("\n");
    sb.append("    languageGroups: ").append(toIndentedString(languageGroups)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    originatingDirections: ").append(toIndentedString(originatingDirections)).append("\n");
    sb.append("    wrapUpCodes: ").append(toIndentedString(wrapUpCodes)).append("\n");
    sb.append("    dnisList: ").append(toIndentedString(dnisList)).append("\n");
    sb.append("    sessionDnisList: ").append(toIndentedString(sessionDnisList)).append("\n");
    sb.append("    filterQueuesByUserIds: ").append(toIndentedString(filterQueuesByUserIds)).append("\n");
    sb.append("    filterUsersByQueueIds: ").append(toIndentedString(filterUsersByQueueIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
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
    sb.append("    isAssessmentPassed: ").append(toIndentedString(isAssessmentPassed)).append("\n");
    sb.append("    conversationInitiators: ").append(toIndentedString(conversationInitiators)).append("\n");
    sb.append("    hasCustomerParticipated: ").append(toIndentedString(hasCustomerParticipated)).append("\n");
    sb.append("    isAcdInteraction: ").append(toIndentedString(isAcdInteraction)).append("\n");
    sb.append("    hasFax: ").append(toIndentedString(hasFax)).append("\n");
    sb.append("    dataActionIds: ").append(toIndentedString(dataActionIds)).append("\n");
    sb.append("    actionCategoryName: ").append(toIndentedString(actionCategoryName)).append("\n");
    sb.append("    integrationIds: ").append(toIndentedString(integrationIds)).append("\n");
    sb.append("    responseStatuses: ").append(toIndentedString(responseStatuses)).append("\n");
    sb.append("    availableDashboard: ").append(toIndentedString(availableDashboard)).append("\n");
    sb.append("    favouriteDashboard: ").append(toIndentedString(favouriteDashboard)).append("\n");
    sb.append("    myDashboard: ").append(toIndentedString(myDashboard)).append("\n");
    sb.append("    stationErrors: ").append(toIndentedString(stationErrors)).append("\n");
    sb.append("    canonicalContactIds: ").append(toIndentedString(canonicalContactIds)).append("\n");
    sb.append("    alertRuleIds: ").append(toIndentedString(alertRuleIds)).append("\n");
    sb.append("    evaluationFormContextIds: ").append(toIndentedString(evaluationFormContextIds)).append("\n");
    sb.append("    evaluationStatuses: ").append(toIndentedString(evaluationStatuses)).append("\n");
    sb.append("    workbinIds: ").append(toIndentedString(workbinIds)).append("\n");
    sb.append("    worktypeIds: ").append(toIndentedString(worktypeIds)).append("\n");
    sb.append("    workitemIds: ").append(toIndentedString(workitemIds)).append("\n");
    sb.append("    workitemAssigneeIds: ").append(toIndentedString(workitemAssigneeIds)).append("\n");
    sb.append("    workitemStatuses: ").append(toIndentedString(workitemStatuses)).append("\n");
    sb.append("    isAnalyzedForSensitiveData: ").append(toIndentedString(isAnalyzedForSensitiveData)).append("\n");
    sb.append("    hasSensitiveData: ").append(toIndentedString(hasSensitiveData)).append("\n");
    sb.append("    hasPciData: ").append(toIndentedString(hasPciData)).append("\n");
    sb.append("    hasPiiData: ").append(toIndentedString(hasPiiData)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    userState: ").append(toIndentedString(userState)).append("\n");
    sb.append("    isClearedByCustomer: ").append(toIndentedString(isClearedByCustomer)).append("\n");
    sb.append("    evaluationAssigneeIds: ").append(toIndentedString(evaluationAssigneeIds)).append("\n");
    sb.append("    evaluationAssigned: ").append(toIndentedString(evaluationAssigned)).append("\n");
    sb.append("    assistantIds: ").append(toIndentedString(assistantIds)).append("\n");
    sb.append("    knowledgeBaseIds: ").append(toIndentedString(knowledgeBaseIds)).append("\n");
    sb.append("    isParked: ").append(toIndentedString(isParked)).append("\n");
    sb.append("    agentEmpathyScore: ").append(toIndentedString(agentEmpathyScore)).append("\n");
    sb.append("    surveyTypes: ").append(toIndentedString(surveyTypes)).append("\n");
    sb.append("    surveyResponseStatuses: ").append(toIndentedString(surveyResponseStatuses)).append("\n");
    sb.append("    botFlowTypes: ").append(toIndentedString(botFlowTypes)).append("\n");
    sb.append("    agentTalkDurationMilliseconds: ").append(toIndentedString(agentTalkDurationMilliseconds)).append("\n");
    sb.append("    customerTalkDurationMilliseconds: ").append(toIndentedString(customerTalkDurationMilliseconds)).append("\n");
    sb.append("    overtalkDurationMilliseconds: ").append(toIndentedString(overtalkDurationMilliseconds)).append("\n");
    sb.append("    silenceDurationMilliseconds: ").append(toIndentedString(silenceDurationMilliseconds)).append("\n");
    sb.append("    acdDurationMilliseconds: ").append(toIndentedString(acdDurationMilliseconds)).append("\n");
    sb.append("    ivrDurationMilliseconds: ").append(toIndentedString(ivrDurationMilliseconds)).append("\n");
    sb.append("    otherDurationMilliseconds: ").append(toIndentedString(otherDurationMilliseconds)).append("\n");
    sb.append("    agentTalkPercentage: ").append(toIndentedString(agentTalkPercentage)).append("\n");
    sb.append("    customerTalkPercentage: ").append(toIndentedString(customerTalkPercentage)).append("\n");
    sb.append("    overtalkPercentage: ").append(toIndentedString(overtalkPercentage)).append("\n");
    sb.append("    silencePercentage: ").append(toIndentedString(silencePercentage)).append("\n");
    sb.append("    acdPercentage: ").append(toIndentedString(acdPercentage)).append("\n");
    sb.append("    ivrPercentage: ").append(toIndentedString(ivrPercentage)).append("\n");
    sb.append("    otherPercentage: ").append(toIndentedString(otherPercentage)).append("\n");
    sb.append("    overtalkInstances: ").append(toIndentedString(overtalkInstances)).append("\n");
    sb.append("    isScreenRecorded: ").append(toIndentedString(isScreenRecorded)).append("\n");
    sb.append("    screenMonitorUserIds: ").append(toIndentedString(screenMonitorUserIds)).append("\n");
    sb.append("    dashboardState: ").append(toIndentedString(dashboardState)).append("\n");
    sb.append("    dashboardType: ").append(toIndentedString(dashboardType)).append("\n");
    sb.append("    dashboardAccessFilter: ").append(toIndentedString(dashboardAccessFilter)).append("\n");
    sb.append("    transcriptDurationMilliseconds: ").append(toIndentedString(transcriptDurationMilliseconds)).append("\n");
    sb.append("    workitemsStatuses: ").append(toIndentedString(workitemsStatuses)).append("\n");
    sb.append("    socialCountries: ").append(toIndentedString(socialCountries)).append("\n");
    sb.append("    socialLanguages: ").append(toIndentedString(socialLanguages)).append("\n");
    sb.append("    socialChannels: ").append(toIndentedString(socialChannels)).append("\n");
    sb.append("    socialSentimentCategory: ").append(toIndentedString(socialSentimentCategory)).append("\n");
    sb.append("    socialTopicIds: ").append(toIndentedString(socialTopicIds)).append("\n");
    sb.append("    socialIngestionRuleIds: ").append(toIndentedString(socialIngestionRuleIds)).append("\n");
    sb.append("    socialConversationCreated: ").append(toIndentedString(socialConversationCreated)).append("\n");
    sb.append("    socialContentType: ").append(toIndentedString(socialContentType)).append("\n");
    sb.append("    socialKeywords: ").append(toIndentedString(socialKeywords)).append("\n");
    sb.append("    socialPostEscalated: ").append(toIndentedString(socialPostEscalated)).append("\n");
    sb.append("    socialClassifications: ").append(toIndentedString(socialClassifications)).append("\n");
    sb.append("    filterUsersByManagerIds: ").append(toIndentedString(filterUsersByManagerIds)).append("\n");
    sb.append("    slideshowIds: ").append(toIndentedString(slideshowIds)).append("\n");
    sb.append("    conferenced: ").append(toIndentedString(conferenced)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    linkedInteraction: ").append(toIndentedString(linkedInteraction)).append("\n");
    sb.append("    recommendationSources: ").append(toIndentedString(recommendationSources)).append("\n");
    sb.append("    evaluationRole: ").append(toIndentedString(evaluationRole)).append("\n");
    sb.append("    comparisonQueueIds: ").append(toIndentedString(comparisonQueueIds)).append("\n");
    sb.append("    viewMetrics: ").append(toIndentedString(viewMetrics)).append("\n");
    sb.append("    timelineCategories: ").append(toIndentedString(timelineCategories)).append("\n");
    sb.append("    acw: ").append(toIndentedString(acw)).append("\n");
    sb.append("    segmentTypes: ").append(toIndentedString(segmentTypes)).append("\n");
    sb.append("    programIds: ").append(toIndentedString(programIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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

