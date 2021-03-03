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
import com.mypurecloud.sdk.v2.model.BuShortTermForecastReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuGenerateScheduleRequest
 */

public class BuGenerateScheduleRequest  implements Serializable {
  
  private String description = null;
  private BuShortTermForecastReference shortTermForecast = null;
  private Integer weekCount = null;

  
  /**
   * The description for the schedule
   **/
  public BuGenerateScheduleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description for the schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The forecast to use when generating the schedule.  Note that the forecast must fully encompass the schedule's start week + week count
   **/
  public BuGenerateScheduleRequest shortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The forecast to use when generating the schedule.  Note that the forecast must fully encompass the schedule's start week + week count")
  @JsonProperty("shortTermForecast")
  public BuShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }

  
  /**
   * The number of weeks in the schedule. One extra day is added at the end
   **/
  public BuGenerateScheduleRequest weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of weeks in the schedule. One extra day is added at the end")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuGenerateScheduleRequest buGenerateScheduleRequest = (BuGenerateScheduleRequest) o;
    return Objects.equals(this.description, buGenerateScheduleRequest.description) &&
        Objects.equals(this.shortTermForecast, buGenerateScheduleRequest.shortTermForecast) &&
        Objects.equals(this.weekCount, buGenerateScheduleRequest.weekCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, shortTermForecast, weekCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuGenerateScheduleRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
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

