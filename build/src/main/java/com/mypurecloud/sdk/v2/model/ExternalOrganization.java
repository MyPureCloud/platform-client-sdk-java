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
import com.mypurecloud.sdk.v2.model.ContactAddress;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.ExternalDataSource;
import com.mypurecloud.sdk.v2.model.PhoneNumber;
import com.mypurecloud.sdk.v2.model.Ticker;
import com.mypurecloud.sdk.v2.model.Trustor;
import com.mypurecloud.sdk.v2.model.TwitterId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalOrganization
 */

public class ExternalOrganization  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String companyType = null;
  private String industry = null;
  private String primaryContactId = null;
  private ContactAddress address = null;
  private PhoneNumber phoneNumber = null;
  private PhoneNumber faxNumber = null;
  private Long employeeCount = null;
  private Long revenue = null;
  private List<String> tags = new ArrayList<String>();
  private List<String> websites = new ArrayList<String>();
  private List<Ticker> tickers = new ArrayList<Ticker>();
  private TwitterId twitterId = null;
  private String externalSystemUrl = null;
  private Date modifyDate = null;
  private Date createDate = null;
  private Trustor trustor = null;
  private DataSchema schema = null;
  private Map<String, Object> customFields = null;
  private List<ExternalDataSource> externalDataSources = new ArrayList<ExternalDataSource>();
  private String selfUri = null;

  
  /**
   * The globally unique identifier for the object.
   **/
  public ExternalOrganization id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The name of the company.
   **/
  public ExternalOrganization name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the company.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public ExternalOrganization companyType(String companyType) {
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
  public ExternalOrganization industry(String industry) {
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
  public ExternalOrganization primaryContactId(String primaryContactId) {
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
  public ExternalOrganization address(ContactAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public ContactAddress getAddress() {
    return address;
  }
  public void setAddress(ContactAddress address) {
    this.address = address;
  }

  
  /**
   **/
  public ExternalOrganization phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumber")
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  public ExternalOrganization faxNumber(PhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxNumber")
  public PhoneNumber getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(PhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
  }

  
  /**
   **/
  public ExternalOrganization employeeCount(Long employeeCount) {
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
  public ExternalOrganization revenue(Long revenue) {
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
  public ExternalOrganization tags(List<String> tags) {
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
  public ExternalOrganization websites(List<String> websites) {
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
  public ExternalOrganization tickers(List<Ticker> tickers) {
    this.tickers = tickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tickers")
  public List<Ticker> getTickers() {
    return tickers;
  }
  public void setTickers(List<Ticker> tickers) {
    this.tickers = tickers;
  }

  
  /**
   **/
  public ExternalOrganization twitterId(TwitterId twitterId) {
    this.twitterId = twitterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("twitterId")
  public TwitterId getTwitterId() {
    return twitterId;
  }
  public void setTwitterId(TwitterId twitterId) {
    this.twitterId = twitterId;
  }

  
  /**
   * A string that identifies an external system-of-record resource that may have more detailed information on the organization. It should be a valid URL (including the http/https protocol, port, and path [if any]). The value is automatically trimmed of any leading and trailing whitespace.
   **/
  public ExternalOrganization externalSystemUrl(String externalSystemUrl) {
    this.externalSystemUrl = externalSystemUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string that identifies an external system-of-record resource that may have more detailed information on the organization. It should be a valid URL (including the http/https protocol, port, and path [if any]). The value is automatically trimmed of any leading and trailing whitespace.")
  @JsonProperty("externalSystemUrl")
  public String getExternalSystemUrl() {
    return externalSystemUrl;
  }
  public void setExternalSystemUrl(String externalSystemUrl) {
    this.externalSystemUrl = externalSystemUrl;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalOrganization modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalOrganization createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  public ExternalOrganization trustor(Trustor trustor) {
    this.trustor = trustor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trustor")
  public Trustor getTrustor() {
    return trustor;
  }
  public void setTrustor(Trustor trustor) {
    this.trustor = trustor;
  }

  
  /**
   * The schema defining custom fields for this contact
   **/
  public ExternalOrganization schema(DataSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema defining custom fields for this contact")
  @JsonProperty("schema")
  public DataSchema getSchema() {
    return schema;
  }
  public void setSchema(DataSchema schema) {
    this.schema = schema;
  }

  
  /**
   * Custom fields defined in the schema referenced by schemaId and schemaVersion.
   **/
  public ExternalOrganization customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom fields defined in the schema referenced by schemaId and schemaVersion.")
  @JsonProperty("customFields")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }

  
  @ApiModelProperty(example = "null", value = "Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param.")
  @JsonProperty("externalDataSources")
  public List<ExternalDataSource> getExternalDataSources() {
    return externalDataSources;
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
    ExternalOrganization externalOrganization = (ExternalOrganization) o;
    return Objects.equals(this.id, externalOrganization.id) &&
        Objects.equals(this.name, externalOrganization.name) &&
        Objects.equals(this.companyType, externalOrganization.companyType) &&
        Objects.equals(this.industry, externalOrganization.industry) &&
        Objects.equals(this.primaryContactId, externalOrganization.primaryContactId) &&
        Objects.equals(this.address, externalOrganization.address) &&
        Objects.equals(this.phoneNumber, externalOrganization.phoneNumber) &&
        Objects.equals(this.faxNumber, externalOrganization.faxNumber) &&
        Objects.equals(this.employeeCount, externalOrganization.employeeCount) &&
        Objects.equals(this.revenue, externalOrganization.revenue) &&
        Objects.equals(this.tags, externalOrganization.tags) &&
        Objects.equals(this.websites, externalOrganization.websites) &&
        Objects.equals(this.tickers, externalOrganization.tickers) &&
        Objects.equals(this.twitterId, externalOrganization.twitterId) &&
        Objects.equals(this.externalSystemUrl, externalOrganization.externalSystemUrl) &&
        Objects.equals(this.modifyDate, externalOrganization.modifyDate) &&
        Objects.equals(this.createDate, externalOrganization.createDate) &&
        Objects.equals(this.trustor, externalOrganization.trustor) &&
        Objects.equals(this.schema, externalOrganization.schema) &&
        Objects.equals(this.customFields, externalOrganization.customFields) &&
        Objects.equals(this.externalDataSources, externalOrganization.externalDataSources) &&
        Objects.equals(this.selfUri, externalOrganization.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, companyType, industry, primaryContactId, address, phoneNumber, faxNumber, employeeCount, revenue, tags, websites, tickers, twitterId, externalSystemUrl, modifyDate, createDate, trustor, schema, customFields, externalDataSources, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    trustor: ").append(toIndentedString(trustor)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    externalDataSources: ").append(toIndentedString(externalDataSources)).append("\n");
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

