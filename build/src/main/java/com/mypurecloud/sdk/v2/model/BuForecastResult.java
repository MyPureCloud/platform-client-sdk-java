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
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuForecastResult
 */

public class BuForecastResult  implements Serializable {
  
  private Date referenceStartDate = null;
  private List<ForecastPlanningGroupData> planningGroups = new ArrayList<ForecastPlanningGroupData>();
  private Integer weekNumber = null;
  private Integer weekCount = null;

  
  /**
   * The reference start date for interval-based data for this forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuForecastResult referenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference start date for interval-based data for this forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("referenceStartDate")
  public Date getReferenceStartDate() {
    return referenceStartDate;
  }
  public void setReferenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
  }

  
  /**
   * The forecast data broken up by planning group
   **/
  public BuForecastResult planningGroups(List<ForecastPlanningGroupData> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecast data broken up by planning group")
  @JsonProperty("planningGroups")
  public List<ForecastPlanningGroupData> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<ForecastPlanningGroupData> planningGroups) {
    this.planningGroups = planningGroups;
  }

  
  /**
   * The week number represented by this response
   **/
  public BuForecastResult weekNumber(Integer weekNumber) {
    this.weekNumber = weekNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The week number represented by this response")
  @JsonProperty("weekNumber")
  public Integer getWeekNumber() {
    return weekNumber;
  }
  public void setWeekNumber(Integer weekNumber) {
    this.weekNumber = weekNumber;
  }

  
  /**
   * The number of weeks in this forecast
   **/
  public BuForecastResult weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks in this forecast")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuForecastResult buForecastResult = (BuForecastResult) o;
    return Objects.equals(this.referenceStartDate, buForecastResult.referenceStartDate) &&
        Objects.equals(this.planningGroups, buForecastResult.planningGroups) &&
        Objects.equals(this.weekNumber, buForecastResult.weekNumber) &&
        Objects.equals(this.weekCount, buForecastResult.weekCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceStartDate, planningGroups, weekNumber, weekCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastResult {\n");
    
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
    sb.append("    weekNumber: ").append(toIndentedString(weekNumber)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
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

