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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeLogsJobRequest
 */

public class EdgeLogsJobRequest  implements Serializable {
  
  private String path = null;
  private String query = null;
  private Boolean recurse = null;

  
  /**
   * A relative directory to the root Edge log folder to query from.
   **/
  public EdgeLogsJobRequest path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A relative directory to the root Edge log folder to query from.")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   * The pattern to use when searching for logs, which may include the wildcards {*, ?}.  Multiple search patterns may be combined using a pipe '|' as a delimiter.
   **/
  public EdgeLogsJobRequest query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pattern to use when searching for logs, which may include the wildcards {*, ?}.  Multiple search patterns may be combined using a pipe '|' as a delimiter.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  
  /**
   * Boolean whether or not to recurse into directories.
   **/
  public EdgeLogsJobRequest recurse(Boolean recurse) {
    this.recurse = recurse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean whether or not to recurse into directories.")
  @JsonProperty("recurse")
  public Boolean getRecurse() {
    return recurse;
  }
  public void setRecurse(Boolean recurse) {
    this.recurse = recurse;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeLogsJobRequest edgeLogsJobRequest = (EdgeLogsJobRequest) o;
    return Objects.equals(this.path, edgeLogsJobRequest.path) &&
        Objects.equals(this.query, edgeLogsJobRequest.query) &&
        Objects.equals(this.recurse, edgeLogsJobRequest.recurse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, query, recurse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLogsJobRequest {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    recurse: ").append(toIndentedString(recurse)).append("\n");
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

