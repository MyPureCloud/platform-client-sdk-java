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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * V3SourceScheduleSettings
 */

public class V3SourceScheduleSettings  implements Serializable {
  
  private Date dateStart = null;
  private Integer period = null;

  public V3SourceScheduleSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The date-time value of the first sync run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public V3SourceScheduleSettings dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date-time value of the first sync run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The time between syncs, in hours, until a new sync is run.
   **/
  public V3SourceScheduleSettings period(Integer period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time between syncs, in hours, until a new sync is run.")
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceScheduleSettings v3SourceScheduleSettings = (V3SourceScheduleSettings) o;

    return Objects.equals(this.dateStart, v3SourceScheduleSettings.dateStart) &&
            Objects.equals(this.period, v3SourceScheduleSettings.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceScheduleSettings {\n");
    
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

