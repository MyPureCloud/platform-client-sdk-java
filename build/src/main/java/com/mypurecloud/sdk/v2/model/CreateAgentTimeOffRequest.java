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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CreateAgentTimeOffRequest
 */

public class CreateAgentTimeOffRequest  implements Serializable {
  
  private String activityCodeId = null;
  private String notes = null;
  private List<String> fullDayManagementUnitDates = null;
  private List<Date> partialDayStartDateTimes = null;
  private Integer dailyDurationMinutes = null;
  private List<Integer> durationMinutes = null;
  private List<Integer> payableMinutes = null;

  public CreateAgentTimeOffRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      fullDayManagementUnitDates = new ArrayList<String>();
      partialDayStartDateTimes = new ArrayList<Date>();
      durationMinutes = new ArrayList<Integer>();
      payableMinutes = new ArrayList<Integer>();
    }
  }

  
  /**
   * The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category
   **/
  public CreateAgentTimeOffRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * Notes about the time off request
   **/
  public CreateAgentTimeOffRequest notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes about the time off request")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   * A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.
   **/
  public CreateAgentTimeOffRequest fullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.")
  @JsonProperty("fullDayManagementUnitDates")
  public List<String> getFullDayManagementUnitDates() {
    return fullDayManagementUnitDates;
  }
  public void setFullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
  }


  /**
   * A set of start date-times in ISO-8601 format for partial day requests.
   **/
  public CreateAgentTimeOffRequest partialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of start date-times in ISO-8601 format for partial day requests.")
  @JsonProperty("partialDayStartDateTimes")
  public List<Date> getPartialDayStartDateTimes() {
    return partialDayStartDateTimes;
  }
  public void setPartialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
  }


  /**
   * The daily duration of this time off request in minutes
   **/
  public CreateAgentTimeOffRequest dailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The daily duration of this time off request in minutes")
  @JsonProperty("dailyDurationMinutes")
  public Integer getDailyDurationMinutes() {
    return dailyDurationMinutes;
  }
  public void setDailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
  }


  /**
   * Daily durations for each day of this time off request in minutes
   **/
  public CreateAgentTimeOffRequest durationMinutes(List<Integer> durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Daily durations for each day of this time off request in minutes")
  @JsonProperty("durationMinutes")
  public List<Integer> getDurationMinutes() {
    return durationMinutes;
  }
  public void setDurationMinutes(List<Integer> durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  /**
   * Payable minutes for each day of this time off request
   **/
  public CreateAgentTimeOffRequest payableMinutes(List<Integer> payableMinutes) {
    this.payableMinutes = payableMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Payable minutes for each day of this time off request")
  @JsonProperty("payableMinutes")
  public List<Integer> getPayableMinutes() {
    return payableMinutes;
  }
  public void setPayableMinutes(List<Integer> payableMinutes) {
    this.payableMinutes = payableMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAgentTimeOffRequest createAgentTimeOffRequest = (CreateAgentTimeOffRequest) o;

    return Objects.equals(this.activityCodeId, createAgentTimeOffRequest.activityCodeId) &&
            Objects.equals(this.notes, createAgentTimeOffRequest.notes) &&
            Objects.equals(this.fullDayManagementUnitDates, createAgentTimeOffRequest.fullDayManagementUnitDates) &&
            Objects.equals(this.partialDayStartDateTimes, createAgentTimeOffRequest.partialDayStartDateTimes) &&
            Objects.equals(this.dailyDurationMinutes, createAgentTimeOffRequest.dailyDurationMinutes) &&
            Objects.equals(this.durationMinutes, createAgentTimeOffRequest.durationMinutes) &&
            Objects.equals(this.payableMinutes, createAgentTimeOffRequest.payableMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, notes, fullDayManagementUnitDates, partialDayStartDateTimes, dailyDurationMinutes, durationMinutes, payableMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAgentTimeOffRequest {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    fullDayManagementUnitDates: ").append(toIndentedString(fullDayManagementUnitDates)).append("\n");
    sb.append("    partialDayStartDateTimes: ").append(toIndentedString(partialDayStartDateTimes)).append("\n");
    sb.append("    dailyDurationMinutes: ").append(toIndentedString(dailyDurationMinutes)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    payableMinutes: ").append(toIndentedString(payableMinutes)).append("\n");
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

