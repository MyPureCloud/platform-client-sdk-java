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
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicContactAddress;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicDivision;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicPhoneNumber;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicTicker;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicTwitterId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalContactsUnresolvedContactChangedTopicExternalOrganization
 */

public class ExternalContactsUnresolvedContactChangedTopicExternalOrganization  implements Serializable {
  
  private String id = null;
  private ExternalContactsUnresolvedContactChangedTopicDivision division = null;
  private String name = null;
  private String companyType = null;
  private String industry = null;
  private String primaryContactId = null;
  private ExternalContactsUnresolvedContactChangedTopicContactAddress address = null;
  private ExternalContactsUnresolvedContactChangedTopicPhoneNumber phoneNumber = null;
  private ExternalContactsUnresolvedContactChangedTopicPhoneNumber faxNumber = null;
  private Integer employeeCount = null;
  private Integer revenue = null;
  private List<String> tags = new ArrayList<String>();
  private List<String> websites = new ArrayList<String>();
  private List<ExternalContactsUnresolvedContactChangedTopicTicker> tickers = new ArrayList<ExternalContactsUnresolvedContactChangedTopicTicker>();
  private ExternalContactsUnresolvedContactChangedTopicTwitterId twitterId = null;
  private String externalSystemUrl = null;
  private Map<String, Object> customFields = null;
  private Date createDate = null;
  private Date modifyDate = null;

  
  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization id(String id) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization division(ExternalContactsUnresolvedContactChangedTopicDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ExternalContactsUnresolvedContactChangedTopicDivision getDivision() {
    return division;
  }
  public void setDivision(ExternalContactsUnresolvedContactChangedTopicDivision division) {
    this.division = division;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization name(String name) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization companyType(String companyType) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization industry(String industry) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization primaryContactId(String primaryContactId) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization address(ExternalContactsUnresolvedContactChangedTopicContactAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public ExternalContactsUnresolvedContactChangedTopicContactAddress getAddress() {
    return address;
  }
  public void setAddress(ExternalContactsUnresolvedContactChangedTopicContactAddress address) {
    this.address = address;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization phoneNumber(ExternalContactsUnresolvedContactChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumber")
  public ExternalContactsUnresolvedContactChangedTopicPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(ExternalContactsUnresolvedContactChangedTopicPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization faxNumber(ExternalContactsUnresolvedContactChangedTopicPhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxNumber")
  public ExternalContactsUnresolvedContactChangedTopicPhoneNumber getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(ExternalContactsUnresolvedContactChangedTopicPhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization employeeCount(Integer employeeCount) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization revenue(Integer revenue) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization tags(List<String> tags) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization websites(List<String> websites) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization tickers(List<ExternalContactsUnresolvedContactChangedTopicTicker> tickers) {
    this.tickers = tickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tickers")
  public List<ExternalContactsUnresolvedContactChangedTopicTicker> getTickers() {
    return tickers;
  }
  public void setTickers(List<ExternalContactsUnresolvedContactChangedTopicTicker> tickers) {
    this.tickers = tickers;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization twitterId(ExternalContactsUnresolvedContactChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("twitterId")
  public ExternalContactsUnresolvedContactChangedTopicTwitterId getTwitterId() {
    return twitterId;
  }
  public void setTwitterId(ExternalContactsUnresolvedContactChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization externalSystemUrl(String externalSystemUrl) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization customFields(Map<String, Object> customFields) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization createDate(Date createDate) {
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
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization modifyDate(Date modifyDate) {
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
    ExternalContactsUnresolvedContactChangedTopicExternalOrganization externalContactsUnresolvedContactChangedTopicExternalOrganization = (ExternalContactsUnresolvedContactChangedTopicExternalOrganization) o;

    return Objects.equals(this.id, externalContactsUnresolvedContactChangedTopicExternalOrganization.id) &&
            Objects.equals(this.division, externalContactsUnresolvedContactChangedTopicExternalOrganization.division) &&
            Objects.equals(this.name, externalContactsUnresolvedContactChangedTopicExternalOrganization.name) &&
            Objects.equals(this.companyType, externalContactsUnresolvedContactChangedTopicExternalOrganization.companyType) &&
            Objects.equals(this.industry, externalContactsUnresolvedContactChangedTopicExternalOrganization.industry) &&
            Objects.equals(this.primaryContactId, externalContactsUnresolvedContactChangedTopicExternalOrganization.primaryContactId) &&
            Objects.equals(this.address, externalContactsUnresolvedContactChangedTopicExternalOrganization.address) &&
            Objects.equals(this.phoneNumber, externalContactsUnresolvedContactChangedTopicExternalOrganization.phoneNumber) &&
            Objects.equals(this.faxNumber, externalContactsUnresolvedContactChangedTopicExternalOrganization.faxNumber) &&
            Objects.equals(this.employeeCount, externalContactsUnresolvedContactChangedTopicExternalOrganization.employeeCount) &&
            Objects.equals(this.revenue, externalContactsUnresolvedContactChangedTopicExternalOrganization.revenue) &&
            Objects.equals(this.tags, externalContactsUnresolvedContactChangedTopicExternalOrganization.tags) &&
            Objects.equals(this.websites, externalContactsUnresolvedContactChangedTopicExternalOrganization.websites) &&
            Objects.equals(this.tickers, externalContactsUnresolvedContactChangedTopicExternalOrganization.tickers) &&
            Objects.equals(this.twitterId, externalContactsUnresolvedContactChangedTopicExternalOrganization.twitterId) &&
            Objects.equals(this.externalSystemUrl, externalContactsUnresolvedContactChangedTopicExternalOrganization.externalSystemUrl) &&
            Objects.equals(this.customFields, externalContactsUnresolvedContactChangedTopicExternalOrganization.customFields) &&
            Objects.equals(this.createDate, externalContactsUnresolvedContactChangedTopicExternalOrganization.createDate) &&
            Objects.equals(this.modifyDate, externalContactsUnresolvedContactChangedTopicExternalOrganization.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, name, companyType, industry, primaryContactId, address, phoneNumber, faxNumber, employeeCount, revenue, tags, websites, tickers, twitterId, externalSystemUrl, customFields, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsUnresolvedContactChangedTopicExternalOrganization {\n");
    
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

