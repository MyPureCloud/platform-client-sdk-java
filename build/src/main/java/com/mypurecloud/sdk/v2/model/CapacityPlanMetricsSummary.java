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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanMetricsSummary
 */

public class CapacityPlanMetricsSummary  implements Serializable {
  
  private List<Double> requiredStaffFullTimeEquivalentCount = null;
  private List<Double> plannedFullTimeEquivalentCount = null;
  private List<Double> staffingOverUnderFullTimeEquivalentCount = null;
  private List<Double> startingFullTimeEquivalentCount = null;
  private List<Double> attritionFullTimeEquivalentCount = null;
  private List<Double> attritionPercentage = null;
  private List<Double> newHireFullTimeEquivalentCount = null;
  private List<Double> transfersFullTimeEquivalentCount = null;
  private List<Double> extraTimeUnderTimeFullTimeEquivalentCount = null;
  private List<Double> shrinkageFullTimeEquivalentCount = null;
  private List<Double> shrinkagePercentage = null;
  private List<Double> endOfMonthPlannedFullTimeEquivalentCount = null;
  private List<Double> netFullTimeEquivalentCount = null;

  public CapacityPlanMetricsSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requiredStaffFullTimeEquivalentCount = new ArrayList<Double>();
      plannedFullTimeEquivalentCount = new ArrayList<Double>();
      staffingOverUnderFullTimeEquivalentCount = new ArrayList<Double>();
      startingFullTimeEquivalentCount = new ArrayList<Double>();
      attritionFullTimeEquivalentCount = new ArrayList<Double>();
      attritionPercentage = new ArrayList<Double>();
      newHireFullTimeEquivalentCount = new ArrayList<Double>();
      transfersFullTimeEquivalentCount = new ArrayList<Double>();
      extraTimeUnderTimeFullTimeEquivalentCount = new ArrayList<Double>();
      shrinkageFullTimeEquivalentCount = new ArrayList<Double>();
      shrinkagePercentage = new ArrayList<Double>();
      endOfMonthPlannedFullTimeEquivalentCount = new ArrayList<Double>();
      netFullTimeEquivalentCount = new ArrayList<Double>();
    }
  }

  
  /**
   * The total staff requirements for all planning groups in the capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary requiredStaffFullTimeEquivalentCount(List<Double> requiredStaffFullTimeEquivalentCount) {
    this.requiredStaffFullTimeEquivalentCount = requiredStaffFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total staff requirements for all planning groups in the capacity plan, aggregated by the selected time granularity")
  @JsonProperty("requiredStaffFullTimeEquivalentCount")
  public List<Double> getRequiredStaffFullTimeEquivalentCount() {
    return requiredStaffFullTimeEquivalentCount;
  }
  public void setRequiredStaffFullTimeEquivalentCount(List<Double> requiredStaffFullTimeEquivalentCount) {
    this.requiredStaffFullTimeEquivalentCount = requiredStaffFullTimeEquivalentCount;
  }


  /**
   * The planned full time equivalent for all staffing groups in the capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary plannedFullTimeEquivalentCount(List<Double> plannedFullTimeEquivalentCount) {
    this.plannedFullTimeEquivalentCount = plannedFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The planned full time equivalent for all staffing groups in the capacity plan, aggregated by the selected time granularity")
  @JsonProperty("plannedFullTimeEquivalentCount")
  public List<Double> getPlannedFullTimeEquivalentCount() {
    return plannedFullTimeEquivalentCount;
  }
  public void setPlannedFullTimeEquivalentCount(List<Double> plannedFullTimeEquivalentCount) {
    this.plannedFullTimeEquivalentCount = plannedFullTimeEquivalentCount;
  }


  /**
   * The difference between the summary of planning group required full time equivalent and planned full time equivalent, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary staffingOverUnderFullTimeEquivalentCount(List<Double> staffingOverUnderFullTimeEquivalentCount) {
    this.staffingOverUnderFullTimeEquivalentCount = staffingOverUnderFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The difference between the summary of planning group required full time equivalent and planned full time equivalent, aggregated by the selected time granularity")
  @JsonProperty("staffingOverUnderFullTimeEquivalentCount")
  public List<Double> getStaffingOverUnderFullTimeEquivalentCount() {
    return staffingOverUnderFullTimeEquivalentCount;
  }
  public void setStaffingOverUnderFullTimeEquivalentCount(List<Double> staffingOverUnderFullTimeEquivalentCount) {
    this.staffingOverUnderFullTimeEquivalentCount = staffingOverUnderFullTimeEquivalentCount;
  }


  /**
   * The total starting full time equivalent for all staffing groups in the capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary startingFullTimeEquivalentCount(List<Double> startingFullTimeEquivalentCount) {
    this.startingFullTimeEquivalentCount = startingFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total starting full time equivalent for all staffing groups in the capacity plan, aggregated by the selected time granularity")
  @JsonProperty("startingFullTimeEquivalentCount")
  public List<Double> getStartingFullTimeEquivalentCount() {
    return startingFullTimeEquivalentCount;
  }
  public void setStartingFullTimeEquivalentCount(List<Double> startingFullTimeEquivalentCount) {
    this.startingFullTimeEquivalentCount = startingFullTimeEquivalentCount;
  }


  /**
   * The sum of all staffing group attrition full time equivalent in the capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary attritionFullTimeEquivalentCount(List<Double> attritionFullTimeEquivalentCount) {
    this.attritionFullTimeEquivalentCount = attritionFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all staffing group attrition full time equivalent in the capacity plan, aggregated by the selected time granularity")
  @JsonProperty("attritionFullTimeEquivalentCount")
  public List<Double> getAttritionFullTimeEquivalentCount() {
    return attritionFullTimeEquivalentCount;
  }
  public void setAttritionFullTimeEquivalentCount(List<Double> attritionFullTimeEquivalentCount) {
    this.attritionFullTimeEquivalentCount = attritionFullTimeEquivalentCount;
  }


  /**
   * The total attrition percentage of staffing groups in the capacity plan in the scale of 0.0-100.0, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary attritionPercentage(List<Double> attritionPercentage) {
    this.attritionPercentage = attritionPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total attrition percentage of staffing groups in the capacity plan in the scale of 0.0-100.0, aggregated by the selected time granularity")
  @JsonProperty("attritionPercentage")
  public List<Double> getAttritionPercentage() {
    return attritionPercentage;
  }
  public void setAttritionPercentage(List<Double> attritionPercentage) {
    this.attritionPercentage = attritionPercentage;
  }


  /**
   * The sum of all staffing group new hire full time equivalent in the capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary newHireFullTimeEquivalentCount(List<Double> newHireFullTimeEquivalentCount) {
    this.newHireFullTimeEquivalentCount = newHireFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all staffing group new hire full time equivalent in the capacity plan, aggregated by the selected time granularity")
  @JsonProperty("newHireFullTimeEquivalentCount")
  public List<Double> getNewHireFullTimeEquivalentCount() {
    return newHireFullTimeEquivalentCount;
  }
  public void setNewHireFullTimeEquivalentCount(List<Double> newHireFullTimeEquivalentCount) {
    this.newHireFullTimeEquivalentCount = newHireFullTimeEquivalentCount;
  }


  /**
   * The sum of all staffing group projected transfers of agents into or out of this capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary transfersFullTimeEquivalentCount(List<Double> transfersFullTimeEquivalentCount) {
    this.transfersFullTimeEquivalentCount = transfersFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all staffing group projected transfers of agents into or out of this capacity plan, aggregated by the selected time granularity")
  @JsonProperty("transfersFullTimeEquivalentCount")
  public List<Double> getTransfersFullTimeEquivalentCount() {
    return transfersFullTimeEquivalentCount;
  }
  public void setTransfersFullTimeEquivalentCount(List<Double> transfersFullTimeEquivalentCount) {
    this.transfersFullTimeEquivalentCount = transfersFullTimeEquivalentCount;
  }


  /**
   * The sum of all staffing group extra or under time full time equivalent count in the capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary extraTimeUnderTimeFullTimeEquivalentCount(List<Double> extraTimeUnderTimeFullTimeEquivalentCount) {
    this.extraTimeUnderTimeFullTimeEquivalentCount = extraTimeUnderTimeFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all staffing group extra or under time full time equivalent count in the capacity plan, aggregated by the selected time granularity")
  @JsonProperty("extraTimeUnderTimeFullTimeEquivalentCount")
  public List<Double> getExtraTimeUnderTimeFullTimeEquivalentCount() {
    return extraTimeUnderTimeFullTimeEquivalentCount;
  }
  public void setExtraTimeUnderTimeFullTimeEquivalentCount(List<Double> extraTimeUnderTimeFullTimeEquivalentCount) {
    this.extraTimeUnderTimeFullTimeEquivalentCount = extraTimeUnderTimeFullTimeEquivalentCount;
  }


  /**
   * The sum of all staffing groups shrinkage full time equivalent, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary shrinkageFullTimeEquivalentCount(List<Double> shrinkageFullTimeEquivalentCount) {
    this.shrinkageFullTimeEquivalentCount = shrinkageFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all staffing groups shrinkage full time equivalent, aggregated by the selected time granularity")
  @JsonProperty("shrinkageFullTimeEquivalentCount")
  public List<Double> getShrinkageFullTimeEquivalentCount() {
    return shrinkageFullTimeEquivalentCount;
  }
  public void setShrinkageFullTimeEquivalentCount(List<Double> shrinkageFullTimeEquivalentCount) {
    this.shrinkageFullTimeEquivalentCount = shrinkageFullTimeEquivalentCount;
  }


  /**
   * The total shrinkage percentage of all staffing groups in the capacity plan in the scale of 0.0-100.0, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary shrinkagePercentage(List<Double> shrinkagePercentage) {
    this.shrinkagePercentage = shrinkagePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total shrinkage percentage of all staffing groups in the capacity plan in the scale of 0.0-100.0, aggregated by the selected time granularity")
  @JsonProperty("shrinkagePercentage")
  public List<Double> getShrinkagePercentage() {
    return shrinkagePercentage;
  }
  public void setShrinkagePercentage(List<Double> shrinkagePercentage) {
    this.shrinkagePercentage = shrinkagePercentage;
  }


  /**
   * The total sum of all staffing group end of month planned full time equivalent for this capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary endOfMonthPlannedFullTimeEquivalentCount(List<Double> endOfMonthPlannedFullTimeEquivalentCount) {
    this.endOfMonthPlannedFullTimeEquivalentCount = endOfMonthPlannedFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total sum of all staffing group end of month planned full time equivalent for this capacity plan, aggregated by the selected time granularity")
  @JsonProperty("endOfMonthPlannedFullTimeEquivalentCount")
  public List<Double> getEndOfMonthPlannedFullTimeEquivalentCount() {
    return endOfMonthPlannedFullTimeEquivalentCount;
  }
  public void setEndOfMonthPlannedFullTimeEquivalentCount(List<Double> endOfMonthPlannedFullTimeEquivalentCount) {
    this.endOfMonthPlannedFullTimeEquivalentCount = endOfMonthPlannedFullTimeEquivalentCount;
  }


  /**
   * The sum of all staffing groups net full time equivalent in the capacity plan, aggregated by the selected time granularity
   **/
  public CapacityPlanMetricsSummary netFullTimeEquivalentCount(List<Double> netFullTimeEquivalentCount) {
    this.netFullTimeEquivalentCount = netFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sum of all staffing groups net full time equivalent in the capacity plan, aggregated by the selected time granularity")
  @JsonProperty("netFullTimeEquivalentCount")
  public List<Double> getNetFullTimeEquivalentCount() {
    return netFullTimeEquivalentCount;
  }
  public void setNetFullTimeEquivalentCount(List<Double> netFullTimeEquivalentCount) {
    this.netFullTimeEquivalentCount = netFullTimeEquivalentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanMetricsSummary capacityPlanMetricsSummary = (CapacityPlanMetricsSummary) o;

    return Objects.equals(this.requiredStaffFullTimeEquivalentCount, capacityPlanMetricsSummary.requiredStaffFullTimeEquivalentCount) &&
            Objects.equals(this.plannedFullTimeEquivalentCount, capacityPlanMetricsSummary.plannedFullTimeEquivalentCount) &&
            Objects.equals(this.staffingOverUnderFullTimeEquivalentCount, capacityPlanMetricsSummary.staffingOverUnderFullTimeEquivalentCount) &&
            Objects.equals(this.startingFullTimeEquivalentCount, capacityPlanMetricsSummary.startingFullTimeEquivalentCount) &&
            Objects.equals(this.attritionFullTimeEquivalentCount, capacityPlanMetricsSummary.attritionFullTimeEquivalentCount) &&
            Objects.equals(this.attritionPercentage, capacityPlanMetricsSummary.attritionPercentage) &&
            Objects.equals(this.newHireFullTimeEquivalentCount, capacityPlanMetricsSummary.newHireFullTimeEquivalentCount) &&
            Objects.equals(this.transfersFullTimeEquivalentCount, capacityPlanMetricsSummary.transfersFullTimeEquivalentCount) &&
            Objects.equals(this.extraTimeUnderTimeFullTimeEquivalentCount, capacityPlanMetricsSummary.extraTimeUnderTimeFullTimeEquivalentCount) &&
            Objects.equals(this.shrinkageFullTimeEquivalentCount, capacityPlanMetricsSummary.shrinkageFullTimeEquivalentCount) &&
            Objects.equals(this.shrinkagePercentage, capacityPlanMetricsSummary.shrinkagePercentage) &&
            Objects.equals(this.endOfMonthPlannedFullTimeEquivalentCount, capacityPlanMetricsSummary.endOfMonthPlannedFullTimeEquivalentCount) &&
            Objects.equals(this.netFullTimeEquivalentCount, capacityPlanMetricsSummary.netFullTimeEquivalentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredStaffFullTimeEquivalentCount, plannedFullTimeEquivalentCount, staffingOverUnderFullTimeEquivalentCount, startingFullTimeEquivalentCount, attritionFullTimeEquivalentCount, attritionPercentage, newHireFullTimeEquivalentCount, transfersFullTimeEquivalentCount, extraTimeUnderTimeFullTimeEquivalentCount, shrinkageFullTimeEquivalentCount, shrinkagePercentage, endOfMonthPlannedFullTimeEquivalentCount, netFullTimeEquivalentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanMetricsSummary {\n");
    
    sb.append("    requiredStaffFullTimeEquivalentCount: ").append(toIndentedString(requiredStaffFullTimeEquivalentCount)).append("\n");
    sb.append("    plannedFullTimeEquivalentCount: ").append(toIndentedString(plannedFullTimeEquivalentCount)).append("\n");
    sb.append("    staffingOverUnderFullTimeEquivalentCount: ").append(toIndentedString(staffingOverUnderFullTimeEquivalentCount)).append("\n");
    sb.append("    startingFullTimeEquivalentCount: ").append(toIndentedString(startingFullTimeEquivalentCount)).append("\n");
    sb.append("    attritionFullTimeEquivalentCount: ").append(toIndentedString(attritionFullTimeEquivalentCount)).append("\n");
    sb.append("    attritionPercentage: ").append(toIndentedString(attritionPercentage)).append("\n");
    sb.append("    newHireFullTimeEquivalentCount: ").append(toIndentedString(newHireFullTimeEquivalentCount)).append("\n");
    sb.append("    transfersFullTimeEquivalentCount: ").append(toIndentedString(transfersFullTimeEquivalentCount)).append("\n");
    sb.append("    extraTimeUnderTimeFullTimeEquivalentCount: ").append(toIndentedString(extraTimeUnderTimeFullTimeEquivalentCount)).append("\n");
    sb.append("    shrinkageFullTimeEquivalentCount: ").append(toIndentedString(shrinkageFullTimeEquivalentCount)).append("\n");
    sb.append("    shrinkagePercentage: ").append(toIndentedString(shrinkagePercentage)).append("\n");
    sb.append("    endOfMonthPlannedFullTimeEquivalentCount: ").append(toIndentedString(endOfMonthPlannedFullTimeEquivalentCount)).append("\n");
    sb.append("    netFullTimeEquivalentCount: ").append(toIndentedString(netFullTimeEquivalentCount)).append("\n");
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

