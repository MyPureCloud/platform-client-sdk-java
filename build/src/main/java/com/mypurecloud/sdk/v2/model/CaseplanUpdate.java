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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CaseplanUpdate
 */

public class CaseplanUpdate  implements Serializable {
  
  private String name = null;
  private Integer defaultDueDurationInSeconds = null;
  private Integer defaultTtlSeconds = null;
  private String referencePrefix = null;
  private String customerIntentId = null;
  private String description = null;
  private String defaultCaseOwnerId = null;
  private String divisionId = null;

  public CaseplanUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the Caseplan. Valid length between 3 and 256 characters.
   **/
  public CaseplanUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Caseplan. Valid length between 3 and 256 characters.")
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
  public CaseplanUpdate defaultDueDurationInSeconds(Integer defaultDueDurationInSeconds) {
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
  public CaseplanUpdate defaultTtlSeconds(Integer defaultTtlSeconds) {
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
   * The reference of the Caseplan. Valid length between 2 and 8 alphanumeric characters.
   **/
  public CaseplanUpdate referencePrefix(String referencePrefix) {
    this.referencePrefix = referencePrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference of the Caseplan. Valid length between 2 and 8 alphanumeric characters.")
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
  public CaseplanUpdate customerIntentId(String customerIntentId) {
    this.customerIntentId = customerIntentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the customer intent associated with this Caseplan.")
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
  public CaseplanUpdate description(String description) {
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
   * The ID of the default owner of a Case created from the Caseplan. Must be a valid UUID.
   **/
  public CaseplanUpdate defaultCaseOwnerId(String defaultCaseOwnerId) {
    this.defaultCaseOwnerId = defaultCaseOwnerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the default owner of a Case created from the Caseplan. Must be a valid UUID.")
  @JsonProperty("defaultCaseOwnerId")
  public String getDefaultCaseOwnerId() {
    return defaultCaseOwnerId;
  }
  public void setDefaultCaseOwnerId(String defaultCaseOwnerId) {
    this.defaultCaseOwnerId = defaultCaseOwnerId;
  }


  /**
   * The ID of the division the Caseplan belongs to. If divisionId is null or '*', the Caseplan will be divisionless.
   **/
  public CaseplanUpdate divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the division the Caseplan belongs to. If divisionId is null or '*', the Caseplan will be divisionless.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseplanUpdate caseplanUpdate = (CaseplanUpdate) o;

    return Objects.equals(this.name, caseplanUpdate.name) &&
            Objects.equals(this.defaultDueDurationInSeconds, caseplanUpdate.defaultDueDurationInSeconds) &&
            Objects.equals(this.defaultTtlSeconds, caseplanUpdate.defaultTtlSeconds) &&
            Objects.equals(this.referencePrefix, caseplanUpdate.referencePrefix) &&
            Objects.equals(this.customerIntentId, caseplanUpdate.customerIntentId) &&
            Objects.equals(this.description, caseplanUpdate.description) &&
            Objects.equals(this.defaultCaseOwnerId, caseplanUpdate.defaultCaseOwnerId) &&
            Objects.equals(this.divisionId, caseplanUpdate.divisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultDueDurationInSeconds, defaultTtlSeconds, referencePrefix, customerIntentId, description, defaultCaseOwnerId, divisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseplanUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultDueDurationInSeconds: ").append(toIndentedString(defaultDueDurationInSeconds)).append("\n");
    sb.append("    defaultTtlSeconds: ").append(toIndentedString(defaultTtlSeconds)).append("\n");
    sb.append("    referencePrefix: ").append(toIndentedString(referencePrefix)).append("\n");
    sb.append("    customerIntentId: ").append(toIndentedString(customerIntentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultCaseOwnerId: ").append(toIndentedString(defaultCaseOwnerId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
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

