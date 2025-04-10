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
import com.mypurecloud.sdk.v2.model.PolicyAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * TargetAttributeValue
 */

public class TargetAttributeValue  implements Serializable {
  
  private String description = null;
  private List<PolicyAttribute> policyAttributes = null;

  public TargetAttributeValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      policyAttributes = new ArrayList<PolicyAttribute>();
    }
  }

  
  /**
   **/
  public TargetAttributeValue description(String description) {
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
  public TargetAttributeValue policyAttributes(List<PolicyAttribute> policyAttributes) {
    this.policyAttributes = policyAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policyAttributes")
  public List<PolicyAttribute> getPolicyAttributes() {
    return policyAttributes;
  }
  public void setPolicyAttributes(List<PolicyAttribute> policyAttributes) {
    this.policyAttributes = policyAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetAttributeValue targetAttributeValue = (TargetAttributeValue) o;

    return Objects.equals(this.description, targetAttributeValue.description) &&
            Objects.equals(this.policyAttributes, targetAttributeValue.policyAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, policyAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetAttributeValue {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyAttributes: ").append(toIndentedString(policyAttributes)).append("\n");
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

