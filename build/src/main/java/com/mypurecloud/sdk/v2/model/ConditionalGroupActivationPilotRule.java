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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConditionalGroupActivationPilotRule
 */

public class ConditionalGroupActivationPilotRule  implements Serializable {
  
  private List<ConditionalGroupActivationCondition> conditions = null;
  private String conditionExpression = null;

  public ConditionalGroupActivationPilotRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conditions = new ArrayList<ConditionalGroupActivationCondition>();
    }
  }

  
  /**
   * The list of conditions used in this rule
   **/
  public ConditionalGroupActivationPilotRule conditions(List<ConditionalGroupActivationCondition> conditions) {
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
  public ConditionalGroupActivationPilotRule conditionExpression(String conditionExpression) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalGroupActivationPilotRule conditionalGroupActivationPilotRule = (ConditionalGroupActivationPilotRule) o;

    return Objects.equals(this.conditions, conditionalGroupActivationPilotRule.conditions) &&
            Objects.equals(this.conditionExpression, conditionalGroupActivationPilotRule.conditionExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, conditionExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupActivationPilotRule {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
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

