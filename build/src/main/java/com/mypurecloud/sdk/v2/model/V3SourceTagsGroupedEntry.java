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
import com.mypurecloud.sdk.v2.model.V3SourceRef;
import com.mypurecloud.sdk.v2.model.V3SourceTagResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceTagsGroupedEntry
 */

public class V3SourceTagsGroupedEntry  implements Serializable {
  
  private V3SourceRef source = null;
  private List<V3SourceTagResponse> tags = null;

  public V3SourceTagsGroupedEntry() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      tags = new ArrayList<V3SourceTagResponse>();
    }
  }

  public V3SourceTagsGroupedEntry(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      tags = new ArrayList<V3SourceTagResponse>();
    }
  }

  
  /**
   * Knowledge source reference for this entry.
   **/
  public V3SourceTagsGroupedEntry source(V3SourceRef source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge source reference for this entry.")
  @JsonProperty("source")
  public V3SourceRef getSource() {
    return source;
  }
  public void setSource(V3SourceRef source) {
    this.source = source;
  }


  /**
   * Distinct tags for this source.
   **/
  public V3SourceTagsGroupedEntry tags(List<V3SourceTagResponse> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Distinct tags for this source.")
  @JsonProperty("tags")
  public List<V3SourceTagResponse> getTags() {
    return tags;
  }
  public void setTags(List<V3SourceTagResponse> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceTagsGroupedEntry v3SourceTagsGroupedEntry = (V3SourceTagsGroupedEntry) o;

    return Objects.equals(this.source, v3SourceTagsGroupedEntry.source) &&
            Objects.equals(this.tags, v3SourceTagsGroupedEntry.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceTagsGroupedEntry {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

