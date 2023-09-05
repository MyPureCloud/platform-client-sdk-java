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
 * TrendData
 */

public class TrendData  implements Serializable {
  
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;
  private Double percentOfGoal = null;
  private Double averageValue = null;

  
  /**
   * Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public TrendData dateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }
  public void setDateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
  }


  /**
   * End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public TrendData dateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }
  public void setDateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
  }


  /**
   * Percent of goal
   **/
  public TrendData percentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent of goal")
  @JsonProperty("percentOfGoal")
  public Double getPercentOfGoal() {
    return percentOfGoal;
  }
  public void setPercentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
  }


  /**
   * Average metric value
   **/
  public TrendData averageValue(Double averageValue) {
    this.averageValue = averageValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average metric value")
  @JsonProperty("averageValue")
  public Double getAverageValue() {
    return averageValue;
  }
  public void setAverageValue(Double averageValue) {
    this.averageValue = averageValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendData trendData = (TrendData) o;

    return Objects.equals(this.dateStartWorkday, trendData.dateStartWorkday) &&
            Objects.equals(this.dateEndWorkday, trendData.dateEndWorkday) &&
            Objects.equals(this.percentOfGoal, trendData.percentOfGoal) &&
            Objects.equals(this.averageValue, trendData.averageValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStartWorkday, dateEndWorkday, percentOfGoal, averageValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendData {\n");
    
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
    sb.append("    percentOfGoal: ").append(toIndentedString(percentOfGoal)).append("\n");
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
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

