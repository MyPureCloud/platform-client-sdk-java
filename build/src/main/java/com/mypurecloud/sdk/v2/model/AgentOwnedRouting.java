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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentOwnedRouting
 */

public class AgentOwnedRouting  implements Serializable {
  
  private Boolean enableAgentOwnedCallbacks = null;
  private Integer maxOwnedCallbackHours = null;
  private Integer maxOwnedCallbackDelayHours = null;

  
  /**
   * Indicates if Agent Owned Callbacks are enabled for the queue
   **/
  public AgentOwnedRouting enableAgentOwnedCallbacks(Boolean enableAgentOwnedCallbacks) {
    this.enableAgentOwnedCallbacks = enableAgentOwnedCallbacks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if Agent Owned Callbacks are enabled for the queue")
  @JsonProperty("enableAgentOwnedCallbacks")
  public Boolean getEnableAgentOwnedCallbacks() {
    return enableAgentOwnedCallbacks;
  }
  public void setEnableAgentOwnedCallbacks(Boolean enableAgentOwnedCallbacks) {
    this.enableAgentOwnedCallbacks = enableAgentOwnedCallbacks;
  }

  
  /**
   * The max amount of time a callback can be owned (in hours); Allowable range 1 - 168 hour(s) (inclusive)
   **/
  public AgentOwnedRouting maxOwnedCallbackHours(Integer maxOwnedCallbackHours) {
    this.maxOwnedCallbackHours = maxOwnedCallbackHours;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The max amount of time a callback can be owned (in hours); Allowable range 1 - 168 hour(s) (inclusive)")
  @JsonProperty("maxOwnedCallbackHours")
  public Integer getMaxOwnedCallbackHours() {
    return maxOwnedCallbackHours;
  }
  public void setMaxOwnedCallbackHours(Integer maxOwnedCallbackHours) {
    this.maxOwnedCallbackHours = maxOwnedCallbackHours;
  }

  
  /**
   * The max amount of time a callback can be scheduled out into the future (in hours); Allowable range 1 - 720 hour(s) (inclusive)
   **/
  public AgentOwnedRouting maxOwnedCallbackDelayHours(Integer maxOwnedCallbackDelayHours) {
    this.maxOwnedCallbackDelayHours = maxOwnedCallbackDelayHours;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The max amount of time a callback can be scheduled out into the future (in hours); Allowable range 1 - 720 hour(s) (inclusive)")
  @JsonProperty("maxOwnedCallbackDelayHours")
  public Integer getMaxOwnedCallbackDelayHours() {
    return maxOwnedCallbackDelayHours;
  }
  public void setMaxOwnedCallbackDelayHours(Integer maxOwnedCallbackDelayHours) {
    this.maxOwnedCallbackDelayHours = maxOwnedCallbackDelayHours;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentOwnedRouting agentOwnedRouting = (AgentOwnedRouting) o;
    return Objects.equals(this.enableAgentOwnedCallbacks, agentOwnedRouting.enableAgentOwnedCallbacks) &&
        Objects.equals(this.maxOwnedCallbackHours, agentOwnedRouting.maxOwnedCallbackHours) &&
        Objects.equals(this.maxOwnedCallbackDelayHours, agentOwnedRouting.maxOwnedCallbackDelayHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAgentOwnedCallbacks, maxOwnedCallbackHours, maxOwnedCallbackDelayHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentOwnedRouting {\n");
    
    sb.append("    enableAgentOwnedCallbacks: ").append(toIndentedString(enableAgentOwnedCallbacks)).append("\n");
    sb.append("    maxOwnedCallbackHours: ").append(toIndentedString(maxOwnedCallbackHours)).append("\n");
    sb.append("    maxOwnedCallbackDelayHours: ").append(toIndentedString(maxOwnedCallbackDelayHours)).append("\n");
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

