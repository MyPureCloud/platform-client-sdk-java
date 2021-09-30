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
import com.mypurecloud.sdk.v2.model.UserScheduleActivity;
import com.mypurecloud.sdk.v2.model.WeekScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Single shift in a user&#39;s schedule
 */
@ApiModel(description = "Single shift in a user's schedule")

public class UserScheduleShift  implements Serializable {
  
  private WeekScheduleReference weekSchedule = null;
  private String id = null;
  private Date startDate = null;
  private Integer lengthInMinutes = null;
  private List<UserScheduleActivity> activities = new ArrayList<UserScheduleActivity>();
  private Boolean delete = null;
  private Boolean manuallyEdited = null;

  
  @ApiModelProperty(example = "null", value = "The schedule to which this shift belongs")
  @JsonProperty("weekSchedule")
  public WeekScheduleReference getWeekSchedule() {
    return weekSchedule;
  }

  
  /**
   * ID of the schedule shift. This is only for the case of updating and deleting an existing shift
   **/
  public UserScheduleShift id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the schedule shift. This is only for the case of updating and deleting an existing shift")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  @ApiModelProperty(example = "null", value = "Start time in UTC for this shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  
  @ApiModelProperty(example = "null", value = "Length of this shift in minutes")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }

  
  /**
   * List of activities in this shift
   **/
  public UserScheduleShift activities(List<UserScheduleActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of activities in this shift")
  @JsonProperty("activities")
  public List<UserScheduleActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<UserScheduleActivity> activities) {
    this.activities = activities;
  }

  
  /**
   * If marked true for updating this schedule shift, it will be deleted
   **/
  public UserScheduleShift delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If marked true for updating this schedule shift, it will be deleted")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  
  /**
   * Whether the shift was set as manually edited
   **/
  public UserScheduleShift manuallyEdited(Boolean manuallyEdited) {
    this.manuallyEdited = manuallyEdited;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the shift was set as manually edited")
  @JsonProperty("manuallyEdited")
  public Boolean getManuallyEdited() {
    return manuallyEdited;
  }
  public void setManuallyEdited(Boolean manuallyEdited) {
    this.manuallyEdited = manuallyEdited;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserScheduleShift userScheduleShift = (UserScheduleShift) o;
    return Objects.equals(this.weekSchedule, userScheduleShift.weekSchedule) &&
        Objects.equals(this.id, userScheduleShift.id) &&
        Objects.equals(this.startDate, userScheduleShift.startDate) &&
        Objects.equals(this.lengthInMinutes, userScheduleShift.lengthInMinutes) &&
        Objects.equals(this.activities, userScheduleShift.activities) &&
        Objects.equals(this.delete, userScheduleShift.delete) &&
        Objects.equals(this.manuallyEdited, userScheduleShift.manuallyEdited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekSchedule, id, startDate, lengthInMinutes, activities, delete, manuallyEdited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScheduleShift {\n");
    
    sb.append("    weekSchedule: ").append(toIndentedString(weekSchedule)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    manuallyEdited: ").append(toIndentedString(manuallyEdited)).append("\n");
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

