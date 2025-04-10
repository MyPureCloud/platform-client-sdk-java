package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ExternalContactsOrganizationChangedTopicContactAddress;
import com.mypurecloud.sdk.v2.model.ExternalContactsOrganizationChangedTopicDivision;
import com.mypurecloud.sdk.v2.model.ExternalContactsOrganizationChangedTopicPhoneNumber;
import com.mypurecloud.sdk.v2.model.ExternalContactsOrganizationChangedTopicTicker;
import com.mypurecloud.sdk.v2.model.ExternalContactsOrganizationChangedTopicTwitterId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalContactsOrganizationChangedTopicExternalOrganization
 */

public class ExternalContactsOrganizationChangedTopicExternalOrganization  implements Serializable {
  
  private String id = null;
  private ExternalContactsOrganizationChangedTopicDivision division = null;
  private String name = null;
  private String companyType = null;
  private String industry = null;
  private String primaryContactId = null;
  private ExternalContactsOrganizationChangedTopicContactAddress address = null;
  private ExternalContactsOrganizationChangedTopicPhoneNumber phoneNumber = null;
  private ExternalContactsOrganizationChangedTopicPhoneNumber faxNumber = null;
  private Long employeeCount = null;
  private Long revenue = null;
  private List<String> tags = null;
  private List<String> websites = null;
  private List<ExternalContactsOrganizationChangedTopicTicker> tickers = null;
  private ExternalContactsOrganizationChangedTopicTwitterId twitterId = null;
  private String externalSystemUrl = null;
  private Map<String, Object> customFields = null;
  private Date createDate = null;
  private Date modifyDate = null;

