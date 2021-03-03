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
 * Activation
 */

public class Activation  implements Serializable {
  
  private String type = null;
  private Integer delayInSeconds = null;

  
  /**
   * Type of activation.
   **/
  public Activation type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of activation.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Activation delay time amount.
   **/
  public Activation delayInSeconds(Integer delayInSeconds) {
    this.delayInSeconds = delayInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activation delay time amount.")
  @JsonProperty("delayInSeconds")
  public Integer getDelayInSeconds() {
    return delayInSeconds;
  }
  public void setDelayInSeconds(Integer delayInSeconds) {
    this.delayInSeconds = delayInSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activation activation = (Activation) o;
    return Objects.equals(this.type, activation.type) &&
        Objects.equals(this.delayInSeconds, activation.delayInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, delayInSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    delayInSeconds: ").append(toIndentedString(delayInSeconds)).append("\n");
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

