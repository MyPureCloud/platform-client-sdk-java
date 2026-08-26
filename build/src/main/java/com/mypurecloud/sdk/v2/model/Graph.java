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
import com.mypurecloud.sdk.v2.model.GraphEdge;
import com.mypurecloud.sdk.v2.model.GraphVertices;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Graph
 */

public class Graph  implements Serializable {
  
  private GraphVertices vertices = null;
  private List<GraphEdge> edges = null;

  public Graph() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      edges = new ArrayList<GraphEdge>();
    }
  }

  public Graph(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      edges = new ArrayList<GraphEdge>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The list of graph vertices")
  @JsonProperty("vertices")
  public GraphVertices getVertices() {
    return vertices;
  }


  @ApiModelProperty(example = "null", value = "The list of graph edges")
  @JsonProperty("edges")
  public List<GraphEdge> getEdges() {
    return edges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Graph graph = (Graph) o;

    return Objects.equals(this.vertices, graph.vertices) &&
            Objects.equals(this.edges, graph.edges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertices, edges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Graph {\n");
    
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
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

