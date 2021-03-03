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
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicAttachment;
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicErrorBody;
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicUriReference;
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationEmailEventTopicEmailMediaParticipant
 */

public class ConversationEmailEventTopicEmailMediaParticipant  implements Serializable {
  
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
  private ConversationEmailEventTopicUriReference user = null;
  private ConversationEmailEventTopicUriReference queue = null;
  private ConversationEmailEventTopicUriReference team = null;
  private Map<String, String> attributes = null;
  private ConversationEmailEventTopicErrorBody errorInfo = null;
  private ConversationEmailEventTopicUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Integer alertingTimeoutMs = null;
  private String provider = null;
  private ConversationEmailEventTopicUriReference externalContact = null;
  private ConversationEmailEventTopicUriReference externalOrganization = null;
  private ConversationEmailEventTopicWrapup wrapup = null;
  private ConversationEmailEventTopicConversationRoutingData conversationRoutingData = null;
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
  private ConversationEmailEventTopicJourneyContext journeyContext = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private String subject = null;
  private Integer messagesSent = null;
  private Boolean autoGenerated = null;
  private String messageId = null;
  private List<ConversationEmailEventTopicAttachment> draftAttachments = new ArrayList<ConversationEmailEventTopicAttachment>();
  private Boolean spam = null;

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant id(String id) {
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
  public ConversationEmailEventTopicEmailMediaParticipant name(String name) {
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
  public ConversationEmailEventTopicEmailMediaParticipant address(String address) {
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
  public ConversationEmailEventTopicEmailMediaParticipant startTime(Date startTime) {
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
  public ConversationEmailEventTopicEmailMediaParticipant connectedTime(Date connectedTime) {
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
  public ConversationEmailEventTopicEmailMediaParticipant endTime(Date endTime) {
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
  public ConversationEmailEventTopicEmailMediaParticipant startHoldTime(Date startHoldTime) {
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
  public ConversationEmailEventTopicEmailMediaParticipant purpose(String purpose) {
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
  public ConversationEmailEventTopicEmailMediaParticipant state(StateEnum state) {
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
  public ConversationEmailEventTopicEmailMediaParticipant direction(DirectionEnum direction) {
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
  public ConversationEmailEventTopicEmailMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public ConversationEmailEventTopicEmailMediaParticipant held(Boolean held) {
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
  public ConversationEmailEventTopicEmailMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public ConversationEmailEventTopicEmailMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
  public ConversationEmailEventTopicEmailMediaParticipant user(ConversationEmailEventTopicUriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public ConversationEmailEventTopicUriReference getUser() {
    return user;
  }
  public void setUser(ConversationEmailEventTopicUriReference user) {
    this.user = user;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant queue(ConversationEmailEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationEmailEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationEmailEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant team(ConversationEmailEventTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public ConversationEmailEventTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(ConversationEmailEventTopicUriReference team) {
    this.team = team;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant attributes(Map<String, String> attributes) {
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
  public ConversationEmailEventTopicEmailMediaParticipant errorInfo(ConversationEmailEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public ConversationEmailEventTopicErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ConversationEmailEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant script(ConversationEmailEventTopicUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public ConversationEmailEventTopicUriReference getScript() {
    return script;
  }
  public void setScript(ConversationEmailEventTopicUriReference script) {
    this.script = script;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public ConversationEmailEventTopicEmailMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
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
  public ConversationEmailEventTopicEmailMediaParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
  public ConversationEmailEventTopicEmailMediaParticipant provider(String provider) {
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
  public ConversationEmailEventTopicEmailMediaParticipant externalContact(ConversationEmailEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public ConversationEmailEventTopicUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(ConversationEmailEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant externalOrganization(ConversationEmailEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public ConversationEmailEventTopicUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ConversationEmailEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant wrapup(ConversationEmailEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public ConversationEmailEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationEmailEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant conversationRoutingData(ConversationEmailEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public ConversationEmailEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(ConversationEmailEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant peer(String peer) {
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
  public ConversationEmailEventTopicEmailMediaParticipant screenRecordingState(String screenRecordingState) {
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
  public ConversationEmailEventTopicEmailMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
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
  public ConversationEmailEventTopicEmailMediaParticipant journeyContext(ConversationEmailEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public ConversationEmailEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(ConversationEmailEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant startAcwTime(Date startAcwTime) {
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
  public ConversationEmailEventTopicEmailMediaParticipant endAcwTime(Date endAcwTime) {
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
  public ConversationEmailEventTopicEmailMediaParticipant subject(String subject) {
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
  public ConversationEmailEventTopicEmailMediaParticipant messagesSent(Integer messagesSent) {
    this.messagesSent = messagesSent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messagesSent")
  public Integer getMessagesSent() {
    return messagesSent;
  }
  public void setMessagesSent(Integer messagesSent) {
    this.messagesSent = messagesSent;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant autoGenerated(Boolean autoGenerated) {
    this.autoGenerated = autoGenerated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("autoGenerated")
  public Boolean getAutoGenerated() {
    return autoGenerated;
  }
  public void setAutoGenerated(Boolean autoGenerated) {
    this.autoGenerated = autoGenerated;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant draftAttachments(List<ConversationEmailEventTopicAttachment> draftAttachments) {
    this.draftAttachments = draftAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("draftAttachments")
  public List<ConversationEmailEventTopicAttachment> getDraftAttachments() {
    return draftAttachments;
  }
  public void setDraftAttachments(List<ConversationEmailEventTopicAttachment> draftAttachments) {
    this.draftAttachments = draftAttachments;
  }

  
  /**
   **/
  public ConversationEmailEventTopicEmailMediaParticipant spam(Boolean spam) {
    this.spam = spam;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("spam")
  public Boolean getSpam() {
    return spam;
  }
  public void setSpam(Boolean spam) {
    this.spam = spam;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEmailEventTopicEmailMediaParticipant conversationEmailEventTopicEmailMediaParticipant = (ConversationEmailEventTopicEmailMediaParticipant) o;
    return Objects.equals(this.id, conversationEmailEventTopicEmailMediaParticipant.id) &&
        Objects.equals(this.name, conversationEmailEventTopicEmailMediaParticipant.name) &&
        Objects.equals(this.address, conversationEmailEventTopicEmailMediaParticipant.address) &&
        Objects.equals(this.startTime, conversationEmailEventTopicEmailMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, conversationEmailEventTopicEmailMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, conversationEmailEventTopicEmailMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, conversationEmailEventTopicEmailMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, conversationEmailEventTopicEmailMediaParticipant.purpose) &&
        Objects.equals(this.state, conversationEmailEventTopicEmailMediaParticipant.state) &&
        Objects.equals(this.direction, conversationEmailEventTopicEmailMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, conversationEmailEventTopicEmailMediaParticipant.disconnectType) &&
        Objects.equals(this.held, conversationEmailEventTopicEmailMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, conversationEmailEventTopicEmailMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, conversationEmailEventTopicEmailMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, conversationEmailEventTopicEmailMediaParticipant.user) &&
        Objects.equals(this.queue, conversationEmailEventTopicEmailMediaParticipant.queue) &&
        Objects.equals(this.team, conversationEmailEventTopicEmailMediaParticipant.team) &&
        Objects.equals(this.attributes, conversationEmailEventTopicEmailMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, conversationEmailEventTopicEmailMediaParticipant.errorInfo) &&
        Objects.equals(this.script, conversationEmailEventTopicEmailMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, conversationEmailEventTopicEmailMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, conversationEmailEventTopicEmailMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.alertingTimeoutMs, conversationEmailEventTopicEmailMediaParticipant.alertingTimeoutMs) &&
        Objects.equals(this.provider, conversationEmailEventTopicEmailMediaParticipant.provider) &&
        Objects.equals(this.externalContact, conversationEmailEventTopicEmailMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, conversationEmailEventTopicEmailMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, conversationEmailEventTopicEmailMediaParticipant.wrapup) &&
        Objects.equals(this.conversationRoutingData, conversationEmailEventTopicEmailMediaParticipant.conversationRoutingData) &&
        Objects.equals(this.peer, conversationEmailEventTopicEmailMediaParticipant.peer) &&
        Objects.equals(this.screenRecordingState, conversationEmailEventTopicEmailMediaParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, conversationEmailEventTopicEmailMediaParticipant.flaggedReason) &&
        Objects.equals(this.journeyContext, conversationEmailEventTopicEmailMediaParticipant.journeyContext) &&
        Objects.equals(this.startAcwTime, conversationEmailEventTopicEmailMediaParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, conversationEmailEventTopicEmailMediaParticipant.endAcwTime) &&
        Objects.equals(this.subject, conversationEmailEventTopicEmailMediaParticipant.subject) &&
        Objects.equals(this.messagesSent, conversationEmailEventTopicEmailMediaParticipant.messagesSent) &&
        Objects.equals(this.autoGenerated, conversationEmailEventTopicEmailMediaParticipant.autoGenerated) &&
        Objects.equals(this.messageId, conversationEmailEventTopicEmailMediaParticipant.messageId) &&
        Objects.equals(this.draftAttachments, conversationEmailEventTopicEmailMediaParticipant.draftAttachments) &&
        Objects.equals(this.spam, conversationEmailEventTopicEmailMediaParticipant.spam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, team, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalOrganization, wrapup, conversationRoutingData, peer, screenRecordingState, flaggedReason, journeyContext, startAcwTime, endAcwTime, subject, messagesSent, autoGenerated, messageId, draftAttachments, spam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEmailEventTopicEmailMediaParticipant {\n");
    
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
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    messagesSent: ").append(toIndentedString(messagesSent)).append("\n");
    sb.append("    autoGenerated: ").append(toIndentedString(autoGenerated)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    draftAttachments: ").append(toIndentedString(draftAttachments)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
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

