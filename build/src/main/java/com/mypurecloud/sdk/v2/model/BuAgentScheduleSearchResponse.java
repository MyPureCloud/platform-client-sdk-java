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
import com.mypurecloud.sdk.v2.model.BuAgentScheduleShift;
import com.mypurecloud.sdk.v2.model.BuFullDayTimeOffMarker;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleSearchResponse
 */

public class BuAgentScheduleSearchResponse  implements Serializable {
  
  private UserReference user = null;
  private List<BuAgentScheduleShift> shifts = null;
  private List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers = null;
  private List<WorkPlanReference> workPlansPerWeek = null;

  public BuAgentScheduleSearchResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shifts = new ArrayList<BuAgentScheduleShift>();
      fullDayTimeOffMarkers = new ArrayList<BuFullDayTimeOffMarker>();
      workPlansPerWeek = new ArrayList<WorkPlanReference>();
    }
  }

  public BuAgentScheduleSearchResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      shifts = new ArrayList<BuAgentScheduleShift>();
      fullDayTimeOffMarkers = new ArrayList<BuFullDayTimeOffMarker>();
      workPlansPerWeek = new ArrayList<WorkPlanReference>();
    }
  }

  
  /**
   * The user to whom this agent schedule applies
   **/
  public BuAgentScheduleSearchResponse user(UserReference user) {
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
  public BuAgentScheduleSearchResponse shifts(List<BuAgentScheduleShift> shifts) {
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
  public BuAgentScheduleSearchResponse fullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
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
   * The work plans per week for this user from the work plan rotation. Null values in the list denotes that user is not part of any work plan for that week
   **/
  public BuAgentScheduleSearchResponse workPlansPerWeek(List<WorkPlanReference> workPlansPerWeek) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentScheduleSearchResponse buAgentScheduleSearchResponse = (BuAgentScheduleSearchResponse) o;

    return Objects.equals(this.user, buAgentScheduleSearchResponse.user) &&
            Objects.equals(this.shifts, buAgentScheduleSearchResponse.shifts) &&
            Objects.equals(this.fullDayTimeOffMarkers, buAgentScheduleSearchResponse.fullDayTimeOffMarkers) &&
            Objects.equals(this.workPlansPerWeek, buAgentScheduleSearchResponse.workPlansPerWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, shifts, fullDayTimeOffMarkers, workPlansPerWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleSearchResponse {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkers: ").append(toIndentedString(fullDayTimeOffMarkers)).append("\n");
    sb.append("    workPlansPerWeek: ").append(toIndentedString(workPlansPerWeek)).append("\n");
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

