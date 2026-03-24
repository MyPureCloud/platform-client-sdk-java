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
import com.mypurecloud.sdk.v2.model.CaseplanDataSchema;
import com.mypurecloud.sdk.v2.model.IntakeSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CaseplanCreate
 */

public class CaseplanCreate  implements Serializable {
  
  private String name = null;
  private Integer defaultDueDurationInSeconds = null;
  private Integer defaultTtlSeconds = null;
  private String referencePrefix = null;
  private String customerIntentId = null;
  private String description = null;
  private String defaultCaseOwnerId = null;
  private String divisionId = null;
  private List<CaseplanDataSchema> dataSchemas = null;
  private List<IntakeSetting> intakeSettings = null;

  public CaseplanCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dataSchemas = new ArrayList<CaseplanDataSchema>();
      intakeSettings = new ArrayList<IntakeSetting>();
    }
  }

  
  /**
   * The name of the Caseplan. Valid length between 3 and 256 characters.
   **/
  public CaseplanCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Caseplan. Valid length between 3 and 256 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The default due duration in seconds for Cases created from the Caseplan. Valid range is between 1 and 31536000 seconds.
   * maximum: 31536000
   **/
  public CaseplanCreate defaultDueDurationInSeconds(Integer defaultDueDurationInSeconds) {
    this.defaultDueDurationInSeconds = defaultDueDurationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default due duration in seconds for Cases created from the Caseplan. Valid range is between 1 and 31536000 seconds.")
  @JsonProperty("defaultDueDurationInSeconds")
  public Integer getDefaultDueDurationInSeconds() {
    return defaultDueDurationInSeconds;
  }
  public void setDefaultDueDurationInSeconds(Integer defaultDueDurationInSeconds) {
    this.defaultDueDurationInSeconds = defaultDueDurationInSeconds;
  }


  /**
   * The default TTL in seconds for Cases created from the Caseplan. Valid range is between 86400 and 31536000 seconds.
   * minimum: 86400
   * maximum: 31536000
   **/
  public CaseplanCreate defaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default TTL in seconds for Cases created from the Caseplan. Valid range is between 86400 and 31536000 seconds.")
  @JsonProperty("defaultTtlSeconds")
  public Integer getDefaultTtlSeconds() {
    return defaultTtlSeconds;
  }
  public void setDefaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
  }


  /**
   * The prefix of the Caseplan reference. Valid length between 2 and 8 alphanumeric characters.
   **/
  public CaseplanCreate referencePrefix(String referencePrefix) {
    this.referencePrefix = referencePrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The prefix of the Caseplan reference. Valid length between 2 and 8 alphanumeric characters.")
  @JsonProperty("referencePrefix")
  public String getReferencePrefix() {
    return referencePrefix;
  }
  public void setReferencePrefix(String referencePrefix) {
    this.referencePrefix = referencePrefix;
  }


  /**
   * The ID of the customer intent associated with this Caseplan.
   **/
  public CaseplanCreate customerIntentId(String customerIntentId) {
    this.customerIntentId = customerIntentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the customer intent associated with this Caseplan.")
  @JsonProperty("customerIntentId")
  public String getCustomerIntentId() {
    return customerIntentId;
  }
  public void setCustomerIntentId(String customerIntentId) {
    this.customerIntentId = customerIntentId;
  }


  /**
   * The description of the Caseplan. Maximum length of 512 characters.
   **/
  public CaseplanCreate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Caseplan. Maximum length of 512 characters.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The ID of the default owner of a Case created from the Caseplan.
   **/
  public CaseplanCreate defaultCaseOwnerId(String defaultCaseOwnerId) {
    this.defaultCaseOwnerId = defaultCaseOwnerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the default owner of a Case created from the Caseplan.")
  @JsonProperty("defaultCaseOwnerId")
  public String getDefaultCaseOwnerId() {
    return defaultCaseOwnerId;
  }
  public void setDefaultCaseOwnerId(String defaultCaseOwnerId) {
    this.defaultCaseOwnerId = defaultCaseOwnerId;
  }


  /**
   * The ID of the division the Caseplan belongs to. Use '*' for divisionless caseplans.
   **/
  public CaseplanCreate divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the division the Caseplan belongs to. Use '*' for divisionless caseplans.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * The schemas that define all data for cases from this Caseplan. The schema must be defined in the TaskManagement namespace.
   **/
  public CaseplanCreate dataSchemas(List<CaseplanDataSchema> dataSchemas) {
    this.dataSchemas = dataSchemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schemas that define all data for cases from this Caseplan. The schema must be defined in the TaskManagement namespace.")
  @JsonProperty("dataSchemas")
  public List<CaseplanDataSchema> getDataSchemas() {
    return dataSchemas;
  }
  public void setDataSchemas(List<CaseplanDataSchema> dataSchemas) {
    this.dataSchemas = dataSchemas;
  }


  /**
   * The intake format when collecting data for a case from this caseplan. There can be a maximum of 10 IntakeSettings defined for a Caseplan.
   **/
  public CaseplanCreate intakeSettings(List<IntakeSetting> intakeSettings) {
    this.intakeSettings = intakeSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intake format when collecting data for a case from this caseplan. There can be a maximum of 10 IntakeSettings defined for a Caseplan.")
  @JsonProperty("intakeSettings")
  public List<IntakeSetting> getIntakeSettings() {
    return intakeSettings;
  }
  public void setIntakeSettings(List<IntakeSetting> intakeSettings) {
    this.intakeSettings = intakeSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseplanCreate caseplanCreate = (CaseplanCreate) o;

    return Objects.equals(this.name, caseplanCreate.name) &&
            Objects.equals(this.defaultDueDurationInSeconds, caseplanCreate.defaultDueDurationInSeconds) &&
            Objects.equals(this.defaultTtlSeconds, caseplanCreate.defaultTtlSeconds) &&
            Objects.equals(this.referencePrefix, caseplanCreate.referencePrefix) &&
            Objects.equals(this.customerIntentId, caseplanCreate.customerIntentId) &&
            Objects.equals(this.description, caseplanCreate.description) &&
            Objects.equals(this.defaultCaseOwnerId, caseplanCreate.defaultCaseOwnerId) &&
            Objects.equals(this.divisionId, caseplanCreate.divisionId) &&
            Objects.equals(this.dataSchemas, caseplanCreate.dataSchemas) &&
            Objects.equals(this.intakeSettings, caseplanCreate.intakeSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultDueDurationInSeconds, defaultTtlSeconds, referencePrefix, customerIntentId, description, defaultCaseOwnerId, divisionId, dataSchemas, intakeSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseplanCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultDueDurationInSeconds: ").append(toIndentedString(defaultDueDurationInSeconds)).append("\n");
    sb.append("    defaultTtlSeconds: ").append(toIndentedString(defaultTtlSeconds)).append("\n");
    sb.append("    referencePrefix: ").append(toIndentedString(referencePrefix)).append("\n");
    sb.append("    customerIntentId: ").append(toIndentedString(customerIntentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultCaseOwnerId: ").append(toIndentedString(defaultCaseOwnerId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    dataSchemas: ").append(toIndentedString(dataSchemas)).append("\n");
    sb.append("    intakeSettings: ").append(toIndentedString(intakeSettings)).append("\n");
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

