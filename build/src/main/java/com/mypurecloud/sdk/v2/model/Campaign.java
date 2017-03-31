package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContactSort;
import com.mypurecloud.sdk.v2.model.PhoneColumn;
import com.mypurecloud.sdk.v2.model.RestErrorDetail;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Campaign
 */

public class Campaign  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private UriReference contactList = null;
  private UriReference queue = null;

  /**
   * dialing mode of the campaign
   */
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("agentless"),
    PREVIEW("preview"),
    POWER("power"),
    PREDICTIVE("predictive"),
    PROGRESSIVE("progressive");

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
  private UriReference script = null;
  private UriReference edgeGroup = null;
  private String campaignStatus = null;
  private List<PhoneColumn> phoneColumns = new ArrayList<PhoneColumn>();
  private Double abandonRate = null;
  private List<UriReference> dncLists = new ArrayList<UriReference>();
  private UriReference callableTimeSet = null;
  private UriReference callAnalysisResponseSet = null;
  private List<RestErrorDetail> errors = new ArrayList<RestErrorDetail>();
  private String callerName = null;
  private String callerAddress = null;
  private Integer outboundLineCount = null;
  private List<UriReference> ruleSets = new ArrayList<UriReference>();
  private Boolean skipPreviewDisabled = null;
  private Long previewTimeOutSeconds = null;
  private ContactSort contactSort = null;
  private List<ContactSort> contactSorts = new ArrayList<ContactSort>();
  private Integer noAnswerTimeout = null;
  private String callAnalysisLanguage = null;
  private Integer priority = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public Campaign name(String name) {
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


  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public Campaign version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * identifier of the contact list for the campaign
   **/
  public Campaign contactList(UriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "identifier of the contact list for the campaign")
  @JsonProperty("contactList")
  public UriReference getContactList() {
    return contactList;
  }
  public void setContactList(UriReference contactList) {
    this.contactList = contactList;
  }


  /**
   * identifier of the agent assignment queue, required for all dialing modes other than agentless
   **/
  public Campaign queue(UriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "identifier of the agent assignment queue, required for all dialing modes other than agentless")
  @JsonProperty("queue")
  public UriReference getQueue() {
    return queue;
  }
  public void setQueue(UriReference queue) {
    this.queue = queue;
  }


  /**
   * dialing mode of the campaign
   **/
  public Campaign dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "dialing mode of the campaign")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }


  /**
   * identifier of the campaign script, required for all dialing modes other than agentless
   **/
  public Campaign script(UriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "identifier of the campaign script, required for all dialing modes other than agentless")
  @JsonProperty("script")
  public UriReference getScript() {
    return script;
  }
  public void setScript(UriReference script) {
    this.script = script;
  }


  /**
   * identifier of the edge group, required for all dialing modes other than preview
   **/
  public Campaign edgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "identifier of the edge group, required for all dialing modes other than preview")
  @JsonProperty("edgeGroup")
  public UriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
  }


  /**
   * status of the campaign; can be set to 'on' or 'off'
   **/
  public Campaign campaignStatus(String campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "status of the campaign; can be set to 'on' or 'off'")
  @JsonProperty("campaignStatus")
  public String getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(String campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  /**
   * the contact list phone columns to be called for the campaign
   **/
  public Campaign phoneColumns(List<PhoneColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the contact list phone columns to be called for the campaign")
  @JsonProperty("phoneColumns")
  public List<PhoneColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<PhoneColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }


  /**
   * the targeted abandon rate percentage
   **/
  public Campaign abandonRate(Double abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the targeted abandon rate percentage")
  @JsonProperty("abandonRate")
  public Double getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(Double abandonRate) {
    this.abandonRate = abandonRate;
  }


  /**
   * identifiers of the do not call lists
   **/
  public Campaign dncLists(List<UriReference> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "identifiers of the do not call lists")
  @JsonProperty("dncLists")
  public List<UriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<UriReference> dncLists) {
    this.dncLists = dncLists;
  }


  /**
   * the identifier of the callable time set
   **/
  public Campaign callableTimeSet(UriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the identifier of the callable time set")
  @JsonProperty("callableTimeSet")
  public UriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(UriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }


  /**
   * the identifier of the call analysis response set, required for all dialing modes other than preview
   **/
  public Campaign callAnalysisResponseSet(UriReference callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the identifier of the call analysis response set, required for all dialing modes other than preview")
  @JsonProperty("callAnalysisResponseSet")
  public UriReference getCallAnalysisResponseSet() {
    return callAnalysisResponseSet;
  }
  public void setCallAnalysisResponseSet(UriReference callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
  }


  /**
   * a list of current error conditions associated with the campaign
   **/
  public Campaign errors(List<RestErrorDetail> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of current error conditions associated with the campaign")
  @JsonProperty("errors")
  public List<RestErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<RestErrorDetail> errors) {
    this.errors = errors;
  }


  /**
   * caller id name to be displayed on the outbound call
   **/
  public Campaign callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "caller id name to be displayed on the outbound call")
  @JsonProperty("callerName")
  public String getCallerName() {
    return callerName;
  }
  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }


  /**
   * caller id phone number to be displayed on the outbound call
   **/
  public Campaign callerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "(555) 555-5555", value = "caller id phone number to be displayed on the outbound call")
  @JsonProperty("callerAddress")
  public String getCallerAddress() {
    return callerAddress;
  }
  public void setCallerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
  }


  /**
   * for agentless campaigns, the number of outbound lines to be concurrently dialed
   **/
  public Campaign outboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "for agentless campaigns, the number of outbound lines to be concurrently dialed")
  @JsonProperty("outboundLineCount")
  public Integer getOutboundLineCount() {
    return outboundLineCount;
  }
  public void setOutboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
  }


  /**
   * identifiers of the rule sets
   **/
  public Campaign ruleSets(List<UriReference> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "identifiers of the rule sets")
  @JsonProperty("ruleSets")
  public List<UriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<UriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }


  /**
   * for preview campaigns, indicator of whether the agent can skip a preview without placing a call
   **/
  public Campaign skipPreviewDisabled(Boolean skipPreviewDisabled) {
    this.skipPreviewDisabled = skipPreviewDisabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "for preview campaigns, indicator of whether the agent can skip a preview without placing a call")
  @JsonProperty("skipPreviewDisabled")
  public Boolean getSkipPreviewDisabled() {
    return skipPreviewDisabled;
  }
  public void setSkipPreviewDisabled(Boolean skipPreviewDisabled) {
    this.skipPreviewDisabled = skipPreviewDisabled;
  }


  /**
   * for preview campaigns, number of seconds before a call will be automatically placed. A value of 0 indicates no automatic placement of calls
   **/
  public Campaign previewTimeOutSeconds(Long previewTimeOutSeconds) {
    this.previewTimeOutSeconds = previewTimeOutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "for preview campaigns, number of seconds before a call will be automatically placed. A value of 0 indicates no automatic placement of calls")
  @JsonProperty("previewTimeOutSeconds")
  public Long getPreviewTimeOutSeconds() {
    return previewTimeOutSeconds;
  }
  public void setPreviewTimeOutSeconds(Long previewTimeOutSeconds) {
    this.previewTimeOutSeconds = previewTimeOutSeconds;
  }


  /**
   * information determining the order in which the contacts will be dialed
   **/
  public Campaign contactSort(ContactSort contactSort) {
    this.contactSort = contactSort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "information determining the order in which the contacts will be dialed")
  @JsonProperty("contactSort")
  public ContactSort getContactSort() {
    return contactSort;
  }
  public void setContactSort(ContactSort contactSort) {
    this.contactSort = contactSort;
  }


  /**
   * column prioritized information determining the order in which the contacts will be dialed
   **/
  public Campaign contactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "column prioritized information determining the order in which the contacts will be dialed")
  @JsonProperty("contactSorts")
  public List<ContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }


  /**
   * for non-preview campaigns, how long to wait before dispositioning as 'no-answer', default 30 seconds
   **/
  public Campaign noAnswerTimeout(Integer noAnswerTimeout) {
    this.noAnswerTimeout = noAnswerTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "for non-preview campaigns, how long to wait before dispositioning as 'no-answer', default 30 seconds")
  @JsonProperty("noAnswerTimeout")
  public Integer getNoAnswerTimeout() {
    return noAnswerTimeout;
  }
  public void setNoAnswerTimeout(Integer noAnswerTimeout) {
    this.noAnswerTimeout = noAnswerTimeout;
  }


  /**
   * The language the edge will use to analyse the call
   **/
  public Campaign callAnalysisLanguage(String callAnalysisLanguage) {
    this.callAnalysisLanguage = callAnalysisLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language the edge will use to analyse the call")
  @JsonProperty("callAnalysisLanguage")
  public String getCallAnalysisLanguage() {
    return callAnalysisLanguage;
  }
  public void setCallAnalysisLanguage(String callAnalysisLanguage) {
    this.callAnalysisLanguage = callAnalysisLanguage;
  }


  /**
   * The priority of this campaign relative to other campaigns
   **/
  public Campaign priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of this campaign relative to other campaigns")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
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
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.dateCreated, campaign.dateCreated) &&
        Objects.equals(this.dateModified, campaign.dateModified) &&
        Objects.equals(this.version, campaign.version) &&
        Objects.equals(this.contactList, campaign.contactList) &&
        Objects.equals(this.queue, campaign.queue) &&
        Objects.equals(this.dialingMode, campaign.dialingMode) &&
        Objects.equals(this.script, campaign.script) &&
        Objects.equals(this.edgeGroup, campaign.edgeGroup) &&
        Objects.equals(this.campaignStatus, campaign.campaignStatus) &&
        Objects.equals(this.phoneColumns, campaign.phoneColumns) &&
        Objects.equals(this.abandonRate, campaign.abandonRate) &&
        Objects.equals(this.dncLists, campaign.dncLists) &&
        Objects.equals(this.callableTimeSet, campaign.callableTimeSet) &&
        Objects.equals(this.callAnalysisResponseSet, campaign.callAnalysisResponseSet) &&
        Objects.equals(this.errors, campaign.errors) &&
        Objects.equals(this.callerName, campaign.callerName) &&
        Objects.equals(this.callerAddress, campaign.callerAddress) &&
        Objects.equals(this.outboundLineCount, campaign.outboundLineCount) &&
        Objects.equals(this.ruleSets, campaign.ruleSets) &&
        Objects.equals(this.skipPreviewDisabled, campaign.skipPreviewDisabled) &&
        Objects.equals(this.previewTimeOutSeconds, campaign.previewTimeOutSeconds) &&
        Objects.equals(this.contactSort, campaign.contactSort) &&
        Objects.equals(this.contactSorts, campaign.contactSorts) &&
        Objects.equals(this.noAnswerTimeout, campaign.noAnswerTimeout) &&
        Objects.equals(this.callAnalysisLanguage, campaign.callAnalysisLanguage) &&
        Objects.equals(this.priority, campaign.priority) &&
        Objects.equals(this.selfUri, campaign.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, queue, dialingMode, script, edgeGroup, campaignStatus, phoneColumns, abandonRate, dncLists, callableTimeSet, callAnalysisResponseSet, errors, callerName, callerAddress, outboundLineCount, ruleSets, skipPreviewDisabled, previewTimeOutSeconds, contactSort, contactSorts, noAnswerTimeout, callAnalysisLanguage, priority, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
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
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    outboundLineCount: ").append(toIndentedString(outboundLineCount)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
    sb.append("    skipPreviewDisabled: ").append(toIndentedString(skipPreviewDisabled)).append("\n");
    sb.append("    previewTimeOutSeconds: ").append(toIndentedString(previewTimeOutSeconds)).append("\n");
    sb.append("    contactSort: ").append(toIndentedString(contactSort)).append("\n");
    sb.append("    contactSorts: ").append(toIndentedString(contactSorts)).append("\n");
    sb.append("    noAnswerTimeout: ").append(toIndentedString(noAnswerTimeout)).append("\n");
    sb.append("    callAnalysisLanguage: ").append(toIndentedString(callAnalysisLanguage)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

