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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AggregateHistoricalAvailability
 */

public class AggregateHistoricalAvailability  implements Serializable {
  
  private List<Integer> weekly = null;
  private List<Integer> yearly = null;

  public AggregateHistoricalAvailability() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      weekly = new ArrayList<Integer>();
      yearly = new ArrayList<Integer>();
    }
  }

  
  /**
   * All available week offsets from the historical start date.
   **/
  public AggregateHistoricalAvailability weekly(List<Integer> weekly) {
    this.weekly = weekly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "All available week offsets from the historical start date.")
  @JsonProperty("weekly")
  public List<Integer> getWeekly() {
    return weekly;
  }
  public void setWeekly(List<Integer> weekly) {
    this.weekly = weekly;
  }


  /**
   * All available historical year offsets from the forecast start date.
   **/
  public AggregateHistoricalAvailability yearly(List<Integer> yearly) {
    this.yearly = yearly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "All available historical year offsets from the forecast start date.")
  @JsonProperty("yearly")
  public List<Integer> getYearly() {
    return yearly;
  }
  public void setYearly(List<Integer> yearly) {
    this.yearly = yearly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateHistoricalAvailability aggregateHistoricalAvailability = (AggregateHistoricalAvailability) o;

    return Objects.equals(this.weekly, aggregateHistoricalAvailability.weekly) &&
            Objects.equals(this.yearly, aggregateHistoricalAvailability.yearly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekly, yearly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateHistoricalAvailability {\n");
    
    sb.append("    weekly: ").append(toIndentedString(weekly)).append("\n");
    sb.append("    yearly: ").append(toIndentedString(yearly)).append("\n");
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

