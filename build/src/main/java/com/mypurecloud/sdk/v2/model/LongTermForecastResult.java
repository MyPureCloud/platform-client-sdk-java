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
import com.mypurecloud.sdk.v2.model.LongTermForecastPlanningGroupData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LongTermForecastResult
 */

public class LongTermForecastResult  implements Serializable {
  
  private List<LongTermForecastPlanningGroupData> planningGroups = new ArrayList<LongTermForecastPlanningGroupData>();
  private LocalDate referenceStartDate = null;
  private Integer weekCount = null;

  
  /**
   * The forecast data broken up by planning group
   **/
  public LongTermForecastResult planningGroups(List<LongTermForecastPlanningGroupData> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecast data broken up by planning group")
  @JsonProperty("planningGroups")
  public List<LongTermForecastPlanningGroupData> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<LongTermForecastPlanningGroupData> planningGroups) {
    this.planningGroups = planningGroups;
  }

  
  /**
   * The reference start date relative to the business unit time zone in this forecast. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public LongTermForecastResult referenceStartDate(LocalDate referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference start date relative to the business unit time zone in this forecast. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("referenceStartDate")
  public LocalDate getReferenceStartDate() {
    return referenceStartDate;
  }
  public void setReferenceStartDate(LocalDate referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
  }

  
  /**
   * The number of weeks in this forecast
   **/
  public LongTermForecastResult weekCount(Integer weekCount) {
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
    LongTermForecastResult longTermForecastResult = (LongTermForecastResult) o;
    return Objects.equals(this.planningGroups, longTermForecastResult.planningGroups) &&
        Objects.equals(this.referenceStartDate, longTermForecastResult.referenceStartDate) &&
        Objects.equals(this.weekCount, longTermForecastResult.weekCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroups, referenceStartDate, weekCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermForecastResult {\n");
    
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
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

