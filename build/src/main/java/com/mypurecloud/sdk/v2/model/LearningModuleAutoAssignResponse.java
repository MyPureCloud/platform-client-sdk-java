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
import com.mypurecloud.sdk.v2.model.UsersRulesRuleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Auto assign response
 */
@ApiModel(description = "Auto assign response")

public class LearningModuleAutoAssignResponse  implements Serializable {
  
  private UsersRulesRuleReference rule = null;
  private Boolean enabled = null;

  public LearningModuleAutoAssignResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The rule reference
   **/
  public LearningModuleAutoAssignResponse rule(UsersRulesRuleReference rule) {
    this.rule = rule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The rule reference")
  @JsonProperty("rule")
  public UsersRulesRuleReference getRule() {
    return rule;
  }
  public void setRule(UsersRulesRuleReference rule) {
    this.rule = rule;
  }


  /**
   * Whether the rule is enabled for the module
   **/
  public LearningModuleAutoAssignResponse enabled(Boolean enabled) {
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
    LearningModuleAutoAssignResponse learningModuleAutoAssignResponse = (LearningModuleAutoAssignResponse) o;

    return Objects.equals(this.rule, learningModuleAutoAssignResponse.rule) &&
            Objects.equals(this.enabled, learningModuleAutoAssignResponse.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleAutoAssignResponse {\n");
    
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

