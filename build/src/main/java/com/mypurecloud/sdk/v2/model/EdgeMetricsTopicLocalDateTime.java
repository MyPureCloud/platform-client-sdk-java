package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicLocalDate;
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicLocalTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeMetricsTopicLocalDateTime
 */

public class EdgeMetricsTopicLocalDateTime  implements Serializable {
  
  private EdgeMetricsTopicLocalDate date = null;
  private EdgeMetricsTopicLocalTime time = null;

  
  /**
   **/
  public EdgeMetricsTopicLocalDateTime date(EdgeMetricsTopicLocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public EdgeMetricsTopicLocalDate getDate() {
    return date;
  }
  public void setDate(EdgeMetricsTopicLocalDate date) {
    this.date = date;
  }

  
  /**
   **/
  public EdgeMetricsTopicLocalDateTime time(EdgeMetricsTopicLocalTime time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public EdgeMetricsTopicLocalTime getTime() {
    return time;
  }
  public void setTime(EdgeMetricsTopicLocalTime time) {
    this.time = time;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsTopicLocalDateTime edgeMetricsTopicLocalDateTime = (EdgeMetricsTopicLocalDateTime) o;
    return Objects.equals(this.date, edgeMetricsTopicLocalDateTime.date) &&
        Objects.equals(this.time, edgeMetricsTopicLocalDateTime.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicLocalDateTime {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

