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
import com.mypurecloud.sdk.v2.model.Call;
import com.mypurecloud.sdk.v2.model.Callback;
import com.mypurecloud.sdk.v2.model.Cobrowsesession;
import com.mypurecloud.sdk.v2.model.ConversationChat;
import com.mypurecloud.sdk.v2.model.ConversationRoutingData;
import com.mypurecloud.sdk.v2.model.Email;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.Message;
import com.mypurecloud.sdk.v2.model.Screenshare;
import com.mypurecloud.sdk.v2.model.SocialExpression;
import com.mypurecloud.sdk.v2.model.Video;
import com.mypurecloud.sdk.v2.model.Wrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Participant
 */

public class Participant  implements Serializable {
  
  private String id = null;
  private Date startTime = null;
  private Date endTime = null;
  private Date connectedTime = null;
  private String name = null;
  private String userUri = null;
  private String userId = null;
  private String externalContactId = null;
  private String externalOrganizationId = null;
  private String queueId = null;
  private String groupId = null;
  private String teamId = null;
  private String queueName = null;
  private String purpose = null;
  private String participantType = null;
  private String consultParticipantId = null;
  private String address = null;
  private String ani = null;
  private String aniName = null;
  private String dnis = null;
  private String locale = null;
  private Boolean wrapupRequired = null;

  private static class WrapupPromptEnumDeserializer extends StdDeserializer<WrapupPromptEnum> {
    public WrapupPromptEnumDeserializer() {
      super(WrapupPromptEnumDeserializer.class);
    }

    @Override
    public WrapupPromptEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WrapupPromptEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * This field controls how the UI prompts the agent for a wrapup.
   */
 @JsonDeserialize(using = WrapupPromptEnumDeserializer.class)
  public enum WrapupPromptEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MANDATORY("mandatory"),
    OPTIONAL("optional"),
    AGENTREQUESTED("agentRequested"),
    TIMEOUT("timeout"),
    FORCEDTIMEOUT("forcedTimeout");

    private String value;

    WrapupPromptEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WrapupPromptEnum fromString(String key) {
      if (key == null) return null;

      for (WrapupPromptEnum value : WrapupPromptEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WrapupPromptEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WrapupPromptEnum wrapupPrompt = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Wrapup wrapup = null;
  private ConversationRoutingData conversationRoutingData = null;
  private Integer alertingTimeoutMs = null;
  private String monitoredParticipantId = null;
  private String coachedParticipantId = null;
  private Map<String, String> attributes = null;
  private List<Call> calls = new ArrayList<Call>();
  private List<Callback> callbacks = new ArrayList<Callback>();
  private List<ConversationChat> chats = new ArrayList<ConversationChat>();
  private List<Cobrowsesession> cobrowsesessions = new ArrayList<Cobrowsesession>();
  private List<Email> emails = new ArrayList<Email>();
  private List<Message> messages = new ArrayList<Message>();
  private List<Screenshare> screenshares = new ArrayList<Screenshare>();
  private List<SocialExpression> socialExpressions = new ArrayList<SocialExpression>();
  private List<Video> videos = new ArrayList<Video>();
  private List<Evaluation> evaluations = new ArrayList<Evaluation>();

  private static class ScreenRecordingStateEnumDeserializer extends StdDeserializer<ScreenRecordingStateEnum> {
    public ScreenRecordingStateEnumDeserializer() {
      super(ScreenRecordingStateEnumDeserializer.class);
    }

    @Override
    public ScreenRecordingStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScreenRecordingStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current screen recording state for this participant.
   */
 @JsonDeserialize(using = ScreenRecordingStateEnumDeserializer.class)
  public enum ScreenRecordingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REQUESTED("requested"),
    ACTIVE("active"),
    PAUSED("paused"),
    STOPPED("stopped"),
    ERROR("error"),
    TIMEOUT("timeout");

    private String value;

    ScreenRecordingStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScreenRecordingStateEnum fromString(String key) {
      if (key == null) return null;

      for (ScreenRecordingStateEnum value : ScreenRecordingStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScreenRecordingStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScreenRecordingStateEnum screenRecordingState = null;

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
   * The reason specifying why participant flagged the conversation.
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
  private Date startAcwTime = null;
  private Date endAcwTime = null;

  
  /**
   * A globally unique identifier for this conversation.
   **/
  public Participant id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for this conversation.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The timestamp when this participant joined the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Participant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant joined the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The timestamp when this participant disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Participant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The timestamp when this participant was connected to the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Participant connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant was connected to the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   * A human readable name identifying the participant.
   **/
  public Participant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human readable name identifying the participant.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * If this participant represents a user, then this will be an URI that can be used to fetch the user.
   **/
  public Participant userUri(String userUri) {
    this.userUri = userUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents a user, then this will be an URI that can be used to fetch the user.")
  @JsonProperty("userUri")
  public String getUserUri() {
    return userUri;
  }
  public void setUserUri(String userUri) {
    this.userUri = userUri;
  }

  
  /**
   * If this participant represents a user, then this will be the globally unique identifier for the user.
   **/
  public Participant userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents a user, then this will be the globally unique identifier for the user.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * If this participant represents an external contact, then this will be the globally unique identifier for the external contact.
   **/
  public Participant externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external contact, then this will be the globally unique identifier for the external contact.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }

  
  /**
   * If this participant represents an external org, then this will be the globally unique identifier for the external org.
   **/
  public Participant externalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant represents an external org, then this will be the globally unique identifier for the external org.")
  @JsonProperty("externalOrganizationId")
  public String getExternalOrganizationId() {
    return externalOrganizationId;
  }
  public void setExternalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
  }

  
  /**
   * If present, the queue id that the communication channel came in on.
   **/
  public Participant queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If present, the queue id that the communication channel came in on.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * If present, group of users the participant represents.
   **/
  public Participant groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If present, group of users the participant represents.")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * The team id that this participant is a member of when added to the conversation.
   **/
  public Participant teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team id that this participant is a member of when added to the conversation.")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  
  /**
   * If present, the queue name that the communication channel came in on.
   **/
  public Participant queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If present, the queue name that the communication channel came in on.")
  @JsonProperty("queueName")
  public String getQueueName() {
    return queueName;
  }
  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  
  /**
   * A well known string that specifies the purpose of this participant.
   **/
  public Participant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A well known string that specifies the purpose of this participant.")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   * A well known string that specifies the type of this participant.
   **/
  public Participant participantType(String participantType) {
    this.participantType = participantType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A well known string that specifies the type of this participant.")
  @JsonProperty("participantType")
  public String getParticipantType() {
    return participantType;
  }
  public void setParticipantType(String participantType) {
    this.participantType = participantType;
  }

  
  /**
   * If this participant is part of a consult transfer, then this will be the participant id of the participant being transferred.
   **/
  public Participant consultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant is part of a consult transfer, then this will be the participant id of the participant being transferred.")
  @JsonProperty("consultParticipantId")
  public String getConsultParticipantId() {
    return consultParticipantId;
  }
  public void setConsultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
  }

  
  /**
   * The address for the this participant. For a phone call this will be the ANI.
   **/
  public Participant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address for the this participant. For a phone call this will be the ANI.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * The address for the this participant. For a phone call this will be the ANI.
   **/
  public Participant ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address for the this participant. For a phone call this will be the ANI.")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  
  /**
   * The ani-based name for this participant.
   **/
  public Participant aniName(String aniName) {
    this.aniName = aniName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ani-based name for this participant.")
  @JsonProperty("aniName")
  public String getAniName() {
    return aniName;
  }
  public void setAniName(String aniName) {
    this.aniName = aniName;
  }

  
  /**
   * The address for the this participant. For a phone call this will be the ANI.
   **/
  public Participant dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address for the this participant. For a phone call this will be the ANI.")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  
  /**
   * An ISO 639 language code specifying the locale for this participant
   **/
  public Participant locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ISO 639 language code specifying the locale for this participant")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * True iff this participant is required to enter wrapup for this conversation.
   **/
  public Participant wrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True iff this participant is required to enter wrapup for this conversation.")
  @JsonProperty("wrapupRequired")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  
  /**
   * This field controls how the UI prompts the agent for a wrapup.
   **/
  public Participant wrapupPrompt(WrapupPromptEnum wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field controls how the UI prompts the agent for a wrapup.")
  @JsonProperty("wrapupPrompt")
  public WrapupPromptEnum getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(WrapupPromptEnum wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  
  /**
   * Specifies how long a timed ACW session will last.
   **/
  public Participant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long a timed ACW session will last.")
  @JsonProperty("wrapupTimeoutMs")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }

  
  /**
   * The UI sets this field when the agent chooses to skip entering a wrapup for this participant.
   **/
  public Participant wrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI sets this field when the agent chooses to skip entering a wrapup for this participant.")
  @JsonProperty("wrapupSkipped")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  
  /**
   * Call wrap up or disposition data.
   **/
  public Participant wrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Call wrap up or disposition data.")
  @JsonProperty("wrapup")
  public Wrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   * Information on how a communication should be routed to an agent.
   **/
  public Participant conversationRoutingData(ConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information on how a communication should be routed to an agent.")
  @JsonProperty("conversationRoutingData")
  public ConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(ConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   * Specifies how long the agent has to answer an interaction before being marked as not responding.
   **/
  public Participant alertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long the agent has to answer an interaction before being marked as not responding.")
  @JsonProperty("alertingTimeoutMs")
  public Integer getAlertingTimeoutMs() {
    return alertingTimeoutMs;
  }
  public void setAlertingTimeoutMs(Integer alertingTimeoutMs) {
    this.alertingTimeoutMs = alertingTimeoutMs;
  }

  
  /**
   * If this participant is a monitor, then this will be the id of the participant that is being monitored.
   **/
  public Participant monitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant is a monitor, then this will be the id of the participant that is being monitored.")
  @JsonProperty("monitoredParticipantId")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }

  
  /**
   * If this participant is a coach, then this will be the id of the participant that is being coached.
   **/
  public Participant coachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If this participant is a coach, then this will be the id of the participant that is being coached.")
  @JsonProperty("coachedParticipantId")
  public String getCoachedParticipantId() {
    return coachedParticipantId;
  }
  public void setCoachedParticipantId(String coachedParticipantId) {
    this.coachedParticipantId = coachedParticipantId;
  }

  
  /**
   * Additional participant attributes
   **/
  public Participant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional participant attributes")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  
  /**
   **/
  public Participant calls(List<Call> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public List<Call> getCalls() {
    return calls;
  }
  public void setCalls(List<Call> calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public Participant callbacks(List<Callback> callbacks) {
    this.callbacks = callbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callbacks")
  public List<Callback> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<Callback> callbacks) {
    this.callbacks = callbacks;
  }

  
  /**
   **/
  public Participant chats(List<ConversationChat> chats) {
    this.chats = chats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chats")
  public List<ConversationChat> getChats() {
    return chats;
  }
  public void setChats(List<ConversationChat> chats) {
    this.chats = chats;
  }

  
  /**
   **/
  public Participant cobrowsesessions(List<Cobrowsesession> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cobrowsesessions")
  public List<Cobrowsesession> getCobrowsesessions() {
    return cobrowsesessions;
  }
  public void setCobrowsesessions(List<Cobrowsesession> cobrowsesessions) {
    this.cobrowsesessions = cobrowsesessions;
  }

  
  /**
   **/
  public Participant emails(List<Email> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emails")
  public List<Email> getEmails() {
    return emails;
  }
  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }

  
  /**
   **/
  public Participant messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<Message> getMessages() {
    return messages;
  }
  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public Participant screenshares(List<Screenshare> screenshares) {
    this.screenshares = screenshares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenshares")
  public List<Screenshare> getScreenshares() {
    return screenshares;
  }
  public void setScreenshares(List<Screenshare> screenshares) {
    this.screenshares = screenshares;
  }

  
  /**
   **/
  public Participant socialExpressions(List<SocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpressions")
  public List<SocialExpression> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<SocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }

  
  /**
   **/
  public Participant videos(List<Video> videos) {
    this.videos = videos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("videos")
  public List<Video> getVideos() {
    return videos;
  }
  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

  
  /**
   **/
  public Participant evaluations(List<Evaluation> evaluations) {
    this.evaluations = evaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluations")
  public List<Evaluation> getEvaluations() {
    return evaluations;
  }
  public void setEvaluations(List<Evaluation> evaluations) {
    this.evaluations = evaluations;
  }

  
  /**
   * The current screen recording state for this participant.
   **/
  public Participant screenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current screen recording state for this participant.")
  @JsonProperty("screenRecordingState")
  public ScreenRecordingStateEnum getScreenRecordingState() {
    return screenRecordingState;
  }
  public void setScreenRecordingState(ScreenRecordingStateEnum screenRecordingState) {
    this.screenRecordingState = screenRecordingState;
  }

  
  /**
   * The reason specifying why participant flagged the conversation.
   **/
  public Participant flaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason specifying why participant flagged the conversation.")
  @JsonProperty("flaggedReason")
  public FlaggedReasonEnum getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
  }

  
  /**
   * The timestamp when this participant started after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Participant startAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant started after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startAcwTime")
  public Date getStartAcwTime() {
    return startAcwTime;
  }
  public void setStartAcwTime(Date startAcwTime) {
    this.startAcwTime = startAcwTime;
  }

  
  /**
   * The timestamp when this participant ended after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Participant endAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp when this participant ended after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endAcwTime")
  public Date getEndAcwTime() {
    return endAcwTime;
  }
  public void setEndAcwTime(Date endAcwTime) {
    this.endAcwTime = endAcwTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.id, participant.id) &&
        Objects.equals(this.startTime, participant.startTime) &&
        Objects.equals(this.endTime, participant.endTime) &&
        Objects.equals(this.connectedTime, participant.connectedTime) &&
        Objects.equals(this.name, participant.name) &&
        Objects.equals(this.userUri, participant.userUri) &&
        Objects.equals(this.userId, participant.userId) &&
        Objects.equals(this.externalContactId, participant.externalContactId) &&
        Objects.equals(this.externalOrganizationId, participant.externalOrganizationId) &&
        Objects.equals(this.queueId, participant.queueId) &&
        Objects.equals(this.groupId, participant.groupId) &&
        Objects.equals(this.teamId, participant.teamId) &&
        Objects.equals(this.queueName, participant.queueName) &&
        Objects.equals(this.purpose, participant.purpose) &&
        Objects.equals(this.participantType, participant.participantType) &&
        Objects.equals(this.consultParticipantId, participant.consultParticipantId) &&
        Objects.equals(this.address, participant.address) &&
        Objects.equals(this.ani, participant.ani) &&
        Objects.equals(this.aniName, participant.aniName) &&
        Objects.equals(this.dnis, participant.dnis) &&
        Objects.equals(this.locale, participant.locale) &&
        Objects.equals(this.wrapupRequired, participant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, participant.wrapupPrompt) &&
        Objects.equals(this.wrapupTimeoutMs, participant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, participant.wrapupSkipped) &&
        Objects.equals(this.wrapup, participant.wrapup) &&
        Objects.equals(this.conversationRoutingData, participant.conversationRoutingData) &&
        Objects.equals(this.alertingTimeoutMs, participant.alertingTimeoutMs) &&
        Objects.equals(this.monitoredParticipantId, participant.monitoredParticipantId) &&
        Objects.equals(this.coachedParticipantId, participant.coachedParticipantId) &&
        Objects.equals(this.attributes, participant.attributes) &&
        Objects.equals(this.calls, participant.calls) &&
        Objects.equals(this.callbacks, participant.callbacks) &&
        Objects.equals(this.chats, participant.chats) &&
        Objects.equals(this.cobrowsesessions, participant.cobrowsesessions) &&
        Objects.equals(this.emails, participant.emails) &&
        Objects.equals(this.messages, participant.messages) &&
        Objects.equals(this.screenshares, participant.screenshares) &&
        Objects.equals(this.socialExpressions, participant.socialExpressions) &&
        Objects.equals(this.videos, participant.videos) &&
        Objects.equals(this.evaluations, participant.evaluations) &&
        Objects.equals(this.screenRecordingState, participant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, participant.flaggedReason) &&
        Objects.equals(this.startAcwTime, participant.startAcwTime) &&
        Objects.equals(this.endAcwTime, participant.endAcwTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, connectedTime, name, userUri, userId, externalContactId, externalOrganizationId, queueId, groupId, teamId, queueName, purpose, participantType, consultParticipantId, address, ani, aniName, dnis, locale, wrapupRequired, wrapupPrompt, wrapupTimeoutMs, wrapupSkipped, wrapup, conversationRoutingData, alertingTimeoutMs, monitoredParticipantId, coachedParticipantId, attributes, calls, callbacks, chats, cobrowsesessions, emails, messages, screenshares, socialExpressions, videos, evaluations, screenRecordingState, flaggedReason, startAcwTime, endAcwTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userUri: ").append(toIndentedString(userUri)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalOrganizationId: ").append(toIndentedString(externalOrganizationId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
    sb.append("    consultParticipantId: ").append(toIndentedString(consultParticipantId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    aniName: ").append(toIndentedString(aniName)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    conversationRoutingData: ").append(toIndentedString(conversationRoutingData)).append("\n");
    sb.append("    alertingTimeoutMs: ").append(toIndentedString(alertingTimeoutMs)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    coachedParticipantId: ").append(toIndentedString(coachedParticipantId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
    sb.append("    chats: ").append(toIndentedString(chats)).append("\n");
    sb.append("    cobrowsesessions: ").append(toIndentedString(cobrowsesessions)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    screenshares: ").append(toIndentedString(screenshares)).append("\n");
    sb.append("    socialExpressions: ").append(toIndentedString(socialExpressions)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
    sb.append("    screenRecordingState: ").append(toIndentedString(screenRecordingState)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    startAcwTime: ").append(toIndentedString(startAcwTime)).append("\n");
    sb.append("    endAcwTime: ").append(toIndentedString(endAcwTime)).append("\n");
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

