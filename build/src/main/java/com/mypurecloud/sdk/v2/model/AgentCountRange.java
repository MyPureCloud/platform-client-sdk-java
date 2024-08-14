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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentCountRange
 */

public class AgentCountRange  implements Serializable {
  
  private Integer minimum = null;
  private Integer maximum = null;

  
  /**
   * The minimum value of agent count per work plan
   **/
  public AgentCountRange minimum(Integer minimum) {
    this.minimum = minimum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum value of agent count per work plan")
  @JsonProperty("minimum")
  public Integer getMinimum() {
    return minimum;
  }
  public void setMinimum(Integer minimum) {
    this.minimum = minimum;
  }


  /**
   * The maximum value of agent count per work plan
   **/
  public AgentCountRange maximum(Integer maximum) {
    this.maximum = maximum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum value of agent count per work plan")
  @JsonProperty("maximum")
  public Integer getMaximum() {
    return maximum;
  }
  public void setMaximum(Integer maximum) {
    this.maximum = maximum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCountRange agentCountRange = (AgentCountRange) o;

    return Objects.equals(this.minimum, agentCountRange.minimum) &&
            Objects.equals(this.maximum, agentCountRange.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentCountRange {\n");
    
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

