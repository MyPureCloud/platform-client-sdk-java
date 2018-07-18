package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Headcount interval information for schedule
 */
@ApiModel(description = "Headcount interval information for schedule")

public class HeadcountIntervalResponse  implements Serializable {
  
  private Date interval = null;
  private Double value = null;

  
  /**
   * The start date-time for this headcount interval in ISO-8601 format.
   **/
  public HeadcountIntervalResponse interval(Date interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date-time for this headcount interval in ISO-8601 format.")
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
  public HeadcountIntervalResponse value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headcount value for this interval")
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
    HeadcountIntervalResponse headcountIntervalResponse = (HeadcountIntervalResponse) o;
    return Objects.equals(this.interval, headcountIntervalResponse.interval) &&
        Objects.equals(this.value, headcountIntervalResponse.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeadcountIntervalResponse {\n");
    
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

