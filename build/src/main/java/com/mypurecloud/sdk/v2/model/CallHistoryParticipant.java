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
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CallHistoryParticipant
 */

public class CallHistoryParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
  private Date endTime = null;
  private String purpose = null;

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
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
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
  private String ani = null;
  private String dnis = null;
  private User user = null;
  private Queue queue = null;
  private Group group = null;

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
   * The reason the participant was disconnected from the conversation.
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam");

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
  private ExternalContact externalContact = null;
  private ExternalOrganization externalOrganization = null;
  private Boolean didInteract = null;
  private List<Long> sipResponseCodes = new ArrayList<Long>();

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
  private Campaign outboundCampaign = null;

  
  /**
   * The unique participant ID.
   **/
  public CallHistoryParticipant id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique participant ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The display friendly name of the participant.
   **/
  public CallHistoryParticipant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display friendly name of the participant.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The participant address.
   **/
  public CallHistoryParticipant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant address.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CallHistoryParticipant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CallHistoryParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr
   **/
  public CallHistoryParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  
  /**
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
   **/
  public CallHistoryParticipant direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's direction.  Values can be: 'inbound' or 'outbound'")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * The call ANI.
   **/
  public CallHistoryParticipant ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The call ANI.")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  
  /**
   * The call DNIS.
   **/
  public CallHistoryParticipant dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The call DNIS.")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  
  /**
   * The PureCloud user for this participant.
   **/
  public CallHistoryParticipant user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud user for this participant.")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * The PureCloud queue for this participant.
   **/
  public CallHistoryParticipant queue(Queue queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud queue for this participant.")
  @JsonProperty("queue")
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
  }

  
  /**
   * The group involved in the group ring call.
   **/
  public CallHistoryParticipant group(Group group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The group involved in the group ring call.")
  @JsonProperty("group")
  public Group getGroup() {
    return group;
  }
  public void setGroup(Group group) {
    this.group = group;
  }

  
  /**
   * The reason the participant was disconnected from the conversation.
   **/
  public CallHistoryParticipant disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the participant was disconnected from the conversation.")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   * The PureCloud external contact
   **/
  public CallHistoryParticipant externalContact(ExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud external contact")
  @JsonProperty("externalContact")
  public ExternalContact getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(ExternalContact externalContact) {
    this.externalContact = externalContact;
  }

  
  /**
   * The PureCloud external organization
   **/
  public CallHistoryParticipant externalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud external organization")
  @JsonProperty("externalOrganization")
  public ExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   * Indicates whether the contact ever connected
   **/
  public CallHistoryParticipant didInteract(Boolean didInteract) {
    this.didInteract = didInteract;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the contact ever connected")
  @JsonProperty("didInteract")
  public Boolean getDidInteract() {
    return didInteract;
  }
  public void setDidInteract(Boolean didInteract) {
    this.didInteract = didInteract;
  }

  
  /**
   * Indicates SIP Response codes associated with the participant
   **/
  public CallHistoryParticipant sipResponseCodes(List<Long> sipResponseCodes) {
    this.sipResponseCodes = sipResponseCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates SIP Response codes associated with the participant")
  @JsonProperty("sipResponseCodes")
  public List<Long> getSipResponseCodes() {
    return sipResponseCodes;
  }
  public void setSipResponseCodes(List<Long> sipResponseCodes) {
    this.sipResponseCodes = sipResponseCodes;
  }

  
  /**
   * The reason specifying why participant flagged the conversation.
   **/
  public CallHistoryParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
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
   * The outbound campaign associated with the participant
   **/
  public CallHistoryParticipant outboundCampaign(Campaign outboundCampaign) {
    this.outboundCampaign = outboundCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outbound campaign associated with the participant")
  @JsonProperty("outboundCampaign")
  public Campaign getOutboundCampaign() {
    return outboundCampaign;
  }
  public void setOutboundCampaign(Campaign outboundCampaign) {
    this.outboundCampaign = outboundCampaign;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallHistoryParticipant callHistoryParticipant = (CallHistoryParticipant) o;
    return Objects.equals(this.id, callHistoryParticipant.id) &&
        Objects.equals(this.name, callHistoryParticipant.name) &&
        Objects.equals(this.address, callHistoryParticipant.address) &&
        Objects.equals(this.startTime, callHistoryParticipant.startTime) &&
        Objects.equals(this.endTime, callHistoryParticipant.endTime) &&
        Objects.equals(this.purpose, callHistoryParticipant.purpose) &&
        Objects.equals(this.direction, callHistoryParticipant.direction) &&
        Objects.equals(this.ani, callHistoryParticipant.ani) &&
        Objects.equals(this.dnis, callHistoryParticipant.dnis) &&
        Objects.equals(this.user, callHistoryParticipant.user) &&
        Objects.equals(this.queue, callHistoryParticipant.queue) &&
        Objects.equals(this.group, callHistoryParticipant.group) &&
        Objects.equals(this.disconnectType, callHistoryParticipant.disconnectType) &&
        Objects.equals(this.externalContact, callHistoryParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, callHistoryParticipant.externalOrganization) &&
        Objects.equals(this.didInteract, callHistoryParticipant.didInteract) &&
        Objects.equals(this.sipResponseCodes, callHistoryParticipant.sipResponseCodes) &&
        Objects.equals(this.flaggedReason, callHistoryParticipant.flaggedReason) &&
        Objects.equals(this.outboundCampaign, callHistoryParticipant.outboundCampaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, endTime, purpose, direction, ani, dnis, user, queue, group, disconnectType, externalContact, externalOrganization, didInteract, sipResponseCodes, flaggedReason, outboundCampaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallHistoryParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    didInteract: ").append(toIndentedString(didInteract)).append("\n");
    sb.append("    sipResponseCodes: ").append(toIndentedString(sipResponseCodes)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    outboundCampaign: ").append(toIndentedString(outboundCampaign)).append("\n");
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

