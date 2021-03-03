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
import com.mypurecloud.sdk.v2.model.UserSchedule;
import com.mypurecloud.sdk.v2.model.WeekScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Container object to hold a map of user schedules
 */
@ApiModel(description = "Container object to hold a map of user schedules")

public class UserScheduleContainer  implements Serializable {
  
  private String managementUnitTimeZone = null;
  private List<WeekScheduleReference> publishedSchedules = new ArrayList<WeekScheduleReference>();
  private Map<String, UserSchedule> userSchedules = null;

  
  /**
   * The reference time zone used for the management unit
   **/
  public UserScheduleContainer managementUnitTimeZone(String managementUnitTimeZone) {
    this.managementUnitTimeZone = managementUnitTimeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference time zone used for the management unit")
  @JsonProperty("managementUnitTimeZone")
  public String getManagementUnitTimeZone() {
    return managementUnitTimeZone;
  }
  public void setManagementUnitTimeZone(String managementUnitTimeZone) {
    this.managementUnitTimeZone = managementUnitTimeZone;
  }

  
  /**
   * References to all published week schedules overlapping the start/end date query parameters
   **/
  public UserScheduleContainer publishedSchedules(List<WeekScheduleReference> publishedSchedules) {
    this.publishedSchedules = publishedSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "References to all published week schedules overlapping the start/end date query parameters")
  @JsonProperty("publishedSchedules")
  public List<WeekScheduleReference> getPublishedSchedules() {
    return publishedSchedules;
  }
  public void setPublishedSchedules(List<WeekScheduleReference> publishedSchedules) {
    this.publishedSchedules = publishedSchedules;
  }

  
  /**
   * Map of user id to user schedule
   **/
  public UserScheduleContainer userSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of user id to user schedule")
  @JsonProperty("userSchedules")
  public Map<String, UserSchedule> getUserSchedules() {
    return userSchedules;
  }
  public void setUserSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserScheduleContainer userScheduleContainer = (UserScheduleContainer) o;
    return Objects.equals(this.managementUnitTimeZone, userScheduleContainer.managementUnitTimeZone) &&
        Objects.equals(this.publishedSchedules, userScheduleContainer.publishedSchedules) &&
        Objects.equals(this.userSchedules, userScheduleContainer.userSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitTimeZone, publishedSchedules, userSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScheduleContainer {\n");
    
    sb.append("    managementUnitTimeZone: ").append(toIndentedString(managementUnitTimeZone)).append("\n");
    sb.append("    publishedSchedules: ").append(toIndentedString(publishedSchedules)).append("\n");
    sb.append("    userSchedules: ").append(toIndentedString(userSchedules)).append("\n");
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

