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
import com.fasterxml.jackson.databind.node.ArrayNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JsonCursorSearchResponse
 */

public class JsonCursorSearchResponse  implements Serializable {
  
  private List<String> types = null;
  private ArrayNode results = null;
  private ArrayNode aggregations = null;
  private String cursor = null;

  public JsonCursorSearchResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      types = new ArrayList<String>();
    }
  }

  
  /**
   * Resource types the search was performed against
   **/
  public JsonCursorSearchResponse types(List<String> types) {
    this.types = types;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Resource types the search was performed against")
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }


  /**
   * Search results
   **/
  public JsonCursorSearchResponse results(ArrayNode results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Search results")
  @JsonProperty("results")
  public ArrayNode getResults() {
    return results;
  }
  public void setResults(ArrayNode results) {
    this.results = results;
  }


  /**
   **/
  public JsonCursorSearchResponse aggregations(ArrayNode aggregations) {
    this.aggregations = aggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("aggregations")
  public ArrayNode getAggregations() {
    return aggregations;
  }
  public void setAggregations(ArrayNode aggregations) {
    this.aggregations = aggregations;
  }


  /**
   * The page cursor
   **/
  public JsonCursorSearchResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page cursor")
  @JsonProperty("cursor")
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonCursorSearchResponse jsonCursorSearchResponse = (JsonCursorSearchResponse) o;

    return Objects.equals(this.types, jsonCursorSearchResponse.types) &&
            Objects.equals(this.results, jsonCursorSearchResponse.results) &&
            Objects.equals(this.aggregations, jsonCursorSearchResponse.aggregations) &&
            Objects.equals(this.cursor, jsonCursorSearchResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, results, aggregations, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonCursorSearchResponse {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

