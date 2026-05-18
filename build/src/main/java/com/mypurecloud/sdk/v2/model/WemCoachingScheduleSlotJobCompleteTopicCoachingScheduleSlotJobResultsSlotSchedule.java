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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule
 */

public class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule  implements Serializable {
  
  private String id = null;
  private String weekDate = null;
  private Long weekCount = null;

  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule weekCount(Long weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekCount")
  public Long getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Long weekCount) {
    this.weekCount = weekCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule = (WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule) o;

    return Objects.equals(this.id, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule.id) &&
            Objects.equals(this.weekDate, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule.weekDate) &&
            Objects.equals(this.weekCount, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule.weekCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, weekCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
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

