package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Create a new short term forecast by copying an existing forecast
 */
@ApiModel(description = "Create a new short term forecast by copying an existing forecast")

public class CopyShortTermForecastRequest  implements Serializable {
  
  private String weekDate = null;
  private String description = null;

  
  /**
   * The first day of the short term forecast in yyyy-MM-dd format.  Must be the management unit's start day of week
   **/
  public CopyShortTermForecastRequest weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The first day of the short term forecast in yyyy-MM-dd format.  Must be the management unit's start day of week")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * Description for the new forecast
   **/
  public CopyShortTermForecastRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description for the new forecast")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyShortTermForecastRequest copyShortTermForecastRequest = (CopyShortTermForecastRequest) o;
    return Objects.equals(this.weekDate, copyShortTermForecastRequest.weekDate) &&
        Objects.equals(this.description, copyShortTermForecastRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyShortTermForecastRequest {\n");
    
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

