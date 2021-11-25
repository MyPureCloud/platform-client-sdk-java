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
import com.mypurecloud.sdk.v2.model.AnalyticsConversationSegment;
import com.mypurecloud.sdk.v2.model.AnalyticsFlow;
import com.mypurecloud.sdk.v2.model.AnalyticsMediaEndpointStat;
import com.mypurecloud.sdk.v2.model.AnalyticsProposedAgent;
import com.mypurecloud.sdk.v2.model.AnalyticsSessionMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsSession
 */

public class AnalyticsSession  implements Serializable {
  
  private List<String> activeSkillIds = new ArrayList<String>();
  private Boolean acwSkipped = null;
  private String addressFrom = null;
  private String addressOther = null;
  private String addressSelf = null;
  private String addressTo = null;
  private String agentAssistantId = null;
  private Integer agentBullseyeRing = null;
  private Boolean agentOwned = null;
  private String ani = null;
  private String assignerId = null;
  private Boolean authenticated = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private Date callbackScheduledTime = null;
  private String callbackUserName = null;
  private String coachedParticipantId = null;
  private String cobrowseRole = null;
  private String cobrowseRoomId = null;

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
    DELIVERYSUCCESS("DeliverySuccess"),
    FAILED("Failed"),
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
  private Date deliveryStatusChangeDate = null;
  private List<String> destinationAddresses = new ArrayList<String>();

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
  private String dispositionAnalyzer = null;
  private String dispositionName = null;
  private String dnis = null;
  private String edgeId = null;
  private List<Integer> eligibleAgentCounts = new ArrayList<Integer>();
  private String flowInType = null;
  private String flowOutType = null;
  private String journeyActionId = null;
  private String journeyActionMapId = null;
  private Integer journeyActionMapVersion = null;
  private String journeyCustomerId = null;
  private String journeyCustomerIdType = null;
  private String journeyCustomerSessionId = null;
  private String journeyCustomerSessionIdType = null;
  private String mediaBridgeId = null;
  private Integer mediaCount = null;

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
  private String monitoredParticipantId = null;
  private String outboundCampaignId = null;
  private String outboundContactId = null;
  private String outboundContactListId = null;
  private String peerId = null;
  private String protocolCallId = null;
  private String provider = null;
  private Boolean recording = null;
  private String remote = null;
  private String remoteNameDisplayable = null;
  private List<String> removedSkillIds = new ArrayList<String>();

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
    BULLSEYE("Bullseye"),
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard");

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
  private String roomId = null;
  private Integer routingRing = null;
  private String screenShareAddressSelf = null;
  private String screenShareRoomId = null;
  private String scriptId = null;
  private String selectedAgentId = null;
  private Integer selectedAgentRank = null;
  private String sessionDnis = null;
  private String sessionId = null;
  private Boolean sharingScreen = null;
  private Boolean skipEnabled = null;
  private Integer timeoutSeconds = null;

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
    LAST("Last"),
    MANUAL("Manual"),
    PREDICTIVE("Predictive"),
    PREFERRED("Preferred"),
    STANDARD("Standard");

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
  private String videoAddressSelf = null;
  private String videoRoomId = null;
  private List<Integer> waitingInteractionCounts = new ArrayList<Integer>();
  private List<AnalyticsProposedAgent> proposedAgents = new ArrayList<AnalyticsProposedAgent>();
  private List<AnalyticsMediaEndpointStat> mediaEndpointStats = new ArrayList<AnalyticsMediaEndpointStat>();
  private AnalyticsFlow flow = null;
  private List<AnalyticsSessionMetric> metrics = new ArrayList<AnalyticsSessionMetric>();
  private List<AnalyticsConversationSegment> segments = new ArrayList<AnalyticsConversationSegment>();

  
  /**
   * ID(s) of Skill(s) that are active on the conversation
   **/
  public AnalyticsSession activeSkillIds(List<String> activeSkillIds) {
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
   * Marker for an agent that skipped after call work
   **/
  public AnalyticsSession acwSkipped(Boolean acwSkipped) {
    this.acwSkipped = acwSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Marker for an agent that skipped after call work")
  @JsonProperty("acwSkipped")
  public Boolean getAcwSkipped() {
    return acwSkipped;
  }
  public void setAcwSkipped(Boolean acwSkipped) {
    this.acwSkipped = acwSkipped;
  }

  
  /**
   * The address that initiated an action
   **/
  public AnalyticsSession addressFrom(String addressFrom) {
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
   * The email address for the participant on the other side of the email conversation
   **/
  public AnalyticsSession addressOther(String addressOther) {
    this.addressOther = addressOther;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address for the participant on the other side of the email conversation")
  @JsonProperty("addressOther")
  public String getAddressOther() {
    return addressOther;
  }
  public void setAddressOther(String addressOther) {
    this.addressOther = addressOther;
  }

  
  /**
   * The email address for the participant on this side of the email conversation
   **/
  public AnalyticsSession addressSelf(String addressSelf) {
    this.addressSelf = addressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address for the participant on this side of the email conversation")
  @JsonProperty("addressSelf")
  public String getAddressSelf() {
    return addressSelf;
  }
  public void setAddressSelf(String addressSelf) {
    this.addressSelf = addressSelf;
  }

  
  /**
   * The address receiving an action
   **/
  public AnalyticsSession addressTo(String addressTo) {
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
  public AnalyticsSession agentAssistantId(String agentAssistantId) {
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
  public AnalyticsSession agentBullseyeRing(Integer agentBullseyeRing) {
    this.agentBullseyeRing = agentBullseyeRing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bullseye ring of the targeted agent")
  @JsonProperty("agentBullseyeRing")
  public Integer getAgentBullseyeRing() {
    return agentBullseyeRing;
  }
  public void setAgentBullseyeRing(Integer agentBullseyeRing) {
    this.agentBullseyeRing = agentBullseyeRing;
  }

  
  /**
   * Flag indicating an agent-owned callback
   **/
  public AnalyticsSession agentOwned(Boolean agentOwned) {
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
  public AnalyticsSession ani(String ani) {
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
  public AnalyticsSession assignerId(String assignerId) {
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
  public AnalyticsSession authenticated(Boolean authenticated) {
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
   * Callback phone number(s)
   **/
  public AnalyticsSession callbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Callback phone number(s)")
  @JsonProperty("callbackNumbers")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  
  /**
   * Scheduled callback date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsSession callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduled callback date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }

  
  /**
   * The name of the user requesting a call back
   **/
  public AnalyticsSession callbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the user requesting a call back")
  @JsonProperty("callbackUserName")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  
  /**
   * The participantId being coached (if someone (e.g. an agent) is being coached, this would correspond to one of the other participantIds present in the conversation)
   **/
  public AnalyticsSession coachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participantId being coached (if someone (e.g. an agent) is being coached, this would correspond to one of the other participantIds present in the conversation)")
  @JsonProperty("coachedParticipantId")
  public String getCoachedParticipantId() {
    return coachedParticipantId;
  }
  public void setCoachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
  }

  
  /**
   * Describes side of the cobrowse (sharer or viewer)
   **/
  public AnalyticsSession cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes side of the cobrowse (sharer or viewer)")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }

  
  /**
   * A unique identifier for a PureCloud cobrowse room
   **/
  public AnalyticsSession cobrowseRoomId(String cobrowseRoomId) {
    this.cobrowseRoomId = cobrowseRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a PureCloud cobrowse room")
  @JsonProperty("cobrowseRoomId")
  public String getCobrowseRoomId() {
    return cobrowseRoomId;
  }
  public void setCobrowseRoomId(String cobrowseRoomId) {
    this.cobrowseRoomId = cobrowseRoomId;
  }

  
  /**
   * The email or SMS delivery status
   **/
  public AnalyticsSession deliveryStatus(DeliveryStatusEnum deliveryStatus) {
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
   * Date and time of the most recent delivery status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsSession deliveryStatusChangeDate(Date deliveryStatusChangeDate) {
    this.deliveryStatusChangeDate = deliveryStatusChangeDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time of the most recent delivery status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("deliveryStatusChangeDate")
  public Date getDeliveryStatusChangeDate() {
    return deliveryStatusChangeDate;
  }
  public void setDeliveryStatusChangeDate(Date deliveryStatusChangeDate) {
    this.deliveryStatusChangeDate = deliveryStatusChangeDate;
  }

  
  /**
   * Destination address(es) of transfers or consults
   **/
  public AnalyticsSession destinationAddresses(List<String> destinationAddresses) {
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
  public AnalyticsSession direction(DirectionEnum direction) {
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
   * (Dialer) Analyzer (for example speech.person)
   **/
  public AnalyticsSession dispositionAnalyzer(String dispositionAnalyzer) {
    this.dispositionAnalyzer = dispositionAnalyzer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Analyzer (for example speech.person)")
  @JsonProperty("dispositionAnalyzer")
  public String getDispositionAnalyzer() {
    return dispositionAnalyzer;
  }
  public void setDispositionAnalyzer(String dispositionAnalyzer) {
    this.dispositionAnalyzer = dispositionAnalyzer;
  }

  
  /**
   * (Dialer) Result of the analysis (for example disposition.classification.callable.machine)
   **/
  public AnalyticsSession dispositionName(String dispositionName) {
    this.dispositionName = dispositionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Result of the analysis (for example disposition.classification.callable.machine)")
  @JsonProperty("dispositionName")
  public String getDispositionName() {
    return dispositionName;
  }
  public void setDispositionName(String dispositionName) {
    this.dispositionName = dispositionName;
  }

  
  /**
   * Dialed number identification service (number dialed by the calling party)
   **/
  public AnalyticsSession dnis(String dnis) {
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
  public AnalyticsSession edgeId(String edgeId) {
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
  public AnalyticsSession eligibleAgentCounts(List<Integer> eligibleAgentCounts) {
    this.eligibleAgentCounts = eligibleAgentCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of eligible agents for each predictive routing attempt")
  @JsonProperty("eligibleAgentCounts")
  public List<Integer> getEligibleAgentCounts() {
    return eligibleAgentCounts;
  }
  public void setEligibleAgentCounts(List<Integer> eligibleAgentCounts) {
    this.eligibleAgentCounts = eligibleAgentCounts;
  }

  
  /**
   * Type of flow in that occurred when entering ACD.
   **/
  public AnalyticsSession flowInType(String flowInType) {
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
   * Type of flow out that occurred when emitting tFlowOut.
   **/
  public AnalyticsSession flowOutType(String flowOutType) {
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
   * Identifier of the journey action.
   **/
  public AnalyticsSession journeyActionId(String journeyActionId) {
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
  public AnalyticsSession journeyActionMapId(String journeyActionMapId) {
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
  public AnalyticsSession journeyActionMapVersion(Integer journeyActionMapVersion) {
    this.journeyActionMapVersion = journeyActionMapVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of the journey action map that triggered the action.")
  @JsonProperty("journeyActionMapVersion")
  public Integer getJourneyActionMapVersion() {
    return journeyActionMapVersion;
  }
  public void setJourneyActionMapVersion(Integer journeyActionMapVersion) {
    this.journeyActionMapVersion = journeyActionMapVersion;
  }

  
  /**
   * Primary identifier of the journey customer in the source where the activities originate from.
   **/
  public AnalyticsSession journeyCustomerId(String journeyCustomerId) {
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
  public AnalyticsSession journeyCustomerIdType(String journeyCustomerIdType) {
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
  public AnalyticsSession journeyCustomerSessionId(String journeyCustomerSessionId) {
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
  public AnalyticsSession journeyCustomerSessionIdType(String journeyCustomerSessionIdType) {
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
   * Media bridge ID for the conference session consistent across all participants
   **/
  public AnalyticsSession mediaBridgeId(String mediaBridgeId) {
    this.mediaBridgeId = mediaBridgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media bridge ID for the conference session consistent across all participants")
  @JsonProperty("mediaBridgeId")
  public String getMediaBridgeId() {
    return mediaBridgeId;
  }
  public void setMediaBridgeId(String mediaBridgeId) {
    this.mediaBridgeId = mediaBridgeId;
  }

  
  /**
   * Count of any media (images, files, etc) included in this session
   **/
  public AnalyticsSession mediaCount(Integer mediaCount) {
    this.mediaCount = mediaCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of any media (images, files, etc) included in this session")
  @JsonProperty("mediaCount")
  public Integer getMediaCount() {
    return mediaCount;
  }
  public void setMediaCount(Integer mediaCount) {
    this.mediaCount = mediaCount;
  }

  
  /**
   * The session media type
   **/
  public AnalyticsSession mediaType(MediaTypeEnum mediaType) {
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
  public AnalyticsSession messageType(String messageType) {
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
   * The participantId being monitored (if someone (e.g. an agent) is being monitored, this would correspond to one of the other participantIds present in the conversation)
   **/
  public AnalyticsSession monitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participantId being monitored (if someone (e.g. an agent) is being monitored, this would correspond to one of the other participantIds present in the conversation)")
  @JsonProperty("monitoredParticipantId")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }

  
  /**
   * (Dialer) Unique identifier of the outbound campaign
   **/
  public AnalyticsSession outboundCampaignId(String outboundCampaignId) {
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
  public AnalyticsSession outboundContactId(String outboundContactId) {
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
  public AnalyticsSession outboundContactListId(String outboundContactListId) {
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
   * This identifies pairs of related sessions on a conversation. E.g. an external session’s peerId will be the session that the call originally connected to, e.g. if an IVR was dialed, the IVR session, which will also have the external session’s ID as its peer. After that point, any transfers of that session to other internal components (acd, agent, etc.) will all spawn new sessions whose peerIds point back to that original external session.
   **/
  public AnalyticsSession peerId(String peerId) {
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
   * The original voice protocol call ID, e.g. a SIP call ID
   **/
  public AnalyticsSession protocolCallId(String protocolCallId) {
    this.protocolCallId = protocolCallId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The original voice protocol call ID, e.g. a SIP call ID")
  @JsonProperty("protocolCallId")
  public String getProtocolCallId() {
    return protocolCallId;
  }
  public void setProtocolCallId(String protocolCallId) {
    this.protocolCallId = protocolCallId;
  }

  
  /**
   * The source provider for the communication.
   **/
  public AnalyticsSession provider(String provider) {
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
   * Flag determining if an audio recording was started or not
   **/
  public AnalyticsSession recording(Boolean recording) {
    this.recording = recording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag determining if an audio recording was started or not")
  @JsonProperty("recording")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
  }

  
  /**
   * Name, phone number, or email address of the remote party.
   **/
  public AnalyticsSession remote(String remote) {
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
   * Unique identifier for the remote party
   **/
  public AnalyticsSession remoteNameDisplayable(String remoteNameDisplayable) {
    this.remoteNameDisplayable = remoteNameDisplayable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the remote party")
  @JsonProperty("remoteNameDisplayable")
  public String getRemoteNameDisplayable() {
    return remoteNameDisplayable;
  }
  public void setRemoteNameDisplayable(String remoteNameDisplayable) {
    this.remoteNameDisplayable = remoteNameDisplayable;
  }

  
  /**
   * ID(s) of Skill(s) that have been removed by bullseye routing
   **/
  public AnalyticsSession removedSkillIds(List<String> removedSkillIds) {
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
   * Routing type(s) for requested/attempted routing methods.
   **/
  public AnalyticsSession requestedRoutings(List<RequestedRoutingsEnum> requestedRoutings) {
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
  public AnalyticsSession roomId(String roomId) {
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
   * Routing ring for bullseye or preferred agent routing
   **/
  public AnalyticsSession routingRing(Integer routingRing) {
    this.routingRing = routingRing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing ring for bullseye or preferred agent routing")
  @JsonProperty("routingRing")
  public Integer getRoutingRing() {
    return routingRing;
  }
  public void setRoutingRing(Integer routingRing) {
    this.routingRing = routingRing;
  }

  
  /**
   * Direct ScreenShare address
   **/
  public AnalyticsSession screenShareAddressSelf(String screenShareAddressSelf) {
    this.screenShareAddressSelf = screenShareAddressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direct ScreenShare address")
  @JsonProperty("screenShareAddressSelf")
  public String getScreenShareAddressSelf() {
    return screenShareAddressSelf;
  }
  public void setScreenShareAddressSelf(String screenShareAddressSelf) {
    this.screenShareAddressSelf = screenShareAddressSelf;
  }

  
  /**
   * A unique identifier for a PureCloud ScreenShare room
   **/
  public AnalyticsSession screenShareRoomId(String screenShareRoomId) {
    this.screenShareRoomId = screenShareRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a PureCloud ScreenShare room")
  @JsonProperty("screenShareRoomId")
  public String getScreenShareRoomId() {
    return screenShareRoomId;
  }
  public void setScreenShareRoomId(String screenShareRoomId) {
    this.screenShareRoomId = screenShareRoomId;
  }

  
  /**
   * A unique identifier for a script
   **/
  public AnalyticsSession scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a script")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   * Selected agent ID
   **/
  public AnalyticsSession selectedAgentId(String selectedAgentId) {
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
  public AnalyticsSession selectedAgentRank(Integer selectedAgentRank) {
    this.selectedAgentRank = selectedAgentRank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Selected agent GPR rank")
  @JsonProperty("selectedAgentRank")
  public Integer getSelectedAgentRank() {
    return selectedAgentRank;
  }
  public void setSelectedAgentRank(Integer selectedAgentRank) {
    this.selectedAgentRank = selectedAgentRank;
  }

  
  /**
   * Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred
   **/
  public AnalyticsSession sessionDnis(String sessionDnis) {
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
  public AnalyticsSession sessionId(String sessionId) {
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
   * Flag determining if screenShare is started or not (true/false)
   **/
  public AnalyticsSession sharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag determining if screenShare is started or not (true/false)")
  @JsonProperty("sharingScreen")
  public Boolean getSharingScreen() {
    return sharingScreen;
  }
  public void setSharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
  }

  
  /**
   * (Dialer) Whether the agent can skip the dialer contact
   **/
  public AnalyticsSession skipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Dialer) Whether the agent can skip the dialer contact")
  @JsonProperty("skipEnabled")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }

  
  /**
   * The number of seconds before PureCloud begins the call for a call back (0 disables automatic calling)
   **/
  public AnalyticsSession timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds before PureCloud begins the call for a call back (0 disables automatic calling)")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  
  /**
   * Complete routing method
   **/
  public AnalyticsSession usedRouting(UsedRoutingEnum usedRouting) {
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
   * Direct Video address
   **/
  public AnalyticsSession videoAddressSelf(String videoAddressSelf) {
    this.videoAddressSelf = videoAddressSelf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direct Video address")
  @JsonProperty("videoAddressSelf")
  public String getVideoAddressSelf() {
    return videoAddressSelf;
  }
  public void setVideoAddressSelf(String videoAddressSelf) {
    this.videoAddressSelf = videoAddressSelf;
  }

  
  /**
   * A unique identifier for a PureCloud video room
   **/
  public AnalyticsSession videoRoomId(String videoRoomId) {
    this.videoRoomId = videoRoomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for a PureCloud video room")
  @JsonProperty("videoRoomId")
  public String getVideoRoomId() {
    return videoRoomId;
  }
  public void setVideoRoomId(String videoRoomId) {
    this.videoRoomId = videoRoomId;
  }

  
  /**
   * Number of waiting interactions for each predictive routing attempt
   **/
  public AnalyticsSession waitingInteractionCounts(List<Integer> waitingInteractionCounts) {
    this.waitingInteractionCounts = waitingInteractionCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of waiting interactions for each predictive routing attempt")
  @JsonProperty("waitingInteractionCounts")
  public List<Integer> getWaitingInteractionCounts() {
    return waitingInteractionCounts;
  }
  public void setWaitingInteractionCounts(List<Integer> waitingInteractionCounts) {
    this.waitingInteractionCounts = waitingInteractionCounts;
  }

  
  /**
   * Proposed agents
   **/
  public AnalyticsSession proposedAgents(List<AnalyticsProposedAgent> proposedAgents) {
    this.proposedAgents = proposedAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposed agents")
  @JsonProperty("proposedAgents")
  public List<AnalyticsProposedAgent> getProposedAgents() {
    return proposedAgents;
  }
  public void setProposedAgents(List<AnalyticsProposedAgent> proposedAgents) {
    this.proposedAgents = proposedAgents;
  }

  
  /**
   * MediaEndpointStats associated with this session
   **/
  public AnalyticsSession mediaEndpointStats(List<AnalyticsMediaEndpointStat> mediaEndpointStats) {
    this.mediaEndpointStats = mediaEndpointStats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "MediaEndpointStats associated with this session")
  @JsonProperty("mediaEndpointStats")
  public List<AnalyticsMediaEndpointStat> getMediaEndpointStats() {
    return mediaEndpointStats;
  }
  public void setMediaEndpointStats(List<AnalyticsMediaEndpointStat> mediaEndpointStats) {
    this.mediaEndpointStats = mediaEndpointStats;
  }

  
  /**
   * IVR flow execution associated with this session
   **/
  public AnalyticsSession flow(AnalyticsFlow flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IVR flow execution associated with this session")
  @JsonProperty("flow")
  public AnalyticsFlow getFlow() {
    return flow;
  }
  public void setFlow(AnalyticsFlow flow) {
    this.flow = flow;
  }

  
  /**
   * List of metrics for this session
   **/
  public AnalyticsSession metrics(List<AnalyticsSessionMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of metrics for this session")
  @JsonProperty("metrics")
  public List<AnalyticsSessionMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<AnalyticsSessionMetric> metrics) {
    this.metrics = metrics;
  }

  
  /**
   * List of segments for this session
   **/
  public AnalyticsSession segments(List<AnalyticsConversationSegment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of segments for this session")
  @JsonProperty("segments")
  public List<AnalyticsConversationSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<AnalyticsConversationSegment> segments) {
    this.segments = segments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSession analyticsSession = (AnalyticsSession) o;
    return Objects.equals(this.activeSkillIds, analyticsSession.activeSkillIds) &&
        Objects.equals(this.acwSkipped, analyticsSession.acwSkipped) &&
        Objects.equals(this.addressFrom, analyticsSession.addressFrom) &&
        Objects.equals(this.addressOther, analyticsSession.addressOther) &&
        Objects.equals(this.addressSelf, analyticsSession.addressSelf) &&
        Objects.equals(this.addressTo, analyticsSession.addressTo) &&
        Objects.equals(this.agentAssistantId, analyticsSession.agentAssistantId) &&
        Objects.equals(this.agentBullseyeRing, analyticsSession.agentBullseyeRing) &&
        Objects.equals(this.agentOwned, analyticsSession.agentOwned) &&
        Objects.equals(this.ani, analyticsSession.ani) &&
        Objects.equals(this.assignerId, analyticsSession.assignerId) &&
        Objects.equals(this.authenticated, analyticsSession.authenticated) &&
        Objects.equals(this.callbackNumbers, analyticsSession.callbackNumbers) &&
        Objects.equals(this.callbackScheduledTime, analyticsSession.callbackScheduledTime) &&
        Objects.equals(this.callbackUserName, analyticsSession.callbackUserName) &&
        Objects.equals(this.coachedParticipantId, analyticsSession.coachedParticipantId) &&
        Objects.equals(this.cobrowseRole, analyticsSession.cobrowseRole) &&
        Objects.equals(this.cobrowseRoomId, analyticsSession.cobrowseRoomId) &&
        Objects.equals(this.deliveryStatus, analyticsSession.deliveryStatus) &&
        Objects.equals(this.deliveryStatusChangeDate, analyticsSession.deliveryStatusChangeDate) &&
        Objects.equals(this.destinationAddresses, analyticsSession.destinationAddresses) &&
        Objects.equals(this.direction, analyticsSession.direction) &&
        Objects.equals(this.dispositionAnalyzer, analyticsSession.dispositionAnalyzer) &&
        Objects.equals(this.dispositionName, analyticsSession.dispositionName) &&
        Objects.equals(this.dnis, analyticsSession.dnis) &&
        Objects.equals(this.edgeId, analyticsSession.edgeId) &&
        Objects.equals(this.eligibleAgentCounts, analyticsSession.eligibleAgentCounts) &&
        Objects.equals(this.flowInType, analyticsSession.flowInType) &&
        Objects.equals(this.flowOutType, analyticsSession.flowOutType) &&
        Objects.equals(this.journeyActionId, analyticsSession.journeyActionId) &&
        Objects.equals(this.journeyActionMapId, analyticsSession.journeyActionMapId) &&
        Objects.equals(this.journeyActionMapVersion, analyticsSession.journeyActionMapVersion) &&
        Objects.equals(this.journeyCustomerId, analyticsSession.journeyCustomerId) &&
        Objects.equals(this.journeyCustomerIdType, analyticsSession.journeyCustomerIdType) &&
        Objects.equals(this.journeyCustomerSessionId, analyticsSession.journeyCustomerSessionId) &&
        Objects.equals(this.journeyCustomerSessionIdType, analyticsSession.journeyCustomerSessionIdType) &&
        Objects.equals(this.mediaBridgeId, analyticsSession.mediaBridgeId) &&
        Objects.equals(this.mediaCount, analyticsSession.mediaCount) &&
        Objects.equals(this.mediaType, analyticsSession.mediaType) &&
        Objects.equals(this.messageType, analyticsSession.messageType) &&
        Objects.equals(this.monitoredParticipantId, analyticsSession.monitoredParticipantId) &&
        Objects.equals(this.outboundCampaignId, analyticsSession.outboundCampaignId) &&
        Objects.equals(this.outboundContactId, analyticsSession.outboundContactId) &&
        Objects.equals(this.outboundContactListId, analyticsSession.outboundContactListId) &&
        Objects.equals(this.peerId, analyticsSession.peerId) &&
        Objects.equals(this.protocolCallId, analyticsSession.protocolCallId) &&
        Objects.equals(this.provider, analyticsSession.provider) &&
        Objects.equals(this.recording, analyticsSession.recording) &&
        Objects.equals(this.remote, analyticsSession.remote) &&
        Objects.equals(this.remoteNameDisplayable, analyticsSession.remoteNameDisplayable) &&
        Objects.equals(this.removedSkillIds, analyticsSession.removedSkillIds) &&
        Objects.equals(this.requestedRoutings, analyticsSession.requestedRoutings) &&
        Objects.equals(this.roomId, analyticsSession.roomId) &&
        Objects.equals(this.routingRing, analyticsSession.routingRing) &&
        Objects.equals(this.screenShareAddressSelf, analyticsSession.screenShareAddressSelf) &&
        Objects.equals(this.screenShareRoomId, analyticsSession.screenShareRoomId) &&
        Objects.equals(this.scriptId, analyticsSession.scriptId) &&
        Objects.equals(this.selectedAgentId, analyticsSession.selectedAgentId) &&
        Objects.equals(this.selectedAgentRank, analyticsSession.selectedAgentRank) &&
        Objects.equals(this.sessionDnis, analyticsSession.sessionDnis) &&
        Objects.equals(this.sessionId, analyticsSession.sessionId) &&
        Objects.equals(this.sharingScreen, analyticsSession.sharingScreen) &&
        Objects.equals(this.skipEnabled, analyticsSession.skipEnabled) &&
        Objects.equals(this.timeoutSeconds, analyticsSession.timeoutSeconds) &&
        Objects.equals(this.usedRouting, analyticsSession.usedRouting) &&
        Objects.equals(this.videoAddressSelf, analyticsSession.videoAddressSelf) &&
        Objects.equals(this.videoRoomId, analyticsSession.videoRoomId) &&
        Objects.equals(this.waitingInteractionCounts, analyticsSession.waitingInteractionCounts) &&
        Objects.equals(this.proposedAgents, analyticsSession.proposedAgents) &&
        Objects.equals(this.mediaEndpointStats, analyticsSession.mediaEndpointStats) &&
        Objects.equals(this.flow, analyticsSession.flow) &&
        Objects.equals(this.metrics, analyticsSession.metrics) &&
        Objects.equals(this.segments, analyticsSession.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeSkillIds, acwSkipped, addressFrom, addressOther, addressSelf, addressTo, agentAssistantId, agentBullseyeRing, agentOwned, ani, assignerId, authenticated, callbackNumbers, callbackScheduledTime, callbackUserName, coachedParticipantId, cobrowseRole, cobrowseRoomId, deliveryStatus, deliveryStatusChangeDate, destinationAddresses, direction, dispositionAnalyzer, dispositionName, dnis, edgeId, eligibleAgentCounts, flowInType, flowOutType, journeyActionId, journeyActionMapId, journeyActionMapVersion, journeyCustomerId, journeyCustomerIdType, journeyCustomerSessionId, journeyCustomerSessionIdType, mediaBridgeId, mediaCount, mediaType, messageType, monitoredParticipantId, outboundCampaignId, outboundContactId, outboundContactListId, peerId, protocolCallId, provider, recording, remote, remoteNameDisplayable, removedSkillIds, requestedRoutings, roomId, routingRing, screenShareAddressSelf, screenShareRoomId, scriptId, selectedAgentId, selectedAgentRank, sessionDnis, sessionId, sharingScreen, skipEnabled, timeoutSeconds, usedRouting, videoAddressSelf, videoRoomId, waitingInteractionCounts, proposedAgents, mediaEndpointStats, flow, metrics, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSession {\n");
    
    sb.append("    activeSkillIds: ").append(toIndentedString(activeSkillIds)).append("\n");
    sb.append("    acwSkipped: ").append(toIndentedString(acwSkipped)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressOther: ").append(toIndentedString(addressOther)).append("\n");
    sb.append("    addressSelf: ").append(toIndentedString(addressSelf)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    agentAssistantId: ").append(toIndentedString(agentAssistantId)).append("\n");
    sb.append("    agentBullseyeRing: ").append(toIndentedString(agentBullseyeRing)).append("\n");
    sb.append("    agentOwned: ").append(toIndentedString(agentOwned)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    assignerId: ").append(toIndentedString(assignerId)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    coachedParticipantId: ").append(toIndentedString(coachedParticipantId)).append("\n");
    sb.append("    cobrowseRole: ").append(toIndentedString(cobrowseRole)).append("\n");
    sb.append("    cobrowseRoomId: ").append(toIndentedString(cobrowseRoomId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    deliveryStatusChangeDate: ").append(toIndentedString(deliveryStatusChangeDate)).append("\n");
    sb.append("    destinationAddresses: ").append(toIndentedString(destinationAddresses)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dispositionAnalyzer: ").append(toIndentedString(dispositionAnalyzer)).append("\n");
    sb.append("    dispositionName: ").append(toIndentedString(dispositionName)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    eligibleAgentCounts: ").append(toIndentedString(eligibleAgentCounts)).append("\n");
    sb.append("    flowInType: ").append(toIndentedString(flowInType)).append("\n");
    sb.append("    flowOutType: ").append(toIndentedString(flowOutType)).append("\n");
    sb.append("    journeyActionId: ").append(toIndentedString(journeyActionId)).append("\n");
    sb.append("    journeyActionMapId: ").append(toIndentedString(journeyActionMapId)).append("\n");
    sb.append("    journeyActionMapVersion: ").append(toIndentedString(journeyActionMapVersion)).append("\n");
    sb.append("    journeyCustomerId: ").append(toIndentedString(journeyCustomerId)).append("\n");
    sb.append("    journeyCustomerIdType: ").append(toIndentedString(journeyCustomerIdType)).append("\n");
    sb.append("    journeyCustomerSessionId: ").append(toIndentedString(journeyCustomerSessionId)).append("\n");
    sb.append("    journeyCustomerSessionIdType: ").append(toIndentedString(journeyCustomerSessionIdType)).append("\n");
    sb.append("    mediaBridgeId: ").append(toIndentedString(mediaBridgeId)).append("\n");
    sb.append("    mediaCount: ").append(toIndentedString(mediaCount)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    outboundCampaignId: ").append(toIndentedString(outboundCampaignId)).append("\n");
    sb.append("    outboundContactId: ").append(toIndentedString(outboundContactId)).append("\n");
    sb.append("    outboundContactListId: ").append(toIndentedString(outboundContactListId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    protocolCallId: ").append(toIndentedString(protocolCallId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    remoteNameDisplayable: ").append(toIndentedString(remoteNameDisplayable)).append("\n");
    sb.append("    removedSkillIds: ").append(toIndentedString(removedSkillIds)).append("\n");
    sb.append("    requestedRoutings: ").append(toIndentedString(requestedRoutings)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    routingRing: ").append(toIndentedString(routingRing)).append("\n");
    sb.append("    screenShareAddressSelf: ").append(toIndentedString(screenShareAddressSelf)).append("\n");
    sb.append("    screenShareRoomId: ").append(toIndentedString(screenShareRoomId)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    selectedAgentId: ").append(toIndentedString(selectedAgentId)).append("\n");
    sb.append("    selectedAgentRank: ").append(toIndentedString(selectedAgentRank)).append("\n");
    sb.append("    sessionDnis: ").append(toIndentedString(sessionDnis)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sharingScreen: ").append(toIndentedString(sharingScreen)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    usedRouting: ").append(toIndentedString(usedRouting)).append("\n");
    sb.append("    videoAddressSelf: ").append(toIndentedString(videoAddressSelf)).append("\n");
    sb.append("    videoRoomId: ").append(toIndentedString(videoRoomId)).append("\n");
    sb.append("    waitingInteractionCounts: ").append(toIndentedString(waitingInteractionCounts)).append("\n");
    sb.append("    proposedAgents: ").append(toIndentedString(proposedAgents)).append("\n");
    sb.append("    mediaEndpointStats: ").append(toIndentedString(mediaEndpointStats)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

