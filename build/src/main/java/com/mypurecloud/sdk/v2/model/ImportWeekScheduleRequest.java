package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Information to create a schedule for a week in management unit using imported data
 */
@ApiModel(description = "Information to create a schedule for a week in management unit using imported data")

public class ImportWeekScheduleRequest  implements Serializable {
  
  private String description = null;
  private Map<String, UserSchedule> userSchedules = null;
  private Boolean published = null;
  private String shortTermForecastId = null;
  private List<String> partialUploadIds = new ArrayList<String>();

  
  /**
   * Description for the schedule
   **/
  public ImportWeekScheduleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description for the schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * User schedules
   **/
  public ImportWeekScheduleRequest userSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User schedules")
  @JsonProperty("userSchedules")
  public Map<String, UserSchedule> getUserSchedules() {
    return userSchedules;
  }
  public void setUserSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
  }

  
  /**
   * Whether the schedule is published
   **/
  public ImportWeekScheduleRequest published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the schedule is published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * Short term forecast that should be associated with this schedule
   **/
  public ImportWeekScheduleRequest shortTermForecastId(String shortTermForecastId) {
    this.shortTermForecastId = shortTermForecastId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Short term forecast that should be associated with this schedule")
  @JsonProperty("shortTermForecastId")
  public String getShortTermForecastId() {
    return shortTermForecastId;
  }
  public void setShortTermForecastId(String shortTermForecastId) {
    this.shortTermForecastId = shortTermForecastId;
  }

  
  /**
   * IDs of partial uploads of user schedules to import week schedule. It is applicable only for large schedules where activity count in schedule is greater than 17500
   **/
  public ImportWeekScheduleRequest partialUploadIds(List<String> partialUploadIds) {
    this.partialUploadIds = partialUploadIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of partial uploads of user schedules to import week schedule. It is applicable only for large schedules where activity count in schedule is greater than 17500")
  @JsonProperty("partialUploadIds")
  public List<String> getPartialUploadIds() {
    return partialUploadIds;
  }
  public void setPartialUploadIds(List<String> partialUploadIds) {
    this.partialUploadIds = partialUploadIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportWeekScheduleRequest importWeekScheduleRequest = (ImportWeekScheduleRequest) o;
    return Objects.equals(this.description, importWeekScheduleRequest.description) &&
        Objects.equals(this.userSchedules, importWeekScheduleRequest.userSchedules) &&
        Objects.equals(this.published, importWeekScheduleRequest.published) &&
        Objects.equals(this.shortTermForecastId, importWeekScheduleRequest.shortTermForecastId) &&
        Objects.equals(this.partialUploadIds, importWeekScheduleRequest.partialUploadIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, userSchedules, published, shortTermForecastId, partialUploadIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportWeekScheduleRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    userSchedules: ").append(toIndentedString(userSchedules)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    shortTermForecastId: ").append(toIndentedString(shortTermForecastId)).append("\n");
    sb.append("    partialUploadIds: ").append(toIndentedString(partialUploadIds)).append("\n");
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

