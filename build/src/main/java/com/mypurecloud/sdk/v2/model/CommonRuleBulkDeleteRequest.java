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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CommonRuleBulkDeleteRequest
 */

public class CommonRuleBulkDeleteRequest  implements Serializable {
  
  private List<String> ruleIds = null;

  public CommonRuleBulkDeleteRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      ruleIds = new ArrayList<String>();
    }
  }

  
  /**
   * The user supplied rule ids to be deleted
   **/
  public CommonRuleBulkDeleteRequest ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user supplied rule ids to be deleted")
  @JsonProperty("ruleIds")
  public List<String> getRuleIds() {
    return ruleIds;
  }
  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonRuleBulkDeleteRequest commonRuleBulkDeleteRequest = (CommonRuleBulkDeleteRequest) o;

    return Objects.equals(this.ruleIds, commonRuleBulkDeleteRequest.ruleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonRuleBulkDeleteRequest {\n");
    
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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

