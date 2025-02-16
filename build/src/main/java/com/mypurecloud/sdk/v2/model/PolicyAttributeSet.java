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
import com.mypurecloud.sdk.v2.model.PolicyAttribute;
import com.mypurecloud.sdk.v2.model.TypedAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PolicyAttributeSet
 */

public class PolicyAttributeSet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<PolicyAttribute> policyAttributes = new ArrayList<PolicyAttribute>();
  private Map<String, TypedAttribute> presetAttributes = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public PolicyAttributeSet name(String name) {
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
   * A set of the attributes checked by the requested policy.
   **/
  public PolicyAttributeSet policyAttributes(List<PolicyAttribute> policyAttributes) {
    this.policyAttributes = policyAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of the attributes checked by the requested policy.")
  @JsonProperty("policyAttributes")
  public List<PolicyAttribute> getPolicyAttributes() {
    return policyAttributes;
  }
  public void setPolicyAttributes(List<PolicyAttribute> policyAttributes) {
    this.policyAttributes = policyAttributes;
  }


  /**
   * Map of names and values of preset attributes used in this policy.
   **/
  public PolicyAttributeSet presetAttributes(Map<String, TypedAttribute> presetAttributes) {
    this.presetAttributes = presetAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of names and values of preset attributes used in this policy.")
  @JsonProperty("presetAttributes")
  public Map<String, TypedAttribute> getPresetAttributes() {
    return presetAttributes;
  }
  public void setPresetAttributes(Map<String, TypedAttribute> presetAttributes) {
    this.presetAttributes = presetAttributes;
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
    PolicyAttributeSet policyAttributeSet = (PolicyAttributeSet) o;

    return Objects.equals(this.id, policyAttributeSet.id) &&
            Objects.equals(this.name, policyAttributeSet.name) &&
            Objects.equals(this.policyAttributes, policyAttributeSet.policyAttributes) &&
            Objects.equals(this.presetAttributes, policyAttributeSet.presetAttributes) &&
            Objects.equals(this.selfUri, policyAttributeSet.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, policyAttributes, presetAttributes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyAttributeSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyAttributes: ").append(toIndentedString(policyAttributes)).append("\n");
    sb.append("    presetAttributes: ").append(toIndentedString(presetAttributes)).append("\n");
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

