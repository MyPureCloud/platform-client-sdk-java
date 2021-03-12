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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * WorkdayValuesTrendItem
 */

public class WorkdayValuesTrendItem  implements Serializable {
  
  private LocalDate dateWorkday = null;
  private Double value = null;

  
  @ApiModelProperty(example = "null", value = "The workday for the metric value. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateWorkday")
  public LocalDate getDateWorkday() {
    return dateWorkday;
  }

  
  @ApiModelProperty(example = "null", value = "The metric value")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkdayValuesTrendItem workdayValuesTrendItem = (WorkdayValuesTrendItem) o;
    return Objects.equals(this.dateWorkday, workdayValuesTrendItem.dateWorkday) &&
        Objects.equals(this.value, workdayValuesTrendItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateWorkday, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkdayValuesTrendItem {\n");
    
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
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

