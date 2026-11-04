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
import com.mypurecloud.sdk.v2.model.ClusterScanGraphSettings;
import com.mypurecloud.sdk.v2.model.ClusterScanStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * LatestClusterScan
 */

public class LatestClusterScan  implements Serializable {
  
  private String id = null;
  private Date dateCompleted = null;
  private ClusterScanStatistics statistics = null;
  private ClusterScanGraphSettings settings = null;
  private String selfUri = null;

  public LatestClusterScan() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public LatestClusterScan(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The unique ID of this scan")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The date this scan completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }


  @ApiModelProperty(example = "null", value = "Statistics collected about this scan")
  @JsonProperty("statistics")
  public ClusterScanStatistics getStatistics() {
    return statistics;
  }


  @ApiModelProperty(example = "null", value = "The organization's current graph settings")
  @JsonProperty("settings")
  public ClusterScanGraphSettings getSettings() {
    return settings;
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
    LatestClusterScan latestClusterScan = (LatestClusterScan) o;

    return Objects.equals(this.id, latestClusterScan.id) &&
            Objects.equals(this.dateCompleted, latestClusterScan.dateCompleted) &&
            Objects.equals(this.statistics, latestClusterScan.statistics) &&
            Objects.equals(this.settings, latestClusterScan.settings) &&
            Objects.equals(this.selfUri, latestClusterScan.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCompleted, statistics, settings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatestClusterScan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

