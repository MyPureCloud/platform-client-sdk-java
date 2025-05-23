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
import com.mypurecloud.sdk.v2.model.CrossPlatformMediaPolicies;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyActions;
import com.mypurecloud.sdk.v2.model.PolicyConditions;
import com.mypurecloud.sdk.v2.model.PolicyErrors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CrossPlatformPolicy
 */

public class CrossPlatformPolicy  implements Serializable {
  
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

  public CrossPlatformPolicy() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public CrossPlatformPolicy name(String name) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CrossPlatformPolicy modifiedDate(Date modifiedDate) {
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
  public CrossPlatformPolicy createdDate(Date createdDate) {
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
  public CrossPlatformPolicy order(Integer order) {
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
  public CrossPlatformPolicy description(String description) {
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
  public CrossPlatformPolicy enabled(Boolean enabled) {
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
  public CrossPlatformPolicy mediaPolicies(CrossPlatformMediaPolicies mediaPolicies) {
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
  public CrossPlatformPolicy conditions(PolicyConditions conditions) {
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
  public CrossPlatformPolicy actions(CrossPlatformPolicyActions actions) {
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
  public CrossPlatformPolicy policyErrors(PolicyErrors policyErrors) {
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
    CrossPlatformPolicy crossPlatformPolicy = (CrossPlatformPolicy) o;

    return Objects.equals(this.id, crossPlatformPolicy.id) &&
            Objects.equals(this.name, crossPlatformPolicy.name) &&
            Objects.equals(this.modifiedDate, crossPlatformPolicy.modifiedDate) &&
            Objects.equals(this.createdDate, crossPlatformPolicy.createdDate) &&
            Objects.equals(this.order, crossPlatformPolicy.order) &&
            Objects.equals(this.description, crossPlatformPolicy.description) &&
            Objects.equals(this.enabled, crossPlatformPolicy.enabled) &&
            Objects.equals(this.mediaPolicies, crossPlatformPolicy.mediaPolicies) &&
            Objects.equals(this.conditions, crossPlatformPolicy.conditions) &&
            Objects.equals(this.actions, crossPlatformPolicy.actions) &&
            Objects.equals(this.policyErrors, crossPlatformPolicy.policyErrors) &&
            Objects.equals(this.selfUri, crossPlatformPolicy.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, modifiedDate, createdDate, order, description, enabled, mediaPolicies, conditions, actions, policyErrors, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossPlatformPolicy {\n");
    
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

