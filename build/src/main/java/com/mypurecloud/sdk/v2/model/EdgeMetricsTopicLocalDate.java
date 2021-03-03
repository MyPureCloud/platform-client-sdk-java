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
 * EdgeMetricsTopicLocalDate
 */

public class EdgeMetricsTopicLocalDate  implements Serializable {
  
  private Integer year = null;
  private Integer month = null;
  private Integer day = null;
  private Boolean leapYear = null;

  
  /**
   **/
  public EdgeMetricsTopicLocalDate year(Integer year) {
    this.year = year;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  
  /**
   **/
  public EdgeMetricsTopicLocalDate month(Integer month) {
    this.month = month;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("month")
  public Integer getMonth() {
    return month;
  }
  public void setMonth(Integer month) {
    this.month = month;
  }

  
  /**
   **/
  public EdgeMetricsTopicLocalDate day(Integer day) {
    this.day = day;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("day")
  public Integer getDay() {
    return day;
  }
  public void setDay(Integer day) {
    this.day = day;
  }

  
  /**
   **/
  public EdgeMetricsTopicLocalDate leapYear(Boolean leapYear) {
    this.leapYear = leapYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("leapYear")
  public Boolean getLeapYear() {
    return leapYear;
  }
  public void setLeapYear(Boolean leapYear) {
    this.leapYear = leapYear;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsTopicLocalDate edgeMetricsTopicLocalDate = (EdgeMetricsTopicLocalDate) o;
    return Objects.equals(this.year, edgeMetricsTopicLocalDate.year) &&
        Objects.equals(this.month, edgeMetricsTopicLocalDate.month) &&
        Objects.equals(this.day, edgeMetricsTopicLocalDate.day) &&
        Objects.equals(this.leapYear, edgeMetricsTopicLocalDate.leapYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day, leapYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicLocalDate {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    leapYear: ").append(toIndentedString(leapYear)).append("\n");
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

