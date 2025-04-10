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
import com.mypurecloud.sdk.v2.model.QuarterHourly;
import com.mypurecloud.sdk.v2.model.Weekly;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SnapshotMetricData
 */

public class SnapshotMetricData  implements Serializable {
  
  private Weekly weekly = null;
  private QuarterHourly quarterHour = null;

  public SnapshotMetricData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Weekly time series for snapshot data
   **/
  public SnapshotMetricData weekly(Weekly weekly) {
    this.weekly = weekly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Weekly time series for snapshot data")
  @JsonProperty("weekly")
  public Weekly getWeekly() {
    return weekly;
  }
  public void setWeekly(Weekly weekly) {
    this.weekly = weekly;
  }


  /**
   * Quarter hour time series for snapshot data
   **/
  public SnapshotMetricData quarterHour(QuarterHourly quarterHour) {
    this.quarterHour = quarterHour;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quarter hour time series for snapshot data")
  @JsonProperty("quarterHour")
  public QuarterHourly getQuarterHour() {
    return quarterHour;
  }
  public void setQuarterHour(QuarterHourly quarterHour) {
    this.quarterHour = quarterHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotMetricData snapshotMetricData = (SnapshotMetricData) o;

    return Objects.equals(this.weekly, snapshotMetricData.weekly) &&
            Objects.equals(this.quarterHour, snapshotMetricData.quarterHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekly, quarterHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotMetricData {\n");
    
    sb.append("    weekly: ").append(toIndentedString(weekly)).append("\n");
    sb.append("    quarterHour: ").append(toIndentedString(quarterHour)).append("\n");
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

