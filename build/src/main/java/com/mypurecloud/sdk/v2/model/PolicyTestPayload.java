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
import com.mypurecloud.sdk.v2.model.TypedAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PolicyTestPayload
 */

public class PolicyTestPayload  implements Serializable {
  
  private Map<String, TypedAttribute> attributeData = null;

  public PolicyTestPayload() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A map of attribute names to attribute type and string representation of value. All attributes returned by api/v2/authorization/policies/{policyId}/attributes are required
   **/
  public PolicyTestPayload attributeData(Map<String, TypedAttribute> attributeData) {
    this.attributeData = attributeData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A map of attribute names to attribute type and string representation of value. All attributes returned by api/v2/authorization/policies/{policyId}/attributes are required")
  @JsonProperty("attributeData")
  public Map<String, TypedAttribute> getAttributeData() {
    return attributeData;
  }
  public void setAttributeData(Map<String, TypedAttribute> attributeData) {
    this.attributeData = attributeData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyTestPayload policyTestPayload = (PolicyTestPayload) o;

    return Objects.equals(this.attributeData, policyTestPayload.attributeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyTestPayload {\n");
    
    sb.append("    attributeData: ").append(toIndentedString(attributeData)).append("\n");
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

