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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * ValueWrapperLocalDate
 */

public class ValueWrapperLocalDate  implements Serializable {
  
  private LocalDate value = null;

  
  /**
   * The value for the associated field. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ValueWrapperLocalDate value(LocalDate value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for the associated field. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("value")
  public LocalDate getValue() {
    return value;
  }
  public void setValue(LocalDate value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueWrapperLocalDate valueWrapperLocalDate = (ValueWrapperLocalDate) o;

    return Objects.equals(this.value, valueWrapperLocalDate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueWrapperLocalDate {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

