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
import com.mypurecloud.sdk.v2.model.DialerCampaignConfigChangeContactSort;
import com.mypurecloud.sdk.v2.model.DialerCampaignConfigChangePhoneColumn;
import com.mypurecloud.sdk.v2.model.DialerCampaignConfigChangeRestErrorDetail;
import com.mypurecloud.sdk.v2.model.DialerCampaignConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCampaignConfigChangeCampaign
 */

public class DialerCampaignConfigChangeCampaign  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DialerCampaignConfigChangeUriReference contactList = null;
  private DialerCampaignConfigChangeUriReference queue = null;

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
   * Gets or Sets dialingMode
   */
 @JsonDeserialize(using = DialingModeEnumDeserializer.class)
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("AGENTLESS"),
    EXTERNAL("EXTERNAL"),
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
  private DialerCampaignConfigChangeUriReference script = null;
  private DialerCampaignConfigChangeUriReference edgeGroup = null;
  private DialerCampaignConfigChangeUriReference site = null;

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
   * Gets or Sets campaignStatus
   */
 @JsonDeserialize(using = CampaignStatusEnumDeserializer.class)
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
  private List<DialerCampaignConfigChangePhoneColumn> phoneColumns = new ArrayList<DialerCampaignConfigChangePhoneColumn>();
  private BigDecimal abandonRate = null;
  private List<DialerCampaignConfigChangeUriReference> dncLists = new ArrayList<DialerCampaignConfigChangeUriReference>();
  private DialerCampaignConfigChangeUriReference callableTimeSet = null;
  private DialerCampaignConfigChangeUriReference callAnalysisResponseSet = null;
  private String callerName = null;
  private String callerAddress = null;
  private Integer outboundLineCount = null;
  private List<DialerCampaignConfigChangeRestErrorDetail> errors = new ArrayList<DialerCampaignConfigChangeRestErrorDetail>();
  private List<DialerCampaignConfigChangeUriReference> ruleSets = new ArrayList<DialerCampaignConfigChangeUriReference>();
  private Boolean skipPreviewDisabled = null;
  private Integer previewTimeOutSeconds = null;
  private Boolean singleNumberPreview = null;
  private DialerCampaignConfigChangeContactSort contactSort = null;
  private List<DialerCampaignConfigChangeContactSort> contactSorts = new ArrayList<DialerCampaignConfigChangeContactSort>();
  private Integer noAnswerTimeout = null;
  private String callAnalysisLanguage = null;
  private Integer priority = null;
  private List<DialerCampaignConfigChangeUriReference> contactListFilters = new ArrayList<DialerCampaignConfigChangeUriReference>();
  private DialerCampaignConfigChangeUriReference division = null;
  private String agentOwnedColumn = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign id(String id) {
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
  public DialerCampaignConfigChangeCampaign name(String name) {
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
  public DialerCampaignConfigChangeCampaign dateCreated(Date dateCreated) {
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
  public DialerCampaignConfigChangeCampaign dateModified(Date dateModified) {
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
  public DialerCampaignConfigChangeCampaign version(Integer version) {
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
  public DialerCampaignConfigChangeCampaign contactList(DialerCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactList")
  public DialerCampaignConfigChangeUriReference getContactList() {
    return contactList;
  }
  public void setContactList(DialerCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign queue(DialerCampaignConfigChangeUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public DialerCampaignConfigChangeUriReference getQueue() {
    return queue;
  }
  public void setQueue(DialerCampaignConfigChangeUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign dialingMode(DialingModeEnum dialingMode) {
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
  public DialerCampaignConfigChangeCampaign script(DialerCampaignConfigChangeUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public DialerCampaignConfigChangeUriReference getScript() {
    return script;
  }
  public void setScript(DialerCampaignConfigChangeUriReference script) {
    this.script = script;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign edgeGroup(DialerCampaignConfigChangeUriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeGroup")
  public DialerCampaignConfigChangeUriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(DialerCampaignConfigChangeUriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign site(DialerCampaignConfigChangeUriReference site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("site")
  public DialerCampaignConfigChangeUriReference getSite() {
    return site;
  }
  public void setSite(DialerCampaignConfigChangeUriReference site) {
    this.site = site;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign campaignStatus(CampaignStatusEnum campaignStatus) {
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
  public DialerCampaignConfigChangeCampaign phoneColumns(List<DialerCampaignConfigChangePhoneColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneColumns")
  public List<DialerCampaignConfigChangePhoneColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<DialerCampaignConfigChangePhoneColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign abandonRate(BigDecimal abandonRate) {
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
  public DialerCampaignConfigChangeCampaign dncLists(List<DialerCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dncLists")
  public List<DialerCampaignConfigChangeUriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<DialerCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign callableTimeSet(DialerCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callableTimeSet")
  public DialerCampaignConfigChangeUriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(DialerCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign callAnalysisResponseSet(DialerCampaignConfigChangeUriReference callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callAnalysisResponseSet")
  public DialerCampaignConfigChangeUriReference getCallAnalysisResponseSet() {
    return callAnalysisResponseSet;
  }
  public void setCallAnalysisResponseSet(DialerCampaignConfigChangeUriReference callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign callerName(String callerName) {
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
  public DialerCampaignConfigChangeCampaign callerAddress(String callerAddress) {
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
  public DialerCampaignConfigChangeCampaign outboundLineCount(Integer outboundLineCount) {
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
  public DialerCampaignConfigChangeCampaign errors(List<DialerCampaignConfigChangeRestErrorDetail> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<DialerCampaignConfigChangeRestErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<DialerCampaignConfigChangeRestErrorDetail> errors) {
    this.errors = errors;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign ruleSets(List<DialerCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleSets")
  public List<DialerCampaignConfigChangeUriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<DialerCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign skipPreviewDisabled(Boolean skipPreviewDisabled) {
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
  public DialerCampaignConfigChangeCampaign previewTimeOutSeconds(Integer previewTimeOutSeconds) {
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
  public DialerCampaignConfigChangeCampaign singleNumberPreview(Boolean singleNumberPreview) {
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
  public DialerCampaignConfigChangeCampaign contactSort(DialerCampaignConfigChangeContactSort contactSort) {
    this.contactSort = contactSort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactSort")
  public DialerCampaignConfigChangeContactSort getContactSort() {
    return contactSort;
  }
  public void setContactSort(DialerCampaignConfigChangeContactSort contactSort) {
    this.contactSort = contactSort;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign contactSorts(List<DialerCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactSorts")
  public List<DialerCampaignConfigChangeContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<DialerCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign noAnswerTimeout(Integer noAnswerTimeout) {
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
  public DialerCampaignConfigChangeCampaign callAnalysisLanguage(String callAnalysisLanguage) {
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
  public DialerCampaignConfigChangeCampaign priority(Integer priority) {
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
  public DialerCampaignConfigChangeCampaign contactListFilters(List<DialerCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactListFilters")
  public List<DialerCampaignConfigChangeUriReference> getContactListFilters() {
    return contactListFilters;
  }
  public void setContactListFilters(List<DialerCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign division(DialerCampaignConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public DialerCampaignConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(DialerCampaignConfigChangeUriReference division) {
    this.division = division;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign agentOwnedColumn(String agentOwnedColumn) {
    this.agentOwnedColumn = agentOwnedColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentOwnedColumn")
  public String getAgentOwnedColumn() {
    return agentOwnedColumn;
  }
  public void setAgentOwnedColumn(String agentOwnedColumn) {
    this.agentOwnedColumn = agentOwnedColumn;
  }

  
  /**
   **/
  public DialerCampaignConfigChangeCampaign additionalProperties(Object additionalProperties) {
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
    DialerCampaignConfigChangeCampaign dialerCampaignConfigChangeCampaign = (DialerCampaignConfigChangeCampaign) o;
    return Objects.equals(this.id, dialerCampaignConfigChangeCampaign.id) &&
        Objects.equals(this.name, dialerCampaignConfigChangeCampaign.name) &&
        Objects.equals(this.dateCreated, dialerCampaignConfigChangeCampaign.dateCreated) &&
        Objects.equals(this.dateModified, dialerCampaignConfigChangeCampaign.dateModified) &&
        Objects.equals(this.version, dialerCampaignConfigChangeCampaign.version) &&
        Objects.equals(this.contactList, dialerCampaignConfigChangeCampaign.contactList) &&
        Objects.equals(this.queue, dialerCampaignConfigChangeCampaign.queue) &&
        Objects.equals(this.dialingMode, dialerCampaignConfigChangeCampaign.dialingMode) &&
        Objects.equals(this.script, dialerCampaignConfigChangeCampaign.script) &&
        Objects.equals(this.edgeGroup, dialerCampaignConfigChangeCampaign.edgeGroup) &&
        Objects.equals(this.site, dialerCampaignConfigChangeCampaign.site) &&
        Objects.equals(this.campaignStatus, dialerCampaignConfigChangeCampaign.campaignStatus) &&
        Objects.equals(this.phoneColumns, dialerCampaignConfigChangeCampaign.phoneColumns) &&
        Objects.equals(this.abandonRate, dialerCampaignConfigChangeCampaign.abandonRate) &&
        Objects.equals(this.dncLists, dialerCampaignConfigChangeCampaign.dncLists) &&
        Objects.equals(this.callableTimeSet, dialerCampaignConfigChangeCampaign.callableTimeSet) &&
        Objects.equals(this.callAnalysisResponseSet, dialerCampaignConfigChangeCampaign.callAnalysisResponseSet) &&
        Objects.equals(this.callerName, dialerCampaignConfigChangeCampaign.callerName) &&
        Objects.equals(this.callerAddress, dialerCampaignConfigChangeCampaign.callerAddress) &&
        Objects.equals(this.outboundLineCount, dialerCampaignConfigChangeCampaign.outboundLineCount) &&
        Objects.equals(this.errors, dialerCampaignConfigChangeCampaign.errors) &&
        Objects.equals(this.ruleSets, dialerCampaignConfigChangeCampaign.ruleSets) &&
        Objects.equals(this.skipPreviewDisabled, dialerCampaignConfigChangeCampaign.skipPreviewDisabled) &&
        Objects.equals(this.previewTimeOutSeconds, dialerCampaignConfigChangeCampaign.previewTimeOutSeconds) &&
        Objects.equals(this.singleNumberPreview, dialerCampaignConfigChangeCampaign.singleNumberPreview) &&
        Objects.equals(this.contactSort, dialerCampaignConfigChangeCampaign.contactSort) &&
        Objects.equals(this.contactSorts, dialerCampaignConfigChangeCampaign.contactSorts) &&
        Objects.equals(this.noAnswerTimeout, dialerCampaignConfigChangeCampaign.noAnswerTimeout) &&
        Objects.equals(this.callAnalysisLanguage, dialerCampaignConfigChangeCampaign.callAnalysisLanguage) &&
        Objects.equals(this.priority, dialerCampaignConfigChangeCampaign.priority) &&
        Objects.equals(this.contactListFilters, dialerCampaignConfigChangeCampaign.contactListFilters) &&
        Objects.equals(this.division, dialerCampaignConfigChangeCampaign.division) &&
        Objects.equals(this.agentOwnedColumn, dialerCampaignConfigChangeCampaign.agentOwnedColumn) &&
        Objects.equals(this.additionalProperties, dialerCampaignConfigChangeCampaign.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, queue, dialingMode, script, edgeGroup, site, campaignStatus, phoneColumns, abandonRate, dncLists, callableTimeSet, callAnalysisResponseSet, callerName, callerAddress, outboundLineCount, errors, ruleSets, skipPreviewDisabled, previewTimeOutSeconds, singleNumberPreview, contactSort, contactSorts, noAnswerTimeout, callAnalysisLanguage, priority, contactListFilters, division, agentOwnedColumn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignConfigChangeCampaign {\n");
    
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
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    outboundLineCount: ").append(toIndentedString(outboundLineCount)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
    sb.append("    skipPreviewDisabled: ").append(toIndentedString(skipPreviewDisabled)).append("\n");
    sb.append("    previewTimeOutSeconds: ").append(toIndentedString(previewTimeOutSeconds)).append("\n");
    sb.append("    singleNumberPreview: ").append(toIndentedString(singleNumberPreview)).append("\n");
    sb.append("    contactSort: ").append(toIndentedString(contactSort)).append("\n");
    sb.append("    contactSorts: ").append(toIndentedString(contactSorts)).append("\n");
    sb.append("    noAnswerTimeout: ").append(toIndentedString(noAnswerTimeout)).append("\n");
    sb.append("    callAnalysisLanguage: ").append(toIndentedString(callAnalysisLanguage)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    contactListFilters: ").append(toIndentedString(contactListFilters)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    agentOwnedColumn: ").append(toIndentedString(agentOwnedColumn)).append("\n");
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

