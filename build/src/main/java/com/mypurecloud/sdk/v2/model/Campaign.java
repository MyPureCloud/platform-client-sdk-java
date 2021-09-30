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
import com.mypurecloud.sdk.v2.model.ContactSort;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.PhoneColumn;
import com.mypurecloud.sdk.v2.model.RestErrorDetail;
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
  private DomainEntityRef contactList = null;
  private DomainEntityRef queue = null;

  private static class DialingModeEnumDeserializer extends StdDeserializer<DialingModeEnum> {
    public DialingModeEnumDeserializer() {
      super(DialingModeEnumDeserializer.class);
    }

    @Override
    public DialingModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DialingModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The strategy this Campaign will use for dialing.
   */
 @JsonDeserialize(using = DialingModeEnumDeserializer.class)
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("agentless"),
    PREVIEW("preview"),
    POWER("power"),
    PREDICTIVE("predictive"),
    PROGRESSIVE("progressive"),
    EXTERNAL("external");

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
  private DomainEntityRef script = null;
  private DomainEntityRef edgeGroup = null;
  private DomainEntityRef site = null;

  private static class CampaignStatusEnumDeserializer extends StdDeserializer<CampaignStatusEnum> {
    public CampaignStatusEnumDeserializer() {
      super(CampaignStatusEnumDeserializer.class);
    }

    @Override
    public CampaignStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CampaignStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current status of the Campaign. A Campaign may be turned 'on' or 'off'. Required for updates.
   */
 @JsonDeserialize(using = CampaignStatusEnumDeserializer.class)
  public enum CampaignStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("on"),
    STOPPING("stopping"),
    OFF("off"),
    COMPLETE("complete"),
    INVALID("invalid"),
    FORCED_OFF("forced_off"),
    FORCED_STOPPING("forced_stopping");

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
  private List<PhoneColumn> phoneColumns = new ArrayList<PhoneColumn>();
  private Double abandonRate = null;
  private List<DomainEntityRef> dncLists = new ArrayList<DomainEntityRef>();
  private DomainEntityRef callableTimeSet = null;
  private DomainEntityRef callAnalysisResponseSet = null;
  private List<RestErrorDetail> errors = new ArrayList<RestErrorDetail>();
  private String callerName = null;
  private String callerAddress = null;
  private Integer outboundLineCount = null;
  private List<DomainEntityRef> ruleSets = new ArrayList<DomainEntityRef>();
  private Boolean skipPreviewDisabled = null;
  private Long previewTimeOutSeconds = null;
  private Boolean alwaysRunning = null;
  private ContactSort contactSort = null;
  private List<ContactSort> contactSorts = new ArrayList<ContactSort>();
  private Integer noAnswerTimeout = null;
  private String callAnalysisLanguage = null;
  private Integer priority = null;
  private List<DomainEntityRef> contactListFilters = new ArrayList<DomainEntityRef>();
  private DomainEntityRef division = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the Campaign.
   **/
  public Campaign name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Campaign.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
   * The ContactList for this Campaign to dial.
   **/
  public Campaign contactList(DomainEntityRef contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ContactList for this Campaign to dial.")
  @JsonProperty("contactList")
  public DomainEntityRef getContactList() {
    return contactList;
  }
  public void setContactList(DomainEntityRef contactList) {
    this.contactList = contactList;
  }

  
  /**
   * The Queue for this Campaign to route calls to. Required for all dialing modes except agentless.
   **/
  public Campaign queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Queue for this Campaign to route calls to. Required for all dialing modes except agentless.")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }

  
  /**
   * The strategy this Campaign will use for dialing.
   **/
  public Campaign dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The strategy this Campaign will use for dialing.")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }

  
  /**
   * The Script to be displayed to agents that are handling outbound calls. Required for all dialing modes except agentless.
   **/
  public Campaign script(DomainEntityRef script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Script to be displayed to agents that are handling outbound calls. Required for all dialing modes except agentless.")
  @JsonProperty("script")
  public DomainEntityRef getScript() {
    return script;
  }
  public void setScript(DomainEntityRef script) {
    this.script = script;
  }

  
  /**
   * The EdgeGroup that will place the calls. Required for all dialing modes except preview.
   **/
  public Campaign edgeGroup(DomainEntityRef edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The EdgeGroup that will place the calls. Required for all dialing modes except preview.")
  @JsonProperty("edgeGroup")
  public DomainEntityRef getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(DomainEntityRef edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  
  /**
   * The identifier of the site to be used for dialing; can be set in place of an edge group.
   **/
  public Campaign site(DomainEntityRef site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the site to be used for dialing; can be set in place of an edge group.")
  @JsonProperty("site")
  public DomainEntityRef getSite() {
    return site;
  }
  public void setSite(DomainEntityRef site) {
    this.site = site;
  }

  
  /**
   * The current status of the Campaign. A Campaign may be turned 'on' or 'off'. Required for updates.
   **/
  public Campaign campaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current status of the Campaign. A Campaign may be turned 'on' or 'off'. Required for updates.")
  @JsonProperty("campaignStatus")
  public CampaignStatusEnum getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  
  /**
   * The ContactPhoneNumberColumns on the ContactList that this Campaign should dial.
   **/
  public Campaign phoneColumns(List<PhoneColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ContactPhoneNumberColumns on the ContactList that this Campaign should dial.")
  @JsonProperty("phoneColumns")
  public List<PhoneColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<PhoneColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }

  
  /**
   * The targeted abandon rate percentage. Required for progressive, power, and predictive campaigns.
   **/
  public Campaign abandonRate(Double abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The targeted abandon rate percentage. Required for progressive, power, and predictive campaigns.")
  @JsonProperty("abandonRate")
  public Double getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(Double abandonRate) {
    this.abandonRate = abandonRate;
  }

  
  /**
   * DncLists for this Campaign to check before placing a call.
   **/
  public Campaign dncLists(List<DomainEntityRef> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DncLists for this Campaign to check before placing a call.")
  @JsonProperty("dncLists")
  public List<DomainEntityRef> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<DomainEntityRef> dncLists) {
    this.dncLists = dncLists;
  }

  
  /**
   * The callable time set for this campaign to check before placing a call.
   **/
  public Campaign callableTimeSet(DomainEntityRef callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The callable time set for this campaign to check before placing a call.")
  @JsonProperty("callableTimeSet")
  public DomainEntityRef getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(DomainEntityRef callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }

  
  /**
   * The call analysis response set to handle call analysis results from the edge. Required for all dialing modes except preview.
   **/
  public Campaign callAnalysisResponseSet(DomainEntityRef callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The call analysis response set to handle call analysis results from the edge. Required for all dialing modes except preview.")
  @JsonProperty("callAnalysisResponseSet")
  public DomainEntityRef getCallAnalysisResponseSet() {
    return callAnalysisResponseSet;
  }
  public void setCallAnalysisResponseSet(DomainEntityRef callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
  }

  
  @ApiModelProperty(example = "null", value = "A list of current error conditions associated with the campaign.")
  @JsonProperty("errors")
  public List<RestErrorDetail> getErrors() {
    return errors;
  }

  
  /**
   * The caller id name to be displayed on the outbound call.
   **/
  public Campaign callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The caller id name to be displayed on the outbound call.")
  @JsonProperty("callerName")
  public String getCallerName() {
    return callerName;
  }
  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }

  
  /**
   * The caller id phone number to be displayed on the outbound call.
   **/
  public Campaign callerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "(555) 555-5555", required = true, value = "The caller id phone number to be displayed on the outbound call.")
  @JsonProperty("callerAddress")
  public String getCallerAddress() {
    return callerAddress;
  }
  public void setCallerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
  }

  
  /**
   * The number of outbound lines to be concurrently dialed. Only applicable to non-preview campaigns; only required for agentless.
   **/
  public Campaign outboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of outbound lines to be concurrently dialed. Only applicable to non-preview campaigns; only required for agentless.")
  @JsonProperty("outboundLineCount")
  public Integer getOutboundLineCount() {
    return outboundLineCount;
  }
  public void setOutboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
  }

  
  /**
   * Rule sets to be applied while this campaign is dialing.
   **/
  public Campaign ruleSets(List<DomainEntityRef> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rule sets to be applied while this campaign is dialing.")
  @JsonProperty("ruleSets")
  public List<DomainEntityRef> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<DomainEntityRef> ruleSets) {
    this.ruleSets = ruleSets;
  }

  
  /**
   * Whether or not agents can skip previews without placing a call. Only applicable for preview campaigns.
   **/
  public Campaign skipPreviewDisabled(Boolean skipPreviewDisabled) {
    this.skipPreviewDisabled = skipPreviewDisabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not agents can skip previews without placing a call. Only applicable for preview campaigns.")
  @JsonProperty("skipPreviewDisabled")
  public Boolean getSkipPreviewDisabled() {
    return skipPreviewDisabled;
  }
  public void setSkipPreviewDisabled(Boolean skipPreviewDisabled) {
    this.skipPreviewDisabled = skipPreviewDisabled;
  }

  
  /**
   * The number of seconds before a call will be automatically placed on a preview. A value of 0 indicates no automatic placement of calls. Only applicable to preview campaigns.
   **/
  public Campaign previewTimeOutSeconds(Long previewTimeOutSeconds) {
    this.previewTimeOutSeconds = previewTimeOutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds before a call will be automatically placed on a preview. A value of 0 indicates no automatic placement of calls. Only applicable to preview campaigns.")
  @JsonProperty("previewTimeOutSeconds")
  public Long getPreviewTimeOutSeconds() {
    return previewTimeOutSeconds;
  }
  public void setPreviewTimeOutSeconds(Long previewTimeOutSeconds) {
    this.previewTimeOutSeconds = previewTimeOutSeconds;
  }

  
  /**
   * Indicates (when true) that the campaign will remain on after contacts are depleted, allowing additional contacts to be appended/added to the contact list and processed by the still-running campaign. The campaign can still be turned off manually.
   **/
  public Campaign alwaysRunning(Boolean alwaysRunning) {
    this.alwaysRunning = alwaysRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates (when true) that the campaign will remain on after contacts are depleted, allowing additional contacts to be appended/added to the contact list and processed by the still-running campaign. The campaign can still be turned off manually.")
  @JsonProperty("alwaysRunning")
  public Boolean getAlwaysRunning() {
    return alwaysRunning;
  }
  public void setAlwaysRunning(Boolean alwaysRunning) {
    this.alwaysRunning = alwaysRunning;
  }

  
  /**
   * The order in which to sort contacts for dialing, based on a column.
   **/
  public Campaign contactSort(ContactSort contactSort) {
    this.contactSort = contactSort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which to sort contacts for dialing, based on a column.")
  @JsonProperty("contactSort")
  public ContactSort getContactSort() {
    return contactSort;
  }
  public void setContactSort(ContactSort contactSort) {
    this.contactSort = contactSort;
  }

  
  /**
   * The order in which to sort contacts for dialing, based on up to four columns.
   **/
  public Campaign contactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which to sort contacts for dialing, based on up to four columns.")
  @JsonProperty("contactSorts")
  public List<ContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }

  
  /**
   * How long to wait before dispositioning a call as 'no-answer'. Default 30 seconds. Only applicable to non-preview campaigns.
   **/
  public Campaign noAnswerTimeout(Integer noAnswerTimeout) {
    this.noAnswerTimeout = noAnswerTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How long to wait before dispositioning a call as 'no-answer'. Default 30 seconds. Only applicable to non-preview campaigns.")
  @JsonProperty("noAnswerTimeout")
  public Integer getNoAnswerTimeout() {
    return noAnswerTimeout;
  }
  public void setNoAnswerTimeout(Integer noAnswerTimeout) {
    this.noAnswerTimeout = noAnswerTimeout;
  }

  
  /**
   * The language the edge will use to analyze the call.
   **/
  public Campaign callAnalysisLanguage(String callAnalysisLanguage) {
    this.callAnalysisLanguage = callAnalysisLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language the edge will use to analyze the call.")
  @JsonProperty("callAnalysisLanguage")
  public String getCallAnalysisLanguage() {
    return callAnalysisLanguage;
  }
  public void setCallAnalysisLanguage(String callAnalysisLanguage) {
    this.callAnalysisLanguage = callAnalysisLanguage;
  }

  
  /**
   * The priority of this campaign relative to other campaigns that are running on the same queue. 5 is the highest priority, 1 the lowest.
   **/
  public Campaign priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of this campaign relative to other campaigns that are running on the same queue. 5 is the highest priority, 1 the lowest.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * Filter to apply to the contact list before dialing. Currently a campaign can only have one filter applied.
   **/
  public Campaign contactListFilters(List<DomainEntityRef> contactListFilters) {
    this.contactListFilters = contactListFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter to apply to the contact list before dialing. Currently a campaign can only have one filter applied.")
  @JsonProperty("contactListFilters")
  public List<DomainEntityRef> getContactListFilters() {
    return contactListFilters;
  }
  public void setContactListFilters(List<DomainEntityRef> contactListFilters) {
    this.contactListFilters = contactListFilters;
  }

  
  /**
   * The division this campaign belongs to.
   **/
  public Campaign division(DomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division this campaign belongs to.")
  @JsonProperty("division")
  public DomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(DomainEntityRef division) {
    this.division = division;
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
        Objects.equals(this.site, campaign.site) &&
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
        Objects.equals(this.alwaysRunning, campaign.alwaysRunning) &&
        Objects.equals(this.contactSort, campaign.contactSort) &&
        Objects.equals(this.contactSorts, campaign.contactSorts) &&
        Objects.equals(this.noAnswerTimeout, campaign.noAnswerTimeout) &&
        Objects.equals(this.callAnalysisLanguage, campaign.callAnalysisLanguage) &&
        Objects.equals(this.priority, campaign.priority) &&
        Objects.equals(this.contactListFilters, campaign.contactListFilters) &&
        Objects.equals(this.division, campaign.division) &&
        Objects.equals(this.selfUri, campaign.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, queue, dialingMode, script, edgeGroup, site, campaignStatus, phoneColumns, abandonRate, dncLists, callableTimeSet, callAnalysisResponseSet, errors, callerName, callerAddress, outboundLineCount, ruleSets, skipPreviewDisabled, previewTimeOutSeconds, alwaysRunning, contactSort, contactSorts, noAnswerTimeout, callAnalysisLanguage, priority, contactListFilters, division, selfUri);
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
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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
    sb.append("    alwaysRunning: ").append(toIndentedString(alwaysRunning)).append("\n");
    sb.append("    contactSort: ").append(toIndentedString(contactSort)).append("\n");
    sb.append("    contactSorts: ").append(toIndentedString(contactSorts)).append("\n");
    sb.append("    noAnswerTimeout: ").append(toIndentedString(noAnswerTimeout)).append("\n");
    sb.append("    callAnalysisLanguage: ").append(toIndentedString(callAnalysisLanguage)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    contactListFilters: ").append(toIndentedString(contactListFilters)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
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

