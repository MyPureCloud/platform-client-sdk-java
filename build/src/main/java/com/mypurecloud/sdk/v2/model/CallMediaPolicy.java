package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CallMediaPolicyConditions;
import com.mypurecloud.sdk.v2.model.PolicyActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CallMediaPolicy
 */

public class CallMediaPolicy  implements Serializable {
  
  private PolicyActions actions = null;
  private CallMediaPolicyConditions conditions = null;

  
  /**
   * Actions applied when specified conditions are met
   **/
  public CallMediaPolicy actions(PolicyActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actions applied when specified conditions are met")
  @JsonProperty("actions")
  public PolicyActions getActions() {
    return actions;
  }
  public void setActions(PolicyActions actions) {
    this.actions = actions;
  }

  
  /**
   * Conditions for when actions should be applied
   **/
  public CallMediaPolicy conditions(CallMediaPolicyConditions conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions for when actions should be applied")
  @JsonProperty("conditions")
  public CallMediaPolicyConditions getConditions() {
    return conditions;
  }
  public void setConditions(CallMediaPolicyConditions conditions) {
    this.conditions = conditions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallMediaPolicy callMediaPolicy = (CallMediaPolicy) o;
    return Objects.equals(this.actions, callMediaPolicy.actions) &&
        Objects.equals(this.conditions, callMediaPolicy.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallMediaPolicy {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

