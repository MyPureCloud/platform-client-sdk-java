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
import com.mypurecloud.sdk.v2.model.ConditionalGroupActivationCondition;
import com.mypurecloud.sdk.v2.model.MemberGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConditionalGroupActivationRule
 */

public class ConditionalGroupActivationRule  implements Serializable {
  
  private List<ConditionalGroupActivationCondition> conditions = null;
  private String conditionExpression = null;
  private List<MemberGroup> groups = null;

  public ConditionalGroupActivationRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conditions = new ArrayList<ConditionalGroupActivationCondition>();
      groups = new ArrayList<MemberGroup>();
    }
  }

  
  /**
   * The list of conditions used in this rule
   **/
  public ConditionalGroupActivationRule conditions(List<ConditionalGroupActivationCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of conditions used in this rule")
  @JsonProperty("conditions")
  public List<ConditionalGroupActivationCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<ConditionalGroupActivationCondition> conditions) {
    this.conditions = conditions;
  }


  /**
   * A string expression that defines the relationships of conditions in this rule
   **/
  public ConditionalGroupActivationRule conditionExpression(String conditionExpression) {
    this.conditionExpression = conditionExpression;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string expression that defines the relationships of conditions in this rule")
  @JsonProperty("conditionExpression")
  public String getConditionExpression() {
    return conditionExpression;
  }
  public void setConditionExpression(String conditionExpression) {
    this.conditionExpression = conditionExpression;
  }


  /**
   * The group(s) that this rule activates (if rule evaluates as true) or deactivates (if rule evaluates as false)
   **/
  public ConditionalGroupActivationRule groups(List<MemberGroup> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The group(s) that this rule activates (if rule evaluates as true) or deactivates (if rule evaluates as false)")
  @JsonProperty("groups")
  public List<MemberGroup> getGroups() {
    return groups;
  }
  public void setGroups(List<MemberGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalGroupActivationRule conditionalGroupActivationRule = (ConditionalGroupActivationRule) o;

    return Objects.equals(this.conditions, conditionalGroupActivationRule.conditions) &&
            Objects.equals(this.conditionExpression, conditionalGroupActivationRule.conditionExpression) &&
            Objects.equals(this.groups, conditionalGroupActivationRule.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, conditionExpression, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupActivationRule {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

