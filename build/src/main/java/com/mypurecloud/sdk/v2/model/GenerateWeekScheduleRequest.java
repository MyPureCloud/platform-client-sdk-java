package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Request to generate a week schedule
 */
@ApiModel(description = "Request to generate a week schedule")

public class GenerateWeekScheduleRequest  implements Serializable {
  
  private String description = null;
  private String shortTermForecastId = null;

  
  /**
   * Description for the generated week schedule
   **/
  public GenerateWeekScheduleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description for the generated week schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * ID of short term forecast used for schedule generation
   **/
  public GenerateWeekScheduleRequest shortTermForecastId(String shortTermForecastId) {
    this.shortTermForecastId = shortTermForecastId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of short term forecast used for schedule generation")
  @JsonProperty("shortTermForecastId")
  public String getShortTermForecastId() {
    return shortTermForecastId;
  }
  public void setShortTermForecastId(String shortTermForecastId) {
    this.shortTermForecastId = shortTermForecastId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateWeekScheduleRequest generateWeekScheduleRequest = (GenerateWeekScheduleRequest) o;
    return Objects.equals(this.description, generateWeekScheduleRequest.description) &&
        Objects.equals(this.shortTermForecastId, generateWeekScheduleRequest.shortTermForecastId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, shortTermForecastId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateWeekScheduleRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortTermForecastId: ").append(toIndentedString(shortTermForecastId)).append("\n");
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

