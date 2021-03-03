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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Represents a single activity in a user&#39;s shift
 */
@ApiModel(description = "Represents a single activity in a user's shift")

public class UserScheduleActivity  implements Serializable {
  
  private String activityCodeId = null;
  private Date startDate = null;
  private Integer lengthInMinutes = null;
  private String description = null;
  private Boolean countsAsPaidTime = null;
  private Boolean isDstFallback = null;
  private String timeOffRequestId = null;

  
  /**
   * The id for the activity code.  Look up a map of activity codes with the activities route
   **/
  public UserScheduleActivity activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id for the activity code.  Look up a map of activity codes with the activities route")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * Start time in UTC for this activity, in ISO-8601 format
   **/
  public UserScheduleActivity startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start time in UTC for this activity, in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Length in minutes for this activity
   **/
  public UserScheduleActivity lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Length in minutes for this activity")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  
  /**
   * Description for this activity
   **/
  public UserScheduleActivity description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description for this activity")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Whether this activity is paid
   **/
  public UserScheduleActivity countsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity is paid")
  @JsonProperty("countsAsPaidTime")
  public Boolean getCountsAsPaidTime() {
    return countsAsPaidTime;
  }
  public void setCountsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
  }

  
  /**
   * Whether this activity spans a DST fallback
   **/
  public UserScheduleActivity isDstFallback(Boolean isDstFallback) {
    this.isDstFallback = isDstFallback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity spans a DST fallback")
  @JsonProperty("isDstFallback")
  public Boolean getIsDstFallback() {
    return isDstFallback;
  }
  public void setIsDstFallback(Boolean isDstFallback) {
    this.isDstFallback = isDstFallback;
  }

  
  /**
   * Time off request id of this activity
   **/
  public UserScheduleActivity timeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time off request id of this activity")
  @JsonProperty("timeOffRequestId")
  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }
  public void setTimeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserScheduleActivity userScheduleActivity = (UserScheduleActivity) o;
    return Objects.equals(this.activityCodeId, userScheduleActivity.activityCodeId) &&
        Objects.equals(this.startDate, userScheduleActivity.startDate) &&
        Objects.equals(this.lengthInMinutes, userScheduleActivity.lengthInMinutes) &&
        Objects.equals(this.description, userScheduleActivity.description) &&
        Objects.equals(this.countsAsPaidTime, userScheduleActivity.countsAsPaidTime) &&
        Objects.equals(this.isDstFallback, userScheduleActivity.isDstFallback) &&
        Objects.equals(this.timeOffRequestId, userScheduleActivity.timeOffRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, startDate, lengthInMinutes, description, countsAsPaidTime, isDstFallback, timeOffRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScheduleActivity {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    isDstFallback: ").append(toIndentedString(isDstFallback)).append("\n");
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
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

