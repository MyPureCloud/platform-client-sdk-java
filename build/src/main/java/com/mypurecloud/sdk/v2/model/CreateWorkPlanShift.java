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
import com.mypurecloud.sdk.v2.model.CreateWorkPlanActivity;
import com.mypurecloud.sdk.v2.model.SetWrapperDayOfWeek;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Shift in a work plan
 */
@ApiModel(description = "Shift in a work plan")

public class CreateWorkPlanShift  implements Serializable {
  
  private String name = null;
  private SetWrapperDayOfWeek days = null;
  private Boolean flexibleStartTime = null;
  private Integer exactStartTimeMinutesFromMidnight = null;
  private Integer earliestStartTimeMinutesFromMidnight = null;
  private Integer latestStartTimeMinutesFromMidnight = null;
  private Boolean constrainStopTime = null;
  private Boolean constrainLatestStopTime = null;
  private Integer latestStopTimeMinutesFromMidnight = null;
  private Boolean constrainEarliestStopTime = null;
  private Integer earliestStopTimeMinutesFromMidnight = null;
  private Integer startIncrementMinutes = null;
  private Boolean flexiblePaidTime = null;
  private Integer exactPaidTimeMinutes = null;
  private Integer minimumPaidTimeMinutes = null;
  private Integer maximumPaidTimeMinutes = null;
  private Boolean constrainContiguousWorkTime = null;
  private Integer minimumContiguousWorkTimeMinutes = null;
  private Integer maximumContiguousWorkTimeMinutes = null;
  private List<CreateWorkPlanActivity> activities = new ArrayList<CreateWorkPlanActivity>();

  
  /**
   * Name of the shift
   **/
  public CreateWorkPlanShift name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the shift")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Days of the week applicable for this shift
   **/
  public CreateWorkPlanShift days(SetWrapperDayOfWeek days) {
    this.days = days;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days of the week applicable for this shift")
  @JsonProperty("days")
  public SetWrapperDayOfWeek getDays() {
    return days;
  }
  public void setDays(SetWrapperDayOfWeek days) {
    this.days = days;
  }

  
  /**
   * Whether the start time of the shift is flexible
   **/
  public CreateWorkPlanShift flexibleStartTime(Boolean flexibleStartTime) {
    this.flexibleStartTime = flexibleStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the start time of the shift is flexible")
  @JsonProperty("flexibleStartTime")
  public Boolean getFlexibleStartTime() {
    return flexibleStartTime;
  }
  public void setFlexibleStartTime(Boolean flexibleStartTime) {
    this.flexibleStartTime = flexibleStartTime;
  }

  
  /**
   * Exact start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == false
   **/
  public CreateWorkPlanShift exactStartTimeMinutesFromMidnight(Integer exactStartTimeMinutesFromMidnight) {
    this.exactStartTimeMinutesFromMidnight = exactStartTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exact start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == false")
  @JsonProperty("exactStartTimeMinutesFromMidnight")
  public Integer getExactStartTimeMinutesFromMidnight() {
    return exactStartTimeMinutesFromMidnight;
  }
  public void setExactStartTimeMinutesFromMidnight(Integer exactStartTimeMinutesFromMidnight) {
    this.exactStartTimeMinutesFromMidnight = exactStartTimeMinutesFromMidnight;
  }

  
  /**
   * Earliest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true
   **/
  public CreateWorkPlanShift earliestStartTimeMinutesFromMidnight(Integer earliestStartTimeMinutesFromMidnight) {
    this.earliestStartTimeMinutesFromMidnight = earliestStartTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Earliest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true")
  @JsonProperty("earliestStartTimeMinutesFromMidnight")
  public Integer getEarliestStartTimeMinutesFromMidnight() {
    return earliestStartTimeMinutesFromMidnight;
  }
  public void setEarliestStartTimeMinutesFromMidnight(Integer earliestStartTimeMinutesFromMidnight) {
    this.earliestStartTimeMinutesFromMidnight = earliestStartTimeMinutesFromMidnight;
  }

  
  /**
   * Latest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true
   **/
  public CreateWorkPlanShift latestStartTimeMinutesFromMidnight(Integer latestStartTimeMinutesFromMidnight) {
    this.latestStartTimeMinutesFromMidnight = latestStartTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true")
  @JsonProperty("latestStartTimeMinutesFromMidnight")
  public Integer getLatestStartTimeMinutesFromMidnight() {
    return latestStartTimeMinutesFromMidnight;
  }
  public void setLatestStartTimeMinutesFromMidnight(Integer latestStartTimeMinutesFromMidnight) {
    this.latestStartTimeMinutesFromMidnight = latestStartTimeMinutesFromMidnight;
  }

  
  /**
   * Whether the latest stop time constraint for the shift is enabled.  Deprecated, use constrainLatestStopTime instead
   **/
  public CreateWorkPlanShift constrainStopTime(Boolean constrainStopTime) {
    this.constrainStopTime = constrainStopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the latest stop time constraint for the shift is enabled.  Deprecated, use constrainLatestStopTime instead")
  @JsonProperty("constrainStopTime")
  public Boolean getConstrainStopTime() {
    return constrainStopTime;
  }
  public void setConstrainStopTime(Boolean constrainStopTime) {
    this.constrainStopTime = constrainStopTime;
  }

  
  /**
   * Whether the latest stop time constraint for the shift is enabled
   **/
  public CreateWorkPlanShift constrainLatestStopTime(Boolean constrainLatestStopTime) {
    this.constrainLatestStopTime = constrainLatestStopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the latest stop time constraint for the shift is enabled")
  @JsonProperty("constrainLatestStopTime")
  public Boolean getConstrainLatestStopTime() {
    return constrainLatestStopTime;
  }
  public void setConstrainLatestStopTime(Boolean constrainLatestStopTime) {
    this.constrainLatestStopTime = constrainLatestStopTime;
  }

  
  /**
   * Latest stop time of the shift defined as offset minutes from midnight. Used if constrainStopTime == true
   **/
  public CreateWorkPlanShift latestStopTimeMinutesFromMidnight(Integer latestStopTimeMinutesFromMidnight) {
    this.latestStopTimeMinutesFromMidnight = latestStopTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latest stop time of the shift defined as offset minutes from midnight. Used if constrainStopTime == true")
  @JsonProperty("latestStopTimeMinutesFromMidnight")
  public Integer getLatestStopTimeMinutesFromMidnight() {
    return latestStopTimeMinutesFromMidnight;
  }
  public void setLatestStopTimeMinutesFromMidnight(Integer latestStopTimeMinutesFromMidnight) {
    this.latestStopTimeMinutesFromMidnight = latestStopTimeMinutesFromMidnight;
  }

  
  /**
   * Whether the earliest stop time constraint for the shift is enabled
   **/
  public CreateWorkPlanShift constrainEarliestStopTime(Boolean constrainEarliestStopTime) {
    this.constrainEarliestStopTime = constrainEarliestStopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the earliest stop time constraint for the shift is enabled")
  @JsonProperty("constrainEarliestStopTime")
  public Boolean getConstrainEarliestStopTime() {
    return constrainEarliestStopTime;
  }
  public void setConstrainEarliestStopTime(Boolean constrainEarliestStopTime) {
    this.constrainEarliestStopTime = constrainEarliestStopTime;
  }

  
  /**
   * This is the earliest time a shift can end
   **/
  public CreateWorkPlanShift earliestStopTimeMinutesFromMidnight(Integer earliestStopTimeMinutesFromMidnight) {
    this.earliestStopTimeMinutesFromMidnight = earliestStopTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the earliest time a shift can end")
  @JsonProperty("earliestStopTimeMinutesFromMidnight")
  public Integer getEarliestStopTimeMinutesFromMidnight() {
    return earliestStopTimeMinutesFromMidnight;
  }
  public void setEarliestStopTimeMinutesFromMidnight(Integer earliestStopTimeMinutesFromMidnight) {
    this.earliestStopTimeMinutesFromMidnight = earliestStopTimeMinutesFromMidnight;
  }

  
  /**
   * Increment in offset minutes that would contribute to different possible start times for the shift. Used if flexibleStartTime == true
   **/
  public CreateWorkPlanShift startIncrementMinutes(Integer startIncrementMinutes) {
    this.startIncrementMinutes = startIncrementMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Increment in offset minutes that would contribute to different possible start times for the shift. Used if flexibleStartTime == true")
  @JsonProperty("startIncrementMinutes")
  public Integer getStartIncrementMinutes() {
    return startIncrementMinutes;
  }
  public void setStartIncrementMinutes(Integer startIncrementMinutes) {
    this.startIncrementMinutes = startIncrementMinutes;
  }

  
  /**
   * Whether the paid time setting for the shift is flexible
   **/
  public CreateWorkPlanShift flexiblePaidTime(Boolean flexiblePaidTime) {
    this.flexiblePaidTime = flexiblePaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the paid time setting for the shift is flexible")
  @JsonProperty("flexiblePaidTime")
  public Boolean getFlexiblePaidTime() {
    return flexiblePaidTime;
  }
  public void setFlexiblePaidTime(Boolean flexiblePaidTime) {
    this.flexiblePaidTime = flexiblePaidTime;
  }

  
  /**
   * Exact paid time in minutes configured for the shift. Used if flexiblePaidTime == false
   **/
  public CreateWorkPlanShift exactPaidTimeMinutes(Integer exactPaidTimeMinutes) {
    this.exactPaidTimeMinutes = exactPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exact paid time in minutes configured for the shift. Used if flexiblePaidTime == false")
  @JsonProperty("exactPaidTimeMinutes")
  public Integer getExactPaidTimeMinutes() {
    return exactPaidTimeMinutes;
  }
  public void setExactPaidTimeMinutes(Integer exactPaidTimeMinutes) {
    this.exactPaidTimeMinutes = exactPaidTimeMinutes;
  }

  
  /**
   * Minimum paid time in minutes configured for the shift. Used if flexiblePaidTime == true
   **/
  public CreateWorkPlanShift minimumPaidTimeMinutes(Integer minimumPaidTimeMinutes) {
    this.minimumPaidTimeMinutes = minimumPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum paid time in minutes configured for the shift. Used if flexiblePaidTime == true")
  @JsonProperty("minimumPaidTimeMinutes")
  public Integer getMinimumPaidTimeMinutes() {
    return minimumPaidTimeMinutes;
  }
  public void setMinimumPaidTimeMinutes(Integer minimumPaidTimeMinutes) {
    this.minimumPaidTimeMinutes = minimumPaidTimeMinutes;
  }

  
  /**
   * Maximum paid time in minutes configured for the shift. Used if flexiblePaidTime == true
   **/
  public CreateWorkPlanShift maximumPaidTimeMinutes(Integer maximumPaidTimeMinutes) {
    this.maximumPaidTimeMinutes = maximumPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum paid time in minutes configured for the shift. Used if flexiblePaidTime == true")
  @JsonProperty("maximumPaidTimeMinutes")
  public Integer getMaximumPaidTimeMinutes() {
    return maximumPaidTimeMinutes;
  }
  public void setMaximumPaidTimeMinutes(Integer maximumPaidTimeMinutes) {
    this.maximumPaidTimeMinutes = maximumPaidTimeMinutes;
  }

  
  /**
   * Whether the contiguous time constraint for the shift is enabled
   **/
  public CreateWorkPlanShift constrainContiguousWorkTime(Boolean constrainContiguousWorkTime) {
    this.constrainContiguousWorkTime = constrainContiguousWorkTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the contiguous time constraint for the shift is enabled")
  @JsonProperty("constrainContiguousWorkTime")
  public Boolean getConstrainContiguousWorkTime() {
    return constrainContiguousWorkTime;
  }
  public void setConstrainContiguousWorkTime(Boolean constrainContiguousWorkTime) {
    this.constrainContiguousWorkTime = constrainContiguousWorkTime;
  }

  
  /**
   * Minimum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true
   **/
  public CreateWorkPlanShift minimumContiguousWorkTimeMinutes(Integer minimumContiguousWorkTimeMinutes) {
    this.minimumContiguousWorkTimeMinutes = minimumContiguousWorkTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true")
  @JsonProperty("minimumContiguousWorkTimeMinutes")
  public Integer getMinimumContiguousWorkTimeMinutes() {
    return minimumContiguousWorkTimeMinutes;
  }
  public void setMinimumContiguousWorkTimeMinutes(Integer minimumContiguousWorkTimeMinutes) {
    this.minimumContiguousWorkTimeMinutes = minimumContiguousWorkTimeMinutes;
  }

  
  /**
   * Maximum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true
   **/
  public CreateWorkPlanShift maximumContiguousWorkTimeMinutes(Integer maximumContiguousWorkTimeMinutes) {
    this.maximumContiguousWorkTimeMinutes = maximumContiguousWorkTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true")
  @JsonProperty("maximumContiguousWorkTimeMinutes")
  public Integer getMaximumContiguousWorkTimeMinutes() {
    return maximumContiguousWorkTimeMinutes;
  }
  public void setMaximumContiguousWorkTimeMinutes(Integer maximumContiguousWorkTimeMinutes) {
    this.maximumContiguousWorkTimeMinutes = maximumContiguousWorkTimeMinutes;
  }

  
  /**
   * Activities configured for this shift
   **/
  public CreateWorkPlanShift activities(List<CreateWorkPlanActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activities configured for this shift")
  @JsonProperty("activities")
  public List<CreateWorkPlanActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<CreateWorkPlanActivity> activities) {
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
    CreateWorkPlanShift createWorkPlanShift = (CreateWorkPlanShift) o;
    return Objects.equals(this.name, createWorkPlanShift.name) &&
        Objects.equals(this.days, createWorkPlanShift.days) &&
        Objects.equals(this.flexibleStartTime, createWorkPlanShift.flexibleStartTime) &&
        Objects.equals(this.exactStartTimeMinutesFromMidnight, createWorkPlanShift.exactStartTimeMinutesFromMidnight) &&
        Objects.equals(this.earliestStartTimeMinutesFromMidnight, createWorkPlanShift.earliestStartTimeMinutesFromMidnight) &&
        Objects.equals(this.latestStartTimeMinutesFromMidnight, createWorkPlanShift.latestStartTimeMinutesFromMidnight) &&
        Objects.equals(this.constrainStopTime, createWorkPlanShift.constrainStopTime) &&
        Objects.equals(this.constrainLatestStopTime, createWorkPlanShift.constrainLatestStopTime) &&
        Objects.equals(this.latestStopTimeMinutesFromMidnight, createWorkPlanShift.latestStopTimeMinutesFromMidnight) &&
        Objects.equals(this.constrainEarliestStopTime, createWorkPlanShift.constrainEarliestStopTime) &&
        Objects.equals(this.earliestStopTimeMinutesFromMidnight, createWorkPlanShift.earliestStopTimeMinutesFromMidnight) &&
        Objects.equals(this.startIncrementMinutes, createWorkPlanShift.startIncrementMinutes) &&
        Objects.equals(this.flexiblePaidTime, createWorkPlanShift.flexiblePaidTime) &&
        Objects.equals(this.exactPaidTimeMinutes, createWorkPlanShift.exactPaidTimeMinutes) &&
        Objects.equals(this.minimumPaidTimeMinutes, createWorkPlanShift.minimumPaidTimeMinutes) &&
        Objects.equals(this.maximumPaidTimeMinutes, createWorkPlanShift.maximumPaidTimeMinutes) &&
        Objects.equals(this.constrainContiguousWorkTime, createWorkPlanShift.constrainContiguousWorkTime) &&
        Objects.equals(this.minimumContiguousWorkTimeMinutes, createWorkPlanShift.minimumContiguousWorkTimeMinutes) &&
        Objects.equals(this.maximumContiguousWorkTimeMinutes, createWorkPlanShift.maximumContiguousWorkTimeMinutes) &&
        Objects.equals(this.activities, createWorkPlanShift.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, days, flexibleStartTime, exactStartTimeMinutesFromMidnight, earliestStartTimeMinutesFromMidnight, latestStartTimeMinutesFromMidnight, constrainStopTime, constrainLatestStopTime, latestStopTimeMinutesFromMidnight, constrainEarliestStopTime, earliestStopTimeMinutesFromMidnight, startIncrementMinutes, flexiblePaidTime, exactPaidTimeMinutes, minimumPaidTimeMinutes, maximumPaidTimeMinutes, constrainContiguousWorkTime, minimumContiguousWorkTimeMinutes, maximumContiguousWorkTimeMinutes, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkPlanShift {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    flexibleStartTime: ").append(toIndentedString(flexibleStartTime)).append("\n");
    sb.append("    exactStartTimeMinutesFromMidnight: ").append(toIndentedString(exactStartTimeMinutesFromMidnight)).append("\n");
    sb.append("    earliestStartTimeMinutesFromMidnight: ").append(toIndentedString(earliestStartTimeMinutesFromMidnight)).append("\n");
    sb.append("    latestStartTimeMinutesFromMidnight: ").append(toIndentedString(latestStartTimeMinutesFromMidnight)).append("\n");
    sb.append("    constrainStopTime: ").append(toIndentedString(constrainStopTime)).append("\n");
    sb.append("    constrainLatestStopTime: ").append(toIndentedString(constrainLatestStopTime)).append("\n");
    sb.append("    latestStopTimeMinutesFromMidnight: ").append(toIndentedString(latestStopTimeMinutesFromMidnight)).append("\n");
    sb.append("    constrainEarliestStopTime: ").append(toIndentedString(constrainEarliestStopTime)).append("\n");
    sb.append("    earliestStopTimeMinutesFromMidnight: ").append(toIndentedString(earliestStopTimeMinutesFromMidnight)).append("\n");
    sb.append("    startIncrementMinutes: ").append(toIndentedString(startIncrementMinutes)).append("\n");
    sb.append("    flexiblePaidTime: ").append(toIndentedString(flexiblePaidTime)).append("\n");
    sb.append("    exactPaidTimeMinutes: ").append(toIndentedString(exactPaidTimeMinutes)).append("\n");
    sb.append("    minimumPaidTimeMinutes: ").append(toIndentedString(minimumPaidTimeMinutes)).append("\n");
    sb.append("    maximumPaidTimeMinutes: ").append(toIndentedString(maximumPaidTimeMinutes)).append("\n");
    sb.append("    constrainContiguousWorkTime: ").append(toIndentedString(constrainContiguousWorkTime)).append("\n");
    sb.append("    minimumContiguousWorkTimeMinutes: ").append(toIndentedString(minimumContiguousWorkTimeMinutes)).append("\n");
    sb.append("    maximumContiguousWorkTimeMinutes: ").append(toIndentedString(maximumContiguousWorkTimeMinutes)).append("\n");
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

