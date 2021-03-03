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
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicDialerPreview;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicErrorBody;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicUriReference;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicVoicemail;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationCallbackEventTopicCallbackMediaParticipant
 */

public class QueueConversationCallbackEventTopicCallbackMediaParticipant  implements Serializable {
  
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
  private QueueConversationCallbackEventTopicUriReference user = null;
  private QueueConversationCallbackEventTopicUriReference queue = null;
  private QueueConversationCallbackEventTopicUriReference team = null;
  private Map<String, String> attributes = null;
  private QueueConversationCallbackEventTopicErrorBody errorInfo = null;
  private QueueConversationCallbackEventTopicUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Integer alertingTimeoutMs = null;
  private String provider = null;
  private QueueConversationCallbackEventTopicUriReference externalContact = null;
  private QueueConversationCallbackEventTopicUriReference externalOrganization = null;
  private QueueConversationCallbackEventTopicWrapup wrapup = null;
  private QueueConversationCallbackEventTopicConversationRoutingData conversationRoutingData = null;
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
  private QueueConversationCallbackEventTopicJourneyContext journeyContext = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private QueueConversationCallbackEventTopicDialerPreview outboundPreview = null;
  private QueueConversationCallbackEventTopicVoicemail voicemail = null;
  private List<String> callbackNumbers = new ArrayList<String>();
  private String callbackUserName = null;
  private Boolean skipEnabled = null;
  private Boolean externalCampaign = null;
  private Integer timeoutSeconds = null;
  private Date callbackScheduledTime = null;
  private String automatedCallbackConfigId = null;

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant id(String id) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant name(String name) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant address(String address) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant startTime(Date startTime) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant connectedTime(Date connectedTime) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant endTime(Date endTime) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant startHoldTime(Date startHoldTime) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant purpose(String purpose) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant state(StateEnum state) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant direction(DirectionEnum direction) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant held(Boolean held) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant user(QueueConversationCallbackEventTopicUriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public QueueConversationCallbackEventTopicUriReference getUser() {
    return user;
  }
  public void setUser(QueueConversationCallbackEventTopicUriReference user) {
    this.user = user;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant queue(QueueConversationCallbackEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationCallbackEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationCallbackEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant team(QueueConversationCallbackEventTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public QueueConversationCallbackEventTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(QueueConversationCallbackEventTopicUriReference team) {
    this.team = team;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant attributes(Map<String, String> attributes) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant errorInfo(QueueConversationCallbackEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public QueueConversationCallbackEventTopicErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationCallbackEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant script(QueueConversationCallbackEventTopicUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public QueueConversationCallbackEventTopicUriReference getScript() {
    return script;
  }
  public void setScript(QueueConversationCallbackEventTopicUriReference script) {
    this.script = script;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant provider(String provider) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant externalContact(QueueConversationCallbackEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public QueueConversationCallbackEventTopicUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(QueueConversationCallbackEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant externalOrganization(QueueConversationCallbackEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public QueueConversationCallbackEventTopicUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(QueueConversationCallbackEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant wrapup(QueueConversationCallbackEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationCallbackEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationCallbackEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant conversationRoutingData(QueueConversationCallbackEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public QueueConversationCallbackEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(QueueConversationCallbackEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant peer(String peer) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant screenRecordingState(String screenRecordingState) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant journeyContext(QueueConversationCallbackEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public QueueConversationCallbackEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(QueueConversationCallbackEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant startAcwTime(Date startAcwTime) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant endAcwTime(Date endAcwTime) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant outboundPreview(QueueConversationCallbackEventTopicDialerPreview outboundPreview) {
    this.outboundPreview = outboundPreview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundPreview")
  public QueueConversationCallbackEventTopicDialerPreview getOutboundPreview() {
    return outboundPreview;
  }
  public void setOutboundPreview(QueueConversationCallbackEventTopicDialerPreview outboundPreview) {
    this.outboundPreview = outboundPreview;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant voicemail(QueueConversationCallbackEventTopicVoicemail voicemail) {
    this.voicemail = voicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voicemail")
  public QueueConversationCallbackEventTopicVoicemail getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(QueueConversationCallbackEventTopicVoicemail voicemail) {
    this.voicemail = voicemail;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant callbackNumbers(List<String> callbackNumbers) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant callbackUserName(String callbackUserName) {
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
  public QueueConversationCallbackEventTopicCallbackMediaParticipant skipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skipEnabled")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant externalCampaign(Boolean externalCampaign) {
    this.externalCampaign = externalCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalCampaign")
  public Boolean getExternalCampaign() {
    return externalCampaign;
  }
  public void setExternalCampaign(Boolean externalCampaign) {
    this.externalCampaign = externalCampaign;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant callbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbackScheduledTime")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicCallbackMediaParticipant automatedCallbackConfigId(String automatedCallbackConfigId) {
    this.automatedCallbackConfigId = automatedCallbackConfigId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("automatedCallbackConfigId")
  public String getAutomatedCallbackConfigId() {
    return automatedCallbackConfigId;
  }
  public void setAutomatedCallbackConfigId(String automatedCallbackConfigId) {
    this.automatedCallbackConfigId = automatedCallbackConfigId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallbackEventTopicCallbackMediaParticipant queueConversationCallbackEventTopicCallbackMediaParticipant = (QueueConversationCallbackEventTopicCallbackMediaParticipant) o;
    return Objects.equals(this.id, queueConversationCallbackEventTopicCallbackMediaParticipant.id) &&
        Objects.equals(this.name, queueConversationCallbackEventTopicCallbackMediaParticipant.name) &&
        Objects.equals(this.address, queueConversationCallbackEventTopicCallbackMediaParticipant.address) &&
        Objects.equals(this.startTime, queueConversationCallbackEventTopicCallbackMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, queueConversationCallbackEventTopicCallbackMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, queueConversationCallbackEventTopicCallbackMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, queueConversationCallbackEventTopicCallbackMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, queueConversationCallbackEventTopicCallbackMediaParticipant.purpose) &&
        Objects.equals(this.state, queueConversationCallbackEventTopicCallbackMediaParticipant.state) &&
        Objects.equals(this.direction, queueConversationCallbackEventTopicCallbackMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, queueConversationCallbackEventTopicCallbackMediaParticipant.disconnectType) &&
        Objects.equals(this.held, queueConversationCallbackEventTopicCallbackMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, queueConversationCallbackEventTopicCallbackMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, queueConversationCallbackEventTopicCallbackMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, queueConversationCallbackEventTopicCallbackMediaParticipant.user) &&
        Objects.equals(this.queue, queueConversationCallbackEventTopicCallbackMediaParticipant.queue) &&
        Objects.equals(this.team, queueConversationCallbackEventTopicCallbackMediaParticipant.team) &&
        Objects.equals(this.attributes, queueConversationCallbackEventTopicCallbackMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, queueConversationCallbackEventTopicCallbackMediaParticipant.errorInfo) &&
        Objects.equals(this.script, queueConversationCallbackEventTopicCallbackMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, queueConversationCallbackEventTopicCallbackMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, queueConversationCallbackEventTopicCallbackMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.alertingTimeoutMs, queueConversationCallbackEventTopicCallbackMediaParticipant.alertingTimeoutMs) &&
        Objects.equals(this.provider, queueConversationCallbackEventTopicCallbackMediaParticipant.provider) &&
        Objects.equals(this.externalContact, queueConversationCallbackEventTopicCallbackMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, queueConversationCallbackEventTopicCallbackMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, queueConversationCallbackEventTopicCallbackMediaParticipant.wrapup) &&
        Objects.equals(this.conversationRoutingData, queueConversationCallbackEventTopicCallbackMediaParticipant.conversationRoutingData) &&
        Objects.equals(this.peer, queueConversationCallbackEventTopicCallbackMediaParticipant.peer) &&
        Objects.equals(this.screenRecordingState, queueConversationCallbackEventTopicCallbackMediaParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, queueConversationCallbackEventTopicCallbackMediaParticipant.flaggedReason) &&
        Objects.equals(this.journeyContext, queueConversationCallbackEventTopicCallbackMediaParticipant.journeyContext) &&
        Objects.equals(this.startAcwTime, queueConversationCallbackEventTopicCallbackMediaParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, queueConversationCallbackEventTopicCallbackMediaParticipant.endAcwTime) &&
        Objects.equals(this.outboundPreview, queueConversationCallbackEventTopicCallbackMediaParticipant.outboundPreview) &&
        Objects.equals(this.voicemail, queueConversationCallbackEventTopicCallbackMediaParticipant.voicemail) &&
        Objects.equals(this.callbackNumbers, queueConversationCallbackEventTopicCallbackMediaParticipant.callbackNumbers) &&
        Objects.equals(this.callbackUserName, queueConversationCallbackEventTopicCallbackMediaParticipant.callbackUserName) &&
        Objects.equals(this.skipEnabled, queueConversationCallbackEventTopicCallbackMediaParticipant.skipEnabled) &&
        Objects.equals(this.externalCampaign, queueConversationCallbackEventTopicCallbackMediaParticipant.externalCampaign) &&
        Objects.equals(this.timeoutSeconds, queueConversationCallbackEventTopicCallbackMediaParticipant.timeoutSeconds) &&
        Objects.equals(this.callbackScheduledTime, queueConversationCallbackEventTopicCallbackMediaParticipant.callbackScheduledTime) &&
        Objects.equals(this.automatedCallbackConfigId, queueConversationCallbackEventTopicCallbackMediaParticipant.automatedCallbackConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, team, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalOrganization, wrapup, conversationRoutingData, peer, screenRecordingState, flaggedReason, journeyContext, startAcwTime, endAcwTime, outboundPreview, voicemail, callbackNumbers, callbackUserName, skipEnabled, externalCampaign, timeoutSeconds, callbackScheduledTime, automatedCallbackConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallbackEventTopicCallbackMediaParticipant {\n");
    
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
    sb.append("    outboundPreview: ").append(toIndentedString(outboundPreview)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    externalCampaign: ").append(toIndentedString(externalCampaign)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    automatedCallbackConfigId: ").append(toIndentedString(automatedCallbackConfigId)).append("\n");
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

