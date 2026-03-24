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
import com.mypurecloud.sdk.v2.model.QueryCriteriaGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Query object for searching libraries based on criteria
 */
@ApiModel(description = "Query object for searching libraries based on criteria")

public class QueryCriteriaQuery  implements Serializable {
  
  private List<QueryCriteriaGroup> query = null;

  public QueryCriteriaQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      query = new ArrayList<QueryCriteriaGroup>();
    }
  }

  
  /**
   * List of criteria groups that will be AND'd together
   **/
  public QueryCriteriaQuery query(List<QueryCriteriaGroup> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of criteria groups that will be AND'd together")
  @JsonProperty("query")
  public List<QueryCriteriaGroup> getQuery() {
    return query;
  }
  public void setQuery(List<QueryCriteriaGroup> query) {
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
    QueryCriteriaQuery queryCriteriaQuery = (QueryCriteriaQuery) o;

    return Objects.equals(this.query, queryCriteriaQuery.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCriteriaQuery {\n");
    
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

