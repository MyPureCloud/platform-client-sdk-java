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
import com.mypurecloud.sdk.v2.model.Fallback;
import com.mypurecloud.sdk.v2.model.RuleConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RuleEngineConfig
 */

public class RuleEngineConfig  implements Serializable {
  
  private List<RuleConfig> rules = new ArrayList<RuleConfig>();
  private Fallback fallback = null;

  
  /**
   * List of rules to evaluate by the engine.
   **/
  public RuleEngineConfig rules(List<RuleConfig> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of rules to evaluate by the engine.")
  @JsonProperty("rules")
  public List<RuleConfig> getRules() {
    return rules;
  }
  public void setRules(List<RuleConfig> rules) {
    this.rules = rules;
  }


  /**
   * Fallback configuration.
   **/
  public RuleEngineConfig fallback(Fallback fallback) {
    this.fallback = fallback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fallback configuration.")
  @JsonProperty("fallback")
  public Fallback getFallback() {
    return fallback;
  }
  public void setFallback(Fallback fallback) {
    this.fallback = fallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleEngineConfig ruleEngineConfig = (RuleEngineConfig) o;

    return Objects.equals(this.rules, ruleEngineConfig.rules) &&
            Objects.equals(this.fallback, ruleEngineConfig.fallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, fallback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleEngineConfig {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
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

