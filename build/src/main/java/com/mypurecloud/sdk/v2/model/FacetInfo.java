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
import com.mypurecloud.sdk.v2.model.Entry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FacetInfo
 */

public class FacetInfo  implements Serializable {
  
  private String name = null;
  private List<Entry> entries = new ArrayList<Entry>();

  
  /**
   * The name of the field that was faceted on.
   **/
  public FacetInfo name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the field that was faceted on.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The entries resulting from this facet.
   **/
  public FacetInfo entries(List<Entry> entries) {
    this.entries = entries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entries resulting from this facet.")
  @JsonProperty("entries")
  public List<Entry> getEntries() {
    return entries;
  }
  public void setEntries(List<Entry> entries) {
    this.entries = entries;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetInfo facetInfo = (FacetInfo) o;
    return Objects.equals(this.name, facetInfo.name) &&
        Objects.equals(this.entries, facetInfo.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

