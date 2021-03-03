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
import com.mypurecloud.sdk.v2.model.CrossPlatformMediaPolicies;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyActions;
import com.mypurecloud.sdk.v2.model.PolicyConditions;
import com.mypurecloud.sdk.v2.model.PolicyErrors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CrossPlatformPolicyCreate
 */

public class CrossPlatformPolicyCreate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date modifiedDate = null;
  private Date createdDate = null;
  private Integer order = null;
  private String description = null;
  private Boolean enabled = null;
  private CrossPlatformMediaPolicies mediaPolicies = null;
  private PolicyConditions conditions = null;
  private CrossPlatformPolicyActions actions = null;
  private PolicyErrors policyErrors = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The policy name.
   **/
  public CrossPlatformPolicyCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The policy name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CrossPlatformPolicyCreate modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CrossPlatformPolicyCreate createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  public CrossPlatformPolicyCreate order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   **/
  public CrossPlatformPolicyCreate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public CrossPlatformPolicyCreate enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Conditions and actions per media type
   **/
  public CrossPlatformPolicyCreate mediaPolicies(CrossPlatformMediaPolicies mediaPolicies) {
    this.mediaPolicies = mediaPolicies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions per media type")
  @JsonProperty("mediaPolicies")
  public CrossPlatformMediaPolicies getMediaPolicies() {
    return mediaPolicies;
  }
  public void setMediaPolicies(CrossPlatformMediaPolicies mediaPolicies) {
    this.mediaPolicies = mediaPolicies;
  }

  
  /**
   * Conditions
   **/
  public CrossPlatformPolicyCreate conditions(PolicyConditions conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions")
  @JsonProperty("conditions")
  public PolicyConditions getConditions() {
    return conditions;
  }
  public void setConditions(PolicyConditions conditions) {
    this.conditions = conditions;
  }

  
  /**
   * Actions
   **/
  public CrossPlatformPolicyCreate actions(CrossPlatformPolicyActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actions")
  @JsonProperty("actions")
  public CrossPlatformPolicyActions getActions() {
    return actions;
  }
  public void setActions(CrossPlatformPolicyActions actions) {
    this.actions = actions;
  }

  
  /**
   **/
  public CrossPlatformPolicyCreate policyErrors(PolicyErrors policyErrors) {
    this.policyErrors = policyErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policyErrors")
  public PolicyErrors getPolicyErrors() {
    return policyErrors;
  }
  public void setPolicyErrors(PolicyErrors policyErrors) {
    this.policyErrors = policyErrors;
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
    CrossPlatformPolicyCreate crossPlatformPolicyCreate = (CrossPlatformPolicyCreate) o;
    return Objects.equals(this.id, crossPlatformPolicyCreate.id) &&
        Objects.equals(this.name, crossPlatformPolicyCreate.name) &&
        Objects.equals(this.modifiedDate, crossPlatformPolicyCreate.modifiedDate) &&
        Objects.equals(this.createdDate, crossPlatformPolicyCreate.createdDate) &&
        Objects.equals(this.order, crossPlatformPolicyCreate.order) &&
        Objects.equals(this.description, crossPlatformPolicyCreate.description) &&
        Objects.equals(this.enabled, crossPlatformPolicyCreate.enabled) &&
        Objects.equals(this.mediaPolicies, crossPlatformPolicyCreate.mediaPolicies) &&
        Objects.equals(this.conditions, crossPlatformPolicyCreate.conditions) &&
        Objects.equals(this.actions, crossPlatformPolicyCreate.actions) &&
        Objects.equals(this.policyErrors, crossPlatformPolicyCreate.policyErrors) &&
        Objects.equals(this.selfUri, crossPlatformPolicyCreate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, modifiedDate, createdDate, order, description, enabled, mediaPolicies, conditions, actions, policyErrors, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossPlatformPolicyCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mediaPolicies: ").append(toIndentedString(mediaPolicies)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    policyErrors: ").append(toIndentedString(policyErrors)).append("\n");
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

