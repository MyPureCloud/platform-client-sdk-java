package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CampaignNotificationContactSort;
import com.mypurecloud.sdk.v2.model.CampaignNotificationErrors;
import com.mypurecloud.sdk.v2.model.CampaignNotificationPhoneColumns;
import com.mypurecloud.sdk.v2.model.CampaignNotificationUriReference;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignNotification
 */

public class CampaignNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DocumentDataV2NotificationCreatedBy contactList = null;
  private CampaignNotificationUriReference queue = null;

  /**
   * Gets or Sets dialingMode
   */
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("AGENTLESS"),
    PREVIEW("PREVIEW"),
    POWER("POWER"),
    PREDICTIVE("PREDICTIVE"),
    PROGRESSIVE("PROGRESSIVE");

    private String value;

    DialingModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DialingModeEnum fromString(String key) {
      if (key == null) return null;

      for (DialingModeEnum value : DialingModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DialingModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DialingModeEnum dialingMode = null;
  private CampaignNotificationUriReference script = null;
  private CampaignNotificationUriReference edgeGroup = null;

  /**
   * Gets or Sets campaignStatus
   */
  public enum CampaignStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("ON"),
    OFF("OFF"),
    COMPLETE("COMPLETE"),
    STOPPING("STOPPING"),
    INVALID("INVALID");

    private String value;

    CampaignStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CampaignStatusEnum fromString(String key) {
      if (key == null) return null;

      for (CampaignStatusEnum value : CampaignStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CampaignStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CampaignStatusEnum campaignStatus = null;
  private List<CampaignNotificationPhoneColumns> phoneColumns = new ArrayList<CampaignNotificationPhoneColumns>();
  private BigDecimal abandonRate = null;
  private List<CampaignNotificationUriReference> dncLists = new ArrayList<CampaignNotificationUriReference>();
  private CampaignNotificationUriReference callableTimeSet = null;
  private CampaignNotificationUriReference callAnalysisResponseSet = null;
  private String callerName = null;
  private String callerAddress = null;
  private Integer outboundLineCount = null;
  private List<CampaignNotificationErrors> errors = new ArrayList<CampaignNotificationErrors>();
  private List<CampaignNotificationUriReference> ruleSets = new ArrayList<CampaignNotificationUriReference>();
  private Boolean skipPreviewDisabled = null;
  private Integer previewTimeOutSeconds = null;
  private Boolean singleNumberPreview = null;
  private CampaignNotificationContactSort contactSort = null;
  private Integer noAnswerTimeout = null;
  private String callAnalysisLanguage = null;
  private Integer priority = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CampaignNotification id(String id) {
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
  public CampaignNotification name(String name) {
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
  public CampaignNotification dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public CampaignNotification dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public CampaignNotification version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   **/
  public CampaignNotification contactList(DocumentDataV2NotificationCreatedBy contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactList")
  public DocumentDataV2NotificationCreatedBy getContactList() {
    return contactList;
  }
  public void setContactList(DocumentDataV2NotificationCreatedBy contactList) {
    this.contactList = contactList;
  }


  /**
   **/
  public CampaignNotification queue(CampaignNotificationUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public CampaignNotificationUriReference getQueue() {
    return queue;
  }
  public void setQueue(CampaignNotificationUriReference queue) {
    this.queue = queue;
  }


  /**
   **/
  public CampaignNotification dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }


  /**
   **/
  public CampaignNotification script(CampaignNotificationUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public CampaignNotificationUriReference getScript() {
    return script;
  }
  public void setScript(CampaignNotificationUriReference script) {
    this.script = script;
  }


  /**
   **/
  public CampaignNotification edgeGroup(CampaignNotificationUriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeGroup")
  public CampaignNotificationUriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(CampaignNotificationUriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
  }


  /**
   **/
  public CampaignNotification campaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignStatus")
  public CampaignStatusEnum getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  /**
   **/
  public CampaignNotification phoneColumns(List<CampaignNotificationPhoneColumns> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneColumns")
  public List<CampaignNotificationPhoneColumns> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<CampaignNotificationPhoneColumns> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }


  /**
   **/
  public CampaignNotification abandonRate(BigDecimal abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("abandonRate")
  public BigDecimal getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(BigDecimal abandonRate) {
    this.abandonRate = abandonRate;
  }


  /**
   **/
  public CampaignNotification dncLists(List<CampaignNotificationUriReference> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dncLists")
  public List<CampaignNotificationUriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<CampaignNotificationUriReference> dncLists) {
    this.dncLists = dncLists;
  }


  /**
   **/
  public CampaignNotification callableTimeSet(CampaignNotificationUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callableTimeSet")
  public CampaignNotificationUriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(CampaignNotificationUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }


  /**
   **/
  public CampaignNotification callAnalysisResponseSet(CampaignNotificationUriReference callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callAnalysisResponseSet")
  public CampaignNotificationUriReference getCallAnalysisResponseSet() {
    return callAnalysisResponseSet;
  }
  public void setCallAnalysisResponseSet(CampaignNotificationUriReference callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
  }


  /**
   **/
  public CampaignNotification callerName(String callerName) {
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
  public CampaignNotification callerAddress(String callerAddress) {
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
   **/
  public CampaignNotification outboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundLineCount")
  public Integer getOutboundLineCount() {
    return outboundLineCount;
  }
  public void setOutboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
  }


  /**
   **/
  public CampaignNotification errors(List<CampaignNotificationErrors> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<CampaignNotificationErrors> getErrors() {
    return errors;
  }
  public void setErrors(List<CampaignNotificationErrors> errors) {
    this.errors = errors;
  }


  /**
   **/
  public CampaignNotification ruleSets(List<CampaignNotificationUriReference> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleSets")
  public List<CampaignNotificationUriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<CampaignNotificationUriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }


  /**
   **/
  public CampaignNotification skipPreviewDisabled(Boolean skipPreviewDisabled) {
    this.skipPreviewDisabled = skipPreviewDisabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skipPreviewDisabled")
  public Boolean getSkipPreviewDisabled() {
    return skipPreviewDisabled;
  }
  public void setSkipPreviewDisabled(Boolean skipPreviewDisabled) {
    this.skipPreviewDisabled = skipPreviewDisabled;
  }


  /**
   **/
  public CampaignNotification previewTimeOutSeconds(Integer previewTimeOutSeconds) {
    this.previewTimeOutSeconds = previewTimeOutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewTimeOutSeconds")
  public Integer getPreviewTimeOutSeconds() {
    return previewTimeOutSeconds;
  }
  public void setPreviewTimeOutSeconds(Integer previewTimeOutSeconds) {
    this.previewTimeOutSeconds = previewTimeOutSeconds;
  }


  /**
   **/
  public CampaignNotification singleNumberPreview(Boolean singleNumberPreview) {
    this.singleNumberPreview = singleNumberPreview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("singleNumberPreview")
  public Boolean getSingleNumberPreview() {
    return singleNumberPreview;
  }
  public void setSingleNumberPreview(Boolean singleNumberPreview) {
    this.singleNumberPreview = singleNumberPreview;
  }


  /**
   **/
  public CampaignNotification contactSort(CampaignNotificationContactSort contactSort) {
    this.contactSort = contactSort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactSort")
  public CampaignNotificationContactSort getContactSort() {
    return contactSort;
  }
  public void setContactSort(CampaignNotificationContactSort contactSort) {
    this.contactSort = contactSort;
  }


  /**
   **/
  public CampaignNotification noAnswerTimeout(Integer noAnswerTimeout) {
    this.noAnswerTimeout = noAnswerTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noAnswerTimeout")
  public Integer getNoAnswerTimeout() {
    return noAnswerTimeout;
  }
  public void setNoAnswerTimeout(Integer noAnswerTimeout) {
    this.noAnswerTimeout = noAnswerTimeout;
  }


  /**
   **/
  public CampaignNotification callAnalysisLanguage(String callAnalysisLanguage) {
    this.callAnalysisLanguage = callAnalysisLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callAnalysisLanguage")
  public String getCallAnalysisLanguage() {
    return callAnalysisLanguage;
  }
  public void setCallAnalysisLanguage(String callAnalysisLanguage) {
    this.callAnalysisLanguage = callAnalysisLanguage;
  }


  /**
   **/
  public CampaignNotification priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   **/
  public CampaignNotification additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignNotification campaignNotification = (CampaignNotification) o;
    return Objects.equals(this.id, campaignNotification.id) &&
        Objects.equals(this.name, campaignNotification.name) &&
        Objects.equals(this.dateCreated, campaignNotification.dateCreated) &&
        Objects.equals(this.dateModified, campaignNotification.dateModified) &&
        Objects.equals(this.version, campaignNotification.version) &&
        Objects.equals(this.contactList, campaignNotification.contactList) &&
        Objects.equals(this.queue, campaignNotification.queue) &&
        Objects.equals(this.dialingMode, campaignNotification.dialingMode) &&
        Objects.equals(this.script, campaignNotification.script) &&
        Objects.equals(this.edgeGroup, campaignNotification.edgeGroup) &&
        Objects.equals(this.campaignStatus, campaignNotification.campaignStatus) &&
        Objects.equals(this.phoneColumns, campaignNotification.phoneColumns) &&
        Objects.equals(this.abandonRate, campaignNotification.abandonRate) &&
        Objects.equals(this.dncLists, campaignNotification.dncLists) &&
        Objects.equals(this.callableTimeSet, campaignNotification.callableTimeSet) &&
        Objects.equals(this.callAnalysisResponseSet, campaignNotification.callAnalysisResponseSet) &&
        Objects.equals(this.callerName, campaignNotification.callerName) &&
        Objects.equals(this.callerAddress, campaignNotification.callerAddress) &&
        Objects.equals(this.outboundLineCount, campaignNotification.outboundLineCount) &&
        Objects.equals(this.errors, campaignNotification.errors) &&
        Objects.equals(this.ruleSets, campaignNotification.ruleSets) &&
        Objects.equals(this.skipPreviewDisabled, campaignNotification.skipPreviewDisabled) &&
        Objects.equals(this.previewTimeOutSeconds, campaignNotification.previewTimeOutSeconds) &&
        Objects.equals(this.singleNumberPreview, campaignNotification.singleNumberPreview) &&
        Objects.equals(this.contactSort, campaignNotification.contactSort) &&
        Objects.equals(this.noAnswerTimeout, campaignNotification.noAnswerTimeout) &&
        Objects.equals(this.callAnalysisLanguage, campaignNotification.callAnalysisLanguage) &&
        Objects.equals(this.priority, campaignNotification.priority) &&
        Objects.equals(this.additionalProperties, campaignNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, queue, dialingMode, script, edgeGroup, campaignStatus, phoneColumns, abandonRate, dncLists, callableTimeSet, callAnalysisResponseSet, callerName, callerAddress, outboundLineCount, errors, ruleSets, skipPreviewDisabled, previewTimeOutSeconds, singleNumberPreview, contactSort, noAnswerTimeout, callAnalysisLanguage, priority, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
    sb.append("    dncLists: ").append(toIndentedString(dncLists)).append("\n");
    sb.append("    callableTimeSet: ").append(toIndentedString(callableTimeSet)).append("\n");
    sb.append("    callAnalysisResponseSet: ").append(toIndentedString(callAnalysisResponseSet)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    outboundLineCount: ").append(toIndentedString(outboundLineCount)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
    sb.append("    skipPreviewDisabled: ").append(toIndentedString(skipPreviewDisabled)).append("\n");
    sb.append("    previewTimeOutSeconds: ").append(toIndentedString(previewTimeOutSeconds)).append("\n");
    sb.append("    singleNumberPreview: ").append(toIndentedString(singleNumberPreview)).append("\n");
    sb.append("    contactSort: ").append(toIndentedString(contactSort)).append("\n");
    sb.append("    noAnswerTimeout: ").append(toIndentedString(noAnswerTimeout)).append("\n");
    sb.append("    callAnalysisLanguage: ").append(toIndentedString(callAnalysisLanguage)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

