package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AggregationResult;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsConversationQueryResponse
 */

public class AnalyticsConversationQueryResponse  implements Serializable {
  
  private List<AggregationResult> aggregations = new ArrayList<AggregationResult>();
  private List<AnalyticsConversationWithoutAttributes> conversations = new ArrayList<AnalyticsConversationWithoutAttributes>();

  
  /**
   **/
  public AnalyticsConversationQueryResponse aggregations(List<AggregationResult> aggregations) {
    this.aggregations = aggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("aggregations")
  public List<AggregationResult> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<AggregationResult> aggregations) {
    this.aggregations = aggregations;
  }

  
  /**
   **/
  public AnalyticsConversationQueryResponse conversations(List<AnalyticsConversationWithoutAttributes> conversations) {
    this.conversations = conversations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversations")
  public List<AnalyticsConversationWithoutAttributes> getConversations() {
    return conversations;
  }
  public void setConversations(List<AnalyticsConversationWithoutAttributes> conversations) {
    this.conversations = conversations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversationQueryResponse analyticsConversationQueryResponse = (AnalyticsConversationQueryResponse) o;
    return Objects.equals(this.aggregations, analyticsConversationQueryResponse.aggregations) &&
        Objects.equals(this.conversations, analyticsConversationQueryResponse.conversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregations, conversations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversationQueryResponse {\n");
    
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
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

