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
import com.mypurecloud.sdk.v2.model.TargetAttributeValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * TargetAttributes
 */

public class TargetAttributes  implements Serializable {
  
  private List<PolicyAttribute> baseAttributes = null;
  private Map<String, TargetAttributeValue> targetAttributes = null;

  public TargetAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      baseAttributes = new ArrayList<PolicyAttribute>();
    }
  }

  
  /**
   * A set of base attributes which may be used in policies for any target.
   **/
  public TargetAttributes baseAttributes(List<PolicyAttribute> baseAttributes) {
    this.baseAttributes = baseAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of base attributes which may be used in policies for any target.")
  @JsonProperty("baseAttributes")
  public List<PolicyAttribute> getBaseAttributes() {
    return baseAttributes;
  }
  public void setBaseAttributes(List<PolicyAttribute> baseAttributes) {
    this.baseAttributes = baseAttributes;
  }


  /**
   * A map of policy targets to any additional attributes which are valid for that target.
   **/
  public TargetAttributes targetAttributes(Map<String, TargetAttributeValue> targetAttributes) {
    this.targetAttributes = targetAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of policy targets to any additional attributes which are valid for that target.")
  @JsonProperty("targetAttributes")
  public Map<String, TargetAttributeValue> getTargetAttributes() {
    return targetAttributes;
  }
  public void setTargetAttributes(Map<String, TargetAttributeValue> targetAttributes) {
    this.targetAttributes = targetAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetAttributes targetAttributes = (TargetAttributes) o;

    return Objects.equals(this.baseAttributes, targetAttributes.baseAttributes) &&
            Objects.equals(this.targetAttributes, targetAttributes.targetAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseAttributes, targetAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetAttributes {\n");
    
    sb.append("    baseAttributes: ").append(toIndentedString(baseAttributes)).append("\n");
    sb.append("    targetAttributes: ").append(toIndentedString(targetAttributes)).append("\n");
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

