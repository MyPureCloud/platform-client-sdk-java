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
import com.mypurecloud.sdk.v2.model.V3SourceTagFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceFileCountsRequest
 */

public class V3SourceFileCountsRequest  implements Serializable {
  
  private List<String> sourceIds = null;
  private V3SourceTagFilter filter = null;
  private Boolean includeFileNames = null;

  public V3SourceFileCountsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sourceIds = new ArrayList<String>();
    }
  }

  public V3SourceFileCountsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sourceIds = new ArrayList<String>();
    }
  }

  
  /**
   * Source IDs used to scope the file count response.
   **/
  public V3SourceFileCountsRequest sourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Source IDs used to scope the file count response.")
  @JsonProperty("sourceIds")
  public List<String> getSourceIds() {
    return sourceIds;
  }
  public void setSourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
  }


  /**
   * Composite tag filter.
   **/
  public V3SourceFileCountsRequest filter(V3SourceTagFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Composite tag filter.")
  @JsonProperty("filter")
  public V3SourceTagFilter getFilter() {
    return filter;
  }
  public void setFilter(V3SourceTagFilter filter) {
    this.filter = filter;
  }


  /**
   * When true, response may include fileNames per source.
   **/
  public V3SourceFileCountsRequest includeFileNames(Boolean includeFileNames) {
    this.includeFileNames = includeFileNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When true, response may include fileNames per source.")
  @JsonProperty("includeFileNames")
  public Boolean getIncludeFileNames() {
    return includeFileNames;
  }
  public void setIncludeFileNames(Boolean includeFileNames) {
    this.includeFileNames = includeFileNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceFileCountsRequest v3SourceFileCountsRequest = (V3SourceFileCountsRequest) o;

    return Objects.equals(this.sourceIds, v3SourceFileCountsRequest.sourceIds) &&
            Objects.equals(this.filter, v3SourceFileCountsRequest.filter) &&
            Objects.equals(this.includeFileNames, v3SourceFileCountsRequest.includeFileNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceIds, filter, includeFileNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceFileCountsRequest {\n");
    
    sb.append("    sourceIds: ").append(toIndentedString(sourceIds)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeFileNames: ").append(toIndentedString(includeFileNames)).append("\n");
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

