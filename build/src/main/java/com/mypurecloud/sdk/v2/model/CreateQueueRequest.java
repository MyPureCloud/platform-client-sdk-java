package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AcwSettings;
import com.mypurecloud.sdk.v2.model.Bullseye;
import com.mypurecloud.sdk.v2.model.MediaSetting;
import com.mypurecloud.sdk.v2.model.QueueEmailAddress;
import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CreateQueueRequest
 */

public class CreateQueueRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableDivision division = null;
  private String description = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String modifiedBy = null;
  private String createdBy = null;

  /**
   * Indicates if the queue is active, inactive, or deleted.
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

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
  private String modifiedByApp = null;
  private String createdByApp = null;
  private Map<String, MediaSetting> mediaSettings = null;
  private Bullseye bullseye = null;
  private AcwSettings acwSettings = null;

  /**
   * The skill evaluation method to use when routing conversations.
   */
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
  private UriReference queueFlow = null;
  private UriReference whisperPrompt = null;
  private Boolean autoAnswerOnly = null;
  private String callingPartyName = null;
  private String callingPartyNumber = null;
  private Map<String, Script> defaultScripts = null;
  private QueueEmailAddress outboundEmailAddress = null;
  private String sourceQueueId = null;
  private Integer memberCount = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The queue name
   **/
  public CreateQueueRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The queue name")
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
  public CreateQueueRequest division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableDivision division) {
    this.division = division;
  }

  
  /**
   * The queue description.
   **/
  public CreateQueueRequest description(String description) {
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
   * The current version of the queue.
   **/
  public CreateQueueRequest version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current version of the queue.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The date the queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CreateQueueRequest dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The date of the last modification to the queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CreateQueueRequest dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the last modification to the queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
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
  public CreateQueueRequest modifiedBy(String modifiedBy) {
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
  public CreateQueueRequest createdBy(String createdBy) {
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

  
  /**
   * Indicates if the queue is active, inactive, or deleted.
   **/
  public CreateQueueRequest state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the queue is active, inactive, or deleted.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The application that last modified the queue.
   **/
  public CreateQueueRequest modifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The application that last modified the queue.")
  @JsonProperty("modifiedByApp")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }

  
  /**
   * The application that created the queue.
   **/
  public CreateQueueRequest createdByApp(String createdByApp) {
    this.createdByApp = createdByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The application that created the queue.")
  @JsonProperty("createdByApp")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
  }

  
  /**
   * The media settings for the queue. Valid Key Values: CALL, CALLBACK, CHAT, EMAIL, SOCIAL_EXPRESSION
   **/
  public CreateQueueRequest mediaSettings(Map<String, MediaSetting> mediaSettings) {
    this.mediaSettings = mediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The media settings for the queue. Valid Key Values: CALL, CALLBACK, CHAT, EMAIL, SOCIAL_EXPRESSION")
  @JsonProperty("mediaSettings")
  public Map<String, MediaSetting> getMediaSettings() {
    return mediaSettings;
  }
  public void setMediaSettings(Map<String, MediaSetting> mediaSettings) {
    this.mediaSettings = mediaSettings;
  }

  
  /**
   * The bulls-eye settings for the queue.
   **/
  public CreateQueueRequest bullseye(Bullseye bullseye) {
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
  public CreateQueueRequest acwSettings(AcwSettings acwSettings) {
    this.acwSettings = acwSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ACW settings for the queue.")
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
  public CreateQueueRequest skillEvaluationMethod(SkillEvaluationMethodEnum skillEvaluationMethod) {
    this.skillEvaluationMethod = skillEvaluationMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The skill evaluation method to use when routing conversations.")
  @JsonProperty("skillEvaluationMethod")
  public SkillEvaluationMethodEnum getSkillEvaluationMethod() {
    return skillEvaluationMethod;
  }
  public void setSkillEvaluationMethod(SkillEvaluationMethodEnum skillEvaluationMethod) {
    this.skillEvaluationMethod = skillEvaluationMethod;
  }

  
  /**
   * The in-queue flow to use for conversations waiting in queue.
   **/
  public CreateQueueRequest queueFlow(UriReference queueFlow) {
    this.queueFlow = queueFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The in-queue flow to use for conversations waiting in queue.")
  @JsonProperty("queueFlow")
  public UriReference getQueueFlow() {
    return queueFlow;
  }
  public void setQueueFlow(UriReference queueFlow) {
    this.queueFlow = queueFlow;
  }

  
  /**
   * The prompt used for whisper on the queue, if configured.
   **/
  public CreateQueueRequest whisperPrompt(UriReference whisperPrompt) {
    this.whisperPrompt = whisperPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The prompt used for whisper on the queue, if configured.")
  @JsonProperty("whisperPrompt")
  public UriReference getWhisperPrompt() {
    return whisperPrompt;
  }
  public void setWhisperPrompt(UriReference whisperPrompt) {
    this.whisperPrompt = whisperPrompt;
  }

  
  /**
   * Specifies whether the configured whisper should play for all ACD calls, or only for those which are auto-answered.
   **/
  public CreateQueueRequest autoAnswerOnly(Boolean autoAnswerOnly) {
    this.autoAnswerOnly = autoAnswerOnly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies whether the configured whisper should play for all ACD calls, or only for those which are auto-answered.")
  @JsonProperty("autoAnswerOnly")
  public Boolean getAutoAnswerOnly() {
    return autoAnswerOnly;
  }
  public void setAutoAnswerOnly(Boolean autoAnswerOnly) {
    this.autoAnswerOnly = autoAnswerOnly;
  }

  
  /**
   * The name to use for caller identification for outbound calls from this queue.
   **/
  public CreateQueueRequest callingPartyName(String callingPartyName) {
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
  public CreateQueueRequest callingPartyNumber(String callingPartyNumber) {
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
  public CreateQueueRequest defaultScripts(Map<String, Script> defaultScripts) {
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
   **/
  public CreateQueueRequest outboundEmailAddress(QueueEmailAddress outboundEmailAddress) {
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
   * The id of an existing queue to copy the settings from when creating a new queue.
   **/
  public CreateQueueRequest sourceQueueId(String sourceQueueId) {
    this.sourceQueueId = sourceQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of an existing queue to copy the settings from when creating a new queue.")
  @JsonProperty("sourceQueueId")
  public String getSourceQueueId() {
    return sourceQueueId;
  }
  public void setSourceQueueId(String sourceQueueId) {
    this.sourceQueueId = sourceQueueId;
  }

  
  /**
   **/
  public CreateQueueRequest memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("memberCount")
  public Integer getMemberCount() {
    return memberCount;
  }
  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
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
    CreateQueueRequest createQueueRequest = (CreateQueueRequest) o;
    return Objects.equals(this.id, createQueueRequest.id) &&
        Objects.equals(this.name, createQueueRequest.name) &&
        Objects.equals(this.division, createQueueRequest.division) &&
        Objects.equals(this.description, createQueueRequest.description) &&
        Objects.equals(this.version, createQueueRequest.version) &&
        Objects.equals(this.dateCreated, createQueueRequest.dateCreated) &&
        Objects.equals(this.dateModified, createQueueRequest.dateModified) &&
        Objects.equals(this.modifiedBy, createQueueRequest.modifiedBy) &&
        Objects.equals(this.createdBy, createQueueRequest.createdBy) &&
        Objects.equals(this.state, createQueueRequest.state) &&
        Objects.equals(this.modifiedByApp, createQueueRequest.modifiedByApp) &&
        Objects.equals(this.createdByApp, createQueueRequest.createdByApp) &&
        Objects.equals(this.mediaSettings, createQueueRequest.mediaSettings) &&
        Objects.equals(this.bullseye, createQueueRequest.bullseye) &&
        Objects.equals(this.acwSettings, createQueueRequest.acwSettings) &&
        Objects.equals(this.skillEvaluationMethod, createQueueRequest.skillEvaluationMethod) &&
        Objects.equals(this.queueFlow, createQueueRequest.queueFlow) &&
        Objects.equals(this.whisperPrompt, createQueueRequest.whisperPrompt) &&
        Objects.equals(this.autoAnswerOnly, createQueueRequest.autoAnswerOnly) &&
        Objects.equals(this.callingPartyName, createQueueRequest.callingPartyName) &&
        Objects.equals(this.callingPartyNumber, createQueueRequest.callingPartyNumber) &&
        Objects.equals(this.defaultScripts, createQueueRequest.defaultScripts) &&
        Objects.equals(this.outboundEmailAddress, createQueueRequest.outboundEmailAddress) &&
        Objects.equals(this.sourceQueueId, createQueueRequest.sourceQueueId) &&
        Objects.equals(this.memberCount, createQueueRequest.memberCount) &&
        Objects.equals(this.selfUri, createQueueRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, mediaSettings, bullseye, acwSettings, skillEvaluationMethod, queueFlow, whisperPrompt, autoAnswerOnly, callingPartyName, callingPartyNumber, defaultScripts, outboundEmailAddress, sourceQueueId, memberCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQueueRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
    sb.append("    mediaSettings: ").append(toIndentedString(mediaSettings)).append("\n");
    sb.append("    bullseye: ").append(toIndentedString(bullseye)).append("\n");
    sb.append("    acwSettings: ").append(toIndentedString(acwSettings)).append("\n");
    sb.append("    skillEvaluationMethod: ").append(toIndentedString(skillEvaluationMethod)).append("\n");
    sb.append("    queueFlow: ").append(toIndentedString(queueFlow)).append("\n");
    sb.append("    whisperPrompt: ").append(toIndentedString(whisperPrompt)).append("\n");
    sb.append("    autoAnswerOnly: ").append(toIndentedString(autoAnswerOnly)).append("\n");
    sb.append("    callingPartyName: ").append(toIndentedString(callingPartyName)).append("\n");
    sb.append("    callingPartyNumber: ").append(toIndentedString(callingPartyNumber)).append("\n");
    sb.append("    defaultScripts: ").append(toIndentedString(defaultScripts)).append("\n");
    sb.append("    outboundEmailAddress: ").append(toIndentedString(outboundEmailAddress)).append("\n");
    sb.append("    sourceQueueId: ").append(toIndentedString(sourceQueueId)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
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

