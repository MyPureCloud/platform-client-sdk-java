package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserScheduleFullDayTimeOffMarker;
import com.mypurecloud.sdk.v2.model.UserScheduleShift;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A schedule for a single user over a given time range
 */
@ApiModel(description = "A schedule for a single user over a given time range")

public class UserSchedule  implements Serializable {
  
  private List<UserScheduleShift> shifts = new ArrayList<UserScheduleShift>();
  private List<UserScheduleFullDayTimeOffMarker> fullDayTimeOffMarkers = new ArrayList<UserScheduleFullDayTimeOffMarker>();

  
  /**
   * The shifts that belong to this schedule
   **/
  public UserSchedule shifts(List<UserScheduleShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shifts that belong to this schedule")
  @JsonProperty("shifts")
  public List<UserScheduleShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<UserScheduleShift> shifts) {
    this.shifts = shifts;
  }

  
  /**
   * Markers to indicate a full day time off request, relative to the management unit time zone
   **/
  public UserSchedule fullDayTimeOffMarkers(List<UserScheduleFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Markers to indicate a full day time off request, relative to the management unit time zone")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<UserScheduleFullDayTimeOffMarker> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }
  public void setFullDayTimeOffMarkers(List<UserScheduleFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSchedule userSchedule = (UserSchedule) o;
    return Objects.equals(this.shifts, userSchedule.shifts) &&
        Objects.equals(this.fullDayTimeOffMarkers, userSchedule.fullDayTimeOffMarkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shifts, fullDayTimeOffMarkers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSchedule {\n");
    
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkers: ").append(toIndentedString(fullDayTimeOffMarkers)).append("\n");
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

