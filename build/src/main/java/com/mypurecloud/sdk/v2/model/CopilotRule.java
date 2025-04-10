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
import com.mypurecloud.sdk.v2.model.CopilotAction;
import com.mypurecloud.sdk.v2.model.CopilotCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CopilotRule
 */

public class CopilotRule  implements Serializable {
  
  private List<CopilotCondition> conditions = null;
  private List<CopilotAction> actions = null;

  public CopilotRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conditions = new ArrayList<CopilotCondition>();
      actions = new ArrayList<CopilotAction>();
    }
  }

  
  /**
   * List of conditions to execute actions, must have at least 1 element and maximum 100 elements. Operator in case of multiple conditions: 'OR'.
   **/
  public CopilotRule conditions(List<CopilotCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of conditions to execute actions, must have at least 1 element and maximum 100 elements. Operator in case of multiple conditions: 'OR'.")
  @JsonProperty("conditions")
  public List<CopilotCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<CopilotCondition> conditions) {
    this.conditions = conditions;
  }


  /**
   * List of actions to execute, must have at least 1 element and maximum 100 elements.
   **/
  public CopilotRule actions(List<CopilotAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of actions to execute, must have at least 1 element and maximum 100 elements.")
  @JsonProperty("actions")
  public List<CopilotAction> getActions() {
    return actions;
  }
  public void setActions(List<CopilotAction> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopilotRule copilotRule = (CopilotRule) o;

    return Objects.equals(this.conditions, copilotRule.conditions) &&
            Objects.equals(this.actions, copilotRule.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopilotRule {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

