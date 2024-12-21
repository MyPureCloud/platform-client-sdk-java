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
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemDateBasedRuleCreate
 */

public class WorkitemDateBasedRuleCreate  implements Serializable {
  
  private String name = null;
  private WorkitemDateBasedCondition condition = null;

  
  /**
   * The name of the rule.
   **/
  public WorkitemDateBasedRuleCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the rule.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The rules condition. If the condition criteria is met the rules action will be executed.
   **/
  public WorkitemDateBasedRuleCreate condition(WorkitemDateBasedCondition condition) {
    this.condition = condition;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The rules condition. If the condition criteria is met the rules action will be executed.")
  @JsonProperty("condition")
  public WorkitemDateBasedCondition getCondition() {
    return condition;
  }
  public void setCondition(WorkitemDateBasedCondition condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemDateBasedRuleCreate workitemDateBasedRuleCreate = (WorkitemDateBasedRuleCreate) o;

    return Objects.equals(this.name, workitemDateBasedRuleCreate.name) &&
            Objects.equals(this.condition, workitemDateBasedRuleCreate.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, condition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemDateBasedRuleCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

