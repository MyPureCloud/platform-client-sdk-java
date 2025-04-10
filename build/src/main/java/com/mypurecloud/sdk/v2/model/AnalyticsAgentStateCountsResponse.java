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

  public AnalyticsAgentStateCountsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      segmentCounts = new ArrayList<AgentStateSegmentTypeCount>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAgentStateCountsResponse analyticsAgentStateCountsResponse = (AnalyticsAgentStateCountsResponse) o;

    return Objects.equals(this.segmentCounts, analyticsAgentStateCountsResponse.segmentCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAgentStateCountsResponse {\n");
    
    sb.append("    segmentCounts: ").append(toIndentedString(segmentCounts)).append("\n");
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

