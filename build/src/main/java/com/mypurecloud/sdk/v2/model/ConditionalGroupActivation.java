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
import com.mypurecloud.sdk.v2.model.ConditionalGroupActivationPilotRule;
import com.mypurecloud.sdk.v2.model.ConditionalGroupActivationRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConditionalGroupActivation
 */

public class ConditionalGroupActivation  implements Serializable {
  
  private ConditionalGroupActivationPilotRule pilotRule = null;
  private List<ConditionalGroupActivationRule> rules = null;

  public ConditionalGroupActivation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rules = new ArrayList<ConditionalGroupActivationRule>();
    }
  }

  
  /**
   * The pilot rule for this queue, which executes periodically to determine queue health
   **/
  public ConditionalGroupActivation pilotRule(ConditionalGroupActivationPilotRule pilotRule) {
    this.pilotRule = pilotRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pilot rule for this queue, which executes periodically to determine queue health")
  @JsonProperty("pilotRule")
  public ConditionalGroupActivationPilotRule getPilotRule() {
    return pilotRule;
  }
  public void setPilotRule(ConditionalGroupActivationPilotRule pilotRule) {
    this.pilotRule = pilotRule;
  }


  /**
   * The set of rules to be periodically executed on the queue (if the pilot rule evaluates as true or there is no pilot rule)
   **/
  public ConditionalGroupActivation rules(List<ConditionalGroupActivationRule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of rules to be periodically executed on the queue (if the pilot rule evaluates as true or there is no pilot rule)")
  @JsonProperty("rules")
  public List<ConditionalGroupActivationRule> getRules() {
    return rules;
  }
  public void setRules(List<ConditionalGroupActivationRule> rules) {
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
    ConditionalGroupActivation conditionalGroupActivation = (ConditionalGroupActivation) o;

    return Objects.equals(this.pilotRule, conditionalGroupActivation.pilotRule) &&
            Objects.equals(this.rules, conditionalGroupActivation.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pilotRule, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupActivation {\n");
    
    sb.append("    pilotRule: ").append(toIndentedString(pilotRule)).append("\n");
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

