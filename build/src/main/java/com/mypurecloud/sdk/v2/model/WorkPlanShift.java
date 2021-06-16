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
import com.mypurecloud.sdk.v2.model.SetWrapperDayOfWeek;
import com.mypurecloud.sdk.v2.model.WorkPlanActivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Shift in a work plan
 */
@ApiModel(description = "Shift in a work plan")

public class WorkPlanShift  implements Serializable {
  
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
  private List<WorkPlanActivity> activities = new ArrayList<WorkPlanActivity>();
  private String id = null;
  private Boolean delete = null;
  private String validationId = null;

  
  /**
   * Name of the shift
   **/
  public WorkPlanShift name(String name) {
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
  public WorkPlanShift days(SetWrapperDayOfWeek days) {
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
  public WorkPlanShift flexibleStartTime(Boolean flexibleStartTime) {
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
  public WorkPlanShift exactStartTimeMinutesFromMidnight(Integer exactStartTimeMinutesFromMidnight) {
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
  public WorkPlanShift earliestStartTimeMinutesFromMidnight(Integer earliestStartTimeMinutesFromMidnight) {
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
  public WorkPlanShift latestStartTimeMinutesFromMidnight(Integer latestStartTimeMinutesFromMidnight) {
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
  public WorkPlanShift constrainStopTime(Boolean constrainStopTime) {
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
  public WorkPlanShift constrainLatestStopTime(Boolean constrainLatestStopTime) {
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
  public WorkPlanShift latestStopTimeMinutesFromMidnight(Integer latestStopTimeMinutesFromMidnight) {
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
  public WorkPlanShift constrainEarliestStopTime(Boolean constrainEarliestStopTime) {
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
  public WorkPlanShift earliestStopTimeMinutesFromMidnight(Integer earliestStopTimeMinutesFromMidnight) {
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
  public WorkPlanShift startIncrementMinutes(Integer startIncrementMinutes) {
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
  public WorkPlanShift flexiblePaidTime(Boolean flexiblePaidTime) {
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
  public WorkPlanShift exactPaidTimeMinutes(Integer exactPaidTimeMinutes) {
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
  public WorkPlanShift minimumPaidTimeMinutes(Integer minimumPaidTimeMinutes) {
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
  public WorkPlanShift maximumPaidTimeMinutes(Integer maximumPaidTimeMinutes) {
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
  public WorkPlanShift constrainContiguousWorkTime(Boolean constrainContiguousWorkTime) {
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
  public WorkPlanShift minimumContiguousWorkTimeMinutes(Integer minimumContiguousWorkTimeMinutes) {
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
  public WorkPlanShift maximumContiguousWorkTimeMinutes(Integer maximumContiguousWorkTimeMinutes) {
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
  public WorkPlanShift activities(List<WorkPlanActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activities configured for this shift")
  @JsonProperty("activities")
  public List<WorkPlanActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<WorkPlanActivity> activities) {
    this.activities = activities;
  }

  
  /**
   * ID of the shift. This is required only for the case of updating an existing shift
   **/
  public WorkPlanShift id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the shift. This is required only for the case of updating an existing shift")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * If marked true for updating an existing shift, the shift will be permanently deleted
   **/
  public WorkPlanShift delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If marked true for updating an existing shift, the shift will be permanently deleted")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  
  /**
   * ID of shift in the context of work plan validation
   **/
  public WorkPlanShift validationId(String validationId) {
    this.validationId = validationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of shift in the context of work plan validation")
  @JsonProperty("validationId")
  public String getValidationId() {
    return validationId;
  }
  public void setValidationId(String validationId) {
    this.validationId = validationId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanShift workPlanShift = (WorkPlanShift) o;
    return Objects.equals(this.name, workPlanShift.name) &&
        Objects.equals(this.days, workPlanShift.days) &&
        Objects.equals(this.flexibleStartTime, workPlanShift.flexibleStartTime) &&
        Objects.equals(this.exactStartTimeMinutesFromMidnight, workPlanShift.exactStartTimeMinutesFromMidnight) &&
        Objects.equals(this.earliestStartTimeMinutesFromMidnight, workPlanShift.earliestStartTimeMinutesFromMidnight) &&
        Objects.equals(this.latestStartTimeMinutesFromMidnight, workPlanShift.latestStartTimeMinutesFromMidnight) &&
        Objects.equals(this.constrainStopTime, workPlanShift.constrainStopTime) &&
        Objects.equals(this.constrainLatestStopTime, workPlanShift.constrainLatestStopTime) &&
        Objects.equals(this.latestStopTimeMinutesFromMidnight, workPlanShift.latestStopTimeMinutesFromMidnight) &&
        Objects.equals(this.constrainEarliestStopTime, workPlanShift.constrainEarliestStopTime) &&
        Objects.equals(this.earliestStopTimeMinutesFromMidnight, workPlanShift.earliestStopTimeMinutesFromMidnight) &&
        Objects.equals(this.startIncrementMinutes, workPlanShift.startIncrementMinutes) &&
        Objects.equals(this.flexiblePaidTime, workPlanShift.flexiblePaidTime) &&
        Objects.equals(this.exactPaidTimeMinutes, workPlanShift.exactPaidTimeMinutes) &&
        Objects.equals(this.minimumPaidTimeMinutes, workPlanShift.minimumPaidTimeMinutes) &&
        Objects.equals(this.maximumPaidTimeMinutes, workPlanShift.maximumPaidTimeMinutes) &&
        Objects.equals(this.constrainContiguousWorkTime, workPlanShift.constrainContiguousWorkTime) &&
        Objects.equals(this.minimumContiguousWorkTimeMinutes, workPlanShift.minimumContiguousWorkTimeMinutes) &&
        Objects.equals(this.maximumContiguousWorkTimeMinutes, workPlanShift.maximumContiguousWorkTimeMinutes) &&
        Objects.equals(this.activities, workPlanShift.activities) &&
        Objects.equals(this.id, workPlanShift.id) &&
        Objects.equals(this.delete, workPlanShift.delete) &&
        Objects.equals(this.validationId, workPlanShift.validationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, days, flexibleStartTime, exactStartTimeMinutesFromMidnight, earliestStartTimeMinutesFromMidnight, latestStartTimeMinutesFromMidnight, constrainStopTime, constrainLatestStopTime, latestStopTimeMinutesFromMidnight, constrainEarliestStopTime, earliestStopTimeMinutesFromMidnight, startIncrementMinutes, flexiblePaidTime, exactPaidTimeMinutes, minimumPaidTimeMinutes, maximumPaidTimeMinutes, constrainContiguousWorkTime, minimumContiguousWorkTimeMinutes, maximumContiguousWorkTimeMinutes, activities, id, delete, validationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanShift {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    validationId: ").append(toIndentedString(validationId)).append("\n");
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

