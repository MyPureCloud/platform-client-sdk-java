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
 * DateRangeWithOptionalEnd
 */

public class DateRangeWithOptionalEnd  implements Serializable {
  
  private LocalDate startBusinessUnitDate = null;
  private LocalDate endBusinessUnitDate = null;

  
  /**
   * The start date for work plan rotation or an agent, interpreted in the business unit's time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public DateRangeWithOptionalEnd startBusinessUnitDate(LocalDate startBusinessUnitDate) {
    this.startBusinessUnitDate = startBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for work plan rotation or an agent, interpreted in the business unit's time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startBusinessUnitDate")
  public LocalDate getStartBusinessUnitDate() {
    return startBusinessUnitDate;
  }
  public void setStartBusinessUnitDate(LocalDate startBusinessUnitDate) {
    this.startBusinessUnitDate = startBusinessUnitDate;
  }

  
  /**
   * The end date for work plan rotation or an agent, interpreted in the business unit's time zone. Null denotes open ended date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public DateRangeWithOptionalEnd endBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date for work plan rotation or an agent, interpreted in the business unit's time zone. Null denotes open ended date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endBusinessUnitDate")
  public LocalDate getEndBusinessUnitDate() {
    return endBusinessUnitDate;
  }
  public void setEndBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateRangeWithOptionalEnd dateRangeWithOptionalEnd = (DateRangeWithOptionalEnd) o;
    return Objects.equals(this.startBusinessUnitDate, dateRangeWithOptionalEnd.startBusinessUnitDate) &&
        Objects.equals(this.endBusinessUnitDate, dateRangeWithOptionalEnd.endBusinessUnitDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startBusinessUnitDate, endBusinessUnitDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateRangeWithOptionalEnd {\n");
    
    sb.append("    startBusinessUnitDate: ").append(toIndentedString(startBusinessUnitDate)).append("\n");
    sb.append("    endBusinessUnitDate: ").append(toIndentedString(endBusinessUnitDate)).append("\n");
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

