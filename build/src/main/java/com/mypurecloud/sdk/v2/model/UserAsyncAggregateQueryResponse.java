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
import com.mypurecloud.sdk.v2.model.UserAggregateDataContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UserAsyncAggregateQueryResponse
 */

public class UserAsyncAggregateQueryResponse  implements Serializable {
  
  private Map<String, List<String>> systemToOrganizationMappings = null;
  private List<UserAggregateDataContainer> results = null;
  private String cursor = null;

  public UserAsyncAggregateQueryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<UserAggregateDataContainer>();
    }
  }

  
  /**
   * A mapping from system presence to a list of organization presence ids
   **/
  public UserAsyncAggregateQueryResponse systemToOrganizationMappings(Map<String, List<String>> systemToOrganizationMappings) {
    this.systemToOrganizationMappings = systemToOrganizationMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A mapping from system presence to a list of organization presence ids")
  @JsonProperty("systemToOrganizationMappings")
  public Map<String, List<String>> getSystemToOrganizationMappings() {
    return systemToOrganizationMappings;
  }
  public void setSystemToOrganizationMappings(Map<String, List<String>> systemToOrganizationMappings) {
    this.systemToOrganizationMappings = systemToOrganizationMappings;
  }


  /**
   **/
  public UserAsyncAggregateQueryResponse results(List<UserAggregateDataContainer> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<UserAggregateDataContainer> getResults() {
    return results;
  }
  public void setResults(List<UserAggregateDataContainer> results) {
    this.results = results;
  }


  /**
   * Cursor token to retrieve next page
   **/
  public UserAsyncAggregateQueryResponse cursor(String cursor) {
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
    UserAsyncAggregateQueryResponse userAsyncAggregateQueryResponse = (UserAsyncAggregateQueryResponse) o;

    return Objects.equals(this.systemToOrganizationMappings, userAsyncAggregateQueryResponse.systemToOrganizationMappings) &&
            Objects.equals(this.results, userAsyncAggregateQueryResponse.results) &&
            Objects.equals(this.cursor, userAsyncAggregateQueryResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemToOrganizationMappings, results, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAsyncAggregateQueryResponse {\n");
    
    sb.append("    systemToOrganizationMappings: ").append(toIndentedString(systemToOrganizationMappings)).append("\n");
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

