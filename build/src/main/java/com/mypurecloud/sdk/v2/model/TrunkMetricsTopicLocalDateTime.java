package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.TrunkMetricsTopicLocalDate;
import com.mypurecloud.sdk.v2.model.TrunkMetricsTopicLocalTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrunkMetricsTopicLocalDateTime
 */

public class TrunkMetricsTopicLocalDateTime  implements Serializable {
  
  private TrunkMetricsTopicLocalDate date = null;
  private TrunkMetricsTopicLocalTime time = null;

  
  /**
   **/
  public TrunkMetricsTopicLocalDateTime date(TrunkMetricsTopicLocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public TrunkMetricsTopicLocalDate getDate() {
    return date;
  }
  public void setDate(TrunkMetricsTopicLocalDate date) {
    this.date = date;
  }

  
  /**
   **/
  public TrunkMetricsTopicLocalDateTime time(TrunkMetricsTopicLocalTime time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public TrunkMetricsTopicLocalTime getTime() {
    return time;
  }
  public void setTime(TrunkMetricsTopicLocalTime time) {
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
    TrunkMetricsTopicLocalDateTime trunkMetricsTopicLocalDateTime = (TrunkMetricsTopicLocalDateTime) o;
    return Objects.equals(this.date, trunkMetricsTopicLocalDateTime.date) &&
        Objects.equals(this.time, trunkMetricsTopicLocalDateTime.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsTopicLocalDateTime {\n");
    
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

