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
import com.mypurecloud.sdk.v2.model.AggregationResult;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsUserDetailsQueryResponse
 */

public class AnalyticsUserDetailsQueryResponse  implements Serializable {
  
  private List<AnalyticsUserDetail> userDetails = new ArrayList<AnalyticsUserDetail>();
  private List<AggregationResult> aggregations = new ArrayList<AggregationResult>();
  private Integer totalHits = null;

  
  /**
   **/
  public AnalyticsUserDetailsQueryResponse userDetails(List<AnalyticsUserDetail> userDetails) {
    this.userDetails = userDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userDetails")
  public List<AnalyticsUserDetail> getUserDetails() {
    return userDetails;
  }
  public void setUserDetails(List<AnalyticsUserDetail> userDetails) {
    this.userDetails = userDetails;
  }

  
  /**
   **/
  public AnalyticsUserDetailsQueryResponse aggregations(List<AggregationResult> aggregations) {
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
  public AnalyticsUserDetailsQueryResponse totalHits(Integer totalHits) {
    this.totalHits = totalHits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalHits")
  public Integer getTotalHits() {
    return totalHits;
  }
  public void setTotalHits(Integer totalHits) {
    this.totalHits = totalHits;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsUserDetailsQueryResponse analyticsUserDetailsQueryResponse = (AnalyticsUserDetailsQueryResponse) o;
    return Objects.equals(this.userDetails, analyticsUserDetailsQueryResponse.userDetails) &&
        Objects.equals(this.aggregations, analyticsUserDetailsQueryResponse.aggregations) &&
        Objects.equals(this.totalHits, analyticsUserDetailsQueryResponse.totalHits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDetails, aggregations, totalHits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsUserDetailsQueryResponse {\n");
    
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
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

