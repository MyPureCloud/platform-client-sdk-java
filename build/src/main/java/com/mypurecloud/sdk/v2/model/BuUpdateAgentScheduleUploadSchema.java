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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuUpdateAgentScheduleUploadSchema
 */

public class BuUpdateAgentScheduleUploadSchema  implements Serializable {
  
  private String userId = null;
  private ValueWrapperString workPlanId = null;
  private ListWrapperString workPlanIdsPerWeek = null;
  private List<BuAgentScheduleShift> shifts = new ArrayList<BuAgentScheduleShift>();
  private List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers = new ArrayList<BuFullDayTimeOffMarker>();
  private WfmVersionedEntityMetadata metadata = null;
  private Boolean delete = null;

  
  /**
   * The ID of the user to whom this agent schedule applies
   **/
  public BuUpdateAgentScheduleUploadSchema userId(String userId) {
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
  public BuUpdateAgentScheduleUploadSchema workPlanId(ValueWrapperString workPlanId) {
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
  public BuUpdateAgentScheduleUploadSchema workPlanIdsPerWeek(ListWrapperString workPlanIdsPerWeek) {
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
  public BuUpdateAgentScheduleUploadSchema shifts(List<BuAgentScheduleShift> shifts) {
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
  public BuUpdateAgentScheduleUploadSchema fullDayTimeOffMarkers(List<BuFullDayTimeOffMarker> fullDayTimeOffMarkers) {
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

  
  /**
   * Version metadata for this agent schedule. Required if updating or deleting an existing agent schedule, otherwise should be omitted
   **/
  public BuUpdateAgentScheduleUploadSchema metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for this agent schedule. Required if updating or deleting an existing agent schedule, otherwise should be omitted")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * Whether to delete this agent's schedule. Defaults to false if not set
   **/
  public BuUpdateAgentScheduleUploadSchema delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to delete this agent's schedule. Defaults to false if not set")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuUpdateAgentScheduleUploadSchema buUpdateAgentScheduleUploadSchema = (BuUpdateAgentScheduleUploadSchema) o;
    return Objects.equals(this.userId, buUpdateAgentScheduleUploadSchema.userId) &&
        Objects.equals(this.workPlanId, buUpdateAgentScheduleUploadSchema.workPlanId) &&
        Objects.equals(this.workPlanIdsPerWeek, buUpdateAgentScheduleUploadSchema.workPlanIdsPerWeek) &&
        Objects.equals(this.shifts, buUpdateAgentScheduleUploadSchema.shifts) &&
        Objects.equals(this.fullDayTimeOffMarkers, buUpdateAgentScheduleUploadSchema.fullDayTimeOffMarkers) &&
        Objects.equals(this.metadata, buUpdateAgentScheduleUploadSchema.metadata) &&
        Objects.equals(this.delete, buUpdateAgentScheduleUploadSchema.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, workPlanId, workPlanIdsPerWeek, shifts, fullDayTimeOffMarkers, metadata, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuUpdateAgentScheduleUploadSchema {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    workPlanIdsPerWeek: ").append(toIndentedString(workPlanIdsPerWeek)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkers: ").append(toIndentedString(fullDayTimeOffMarkers)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

