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
import com.mypurecloud.sdk.v2.model.AgentScheduleUnavailableTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryAgentScheduleUnavailableTimesResponse
 */

public class QueryAgentScheduleUnavailableTimesResponse  implements Serializable {
  
  private Boolean consideredInScheduleGeneration = null;
  private List<AgentScheduleUnavailableTime> scheduleGenerationUnavailableTimes = null;

  public QueryAgentScheduleUnavailableTimesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      scheduleGenerationUnavailableTimes = new ArrayList<AgentScheduleUnavailableTime>();
    }
  }

  
  /**
   * Indicates whether the unavailability times were considered in schedule generation. Returns false when no schedule exists
   **/
  public QueryAgentScheduleUnavailableTimesResponse consideredInScheduleGeneration(Boolean consideredInScheduleGeneration) {
    this.consideredInScheduleGeneration = consideredInScheduleGeneration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the unavailability times were considered in schedule generation. Returns false when no schedule exists")
  @JsonProperty("consideredInScheduleGeneration")
  public Boolean getConsideredInScheduleGeneration() {
    return consideredInScheduleGeneration;
  }
  public void setConsideredInScheduleGeneration(Boolean consideredInScheduleGeneration) {
    this.consideredInScheduleGeneration = consideredInScheduleGeneration;
  }


  /**
   * List of the unavailable times used in schedule generation
   **/
  public QueryAgentScheduleUnavailableTimesResponse scheduleGenerationUnavailableTimes(List<AgentScheduleUnavailableTime> scheduleGenerationUnavailableTimes) {
    this.scheduleGenerationUnavailableTimes = scheduleGenerationUnavailableTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of the unavailable times used in schedule generation")
  @JsonProperty("scheduleGenerationUnavailableTimes")
  public List<AgentScheduleUnavailableTime> getScheduleGenerationUnavailableTimes() {
    return scheduleGenerationUnavailableTimes;
  }
  public void setScheduleGenerationUnavailableTimes(List<AgentScheduleUnavailableTime> scheduleGenerationUnavailableTimes) {
    this.scheduleGenerationUnavailableTimes = scheduleGenerationUnavailableTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAgentScheduleUnavailableTimesResponse queryAgentScheduleUnavailableTimesResponse = (QueryAgentScheduleUnavailableTimesResponse) o;

    return Objects.equals(this.consideredInScheduleGeneration, queryAgentScheduleUnavailableTimesResponse.consideredInScheduleGeneration) &&
            Objects.equals(this.scheduleGenerationUnavailableTimes, queryAgentScheduleUnavailableTimesResponse.scheduleGenerationUnavailableTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consideredInScheduleGeneration, scheduleGenerationUnavailableTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAgentScheduleUnavailableTimesResponse {\n");
    
    sb.append("    consideredInScheduleGeneration: ").append(toIndentedString(consideredInScheduleGeneration)).append("\n");
    sb.append("    scheduleGenerationUnavailableTimes: ").append(toIndentedString(scheduleGenerationUnavailableTimes)).append("\n");
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