  public ExternalContactsOrganizationChangedTopicExternalOrganization() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      tags = new ArrayList<String>();
      websites = new ArrayList<String>();
      tickers = new ArrayList<ExternalContactsOrganizationChangedTopicTicker>();
    }
  }

  
  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization id(String id) {
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
  public ExternalContactsOrganizationChangedTopicExternalOrganization division(ExternalContactsOrganizationChangedTopicDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ExternalContactsOrganizationChangedTopicDivision getDivision() {
    return division;
  }
  public void setDivision(ExternalContactsOrganizationChangedTopicDivision division) {
    this.division = division;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization name(String name) {
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
  public ExternalContactsOrganizationChangedTopicExternalOrganization companyType(String companyType) {
    this.companyType = companyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("companyType")
  public String getCompanyType() {
    return companyType;
  }
  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization industry(String industry) {
    this.industry = industry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("industry")
  public String getIndustry() {
    return industry;
  }
  public void setIndustry(String industry) {
    this.industry = industry;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization primaryContactId(String primaryContactId) {
    this.primaryContactId = primaryContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primaryContactId")
  public String getPrimaryContactId() {
    return primaryContactId;
  }
  public void setPrimaryContactId(String primaryContactId) {
    this.primaryContactId = primaryContactId;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization address(ExternalContactsOrganizationChangedTopicContactAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public ExternalContactsOrganizationChangedTopicContactAddress getAddress() {
    return address;
  }
  public void setAddress(ExternalContactsOrganizationChangedTopicContactAddress address) {
    this.address = address;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization phoneNumber(ExternalContactsOrganizationChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumber")
  public ExternalContactsOrganizationChangedTopicPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(ExternalContactsOrganizationChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization faxNumber(ExternalContactsOrganizationChangedTopicPhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxNumber")
  public ExternalContactsOrganizationChangedTopicPhoneNumber getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(ExternalContactsOrganizationChangedTopicPhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization employeeCount(Long employeeCount) {
    this.employeeCount = employeeCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("employeeCount")
  public Long getEmployeeCount() {
    return employeeCount;
  }
  public void setEmployeeCount(Long employeeCount) {
    this.employeeCount = employeeCount;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization revenue(Long revenue) {
    this.revenue = revenue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revenue")
  public Long getRevenue() {
    return revenue;
  }
  public void setRevenue(Long revenue) {
    this.revenue = revenue;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization websites(List<String> websites) {
    this.websites = websites;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("websites")
  public List<String> getWebsites() {
    return websites;
  }
  public void setWebsites(List<String> websites) {
    this.websites = websites;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization tickers(List<ExternalContactsOrganizationChangedTopicTicker> tickers) {
    this.tickers = tickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tickers")
  public List<ExternalContactsOrganizationChangedTopicTicker> getTickers() {
    return tickers;
  }
  public void setTickers(List<ExternalContactsOrganizationChangedTopicTicker> tickers) {
    this.tickers = tickers;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization twitterId(ExternalContactsOrganizationChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("twitterId")
  public ExternalContactsOrganizationChangedTopicTwitterId getTwitterId() {
    return twitterId;
  }
  public void setTwitterId(ExternalContactsOrganizationChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization externalSystemUrl(String externalSystemUrl) {
    this.externalSystemUrl = externalSystemUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalSystemUrl")
  public String getExternalSystemUrl() {
    return externalSystemUrl;
  }
  public void setExternalSystemUrl(String externalSystemUrl) {
    this.externalSystemUrl = externalSystemUrl;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  /**
   **/
  public ExternalContactsOrganizationChangedTopicExternalOrganization modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsOrganizationChangedTopicExternalOrganization externalContactsOrganizationChangedTopicExternalOrganization = (ExternalContactsOrganizationChangedTopicExternalOrganization) o;

    return Objects.equals(this.id, externalContactsOrganizationChangedTopicExternalOrganization.id) &&
            Objects.equals(this.division, externalContactsOrganizationChangedTopicExternalOrganization.division) &&
            Objects.equals(this.name, externalContactsOrganizationChangedTopicExternalOrganization.name) &&
            Objects.equals(this.companyType, externalContactsOrganizationChangedTopicExternalOrganization.companyType) &&
            Objects.equals(this.industry, externalContactsOrganizationChangedTopicExternalOrganization.industry) &&
            Objects.equals(this.primaryContactId, externalContactsOrganizationChangedTopicExternalOrganization.primaryContactId) &&
            Objects.equals(this.address, externalContactsOrganizationChangedTopicExternalOrganization.address) &&
            Objects.equals(this.phoneNumber, externalContactsOrganizationChangedTopicExternalOrganization.phoneNumber) &&
            Objects.equals(this.faxNumber, externalContactsOrganizationChangedTopicExternalOrganization.faxNumber) &&
            Objects.equals(this.employeeCount, externalContactsOrganizationChangedTopicExternalOrganization.employeeCount) &&
            Objects.equals(this.revenue, externalContactsOrganizationChangedTopicExternalOrganization.revenue) &&
            Objects.equals(this.tags, externalContactsOrganizationChangedTopicExternalOrganization.tags) &&
            Objects.equals(this.websites, externalContactsOrganizationChangedTopicExternalOrganization.websites) &&
            Objects.equals(this.tickers, externalContactsOrganizationChangedTopicExternalOrganization.tickers) &&
            Objects.equals(this.twitterId, externalContactsOrganizationChangedTopicExternalOrganization.twitterId) &&
            Objects.equals(this.externalSystemUrl, externalContactsOrganizationChangedTopicExternalOrganization.externalSystemUrl) &&
            Objects.equals(this.customFields, externalContactsOrganizationChangedTopicExternalOrganization.customFields) &&
            Objects.equals(this.createDate, externalContactsOrganizationChangedTopicExternalOrganization.createDate) &&
            Objects.equals(this.modifyDate, externalContactsOrganizationChangedTopicExternalOrganization.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, name, companyType, industry, primaryContactId, address, phoneNumber, faxNumber, employeeCount, revenue, tags, websites, tickers, twitterId, externalSystemUrl, customFields, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsOrganizationChangedTopicExternalOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyType: ").append(toIndentedString(companyType)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    primaryContactId: ").append(toIndentedString(primaryContactId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    websites: ").append(toIndentedString(websites)).append("\n");
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    externalSystemUrl: ").append(toIndentedString(externalSystemUrl)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

