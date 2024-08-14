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
import com.mypurecloud.sdk.v2.model.AlternativeShiftAgentScheduledShift;
import com.mypurecloud.sdk.v2.model.AlternativeShiftScheduleLookup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AlternativeShiftOffersViewResponseTemplate
 */

public class AlternativeShiftOffersViewResponseTemplate  implements Serializable {
  
  private String jobId = null;
  private String businessUnitId = null;
  private String agentId = null;
  private String managementUnitId = null;
  private AlternativeShiftScheduleLookup schedule = null;
  private LocalDate offerWeekDate = null;
  private List<AlternativeShiftAgentScheduledShift> shifts = new ArrayList<AlternativeShiftAgentScheduledShift>();
  private List<AlternativeShiftAgentScheduledShift> alternativeDays = new ArrayList<AlternativeShiftAgentScheduledShift>();

  
  /**
   * The unique identifier of the async list job that created this file
   **/
  public AlternativeShiftOffersViewResponseTemplate jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the async list job that created this file")
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  /**
   * The unique identifier of the business unit to which the user (agent) belongs at the time the offer is created
   **/
  public AlternativeShiftOffersViewResponseTemplate businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the business unit to which the user (agent) belongs at the time the offer is created")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   * The unique identifier of the agent for whom the offer was made
   **/
  public AlternativeShiftOffersViewResponseTemplate agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the agent for whom the offer was made")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * The unique identifier of the management unit to which the user (agent) belongs at the time the offer is created
   **/
  public AlternativeShiftOffersViewResponseTemplate managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the management unit to which the user (agent) belongs at the time the offer is created")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * The existing schedule information associated with the offer
   **/
  public AlternativeShiftOffersViewResponseTemplate schedule(AlternativeShiftScheduleLookup schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The existing schedule information associated with the offer")
  @JsonProperty("schedule")
  public AlternativeShiftScheduleLookup getSchedule() {
    return schedule;
  }
  public void setSchedule(AlternativeShiftScheduleLookup schedule) {
    this.schedule = schedule;
  }


  /**
   * The first date of the week for the schedule we are querying in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AlternativeShiftOffersViewResponseTemplate offerWeekDate(LocalDate offerWeekDate) {
    this.offerWeekDate = offerWeekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The first date of the week for the schedule we are querying in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("offerWeekDate")
  public LocalDate getOfferWeekDate() {
    return offerWeekDate;
  }
  public void setOfferWeekDate(LocalDate offerWeekDate) {
    this.offerWeekDate = offerWeekDate;
  }


  /**
   * The shifts the agent is scheduled for at the time the offer is created
   **/
  public AlternativeShiftOffersViewResponseTemplate shifts(List<AlternativeShiftAgentScheduledShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shifts the agent is scheduled for at the time the offer is created")
  @JsonProperty("shifts")
  public List<AlternativeShiftAgentScheduledShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<AlternativeShiftAgentScheduledShift> shifts) {
    this.shifts = shifts;
  }


  /**
   * The offered alternative shift days in this week at the time the offer is created
   **/
  public AlternativeShiftOffersViewResponseTemplate alternativeDays(List<AlternativeShiftAgentScheduledShift> alternativeDays) {
    this.alternativeDays = alternativeDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The offered alternative shift days in this week at the time the offer is created")
  @JsonProperty("alternativeDays")
  public List<AlternativeShiftAgentScheduledShift> getAlternativeDays() {
    return alternativeDays;
  }
  public void setAlternativeDays(List<AlternativeShiftAgentScheduledShift> alternativeDays) {
    this.alternativeDays = alternativeDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeShiftOffersViewResponseTemplate alternativeShiftOffersViewResponseTemplate = (AlternativeShiftOffersViewResponseTemplate) o;

    return Objects.equals(this.jobId, alternativeShiftOffersViewResponseTemplate.jobId) &&
            Objects.equals(this.businessUnitId, alternativeShiftOffersViewResponseTemplate.businessUnitId) &&
            Objects.equals(this.agentId, alternativeShiftOffersViewResponseTemplate.agentId) &&
            Objects.equals(this.managementUnitId, alternativeShiftOffersViewResponseTemplate.managementUnitId) &&
            Objects.equals(this.schedule, alternativeShiftOffersViewResponseTemplate.schedule) &&
            Objects.equals(this.offerWeekDate, alternativeShiftOffersViewResponseTemplate.offerWeekDate) &&
            Objects.equals(this.shifts, alternativeShiftOffersViewResponseTemplate.shifts) &&
            Objects.equals(this.alternativeDays, alternativeShiftOffersViewResponseTemplate.alternativeDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, businessUnitId, agentId, managementUnitId, schedule, offerWeekDate, shifts, alternativeDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftOffersViewResponseTemplate {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    offerWeekDate: ").append(toIndentedString(offerWeekDate)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    alternativeDays: ").append(toIndentedString(alternativeDays)).append("\n");
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

