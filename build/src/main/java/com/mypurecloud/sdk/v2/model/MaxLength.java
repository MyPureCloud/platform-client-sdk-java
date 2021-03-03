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
 * MaxLength
 */

public class MaxLength  implements Serializable {
  
  private Long min = null;
  private Long max = null;

  
  /**
   * A non-negative integer for a text-based schema field denoting the minimum largest length string the field can contain for a schema instance.
   **/
  public MaxLength min(Long min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A non-negative integer for a text-based schema field denoting the minimum largest length string the field can contain for a schema instance.")
  @JsonProperty("min")
  public Long getMin() {
    return min;
  }
  public void setMin(Long min) {
    this.min = min;
  }

  
  /**
   * A non-negative integer for a text-based schema field denoting the maximum largest string the field can contain for a schema instance.
   **/
  public MaxLength max(Long max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A non-negative integer for a text-based schema field denoting the maximum largest string the field can contain for a schema instance.")
  @JsonProperty("max")
  public Long getMax() {
    return max;
  }
  public void setMax(Long max) {
    this.max = max;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaxLength maxLength = (MaxLength) o;
    return Objects.equals(this.min, maxLength.min) &&
        Objects.equals(this.max, maxLength.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaxLength {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

