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
import com.mypurecloud.sdk.v2.model.BuAgentScheduleShift;
import com.mypurecloud.sdk.v2.model.BuFullDayTimeOffMarker;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleQueryResponse
 */

public class BuAgentScheduleQueryResponse  implements Serializable {
  
  private UserReference user = null;
  private List<BuAgentScheduleShift> shifts = new ArrayList<BuAgentScheduleShift>();
  private List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers = new ArrayList<BuFullDayTimeOffMarker>();
  private WorkPlanReference workPlan = null;
  private List<WorkPlanReference> workPlansPerWeek = new ArrayList<WorkPlanReference>();
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The user to whom this agent schedule applies
   **/
  public BuAgentScheduleQueryResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user to whom this agent schedule applies")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }

  
  /**
   * The shift definitions for this agent schedule
   **/
  public BuAgentScheduleQueryResponse shifts(List<BuAgentScheduleShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shift definitions for this agent schedule")
  @JsonProperty("shifts")
  public List<BuAgentScheduleShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<BuAgentScheduleShift> shifts) {
    this.shifts = shifts;
  }

  
  /**
   * Full day time off markers which apply to this agent schedule
   **/
  public BuAgentScheduleQueryResponse fullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Full day time off markers which apply to this agent schedule")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<BuFullDayTimeOffMarker> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }
  public void setFullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
  }

  
  /**
   * The work plan for this user
   **/
  public BuAgentScheduleQueryResponse workPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan for this user")
  @JsonProperty("workPlan")
  public WorkPlanReference getWorkPlan() {
    return workPlan;
  }
  public void setWorkPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
  }

  
  /**
   * The work plans per week for this user from the work plan rotation. Null values in the list denotes that user is not part of any work plan for that week
   **/
  public BuAgentScheduleQueryResponse workPlansPerWeek(List<WorkPlanReference> workPlansPerWeek) {
    this.workPlansPerWeek = workPlansPerWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plans per week for this user from the work plan rotation. Null values in the list denotes that user is not part of any work plan for that week")
  @JsonProperty("workPlansPerWeek")
  public List<WorkPlanReference> getWorkPlansPerWeek() {
    return workPlansPerWeek;
  }
  public void setWorkPlansPerWeek(List<WorkPlanReference> workPlansPerWeek) {
    this.workPlansPerWeek = workPlansPerWeek;
  }

  
  /**
   * Versioned entity metadata for this agent schedule
   **/
  public BuAgentScheduleQueryResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Versioned entity metadata for this agent schedule")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentScheduleQueryResponse buAgentScheduleQueryResponse = (BuAgentScheduleQueryResponse) o;
    return Objects.equals(this.user, buAgentScheduleQueryResponse.user) &&
        Objects.equals(this.shifts, buAgentScheduleQueryResponse.shifts) &&
        Objects.equals(this.fullDayTimeOffMarkers, buAgentScheduleQueryResponse.fullDayTimeOffMarkers) &&
        Objects.equals(this.workPlan, buAgentScheduleQueryResponse.workPlan) &&
        Objects.equals(this.workPlansPerWeek, buAgentScheduleQueryResponse.workPlansPerWeek) &&
        Objects.equals(this.metadata, buAgentScheduleQueryResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, shifts, fullDayTimeOffMarkers, workPlan, workPlansPerWeek, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleQueryResponse {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkers: ").append(toIndentedString(fullDayTimeOffMarkers)).append("\n");
    sb.append("    workPlan: ").append(toIndentedString(workPlan)).append("\n");
    sb.append("    workPlansPerWeek: ").append(toIndentedString(workPlansPerWeek)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

