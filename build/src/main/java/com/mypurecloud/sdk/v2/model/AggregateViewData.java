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
import com.mypurecloud.sdk.v2.model.StatisticalSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AggregateViewData
 */

public class AggregateViewData  implements Serializable {
  
  private String name = null;
  private StatisticalSummary stats = null;

  
  /**
   **/
  public AggregateViewData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public AggregateViewData stats(StatisticalSummary stats) {
    this.stats = stats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stats")
  public StatisticalSummary getStats() {
    return stats;
  }
  public void setStats(StatisticalSummary stats) {
    this.stats = stats;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateViewData aggregateViewData = (AggregateViewData) o;
    return Objects.equals(this.name, aggregateViewData.name) &&
        Objects.equals(this.stats, aggregateViewData.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateViewData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

