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
import com.mypurecloud.sdk.v2.model.ListWrapperString;
import com.mypurecloud.sdk.v2.model.ValueWrapperString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuImportAgentScheduleUploadSchema
 */

public class BuImportAgentScheduleUploadSchema  implements Serializable {
  
  private String userId = null;
  private ValueWrapperString workPlanId = null;
  private ListWrapperString workPlanIdsPerWeek = null;
  private List<BuAgentScheduleShift> shifts = new ArrayList<BuAgentScheduleShift>();
  private List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers = new ArrayList<BuFullDayTimeOffMarker>();

  
  /**
   * The ID of the user to whom this agent schedule applies
   **/
  public BuImportAgentScheduleUploadSchema userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the user to whom this agent schedule applies")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The ID of the work plan for this user.  Mutually exclusive with workPlanIdsPerWeek
   **/
  public BuImportAgentScheduleUploadSchema workPlanId(ValueWrapperString workPlanId) {
    this.workPlanId = workPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan for this user.  Mutually exclusive with workPlanIdsPerWeek")
  @JsonProperty("workPlanId")
  public ValueWrapperString getWorkPlanId() {
    return workPlanId;
  }
  public void setWorkPlanId(ValueWrapperString workPlanId) {
    this.workPlanId = workPlanId;
  }

  
  /**
   * The IDs of the work plans per week for this user.  Mutually exclusive with workPlanId
   **/
  public BuImportAgentScheduleUploadSchema workPlanIdsPerWeek(ListWrapperString workPlanIdsPerWeek) {
    this.workPlanIdsPerWeek = workPlanIdsPerWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the work plans per week for this user.  Mutually exclusive with workPlanId")
  @JsonProperty("workPlanIdsPerWeek")
  public ListWrapperString getWorkPlanIdsPerWeek() {
    return workPlanIdsPerWeek;
  }
  public void setWorkPlanIdsPerWeek(ListWrapperString workPlanIdsPerWeek) {
    this.workPlanIdsPerWeek = workPlanIdsPerWeek;
  }

  
  /**
   * The shift definitions for this agent schedule
   **/
  public BuImportAgentScheduleUploadSchema shifts(List<BuAgentScheduleShift> shifts) {
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
   * Any full day time off markers that apply to this agent schedule
   **/
  public BuImportAgentScheduleUploadSchema fullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any full day time off markers that apply to this agent schedule")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<BuFullDayTimeOffMarker> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }
  public void setFullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
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
    BuImportAgentScheduleUploadSchema buImportAgentScheduleUploadSchema = (BuImportAgentScheduleUploadSchema) o;
    return Objects.equals(this.userId, buImportAgentScheduleUploadSchema.userId) &&
        Objects.equals(this.workPlanId, buImportAgentScheduleUploadSchema.workPlanId) &&
        Objects.equals(this.workPlanIdsPerWeek, buImportAgentScheduleUploadSchema.workPlanIdsPerWeek) &&
        Objects.equals(this.shifts, buImportAgentScheduleUploadSchema.shifts) &&
        Objects.equals(this.fullDayTimeOffMarkers, buImportAgentScheduleUploadSchema.fullDayTimeOffMarkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, workPlanId, workPlanIdsPerWeek, shifts, fullDayTimeOffMarkers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuImportAgentScheduleUploadSchema {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    workPlanIdsPerWeek: ").append(toIndentedString(workPlanIdsPerWeek)).append("\n");
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

