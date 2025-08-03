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
import com.mypurecloud.sdk.v2.model.CapacityPlanReference;
import com.mypurecloud.sdk.v2.model.StaffingGroupAllocationsResponseTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CapacityPlanStaffingGroupAllocationsResponse
 */

public class CapacityPlanStaffingGroupAllocationsResponse  implements Serializable {
  
  private CapacityPlanReference capacityPlan = null;
  private Double fullTimeEquivalentWeeklyHours = null;
  private String downloadUrl = null;
  private StaffingGroupAllocationsResponseTemplate downloadTemplate = null;

  public CapacityPlanStaffingGroupAllocationsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The capacity plan to which the staffing groups belong
   **/
  public CapacityPlanStaffingGroupAllocationsResponse capacityPlan(CapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity plan to which the staffing groups belong")
  @JsonProperty("capacityPlan")
  public CapacityPlanReference getCapacityPlan() {
    return capacityPlan;
  }
  public void setCapacityPlan(CapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
  }


  /**
   * The weekly hours used to calculate full time equivalent agents
   **/
  public CapacityPlanStaffingGroupAllocationsResponse fullTimeEquivalentWeeklyHours(Double fullTimeEquivalentWeeklyHours) {
    this.fullTimeEquivalentWeeklyHours = fullTimeEquivalentWeeklyHours;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly hours used to calculate full time equivalent agents")
  @JsonProperty("fullTimeEquivalentWeeklyHours")
  public Double getFullTimeEquivalentWeeklyHours() {
    return fullTimeEquivalentWeeklyHours;
  }
  public void setFullTimeEquivalentWeeklyHours(Double fullTimeEquivalentWeeklyHours) {
    this.fullTimeEquivalentWeeklyHours = fullTimeEquivalentWeeklyHours;
  }


  /**
   * The URL to download the staffing group allocations
   **/
  public CapacityPlanStaffingGroupAllocationsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The URL to download the staffing group allocations")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Staffing groups allocation results always come through downloadUrl, the schema included here is just for documentation
   **/
  public CapacityPlanStaffingGroupAllocationsResponse downloadTemplate(StaffingGroupAllocationsResponseTemplate downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Staffing groups allocation results always come through downloadUrl, the schema included here is just for documentation")
  @JsonProperty("downloadTemplate")
  public StaffingGroupAllocationsResponseTemplate getDownloadTemplate() {
    return downloadTemplate;
  }
  public void setDownloadTemplate(StaffingGroupAllocationsResponseTemplate downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanStaffingGroupAllocationsResponse capacityPlanStaffingGroupAllocationsResponse = (CapacityPlanStaffingGroupAllocationsResponse) o;

    return Objects.equals(this.capacityPlan, capacityPlanStaffingGroupAllocationsResponse.capacityPlan) &&
            Objects.equals(this.fullTimeEquivalentWeeklyHours, capacityPlanStaffingGroupAllocationsResponse.fullTimeEquivalentWeeklyHours) &&
            Objects.equals(this.downloadUrl, capacityPlanStaffingGroupAllocationsResponse.downloadUrl) &&
            Objects.equals(this.downloadTemplate, capacityPlanStaffingGroupAllocationsResponse.downloadTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityPlan, fullTimeEquivalentWeeklyHours, downloadUrl, downloadTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanStaffingGroupAllocationsResponse {\n");
    
    sb.append("    capacityPlan: ").append(toIndentedString(capacityPlan)).append("\n");
    sb.append("    fullTimeEquivalentWeeklyHours: ").append(toIndentedString(fullTimeEquivalentWeeklyHours)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadTemplate: ").append(toIndentedString(downloadTemplate)).append("\n");
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

