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
import com.mypurecloud.sdk.v2.model.ClusterStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ClusterScanStatistics
 */

public class ClusterScanStatistics  implements Serializable {
  
  private ClusterStatistics aggregated = null;
  private String selfUri = null;

  public ClusterScanStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ClusterScanStatistics(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Org-wide, aggregate statistics for an individual scan")
  @JsonProperty("aggregated")
  public ClusterStatistics getAggregated() {
    return aggregated;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterScanStatistics clusterScanStatistics = (ClusterScanStatistics) o;

    return Objects.equals(this.aggregated, clusterScanStatistics.aggregated) &&
            Objects.equals(this.selfUri, clusterScanStatistics.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterScanStatistics {\n");
    
    sb.append("    aggregated: ").append(toIndentedString(aggregated)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

