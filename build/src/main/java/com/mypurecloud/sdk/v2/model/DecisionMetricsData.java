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
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionMetricsData
 */

public class DecisionMetricsData  implements Serializable {
  
  private UserReference user = null;
  private Integer performanceRank = null;
  private Integer tieBreakerValue = null;
  private WfmEntityMetadata metadata = null;

  public DecisionMetricsData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DecisionMetricsData(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The user associated with the decision metrics
   **/
  public DecisionMetricsData user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user associated with the decision metrics")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The performance ranking value of the user for decision metrics. The value ranges from 0 to 9999, with the highest value indicating the best performer
   **/
  public DecisionMetricsData performanceRank(Integer performanceRank) {
    this.performanceRank = performanceRank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The performance ranking value of the user for decision metrics. The value ranges from 0 to 9999, with the highest value indicating the best performer")
  @JsonProperty("performanceRank")
  public Integer getPerformanceRank() {
    return performanceRank;
  }
  public void setPerformanceRank(Integer performanceRank) {
    this.performanceRank = performanceRank;
  }


  /**
   * A numeric tie-breaker value used to resolve ties in performance rankings. Values are sorted in ascending order, with lower values taking precedence
   **/
  public DecisionMetricsData tieBreakerValue(Integer tieBreakerValue) {
    this.tieBreakerValue = tieBreakerValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A numeric tie-breaker value used to resolve ties in performance rankings. Values are sorted in ascending order, with lower values taking precedence")
  @JsonProperty("tieBreakerValue")
  public Integer getTieBreakerValue() {
    return tieBreakerValue;
  }
  public void setTieBreakerValue(Integer tieBreakerValue) {
    this.tieBreakerValue = tieBreakerValue;
  }


  /**
   * The metadata associated to the users decision metric, which will be null if the user has no associated decision metrics
   **/
  public DecisionMetricsData metadata(WfmEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metadata associated to the users decision metric, which will be null if the user has no associated decision metrics")
  @JsonProperty("metadata")
  public WfmEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionMetricsData decisionMetricsData = (DecisionMetricsData) o;

    return Objects.equals(this.user, decisionMetricsData.user) &&
            Objects.equals(this.performanceRank, decisionMetricsData.performanceRank) &&
            Objects.equals(this.tieBreakerValue, decisionMetricsData.tieBreakerValue) &&
            Objects.equals(this.metadata, decisionMetricsData.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, performanceRank, tieBreakerValue, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionMetricsData {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    performanceRank: ").append(toIndentedString(performanceRank)).append("\n");
    sb.append("    tieBreakerValue: ").append(toIndentedString(tieBreakerValue)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

