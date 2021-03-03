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
 * TimeInterval
 */

public class TimeInterval  implements Serializable {
  
  private Integer months = null;
  private Integer weeks = null;
  private Integer days = null;
  private Integer hours = null;

  
  /**
   **/
  public TimeInterval months(Integer months) {
    this.months = months;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("months")
  public Integer getMonths() {
    return months;
  }
  public void setMonths(Integer months) {
    this.months = months;
  }

  
  /**
   **/
  public TimeInterval weeks(Integer weeks) {
    this.weeks = weeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weeks")
  public Integer getWeeks() {
    return weeks;
  }
  public void setWeeks(Integer weeks) {
    this.weeks = weeks;
  }

  
  /**
   **/
  public TimeInterval days(Integer days) {
    this.days = days;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  
  /**
   **/
  public TimeInterval hours(Integer hours) {
    this.hours = hours;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hours")
  public Integer getHours() {
    return hours;
  }
  public void setHours(Integer hours) {
    this.hours = hours;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeInterval timeInterval = (TimeInterval) o;
    return Objects.equals(this.months, timeInterval.months) &&
        Objects.equals(this.weeks, timeInterval.weeks) &&
        Objects.equals(this.days, timeInterval.days) &&
        Objects.equals(this.hours, timeInterval.hours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(months, weeks, days, hours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeInterval {\n");
    
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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

