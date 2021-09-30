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
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.FacebookId;
import com.mypurecloud.sdk.v2.model.LineId;
import com.mypurecloud.sdk.v2.model.PhoneNumber;
import com.mypurecloud.sdk.v2.model.TwitterId;
import com.mypurecloud.sdk.v2.model.WhatsAppId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalContact
 */

public class ExternalContact  implements Serializable {
  
  private String id = null;
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private String salutation = null;
  private String title = null;
  private PhoneNumber workPhone = null;
  private PhoneNumber cellPhone = null;
  private PhoneNumber homePhone = null;
  private PhoneNumber otherPhone = null;
  private String workEmail = null;
  private String personalEmail = null;
  private String otherEmail = null;
  private ContactAddress address = null;
  private TwitterId twitterId = null;
  private LineId lineId = null;
  private WhatsAppId whatsAppId = null;
  private FacebookId facebookId = null;
  private Date modifyDate = null;
  private Date createDate = null;
  private ExternalOrganization externalOrganization = null;
  private Boolean surveyOptOut = null;
  private String externalSystemUrl = null;
  private DataSchema schema = null;
  private Map<String, Object> customFields = null;
  private List<ExternalDataSource> externalDataSources = new ArrayList<ExternalDataSource>();
  private String selfUri = null;

  
  /**
   * The globally unique identifier for the object.
   **/
  public ExternalContact id(String id) {
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
   * The first name of the contact.
   **/
  public ExternalContact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The first name of the contact.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  public ExternalContact middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * The last name of the contact.
   **/
  public ExternalContact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last name of the contact.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  public ExternalContact salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("salutation")
  public String getSalutation() {
    return salutation;
  }
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  
  /**
   **/
  public ExternalContact title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public ExternalContact workPhone(PhoneNumber workPhone) {
    this.workPhone = workPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workPhone")
  public PhoneNumber getWorkPhone() {
    return workPhone;
  }
  public void setWorkPhone(PhoneNumber workPhone) {
    this.workPhone = workPhone;
  }

  
  /**
   **/
  public ExternalContact cellPhone(PhoneNumber cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cellPhone")
  public PhoneNumber getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(PhoneNumber cellPhone) {
    this.cellPhone = cellPhone;
  }

  
  /**
   **/
  public ExternalContact homePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("homePhone")
  public PhoneNumber getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
  }

  
  /**
   **/
  public ExternalContact otherPhone(PhoneNumber otherPhone) {
    this.otherPhone = otherPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherPhone")
  public PhoneNumber getOtherPhone() {
    return otherPhone;
  }
  public void setOtherPhone(PhoneNumber otherPhone) {
    this.otherPhone = otherPhone;
  }

  
  /**
   **/
  public ExternalContact workEmail(String workEmail) {
    this.workEmail = workEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workEmail")
  public String getWorkEmail() {
    return workEmail;
  }
  public void setWorkEmail(String workEmail) {
    this.workEmail = workEmail;
  }

  
  /**
   **/
  public ExternalContact personalEmail(String personalEmail) {
    this.personalEmail = personalEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("personalEmail")
  public String getPersonalEmail() {
    return personalEmail;
  }
  public void setPersonalEmail(String personalEmail) {
    this.personalEmail = personalEmail;
  }

  
  /**
   **/
  public ExternalContact otherEmail(String otherEmail) {
    this.otherEmail = otherEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherEmail")
  public String getOtherEmail() {
    return otherEmail;
  }
  public void setOtherEmail(String otherEmail) {
    this.otherEmail = otherEmail;
  }

  
  /**
   **/
  public ExternalContact address(ContactAddress address) {
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
  public ExternalContact twitterId(TwitterId twitterId) {
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
   **/
  public ExternalContact lineId(LineId lineId) {
    this.lineId = lineId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineId")
  public LineId getLineId() {
    return lineId;
  }
  public void setLineId(LineId lineId) {
    this.lineId = lineId;
  }

  
  /**
   **/
  public ExternalContact whatsAppId(WhatsAppId whatsAppId) {
    this.whatsAppId = whatsAppId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppId")
  public WhatsAppId getWhatsAppId() {
    return whatsAppId;
  }
  public void setWhatsAppId(WhatsAppId whatsAppId) {
    this.whatsAppId = whatsAppId;
  }

  
  /**
   **/
  public ExternalContact facebookId(FacebookId facebookId) {
    this.facebookId = facebookId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facebookId")
  public FacebookId getFacebookId() {
    return facebookId;
  }
  public void setFacebookId(FacebookId facebookId) {
    this.facebookId = facebookId;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalContact modifyDate(Date modifyDate) {
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
  public ExternalContact createDate(Date createDate) {
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
  public ExternalContact externalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public ExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  
  /**
   **/
  public ExternalContact surveyOptOut(Boolean surveyOptOut) {
    this.surveyOptOut = surveyOptOut;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("surveyOptOut")
  public Boolean getSurveyOptOut() {
    return surveyOptOut;
  }
  public void setSurveyOptOut(Boolean surveyOptOut) {
    this.surveyOptOut = surveyOptOut;
  }

  
  /**
   * A string that identifies an external system-of-record resource that may have more detailed information on the contact. It should be a valid URL (including the http/https protocol, port, and path [if any]). The value is automatically trimmed of any leading and trailing whitespace.
   **/
  public ExternalContact externalSystemUrl(String externalSystemUrl) {
    this.externalSystemUrl = externalSystemUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string that identifies an external system-of-record resource that may have more detailed information on the contact. It should be a valid URL (including the http/https protocol, port, and path [if any]). The value is automatically trimmed of any leading and trailing whitespace.")
  @JsonProperty("externalSystemUrl")
  public String getExternalSystemUrl() {
    return externalSystemUrl;
  }
  public void setExternalSystemUrl(String externalSystemUrl) {
    this.externalSystemUrl = externalSystemUrl;
  }

  
  /**
   * The schema defining custom fields for this contact
   **/
  public ExternalContact schema(DataSchema schema) {
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
  public ExternalContact customFields(Map<String, Object> customFields) {
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
    ExternalContact externalContact = (ExternalContact) o;
    return Objects.equals(this.id, externalContact.id) &&
        Objects.equals(this.firstName, externalContact.firstName) &&
        Objects.equals(this.middleName, externalContact.middleName) &&
        Objects.equals(this.lastName, externalContact.lastName) &&
        Objects.equals(this.salutation, externalContact.salutation) &&
        Objects.equals(this.title, externalContact.title) &&
        Objects.equals(this.workPhone, externalContact.workPhone) &&
        Objects.equals(this.cellPhone, externalContact.cellPhone) &&
        Objects.equals(this.homePhone, externalContact.homePhone) &&
        Objects.equals(this.otherPhone, externalContact.otherPhone) &&
        Objects.equals(this.workEmail, externalContact.workEmail) &&
        Objects.equals(this.personalEmail, externalContact.personalEmail) &&
        Objects.equals(this.otherEmail, externalContact.otherEmail) &&
        Objects.equals(this.address, externalContact.address) &&
        Objects.equals(this.twitterId, externalContact.twitterId) &&
        Objects.equals(this.lineId, externalContact.lineId) &&
        Objects.equals(this.whatsAppId, externalContact.whatsAppId) &&
        Objects.equals(this.facebookId, externalContact.facebookId) &&
        Objects.equals(this.modifyDate, externalContact.modifyDate) &&
        Objects.equals(this.createDate, externalContact.createDate) &&
        Objects.equals(this.externalOrganization, externalContact.externalOrganization) &&
        Objects.equals(this.surveyOptOut, externalContact.surveyOptOut) &&
        Objects.equals(this.externalSystemUrl, externalContact.externalSystemUrl) &&
        Objects.equals(this.schema, externalContact.schema) &&
        Objects.equals(this.customFields, externalContact.customFields) &&
        Objects.equals(this.externalDataSources, externalContact.externalDataSources) &&
        Objects.equals(this.selfUri, externalContact.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, middleName, lastName, salutation, title, workPhone, cellPhone, homePhone, otherPhone, workEmail, personalEmail, otherEmail, address, twitterId, lineId, whatsAppId, facebookId, modifyDate, createDate, externalOrganization, surveyOptOut, externalSystemUrl, schema, customFields, externalDataSources, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    workPhone: ").append(toIndentedString(workPhone)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    otherPhone: ").append(toIndentedString(otherPhone)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    otherEmail: ").append(toIndentedString(otherEmail)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    whatsAppId: ").append(toIndentedString(whatsAppId)).append("\n");
    sb.append("    facebookId: ").append(toIndentedString(facebookId)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    surveyOptOut: ").append(toIndentedString(surveyOptOut)).append("\n");
    sb.append("    externalSystemUrl: ").append(toIndentedString(externalSystemUrl)).append("\n");
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

