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
import com.mypurecloud.sdk.v2.model.ConditionalGroupRoutingRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConditionalGroupRouting
 */

public class ConditionalGroupRouting  implements Serializable {
  
  private List<ConditionalGroupRoutingRule> rules = new ArrayList<ConditionalGroupRoutingRule>();

  
  /**
   * The set of rules to be executed for each conversation
   **/
  public ConditionalGroupRouting rules(List<ConditionalGroupRoutingRule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of rules to be executed for each conversation")
  @JsonProperty("rules")
  public List<ConditionalGroupRoutingRule> getRules() {
    return rules;
  }
  public void setRules(List<ConditionalGroupRoutingRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalGroupRouting conditionalGroupRouting = (ConditionalGroupRouting) o;

    return Objects.equals(this.rules, conditionalGroupRouting.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupRouting {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

