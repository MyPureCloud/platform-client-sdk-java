package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Schedule Adherence Configuration
 */
@ApiModel(description = "Schedule Adherence Configuration")

public class AdherenceSettings  implements Serializable {
  
  private Integer severeAlertThresholdMinutes = null;
  private Integer adherenceTargetPercent = null;
  private Integer adherenceExceptionThresholdSeconds = null;
  private Boolean nonOnQueueActivitiesEquivalent = null;
  private Boolean trackOnQueueActivity = null;

  /**
   * Gets or Sets ignoredActivityCategories
   */
  public enum IgnoredActivityCategoriesEnum {
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

    private String value;

    IgnoredActivityCategoriesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IgnoredActivityCategoriesEnum fromString(String key) {
      if (key == null) return null;

      for (IgnoredActivityCategoriesEnum value : IgnoredActivityCategoriesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IgnoredActivityCategoriesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<IgnoredActivityCategoriesEnum> ignoredActivityCategories = new ArrayList<IgnoredActivityCategoriesEnum>();

  
  /**
   * The threshold in minutes where an alert will be triggered when an agent is considered severely out of adherence
   **/
  public AdherenceSettings severeAlertThresholdMinutes(Integer severeAlertThresholdMinutes) {
    this.severeAlertThresholdMinutes = severeAlertThresholdMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The threshold in minutes where an alert will be triggered when an agent is considered severely out of adherence")
  @JsonProperty("severeAlertThresholdMinutes")
  public Integer getSevereAlertThresholdMinutes() {
    return severeAlertThresholdMinutes;
  }
  public void setSevereAlertThresholdMinutes(Integer severeAlertThresholdMinutes) {
    this.severeAlertThresholdMinutes = severeAlertThresholdMinutes;
  }

  
  /**
   * Target adherence percentage
   **/
  public AdherenceSettings adherenceTargetPercent(Integer adherenceTargetPercent) {
    this.adherenceTargetPercent = adherenceTargetPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Target adherence percentage")
  @JsonProperty("adherenceTargetPercent")
  public Integer getAdherenceTargetPercent() {
    return adherenceTargetPercent;
  }
  public void setAdherenceTargetPercent(Integer adherenceTargetPercent) {
    this.adherenceTargetPercent = adherenceTargetPercent;
  }

  
  /**
   * The threshold in seconds for which agents should not be penalized for being momentarily out of adherence
   **/
  public AdherenceSettings adherenceExceptionThresholdSeconds(Integer adherenceExceptionThresholdSeconds) {
    this.adherenceExceptionThresholdSeconds = adherenceExceptionThresholdSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The threshold in seconds for which agents should not be penalized for being momentarily out of adherence")
  @JsonProperty("adherenceExceptionThresholdSeconds")
  public Integer getAdherenceExceptionThresholdSeconds() {
    return adherenceExceptionThresholdSeconds;
  }
  public void setAdherenceExceptionThresholdSeconds(Integer adherenceExceptionThresholdSeconds) {
    this.adherenceExceptionThresholdSeconds = adherenceExceptionThresholdSeconds;
  }

  
  /**
   * Whether to treat all non-on-queue activities as equivalent for adherence purposes
   **/
  public AdherenceSettings nonOnQueueActivitiesEquivalent(Boolean nonOnQueueActivitiesEquivalent) {
    this.nonOnQueueActivitiesEquivalent = nonOnQueueActivitiesEquivalent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to treat all non-on-queue activities as equivalent for adherence purposes")
  @JsonProperty("nonOnQueueActivitiesEquivalent")
  public Boolean getNonOnQueueActivitiesEquivalent() {
    return nonOnQueueActivitiesEquivalent;
  }
  public void setNonOnQueueActivitiesEquivalent(Boolean nonOnQueueActivitiesEquivalent) {
    this.nonOnQueueActivitiesEquivalent = nonOnQueueActivitiesEquivalent;
  }

  
  /**
   * Whether to track on-queue activities
   **/
  public AdherenceSettings trackOnQueueActivity(Boolean trackOnQueueActivity) {
    this.trackOnQueueActivity = trackOnQueueActivity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to track on-queue activities")
  @JsonProperty("trackOnQueueActivity")
  public Boolean getTrackOnQueueActivity() {
    return trackOnQueueActivity;
  }
  public void setTrackOnQueueActivity(Boolean trackOnQueueActivity) {
    this.trackOnQueueActivity = trackOnQueueActivity;
  }

  
  /**
   * Activity categories that should be ignored for adherence purposes
   **/
  public AdherenceSettings ignoredActivityCategories(List<IgnoredActivityCategoriesEnum> ignoredActivityCategories) {
    this.ignoredActivityCategories = ignoredActivityCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activity categories that should be ignored for adherence purposes")
  @JsonProperty("ignoredActivityCategories")
  public List<IgnoredActivityCategoriesEnum> getIgnoredActivityCategories() {
    return ignoredActivityCategories;
  }
  public void setIgnoredActivityCategories(List<IgnoredActivityCategoriesEnum> ignoredActivityCategories) {
    this.ignoredActivityCategories = ignoredActivityCategories;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdherenceSettings adherenceSettings = (AdherenceSettings) o;
    return Objects.equals(this.severeAlertThresholdMinutes, adherenceSettings.severeAlertThresholdMinutes) &&
        Objects.equals(this.adherenceTargetPercent, adherenceSettings.adherenceTargetPercent) &&
        Objects.equals(this.adherenceExceptionThresholdSeconds, adherenceSettings.adherenceExceptionThresholdSeconds) &&
        Objects.equals(this.nonOnQueueActivitiesEquivalent, adherenceSettings.nonOnQueueActivitiesEquivalent) &&
        Objects.equals(this.trackOnQueueActivity, adherenceSettings.trackOnQueueActivity) &&
        Objects.equals(this.ignoredActivityCategories, adherenceSettings.ignoredActivityCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severeAlertThresholdMinutes, adherenceTargetPercent, adherenceExceptionThresholdSeconds, nonOnQueueActivitiesEquivalent, trackOnQueueActivity, ignoredActivityCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdherenceSettings {\n");
    
    sb.append("    severeAlertThresholdMinutes: ").append(toIndentedString(severeAlertThresholdMinutes)).append("\n");
    sb.append("    adherenceTargetPercent: ").append(toIndentedString(adherenceTargetPercent)).append("\n");
    sb.append("    adherenceExceptionThresholdSeconds: ").append(toIndentedString(adherenceExceptionThresholdSeconds)).append("\n");
    sb.append("    nonOnQueueActivitiesEquivalent: ").append(toIndentedString(nonOnQueueActivitiesEquivalent)).append("\n");
    sb.append("    trackOnQueueActivity: ").append(toIndentedString(trackOnQueueActivity)).append("\n");
    sb.append("    ignoredActivityCategories: ").append(toIndentedString(ignoredActivityCategories)).append("\n");
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

