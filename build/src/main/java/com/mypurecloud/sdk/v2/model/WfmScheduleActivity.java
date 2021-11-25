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
import com.mypurecloud.sdk.v2.model.FullDayTimeOffMarker;
import com.mypurecloud.sdk.v2.model.ScheduleActivity;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmScheduleActivity
 */

public class WfmScheduleActivity  implements Serializable {
  
  private UserReference userReference = null;
  private List<ScheduleActivity> activities = new ArrayList<ScheduleActivity>();
  private List<FullDayTimeOffMarker> fullDayTimeOffMarkers = new ArrayList<FullDayTimeOffMarker>();

  
  @ApiModelProperty(example = "null", value = "ID of user that the schedule is for")
  @JsonProperty("userReference")
  public UserReference getUserReference() {
    return userReference;
  }

  
  @ApiModelProperty(example = "null", value = "List of user's scheduled activities")
  @JsonProperty("activities")
  public List<ScheduleActivity> getActivities() {
    return activities;
  }

  
  @ApiModelProperty(example = "null", value = "List of user's days off")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<FullDayTimeOffMarker> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmScheduleActivity wfmScheduleActivity = (WfmScheduleActivity) o;
    return Objects.equals(this.userReference, wfmScheduleActivity.userReference) &&
        Objects.equals(this.activities, wfmScheduleActivity.activities) &&
        Objects.equals(this.fullDayTimeOffMarkers, wfmScheduleActivity.fullDayTimeOffMarkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userReference, activities, fullDayTimeOffMarkers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmScheduleActivity {\n");
    
    sb.append("    userReference: ").append(toIndentedString(userReference)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

