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
import com.mypurecloud.sdk.v2.model.V3SourceFileCountEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceFileCountsResponse
 */

public class V3SourceFileCountsResponse  implements Serializable {
  
  private List<V3SourceFileCountEntry> entities = null;

  public V3SourceFileCountsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<V3SourceFileCountEntry>();
    }
  }

  public V3SourceFileCountsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<V3SourceFileCountEntry>();
    }
  }

  
  /**
   * Per-source file counts.
   **/
  public V3SourceFileCountsResponse entities(List<V3SourceFileCountEntry> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Per-source file counts.")
  @JsonProperty("entities")
  public List<V3SourceFileCountEntry> getEntities() {
    return entities;
  }
  public void setEntities(List<V3SourceFileCountEntry> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceFileCountsResponse v3SourceFileCountsResponse = (V3SourceFileCountsResponse) o;

    return Objects.equals(this.entities, v3SourceFileCountsResponse.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceFileCountsResponse {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

