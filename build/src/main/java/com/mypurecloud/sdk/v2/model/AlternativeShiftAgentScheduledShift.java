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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleActivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AlternativeShiftAgentScheduledShift
 */

public class AlternativeShiftAgentScheduledShift  implements Serializable {
  
  private Integer dayIndex = null;
  private String referenceKey = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private List<BuAgentScheduleActivity> activities = new ArrayList<BuAgentScheduleActivity>();

  
  /**
   * The number of days since start of schedule
   **/
  public AlternativeShiftAgentScheduledShift dayIndex(Integer dayIndex) {
    this.dayIndex = dayIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of days since start of schedule")
  @JsonProperty("dayIndex")
  public Integer getDayIndex() {
    return dayIndex;
  }
  public void setDayIndex(Integer dayIndex) {
    this.dayIndex = dayIndex;
  }


  /**
   * A key generated for an offer to help facilitate alternative shift trading
   **/
  public AlternativeShiftAgentScheduledShift referenceKey(String referenceKey) {
    this.referenceKey = referenceKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A key generated for an offer to help facilitate alternative shift trading")
  @JsonProperty("referenceKey")
  public String getReferenceKey() {
    return referenceKey;
  }
  public void setReferenceKey(String referenceKey) {
    this.referenceKey = referenceKey;
  }


  /**
   * The start date of this shift in ISO-8601 format
   **/
  public AlternativeShiftAgentScheduledShift startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date of this shift in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The length of this shift in minutes
   **/
  public AlternativeShiftAgentScheduledShift lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of this shift in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * A list of activities in this shift
   **/
  public AlternativeShiftAgentScheduledShift activities(List<BuAgentScheduleActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of activities in this shift")
  @JsonProperty("activities")
  public List<BuAgentScheduleActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<BuAgentScheduleActivity> activities) {
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
    AlternativeShiftAgentScheduledShift alternativeShiftAgentScheduledShift = (AlternativeShiftAgentScheduledShift) o;

    return Objects.equals(this.dayIndex, alternativeShiftAgentScheduledShift.dayIndex) &&
            Objects.equals(this.referenceKey, alternativeShiftAgentScheduledShift.referenceKey) &&
            Objects.equals(this.startDate, alternativeShiftAgentScheduledShift.startDate) &&
            Objects.equals(this.lengthMinutes, alternativeShiftAgentScheduledShift.lengthMinutes) &&
            Objects.equals(this.activities, alternativeShiftAgentScheduledShift.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayIndex, referenceKey, startDate, lengthMinutes, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftAgentScheduledShift {\n");
    
    sb.append("    dayIndex: ").append(toIndentedString(dayIndex)).append("\n");
    sb.append("    referenceKey: ").append(toIndentedString(referenceKey)).append("\n");
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

