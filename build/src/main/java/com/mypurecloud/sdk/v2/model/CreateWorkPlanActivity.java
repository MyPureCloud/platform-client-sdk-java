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

import java.io.Serializable;
/**
 * Activity configured for shift in work plan
 */
@ApiModel(description = "Activity configured for shift in work plan")

public class CreateWorkPlanActivity  implements Serializable {
  
  private String activityCodeId = null;
  private String description = null;
  private Integer lengthMinutes = null;
  private Boolean startTimeIsRelativeToShiftStart = null;
  private Boolean flexibleStartTime = null;
  private Integer earliestStartTimeMinutes = null;
  private Integer latestStartTimeMinutes = null;
  private Integer exactStartTimeMinutes = null;
  private Integer startTimeIncrementMinutes = null;
  private Boolean countsAsPaidTime = null;
  private Boolean countsAsContiguousWorkTime = null;
  private Integer minimumLengthFromShiftStartMinutes = null;
  private Integer minimumLengthFromShiftEndMinutes = null;

  
  /**
   * ID of the activity code associated with this activity
   **/
  public CreateWorkPlanActivity activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the activity code associated with this activity")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * Description of the activity
   **/
  public CreateWorkPlanActivity description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the activity")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Length of the activity in minutes
   **/
  public CreateWorkPlanActivity lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Length of the activity in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }

  
  /**
   * Whether the start time of the activity is relative to the start time of the shift it belongs to
   **/
  public CreateWorkPlanActivity startTimeIsRelativeToShiftStart(Boolean startTimeIsRelativeToShiftStart) {
    this.startTimeIsRelativeToShiftStart = startTimeIsRelativeToShiftStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the start time of the activity is relative to the start time of the shift it belongs to")
  @JsonProperty("startTimeIsRelativeToShiftStart")
  public Boolean getStartTimeIsRelativeToShiftStart() {
    return startTimeIsRelativeToShiftStart;
  }
  public void setStartTimeIsRelativeToShiftStart(Boolean startTimeIsRelativeToShiftStart) {
    this.startTimeIsRelativeToShiftStart = startTimeIsRelativeToShiftStart;
  }

  
  /**
   * Whether the start time of the activity is flexible
   **/
  public CreateWorkPlanActivity flexibleStartTime(Boolean flexibleStartTime) {
    this.flexibleStartTime = flexibleStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the start time of the activity is flexible")
  @JsonProperty("flexibleStartTime")
  public Boolean getFlexibleStartTime() {
    return flexibleStartTime;
  }
  public void setFlexibleStartTime(Boolean flexibleStartTime) {
    this.flexibleStartTime = flexibleStartTime;
  }

  
  /**
   * Earliest activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == true
   **/
  public CreateWorkPlanActivity earliestStartTimeMinutes(Integer earliestStartTimeMinutes) {
    this.earliestStartTimeMinutes = earliestStartTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Earliest activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == true")
  @JsonProperty("earliestStartTimeMinutes")
  public Integer getEarliestStartTimeMinutes() {
    return earliestStartTimeMinutes;
  }
  public void setEarliestStartTimeMinutes(Integer earliestStartTimeMinutes) {
    this.earliestStartTimeMinutes = earliestStartTimeMinutes;
  }

  
  /**
   * Latest activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == true
   **/
  public CreateWorkPlanActivity latestStartTimeMinutes(Integer latestStartTimeMinutes) {
    this.latestStartTimeMinutes = latestStartTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latest activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == true")
  @JsonProperty("latestStartTimeMinutes")
  public Integer getLatestStartTimeMinutes() {
    return latestStartTimeMinutes;
  }
  public void setLatestStartTimeMinutes(Integer latestStartTimeMinutes) {
    this.latestStartTimeMinutes = latestStartTimeMinutes;
  }

  
  /**
   * Exact activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == false
   **/
  public CreateWorkPlanActivity exactStartTimeMinutes(Integer exactStartTimeMinutes) {
    this.exactStartTimeMinutes = exactStartTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exact activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == false")
  @JsonProperty("exactStartTimeMinutes")
  public Integer getExactStartTimeMinutes() {
    return exactStartTimeMinutes;
  }
  public void setExactStartTimeMinutes(Integer exactStartTimeMinutes) {
    this.exactStartTimeMinutes = exactStartTimeMinutes;
  }

  
  /**
   * Increment in offset minutes that would contribute to different possible start times for the activity
   **/
  public CreateWorkPlanActivity startTimeIncrementMinutes(Integer startTimeIncrementMinutes) {
    this.startTimeIncrementMinutes = startTimeIncrementMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Increment in offset minutes that would contribute to different possible start times for the activity")
  @JsonProperty("startTimeIncrementMinutes")
  public Integer getStartTimeIncrementMinutes() {
    return startTimeIncrementMinutes;
  }
  public void setStartTimeIncrementMinutes(Integer startTimeIncrementMinutes) {
    this.startTimeIncrementMinutes = startTimeIncrementMinutes;
  }

  
  /**
   * Whether the activity is paid
   **/
  public CreateWorkPlanActivity countsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the activity is paid")
  @JsonProperty("countsAsPaidTime")
  public Boolean getCountsAsPaidTime() {
    return countsAsPaidTime;
  }
  public void setCountsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
  }

  
  /**
   * Whether the activity duration is counted towards contiguous work time
   **/
  public CreateWorkPlanActivity countsAsContiguousWorkTime(Boolean countsAsContiguousWorkTime) {
    this.countsAsContiguousWorkTime = countsAsContiguousWorkTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the activity duration is counted towards contiguous work time")
  @JsonProperty("countsAsContiguousWorkTime")
  public Boolean getCountsAsContiguousWorkTime() {
    return countsAsContiguousWorkTime;
  }
  public void setCountsAsContiguousWorkTime(Boolean countsAsContiguousWorkTime) {
    this.countsAsContiguousWorkTime = countsAsContiguousWorkTime;
  }

  
  /**
   * The minimum duration between shift start and shift item (e.g., break or meal) start in minutes
   **/
  public CreateWorkPlanActivity minimumLengthFromShiftStartMinutes(Integer minimumLengthFromShiftStartMinutes) {
    this.minimumLengthFromShiftStartMinutes = minimumLengthFromShiftStartMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum duration between shift start and shift item (e.g., break or meal) start in minutes")
  @JsonProperty("minimumLengthFromShiftStartMinutes")
  public Integer getMinimumLengthFromShiftStartMinutes() {
    return minimumLengthFromShiftStartMinutes;
  }
  public void setMinimumLengthFromShiftStartMinutes(Integer minimumLengthFromShiftStartMinutes) {
    this.minimumLengthFromShiftStartMinutes = minimumLengthFromShiftStartMinutes;
  }

  
  /**
   * The minimum duration between shift item (e.g., break or meal) end and shift end in minutes
   **/
  public CreateWorkPlanActivity minimumLengthFromShiftEndMinutes(Integer minimumLengthFromShiftEndMinutes) {
    this.minimumLengthFromShiftEndMinutes = minimumLengthFromShiftEndMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum duration between shift item (e.g., break or meal) end and shift end in minutes")
  @JsonProperty("minimumLengthFromShiftEndMinutes")
  public Integer getMinimumLengthFromShiftEndMinutes() {
    return minimumLengthFromShiftEndMinutes;
  }
  public void setMinimumLengthFromShiftEndMinutes(Integer minimumLengthFromShiftEndMinutes) {
    this.minimumLengthFromShiftEndMinutes = minimumLengthFromShiftEndMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkPlanActivity createWorkPlanActivity = (CreateWorkPlanActivity) o;
    return Objects.equals(this.activityCodeId, createWorkPlanActivity.activityCodeId) &&
        Objects.equals(this.description, createWorkPlanActivity.description) &&
        Objects.equals(this.lengthMinutes, createWorkPlanActivity.lengthMinutes) &&
        Objects.equals(this.startTimeIsRelativeToShiftStart, createWorkPlanActivity.startTimeIsRelativeToShiftStart) &&
        Objects.equals(this.flexibleStartTime, createWorkPlanActivity.flexibleStartTime) &&
        Objects.equals(this.earliestStartTimeMinutes, createWorkPlanActivity.earliestStartTimeMinutes) &&
        Objects.equals(this.latestStartTimeMinutes, createWorkPlanActivity.latestStartTimeMinutes) &&
        Objects.equals(this.exactStartTimeMinutes, createWorkPlanActivity.exactStartTimeMinutes) &&
        Objects.equals(this.startTimeIncrementMinutes, createWorkPlanActivity.startTimeIncrementMinutes) &&
        Objects.equals(this.countsAsPaidTime, createWorkPlanActivity.countsAsPaidTime) &&
        Objects.equals(this.countsAsContiguousWorkTime, createWorkPlanActivity.countsAsContiguousWorkTime) &&
        Objects.equals(this.minimumLengthFromShiftStartMinutes, createWorkPlanActivity.minimumLengthFromShiftStartMinutes) &&
        Objects.equals(this.minimumLengthFromShiftEndMinutes, createWorkPlanActivity.minimumLengthFromShiftEndMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, description, lengthMinutes, startTimeIsRelativeToShiftStart, flexibleStartTime, earliestStartTimeMinutes, latestStartTimeMinutes, exactStartTimeMinutes, startTimeIncrementMinutes, countsAsPaidTime, countsAsContiguousWorkTime, minimumLengthFromShiftStartMinutes, minimumLengthFromShiftEndMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkPlanActivity {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    startTimeIsRelativeToShiftStart: ").append(toIndentedString(startTimeIsRelativeToShiftStart)).append("\n");
    sb.append("    flexibleStartTime: ").append(toIndentedString(flexibleStartTime)).append("\n");
    sb.append("    earliestStartTimeMinutes: ").append(toIndentedString(earliestStartTimeMinutes)).append("\n");
    sb.append("    latestStartTimeMinutes: ").append(toIndentedString(latestStartTimeMinutes)).append("\n");
    sb.append("    exactStartTimeMinutes: ").append(toIndentedString(exactStartTimeMinutes)).append("\n");
    sb.append("    startTimeIncrementMinutes: ").append(toIndentedString(startTimeIncrementMinutes)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    countsAsContiguousWorkTime: ").append(toIndentedString(countsAsContiguousWorkTime)).append("\n");
    sb.append("    minimumLengthFromShiftStartMinutes: ").append(toIndentedString(minimumLengthFromShiftStartMinutes)).append("\n");
    sb.append("    minimumLengthFromShiftEndMinutes: ").append(toIndentedString(minimumLengthFromShiftEndMinutes)).append("\n");
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

