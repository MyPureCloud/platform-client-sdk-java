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
import com.mypurecloud.sdk.v2.model.PlanningGroupOutputs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PerformancePredictionOutputs
 */

public class PerformancePredictionOutputs  implements Serializable {
  
  private Date calculationStartDate = null;
  private Integer calculationIntervalLengthMinutes = null;
  private List<PlanningGroupOutputs> planningGroupResults = new ArrayList<PlanningGroupOutputs>();

  
  /**
   * Date as an ISO-8601 string, corresponding to the beginning of the performance prediction results
   **/
  public PerformancePredictionOutputs calculationStartDate(Date calculationStartDate) {
    this.calculationStartDate = calculationStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date as an ISO-8601 string, corresponding to the beginning of the performance prediction results")
  @JsonProperty("calculationStartDate")
  public Date getCalculationStartDate() {
    return calculationStartDate;
  }
  public void setCalculationStartDate(Date calculationStartDate) {
    this.calculationStartDate = calculationStartDate;
  }


  /**
   * Interval length of the response metrics
   **/
  public PerformancePredictionOutputs calculationIntervalLengthMinutes(Integer calculationIntervalLengthMinutes) {
    this.calculationIntervalLengthMinutes = calculationIntervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Interval length of the response metrics")
  @JsonProperty("calculationIntervalLengthMinutes")
  public Integer getCalculationIntervalLengthMinutes() {
    return calculationIntervalLengthMinutes;
  }
  public void setCalculationIntervalLengthMinutes(Integer calculationIntervalLengthMinutes) {
    this.calculationIntervalLengthMinutes = calculationIntervalLengthMinutes;
  }


  /**
   * List of planning group level performance prediction results
   **/
  public PerformancePredictionOutputs planningGroupResults(List<PlanningGroupOutputs> planningGroupResults) {
    this.planningGroupResults = planningGroupResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of planning group level performance prediction results")
  @JsonProperty("planningGroupResults")
  public List<PlanningGroupOutputs> getPlanningGroupResults() {
    return planningGroupResults;
  }
  public void setPlanningGroupResults(List<PlanningGroupOutputs> planningGroupResults) {
    this.planningGroupResults = planningGroupResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformancePredictionOutputs performancePredictionOutputs = (PerformancePredictionOutputs) o;

    return Objects.equals(this.calculationStartDate, performancePredictionOutputs.calculationStartDate) &&
            Objects.equals(this.calculationIntervalLengthMinutes, performancePredictionOutputs.calculationIntervalLengthMinutes) &&
            Objects.equals(this.planningGroupResults, performancePredictionOutputs.planningGroupResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationStartDate, calculationIntervalLengthMinutes, planningGroupResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformancePredictionOutputs {\n");
    
    sb.append("    calculationStartDate: ").append(toIndentedString(calculationStartDate)).append("\n");
    sb.append("    calculationIntervalLengthMinutes: ").append(toIndentedString(calculationIntervalLengthMinutes)).append("\n");
    sb.append("    planningGroupResults: ").append(toIndentedString(planningGroupResults)).append("\n");
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

