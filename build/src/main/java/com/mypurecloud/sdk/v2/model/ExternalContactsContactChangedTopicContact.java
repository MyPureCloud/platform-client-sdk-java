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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicContactAddress;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicDataSchema;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicDivision;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicExternalId;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicFacebookId;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicInstagramId;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicLineId;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicPhoneNumber;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicTwitterId;
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicWhatsAppId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalContactsContactChangedTopicContact
 */

public class ExternalContactsContactChangedTopicContact  implements Serializable {
  
  private String id = null;
  private ExternalContactsContactChangedTopicDivision division = null;
  private ExternalContactsContactChangedTopicExternalOrganization externalOrganization = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EPHEMERAL("Ephemeral"),
    IDENTIFIED("Identified"),
    CURATED("Curated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private String salutation = null;
  private String title = null;
  private ExternalContactsContactChangedTopicPhoneNumber workPhone = null;
  private ExternalContactsContactChangedTopicPhoneNumber cellPhone = null;
  private ExternalContactsContactChangedTopicPhoneNumber homePhone = null;
  private ExternalContactsContactChangedTopicPhoneNumber otherPhone = null;
  private String workEmail = null;
  private String personalEmail = null;
  private String otherEmail = null;
  private ExternalContactsContactChangedTopicContactAddress address = null;
  private Boolean surveyOptOut = null;
  private String externalSystemUrl = null;
  private ExternalContactsContactChangedTopicTwitterId twitterId = null;
  private ExternalContactsContactChangedTopicLineId lineId = null;
  private ExternalContactsContactChangedTopicWhatsAppId whatsAppId = null;
  private ExternalContactsContactChangedTopicFacebookId facebookId = null;
  private ExternalContactsContactChangedTopicInstagramId instagramId = null;
  private List<ExternalContactsContactChangedTopicExternalId> externalIds = new ArrayList<ExternalContactsContactChangedTopicExternalId>();
  private ExternalContactsContactChangedTopicDataSchema schema = null;
  private Map<String, Object> customFields = null;
  private Date createDate = null;
  private Date modifyDate = null;

  
  /**
   **/
  public ExternalContactsContactChangedTopicContact id(String id) {
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
  public ExternalContactsContactChangedTopicContact division(ExternalContactsContactChangedTopicDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ExternalContactsContactChangedTopicDivision getDivision() {
    return division;
  }
  public void setDivision(ExternalContactsContactChangedTopicDivision division) {
    this.division = division;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact externalOrganization(ExternalContactsContactChangedTopicExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public ExternalContactsContactChangedTopicExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalContactsContactChangedTopicExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact middleName(String middleName) {
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
   **/
  public ExternalContactsContactChangedTopicContact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact salutation(String salutation) {
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
  public ExternalContactsContactChangedTopicContact title(String title) {
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
  public ExternalContactsContactChangedTopicContact workPhone(ExternalContactsContactChangedTopicPhoneNumber workPhone) {
    this.workPhone = workPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workPhone")
  public ExternalContactsContactChangedTopicPhoneNumber getWorkPhone() {
    return workPhone;
  }
  public void setWorkPhone(ExternalContactsContactChangedTopicPhoneNumber workPhone) {
    this.workPhone = workPhone;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact cellPhone(ExternalContactsContactChangedTopicPhoneNumber cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cellPhone")
  public ExternalContactsContactChangedTopicPhoneNumber getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(ExternalContactsContactChangedTopicPhoneNumber cellPhone) {
    this.cellPhone = cellPhone;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact homePhone(ExternalContactsContactChangedTopicPhoneNumber homePhone) {
    this.homePhone = homePhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("homePhone")
  public ExternalContactsContactChangedTopicPhoneNumber getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(ExternalContactsContactChangedTopicPhoneNumber homePhone) {
    this.homePhone = homePhone;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact otherPhone(ExternalContactsContactChangedTopicPhoneNumber otherPhone) {
    this.otherPhone = otherPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherPhone")
  public ExternalContactsContactChangedTopicPhoneNumber getOtherPhone() {
    return otherPhone;
  }
  public void setOtherPhone(ExternalContactsContactChangedTopicPhoneNumber otherPhone) {
    this.otherPhone = otherPhone;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact workEmail(String workEmail) {
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
  public ExternalContactsContactChangedTopicContact personalEmail(String personalEmail) {
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
  public ExternalContactsContactChangedTopicContact otherEmail(String otherEmail) {
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
  public ExternalContactsContactChangedTopicContact address(ExternalContactsContactChangedTopicContactAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public ExternalContactsContactChangedTopicContactAddress getAddress() {
    return address;
  }
  public void setAddress(ExternalContactsContactChangedTopicContactAddress address) {
    this.address = address;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact surveyOptOut(Boolean surveyOptOut) {
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
   **/
  public ExternalContactsContactChangedTopicContact externalSystemUrl(String externalSystemUrl) {
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
  public ExternalContactsContactChangedTopicContact twitterId(ExternalContactsContactChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("twitterId")
  public ExternalContactsContactChangedTopicTwitterId getTwitterId() {
    return twitterId;
  }
  public void setTwitterId(ExternalContactsContactChangedTopicTwitterId twitterId) {
    this.twitterId = twitterId;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact lineId(ExternalContactsContactChangedTopicLineId lineId) {
    this.lineId = lineId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineId")
  public ExternalContactsContactChangedTopicLineId getLineId() {
    return lineId;
  }
  public void setLineId(ExternalContactsContactChangedTopicLineId lineId) {
    this.lineId = lineId;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact whatsAppId(ExternalContactsContactChangedTopicWhatsAppId whatsAppId) {
    this.whatsAppId = whatsAppId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppId")
  public ExternalContactsContactChangedTopicWhatsAppId getWhatsAppId() {
    return whatsAppId;
  }
  public void setWhatsAppId(ExternalContactsContactChangedTopicWhatsAppId whatsAppId) {
    this.whatsAppId = whatsAppId;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact facebookId(ExternalContactsContactChangedTopicFacebookId facebookId) {
    this.facebookId = facebookId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facebookId")
  public ExternalContactsContactChangedTopicFacebookId getFacebookId() {
    return facebookId;
  }
  public void setFacebookId(ExternalContactsContactChangedTopicFacebookId facebookId) {
    this.facebookId = facebookId;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact instagramId(ExternalContactsContactChangedTopicInstagramId instagramId) {
    this.instagramId = instagramId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("instagramId")
  public ExternalContactsContactChangedTopicInstagramId getInstagramId() {
    return instagramId;
  }
  public void setInstagramId(ExternalContactsContactChangedTopicInstagramId instagramId) {
    this.instagramId = instagramId;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact externalIds(List<ExternalContactsContactChangedTopicExternalId> externalIds) {
    this.externalIds = externalIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalIds")
  public List<ExternalContactsContactChangedTopicExternalId> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(List<ExternalContactsContactChangedTopicExternalId> externalIds) {
    this.externalIds = externalIds;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact schema(ExternalContactsContactChangedTopicDataSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schema")
  public ExternalContactsContactChangedTopicDataSchema getSchema() {
    return schema;
  }
  public void setSchema(ExternalContactsContactChangedTopicDataSchema schema) {
    this.schema = schema;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicContact customFields(Map<String, Object> customFields) {
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
  public ExternalContactsContactChangedTopicContact createDate(Date createDate) {
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
  public ExternalContactsContactChangedTopicContact modifyDate(Date modifyDate) {
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
    ExternalContactsContactChangedTopicContact externalContactsContactChangedTopicContact = (ExternalContactsContactChangedTopicContact) o;

    return Objects.equals(this.id, externalContactsContactChangedTopicContact.id) &&
            Objects.equals(this.division, externalContactsContactChangedTopicContact.division) &&
            Objects.equals(this.externalOrganization, externalContactsContactChangedTopicContact.externalOrganization) &&
            Objects.equals(this.type, externalContactsContactChangedTopicContact.type) &&
            Objects.equals(this.firstName, externalContactsContactChangedTopicContact.firstName) &&
            Objects.equals(this.middleName, externalContactsContactChangedTopicContact.middleName) &&
            Objects.equals(this.lastName, externalContactsContactChangedTopicContact.lastName) &&
            Objects.equals(this.salutation, externalContactsContactChangedTopicContact.salutation) &&
            Objects.equals(this.title, externalContactsContactChangedTopicContact.title) &&
            Objects.equals(this.workPhone, externalContactsContactChangedTopicContact.workPhone) &&
            Objects.equals(this.cellPhone, externalContactsContactChangedTopicContact.cellPhone) &&
            Objects.equals(this.homePhone, externalContactsContactChangedTopicContact.homePhone) &&
            Objects.equals(this.otherPhone, externalContactsContactChangedTopicContact.otherPhone) &&
            Objects.equals(this.workEmail, externalContactsContactChangedTopicContact.workEmail) &&
            Objects.equals(this.personalEmail, externalContactsContactChangedTopicContact.personalEmail) &&
            Objects.equals(this.otherEmail, externalContactsContactChangedTopicContact.otherEmail) &&
            Objects.equals(this.address, externalContactsContactChangedTopicContact.address) &&
            Objects.equals(this.surveyOptOut, externalContactsContactChangedTopicContact.surveyOptOut) &&
            Objects.equals(this.externalSystemUrl, externalContactsContactChangedTopicContact.externalSystemUrl) &&
            Objects.equals(this.twitterId, externalContactsContactChangedTopicContact.twitterId) &&
            Objects.equals(this.lineId, externalContactsContactChangedTopicContact.lineId) &&
            Objects.equals(this.whatsAppId, externalContactsContactChangedTopicContact.whatsAppId) &&
            Objects.equals(this.facebookId, externalContactsContactChangedTopicContact.facebookId) &&
            Objects.equals(this.instagramId, externalContactsContactChangedTopicContact.instagramId) &&
            Objects.equals(this.externalIds, externalContactsContactChangedTopicContact.externalIds) &&
            Objects.equals(this.schema, externalContactsContactChangedTopicContact.schema) &&
            Objects.equals(this.customFields, externalContactsContactChangedTopicContact.customFields) &&
            Objects.equals(this.createDate, externalContactsContactChangedTopicContact.createDate) &&
            Objects.equals(this.modifyDate, externalContactsContactChangedTopicContact.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, externalOrganization, type, firstName, middleName, lastName, salutation, title, workPhone, cellPhone, homePhone, otherPhone, workEmail, personalEmail, otherEmail, address, surveyOptOut, externalSystemUrl, twitterId, lineId, whatsAppId, facebookId, instagramId, externalIds, schema, customFields, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsContactChangedTopicContact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    sb.append("    surveyOptOut: ").append(toIndentedString(surveyOptOut)).append("\n");
    sb.append("    externalSystemUrl: ").append(toIndentedString(externalSystemUrl)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    whatsAppId: ").append(toIndentedString(whatsAppId)).append("\n");
    sb.append("    facebookId: ").append(toIndentedString(facebookId)).append("\n");
    sb.append("    instagramId: ").append(toIndentedString(instagramId)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

