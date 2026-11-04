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
import com.mypurecloud.sdk.v2.model.ActivityCodeReference;
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SelfScheduleOffersActivityMoveTemplate
 */

public class SelfScheduleOffersActivityMoveTemplate  implements Serializable {
  
  private BuScheduleReference schedule = null;
  private String shiftId = null;
  private String referenceKey = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private ActivityCodeReference activityCode = null;
  private List<Date> alternateStartDates = null;

  public SelfScheduleOffersActivityMoveTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      alternateStartDates = new ArrayList<Date>();
    }
  }

  public SelfScheduleOffersActivityMoveTemplate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      alternateStartDates = new ArrayList<Date>();
    }
  }

  
  /**
   * The schedule associated with the shift the agent wants to edit.
   **/
  public SelfScheduleOffersActivityMoveTemplate schedule(BuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule associated with the shift the agent wants to edit.")
  @JsonProperty("schedule")
  public BuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(BuScheduleReference schedule) {
    this.schedule = schedule;
  }


  /**
   * The ID of the shift to which the self-schedule activity move is associated
   **/
  public SelfScheduleOffersActivityMoveTemplate shiftId(String shiftId) {
    this.shiftId = shiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the shift to which the self-schedule activity move is associated")
  @JsonProperty("shiftId")
  public String getShiftId() {
    return shiftId;
  }
  public void setShiftId(String shiftId) {
    this.shiftId = shiftId;
  }


  /**
   * The unique identifier for the offered shift edit that was used for this shift edit
   **/
  public SelfScheduleOffersActivityMoveTemplate referenceKey(String referenceKey) {
    this.referenceKey = referenceKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for the offered shift edit that was used for this shift edit")
  @JsonProperty("referenceKey")
  public String getReferenceKey() {
    return referenceKey;
  }
  public void setReferenceKey(String referenceKey) {
    this.referenceKey = referenceKey;
  }


  /**
   * The start date/time for the shift in ISO-8601 format
   **/
  public SelfScheduleOffersActivityMoveTemplate startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date/time for the shift in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The duration of this shift in minutes
   **/
  public SelfScheduleOffersActivityMoveTemplate lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The duration of this shift in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The activity related to this shift
   **/
  public SelfScheduleOffersActivityMoveTemplate activityCode(ActivityCodeReference activityCode) {
    this.activityCode = activityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity related to this shift")
  @JsonProperty("activityCode")
  public ActivityCodeReference getActivityCode() {
    return activityCode;
  }
  public void setActivityCode(ActivityCodeReference activityCode) {
    this.activityCode = activityCode;
  }


  /**
   * The alternative start dates for this shift
   **/
  public SelfScheduleOffersActivityMoveTemplate alternateStartDates(List<Date> alternateStartDates) {
    this.alternateStartDates = alternateStartDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The alternative start dates for this shift")
  @JsonProperty("alternateStartDates")
  public List<Date> getAlternateStartDates() {
    return alternateStartDates;
  }
  public void setAlternateStartDates(List<Date> alternateStartDates) {
    this.alternateStartDates = alternateStartDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfScheduleOffersActivityMoveTemplate selfScheduleOffersActivityMoveTemplate = (SelfScheduleOffersActivityMoveTemplate) o;

    return Objects.equals(this.schedule, selfScheduleOffersActivityMoveTemplate.schedule) &&
            Objects.equals(this.shiftId, selfScheduleOffersActivityMoveTemplate.shiftId) &&
            Objects.equals(this.referenceKey, selfScheduleOffersActivityMoveTemplate.referenceKey) &&
            Objects.equals(this.startDate, selfScheduleOffersActivityMoveTemplate.startDate) &&
            Objects.equals(this.lengthMinutes, selfScheduleOffersActivityMoveTemplate.lengthMinutes) &&
            Objects.equals(this.activityCode, selfScheduleOffersActivityMoveTemplate.activityCode) &&
            Objects.equals(this.alternateStartDates, selfScheduleOffersActivityMoveTemplate.alternateStartDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, shiftId, referenceKey, startDate, lengthMinutes, activityCode, alternateStartDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleOffersActivityMoveTemplate {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    shiftId: ").append(toIndentedString(shiftId)).append("\n");
    sb.append("    referenceKey: ").append(toIndentedString(referenceKey)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    activityCode: ").append(toIndentedString(activityCode)).append("\n");
    sb.append("    alternateStartDates: ").append(toIndentedString(alternateStartDates)).append("\n");
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

