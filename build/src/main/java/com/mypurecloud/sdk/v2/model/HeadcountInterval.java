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
import java.util.Date;

import java.io.Serializable;
/**
 * Headcount interval information for schedule
 */
@ApiModel(description = "Headcount interval information for schedule")

public class HeadcountInterval  implements Serializable {
  
  private Date interval = null;
  private Double value = null;

  
  /**
   * The start date-time for this headcount interval in ISO-8601 format, must be within the 8 day schedule
   **/
  public HeadcountInterval interval(Date interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date-time for this headcount interval in ISO-8601 format, must be within the 8 day schedule")
  @JsonProperty("interval")
  public Date getInterval() {
    return interval;
  }
  public void setInterval(Date interval) {
    this.interval = interval;
  }

  
  /**
   * Headcount value for this interval
   **/
  public HeadcountInterval value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Headcount value for this interval")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
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
    HeadcountInterval headcountInterval = (HeadcountInterval) o;
    return Objects.equals(this.interval, headcountInterval.interval) &&
        Objects.equals(this.value, headcountInterval.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeadcountInterval {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

