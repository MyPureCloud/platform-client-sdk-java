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
import com.mypurecloud.sdk.v2.model.AcwSettings;
import com.mypurecloud.sdk.v2.model.Bullseye;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.MediaSetting;
import com.mypurecloud.sdk.v2.model.QueueEmailAddress;
import com.mypurecloud.sdk.v2.model.QueueMessagingAddresses;
import com.mypurecloud.sdk.v2.model.RoutingRule;
import com.mypurecloud.sdk.v2.model.Script;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UserQueue
 */

public class UserQueue  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private String description = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String modifiedBy = null;
  private String createdBy = null;
  private Integer memberCount = null;
  private Integer userMemberCount = null;
  private Integer joinedMemberCount = null;
  private Map<String, MediaSetting> mediaSettings = null;
  private List<RoutingRule> routingRules = new ArrayList<RoutingRule>();
  private Bullseye bullseye = null;
  private AcwSettings acwSettings = null;

  private static class SkillEvaluationMethodEnumDeserializer extends StdDeserializer<SkillEvaluationMethodEnum> {
    public SkillEvaluationMethodEnumDeserializer() {
      super(SkillEvaluationMethodEnumDeserializer.class);
    }

    @Override
    public SkillEvaluationMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SkillEvaluationMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The skill evaluation method to use when routing conversations.
   */
 @JsonDeserialize(using = SkillEvaluationMethodEnumDeserializer.class)
  public enum SkillEvaluationMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("NONE"),
    BEST("BEST"),
    ALL("ALL");

    private String value;

    SkillEvaluationMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SkillEvaluationMethodEnum fromString(String key) {
      if (key == null) return null;

      for (SkillEvaluationMethodEnum value : SkillEvaluationMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SkillEvaluationMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SkillEvaluationMethodEnum skillEvaluationMethod = null;
  private DomainEntityRef queueFlow = null;
  private DomainEntityRef emailInQueueFlow = null;
  private DomainEntityRef messageInQueueFlow = null;
  private DomainEntityRef whisperPrompt = null;
  private Boolean enableTranscription = null;
  private Boolean enableManualAssignment = null;
  private String callingPartyName = null;
  private String callingPartyNumber = null;
  private Map<String, Script> defaultScripts = null;
  private QueueMessagingAddresses outboundMessagingAddresses = null;
  private QueueEmailAddress outboundEmailAddress = null;
  private Boolean joined = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserQueue name(String name) {
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
   * The division to which this entity belongs.
   **/
  public UserQueue division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }

  
  /**
   * The queue description.
   **/
  public UserQueue description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The date the queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserQueue dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The date of the last modification to the queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserQueue dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the last modification to the queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * The ID of the user that last modified the queue.
   **/
  public UserQueue modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the user that last modified the queue.")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * The ID of the user that created the queue.
   **/
  public UserQueue createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the user that created the queue.")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The total number of members in the queue.")
  @JsonProperty("memberCount")
  public Integer getMemberCount() {
    return memberCount;
  }

  
  @ApiModelProperty(example = "null", value = "The number of user members (i.e., non-group members) in the queue.")
  @JsonProperty("userMemberCount")
  public Integer getUserMemberCount() {
    return userMemberCount;
  }

  
  @ApiModelProperty(example = "null", value = "The number of joined members in the queue.")
  @JsonProperty("joinedMemberCount")
  public Integer getJoinedMemberCount() {
    return joinedMemberCount;
  }

  
  /**
   * The media settings for the queue. Valid key values: CALL, CALLBACK, CHAT, EMAIL, MESSAGE, SOCIAL_EXPRESSION, VIDEO_COMM
   **/
  public UserQueue mediaSettings(Map<String, MediaSetting> mediaSettings) {
    this.mediaSettings = mediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media settings for the queue. Valid key values: CALL, CALLBACK, CHAT, EMAIL, MESSAGE, SOCIAL_EXPRESSION, VIDEO_COMM")
  @JsonProperty("mediaSettings")
  public Map<String, MediaSetting> getMediaSettings() {
    return mediaSettings;
  }
  public void setMediaSettings(Map<String, MediaSetting> mediaSettings) {
    this.mediaSettings = mediaSettings;
  }

  
  /**
   * The routing rules for the queue, used for routing to known or preferred agents.
   **/
  public UserQueue routingRules(List<RoutingRule> routingRules) {
    this.routingRules = routingRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The routing rules for the queue, used for routing to known or preferred agents.")
  @JsonProperty("routingRules")
  public List<RoutingRule> getRoutingRules() {
    return routingRules;
  }
  public void setRoutingRules(List<RoutingRule> routingRules) {
    this.routingRules = routingRules;
  }

  
  /**
   * The bulls-eye settings for the queue.
   **/
  public UserQueue bullseye(Bullseye bullseye) {
    this.bullseye = bullseye;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bulls-eye settings for the queue.")
  @JsonProperty("bullseye")
  public Bullseye getBullseye() {
    return bullseye;
  }
  public void setBullseye(Bullseye bullseye) {
    this.bullseye = bullseye;
  }

  
  /**
   * The ACW settings for the queue.
   **/
  public UserQueue acwSettings(AcwSettings acwSettings) {
    this.acwSettings = acwSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ACW settings for the queue.")
  @JsonProperty("acwSettings")
  public AcwSettings getAcwSettings() {
    return acwSettings;
  }
  public void setAcwSettings(AcwSettings acwSettings) {
    this.acwSettings = acwSettings;
  }

  
  /**
   * The skill evaluation method to use when routing conversations.
   **/
  public UserQueue skillEvaluationMethod(SkillEvaluationMethodEnum skillEvaluationMethod) {
    this.skillEvaluationMethod = skillEvaluationMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill evaluation method to use when routing conversations.")
  @JsonProperty("skillEvaluationMethod")
  public SkillEvaluationMethodEnum getSkillEvaluationMethod() {
    return skillEvaluationMethod;
  }
  public void setSkillEvaluationMethod(SkillEvaluationMethodEnum skillEvaluationMethod) {
    this.skillEvaluationMethod = skillEvaluationMethod;
  }

  
  /**
   * The in-queue flow to use for call conversations waiting in queue.
   **/
  public UserQueue queueFlow(DomainEntityRef queueFlow) {
    this.queueFlow = queueFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The in-queue flow to use for call conversations waiting in queue.")
  @JsonProperty("queueFlow")
  public DomainEntityRef getQueueFlow() {
    return queueFlow;
  }
  public void setQueueFlow(DomainEntityRef queueFlow) {
    this.queueFlow = queueFlow;
  }

  
  /**
   * The in-queue flow to use for email conversations waiting in queue.
   **/
  public UserQueue emailInQueueFlow(DomainEntityRef emailInQueueFlow) {
    this.emailInQueueFlow = emailInQueueFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The in-queue flow to use for email conversations waiting in queue.")
  @JsonProperty("emailInQueueFlow")
  public DomainEntityRef getEmailInQueueFlow() {
    return emailInQueueFlow;
  }
  public void setEmailInQueueFlow(DomainEntityRef emailInQueueFlow) {
    this.emailInQueueFlow = emailInQueueFlow;
  }

  
  /**
   * The in-queue flow to use for message conversations waiting in queue.
   **/
  public UserQueue messageInQueueFlow(DomainEntityRef messageInQueueFlow) {
    this.messageInQueueFlow = messageInQueueFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The in-queue flow to use for message conversations waiting in queue.")
  @JsonProperty("messageInQueueFlow")
  public DomainEntityRef getMessageInQueueFlow() {
    return messageInQueueFlow;
  }
  public void setMessageInQueueFlow(DomainEntityRef messageInQueueFlow) {
    this.messageInQueueFlow = messageInQueueFlow;
  }

  
  /**
   * The prompt used for whisper on the queue, if configured.
   **/
  public UserQueue whisperPrompt(DomainEntityRef whisperPrompt) {
    this.whisperPrompt = whisperPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The prompt used for whisper on the queue, if configured.")
  @JsonProperty("whisperPrompt")
  public DomainEntityRef getWhisperPrompt() {
    return whisperPrompt;
  }
  public void setWhisperPrompt(DomainEntityRef whisperPrompt) {
    this.whisperPrompt = whisperPrompt;
  }

  
  /**
   * Indicates whether voice transcription is enabled for this queue.
   **/
  public UserQueue enableTranscription(Boolean enableTranscription) {
    this.enableTranscription = enableTranscription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether voice transcription is enabled for this queue.")
  @JsonProperty("enableTranscription")
  public Boolean getEnableTranscription() {
    return enableTranscription;
  }
  public void setEnableTranscription(Boolean enableTranscription) {
    this.enableTranscription = enableTranscription;
  }

  
  /**
   * Indicates whether manual assignment is enabled for this queue.
   **/
  public UserQueue enableManualAssignment(Boolean enableManualAssignment) {
    this.enableManualAssignment = enableManualAssignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether manual assignment is enabled for this queue.")
  @JsonProperty("enableManualAssignment")
  public Boolean getEnableManualAssignment() {
    return enableManualAssignment;
  }
  public void setEnableManualAssignment(Boolean enableManualAssignment) {
    this.enableManualAssignment = enableManualAssignment;
  }

  
  /**
   * The name to use for caller identification for outbound calls from this queue.
   **/
  public UserQueue callingPartyName(String callingPartyName) {
    this.callingPartyName = callingPartyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name to use for caller identification for outbound calls from this queue.")
  @JsonProperty("callingPartyName")
  public String getCallingPartyName() {
    return callingPartyName;
  }
  public void setCallingPartyName(String callingPartyName) {
    this.callingPartyName = callingPartyName;
  }

  
  /**
   * The phone number to use for caller identification for outbound calls from this queue.
   **/
  public UserQueue callingPartyNumber(String callingPartyNumber) {
    this.callingPartyNumber = callingPartyNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number to use for caller identification for outbound calls from this queue.")
  @JsonProperty("callingPartyNumber")
  public String getCallingPartyNumber() {
    return callingPartyNumber;
  }
  public void setCallingPartyNumber(String callingPartyNumber) {
    this.callingPartyNumber = callingPartyNumber;
  }

  
  /**
   * The default script Ids for the communication types.
   **/
  public UserQueue defaultScripts(Map<String, Script> defaultScripts) {
    this.defaultScripts = defaultScripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default script Ids for the communication types.")
  @JsonProperty("defaultScripts")
  public Map<String, Script> getDefaultScripts() {
    return defaultScripts;
  }
  public void setDefaultScripts(Map<String, Script> defaultScripts) {
    this.defaultScripts = defaultScripts;
  }

  
  /**
   * The messaging addresses for the queue.
   **/
  public UserQueue outboundMessagingAddresses(QueueMessagingAddresses outboundMessagingAddresses) {
    this.outboundMessagingAddresses = outboundMessagingAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging addresses for the queue.")
  @JsonProperty("outboundMessagingAddresses")
  public QueueMessagingAddresses getOutboundMessagingAddresses() {
    return outboundMessagingAddresses;
  }
  public void setOutboundMessagingAddresses(QueueMessagingAddresses outboundMessagingAddresses) {
    this.outboundMessagingAddresses = outboundMessagingAddresses;
  }

  
  /**
   **/
  public UserQueue outboundEmailAddress(QueueEmailAddress outboundEmailAddress) {
    this.outboundEmailAddress = outboundEmailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundEmailAddress")
  public QueueEmailAddress getOutboundEmailAddress() {
    return outboundEmailAddress;
  }
  public void setOutboundEmailAddress(QueueEmailAddress outboundEmailAddress) {
    this.outboundEmailAddress = outboundEmailAddress;
  }

  
  /**
   **/
  public UserQueue joined(Boolean joined) {
    this.joined = joined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("joined")
  public Boolean getJoined() {
    return joined;
  }
  public void setJoined(Boolean joined) {
    this.joined = joined;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserQueue userQueue = (UserQueue) o;
    return Objects.equals(this.id, userQueue.id) &&
        Objects.equals(this.name, userQueue.name) &&
        Objects.equals(this.division, userQueue.division) &&
        Objects.equals(this.description, userQueue.description) &&
        Objects.equals(this.dateCreated, userQueue.dateCreated) &&
        Objects.equals(this.dateModified, userQueue.dateModified) &&
        Objects.equals(this.modifiedBy, userQueue.modifiedBy) &&
        Objects.equals(this.createdBy, userQueue.createdBy) &&
        Objects.equals(this.memberCount, userQueue.memberCount) &&
        Objects.equals(this.userMemberCount, userQueue.userMemberCount) &&
        Objects.equals(this.joinedMemberCount, userQueue.joinedMemberCount) &&
        Objects.equals(this.mediaSettings, userQueue.mediaSettings) &&
        Objects.equals(this.routingRules, userQueue.routingRules) &&
        Objects.equals(this.bullseye, userQueue.bullseye) &&
        Objects.equals(this.acwSettings, userQueue.acwSettings) &&
        Objects.equals(this.skillEvaluationMethod, userQueue.skillEvaluationMethod) &&
        Objects.equals(this.queueFlow, userQueue.queueFlow) &&
        Objects.equals(this.emailInQueueFlow, userQueue.emailInQueueFlow) &&
        Objects.equals(this.messageInQueueFlow, userQueue.messageInQueueFlow) &&
        Objects.equals(this.whisperPrompt, userQueue.whisperPrompt) &&
        Objects.equals(this.enableTranscription, userQueue.enableTranscription) &&
        Objects.equals(this.enableManualAssignment, userQueue.enableManualAssignment) &&
        Objects.equals(this.callingPartyName, userQueue.callingPartyName) &&
        Objects.equals(this.callingPartyNumber, userQueue.callingPartyNumber) &&
        Objects.equals(this.defaultScripts, userQueue.defaultScripts) &&
        Objects.equals(this.outboundMessagingAddresses, userQueue.outboundMessagingAddresses) &&
        Objects.equals(this.outboundEmailAddress, userQueue.outboundEmailAddress) &&
        Objects.equals(this.joined, userQueue.joined) &&
        Objects.equals(this.selfUri, userQueue.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, dateCreated, dateModified, modifiedBy, createdBy, memberCount, userMemberCount, joinedMemberCount, mediaSettings, routingRules, bullseye, acwSettings, skillEvaluationMethod, queueFlow, emailInQueueFlow, messageInQueueFlow, whisperPrompt, enableTranscription, enableManualAssignment, callingPartyName, callingPartyNumber, defaultScripts, outboundMessagingAddresses, outboundEmailAddress, joined, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQueue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    userMemberCount: ").append(toIndentedString(userMemberCount)).append("\n");
    sb.append("    joinedMemberCount: ").append(toIndentedString(joinedMemberCount)).append("\n");
    sb.append("    mediaSettings: ").append(toIndentedString(mediaSettings)).append("\n");
    sb.append("    routingRules: ").append(toIndentedString(routingRules)).append("\n");
    sb.append("    bullseye: ").append(toIndentedString(bullseye)).append("\n");
    sb.append("    acwSettings: ").append(toIndentedString(acwSettings)).append("\n");
    sb.append("    skillEvaluationMethod: ").append(toIndentedString(skillEvaluationMethod)).append("\n");
    sb.append("    queueFlow: ").append(toIndentedString(queueFlow)).append("\n");
    sb.append("    emailInQueueFlow: ").append(toIndentedString(emailInQueueFlow)).append("\n");
    sb.append("    messageInQueueFlow: ").append(toIndentedString(messageInQueueFlow)).append("\n");
    sb.append("    whisperPrompt: ").append(toIndentedString(whisperPrompt)).append("\n");
    sb.append("    enableTranscription: ").append(toIndentedString(enableTranscription)).append("\n");
    sb.append("    enableManualAssignment: ").append(toIndentedString(enableManualAssignment)).append("\n");
    sb.append("    callingPartyName: ").append(toIndentedString(callingPartyName)).append("\n");
    sb.append("    callingPartyNumber: ").append(toIndentedString(callingPartyNumber)).append("\n");
    sb.append("    defaultScripts: ").append(toIndentedString(defaultScripts)).append("\n");
    sb.append("    outboundMessagingAddresses: ").append(toIndentedString(outboundMessagingAddresses)).append("\n");
    sb.append("    outboundEmailAddress: ").append(toIndentedString(outboundEmailAddress)).append("\n");
    sb.append("    joined: ").append(toIndentedString(joined)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

