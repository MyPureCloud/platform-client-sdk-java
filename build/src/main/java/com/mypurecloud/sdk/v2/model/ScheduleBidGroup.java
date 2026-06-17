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
import com.mypurecloud.sdk.v2.model.BidGroupScheduleSet;
import com.mypurecloud.sdk.v2.model.BidGroupWorkPlanRotationResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.PlanningGroupReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ScheduleBidGroup
 */

public class ScheduleBidGroup  implements Serializable {
  
  private String name = null;
  private ManagementUnitReference managementUnit = null;
  private List<UserReference> agents = null;
  private List<WorkPlanReference> workPlans = null;
  private List<BidGroupWorkPlanRotationResponse> workPlanRotations = null;
  private List<PlanningGroupReference> planningGroups = null;
  private String downloadUrl = null;
  private BidGroupScheduleSet downloadTemplate = null;

  public ScheduleBidGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agents = new ArrayList<UserReference>();
      workPlans = new ArrayList<WorkPlanReference>();
      workPlanRotations = new ArrayList<BidGroupWorkPlanRotationResponse>();
      planningGroups = new ArrayList<PlanningGroupReference>();
    }
  }

  public ScheduleBidGroup(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agents = new ArrayList<UserReference>();
      workPlans = new ArrayList<WorkPlanReference>();
      workPlanRotations = new ArrayList<BidGroupWorkPlanRotationResponse>();
      planningGroups = new ArrayList<PlanningGroupReference>();
    }
  }

  
  /**
   * The name of the schedule bid group
   **/
  public ScheduleBidGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the schedule bid group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The management unit to which this bid group belongs
   **/
  public ScheduleBidGroup managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit to which this bid group belongs")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The agents who participate in this bid group
   **/
  public ScheduleBidGroup agents(List<UserReference> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agents who participate in this bid group")
  @JsonProperty("agents")
  public List<UserReference> getAgents() {
    return agents;
  }
  public void setAgents(List<UserReference> agents) {
    this.agents = agents;
  }


  /**
   * The work plans used in this bid group
   **/
  public ScheduleBidGroup workPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plans used in this bid group")
  @JsonProperty("workPlans")
  public List<WorkPlanReference> getWorkPlans() {
    return workPlans;
  }
  public void setWorkPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
  }


  /**
   * The work plan rotations used in this bid group
   **/
  public ScheduleBidGroup workPlanRotations(List<BidGroupWorkPlanRotationResponse> workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan rotations used in this bid group")
  @JsonProperty("workPlanRotations")
  public List<BidGroupWorkPlanRotationResponse> getWorkPlanRotations() {
    return workPlanRotations;
  }
  public void setWorkPlanRotations(List<BidGroupWorkPlanRotationResponse> workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
  }


  /**
   * The planning groups selected in this bid group
   **/
  public ScheduleBidGroup planningGroups(List<PlanningGroupReference> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The planning groups selected in this bid group")
  @JsonProperty("planningGroups")
  public List<PlanningGroupReference> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<PlanningGroupReference> planningGroups) {
    this.planningGroups = planningGroups;
  }


  /**
   * The downloadUrl to fetch Schedule sets. It will be populated if the status of this bid is 'Optimized'
   **/
  public ScheduleBidGroup downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The downloadUrl to fetch Schedule sets. It will be populated if the status of this bid is 'Optimized'")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Schedule sets always come through downloadUrl, the schema included here is just for documentation
   **/
  public ScheduleBidGroup downloadTemplate(BidGroupScheduleSet downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule sets always come through downloadUrl, the schema included here is just for documentation")
  @JsonProperty("downloadTemplate")
  public BidGroupScheduleSet getDownloadTemplate() {
    return downloadTemplate;
  }
  public void setDownloadTemplate(BidGroupScheduleSet downloadTemplate) {
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
    ScheduleBidGroup scheduleBidGroup = (ScheduleBidGroup) o;

    return Objects.equals(this.name, scheduleBidGroup.name) &&
            Objects.equals(this.managementUnit, scheduleBidGroup.managementUnit) &&
            Objects.equals(this.agents, scheduleBidGroup.agents) &&
            Objects.equals(this.workPlans, scheduleBidGroup.workPlans) &&
            Objects.equals(this.workPlanRotations, scheduleBidGroup.workPlanRotations) &&
            Objects.equals(this.planningGroups, scheduleBidGroup.planningGroups) &&
            Objects.equals(this.downloadUrl, scheduleBidGroup.downloadUrl) &&
            Objects.equals(this.downloadTemplate, scheduleBidGroup.downloadTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managementUnit, agents, workPlans, workPlanRotations, planningGroups, downloadUrl, downloadTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    workPlans: ").append(toIndentedString(workPlans)).append("\n");
    sb.append("    workPlanRotations: ").append(toIndentedString(workPlanRotations)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
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

