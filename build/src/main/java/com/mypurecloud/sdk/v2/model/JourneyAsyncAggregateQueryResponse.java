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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.JourneyAggregateDataContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyAsyncAggregateQueryResponse
 */

public class JourneyAsyncAggregateQueryResponse  implements Serializable {
  
  private List<JourneyAggregateDataContainer> results = new ArrayList<JourneyAggregateDataContainer>();
  private String cursor = null;

  
  /**
   **/
  public JourneyAsyncAggregateQueryResponse results(List<JourneyAggregateDataContainer> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<JourneyAggregateDataContainer> getResults() {
    return results;
  }
  public void setResults(List<JourneyAggregateDataContainer> results) {
    this.results = results;
  }


  /**
   * Cursor token to retrieve next page
   **/
  public JourneyAsyncAggregateQueryResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cursor token to retrieve next page")
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
    JourneyAsyncAggregateQueryResponse journeyAsyncAggregateQueryResponse = (JourneyAsyncAggregateQueryResponse) o;

    return Objects.equals(this.results, journeyAsyncAggregateQueryResponse.results) &&
            Objects.equals(this.cursor, journeyAsyncAggregateQueryResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAsyncAggregateQueryResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

