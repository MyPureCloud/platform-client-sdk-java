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
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicConversationRoutingData;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicErrorBody;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicJourneyContext;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicMessageDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicUriReference;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueConversationMessageEventTopicMessageMediaParticipant
 */

public class QueueConversationMessageEventTopicMessageMediaParticipant  implements Serializable {
  
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
  private QueueConversationMessageEventTopicUriReference user = null;
  private QueueConversationMessageEventTopicUriReference queue = null;
  private QueueConversationMessageEventTopicUriReference team = null;
  private Map<String, String> attributes = null;
  private QueueConversationMessageEventTopicErrorBody errorInfo = null;
  private QueueConversationMessageEventTopicUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private Integer alertingTimeoutMs = null;
  private String provider = null;
  private QueueConversationMessageEventTopicUriReference externalContact = null;
  private QueueConversationMessageEventTopicUriReference externalOrganization = null;
  private QueueConversationMessageEventTopicWrapup wrapup = null;
  private QueueConversationMessageEventTopicConversationRoutingData conversationRoutingData = null;
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
  private QueueConversationMessageEventTopicJourneyContext journeyContext = null;
  private Date startAcwTime = null;
  private Date endAcwTime = null;
  private List<QueueConversationMessageEventTopicMessageDetails> messages = new ArrayList<QueueConversationMessageEventTopicMessageDetails>();

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    SMS("SMS"),
    TWITTER("TWITTER"),
    FACEBOOK("FACEBOOK"),
    LINE("LINE"),
    VIBER("VIBER"),
    WECHAT("WECHAT"),
    WHATSAPP("WHATSAPP"),
    TELEGRAM("TELEGRAM"),
    KAKAO("KAKAO"),
    WEBMESSAGING("WEBMESSAGING"),
    OPEN("OPEN"),
    INSTAGRAM("INSTAGRAM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String recipientCountry = null;
  private String recipientType = null;

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant id(String id) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant name(String name) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant address(String address) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant startTime(Date startTime) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant connectedTime(Date connectedTime) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant endTime(Date endTime) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant startHoldTime(Date startHoldTime) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant purpose(String purpose) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant state(StateEnum state) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant direction(DirectionEnum direction) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant held(Boolean held) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant wrapupRequired(Boolean wrapupRequired) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant wrapupPrompt(String wrapupPrompt) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant user(QueueConversationMessageEventTopicUriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public QueueConversationMessageEventTopicUriReference getUser() {
    return user;
  }
  public void setUser(QueueConversationMessageEventTopicUriReference user) {
    this.user = user;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant queue(QueueConversationMessageEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationMessageEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationMessageEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant team(QueueConversationMessageEventTopicUriReference team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public QueueConversationMessageEventTopicUriReference getTeam() {
    return team;
  }
  public void setTeam(QueueConversationMessageEventTopicUriReference team) {
    this.team = team;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant attributes(Map<String, String> attributes) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant errorInfo(QueueConversationMessageEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public QueueConversationMessageEventTopicErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationMessageEventTopicErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant script(QueueConversationMessageEventTopicUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public QueueConversationMessageEventTopicUriReference getScript() {
    return script;
  }
  public void setScript(QueueConversationMessageEventTopicUriReference script) {
    this.script = script;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant alertingTimeoutMs(Integer alertingTimeoutMs) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant provider(String provider) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant externalContact(QueueConversationMessageEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public QueueConversationMessageEventTopicUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(QueueConversationMessageEventTopicUriReference externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant externalOrganization(QueueConversationMessageEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public QueueConversationMessageEventTopicUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(QueueConversationMessageEventTopicUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant wrapup(QueueConversationMessageEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public QueueConversationMessageEventTopicWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(QueueConversationMessageEventTopicWrapup wrapup) {
    this.wrapup = wrapup;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant conversationRoutingData(QueueConversationMessageEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationRoutingData")
  public QueueConversationMessageEventTopicConversationRoutingData getConversationRoutingData() {
    return conversationRoutingData;
  }
  public void setConversationRoutingData(QueueConversationMessageEventTopicConversationRoutingData conversationRoutingData) {
    this.conversationRoutingData = conversationRoutingData;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant peer(String peer) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant screenRecordingState(String screenRecordingState) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant journeyContext(QueueConversationMessageEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public QueueConversationMessageEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(QueueConversationMessageEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant startAcwTime(Date startAcwTime) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant endAcwTime(Date endAcwTime) {
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
  public QueueConversationMessageEventTopicMessageMediaParticipant messages(List<QueueConversationMessageEventTopicMessageDetails> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<QueueConversationMessageEventTopicMessageDetails> getMessages() {
    return messages;
  }
  public void setMessages(List<QueueConversationMessageEventTopicMessageDetails> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant recipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientCountry")
  public String getRecipientCountry() {
    return recipientCountry;
  }
  public void setRecipientCountry(String recipientCountry) {
    this.recipientCountry = recipientCountry;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageMediaParticipant recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientType")
  public String getRecipientType() {
    return recipientType;
  }
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationMessageEventTopicMessageMediaParticipant queueConversationMessageEventTopicMessageMediaParticipant = (QueueConversationMessageEventTopicMessageMediaParticipant) o;
    return Objects.equals(this.id, queueConversationMessageEventTopicMessageMediaParticipant.id) &&
        Objects.equals(this.name, queueConversationMessageEventTopicMessageMediaParticipant.name) &&
        Objects.equals(this.address, queueConversationMessageEventTopicMessageMediaParticipant.address) &&
        Objects.equals(this.startTime, queueConversationMessageEventTopicMessageMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, queueConversationMessageEventTopicMessageMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, queueConversationMessageEventTopicMessageMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, queueConversationMessageEventTopicMessageMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, queueConversationMessageEventTopicMessageMediaParticipant.purpose) &&
        Objects.equals(this.state, queueConversationMessageEventTopicMessageMediaParticipant.state) &&
        Objects.equals(this.direction, queueConversationMessageEventTopicMessageMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, queueConversationMessageEventTopicMessageMediaParticipant.disconnectType) &&
        Objects.equals(this.held, queueConversationMessageEventTopicMessageMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, queueConversationMessageEventTopicMessageMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, queueConversationMessageEventTopicMessageMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, queueConversationMessageEventTopicMessageMediaParticipant.user) &&
        Objects.equals(this.queue, queueConversationMessageEventTopicMessageMediaParticipant.queue) &&
        Objects.equals(this.team, queueConversationMessageEventTopicMessageMediaParticipant.team) &&
        Objects.equals(this.attributes, queueConversationMessageEventTopicMessageMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, queueConversationMessageEventTopicMessageMediaParticipant.errorInfo) &&
        Objects.equals(this.script, queueConversationMessageEventTopicMessageMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, queueConversationMessageEventTopicMessageMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, queueConversationMessageEventTopicMessageMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.alertingTimeoutMs, queueConversationMessageEventTopicMessageMediaParticipant.alertingTimeoutMs) &&
        Objects.equals(this.provider, queueConversationMessageEventTopicMessageMediaParticipant.provider) &&
        Objects.equals(this.externalContact, queueConversationMessageEventTopicMessageMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, queueConversationMessageEventTopicMessageMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, queueConversationMessageEventTopicMessageMediaParticipant.wrapup) &&
        Objects.equals(this.conversationRoutingData, queueConversationMessageEventTopicMessageMediaParticipant.conversationRoutingData) &&
        Objects.equals(this.peer, queueConversationMessageEventTopicMessageMediaParticipant.peer) &&
        Objects.equals(this.screenRecordingState, queueConversationMessageEventTopicMessageMediaParticipant.screenRecordingState) &&
        Objects.equals(this.flaggedReason, queueConversationMessageEventTopicMessageMediaParticipant.flaggedReason) &&
        Objects.equals(this.journeyContext, queueConversationMessageEventTopicMessageMediaParticipant.journeyContext) &&
        Objects.equals(this.startAcwTime, queueConversationMessageEventTopicMessageMediaParticipant.startAcwTime) &&
        Objects.equals(this.endAcwTime, queueConversationMessageEventTopicMessageMediaParticipant.endAcwTime) &&
        Objects.equals(this.messages, queueConversationMessageEventTopicMessageMediaParticipant.messages) &&
        Objects.equals(this.type, queueConversationMessageEventTopicMessageMediaParticipant.type) &&
        Objects.equals(this.recipientCountry, queueConversationMessageEventTopicMessageMediaParticipant.recipientCountry) &&
        Objects.equals(this.recipientType, queueConversationMessageEventTopicMessageMediaParticipant.recipientType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, team, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, alertingTimeoutMs, provider, externalContact, externalOrganization, wrapup, conversationRoutingData, peer, screenRecordingState, flaggedReason, journeyContext, startAcwTime, endAcwTime, messages, type, recipientCountry, recipientType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicMessageMediaParticipant {\n");
    
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
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
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

