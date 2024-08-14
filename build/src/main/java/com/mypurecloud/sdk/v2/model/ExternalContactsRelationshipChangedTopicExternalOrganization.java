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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicContactAddress;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicDivision;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicPhoneNumber;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicTicker;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicTwitterId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalContactsRelationshipChangedTopicExternalOrganization
 */

public class ExternalContactsRelationshipChangedTopicExternalOrganization  implements Serializable {
  
  private String id = null;
  private ExternalContactsRelationshipChangedTopicDivision division = null;
  private String name = null;
  private String companyType = null;
  private String industry = null;
  private String primaryContactId = null;
  private ExternalContactsRelationshipChangedTopicContactAddress address = null;
  private ExternalContactsRelationshipChangedTopicPhoneNumber phoneNumber = null;
  private ExternalContactsRelationshipChangedTopicPhoneNumber faxNumber = null;
  private Integer employeeCount = null;
  private Integer revenue = null;
  private List<String> tags = new ArrayList<String>();
  private List<String> websites = new ArrayList<String>();
  private List<ExternalContactsRelationshipChangedTopicTicker> tickers = new ArrayList<ExternalContactsRelationshipChangedTopicTicker>();
  private ExternalContactsRelationshipChangedTopicTwitterId twitterId = null;
  private String externalSystemUrl = null;
  private Map<String, Object> customFields = null;
  private Date createDate = null;
  private Date modifyDate = null;

  
  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization id(String id) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization division(ExternalContactsRelationshipChangedTopicDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ExternalContactsRelationshipChangedTopicDivision getDivision() {
    return division;
  }
  public void setDivision(ExternalContactsRelationshipChangedTopicDivision division) {
    this.division = division;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization name(String name) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization companyType(String companyType) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization industry(String industry) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization primaryContactId(String primaryContactId) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization address(ExternalContactsRelationshipChangedTopicContactAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public ExternalContactsRelationshipChangedTopicContactAddress getAddress() {
    return address;
  }
  public void setAddress(ExternalContactsRelationshipChangedTopicContactAddress address) {
    this.address = address;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization phoneNumber(ExternalContactsRelationshipChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumber")
  public ExternalContactsRelationshipChangedTopicPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(ExternalContactsRelationshipChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization faxNumber(ExternalContactsRelationshipChangedTopicPhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxNumber")
  public ExternalContactsRelationshipChangedTopicPhoneNumber getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(ExternalContactsRelationshipChangedTopicPhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization employeeCount(Integer employeeCount) {
    this.employeeCount = employeeCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("employeeCount")
  public Integer getEmployeeCount() {
    return employeeCount;
  }
  public void setEmployeeCount(Integer employeeCount) {
    this.employeeCount = employeeCount;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization revenue(Integer revenue) {
    this.revenue = revenue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revenue")
  public Integer getRevenue() {
    return revenue;
  }
  public void setRevenue(Integer revenue) {
    this.revenue = revenue;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization tags(List<String> tags) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization websites(List<String> websites) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization tickers(List<ExternalContactsRelationshipChangedTopicTicker> tickers) {
    this.tickers = tickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tickers")
  public List<ExternalContactsRelationshipChangedTopicTicker> getTickers() {
    return tickers;
  }
  public void setTickers(List<ExternalContactsRelationshipChangedTopicTicker> tickers) {
    this.tickers = tickers;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization twitterId(ExternalContactsRelationshipChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("twitterId")
  public ExternalContactsRelationshipChangedTopicTwitterId getTwitterId() {
    return twitterId;
  }
  public void setTwitterId(ExternalContactsRelationshipChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicExternalOrganization externalSystemUrl(String externalSystemUrl) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization customFields(Map<String, Object> customFields) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization createDate(Date createDate) {
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
  public ExternalContactsRelationshipChangedTopicExternalOrganization modifyDate(Date modifyDate) {
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
    ExternalContactsRelationshipChangedTopicExternalOrganization externalContactsRelationshipChangedTopicExternalOrganization = (ExternalContactsRelationshipChangedTopicExternalOrganization) o;

    return Objects.equals(this.id, externalContactsRelationshipChangedTopicExternalOrganization.id) &&
            Objects.equals(this.division, externalContactsRelationshipChangedTopicExternalOrganization.division) &&
            Objects.equals(this.name, externalContactsRelationshipChangedTopicExternalOrganization.name) &&
            Objects.equals(this.companyType, externalContactsRelationshipChangedTopicExternalOrganization.companyType) &&
            Objects.equals(this.industry, externalContactsRelationshipChangedTopicExternalOrganization.industry) &&
            Objects.equals(this.primaryContactId, externalContactsRelationshipChangedTopicExternalOrganization.primaryContactId) &&
            Objects.equals(this.address, externalContactsRelationshipChangedTopicExternalOrganization.address) &&
            Objects.equals(this.phoneNumber, externalContactsRelationshipChangedTopicExternalOrganization.phoneNumber) &&
            Objects.equals(this.faxNumber, externalContactsRelationshipChangedTopicExternalOrganization.faxNumber) &&
            Objects.equals(this.employeeCount, externalContactsRelationshipChangedTopicExternalOrganization.employeeCount) &&
            Objects.equals(this.revenue, externalContactsRelationshipChangedTopicExternalOrganization.revenue) &&
            Objects.equals(this.tags, externalContactsRelationshipChangedTopicExternalOrganization.tags) &&
            Objects.equals(this.websites, externalContactsRelationshipChangedTopicExternalOrganization.websites) &&
            Objects.equals(this.tickers, externalContactsRelationshipChangedTopicExternalOrganization.tickers) &&
            Objects.equals(this.twitterId, externalContactsRelationshipChangedTopicExternalOrganization.twitterId) &&
            Objects.equals(this.externalSystemUrl, externalContactsRelationshipChangedTopicExternalOrganization.externalSystemUrl) &&
            Objects.equals(this.customFields, externalContactsRelationshipChangedTopicExternalOrganization.customFields) &&
            Objects.equals(this.createDate, externalContactsRelationshipChangedTopicExternalOrganization.createDate) &&
            Objects.equals(this.modifyDate, externalContactsRelationshipChangedTopicExternalOrganization.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, name, companyType, industry, primaryContactId, address, phoneNumber, faxNumber, employeeCount, revenue, tags, websites, tickers, twitterId, externalSystemUrl, customFields, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsRelationshipChangedTopicExternalOrganization {\n");
    
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

