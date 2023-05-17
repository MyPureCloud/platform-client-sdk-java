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
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicContactAddress;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicDataSchema;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicFacebookId;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicInstagramId;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicLineId;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicPhoneNumber;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicTwitterId;
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicWhatsAppId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalContactsUnresolvedContactChangedTopicContact
 */

public class ExternalContactsUnresolvedContactChangedTopicContact  implements Serializable {
  
  private String id = null;
  private ExternalContactsUnresolvedContactChangedTopicExternalOrganization externalOrganization = null;

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
  private ExternalContactsUnresolvedContactChangedTopicPhoneNumber workPhone = null;
  private ExternalContactsUnresolvedContactChangedTopicPhoneNumber cellPhone = null;
  private ExternalContactsUnresolvedContactChangedTopicPhoneNumber homePhone = null;
  private ExternalContactsUnresolvedContactChangedTopicPhoneNumber otherPhone = null;
  private String workEmail = null;
  private String personalEmail = null;
  private String otherEmail = null;
  private ExternalContactsUnresolvedContactChangedTopicContactAddress address = null;
  private Boolean surveyOptOut = null;
  private String externalSystemUrl = null;
  private ExternalContactsUnresolvedContactChangedTopicTwitterId twitterId = null;
  private ExternalContactsUnresolvedContactChangedTopicLineId lineId = null;
  private ExternalContactsUnresolvedContactChangedTopicWhatsAppId whatsAppId = null;
  private ExternalContactsUnresolvedContactChangedTopicFacebookId facebookId = null;
  private ExternalContactsUnresolvedContactChangedTopicInstagramId instagramId = null;
  private ExternalContactsUnresolvedContactChangedTopicDataSchema schema = null;
  private Map<String, Object> customFields = null;

  
  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact id(String id) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact externalOrganization(ExternalContactsUnresolvedContactChangedTopicExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public ExternalContactsUnresolvedContactChangedTopicExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalContactsUnresolvedContactChangedTopicExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact type(TypeEnum type) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact firstName(String firstName) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact middleName(String middleName) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact lastName(String lastName) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact salutation(String salutation) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact title(String title) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact workPhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber workPhone) {
    this.workPhone = workPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workPhone")
  public ExternalContactsUnresolvedContactChangedTopicPhoneNumber getWorkPhone() {
    return workPhone;
  }
  public void setWorkPhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber workPhone) {
    this.workPhone = workPhone;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact cellPhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cellPhone")
  public ExternalContactsUnresolvedContactChangedTopicPhoneNumber getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber cellPhone) {
    this.cellPhone = cellPhone;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact homePhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber homePhone) {
    this.homePhone = homePhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("homePhone")
  public ExternalContactsUnresolvedContactChangedTopicPhoneNumber getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber homePhone) {
    this.homePhone = homePhone;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact otherPhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber otherPhone) {
    this.otherPhone = otherPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherPhone")
  public ExternalContactsUnresolvedContactChangedTopicPhoneNumber getOtherPhone() {
    return otherPhone;
  }
  public void setOtherPhone(ExternalContactsUnresolvedContactChangedTopicPhoneNumber otherPhone) {
    this.otherPhone = otherPhone;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact workEmail(String workEmail) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact personalEmail(String personalEmail) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact otherEmail(String otherEmail) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact address(ExternalContactsUnresolvedContactChangedTopicContactAddress address) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact surveyOptOut(Boolean surveyOptOut) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact externalSystemUrl(String externalSystemUrl) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact twitterId(ExternalContactsUnresolvedContactChangedTopicTwitterId twitterId) {
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
  public ExternalContactsUnresolvedContactChangedTopicContact lineId(ExternalContactsUnresolvedContactChangedTopicLineId lineId) {
    this.lineId = lineId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineId")
  public ExternalContactsUnresolvedContactChangedTopicLineId getLineId() {
    return lineId;
  }
  public void setLineId(ExternalContactsUnresolvedContactChangedTopicLineId lineId) {
    this.lineId = lineId;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact whatsAppId(ExternalContactsUnresolvedContactChangedTopicWhatsAppId whatsAppId) {
    this.whatsAppId = whatsAppId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppId")
  public ExternalContactsUnresolvedContactChangedTopicWhatsAppId getWhatsAppId() {
    return whatsAppId;
  }
  public void setWhatsAppId(ExternalContactsUnresolvedContactChangedTopicWhatsAppId whatsAppId) {
    this.whatsAppId = whatsAppId;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact facebookId(ExternalContactsUnresolvedContactChangedTopicFacebookId facebookId) {
    this.facebookId = facebookId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facebookId")
  public ExternalContactsUnresolvedContactChangedTopicFacebookId getFacebookId() {
    return facebookId;
  }
  public void setFacebookId(ExternalContactsUnresolvedContactChangedTopicFacebookId facebookId) {
    this.facebookId = facebookId;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact instagramId(ExternalContactsUnresolvedContactChangedTopicInstagramId instagramId) {
    this.instagramId = instagramId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("instagramId")
  public ExternalContactsUnresolvedContactChangedTopicInstagramId getInstagramId() {
    return instagramId;
  }
  public void setInstagramId(ExternalContactsUnresolvedContactChangedTopicInstagramId instagramId) {
    this.instagramId = instagramId;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact schema(ExternalContactsUnresolvedContactChangedTopicDataSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schema")
  public ExternalContactsUnresolvedContactChangedTopicDataSchema getSchema() {
    return schema;
  }
  public void setSchema(ExternalContactsUnresolvedContactChangedTopicDataSchema schema) {
    this.schema = schema;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicContact customFields(Map<String, Object> customFields) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsUnresolvedContactChangedTopicContact externalContactsUnresolvedContactChangedTopicContact = (ExternalContactsUnresolvedContactChangedTopicContact) o;

    return Objects.equals(this.id, externalContactsUnresolvedContactChangedTopicContact.id) &&
            Objects.equals(this.externalOrganization, externalContactsUnresolvedContactChangedTopicContact.externalOrganization) &&
            Objects.equals(this.type, externalContactsUnresolvedContactChangedTopicContact.type) &&
            Objects.equals(this.firstName, externalContactsUnresolvedContactChangedTopicContact.firstName) &&
            Objects.equals(this.middleName, externalContactsUnresolvedContactChangedTopicContact.middleName) &&
            Objects.equals(this.lastName, externalContactsUnresolvedContactChangedTopicContact.lastName) &&
            Objects.equals(this.salutation, externalContactsUnresolvedContactChangedTopicContact.salutation) &&
            Objects.equals(this.title, externalContactsUnresolvedContactChangedTopicContact.title) &&
            Objects.equals(this.workPhone, externalContactsUnresolvedContactChangedTopicContact.workPhone) &&
            Objects.equals(this.cellPhone, externalContactsUnresolvedContactChangedTopicContact.cellPhone) &&
            Objects.equals(this.homePhone, externalContactsUnresolvedContactChangedTopicContact.homePhone) &&
            Objects.equals(this.otherPhone, externalContactsUnresolvedContactChangedTopicContact.otherPhone) &&
            Objects.equals(this.workEmail, externalContactsUnresolvedContactChangedTopicContact.workEmail) &&
            Objects.equals(this.personalEmail, externalContactsUnresolvedContactChangedTopicContact.personalEmail) &&
            Objects.equals(this.otherEmail, externalContactsUnresolvedContactChangedTopicContact.otherEmail) &&
            Objects.equals(this.address, externalContactsUnresolvedContactChangedTopicContact.address) &&
            Objects.equals(this.surveyOptOut, externalContactsUnresolvedContactChangedTopicContact.surveyOptOut) &&
            Objects.equals(this.externalSystemUrl, externalContactsUnresolvedContactChangedTopicContact.externalSystemUrl) &&
            Objects.equals(this.twitterId, externalContactsUnresolvedContactChangedTopicContact.twitterId) &&
            Objects.equals(this.lineId, externalContactsUnresolvedContactChangedTopicContact.lineId) &&
            Objects.equals(this.whatsAppId, externalContactsUnresolvedContactChangedTopicContact.whatsAppId) &&
            Objects.equals(this.facebookId, externalContactsUnresolvedContactChangedTopicContact.facebookId) &&
            Objects.equals(this.instagramId, externalContactsUnresolvedContactChangedTopicContact.instagramId) &&
            Objects.equals(this.schema, externalContactsUnresolvedContactChangedTopicContact.schema) &&
            Objects.equals(this.customFields, externalContactsUnresolvedContactChangedTopicContact.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalOrganization, type, firstName, middleName, lastName, salutation, title, workPhone, cellPhone, homePhone, otherPhone, workEmail, personalEmail, otherEmail, address, surveyOptOut, externalSystemUrl, twitterId, lineId, whatsAppId, facebookId, instagramId, schema, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsUnresolvedContactChangedTopicContact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

