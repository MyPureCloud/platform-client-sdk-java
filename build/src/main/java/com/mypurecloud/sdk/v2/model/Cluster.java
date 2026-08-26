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
import com.mypurecloud.sdk.v2.model.ClusterScan;
import com.mypurecloud.sdk.v2.model.Graph;
import com.mypurecloud.sdk.v2.model.MergeInfo;
import com.mypurecloud.sdk.v2.model.StarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Cluster
 */

public class Cluster  implements Serializable {
  
  private String id = null;
  private StarrableDivision division = null;
  private ClusterScan clusterScan = null;
  private MergeInfo mergeInfo = null;
  private Graph graph = null;
  private Date dateCreated = null;
  private String selfUri = null;

  public Cluster() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public Cluster(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The unique ID of this cluster within its associated scan")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The division all contacts in this cluster are associated to")
  @JsonProperty("division")
  public StarrableDivision getDivision() {
    return division;
  }


  @ApiModelProperty(example = "null", value = "The scan that this cluster belongs to")
  @JsonProperty("clusterScan")
  public ClusterScan getClusterScan() {
    return clusterScan;
  }


  @ApiModelProperty(example = "null", value = "Information related to merge operations taken on this cluster")
  @JsonProperty("mergeInfo")
  public MergeInfo getMergeInfo() {
    return mergeInfo;
  }


  @ApiModelProperty(example = "null", value = "The graph of contacts and identifiers that make up this cluster")
  @JsonProperty("graph")
  public Graph getGraph() {
    return graph;
  }


  @ApiModelProperty(example = "null", value = "The date this cluster was discovered. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
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
    Cluster cluster = (Cluster) o;

    return Objects.equals(this.id, cluster.id) &&
            Objects.equals(this.division, cluster.division) &&
            Objects.equals(this.clusterScan, cluster.clusterScan) &&
            Objects.equals(this.mergeInfo, cluster.mergeInfo) &&
            Objects.equals(this.graph, cluster.graph) &&
            Objects.equals(this.dateCreated, cluster.dateCreated) &&
            Objects.equals(this.selfUri, cluster.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, clusterScan, mergeInfo, graph, dateCreated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    clusterScan: ").append(toIndentedString(clusterScan)).append("\n");
    sb.append("    mergeInfo: ").append(toIndentedString(mergeInfo)).append("\n");
    sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

