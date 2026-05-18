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
import com.mypurecloud.sdk.v2.model.AgentUtilizationAggregateDataContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentUtilizationAsyncAggregateQueryResponse
 */

public class AgentUtilizationAsyncAggregateQueryResponse  implements Serializable {
  
  private List<AgentUtilizationAggregateDataContainer> results = null;
  private String cursor = null;

  public AgentUtilizationAsyncAggregateQueryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<AgentUtilizationAggregateDataContainer>();
    }
  }

  public AgentUtilizationAsyncAggregateQueryResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      results = new ArrayList<AgentUtilizationAggregateDataContainer>();
    }
  }

  
  /**
   **/
  public AgentUtilizationAsyncAggregateQueryResponse results(List<AgentUtilizationAggregateDataContainer> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<AgentUtilizationAggregateDataContainer> getResults() {
    return results;
  }
  public void setResults(List<AgentUtilizationAggregateDataContainer> results) {
    this.results = results;
  }


  /**
   * Cursor token to retrieve next page
   **/
  public AgentUtilizationAsyncAggregateQueryResponse cursor(String cursor) {
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
    AgentUtilizationAsyncAggregateQueryResponse agentUtilizationAsyncAggregateQueryResponse = (AgentUtilizationAsyncAggregateQueryResponse) o;

    return Objects.equals(this.results, agentUtilizationAsyncAggregateQueryResponse.results) &&
            Objects.equals(this.cursor, agentUtilizationAsyncAggregateQueryResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentUtilizationAsyncAggregateQueryResponse {\n");
    
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

