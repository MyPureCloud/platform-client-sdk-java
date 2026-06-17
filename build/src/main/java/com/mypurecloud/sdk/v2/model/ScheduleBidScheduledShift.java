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
import com.mypurecloud.sdk.v2.model.ScheduleBidScheduledActivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ScheduleBidScheduledShift
 */

public class ScheduleBidScheduledShift  implements Serializable {
  
  private String workPlanShiftId = null;
  private String workPlanId = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private List<ScheduleBidScheduledActivity> activities = null;

  public ScheduleBidScheduledShift() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activities = new ArrayList<ScheduleBidScheduledActivity>();
    }
  }

  public ScheduleBidScheduledShift(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      activities = new ArrayList<ScheduleBidScheduledActivity>();
    }
  }

  
  /**
   * The ID of the work plan shift that was used in schedule generation
   **/
  public ScheduleBidScheduledShift workPlanShiftId(String workPlanShiftId) {
    this.workPlanShiftId = workPlanShiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan shift that was used in schedule generation")
  @JsonProperty("workPlanShiftId")
  public String getWorkPlanShiftId() {
    return workPlanShiftId;
  }
  public void setWorkPlanShiftId(String workPlanShiftId) {
    this.workPlanShiftId = workPlanShiftId;
  }


  /**
   * The ID of the work plan from which the shift comes
   **/
  public ScheduleBidScheduledShift workPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan from which the shift comes")
  @JsonProperty("workPlanId")
  public String getWorkPlanId() {
    return workPlanId;
  }
  public void setWorkPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
  }


  /**
   * The start date of the scheduled shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ScheduleBidScheduledShift startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date of the scheduled shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The length of the shift in minutes
   **/
  public ScheduleBidScheduledShift lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the shift in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The activities associated with this shift
   **/
  public ScheduleBidScheduledShift activities(List<ScheduleBidScheduledActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activities associated with this shift")
  @JsonProperty("activities")
  public List<ScheduleBidScheduledActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<ScheduleBidScheduledActivity> activities) {
    this.activities = activities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBidScheduledShift scheduleBidScheduledShift = (ScheduleBidScheduledShift) o;

    return Objects.equals(this.workPlanShiftId, scheduleBidScheduledShift.workPlanShiftId) &&
            Objects.equals(this.workPlanId, scheduleBidScheduledShift.workPlanId) &&
            Objects.equals(this.startDate, scheduleBidScheduledShift.startDate) &&
            Objects.equals(this.lengthMinutes, scheduleBidScheduledShift.lengthMinutes) &&
            Objects.equals(this.activities, scheduleBidScheduledShift.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlanShiftId, workPlanId, startDate, lengthMinutes, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidScheduledShift {\n");
    
    sb.append("    workPlanShiftId: ").append(toIndentedString(workPlanShiftId)).append("\n");
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

