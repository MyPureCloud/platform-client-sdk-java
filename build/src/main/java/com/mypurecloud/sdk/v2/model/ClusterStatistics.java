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

import java.io.Serializable;
/**
 * ClusterStatistics
 */

public class ClusterStatistics  implements Serializable {
  
  private Long totalClusters = null;
  private Long totalAutomaticMergeSuccesses = null;
  private Long totalAutomaticMergeFailures = null;

  public ClusterStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ClusterStatistics(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The total number of unique contact clusters found")
  @JsonProperty("totalClusters")
  public Long getTotalClusters() {
    return totalClusters;
  }


  @ApiModelProperty(example = "null", value = "The total number of automatic merge operations that succeeded in this scan")
  @JsonProperty("totalAutomaticMergeSuccesses")
  public Long getTotalAutomaticMergeSuccesses() {
    return totalAutomaticMergeSuccesses;
  }


  @ApiModelProperty(example = "null", value = "The total number of automatic merge operations that failed in this scan")
  @JsonProperty("totalAutomaticMergeFailures")
  public Long getTotalAutomaticMergeFailures() {
    return totalAutomaticMergeFailures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterStatistics clusterStatistics = (ClusterStatistics) o;

    return Objects.equals(this.totalClusters, clusterStatistics.totalClusters) &&
            Objects.equals(this.totalAutomaticMergeSuccesses, clusterStatistics.totalAutomaticMergeSuccesses) &&
            Objects.equals(this.totalAutomaticMergeFailures, clusterStatistics.totalAutomaticMergeFailures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalClusters, totalAutomaticMergeSuccesses, totalAutomaticMergeFailures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterStatistics {\n");
    
    sb.append("    totalClusters: ").append(toIndentedString(totalClusters)).append("\n");
    sb.append("    totalAutomaticMergeSuccesses: ").append(toIndentedString(totalAutomaticMergeSuccesses)).append("\n");
    sb.append("    totalAutomaticMergeFailures: ").append(toIndentedString(totalAutomaticMergeFailures)).append("\n");
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

