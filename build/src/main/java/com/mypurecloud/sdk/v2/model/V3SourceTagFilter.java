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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceTagFilter
 */

public class V3SourceTagFilter  implements Serializable {
  
  private List<String> allOf = null;
  private List<List<String>> anyOfGroups = null;
  private List<String> noneOf = null;

  public V3SourceTagFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      allOf = new ArrayList<String>();
      anyOfGroups = new ArrayList<List<String>>();
      noneOf = new ArrayList<String>();
    }
  }

  public V3SourceTagFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      allOf = new ArrayList<String>();
      anyOfGroups = new ArrayList<List<String>>();
      noneOf = new ArrayList<String>();
    }
  }

  
  /**
   * Tags that must all be present (AND).
   **/
  public V3SourceTagFilter allOf(List<String> allOf) {
    this.allOf = allOf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tags that must all be present (AND).")
  @JsonProperty("allOf")
  public List<String> getAllOf() {
    return allOf;
  }
  public void setAllOf(List<String> allOf) {
    this.allOf = allOf;
  }


  /**
   * OR groups ANDed together; within each group at least one tag must match.
   **/
  public V3SourceTagFilter anyOfGroups(List<List<String>> anyOfGroups) {
    this.anyOfGroups = anyOfGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OR groups ANDed together; within each group at least one tag must match.")
  @JsonProperty("anyOfGroups")
  public List<List<String>> getAnyOfGroups() {
    return anyOfGroups;
  }
  public void setAnyOfGroups(List<List<String>> anyOfGroups) {
    this.anyOfGroups = anyOfGroups;
  }


  /**
   * Tags that must not be present on matching chunks.
   **/
  public V3SourceTagFilter noneOf(List<String> noneOf) {
    this.noneOf = noneOf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tags that must not be present on matching chunks.")
  @JsonProperty("noneOf")
  public List<String> getNoneOf() {
    return noneOf;
  }
  public void setNoneOf(List<String> noneOf) {
    this.noneOf = noneOf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceTagFilter v3SourceTagFilter = (V3SourceTagFilter) o;

    return Objects.equals(this.allOf, v3SourceTagFilter.allOf) &&
            Objects.equals(this.anyOfGroups, v3SourceTagFilter.anyOfGroups) &&
            Objects.equals(this.noneOf, v3SourceTagFilter.noneOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf, anyOfGroups, noneOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceTagFilter {\n");
    
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
    sb.append("    anyOfGroups: ").append(toIndentedString(anyOfGroups)).append("\n");
    sb.append("    noneOf: ").append(toIndentedString(noneOf)).append("\n");
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

