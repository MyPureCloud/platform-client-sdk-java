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
import com.mypurecloud.sdk.v2.model.ConversationBasic;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignInteraction
 */

public class CampaignInteraction  implements Serializable {
  
  private String id = null;
  private DomainEntityRef campaign = null;
  private DomainEntityRef agent = null;
  private DomainEntityRef contact = null;
  private String destinationAddress = null;
  private Boolean activePreviewCall = null;
  private Date lastActivePreviewWrapupTime = null;
  private Date creationTime = null;
  private Date callPlacedTime = null;
  private Date callRoutedTime = null;
  private Date previewConnectedTime = null;
  private DomainEntityRef queue = null;
  private DomainEntityRef script = null;

  private static class DispositionEnumDeserializer extends StdDeserializer<DispositionEnum> {
    public DispositionEnumDeserializer() {
      super(DispositionEnumDeserializer.class);
    }

    @Override
    public DispositionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DispositionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Describes what happened with call analysis for instance: disposition.classification.callable.person, disposition.classification.callable.noanswer
   */
 @JsonDeserialize(using = DispositionEnumDeserializer.class)
  public enum DispositionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DISCONNECT("DISCONNECT"),
    LIVE_VOICE("LIVE_VOICE"),
    BUSY("BUSY"),
    MACHINE("MACHINE"),
    NO_ANSWER("NO_ANSWER"),
    SIT_CALLABLE("SIT_CALLABLE"),
    SIT_UNCALLABLE("SIT_UNCALLABLE"),
    FAX("FAX");

    private String value;

    DispositionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DispositionEnum fromString(String key) {
      if (key == null) return null;

      for (DispositionEnum value : DispositionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DispositionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DispositionEnum disposition = null;
  private String callerName = null;
  private String callerAddress = null;
  private Date previewPopDeliveredTime = null;
  private ConversationBasic conversation = null;
  private String dialerSystemParticipantId = null;
  private String dialingMode = null;
  private List<DomainEntityRef> skills = new ArrayList<DomainEntityRef>();

  
  /**
   **/
  public CampaignInteraction id(String id) {
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
  public CampaignInteraction campaign(DomainEntityRef campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public DomainEntityRef getCampaign() {
    return campaign;
  }
  public void setCampaign(DomainEntityRef campaign) {
    this.campaign = campaign;
  }

  
  /**
   **/
  public CampaignInteraction agent(DomainEntityRef agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public DomainEntityRef getAgent() {
    return agent;
  }
  public void setAgent(DomainEntityRef agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public CampaignInteraction contact(DomainEntityRef contact) {
    this.contact = contact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contact")
  public DomainEntityRef getContact() {
    return contact;
  }
  public void setContact(DomainEntityRef contact) {
    this.contact = contact;
  }

  
  /**
   **/
  public CampaignInteraction destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationAddress")
  public String getDestinationAddress() {
    return destinationAddress;
  }
  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  
  /**
   * Boolean value if there is an active preview call on the interaction
   **/
  public CampaignInteraction activePreviewCall(Boolean activePreviewCall) {
    this.activePreviewCall = activePreviewCall;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean value if there is an active preview call on the interaction")
  @JsonProperty("activePreviewCall")
  public Boolean getActivePreviewCall() {
    return activePreviewCall;
  }
  public void setActivePreviewCall(Boolean activePreviewCall) {
    this.activePreviewCall = activePreviewCall;
  }

  
  /**
   * The time when the last preview of the interaction was wrapped up. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignInteraction lastActivePreviewWrapupTime(Date lastActivePreviewWrapupTime) {
    this.lastActivePreviewWrapupTime = lastActivePreviewWrapupTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the last preview of the interaction was wrapped up. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("lastActivePreviewWrapupTime")
  public Date getLastActivePreviewWrapupTime() {
    return lastActivePreviewWrapupTime;
  }
  public void setLastActivePreviewWrapupTime(Date lastActivePreviewWrapupTime) {
    this.lastActivePreviewWrapupTime = lastActivePreviewWrapupTime;
  }

  
  /**
   * The time when dialer created the interaction. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignInteraction creationTime(Date creationTime) {
    this.creationTime = creationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when dialer created the interaction. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * The time when the agent or system places the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignInteraction callPlacedTime(Date callPlacedTime) {
    this.callPlacedTime = callPlacedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the agent or system places the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("callPlacedTime")
  public Date getCallPlacedTime() {
    return callPlacedTime;
  }
  public void setCallPlacedTime(Date callPlacedTime) {
    this.callPlacedTime = callPlacedTime;
  }

  
  /**
   * The time when the agent was connected to the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignInteraction callRoutedTime(Date callRoutedTime) {
    this.callRoutedTime = callRoutedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the agent was connected to the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("callRoutedTime")
  public Date getCallRoutedTime() {
    return callRoutedTime;
  }
  public void setCallRoutedTime(Date callRoutedTime) {
    this.callRoutedTime = callRoutedTime;
  }

  
  /**
   * The time when the customer and routing participant are connected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignInteraction previewConnectedTime(Date previewConnectedTime) {
    this.previewConnectedTime = previewConnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the customer and routing participant are connected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("previewConnectedTime")
  public Date getPreviewConnectedTime() {
    return previewConnectedTime;
  }
  public void setPreviewConnectedTime(Date previewConnectedTime) {
    this.previewConnectedTime = previewConnectedTime;
  }

  
  /**
   **/
  public CampaignInteraction queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public CampaignInteraction script(DomainEntityRef script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public DomainEntityRef getScript() {
    return script;
  }
  public void setScript(DomainEntityRef script) {
    this.script = script;
  }

  
  /**
   * Describes what happened with call analysis for instance: disposition.classification.callable.person, disposition.classification.callable.noanswer
   **/
  public CampaignInteraction disposition(DispositionEnum disposition) {
    this.disposition = disposition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes what happened with call analysis for instance: disposition.classification.callable.person, disposition.classification.callable.noanswer")
  @JsonProperty("disposition")
  public DispositionEnum getDisposition() {
    return disposition;
  }
  public void setDisposition(DispositionEnum disposition) {
    this.disposition = disposition;
  }

  
  /**
   **/
  public CampaignInteraction callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callerName")
  public String getCallerName() {
    return callerName;
  }
  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }

  
  /**
   **/
  public CampaignInteraction callerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callerAddress")
  public String getCallerAddress() {
    return callerAddress;
  }
  public void setCallerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignInteraction previewPopDeliveredTime(Date previewPopDeliveredTime) {
    this.previewPopDeliveredTime = previewPopDeliveredTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("previewPopDeliveredTime")
  public Date getPreviewPopDeliveredTime() {
    return previewPopDeliveredTime;
  }
  public void setPreviewPopDeliveredTime(Date previewPopDeliveredTime) {
    this.previewPopDeliveredTime = previewPopDeliveredTime;
  }

  
  /**
   **/
  public CampaignInteraction conversation(ConversationBasic conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public ConversationBasic getConversation() {
    return conversation;
  }
  public void setConversation(ConversationBasic conversation) {
    this.conversation = conversation;
  }

  
  /**
   * conversation participant id that is the dialer system participant to monitor the call from dialer perspective
   **/
  public CampaignInteraction dialerSystemParticipantId(String dialerSystemParticipantId) {
    this.dialerSystemParticipantId = dialerSystemParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "conversation participant id that is the dialer system participant to monitor the call from dialer perspective")
  @JsonProperty("dialerSystemParticipantId")
  public String getDialerSystemParticipantId() {
    return dialerSystemParticipantId;
  }
  public void setDialerSystemParticipantId(String dialerSystemParticipantId) {
    this.dialerSystemParticipantId = dialerSystemParticipantId;
  }

  
  /**
   **/
  public CampaignInteraction dialingMode(String dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialingMode")
  public String getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(String dialingMode) {
    this.dialingMode = dialingMode;
  }

  
  /**
   * Any skills that are attached to the call for routing
   **/
  public CampaignInteraction skills(List<DomainEntityRef> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any skills that are attached to the call for routing")
  @JsonProperty("skills")
  public List<DomainEntityRef> getSkills() {
    return skills;
  }
  public void setSkills(List<DomainEntityRef> skills) {
    this.skills = skills;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignInteraction campaignInteraction = (CampaignInteraction) o;
    return Objects.equals(this.id, campaignInteraction.id) &&
        Objects.equals(this.campaign, campaignInteraction.campaign) &&
        Objects.equals(this.agent, campaignInteraction.agent) &&
        Objects.equals(this.contact, campaignInteraction.contact) &&
        Objects.equals(this.destinationAddress, campaignInteraction.destinationAddress) &&
        Objects.equals(this.activePreviewCall, campaignInteraction.activePreviewCall) &&
        Objects.equals(this.lastActivePreviewWrapupTime, campaignInteraction.lastActivePreviewWrapupTime) &&
        Objects.equals(this.creationTime, campaignInteraction.creationTime) &&
        Objects.equals(this.callPlacedTime, campaignInteraction.callPlacedTime) &&
        Objects.equals(this.callRoutedTime, campaignInteraction.callRoutedTime) &&
        Objects.equals(this.previewConnectedTime, campaignInteraction.previewConnectedTime) &&
        Objects.equals(this.queue, campaignInteraction.queue) &&
        Objects.equals(this.script, campaignInteraction.script) &&
        Objects.equals(this.disposition, campaignInteraction.disposition) &&
        Objects.equals(this.callerName, campaignInteraction.callerName) &&
        Objects.equals(this.callerAddress, campaignInteraction.callerAddress) &&
        Objects.equals(this.previewPopDeliveredTime, campaignInteraction.previewPopDeliveredTime) &&
        Objects.equals(this.conversation, campaignInteraction.conversation) &&
        Objects.equals(this.dialerSystemParticipantId, campaignInteraction.dialerSystemParticipantId) &&
        Objects.equals(this.dialingMode, campaignInteraction.dialingMode) &&
        Objects.equals(this.skills, campaignInteraction.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaign, agent, contact, destinationAddress, activePreviewCall, lastActivePreviewWrapupTime, creationTime, callPlacedTime, callRoutedTime, previewConnectedTime, queue, script, disposition, callerName, callerAddress, previewPopDeliveredTime, conversation, dialerSystemParticipantId, dialingMode, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignInteraction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    activePreviewCall: ").append(toIndentedString(activePreviewCall)).append("\n");
    sb.append("    lastActivePreviewWrapupTime: ").append(toIndentedString(lastActivePreviewWrapupTime)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    callPlacedTime: ").append(toIndentedString(callPlacedTime)).append("\n");
    sb.append("    callRoutedTime: ").append(toIndentedString(callRoutedTime)).append("\n");
    sb.append("    previewConnectedTime: ").append(toIndentedString(previewConnectedTime)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    disposition: ").append(toIndentedString(disposition)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    previewPopDeliveredTime: ").append(toIndentedString(previewPopDeliveredTime)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    dialerSystemParticipantId: ").append(toIndentedString(dialerSystemParticipantId)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

