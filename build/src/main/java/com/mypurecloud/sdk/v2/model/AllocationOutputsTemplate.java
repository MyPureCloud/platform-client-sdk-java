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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AllocationResultsTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AllocationOutputsTemplate
 */

public class AllocationOutputsTemplate  implements Serializable {
  
  private Date calculationStartDate = null;
  private Integer calculationIntervalLengthMinutes = null;
  private List<AllocationResultsTemplate> planningGroupAllocationResults = null;

  public AllocationOutputsTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      planningGroupAllocationResults = new ArrayList<AllocationResultsTemplate>();
    }
  }

  public AllocationOutputsTemplate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      planningGroupAllocationResults = new ArrayList<AllocationResultsTemplate>();
    }
  }

  
  /**
   * The beginning of the allocation results, in ISO-8601 format
   **/
  public AllocationOutputsTemplate calculationStartDate(Date calculationStartDate) {
    this.calculationStartDate = calculationStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The beginning of the allocation results, in ISO-8601 format")
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
  public AllocationOutputsTemplate calculationIntervalLengthMinutes(Integer calculationIntervalLengthMinutes) {
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
   * Planning group level allocation results
   **/
  public AllocationOutputsTemplate planningGroupAllocationResults(List<AllocationResultsTemplate> planningGroupAllocationResults) {
    this.planningGroupAllocationResults = planningGroupAllocationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Planning group level allocation results")
  @JsonProperty("planningGroupAllocationResults")
  public List<AllocationResultsTemplate> getPlanningGroupAllocationResults() {
    return planningGroupAllocationResults;
  }
  public void setPlanningGroupAllocationResults(List<AllocationResultsTemplate> planningGroupAllocationResults) {
    this.planningGroupAllocationResults = planningGroupAllocationResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationOutputsTemplate allocationOutputsTemplate = (AllocationOutputsTemplate) o;

    return Objects.equals(this.calculationStartDate, allocationOutputsTemplate.calculationStartDate) &&
            Objects.equals(this.calculationIntervalLengthMinutes, allocationOutputsTemplate.calculationIntervalLengthMinutes) &&
            Objects.equals(this.planningGroupAllocationResults, allocationOutputsTemplate.planningGroupAllocationResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationStartDate, calculationIntervalLengthMinutes, planningGroupAllocationResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationOutputsTemplate {\n");
    
    sb.append("    calculationStartDate: ").append(toIndentedString(calculationStartDate)).append("\n");
    sb.append("    calculationIntervalLengthMinutes: ").append(toIndentedString(calculationIntervalLengthMinutes)).append("\n");
    sb.append("    planningGroupAllocationResults: ").append(toIndentedString(planningGroupAllocationResults)).append("\n");
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

