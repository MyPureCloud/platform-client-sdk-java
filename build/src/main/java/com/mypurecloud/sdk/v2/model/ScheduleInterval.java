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
 * ScheduleInterval
 */

public class ScheduleInterval  implements Serializable {
  
  private String start = null;
  private String end = null;

  
  /**
   * The scheduled start time as an ISO-8601 string, i.e yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ScheduleInterval start(String start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The scheduled start time as an ISO-8601 string, i.e yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("start")
  public String getStart() {
    return start;
  }
  public void setStart(String start) {
    this.start = start;
  }

  
  /**
   * The scheduled end time as an ISO-8601 string, i.e. yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ScheduleInterval end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The scheduled end time as an ISO-8601 string, i.e. yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleInterval scheduleInterval = (ScheduleInterval) o;
    return Objects.equals(this.start, scheduleInterval.start) &&
        Objects.equals(this.end, scheduleInterval.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleInterval {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

