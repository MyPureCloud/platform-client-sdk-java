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
import com.mypurecloud.sdk.v2.model.LearningSlotFullDayTimeOffMarker;
import com.mypurecloud.sdk.v2.model.LearningSlotScheduleActivity;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningSlotWfmScheduleActivity
 */

public class LearningSlotWfmScheduleActivity  implements Serializable {
  
  private UserReference user = null;
  private List<LearningSlotScheduleActivity> activities = null;
  private List<LearningSlotFullDayTimeOffMarker> fullDayTimeOffMarkers = null;

  public LearningSlotWfmScheduleActivity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activities = new ArrayList<LearningSlotScheduleActivity>();
      fullDayTimeOffMarkers = new ArrayList<LearningSlotFullDayTimeOffMarker>();
    }
  }

  
  /**
   * User that the schedule is for
   **/
  public LearningSlotWfmScheduleActivity user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that the schedule is for")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * List of user's scheduled activities
   **/
  public LearningSlotWfmScheduleActivity activities(List<LearningSlotScheduleActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of user's scheduled activities")
  @JsonProperty("activities")
  public List<LearningSlotScheduleActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<LearningSlotScheduleActivity> activities) {
    this.activities = activities;
  }


  /**
   * List of user's days off
   **/
  public LearningSlotWfmScheduleActivity fullDayTimeOffMarkers(List<LearningSlotFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of user's days off")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<LearningSlotFullDayTimeOffMarker> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }
  public void setFullDayTimeOffMarkers(List<LearningSlotFullDayTimeOffMarker> fullDayTimeOffMarkers) {
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
    LearningSlotWfmScheduleActivity learningSlotWfmScheduleActivity = (LearningSlotWfmScheduleActivity) o;

    return Objects.equals(this.user, learningSlotWfmScheduleActivity.user) &&
            Objects.equals(this.activities, learningSlotWfmScheduleActivity.activities) &&
            Objects.equals(this.fullDayTimeOffMarkers, learningSlotWfmScheduleActivity.fullDayTimeOffMarkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, activities, fullDayTimeOffMarkers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningSlotWfmScheduleActivity {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

