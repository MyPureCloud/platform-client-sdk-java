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
import com.mypurecloud.sdk.v2.model.AgentStateIsOutOfOfficeCount;
import com.mypurecloud.sdk.v2.model.AgentStatePresenceCount;
import com.mypurecloud.sdk.v2.model.AgentStateRoutingStatusCount;
import com.mypurecloud.sdk.v2.model.AgentStateSegmentTypeCount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsAgentStateCountsResponse
 */

public class AnalyticsAgentStateCountsResponse  implements Serializable {
  
  private List<AgentStateSegmentTypeCount> segmentCounts = null;
  private List<AgentStatePresenceCount> presenceCounts = null;
  private List<AgentStateRoutingStatusCount> routingStatusCounts = null;
  private List<AgentStateIsOutOfOfficeCount> isOutOfOfficeCounts = null;

  public AnalyticsAgentStateCountsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      segmentCounts = new ArrayList<AgentStateSegmentTypeCount>();
      presenceCounts = new ArrayList<AgentStatePresenceCount>();
      routingStatusCounts = new ArrayList<AgentStateRoutingStatusCount>();
      isOutOfOfficeCounts = new ArrayList<AgentStateIsOutOfOfficeCount>();
    }
  }

  
  /**
   * List of count by segment types
   **/
  public AnalyticsAgentStateCountsResponse segmentCounts(List<AgentStateSegmentTypeCount> segmentCounts) {
    this.segmentCounts = segmentCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of count by segment types")
  @JsonProperty("segmentCounts")
  public List<AgentStateSegmentTypeCount> getSegmentCounts() {
    return segmentCounts;
  }
  public void setSegmentCounts(List<AgentStateSegmentTypeCount> segmentCounts) {
    this.segmentCounts = segmentCounts;
  }


  /**
   * List of count by presences
   **/
  public AnalyticsAgentStateCountsResponse presenceCounts(List<AgentStatePresenceCount> presenceCounts) {
    this.presenceCounts = presenceCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of count by presences")
  @JsonProperty("presenceCounts")
  public List<AgentStatePresenceCount> getPresenceCounts() {
    return presenceCounts;
  }
  public void setPresenceCounts(List<AgentStatePresenceCount> presenceCounts) {
    this.presenceCounts = presenceCounts;
  }


  /**
   * List of count by routing statuses
   **/
  public AnalyticsAgentStateCountsResponse routingStatusCounts(List<AgentStateRoutingStatusCount> routingStatusCounts) {
    this.routingStatusCounts = routingStatusCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of count by routing statuses")
  @JsonProperty("routingStatusCounts")
  public List<AgentStateRoutingStatusCount> getRoutingStatusCounts() {
    return routingStatusCounts;
  }
  public void setRoutingStatusCounts(List<AgentStateRoutingStatusCount> routingStatusCounts) {
    this.routingStatusCounts = routingStatusCounts;
  }


  /**
   * List of count by out of office states
   **/
  public AnalyticsAgentStateCountsResponse isOutOfOfficeCounts(List<AgentStateIsOutOfOfficeCount> isOutOfOfficeCounts) {
    this.isOutOfOfficeCounts = isOutOfOfficeCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of count by out of office states")
  @JsonProperty("isOutOfOfficeCounts")
  public List<AgentStateIsOutOfOfficeCount> getIsOutOfOfficeCounts() {
    return isOutOfOfficeCounts;
  }
  public void setIsOutOfOfficeCounts(List<AgentStateIsOutOfOfficeCount> isOutOfOfficeCounts) {
    this.isOutOfOfficeCounts = isOutOfOfficeCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAgentStateCountsResponse analyticsAgentStateCountsResponse = (AnalyticsAgentStateCountsResponse) o;

    return Objects.equals(this.segmentCounts, analyticsAgentStateCountsResponse.segmentCounts) &&
            Objects.equals(this.presenceCounts, analyticsAgentStateCountsResponse.presenceCounts) &&
            Objects.equals(this.routingStatusCounts, analyticsAgentStateCountsResponse.routingStatusCounts) &&
            Objects.equals(this.isOutOfOfficeCounts, analyticsAgentStateCountsResponse.isOutOfOfficeCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentCounts, presenceCounts, routingStatusCounts, isOutOfOfficeCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAgentStateCountsResponse {\n");
    
    sb.append("    segmentCounts: ").append(toIndentedString(segmentCounts)).append("\n");
    sb.append("    presenceCounts: ").append(toIndentedString(presenceCounts)).append("\n");
    sb.append("    routingStatusCounts: ").append(toIndentedString(routingStatusCounts)).append("\n");
    sb.append("    isOutOfOfficeCounts: ").append(toIndentedString(isOutOfOfficeCounts)).append("\n");
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

