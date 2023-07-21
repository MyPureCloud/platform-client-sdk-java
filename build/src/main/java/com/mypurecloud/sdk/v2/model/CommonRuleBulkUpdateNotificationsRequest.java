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
import com.mypurecloud.sdk.v2.model.ModifiableRuleProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * CommonRuleBulkUpdateNotificationsRequest
 */

public class CommonRuleBulkUpdateNotificationsRequest  implements Serializable {
  
  private List<String> ruleIds = new ArrayList<String>();
  private ModifiableRuleProperties properties = null;

  
  /**
   * The user supplied rules ids to be updated
   **/
  public CommonRuleBulkUpdateNotificationsRequest ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user supplied rules ids to be updated")
  @JsonProperty("ruleIds")
  public List<String> getRuleIds() {
    return ruleIds;
  }
  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }


  /**
   * The rule properties to be updated
   **/
  public CommonRuleBulkUpdateNotificationsRequest properties(ModifiableRuleProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The rule properties to be updated")
  @JsonProperty("properties")
  public ModifiableRuleProperties getProperties() {
    return properties;
  }
  public void setProperties(ModifiableRuleProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonRuleBulkUpdateNotificationsRequest commonRuleBulkUpdateNotificationsRequest = (CommonRuleBulkUpdateNotificationsRequest) o;

    return Objects.equals(this.ruleIds, commonRuleBulkUpdateNotificationsRequest.ruleIds) &&
            Objects.equals(this.properties, commonRuleBulkUpdateNotificationsRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleIds, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonRuleBulkUpdateNotificationsRequest {\n");
    
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

