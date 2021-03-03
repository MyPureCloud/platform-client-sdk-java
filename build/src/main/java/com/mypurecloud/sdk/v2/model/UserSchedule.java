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
import com.mypurecloud.sdk.v2.model.UserScheduleFullDayTimeOffMarker;
import com.mypurecloud.sdk.v2.model.UserScheduleShift;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
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
  private Boolean delete = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String workPlanId = null;

  
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

  
  /**
   * If marked true for updating an existing user schedule, it will be deleted
   **/
  public UserSchedule delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If marked true for updating an existing user schedule, it will be deleted")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  
  /**
   * Version metadata for this schedule
   **/
  public UserSchedule metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this schedule")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  @ApiModelProperty(example = "null", value = "ID of the work plan associated with the user during schedule creation")
  @JsonProperty("workPlanId")
  public String getWorkPlanId() {
    return workPlanId;
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
        Objects.equals(this.fullDayTimeOffMarkers, userSchedule.fullDayTimeOffMarkers) &&
        Objects.equals(this.delete, userSchedule.delete) &&
        Objects.equals(this.metadata, userSchedule.metadata) &&
        Objects.equals(this.workPlanId, userSchedule.workPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shifts, fullDayTimeOffMarkers, delete, metadata, workPlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSchedule {\n");
    
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkers: ").append(toIndentedString(fullDayTimeOffMarkers)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
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

