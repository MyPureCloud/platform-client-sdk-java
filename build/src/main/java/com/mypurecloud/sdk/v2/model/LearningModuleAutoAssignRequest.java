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
 * Auto assign request
 */
@ApiModel(description = "Auto assign request")

public class LearningModuleAutoAssignRequest  implements Serializable {
  
  private String ruleId = null;
  private Boolean enabled = null;

  public LearningModuleAutoAssignRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id of the rule
   **/
  public LearningModuleAutoAssignRequest ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the rule")
  @JsonProperty("ruleId")
  public String getRuleId() {
    return ruleId;
  }
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  /**
   * Whether the rule is enabled for the module
   **/
  public LearningModuleAutoAssignRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the rule is enabled for the module")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleAutoAssignRequest learningModuleAutoAssignRequest = (LearningModuleAutoAssignRequest) o;

    return Objects.equals(this.ruleId, learningModuleAutoAssignRequest.ruleId) &&
            Objects.equals(this.enabled, learningModuleAutoAssignRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleAutoAssignRequest {\n");
    
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

