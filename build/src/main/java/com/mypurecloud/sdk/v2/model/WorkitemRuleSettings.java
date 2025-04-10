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
 * WorkitemRuleSettings
 */

public class WorkitemRuleSettings  implements Serializable {
  
  private Boolean flowRulesEnabled = null;

  public WorkitemRuleSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * When set to true, the worktypes flow rules will be processed. Default value is false.
   **/
  public WorkitemRuleSettings flowRulesEnabled(Boolean flowRulesEnabled) {
    this.flowRulesEnabled = flowRulesEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to true, the worktypes flow rules will be processed. Default value is false.")
  @JsonProperty("flowRulesEnabled")
  public Boolean getFlowRulesEnabled() {
    return flowRulesEnabled;
  }
  public void setFlowRulesEnabled(Boolean flowRulesEnabled) {
    this.flowRulesEnabled = flowRulesEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemRuleSettings workitemRuleSettings = (WorkitemRuleSettings) o;

    return Objects.equals(this.flowRulesEnabled, workitemRuleSettings.flowRulesEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowRulesEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemRuleSettings {\n");
    
    sb.append("    flowRulesEnabled: ").append(toIndentedString(flowRulesEnabled)).append("\n");
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

