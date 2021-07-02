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
 * AsgScaleRequest
 */

public class AsgScaleRequest  implements Serializable {
  
  private Integer desiredCapacity = null;
  private Integer minimumCapacity = null;

  
  /**
   * The desired capacity of the ASG
   **/
  public AsgScaleRequest desiredCapacity(Integer desiredCapacity) {
    this.desiredCapacity = desiredCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The desired capacity of the ASG")
  @JsonProperty("desiredCapacity")
  public Integer getDesiredCapacity() {
    return desiredCapacity;
  }
  public void setDesiredCapacity(Integer desiredCapacity) {
    this.desiredCapacity = desiredCapacity;
  }

  
  /**
   * The minimum capacity of the ASG
   **/
  public AsgScaleRequest minimumCapacity(Integer minimumCapacity) {
    this.minimumCapacity = minimumCapacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum capacity of the ASG")
  @JsonProperty("minimumCapacity")
  public Integer getMinimumCapacity() {
    return minimumCapacity;
  }
  public void setMinimumCapacity(Integer minimumCapacity) {
    this.minimumCapacity = minimumCapacity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsgScaleRequest asgScaleRequest = (AsgScaleRequest) o;
    return Objects.equals(this.desiredCapacity, asgScaleRequest.desiredCapacity) &&
        Objects.equals(this.minimumCapacity, asgScaleRequest.minimumCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desiredCapacity, minimumCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsgScaleRequest {\n");
    
    sb.append("    desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
    sb.append("    minimumCapacity: ").append(toIndentedString(minimumCapacity)).append("\n");
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

