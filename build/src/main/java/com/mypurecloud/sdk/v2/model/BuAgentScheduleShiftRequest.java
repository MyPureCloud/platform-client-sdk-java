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
import com.mypurecloud.sdk.v2.model.BuAgentScheduleActivity;
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import com.mypurecloud.sdk.v2.model.ValueWrapperString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleShiftRequest
 */

public class BuAgentScheduleShiftRequest  implements Serializable {
  
  private String id = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private List<BuAgentScheduleActivity> activities = null;
  private Boolean manuallyEdited = null;
  private BuScheduleReference schedule = null;
  private ValueWrapperString workPlanId = null;
  private ValueWrapperString workPlanShiftId = null;

  public BuAgentScheduleShiftRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activities = new ArrayList<BuAgentScheduleActivity>();
    }
  }

  
  /**
   * The ID of the shift
   **/
  public BuAgentScheduleShiftRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the shift")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @ApiModelProperty(example = "null", value = "The start date of this shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }


  @ApiModelProperty(example = "null", value = "The length of this shift in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }


  /**
   * The activities associated with this shift
   **/
  public BuAgentScheduleShiftRequest activities(List<BuAgentScheduleActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activities associated with this shift")
  @JsonProperty("activities")
  public List<BuAgentScheduleActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<BuAgentScheduleActivity> activities) {
    this.activities = activities;
  }


  /**
   * Whether this shift was manually edited. This is only set by clients and is used for rescheduling
   **/
  public BuAgentScheduleShiftRequest manuallyEdited(Boolean manuallyEdited) {
    this.manuallyEdited = manuallyEdited;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this shift was manually edited. This is only set by clients and is used for rescheduling")
  @JsonProperty("manuallyEdited")
  public Boolean getManuallyEdited() {
    return manuallyEdited;
  }
  public void setManuallyEdited(Boolean manuallyEdited) {
    this.manuallyEdited = manuallyEdited;
  }


  @ApiModelProperty(example = "null", value = "The schedule to which this shift belongs")
  @JsonProperty("schedule")
  public BuScheduleReference getSchedule() {
    return schedule;
  }


  /**
   * The ID of the work plan for which the work plan shift emanates from
   **/
  public BuAgentScheduleShiftRequest workPlanId(ValueWrapperString workPlanId) {
    this.workPlanId = workPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan for which the work plan shift emanates from")
  @JsonProperty("workPlanId")
  public ValueWrapperString getWorkPlanId() {
    return workPlanId;
  }
  public void setWorkPlanId(ValueWrapperString workPlanId) {
    this.workPlanId = workPlanId;
  }


  /**
   * The ID of the work plan shift that was used in schedule generation
   **/
  public BuAgentScheduleShiftRequest workPlanShiftId(ValueWrapperString workPlanShiftId) {
    this.workPlanShiftId = workPlanShiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan shift that was used in schedule generation")
  @JsonProperty("workPlanShiftId")
  public ValueWrapperString getWorkPlanShiftId() {
    return workPlanShiftId;
  }
  public void setWorkPlanShiftId(ValueWrapperString workPlanShiftId) {
    this.workPlanShiftId = workPlanShiftId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentScheduleShiftRequest buAgentScheduleShiftRequest = (BuAgentScheduleShiftRequest) o;

    return Objects.equals(this.id, buAgentScheduleShiftRequest.id) &&
            Objects.equals(this.startDate, buAgentScheduleShiftRequest.startDate) &&
            Objects.equals(this.lengthMinutes, buAgentScheduleShiftRequest.lengthMinutes) &&
            Objects.equals(this.activities, buAgentScheduleShiftRequest.activities) &&
            Objects.equals(this.manuallyEdited, buAgentScheduleShiftRequest.manuallyEdited) &&
            Objects.equals(this.schedule, buAgentScheduleShiftRequest.schedule) &&
            Objects.equals(this.workPlanId, buAgentScheduleShiftRequest.workPlanId) &&
            Objects.equals(this.workPlanShiftId, buAgentScheduleShiftRequest.workPlanShiftId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, lengthMinutes, activities, manuallyEdited, schedule, workPlanId, workPlanShiftId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleShiftRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    manuallyEdited: ").append(toIndentedString(manuallyEdited)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    workPlanShiftId: ").append(toIndentedString(workPlanShiftId)).append("\n");
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

