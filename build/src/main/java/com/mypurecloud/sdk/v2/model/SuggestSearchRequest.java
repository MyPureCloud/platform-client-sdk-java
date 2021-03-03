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
import com.mypurecloud.sdk.v2.model.SuggestSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SuggestSearchRequest
 */

public class SuggestSearchRequest  implements Serializable {
  
  private List<String> expand = new ArrayList<String>();
  private List<String> types = new ArrayList<String>();
  private List<SuggestSearchCriteria> query = new ArrayList<SuggestSearchCriteria>();

  
  /**
   * Provides more details about a specified resource
   **/
  public SuggestSearchRequest expand(List<String> expand) {
    this.expand = expand;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides more details about a specified resource")
  @JsonProperty("expand")
  public List<String> getExpand() {
    return expand;
  }
  public void setExpand(List<String> expand) {
    this.expand = expand;
  }

  
  /**
   * Resource domain type to search
   **/
  public SuggestSearchRequest types(List<String> types) {
    this.types = types;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Resource domain type to search")
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  
  /**
   * Suggest query
   **/
  public SuggestSearchRequest query(List<SuggestSearchCriteria> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Suggest query")
  @JsonProperty("query")
  public List<SuggestSearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<SuggestSearchCriteria> query) {
    this.query = query;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestSearchRequest suggestSearchRequest = (SuggestSearchRequest) o;
    return Objects.equals(this.expand, suggestSearchRequest.expand) &&
        Objects.equals(this.types, suggestSearchRequest.types) &&
        Objects.equals(this.query, suggestSearchRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, types, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestSearchRequest {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

