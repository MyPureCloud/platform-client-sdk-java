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
import com.mypurecloud.sdk.v2.model.FacetEntry;
import com.mypurecloud.sdk.v2.model.FacetKeyAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryFacetInfo
 */

public class QueryFacetInfo  implements Serializable {
  
  private List<FacetKeyAttribute> attributes = new ArrayList<FacetKeyAttribute>();
  private List<FacetEntry> facets = new ArrayList<FacetEntry>();

  
  /**
   **/
  public QueryFacetInfo attributes(List<FacetKeyAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributes")
  public List<FacetKeyAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<FacetKeyAttribute> attributes) {
    this.attributes = attributes;
  }

  
  /**
   **/
  public QueryFacetInfo facets(List<FacetEntry> facets) {
    this.facets = facets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facets")
  public List<FacetEntry> getFacets() {
    return facets;
  }
  public void setFacets(List<FacetEntry> facets) {
    this.facets = facets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFacetInfo queryFacetInfo = (QueryFacetInfo) o;
    return Objects.equals(this.attributes, queryFacetInfo.attributes) &&
        Objects.equals(this.facets, queryFacetInfo.facets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, facets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFacetInfo {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
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

