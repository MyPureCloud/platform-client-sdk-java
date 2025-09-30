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
import com.mypurecloud.sdk.v2.model.FlowMetricsTopicFlowOutcome;
import com.mypurecloud.sdk.v2.model.FlowMetricsTopicFlowProposedAgent;
import com.mypurecloud.sdk.v2.model.FlowMetricsTopicFlowScoredAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * FlowMetricsTopicFlowMetricRecord
 */

public class FlowMetricsTopicFlowMetricRecord  implements Serializable {
  

  private static class MetricEnumDeserializer extends StdDeserializer<MetricEnum> {
    public MetricEnumDeserializer() {
      super(MetricEnumDeserializer.class);
    }

    @Override
    public MetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Metric name
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NFLOW("nFlow"),
    NFLOWMILESTONE("nFlowMilestone"),
    NFLOWOUTCOME("nFlowOutcome"),
    NFLOWOUTCOMEFAILED("nFlowOutcomeFailed"),
    OFLOWMILESTONE("oFlowMilestone"),
    TFLOW("tFlow"),
    TFLOWDISCONNECT("tFlowDisconnect"),
    TFLOWEXIT("tFlowExit"),
    TFLOWOUTCOME("tFlowOutcome");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;
  private Date metricDate = null;
  private Long value = null;
  private String recordId = null;

  private static class ActiveRoutingEnumDeserializer extends StdDeserializer<ActiveRoutingEnum> {
    public ActiveRoutingEnumDeserializer() {
      super(ActiveRoutingEnumDeserializer.class);
    }

    @Override
    public ActiveRoutingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActiveRoutingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Active routing method
   */
 @JsonDeserialize(using = ActiveRoutingEnumDeserializer.class)
  public enum ActiveRoutingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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

    ActiveRoutingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActiveRoutingEnum fromString(String key) {
      if (key == null) return null;

      for (ActiveRoutingEnum value : ActiveRoutingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActiveRoutingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActiveRoutingEnum activeRouting = null;
  private List<String> activeSkillIds = null;
  private String addressFrom = null;
  private String addressTo = null;
  private String agentAssistantId = null;
  private Long agentBullseyeRing = null;
  private Boolean agentOwned = null;
  private String ani = null;
  private String assignerId = null;
  private Boolean authenticated = null;
  private String conversationId = null;

  private static class ConversationInitiatorEnumDeserializer extends StdDeserializer<ConversationInitiatorEnum> {
    public ConversationInitiatorEnumDeserializer() {
      super(ConversationInitiatorEnumDeserializer.class);
    }

    @Override
    public ConversationInitiatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ConversationInitiatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the participant purpose of the participant initiating a message conversation
   */
 @JsonDeserialize(using = ConversationInitiatorEnumDeserializer.class)
  public enum ConversationInitiatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACD("acd"),
    AGENT("agent"),
    API("api"),
    BOTFLOW("botflow"),
    CAMPAIGN("campaign"),
    CUSTOMER("customer"),
    DIALER("dialer"),
    EXTERNAL("external"),
    FAX("fax"),
    GROUP("group"),
    INBOUND("inbound"),
    IVR("ivr"),
    MANUAL("manual"),
    OUTBOUND("outbound"),
    STATION("station"),
    USER("user"),
    VOICEMAIL("voicemail"),
    VOICESURVEYFLOW("voicesurveyflow"),
    WORKFLOW("workflow");

    private String value;

    ConversationInitiatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ConversationInitiatorEnum fromString(String key) {
      if (key == null) return null;

      for (ConversationInitiatorEnum value : ConversationInitiatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ConversationInitiatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ConversationInitiatorEnum conversationInitiator = null;
  private String convertedFrom = null;
  private String convertedTo = null;
  private Boolean customerParticipation = null;

  private static class DeliveryStatusEnumDeserializer extends StdDeserializer<DeliveryStatusEnum> {
    public DeliveryStatusEnumDeserializer() {
      super(DeliveryStatusEnumDeserializer.class);
    }

    @Override
    public DeliveryStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DeliveryStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The email or SMS delivery status
   */
 @JsonDeserialize(using = DeliveryStatusEnumDeserializer.class)
  public enum DeliveryStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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

    DeliveryStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DeliveryStatusEnum fromString(String key) {
      if (key == null) return null;

      for (DeliveryStatusEnum value : DeliveryStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DeliveryStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DeliveryStatusEnum deliveryStatus = null;
  private List<String> destinationAddresses = null;

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
   * The direction of the communication
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

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
   * The session disconnect type
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLIENT("client"),
    CONFERENCETRANSFER("conferenceTransfer"),
    CONSULTTRANSFER("consultTransfer"),
    ENDPOINT("endpoint"),
    ENDPOINTDND("endpointDnd"),
    ERROR("error"),
    FORWARDTRANSFER("forwardTransfer"),
    INACTIVITY("inactivity"),
    NOANSWERTRANSFER("noAnswerTransfer"),
    NOTAVAILABLETRANSFER("notAvailableTransfer"),
    OTHER("other"),
    PEER("peer"),
    SESSIONEXPIRED("sessionExpired"),
    SPAM("spam"),
    SYSTEM("system"),
    TIMEOUT("timeout"),
    TRANSFER("transfer"),
    TRANSFERDND("transferDnd"),
    TRANSPORTFAILURE("transportFailure"),
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
  private List<String> divisionIds = null;
  private String dnis = null;
  private String edgeId = null;
  private List<Long> eligibleAgentCounts = null;
  private String endingLanguage = null;
  private String entryReason = null;

  private static class EntryTypeEnumDeserializer extends StdDeserializer<EntryTypeEnum> {
    public EntryTypeEnumDeserializer() {
      super(EntryTypeEnumDeserializer.class);
    }

    @Override
    public EntryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EntryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The entry type for this flow, e.g. dnis, dialer, agent, flow, or direct
   */
 @JsonDeserialize(using = EntryTypeEnumDeserializer.class)
  public enum EntryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENT("agent"),
    DIRECT("direct"),
    DNIS("dnis"),
    FLOW("flow"),
    OUTBOUND("outbound");

    private String value;

    EntryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EntryTypeEnum value : EntryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntryTypeEnum entryType = null;
  private String errorCode = null;
  private String exitReason = null;
  private String extendedDeliveryStatus = null;
  private String externalContactId = null;
  private Long externalMediaCount = null;
  private String externalOrganizationId = null;
  private String externalTag = null;
  private Boolean firstQueue = null;

  private static class FlaggedReasonEnumDeserializer extends StdDeserializer<FlaggedReasonEnum> {
    public FlaggedReasonEnumDeserializer() {
      super(FlaggedReasonEnumDeserializer.class);
    }

    @Override
    public FlaggedReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlaggedReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Reason for which participant flagged conversation
   */
 @JsonDeserialize(using = FlaggedReasonEnumDeserializer.class)
  public enum FlaggedReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENERAL("general");

    private String value;

    FlaggedReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlaggedReasonEnum fromString(String key) {
      if (key == null) return null;

      for (FlaggedReasonEnum value : FlaggedReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlaggedReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlaggedReasonEnum flaggedReason = null;
  private String flowId = null;
  private String flowInType = null;
  private List<String> flowMilestoneIds = null;
  private String flowName = null;
  private String flowOutType = null;

  private static class FlowSubTypeEnumDeserializer extends StdDeserializer<FlowSubTypeEnum> {
    public FlowSubTypeEnumDeserializer() {
      super(FlowSubTypeEnumDeserializer.class);
    }

    @Override
    public FlowSubTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowSubTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Represents the subtype of the flow. For example a Digital Bot Flow that has been upgraded with Virtual Agent capabilities.
   */
 @JsonDeserialize(using = FlowSubTypeEnumDeserializer.class)
  public enum FlowSubTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VIRTUAL_AGENT("VIRTUAL_AGENT");

    private String value;

    FlowSubTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowSubTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FlowSubTypeEnum value : FlowSubTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowSubTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlowSubTypeEnum flowSubType = null;

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
   * The type of this flow
   */
 @JsonDeserialize(using = FlowTypeEnumDeserializer.class)
  public enum FlowTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("bot"),
    COMMONMODULE("commonmodule"),
    DIGITALBOT("digitalbot"),
    INBOUNDCALL("inboundcall"),
    INBOUNDCHAT("inboundchat"),
    INBOUNDEMAIL("inboundemail"),
    INBOUNDSHORTMESSAGE("inboundshortmessage"),
    INQUEUECALL("inqueuecall"),
    INQUEUEEMAIL("inqueueemail"),
    INQUEUESHORTMESSAGE("inqueueshortmessage"),
    OUTBOUNDCALL("outboundcall"),
    SECURECALL("securecall"),
    SPEECH("speech"),
    SURVEYINVITE("surveyinvite"),
    VOICE("voice"),
    VOICEMAIL("voicemail"),
    VOICESURVEY("voicesurvey"),
    WORKFLOW("workflow"),
    WORKITEM("workitem");

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
  private String flowVersion = null;
  private String groupId = null;
  private String interactionType = null;
  private String journeyActionId = null;
  private String journeyActionMapId = null;
  private Long journeyActionMapVersion = null;
  private String journeyCustomerId = null;
  private String journeyCustomerIdType = null;
  private String journeyCustomerSessionId = null;
  private String journeyCustomerSessionIdType = null;
  private String knowledgeBaseId = null;
  private Long mediaCount = null;

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
   * The session media type
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private String messageType = null;

  private static class OriginatingDirectionEnumDeserializer extends StdDeserializer<OriginatingDirectionEnum> {
    public OriginatingDirectionEnumDeserializer() {
      super(OriginatingDirectionEnumDeserializer.class);
    }

    @Override
    public OriginatingDirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginatingDirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The original direction of the conversation
   */
 @JsonDeserialize(using = OriginatingDirectionEnumDeserializer.class)
  public enum OriginatingDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    OriginatingDirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginatingDirectionEnum fromString(String key) {
      if (key == null) return null;

      for (OriginatingDirectionEnum value : OriginatingDirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginatingDirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OriginatingDirectionEnum originatingDirection = null;
  private String outboundCampaignId = null;
  private String outboundContactId = null;
  private String outboundContactListId = null;
  private String participantName = null;
  private String peerId = null;
  private String provider = null;

  private static class PurposeEnumDeserializer extends StdDeserializer<PurposeEnum> {
    public PurposeEnumDeserializer() {
      super(PurposeEnumDeserializer.class);
    }

    @Override
    public PurposeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PurposeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The participant's purpose
   */
 @JsonDeserialize(using = PurposeEnumDeserializer.class)
  public enum PurposeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACD("acd"),
    AGENT("agent"),
    API("api"),
    BOTFLOW("botflow"),
    CAMPAIGN("campaign"),
    CUSTOMER("customer"),
    DIALER("dialer"),
    EXTERNAL("external"),
    FAX("fax"),
    GROUP("group"),
    INBOUND("inbound"),
    IVR("ivr"),
    MANUAL("manual"),
    OUTBOUND("outbound"),
    STATION("station"),
    USER("user"),
    VOICEMAIL("voicemail"),
    VOICESURVEYFLOW("voicesurveyflow"),
    WORKFLOW("workflow");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PurposeEnum fromString(String key) {
      if (key == null) return null;

      for (PurposeEnum value : PurposeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PurposeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PurposeEnum purpose = null;
  private String queueId = null;
  private String recognitionFailureReason = null;
  private String remote = null;
  private List<String> removedSkillIds = null;
  private String requestedLanguageId = null;
  private List<String> requestedRoutingSkillIds = null;

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
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private List<RequestedRoutingsEnum> requestedRoutings = null;
  private String roomId = null;
  private Long routingPriority = null;
  private Long routingRing = null;
  private String routingRule = null;

  private static class RoutingRuleTypeEnumDeserializer extends StdDeserializer<RoutingRuleTypeEnum> {
    public RoutingRuleTypeEnumDeserializer() {
      super(RoutingRuleTypeEnumDeserializer.class);
    }

    @Override
    public RoutingRuleTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RoutingRuleTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Routing rule type
   */
 @JsonDeserialize(using = RoutingRuleTypeEnumDeserializer.class)
  public enum RoutingRuleTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BULLSEYE("Bullseye"),
    CONDITIONAL("Conditional"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred");

    private String value;

    RoutingRuleTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoutingRuleTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RoutingRuleTypeEnum value : RoutingRuleTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoutingRuleTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoutingRuleTypeEnum routingRuleType = null;
  private String selectedAgentId = null;
  private Long selectedAgentRank = null;
  private Boolean selfServed = null;
  private String sessionDnis = null;
  private String sessionId = null;
  private String startingLanguage = null;
  private String stationId = null;
  private String teamId = null;
  private String transferTargetAddress = null;
  private String transferTargetName = null;
  private String transferType = null;

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
   * Complete routing method
   */
 @JsonDeserialize(using = UsedRoutingEnumDeserializer.class)
  public enum UsedRoutingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private String userId = null;
  private Boolean videoPresent = null;
  private List<Long> waitingInteractionCounts = null;
  private String wrapUpCode = null;
  private List<FlowMetricsTopicFlowProposedAgent> proposedAgents = null;
  private List<FlowMetricsTopicFlowOutcome> outcomes = null;
  private List<FlowMetricsTopicFlowScoredAgent> scoredAgents = null;

  public FlowMetricsTopicFlowMetricRecord() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activeSkillIds = new ArrayList<String>();
      destinationAddresses = new ArrayList<String>();
      divisionIds = new ArrayList<String>();
      eligibleAgentCounts = new ArrayList<Long>();
      flowMilestoneIds = new ArrayList<String>();
      removedSkillIds = new ArrayList<String>();
      requestedRoutingSkillIds = new ArrayList<String>();
      requestedRoutings = new ArrayList<RequestedRoutingsEnum>();
      waitingInteractionCounts = new ArrayList<Long>();
      proposedAgents = new ArrayList<FlowMetricsTopicFlowProposedAgent>();
      outcomes = new ArrayList<FlowMetricsTopicFlowOutcome>();
      scoredAgents = new ArrayList<FlowMetricsTopicFlowScoredAgent>();
    }
  }

  
  /**
   * Metric name
   **/
  public FlowMetricsTopicFlowMetricRecord metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric name")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * The date and time of metric creation
   **/
  public FlowMetricsTopicFlowMetricRecord metricDate(Date metricDate) {
    this.metricDate = metricDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time of metric creation")
  @JsonProperty("metricDate")
  public Date getMetricDate() {
    return metricDate;
  }
  public void setMetricDate(Date metricDate) {
    this.metricDate = metricDate;
  }


  /**
   * Metric value
   **/
  public FlowMetricsTopicFlowMetricRecord value(Long value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric value")
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }


  /**
   * Record identifier
   **/
  public FlowMetricsTopicFlowMetricRecord recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Record identifier")
  @JsonProperty("recordId")
  public String getRecordId() {
    return recordId;
  }
  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  /**
   * Active routing method
   **/
  public FlowMetricsTopicFlowMetricRecord activeRouting(ActiveRoutingEnum activeRouting) {
    this.activeRouting = activeRouting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active routing method")
  @JsonProperty("activeRouting")
  public ActiveRoutingEnum getActiveRouting() {
    return activeRouting;
  }
  public void setActiveRouting(ActiveRoutingEnum activeRouting) {
    this.activeRouting = activeRouting;
  }


  /**
   * ID(s) of Skill(s) that are active on the conversation
   **/
  public FlowMetricsTopicFlowMetricRecord activeSkillIds(List<String> activeSkillIds) {
    this.activeSkillIds = activeSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID(s) of Skill(s) that are active on the conversation")
  @JsonProperty("activeSkillIds")
  public List<String> getActiveSkillIds() {
    return activeSkillIds;
  }
  public void setActiveSkillIds(List<String> activeSkillIds) {
    this.activeSkillIds = activeSkillIds;
  }


  /**
   * The address that initiated an action
   **/
  public FlowMetricsTopicFlowMetricRecord addressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address that initiated an action")
  @JsonProperty("addressFrom")
  public String getAddressFrom() {
    return addressFrom;
  }
  public void setAddressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
  }


  /**
   * The address receiving an action
   **/
  public FlowMetricsTopicFlowMetricRecord addressTo(String addressTo) {
    this.addressTo = addressTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address receiving an action")
  @JsonProperty("addressTo")
  public String getAddressTo() {
    return addressTo;
  }
  public void setAddressTo(String addressTo) {
    this.addressTo = addressTo;
  }


  /**
   * Unique identifier of the active virtual agent assistant
   **/
  public FlowMetricsTopicFlowMetricRecord agentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of the active virtual agent assistant")
  @JsonProperty("agentAssistantId")
  public String getAgentAssistantId() {
    return agentAssistantId;
  }
  public void setAgentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
  }


  /**
   * Bullseye ring of the targeted agent
   **/
  public FlowMetricsTopicFlowMetricRecord agentBullseyeRing(Long agentBullseyeRing) {
    this.agentBullseyeRing = agentBullseyeRing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bullseye ring of the targeted agent")
  @JsonProperty("agentBullseyeRing")
  public Long getAgentBullseyeRing() {
    return agentBullseyeRing;
  }
  public void setAgentBullseyeRing(Long agentBullseyeRing) {
    this.agentBullseyeRing = agentBullseyeRing;
  }


  /**
   * Flag indicating an agent-owned callback
   **/
  public FlowMetricsTopicFlowMetricRecord agentOwned(Boolean agentOwned) {
    this.agentOwned = agentOwned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicating an agent-owned callback")
  @JsonProperty("agentOwned")
  public Boolean getAgentOwned() {
    return agentOwned;
  }
  public void setAgentOwned(Boolean agentOwned) {
    this.agentOwned = agentOwned;
  }


  /**
   * Automatic Number Identification (caller's number)
   **/
  public FlowMetricsTopicFlowMetricRecord ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Automatic Number Identification (caller's number)")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }


  /**
   * ID of the user that manually assigned a conversation
   **/
  public FlowMetricsTopicFlowMetricRecord assignerId(String assignerId) {
    this.assignerId = assignerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the user that manually assigned a conversation")
  @JsonProperty("assignerId")
  public String getAssignerId() {
    return assignerId;
  }
  public void setAssignerId(String assignerId) {
    this.assignerId = assignerId;
  }


  /**
   * Flag that indicates that the identity of the customer has been asserted as verified by the provider.
   **/
  public FlowMetricsTopicFlowMetricRecord authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag that indicates that the identity of the customer has been asserted as verified by the provider.")
  @JsonProperty("authenticated")
  public Boolean getAuthenticated() {
    return authenticated;
  }
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }


  /**
   * Unique identifier for the conversation
   **/
  public FlowMetricsTopicFlowMetricRecord conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * Indicates the participant purpose of the participant initiating a message conversation
   **/
  public FlowMetricsTopicFlowMetricRecord conversationInitiator(ConversationInitiatorEnum conversationInitiator) {
    this.conversationInitiator = conversationInitiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the participant purpose of the participant initiating a message conversation")
  @JsonProperty("conversationInitiator")
  public ConversationInitiatorEnum getConversationInitiator() {
    return conversationInitiator;
  }
  public void setConversationInitiator(ConversationInitiatorEnum conversationInitiator) {
    this.conversationInitiator = conversationInitiator;
  }


  /**
   * Session media type that was converted from in case of a media type conversion
   **/
  public FlowMetricsTopicFlowMetricRecord convertedFrom(String convertedFrom) {
    this.convertedFrom = convertedFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session media type that was converted from in case of a media type conversion")
  @JsonProperty("convertedFrom")
  public String getConvertedFrom() {
    return convertedFrom;
  }
  public void setConvertedFrom(String convertedFrom) {
    this.convertedFrom = convertedFrom;
  }


  /**
   * Session media type that was converted to in case of a media type conversion
   **/
  public FlowMetricsTopicFlowMetricRecord convertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session media type that was converted to in case of a media type conversion")
  @JsonProperty("convertedTo")
  public String getConvertedTo() {
    return convertedTo;
  }
  public void setConvertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
  }


  /**
   * Indicates a messaging conversation in which the customer participated by sending at least one message
   **/
  public FlowMetricsTopicFlowMetricRecord customerParticipation(Boolean customerParticipation) {
    this.customerParticipation = customerParticipation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates a messaging conversation in which the customer participated by sending at least one message")
  @JsonProperty("customerParticipation")
  public Boolean getCustomerParticipation() {
    return customerParticipation;
  }
  public void setCustomerParticipation(Boolean customerParticipation) {
    this.customerParticipation = customerParticipation;
  }


  /**
   * The email or SMS delivery status
   **/
  public FlowMetricsTopicFlowMetricRecord deliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email or SMS delivery status")
  @JsonProperty("deliveryStatus")
  public DeliveryStatusEnum getDeliveryStatus() {
    return deliveryStatus;
  }
  public void setDeliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  /**
   * Destination address(es) of transfers or consults
   **/
  public FlowMetricsTopicFlowMetricRecord destinationAddresses(List<String> destinationAddresses) {
    this.destinationAddresses = destinationAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Destination address(es) of transfers or consults")
  @JsonProperty("destinationAddresses")
  public List<String> getDestinationAddresses() {
    return destinationAddresses;
  }
  public void setDestinationAddresses(List<String> destinationAddresses) {
    this.destinationAddresses = destinationAddresses;
  }


  /**
   * The direction of the communication
   **/
  public FlowMetricsTopicFlowMetricRecord direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the communication")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   * The session disconnect type
   **/
  public FlowMetricsTopicFlowMetricRecord disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session disconnect type")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }


  /**
   * Identifier(s) of division(s) associated with a conversation
   **/
  public FlowMetricsTopicFlowMetricRecord divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier(s) of division(s) associated with a conversation")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  /**
   * Dialed number identification service (number dialed by the calling party)
   **/
  public FlowMetricsTopicFlowMetricRecord dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dialed number identification service (number dialed by the calling party)")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }


  /**
   * Unique identifier of the edge device
   **/
  public FlowMetricsTopicFlowMetricRecord edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of the edge device")
  @JsonProperty("edgeId")
  public String getEdgeId() {
    return edgeId;
  }
  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }


  /**
   * Number of eligible agents for each predictive routing attempt
   **/
  public FlowMetricsTopicFlowMetricRecord eligibleAgentCounts(List<Long> eligibleAgentCounts) {
    this.eligibleAgentCounts = eligibleAgentCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of eligible agents for each predictive routing attempt")
  @JsonProperty("eligibleAgentCounts")
  public List<Long> getEligibleAgentCounts() {
    return eligibleAgentCounts;
  }
  public void setEligibleAgentCounts(List<Long> eligibleAgentCounts) {
    this.eligibleAgentCounts = eligibleAgentCounts;
  }


  /**
   * Flow ending language, e.g. en-us
   **/
  public FlowMetricsTopicFlowMetricRecord endingLanguage(String endingLanguage) {
    this.endingLanguage = endingLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow ending language, e.g. en-us")
  @JsonProperty("endingLanguage")
  public String getEndingLanguage() {
    return endingLanguage;
  }
  public void setEndingLanguage(String endingLanguage) {
    this.endingLanguage = endingLanguage;
  }


  /**
   * The particular entry reason for this flow, e.g. an address, userId, or flowId
   **/
  public FlowMetricsTopicFlowMetricRecord entryReason(String entryReason) {
    this.entryReason = entryReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The particular entry reason for this flow, e.g. an address, userId, or flowId")
  @JsonProperty("entryReason")
  public String getEntryReason() {
    return entryReason;
  }
  public void setEntryReason(String entryReason) {
    this.entryReason = entryReason;
  }


  /**
   * The entry type for this flow, e.g. dnis, dialer, agent, flow, or direct
   **/
  public FlowMetricsTopicFlowMetricRecord entryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entry type for this flow, e.g. dnis, dialer, agent, flow, or direct")
  @JsonProperty("entryType")
  public EntryTypeEnum getEntryType() {
    return entryType;
  }
  public void setEntryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
  }


  /**
   * A code corresponding to the error that occurred
   **/
  public FlowMetricsTopicFlowMetricRecord errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A code corresponding to the error that occurred")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * The exit reason for this flow, e.g. DISCONNECT
   **/
  public FlowMetricsTopicFlowMetricRecord exitReason(String exitReason) {
    this.exitReason = exitReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The exit reason for this flow, e.g. DISCONNECT")
  @JsonProperty("exitReason")
  public String getExitReason() {
    return exitReason;
  }
  public void setExitReason(String exitReason) {
    this.exitReason = exitReason;
  }


  /**
   * Extended delivery status
   **/
  public FlowMetricsTopicFlowMetricRecord extendedDeliveryStatus(String extendedDeliveryStatus) {
    this.extendedDeliveryStatus = extendedDeliveryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Extended delivery status")
  @JsonProperty("extendedDeliveryStatus")
  public String getExtendedDeliveryStatus() {
    return extendedDeliveryStatus;
  }
  public void setExtendedDeliveryStatus(String extendedDeliveryStatus) {
    this.extendedDeliveryStatus = extendedDeliveryStatus;
  }


  /**
   * External contact identifier
   **/
  public FlowMetricsTopicFlowMetricRecord externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External contact identifier")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * Count of any media (images, files, etc) included on the external session
   **/
  public FlowMetricsTopicFlowMetricRecord externalMediaCount(Long externalMediaCount) {
    this.externalMediaCount = externalMediaCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of any media (images, files, etc) included on the external session")
  @JsonProperty("externalMediaCount")
  public Long getExternalMediaCount() {
    return externalMediaCount;
  }
  public void setExternalMediaCount(Long externalMediaCount) {
    this.externalMediaCount = externalMediaCount;
  }


  /**
   * External organization identifier
   **/
  public FlowMetricsTopicFlowMetricRecord externalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External organization identifier")
  @JsonProperty("externalOrganizationId")
  public String getExternalOrganizationId() {
    return externalOrganizationId;
  }
  public void setExternalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
  }


  /**
   * External tag for the conversation
   **/
  public FlowMetricsTopicFlowMetricRecord externalTag(String externalTag) {
    this.externalTag = externalTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External tag for the conversation")
  @JsonProperty("externalTag")
  public String getExternalTag() {
    return externalTag;
  }
  public void setExternalTag(String externalTag) {
    this.externalTag = externalTag;
  }


  /**
   * Marker that is set if the current queue is the first queue in a conversation
   **/
  public FlowMetricsTopicFlowMetricRecord firstQueue(Boolean firstQueue) {
    this.firstQueue = firstQueue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Marker that is set if the current queue is the first queue in a conversation")
  @JsonProperty("firstQueue")
  public Boolean getFirstQueue() {
    return firstQueue;
  }
  public void setFirstQueue(Boolean firstQueue) {
    this.firstQueue = firstQueue;
  }


  /**
   * Reason for which participant flagged conversation
   **/
  public FlowMetricsTopicFlowMetricRecord flaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reason for which participant flagged conversation")
  @JsonProperty("flaggedReason")
  public FlaggedReasonEnum getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
  }


  /**
   * The unique identifier of this flow
   **/
  public FlowMetricsTopicFlowMetricRecord flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of this flow")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  /**
   * Type of flow in that occurred when entering ACD.
   **/
  public FlowMetricsTopicFlowMetricRecord flowInType(String flowInType) {
    this.flowInType = flowInType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of flow in that occurred when entering ACD.")
  @JsonProperty("flowInType")
  public String getFlowInType() {
    return flowInType;
  }
  public void setFlowInType(String flowInType) {
    this.flowInType = flowInType;
  }


  /**
   * The ID of a flow outcome milestone
   **/
  public FlowMetricsTopicFlowMetricRecord flowMilestoneIds(List<String> flowMilestoneIds) {
    this.flowMilestoneIds = flowMilestoneIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of a flow outcome milestone")
  @JsonProperty("flowMilestoneIds")
  public List<String> getFlowMilestoneIds() {
    return flowMilestoneIds;
  }
  public void setFlowMilestoneIds(List<String> flowMilestoneIds) {
    this.flowMilestoneIds = flowMilestoneIds;
  }


  /**
   * The name of this flow at the time of flow execution
   **/
  public FlowMetricsTopicFlowMetricRecord flowName(String flowName) {
    this.flowName = flowName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of this flow at the time of flow execution")
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }


  /**
   * Type of flow out that occurred when emitting tFlowOut.
   **/
  public FlowMetricsTopicFlowMetricRecord flowOutType(String flowOutType) {
    this.flowOutType = flowOutType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of flow out that occurred when emitting tFlowOut.")
  @JsonProperty("flowOutType")
  public String getFlowOutType() {
    return flowOutType;
  }
  public void setFlowOutType(String flowOutType) {
    this.flowOutType = flowOutType;
  }


  /**
   * Represents the subtype of the flow. For example a Digital Bot Flow that has been upgraded with Virtual Agent capabilities.
   **/
  public FlowMetricsTopicFlowMetricRecord flowSubType(FlowSubTypeEnum flowSubType) {
    this.flowSubType = flowSubType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the subtype of the flow. For example a Digital Bot Flow that has been upgraded with Virtual Agent capabilities.")
  @JsonProperty("flowSubType")
  public FlowSubTypeEnum getFlowSubType() {
    return flowSubType;
  }
  public void setFlowSubType(FlowSubTypeEnum flowSubType) {
    this.flowSubType = flowSubType;
  }


  /**
   * The type of this flow
   **/
  public FlowMetricsTopicFlowMetricRecord flowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of this flow")
  @JsonProperty("flowType")
  public FlowTypeEnum getFlowType() {
    return flowType;
  }
  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }


  /**
   * The version of this flow
   **/
  public FlowMetricsTopicFlowMetricRecord flowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of this flow")
  @JsonProperty("flowVersion")
  public String getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
  }


  /**
   * Unique identifier for a Genesys Cloud group
   **/
  public FlowMetricsTopicFlowMetricRecord groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for a Genesys Cloud group")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * The interaction type (enterprise or contactCenter)
   **/
  public FlowMetricsTopicFlowMetricRecord interactionType(String interactionType) {
    this.interactionType = interactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interaction type (enterprise or contactCenter)")
  @JsonProperty("interactionType")
  public String getInteractionType() {
    return interactionType;
  }
  public void setInteractionType(String interactionType) {
    this.interactionType = interactionType;
  }


  /**
   * Identifier of the journey action.
   **/
  public FlowMetricsTopicFlowMetricRecord journeyActionId(String journeyActionId) {
    this.journeyActionId = journeyActionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the journey action.")
  @JsonProperty("journeyActionId")
  public String getJourneyActionId() {
    return journeyActionId;
  }
  public void setJourneyActionId(String journeyActionId) {
    this.journeyActionId = journeyActionId;
  }


  /**
   * Identifier of the journey action map that triggered the action.
   **/
  public FlowMetricsTopicFlowMetricRecord journeyActionMapId(String journeyActionMapId) {
    this.journeyActionMapId = journeyActionMapId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the journey action map that triggered the action.")
  @JsonProperty("journeyActionMapId")
  public String getJourneyActionMapId() {
    return journeyActionMapId;
  }
  public void setJourneyActionMapId(String journeyActionMapId) {
    this.journeyActionMapId = journeyActionMapId;
  }


  /**
   * Version of the journey action map that triggered the action.
   **/
  public FlowMetricsTopicFlowMetricRecord journeyActionMapVersion(Long journeyActionMapVersion) {
    this.journeyActionMapVersion = journeyActionMapVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of the journey action map that triggered the action.")
  @JsonProperty("journeyActionMapVersion")
  public Long getJourneyActionMapVersion() {
    return journeyActionMapVersion;
  }
  public void setJourneyActionMapVersion(Long journeyActionMapVersion) {
    this.journeyActionMapVersion = journeyActionMapVersion;
  }


  /**
   * Primary identifier of the journey customer in the source where the activities originate from.
   **/
  public FlowMetricsTopicFlowMetricRecord journeyCustomerId(String journeyCustomerId) {
    this.journeyCustomerId = journeyCustomerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary identifier of the journey customer in the source where the activities originate from.")
  @JsonProperty("journeyCustomerId")
  public String getJourneyCustomerId() {
    return journeyCustomerId;
  }
  public void setJourneyCustomerId(String journeyCustomerId) {
    this.journeyCustomerId = journeyCustomerId;
  }


  /**
   * Type of primary identifier of the journey customer (e.g. cookie).
   **/
  public FlowMetricsTopicFlowMetricRecord journeyCustomerIdType(String journeyCustomerIdType) {
    this.journeyCustomerIdType = journeyCustomerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of primary identifier of the journey customer (e.g. cookie).")
  @JsonProperty("journeyCustomerIdType")
  public String getJourneyCustomerIdType() {
    return journeyCustomerIdType;
  }
  public void setJourneyCustomerIdType(String journeyCustomerIdType) {
    this.journeyCustomerIdType = journeyCustomerIdType;
  }


  /**
   * Unique identifier of the journey session.
   **/
  public FlowMetricsTopicFlowMetricRecord journeyCustomerSessionId(String journeyCustomerSessionId) {
    this.journeyCustomerSessionId = journeyCustomerSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of the journey session.")
  @JsonProperty("journeyCustomerSessionId")
  public String getJourneyCustomerSessionId() {
    return journeyCustomerSessionId;
  }
  public void setJourneyCustomerSessionId(String journeyCustomerSessionId) {
    this.journeyCustomerSessionId = journeyCustomerSessionId;
  }


  /**
   * Type or category of journey sessions (e.g. web, ticket, delivery, atm).
   **/
  public FlowMetricsTopicFlowMetricRecord journeyCustomerSessionIdType(String journeyCustomerSessionIdType) {
    this.journeyCustomerSessionIdType = journeyCustomerSessionIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type or category of journey sessions (e.g. web, ticket, delivery, atm).")
  @JsonProperty("journeyCustomerSessionIdType")
  public String getJourneyCustomerSessionIdType() {
    return journeyCustomerSessionIdType;
  }
  public void setJourneyCustomerSessionIdType(String journeyCustomerSessionIdType) {
    this.journeyCustomerSessionIdType = journeyCustomerSessionIdType;
  }


  /**
   * The unique identifier of the knowledge base used
   **/
  public FlowMetricsTopicFlowMetricRecord knowledgeBaseId(String knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the knowledge base used")
  @JsonProperty("knowledgeBaseId")
  public String getKnowledgeBaseId() {
    return knowledgeBaseId;
  }
  public void setKnowledgeBaseId(String knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
  }


  /**
   * Count of any media (images, files, etc) included in this session
   **/
  public FlowMetricsTopicFlowMetricRecord mediaCount(Long mediaCount) {
    this.mediaCount = mediaCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of any media (images, files, etc) included in this session")
  @JsonProperty("mediaCount")
  public Long getMediaCount() {
    return mediaCount;
  }
  public void setMediaCount(Long mediaCount) {
    this.mediaCount = mediaCount;
  }


  /**
   * The session media type
   **/
  public FlowMetricsTopicFlowMetricRecord mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session media type")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Message type for messaging services. E.g.: sms, facebook, twitter, line
   **/
  public FlowMetricsTopicFlowMetricRecord messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message type for messaging services. E.g.: sms, facebook, twitter, line")
  @JsonProperty("messageType")
  public String getMessageType() {
    return messageType;
  }
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  /**
   * The original direction of the conversation
   **/
  public FlowMetricsTopicFlowMetricRecord originatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The original direction of the conversation")
  @JsonProperty("originatingDirection")
  public OriginatingDirectionEnum getOriginatingDirection() {
    return originatingDirection;
  }
  public void setOriginatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
  }


  /**
   * (Dialer) Unique identifier of the outbound campaign
   **/
  public FlowMetricsTopicFlowMetricRecord outboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Unique identifier of the outbound campaign")
  @JsonProperty("outboundCampaignId")
  public String getOutboundCampaignId() {
    return outboundCampaignId;
  }
  public void setOutboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
  }


  /**
   * (Dialer) Unique identifier of the contact
   **/
  public FlowMetricsTopicFlowMetricRecord outboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Unique identifier of the contact")
  @JsonProperty("outboundContactId")
  public String getOutboundContactId() {
    return outboundContactId;
  }
  public void setOutboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
  }


  /**
   * (Dialer) Unique identifier of the contact list that this contact belongs to
   **/
  public FlowMetricsTopicFlowMetricRecord outboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Unique identifier of the contact list that this contact belongs to")
  @JsonProperty("outboundContactListId")
  public String getOutboundContactListId() {
    return outboundContactListId;
  }
  public void setOutboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
  }


  /**
   * A human readable name identifying the participant
   **/
  public FlowMetricsTopicFlowMetricRecord participantName(String participantName) {
    this.participantName = participantName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human readable name identifying the participant")
  @JsonProperty("participantName")
  public String getParticipantName() {
    return participantName;
  }
  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }


  /**
   * This identifies pairs of related sessions on a conversation. E.g. an external session’s peerId will be the session that the call originally connected to, e.g. if an IVR was dialed, the IVR session, which will also have the external session’s ID as its peer. After that point, any transfers of that session to other internal components (acd, agent, etc.) will all spawn new sessions whose peerIds point back to that original external session.
   **/
  public FlowMetricsTopicFlowMetricRecord peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This identifies pairs of related sessions on a conversation. E.g. an external session’s peerId will be the session that the call originally connected to, e.g. if an IVR was dialed, the IVR session, which will also have the external session’s ID as its peer. After that point, any transfers of that session to other internal components (acd, agent, etc.) will all spawn new sessions whose peerIds point back to that original external session.")
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }


  /**
   * The source provider for the communication.
   **/
  public FlowMetricsTopicFlowMetricRecord provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source provider for the communication.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }


  /**
   * The participant's purpose
   **/
  public FlowMetricsTopicFlowMetricRecord purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's purpose")
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }


  /**
   * Queue identifier
   **/
  public FlowMetricsTopicFlowMetricRecord queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queue identifier")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * The recognition failure reason causing to exit/disconnect
   **/
  public FlowMetricsTopicFlowMetricRecord recognitionFailureReason(String recognitionFailureReason) {
    this.recognitionFailureReason = recognitionFailureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recognition failure reason causing to exit/disconnect")
  @JsonProperty("recognitionFailureReason")
  public String getRecognitionFailureReason() {
    return recognitionFailureReason;
  }
  public void setRecognitionFailureReason(String recognitionFailureReason) {
    this.recognitionFailureReason = recognitionFailureReason;
  }


  /**
   * Name, phone number, or email address of the remote party.
   **/
  public FlowMetricsTopicFlowMetricRecord remote(String remote) {
    this.remote = remote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name, phone number, or email address of the remote party.")
  @JsonProperty("remote")
  public String getRemote() {
    return remote;
  }
  public void setRemote(String remote) {
    this.remote = remote;
  }


  /**
   * ID(s) of Skill(s) that have been removed by bullseye routing
   **/
  public FlowMetricsTopicFlowMetricRecord removedSkillIds(List<String> removedSkillIds) {
    this.removedSkillIds = removedSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID(s) of Skill(s) that have been removed by bullseye routing")
  @JsonProperty("removedSkillIds")
  public List<String> getRemovedSkillIds() {
    return removedSkillIds;
  }
  public void setRemovedSkillIds(List<String> removedSkillIds) {
    this.removedSkillIds = removedSkillIds;
  }


  /**
   * Unique identifier for the language requested for an interaction
   **/
  public FlowMetricsTopicFlowMetricRecord requestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the language requested for an interaction")
  @JsonProperty("requestedLanguageId")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }


  /**
   * Unique identifier(s) for skill(s) requested for an interaction
   **/
  public FlowMetricsTopicFlowMetricRecord requestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier(s) for skill(s) requested for an interaction")
  @JsonProperty("requestedRoutingSkillIds")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }


  /**
   * Routing type(s) for requested/attempted routing methods.
   **/
  public FlowMetricsTopicFlowMetricRecord requestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing type(s) for requested/attempted routing methods.")
  @JsonProperty("requestedRoutings")
  public List<RequestedRoutingsEnum> getRequestedRoutings() {
    return requestedRoutings;
  }
  public void setRequestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
    this.requestedRoutings = requestedRoutings;
  }


  /**
   * Unique identifier for the room
   **/
  public FlowMetricsTopicFlowMetricRecord roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the room")
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  /**
   * Routing priority for the current interaction
   **/
  public FlowMetricsTopicFlowMetricRecord routingPriority(Long routingPriority) {
    this.routingPriority = routingPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing priority for the current interaction")
  @JsonProperty("routingPriority")
  public Long getRoutingPriority() {
    return routingPriority;
  }
  public void setRoutingPriority(Long routingPriority) {
    this.routingPriority = routingPriority;
  }


  /**
   * Routing ring for bullseye or preferred agent routing
   **/
  public FlowMetricsTopicFlowMetricRecord routingRing(Long routingRing) {
    this.routingRing = routingRing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing ring for bullseye or preferred agent routing")
  @JsonProperty("routingRing")
  public Long getRoutingRing() {
    return routingRing;
  }
  public void setRoutingRing(Long routingRing) {
    this.routingRing = routingRing;
  }


  /**
   * Routing rule for preferred, conditional and predictive routing type
   **/
  public FlowMetricsTopicFlowMetricRecord routingRule(String routingRule) {
    this.routingRule = routingRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing rule for preferred, conditional and predictive routing type")
  @JsonProperty("routingRule")
  public String getRoutingRule() {
    return routingRule;
  }
  public void setRoutingRule(String routingRule) {
    this.routingRule = routingRule;
  }


  /**
   * Routing rule type
   **/
  public FlowMetricsTopicFlowMetricRecord routingRuleType(RoutingRuleTypeEnum routingRuleType) {
    this.routingRuleType = routingRuleType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing rule type")
  @JsonProperty("routingRuleType")
  public RoutingRuleTypeEnum getRoutingRuleType() {
    return routingRuleType;
  }
  public void setRoutingRuleType(RoutingRuleTypeEnum routingRuleType) {
    this.routingRuleType = routingRuleType;
  }


  /**
   * Selected agent ID
   **/
  public FlowMetricsTopicFlowMetricRecord selectedAgentId(String selectedAgentId) {
    this.selectedAgentId = selectedAgentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Selected agent ID")
  @JsonProperty("selectedAgentId")
  public String getSelectedAgentId() {
    return selectedAgentId;
  }
  public void setSelectedAgentId(String selectedAgentId) {
    this.selectedAgentId = selectedAgentId;
  }


  /**
   * Selected agent GPR rank
   **/
  public FlowMetricsTopicFlowMetricRecord selectedAgentRank(Long selectedAgentRank) {
    this.selectedAgentRank = selectedAgentRank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Selected agent GPR rank")
  @JsonProperty("selectedAgentRank")
  public Long getSelectedAgentRank() {
    return selectedAgentRank;
  }
  public void setSelectedAgentRank(Long selectedAgentRank) {
    this.selectedAgentRank = selectedAgentRank;
  }


  /**
   * Indicates whether the flow session was self serviced
   **/
  public FlowMetricsTopicFlowMetricRecord selfServed(Boolean selfServed) {
    this.selfServed = selfServed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the flow session was self serviced")
  @JsonProperty("selfServed")
  public Boolean getSelfServed() {
    return selfServed;
  }
  public void setSelfServed(Boolean selfServed) {
    this.selfServed = selfServed;
  }


  /**
   * Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred
   **/
  public FlowMetricsTopicFlowMetricRecord sessionDnis(String sessionDnis) {
    this.sessionDnis = sessionDnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred")
  @JsonProperty("sessionDnis")
  public String getSessionDnis() {
    return sessionDnis;
  }
  public void setSessionDnis(String sessionDnis) {
    this.sessionDnis = sessionDnis;
  }


  /**
   * The unique identifier of this session
   **/
  public FlowMetricsTopicFlowMetricRecord sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of this session")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Flow starting language, e.g. en-us
   **/
  public FlowMetricsTopicFlowMetricRecord startingLanguage(String startingLanguage) {
    this.startingLanguage = startingLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow starting language, e.g. en-us")
  @JsonProperty("startingLanguage")
  public String getStartingLanguage() {
    return startingLanguage;
  }
  public void setStartingLanguage(String startingLanguage) {
    this.startingLanguage = startingLanguage;
  }


  /**
   * Unique identifier for a phone
   **/
  public FlowMetricsTopicFlowMetricRecord stationId(String stationId) {
    this.stationId = stationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for a phone")
  @JsonProperty("stationId")
  public String getStationId() {
    return stationId;
  }
  public void setStationId(String stationId) {
    this.stationId = stationId;
  }


  /**
   * The team ID the user is a member of
   **/
  public FlowMetricsTopicFlowMetricRecord teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team ID the user is a member of")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  /**
   * The address of a flow transfer target, e.g. a phone number, an email address, or a queueId
   **/
  public FlowMetricsTopicFlowMetricRecord transferTargetAddress(String transferTargetAddress) {
    this.transferTargetAddress = transferTargetAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address of a flow transfer target, e.g. a phone number, an email address, or a queueId")
  @JsonProperty("transferTargetAddress")
  public String getTransferTargetAddress() {
    return transferTargetAddress;
  }
  public void setTransferTargetAddress(String transferTargetAddress) {
    this.transferTargetAddress = transferTargetAddress;
  }


  /**
   * The name of a flow transfer target
   **/
  public FlowMetricsTopicFlowMetricRecord transferTargetName(String transferTargetName) {
    this.transferTargetName = transferTargetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of a flow transfer target")
  @JsonProperty("transferTargetName")
  public String getTransferTargetName() {
    return transferTargetName;
  }
  public void setTransferTargetName(String transferTargetName) {
    this.transferTargetName = transferTargetName;
  }


  /**
   * The type of transfer for flows that ended with a transfer
   **/
  public FlowMetricsTopicFlowMetricRecord transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of transfer for flows that ended with a transfer")
  @JsonProperty("transferType")
  public String getTransferType() {
    return transferType;
  }
  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }


  /**
   * Complete routing method
   **/
  public FlowMetricsTopicFlowMetricRecord usedRouting(UsedRoutingEnum usedRouting) {
    this.usedRouting = usedRouting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complete routing method")
  @JsonProperty("usedRouting")
  public UsedRoutingEnum getUsedRouting() {
    return usedRouting;
  }
  public void setUsedRouting(UsedRoutingEnum usedRouting) {
    this.usedRouting = usedRouting;
  }


  /**
   * Unique identifier for the user
   **/
  public FlowMetricsTopicFlowMetricRecord userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Flag indicating if video is present
   **/
  public FlowMetricsTopicFlowMetricRecord videoPresent(Boolean videoPresent) {
    this.videoPresent = videoPresent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicating if video is present")
  @JsonProperty("videoPresent")
  public Boolean getVideoPresent() {
    return videoPresent;
  }
  public void setVideoPresent(Boolean videoPresent) {
    this.videoPresent = videoPresent;
  }


  /**
   * Number of waiting interactions for each predictive routing attempt
   **/
  public FlowMetricsTopicFlowMetricRecord waitingInteractionCounts(List<Long> waitingInteractionCounts) {
    this.waitingInteractionCounts = waitingInteractionCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of waiting interactions for each predictive routing attempt")
  @JsonProperty("waitingInteractionCounts")
  public List<Long> getWaitingInteractionCounts() {
    return waitingInteractionCounts;
  }
  public void setWaitingInteractionCounts(List<Long> waitingInteractionCounts) {
    this.waitingInteractionCounts = waitingInteractionCounts;
  }


  /**
   * Wrap up code
   **/
  public FlowMetricsTopicFlowMetricRecord wrapUpCode(String wrapUpCode) {
    this.wrapUpCode = wrapUpCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wrap up code")
  @JsonProperty("wrapUpCode")
  public String getWrapUpCode() {
    return wrapUpCode;
  }
  public void setWrapUpCode(String wrapUpCode) {
    this.wrapUpCode = wrapUpCode;
  }


  /**
   * Proposed agents
   **/
  public FlowMetricsTopicFlowMetricRecord proposedAgents(List<FlowMetricsTopicFlowProposedAgent> proposedAgents) {
    this.proposedAgents = proposedAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposed agents")
  @JsonProperty("proposedAgents")
  public List<FlowMetricsTopicFlowProposedAgent> getProposedAgents() {
    return proposedAgents;
  }
  public void setProposedAgents(List<FlowMetricsTopicFlowProposedAgent> proposedAgents) {
    this.proposedAgents = proposedAgents;
  }


  /**
   * Flow outcomes
   **/
  public FlowMetricsTopicFlowMetricRecord outcomes(List<FlowMetricsTopicFlowOutcome> outcomes) {
    this.outcomes = outcomes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow outcomes")
  @JsonProperty("outcomes")
  public List<FlowMetricsTopicFlowOutcome> getOutcomes() {
    return outcomes;
  }
  public void setOutcomes(List<FlowMetricsTopicFlowOutcome> outcomes) {
    this.outcomes = outcomes;
  }


  /**
   * Scored agents
   **/
  public FlowMetricsTopicFlowMetricRecord scoredAgents(List<FlowMetricsTopicFlowScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scored agents")
  @JsonProperty("scoredAgents")
  public List<FlowMetricsTopicFlowScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<FlowMetricsTopicFlowScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowMetricsTopicFlowMetricRecord flowMetricsTopicFlowMetricRecord = (FlowMetricsTopicFlowMetricRecord) o;

    return Objects.equals(this.metric, flowMetricsTopicFlowMetricRecord.metric) &&
            Objects.equals(this.metricDate, flowMetricsTopicFlowMetricRecord.metricDate) &&
            Objects.equals(this.value, flowMetricsTopicFlowMetricRecord.value) &&
            Objects.equals(this.recordId, flowMetricsTopicFlowMetricRecord.recordId) &&
            Objects.equals(this.activeRouting, flowMetricsTopicFlowMetricRecord.activeRouting) &&
            Objects.equals(this.activeSkillIds, flowMetricsTopicFlowMetricRecord.activeSkillIds) &&
            Objects.equals(this.addressFrom, flowMetricsTopicFlowMetricRecord.addressFrom) &&
            Objects.equals(this.addressTo, flowMetricsTopicFlowMetricRecord.addressTo) &&
            Objects.equals(this.agentAssistantId, flowMetricsTopicFlowMetricRecord.agentAssistantId) &&
            Objects.equals(this.agentBullseyeRing, flowMetricsTopicFlowMetricRecord.agentBullseyeRing) &&
            Objects.equals(this.agentOwned, flowMetricsTopicFlowMetricRecord.agentOwned) &&
            Objects.equals(this.ani, flowMetricsTopicFlowMetricRecord.ani) &&
            Objects.equals(this.assignerId, flowMetricsTopicFlowMetricRecord.assignerId) &&
            Objects.equals(this.authenticated, flowMetricsTopicFlowMetricRecord.authenticated) &&
            Objects.equals(this.conversationId, flowMetricsTopicFlowMetricRecord.conversationId) &&
            Objects.equals(this.conversationInitiator, flowMetricsTopicFlowMetricRecord.conversationInitiator) &&
            Objects.equals(this.convertedFrom, flowMetricsTopicFlowMetricRecord.convertedFrom) &&
            Objects.equals(this.convertedTo, flowMetricsTopicFlowMetricRecord.convertedTo) &&
            Objects.equals(this.customerParticipation, flowMetricsTopicFlowMetricRecord.customerParticipation) &&
            Objects.equals(this.deliveryStatus, flowMetricsTopicFlowMetricRecord.deliveryStatus) &&
            Objects.equals(this.destinationAddresses, flowMetricsTopicFlowMetricRecord.destinationAddresses) &&
            Objects.equals(this.direction, flowMetricsTopicFlowMetricRecord.direction) &&
            Objects.equals(this.disconnectType, flowMetricsTopicFlowMetricRecord.disconnectType) &&
            Objects.equals(this.divisionIds, flowMetricsTopicFlowMetricRecord.divisionIds) &&
            Objects.equals(this.dnis, flowMetricsTopicFlowMetricRecord.dnis) &&
            Objects.equals(this.edgeId, flowMetricsTopicFlowMetricRecord.edgeId) &&
            Objects.equals(this.eligibleAgentCounts, flowMetricsTopicFlowMetricRecord.eligibleAgentCounts) &&
            Objects.equals(this.endingLanguage, flowMetricsTopicFlowMetricRecord.endingLanguage) &&
            Objects.equals(this.entryReason, flowMetricsTopicFlowMetricRecord.entryReason) &&
            Objects.equals(this.entryType, flowMetricsTopicFlowMetricRecord.entryType) &&
            Objects.equals(this.errorCode, flowMetricsTopicFlowMetricRecord.errorCode) &&
            Objects.equals(this.exitReason, flowMetricsTopicFlowMetricRecord.exitReason) &&
            Objects.equals(this.extendedDeliveryStatus, flowMetricsTopicFlowMetricRecord.extendedDeliveryStatus) &&
            Objects.equals(this.externalContactId, flowMetricsTopicFlowMetricRecord.externalContactId) &&
            Objects.equals(this.externalMediaCount, flowMetricsTopicFlowMetricRecord.externalMediaCount) &&
            Objects.equals(this.externalOrganizationId, flowMetricsTopicFlowMetricRecord.externalOrganizationId) &&
            Objects.equals(this.externalTag, flowMetricsTopicFlowMetricRecord.externalTag) &&
            Objects.equals(this.firstQueue, flowMetricsTopicFlowMetricRecord.firstQueue) &&
            Objects.equals(this.flaggedReason, flowMetricsTopicFlowMetricRecord.flaggedReason) &&
            Objects.equals(this.flowId, flowMetricsTopicFlowMetricRecord.flowId) &&
            Objects.equals(this.flowInType, flowMetricsTopicFlowMetricRecord.flowInType) &&
            Objects.equals(this.flowMilestoneIds, flowMetricsTopicFlowMetricRecord.flowMilestoneIds) &&
            Objects.equals(this.flowName, flowMetricsTopicFlowMetricRecord.flowName) &&
            Objects.equals(this.flowOutType, flowMetricsTopicFlowMetricRecord.flowOutType) &&
            Objects.equals(this.flowSubType, flowMetricsTopicFlowMetricRecord.flowSubType) &&
            Objects.equals(this.flowType, flowMetricsTopicFlowMetricRecord.flowType) &&
            Objects.equals(this.flowVersion, flowMetricsTopicFlowMetricRecord.flowVersion) &&
            Objects.equals(this.groupId, flowMetricsTopicFlowMetricRecord.groupId) &&
            Objects.equals(this.interactionType, flowMetricsTopicFlowMetricRecord.interactionType) &&
            Objects.equals(this.journeyActionId, flowMetricsTopicFlowMetricRecord.journeyActionId) &&
            Objects.equals(this.journeyActionMapId, flowMetricsTopicFlowMetricRecord.journeyActionMapId) &&
            Objects.equals(this.journeyActionMapVersion, flowMetricsTopicFlowMetricRecord.journeyActionMapVersion) &&
            Objects.equals(this.journeyCustomerId, flowMetricsTopicFlowMetricRecord.journeyCustomerId) &&
            Objects.equals(this.journeyCustomerIdType, flowMetricsTopicFlowMetricRecord.journeyCustomerIdType) &&
            Objects.equals(this.journeyCustomerSessionId, flowMetricsTopicFlowMetricRecord.journeyCustomerSessionId) &&
            Objects.equals(this.journeyCustomerSessionIdType, flowMetricsTopicFlowMetricRecord.journeyCustomerSessionIdType) &&
            Objects.equals(this.knowledgeBaseId, flowMetricsTopicFlowMetricRecord.knowledgeBaseId) &&
            Objects.equals(this.mediaCount, flowMetricsTopicFlowMetricRecord.mediaCount) &&
            Objects.equals(this.mediaType, flowMetricsTopicFlowMetricRecord.mediaType) &&
            Objects.equals(this.messageType, flowMetricsTopicFlowMetricRecord.messageType) &&
            Objects.equals(this.originatingDirection, flowMetricsTopicFlowMetricRecord.originatingDirection) &&
            Objects.equals(this.outboundCampaignId, flowMetricsTopicFlowMetricRecord.outboundCampaignId) &&
            Objects.equals(this.outboundContactId, flowMetricsTopicFlowMetricRecord.outboundContactId) &&
            Objects.equals(this.outboundContactListId, flowMetricsTopicFlowMetricRecord.outboundContactListId) &&
            Objects.equals(this.participantName, flowMetricsTopicFlowMetricRecord.participantName) &&
            Objects.equals(this.peerId, flowMetricsTopicFlowMetricRecord.peerId) &&
            Objects.equals(this.provider, flowMetricsTopicFlowMetricRecord.provider) &&
            Objects.equals(this.purpose, flowMetricsTopicFlowMetricRecord.purpose) &&
            Objects.equals(this.queueId, flowMetricsTopicFlowMetricRecord.queueId) &&
            Objects.equals(this.recognitionFailureReason, flowMetricsTopicFlowMetricRecord.recognitionFailureReason) &&
            Objects.equals(this.remote, flowMetricsTopicFlowMetricRecord.remote) &&
            Objects.equals(this.removedSkillIds, flowMetricsTopicFlowMetricRecord.removedSkillIds) &&
            Objects.equals(this.requestedLanguageId, flowMetricsTopicFlowMetricRecord.requestedLanguageId) &&
            Objects.equals(this.requestedRoutingSkillIds, flowMetricsTopicFlowMetricRecord.requestedRoutingSkillIds) &&
            Objects.equals(this.requestedRoutings, flowMetricsTopicFlowMetricRecord.requestedRoutings) &&
            Objects.equals(this.roomId, flowMetricsTopicFlowMetricRecord.roomId) &&
            Objects.equals(this.routingPriority, flowMetricsTopicFlowMetricRecord.routingPriority) &&
            Objects.equals(this.routingRing, flowMetricsTopicFlowMetricRecord.routingRing) &&
            Objects.equals(this.routingRule, flowMetricsTopicFlowMetricRecord.routingRule) &&
            Objects.equals(this.routingRuleType, flowMetricsTopicFlowMetricRecord.routingRuleType) &&
            Objects.equals(this.selectedAgentId, flowMetricsTopicFlowMetricRecord.selectedAgentId) &&
            Objects.equals(this.selectedAgentRank, flowMetricsTopicFlowMetricRecord.selectedAgentRank) &&
            Objects.equals(this.selfServed, flowMetricsTopicFlowMetricRecord.selfServed) &&
            Objects.equals(this.sessionDnis, flowMetricsTopicFlowMetricRecord.sessionDnis) &&
            Objects.equals(this.sessionId, flowMetricsTopicFlowMetricRecord.sessionId) &&
            Objects.equals(this.startingLanguage, flowMetricsTopicFlowMetricRecord.startingLanguage) &&
            Objects.equals(this.stationId, flowMetricsTopicFlowMetricRecord.stationId) &&
            Objects.equals(this.teamId, flowMetricsTopicFlowMetricRecord.teamId) &&
            Objects.equals(this.transferTargetAddress, flowMetricsTopicFlowMetricRecord.transferTargetAddress) &&
            Objects.equals(this.transferTargetName, flowMetricsTopicFlowMetricRecord.transferTargetName) &&
            Objects.equals(this.transferType, flowMetricsTopicFlowMetricRecord.transferType) &&
            Objects.equals(this.usedRouting, flowMetricsTopicFlowMetricRecord.usedRouting) &&
            Objects.equals(this.userId, flowMetricsTopicFlowMetricRecord.userId) &&
            Objects.equals(this.videoPresent, flowMetricsTopicFlowMetricRecord.videoPresent) &&
            Objects.equals(this.waitingInteractionCounts, flowMetricsTopicFlowMetricRecord.waitingInteractionCounts) &&
            Objects.equals(this.wrapUpCode, flowMetricsTopicFlowMetricRecord.wrapUpCode) &&
            Objects.equals(this.proposedAgents, flowMetricsTopicFlowMetricRecord.proposedAgents) &&
            Objects.equals(this.outcomes, flowMetricsTopicFlowMetricRecord.outcomes) &&
            Objects.equals(this.scoredAgents, flowMetricsTopicFlowMetricRecord.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, metricDate, value, recordId, activeRouting, activeSkillIds, addressFrom, addressTo, agentAssistantId, agentBullseyeRing, agentOwned, ani, assignerId, authenticated, conversationId, conversationInitiator, convertedFrom, convertedTo, customerParticipation, deliveryStatus, destinationAddresses, direction, disconnectType, divisionIds, dnis, edgeId, eligibleAgentCounts, endingLanguage, entryReason, entryType, errorCode, exitReason, extendedDeliveryStatus, externalContactId, externalMediaCount, externalOrganizationId, externalTag, firstQueue, flaggedReason, flowId, flowInType, flowMilestoneIds, flowName, flowOutType, flowSubType, flowType, flowVersion, groupId, interactionType, journeyActionId, journeyActionMapId, journeyActionMapVersion, journeyCustomerId, journeyCustomerIdType, journeyCustomerSessionId, journeyCustomerSessionIdType, knowledgeBaseId, mediaCount, mediaType, messageType, originatingDirection, outboundCampaignId, outboundContactId, outboundContactListId, participantName, peerId, provider, purpose, queueId, recognitionFailureReason, remote, removedSkillIds, requestedLanguageId, requestedRoutingSkillIds, requestedRoutings, roomId, routingPriority, routingRing, routingRule, routingRuleType, selectedAgentId, selectedAgentRank, selfServed, sessionDnis, sessionId, startingLanguage, stationId, teamId, transferTargetAddress, transferTargetName, transferType, usedRouting, userId, videoPresent, waitingInteractionCounts, wrapUpCode, proposedAgents, outcomes, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowMetricsTopicFlowMetricRecord {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    metricDate: ").append(toIndentedString(metricDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    activeRouting: ").append(toIndentedString(activeRouting)).append("\n");
    sb.append("    activeSkillIds: ").append(toIndentedString(activeSkillIds)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    agentAssistantId: ").append(toIndentedString(agentAssistantId)).append("\n");
    sb.append("    agentBullseyeRing: ").append(toIndentedString(agentBullseyeRing)).append("\n");
    sb.append("    agentOwned: ").append(toIndentedString(agentOwned)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    assignerId: ").append(toIndentedString(assignerId)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationInitiator: ").append(toIndentedString(conversationInitiator)).append("\n");
    sb.append("    convertedFrom: ").append(toIndentedString(convertedFrom)).append("\n");
    sb.append("    convertedTo: ").append(toIndentedString(convertedTo)).append("\n");
    sb.append("    customerParticipation: ").append(toIndentedString(customerParticipation)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    destinationAddresses: ").append(toIndentedString(destinationAddresses)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    eligibleAgentCounts: ").append(toIndentedString(eligibleAgentCounts)).append("\n");
    sb.append("    endingLanguage: ").append(toIndentedString(endingLanguage)).append("\n");
    sb.append("    entryReason: ").append(toIndentedString(entryReason)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    exitReason: ").append(toIndentedString(exitReason)).append("\n");
    sb.append("    extendedDeliveryStatus: ").append(toIndentedString(extendedDeliveryStatus)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalMediaCount: ").append(toIndentedString(externalMediaCount)).append("\n");
    sb.append("    externalOrganizationId: ").append(toIndentedString(externalOrganizationId)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    firstQueue: ").append(toIndentedString(firstQueue)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowInType: ").append(toIndentedString(flowInType)).append("\n");
    sb.append("    flowMilestoneIds: ").append(toIndentedString(flowMilestoneIds)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    flowOutType: ").append(toIndentedString(flowOutType)).append("\n");
    sb.append("    flowSubType: ").append(toIndentedString(flowSubType)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    journeyActionId: ").append(toIndentedString(journeyActionId)).append("\n");
    sb.append("    journeyActionMapId: ").append(toIndentedString(journeyActionMapId)).append("\n");
    sb.append("    journeyActionMapVersion: ").append(toIndentedString(journeyActionMapVersion)).append("\n");
    sb.append("    journeyCustomerId: ").append(toIndentedString(journeyCustomerId)).append("\n");
    sb.append("    journeyCustomerIdType: ").append(toIndentedString(journeyCustomerIdType)).append("\n");
    sb.append("    journeyCustomerSessionId: ").append(toIndentedString(journeyCustomerSessionId)).append("\n");
    sb.append("    journeyCustomerSessionIdType: ").append(toIndentedString(journeyCustomerSessionIdType)).append("\n");
    sb.append("    knowledgeBaseId: ").append(toIndentedString(knowledgeBaseId)).append("\n");
    sb.append("    mediaCount: ").append(toIndentedString(mediaCount)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    originatingDirection: ").append(toIndentedString(originatingDirection)).append("\n");
    sb.append("    outboundCampaignId: ").append(toIndentedString(outboundCampaignId)).append("\n");
    sb.append("    outboundContactId: ").append(toIndentedString(outboundContactId)).append("\n");
    sb.append("    outboundContactListId: ").append(toIndentedString(outboundContactListId)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    recognitionFailureReason: ").append(toIndentedString(recognitionFailureReason)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    removedSkillIds: ").append(toIndentedString(removedSkillIds)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedRoutings: ").append(toIndentedString(requestedRoutings)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    routingPriority: ").append(toIndentedString(routingPriority)).append("\n");
    sb.append("    routingRing: ").append(toIndentedString(routingRing)).append("\n");
    sb.append("    routingRule: ").append(toIndentedString(routingRule)).append("\n");
    sb.append("    routingRuleType: ").append(toIndentedString(routingRuleType)).append("\n");
    sb.append("    selectedAgentId: ").append(toIndentedString(selectedAgentId)).append("\n");
    sb.append("    selectedAgentRank: ").append(toIndentedString(selectedAgentRank)).append("\n");
    sb.append("    selfServed: ").append(toIndentedString(selfServed)).append("\n");
    sb.append("    sessionDnis: ").append(toIndentedString(sessionDnis)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    startingLanguage: ").append(toIndentedString(startingLanguage)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    transferTargetAddress: ").append(toIndentedString(transferTargetAddress)).append("\n");
    sb.append("    transferTargetName: ").append(toIndentedString(transferTargetName)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    usedRouting: ").append(toIndentedString(usedRouting)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    videoPresent: ").append(toIndentedString(videoPresent)).append("\n");
    sb.append("    waitingInteractionCounts: ").append(toIndentedString(waitingInteractionCounts)).append("\n");
    sb.append("    wrapUpCode: ").append(toIndentedString(wrapUpCode)).append("\n");
    sb.append("    proposedAgents: ").append(toIndentedString(proposedAgents)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
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

