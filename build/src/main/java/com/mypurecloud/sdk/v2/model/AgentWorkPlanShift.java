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
import com.mypurecloud.sdk.v2.model.AgentWorkPlanActivity;
import com.mypurecloud.sdk.v2.model.SetWrapperDayOfWeek;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentWorkPlanShift
 */

public class AgentWorkPlanShift  implements Serializable {
  
  private SetWrapperDayOfWeek days = null;
  private Boolean flexibleStartTime = null;
  private Integer exactStartTimeMinutesFromMidnight = null;
  private Integer earliestStartTimeMinutesFromMidnight = null;
  private Integer latestStartTimeMinutesFromMidnight = null;
  private Integer earliestStopTimeMinutesFromMidnight = null;
  private Boolean constrainLatestStopTime = null;
  private Integer latestStopTimeMinutesFromMidnight = null;
  private Boolean flexiblePaidTime = null;
  private Integer exactPaidTimeMinutes = null;
  private Integer minimumPaidTimeMinutes = null;
  private Integer maximumPaidTimeMinutes = null;
  private List<AgentWorkPlanActivity> activities = null;

  public AgentWorkPlanShift() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activities = new ArrayList<AgentWorkPlanActivity>();
    }
  }

  
  /**
   * Days of the week applicable for this shift
   **/
  public AgentWorkPlanShift days(SetWrapperDayOfWeek days) {
    this.days = days;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Days of the week applicable for this shift")
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
  public AgentWorkPlanShift flexibleStartTime(Boolean flexibleStartTime) {
    this.flexibleStartTime = flexibleStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the start time of the shift is flexible")
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
  public AgentWorkPlanShift exactStartTimeMinutesFromMidnight(Integer exactStartTimeMinutesFromMidnight) {
    this.exactStartTimeMinutesFromMidnight = exactStartTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Exact start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == false")
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
  public AgentWorkPlanShift earliestStartTimeMinutesFromMidnight(Integer earliestStartTimeMinutesFromMidnight) {
    this.earliestStartTimeMinutesFromMidnight = earliestStartTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Earliest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true")
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
  public AgentWorkPlanShift latestStartTimeMinutesFromMidnight(Integer latestStartTimeMinutesFromMidnight) {
    this.latestStartTimeMinutesFromMidnight = latestStartTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Latest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true")
  @JsonProperty("latestStartTimeMinutesFromMidnight")
  public Integer getLatestStartTimeMinutesFromMidnight() {
    return latestStartTimeMinutesFromMidnight;
  }
  public void setLatestStartTimeMinutesFromMidnight(Integer latestStartTimeMinutesFromMidnight) {
    this.latestStartTimeMinutesFromMidnight = latestStartTimeMinutesFromMidnight;
  }


  /**
   * This is the earliest time a shift can end
   **/
  public AgentWorkPlanShift earliestStopTimeMinutesFromMidnight(Integer earliestStopTimeMinutesFromMidnight) {
    this.earliestStopTimeMinutesFromMidnight = earliestStopTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the earliest time a shift can end")
  @JsonProperty("earliestStopTimeMinutesFromMidnight")
  public Integer getEarliestStopTimeMinutesFromMidnight() {
    return earliestStopTimeMinutesFromMidnight;
  }
  public void setEarliestStopTimeMinutesFromMidnight(Integer earliestStopTimeMinutesFromMidnight) {
    this.earliestStopTimeMinutesFromMidnight = earliestStopTimeMinutesFromMidnight;
  }


  /**
   * Whether the latest stop time constraint for the shift is enabled
   **/
  public AgentWorkPlanShift constrainLatestStopTime(Boolean constrainLatestStopTime) {
    this.constrainLatestStopTime = constrainLatestStopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the latest stop time constraint for the shift is enabled")
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
  public AgentWorkPlanShift latestStopTimeMinutesFromMidnight(Integer latestStopTimeMinutesFromMidnight) {
    this.latestStopTimeMinutesFromMidnight = latestStopTimeMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Latest stop time of the shift defined as offset minutes from midnight. Used if constrainStopTime == true")
  @JsonProperty("latestStopTimeMinutesFromMidnight")
  public Integer getLatestStopTimeMinutesFromMidnight() {
    return latestStopTimeMinutesFromMidnight;
  }
  public void setLatestStopTimeMinutesFromMidnight(Integer latestStopTimeMinutesFromMidnight) {
    this.latestStopTimeMinutesFromMidnight = latestStopTimeMinutesFromMidnight;
  }


  /**
   * Whether the paid time setting for the shift is flexible
   **/
  public AgentWorkPlanShift flexiblePaidTime(Boolean flexiblePaidTime) {
    this.flexiblePaidTime = flexiblePaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the paid time setting for the shift is flexible")
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
  public AgentWorkPlanShift exactPaidTimeMinutes(Integer exactPaidTimeMinutes) {
    this.exactPaidTimeMinutes = exactPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Exact paid time in minutes configured for the shift. Used if flexiblePaidTime == false")
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
  public AgentWorkPlanShift minimumPaidTimeMinutes(Integer minimumPaidTimeMinutes) {
    this.minimumPaidTimeMinutes = minimumPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum paid time in minutes configured for the shift. Used if flexiblePaidTime == true")
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
  public AgentWorkPlanShift maximumPaidTimeMinutes(Integer maximumPaidTimeMinutes) {
    this.maximumPaidTimeMinutes = maximumPaidTimeMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum paid time in minutes configured for the shift. Used if flexiblePaidTime == true")
  @JsonProperty("maximumPaidTimeMinutes")
  public Integer getMaximumPaidTimeMinutes() {
    return maximumPaidTimeMinutes;
  }
  public void setMaximumPaidTimeMinutes(Integer maximumPaidTimeMinutes) {
    this.maximumPaidTimeMinutes = maximumPaidTimeMinutes;
  }


  /**
   * Activities configured for this shift
   **/
  public AgentWorkPlanShift activities(List<AgentWorkPlanActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Activities configured for this shift")
  @JsonProperty("activities")
  public List<AgentWorkPlanActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<AgentWorkPlanActivity> activities) {
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
    AgentWorkPlanShift agentWorkPlanShift = (AgentWorkPlanShift) o;

    return Objects.equals(this.days, agentWorkPlanShift.days) &&
            Objects.equals(this.flexibleStartTime, agentWorkPlanShift.flexibleStartTime) &&
            Objects.equals(this.exactStartTimeMinutesFromMidnight, agentWorkPlanShift.exactStartTimeMinutesFromMidnight) &&
            Objects.equals(this.earliestStartTimeMinutesFromMidnight, agentWorkPlanShift.earliestStartTimeMinutesFromMidnight) &&
            Objects.equals(this.latestStartTimeMinutesFromMidnight, agentWorkPlanShift.latestStartTimeMinutesFromMidnight) &&
            Objects.equals(this.earliestStopTimeMinutesFromMidnight, agentWorkPlanShift.earliestStopTimeMinutesFromMidnight) &&
            Objects.equals(this.constrainLatestStopTime, agentWorkPlanShift.constrainLatestStopTime) &&
            Objects.equals(this.latestStopTimeMinutesFromMidnight, agentWorkPlanShift.latestStopTimeMinutesFromMidnight) &&
            Objects.equals(this.flexiblePaidTime, agentWorkPlanShift.flexiblePaidTime) &&
            Objects.equals(this.exactPaidTimeMinutes, agentWorkPlanShift.exactPaidTimeMinutes) &&
            Objects.equals(this.minimumPaidTimeMinutes, agentWorkPlanShift.minimumPaidTimeMinutes) &&
            Objects.equals(this.maximumPaidTimeMinutes, agentWorkPlanShift.maximumPaidTimeMinutes) &&
            Objects.equals(this.activities, agentWorkPlanShift.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, flexibleStartTime, exactStartTimeMinutesFromMidnight, earliestStartTimeMinutesFromMidnight, latestStartTimeMinutesFromMidnight, earliestStopTimeMinutesFromMidnight, constrainLatestStopTime, latestStopTimeMinutesFromMidnight, flexiblePaidTime, exactPaidTimeMinutes, minimumPaidTimeMinutes, maximumPaidTimeMinutes, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWorkPlanShift {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    flexibleStartTime: ").append(toIndentedString(flexibleStartTime)).append("\n");
    sb.append("    exactStartTimeMinutesFromMidnight: ").append(toIndentedString(exactStartTimeMinutesFromMidnight)).append("\n");
    sb.append("    earliestStartTimeMinutesFromMidnight: ").append(toIndentedString(earliestStartTimeMinutesFromMidnight)).append("\n");
    sb.append("    latestStartTimeMinutesFromMidnight: ").append(toIndentedString(latestStartTimeMinutesFromMidnight)).append("\n");
    sb.append("    earliestStopTimeMinutesFromMidnight: ").append(toIndentedString(earliestStopTimeMinutesFromMidnight)).append("\n");
    sb.append("    constrainLatestStopTime: ").append(toIndentedString(constrainLatestStopTime)).append("\n");
    sb.append("    latestStopTimeMinutesFromMidnight: ").append(toIndentedString(latestStopTimeMinutesFromMidnight)).append("\n");
    sb.append("    flexiblePaidTime: ").append(toIndentedString(flexiblePaidTime)).append("\n");
    sb.append("    exactPaidTimeMinutes: ").append(toIndentedString(exactPaidTimeMinutes)).append("\n");
    sb.append("    minimumPaidTimeMinutes: ").append(toIndentedString(minimumPaidTimeMinutes)).append("\n");
    sb.append("    maximumPaidTimeMinutes: ").append(toIndentedString(maximumPaidTimeMinutes)).append("\n");
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

