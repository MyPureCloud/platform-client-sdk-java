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
import org.joda.time.LocalDateTime;

import java.io.Serializable;
/**
 * EdgeAutoUpdateConfig
 */

public class EdgeAutoUpdateConfig  implements Serializable {
  
  private String timeZone = null;
  private String rrule = null;
  private LocalDateTime start = null;
  private LocalDateTime end = null;

  
  /**
   * The timezone of the window in which any updates to the edges assigned to the site can be applied. The minimum size of the window is 2 hours.
   **/
  public EdgeAutoUpdateConfig timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timezone of the window in which any updates to the edges assigned to the site can be applied. The minimum size of the window is 2 hours.")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The recurrence rule for updating the Edges assigned to the site. The only supported frequencies are daily and weekly. Weekly frequencies require a day list with at least oneday specified. All other configurations are not supported.
   **/
  public EdgeAutoUpdateConfig rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recurrence rule for updating the Edges assigned to the site. The only supported frequencies are daily and weekly. Weekly frequencies require a day list with at least oneday specified. All other configurations are not supported.")
  @JsonProperty("rrule")
  public String getRrule() {
    return rrule;
  }
  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  
  /**
   * Date time is represented as an ISO-8601 string without a timezone. For example: yyyy-MM-ddTHH:mm:ss.SSS
   **/
  public EdgeAutoUpdateConfig start(LocalDateTime start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date time is represented as an ISO-8601 string without a timezone. For example: yyyy-MM-ddTHH:mm:ss.SSS")
  @JsonProperty("start")
  public LocalDateTime getStart() {
    return start;
  }
  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  
  /**
   * Date time is represented as an ISO-8601 string without a timezone. For example: yyyy-MM-ddTHH:mm:ss.SSS
   **/
  public EdgeAutoUpdateConfig end(LocalDateTime end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date time is represented as an ISO-8601 string without a timezone. For example: yyyy-MM-ddTHH:mm:ss.SSS")
  @JsonProperty("end")
  public LocalDateTime getEnd() {
    return end;
  }
  public void setEnd(LocalDateTime end) {
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
    EdgeAutoUpdateConfig edgeAutoUpdateConfig = (EdgeAutoUpdateConfig) o;
    return Objects.equals(this.timeZone, edgeAutoUpdateConfig.timeZone) &&
        Objects.equals(this.rrule, edgeAutoUpdateConfig.rrule) &&
        Objects.equals(this.start, edgeAutoUpdateConfig.start) &&
        Objects.equals(this.end, edgeAutoUpdateConfig.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZone, rrule, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeAutoUpdateConfig {\n");
    
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
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

