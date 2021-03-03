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
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicErrorBody;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicUriReference;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationCobrowseEventTopicCobrowseMediaParticipant
 */

public class ConversationCobrowseEventTopicCobrowseMediaParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private Date startHoldTime = null;
  private String purpose = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("alerting"),
    DIALING("dialing"),
    CONTACTING("contacting"),
    OFFERING("offering"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    TERMINATED("terminated"),
    CONVERTING("converting"),
    UPLOADING("uploading"),
    TRANSMITTING("transmitting"),
    SCHEDULED("scheduled"),
    NONE("none");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

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
   * Gets or Sets disconnectType
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TIMEOUT("timeout"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam"),
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
  private Boolean held = null;
  private Boolean wrapupRequired = null;
  private String wrapupPrompt = null;
  private ConversationCobrowseEventTopicUriReference user = null;
  private ConversationCobrowseEventTopicUriReference queue = null;
  private ConversationCobrowseEventTopicUriReference team = null;
  private Map<String, String> attributes = null;
  private ConversationCobrowseEventTopicErrorBody errorInfo = null;
  private ConversationCobrowseEventTopicUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Integer alertingTimeoutMs = null;
  private String provider = null;
  private ConversationCobrowseEventTopicUriReference externalContact = null;
  private ConversationCobrowseEventTopicUriReference externalOrganization = null;
  private ConversationCobrowseEventTopicWrapup wrapup = null;
  private ConversationCobrowseEventTopicConversationRoutingData conversationRoutingData = null;
  private String peer = null;
  private String screenRecordingState = null;

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
   * Gets or Sets flaggedReason
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
  private ConversationCobrowseEventTopicJourneyContext journeyContext = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private String cobrowseSessionId = null;
  private String cobrowseRole = null;
  private String viewerUrl = null;
  private Date providerEventTime = null;
  private List<String> controlling = new ArrayList<String>();

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant direction(DirectionEnum direction) {
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
  public ConversationCobrowseEventTopicCobrowseMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public ConversationCobrowseEventTopicCobrowseMediaParticipant held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant wrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupRequired")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant wrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupPrompt")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant user(ConversationCobrowseEventTopicUriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public ConversationCobrowseEventTopicUriReference getUser() {
    return user;
  }
  public void setUser(ConversationCobrowseEventTopicUriReference user) {
    this.user = user;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant queue(ConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationCobrowseEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant team(ConversationCobrowseEventTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public ConversationCobrowseEventTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(ConversationCobrowseEventTopicUriReference team) {
    this.team = team;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant errorInfo(ConversationCobrowseEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public ConversationCobrowseEventTopicErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ConversationCobrowseEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant script(ConversationCobrowseEventTopicUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public ConversationCobrowseEventTopicUriReference getScript() {
    return script;
  }
  public void setScript(ConversationCobrowseEventTopicUriReference script) {
    this.script = script;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupTimeoutMs")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupSkipped")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertingTimeoutMs")
  public Integer getAlertingTimeoutMs() {
    return alertingTimeoutMs;
  }
  public void setAlertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant provider(String provider) {
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
  public ConversationCobrowseEventTopicCobrowseMediaParticipant externalContact(ConversationCobrowseEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public ConversationCobrowseEventTopicUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(ConversationCobrowseEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant externalOrganization(ConversationCobrowseEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public ConversationCobrowseEventTopicUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ConversationCobrowseEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant wrapup(ConversationCobrowseEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public ConversationCobrowseEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationCobrowseEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant conversationRoutingData(ConversationCobrowseEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public ConversationCobrowseEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(ConversationCobrowseEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant peer(String peer) {
    this.peer = peer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peer")
  public String getPeer() {
    return peer;
  }
  public void setPeer(String peer) {
    this.peer = peer;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant screenRecordingState(String screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenRecordingState")
  public String getScreenRecordingState() {
    return screenRecordingState;
  }
  public void setScreenRecordingState(String screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flaggedReason")
  public FlaggedReasonEnum getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant journeyContext(ConversationCobrowseEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public ConversationCobrowseEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(ConversationCobrowseEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant startAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startAcwTime")
  public Date getStartAcwTime() {
    return startAcwTime;
  }
  public void setStartAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant endAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endAcwTime")
  public Date getEndAcwTime() {
    return endAcwTime;
  }
  public void setEndAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant cobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseSessionId")
  public String getCobrowseSessionId() {
    return cobrowseSessionId;
  }
  public void setCobrowseSessionId(String cobrowseSessionId) {
    this.cobrowseSessionId = cobrowseSessionId;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant cobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowseRole")
  public String getCobrowseRole() {
    return cobrowseRole;
  }
  public void setCobrowseRole(String cobrowseRole) {
    this.cobrowseRole = cobrowseRole;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant viewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("viewerUrl")
  public String getViewerUrl() {
    return viewerUrl;
  }
  public void setViewerUrl(String viewerUrl) {
    this.viewerUrl = viewerUrl;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant providerEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providerEventTime")
  public Date getProviderEventTime() {
    return providerEventTime;
  }
  public void setProviderEventTime(Date providerEventTime) {
    this.providerEventTime = providerEventTime;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseMediaParticipant controlling(List<String> controlling) {
    this.controlling = controlling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("controlling")
  public List<String> getControlling() {
    return controlling;
  }
  public void setControlling(List<String> controlling) {
    this.controlling = controlling;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCobrowseEventTopicCobrowseMediaParticipant conversationCobrowseEventTopicCobrowseMediaParticipant = (ConversationCobrowseEventTopicCobrowseMediaParticipant) o;
    return Objects.equals(this.id, conversationCobrowseEventTopicCobrowseMediaParticipant.id) &&
        Objects.equals(this.name, conversationCobrowseEventTopicCobrowseMediaParticipant.name) &&
        Objects.equals(this.address, conversationCobrowseEventTopicCobrowseMediaParticipant.address) &&
        Objects.equals(this.startTime, conversationCobrowseEventTopicCobrowseMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, conversationCobrowseEventTopicCobrowseMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, conversationCobrowseEventTopicCobrowseMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, conversationCobrowseEventTopicCobrowseMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, conversationCobrowseEventTopicCobrowseMediaParticipant.purpose) &&
        Objects.equals(this.state, conversationCobrowseEventTopicCobrowseMediaParticipant.state) &&
        Objects.equals(this.direction, conversationCobrowseEventTopicCobrowseMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, conversationCobrowseEventTopicCobrowseMediaParticipant.disconnectType) &&
        Objects.equals(this.held, conversationCobrowseEventTopicCobrowseMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, conversationCobrowseEventTopicCobrowseMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, conversationCobrowseEventTopicCobrowseMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, conversationCobrowseEventTopicCobrowseMediaParticipant.user) &&
        Objects.equals(this.queue, conversationCobrowseEventTopicCobrowseMediaParticipant.queue) &&
        Objects.equals(this.team, conversationCobrowseEventTopicCobrowseMediaParticipant.team) &&
        Objects.equals(this.attributes, conversationCobrowseEventTopicCobrowseMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, conversationCobrowseEventTopicCobrowseMediaParticipant.errorInfo) &&
        Objects.equals(this.script, conversationCobrowseEventTopicCobrowseMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, conversationCobrowseEventTopicCobrowseMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, conversationCobrowseEventTopicCobrowseMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.alertingTimeoutMs, conversationCobrowseEventTopicCobrowseMediaParticipant.alertingTimeoutMs) &&
        Objects.equals(this.provider, conversationCobrowseEventTopicCobrowseMediaParticipant.provider) &&
        Objects.equals(this.externalContact, conversationCobrowseEventTopicCobrowseMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, conversationCobrowseEventTopicCobrowseMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, conversationCobrowseEventTopicCobrowseMediaParticipant.wrapup) &&
        Objects.equals(this.conversationRoutingData, conversationCobrowseEventTopicCobrowseMediaParticipant.conversationRoutingData) &&
        Objects.equals(this.peer, conversationCobrowseEventTopicCobrowseMediaParticipant.peer) &&
        Objects.equals(this.screenRecordingState, conversationCobrowseEventTopicCobrowseMediaParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, conversationCobrowseEventTopicCobrowseMediaParticipant.flaggedReason) &&
        Objects.equals(this.journeyContext, conversationCobrowseEventTopicCobrowseMediaParticipant.journeyContext) &&
        Objects.equals(this.startAcwTime, conversationCobrowseEventTopicCobrowseMediaParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, conversationCobrowseEventTopicCobrowseMediaParticipant.endAcwTime) &&
        Objects.equals(this.cobrowseSessionId, conversationCobrowseEventTopicCobrowseMediaParticipant.cobrowseSessionId) &&
        Objects.equals(this.cobrowseRole, conversationCobrowseEventTopicCobrowseMediaParticipant.cobrowseRole) &&
        Objects.equals(this.viewerUrl, conversationCobrowseEventTopicCobrowseMediaParticipant.viewerUrl) &&
        Objects.equals(this.providerEventTime, conversationCobrowseEventTopicCobrowseMediaParticipant.providerEventTime) &&
        Objects.equals(this.controlling, conversationCobrowseEventTopicCobrowseMediaParticipant.controlling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, team, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalOrganization, wrapup, conversationRoutingData, peer, screenRecordingState, flaggedReason, journeyContext, startAcwTime, endAcwTime, cobrowseSessionId, cobrowseRole, viewerUrl, providerEventTime, controlling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCobrowseEventTopicCobrowseMediaParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    alertingTimeoutMs: ").append(toIndentedString(alertingTimeoutMs)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    conversationRoutingData: ").append(toIndentedString(conversationRoutingData)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    screenRecordingState: ").append(toIndentedString(screenRecordingState)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    startAcwTime: ").append(toIndentedString(startAcwTime)).append("\n");
    sb.append("    endAcwTime: ").append(toIndentedString(endAcwTime)).append("\n");
    sb.append("    cobrowseSessionId: ").append(toIndentedString(cobrowseSessionId)).append("\n");
    sb.append("    cobrowseRole: ").append(toIndentedString(cobrowseRole)).append("\n");
    sb.append("    viewerUrl: ").append(toIndentedString(viewerUrl)).append("\n");
    sb.append("    providerEventTime: ").append(toIndentedString(providerEventTime)).append("\n");
    sb.append("    controlling: ").append(toIndentedString(controlling)).append("\n");
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

