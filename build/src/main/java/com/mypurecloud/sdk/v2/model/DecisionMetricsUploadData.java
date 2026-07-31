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
import com.mypurecloud.sdk.v2.model.ValueWrapperInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionMetricsUploadData
 */

public class DecisionMetricsUploadData  implements Serializable {
  
  private String userId = null;
  private ValueWrapperInteger performanceRank = null;
  private ValueWrapperInteger tieBreakerValue = null;

  public DecisionMetricsUploadData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DecisionMetricsUploadData(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the user associated with this decision metrics data
   **/
  public DecisionMetricsUploadData userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the user associated with this decision metrics data")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The performance ranking value of the user for decision metrics. The value ranges from 0 to 9999, with the highest value indicating the best performer
   **/
  public DecisionMetricsUploadData performanceRank(ValueWrapperInteger performanceRank) {
    this.performanceRank = performanceRank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The performance ranking value of the user for decision metrics. The value ranges from 0 to 9999, with the highest value indicating the best performer")
  @JsonProperty("performanceRank")
  public ValueWrapperInteger getPerformanceRank() {
    return performanceRank;
  }
  public void setPerformanceRank(ValueWrapperInteger performanceRank) {
    this.performanceRank = performanceRank;
  }


  /**
   * A numeric tie-breaker value used to resolve ties in performance rankings. Values are sorted in ascending order, with lower values taking precedence
   **/
  public DecisionMetricsUploadData tieBreakerValue(ValueWrapperInteger tieBreakerValue) {
    this.tieBreakerValue = tieBreakerValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A numeric tie-breaker value used to resolve ties in performance rankings. Values are sorted in ascending order, with lower values taking precedence")
  @JsonProperty("tieBreakerValue")
  public ValueWrapperInteger getTieBreakerValue() {
    return tieBreakerValue;
  }
  public void setTieBreakerValue(ValueWrapperInteger tieBreakerValue) {
    this.tieBreakerValue = tieBreakerValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionMetricsUploadData decisionMetricsUploadData = (DecisionMetricsUploadData) o;

    return Objects.equals(this.userId, decisionMetricsUploadData.userId) &&
            Objects.equals(this.performanceRank, decisionMetricsUploadData.performanceRank) &&
            Objects.equals(this.tieBreakerValue, decisionMetricsUploadData.tieBreakerValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, performanceRank, tieBreakerValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionMetricsUploadData {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    performanceRank: ").append(toIndentedString(performanceRank)).append("\n");
    sb.append("    tieBreakerValue: ").append(toIndentedString(tieBreakerValue)).append("\n");
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

