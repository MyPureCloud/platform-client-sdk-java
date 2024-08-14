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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AvailabilityRange
 */

public class AvailabilityRange  implements Serializable {
  
  private Integer earliestStartMinutesFromMidnight = null;
  private Integer latestEndMinutesFromMidnight = null;

  
  /**
   * The earliest time of day the activity can be scheduled to begin, in minutes from midnight in the configured time zone of the business unit
   **/
  public AvailabilityRange earliestStartMinutesFromMidnight(Integer earliestStartMinutesFromMidnight) {
    this.earliestStartMinutesFromMidnight = earliestStartMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The earliest time of day the activity can be scheduled to begin, in minutes from midnight in the configured time zone of the business unit")
  @JsonProperty("earliestStartMinutesFromMidnight")
  public Integer getEarliestStartMinutesFromMidnight() {
    return earliestStartMinutesFromMidnight;
  }
  public void setEarliestStartMinutesFromMidnight(Integer earliestStartMinutesFromMidnight) {
    this.earliestStartMinutesFromMidnight = earliestStartMinutesFromMidnight;
  }


  /**
   * The latest time of day the activity can be scheduled to end, in minutes from midnight in the configured time zone of the business unit
   **/
  public AvailabilityRange latestEndMinutesFromMidnight(Integer latestEndMinutesFromMidnight) {
    this.latestEndMinutesFromMidnight = latestEndMinutesFromMidnight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The latest time of day the activity can be scheduled to end, in minutes from midnight in the configured time zone of the business unit")
  @JsonProperty("latestEndMinutesFromMidnight")
  public Integer getLatestEndMinutesFromMidnight() {
    return latestEndMinutesFromMidnight;
  }
  public void setLatestEndMinutesFromMidnight(Integer latestEndMinutesFromMidnight) {
    this.latestEndMinutesFromMidnight = latestEndMinutesFromMidnight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityRange availabilityRange = (AvailabilityRange) o;

    return Objects.equals(this.earliestStartMinutesFromMidnight, availabilityRange.earliestStartMinutesFromMidnight) &&
            Objects.equals(this.latestEndMinutesFromMidnight, availabilityRange.latestEndMinutesFromMidnight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestStartMinutesFromMidnight, latestEndMinutesFromMidnight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityRange {\n");
    
    sb.append("    earliestStartMinutesFromMidnight: ").append(toIndentedString(earliestStartMinutesFromMidnight)).append("\n");
    sb.append("    latestEndMinutesFromMidnight: ").append(toIndentedString(latestEndMinutesFromMidnight)).append("\n");
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

