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
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeSearchPreviewResponse
 */

public class KnowledgeSearchPreviewResponse  implements Serializable {
  
  private String query = null;
  private String searchId = null;
  private String sessionId = null;
  private KnowledgeSearchResult result = null;

  public KnowledgeSearchPreviewResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Query to search content in the knowledge base.
   **/
  public KnowledgeSearchPreviewResponse query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query to search content in the knowledge base.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  @ApiModelProperty(example = "null", value = "The globally unique identifier for the search.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }


  @ApiModelProperty(example = "null", value = "The sessionId for search request.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  @ApiModelProperty(example = "null", value = "Content matching the search query.")
  @JsonProperty("result")
  public KnowledgeSearchResult getResult() {
    return result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSearchPreviewResponse knowledgeSearchPreviewResponse = (KnowledgeSearchPreviewResponse) o;

    return Objects.equals(this.query, knowledgeSearchPreviewResponse.query) &&
            Objects.equals(this.searchId, knowledgeSearchPreviewResponse.searchId) &&
            Objects.equals(this.sessionId, knowledgeSearchPreviewResponse.sessionId) &&
            Objects.equals(this.result, knowledgeSearchPreviewResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, searchId, sessionId, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchPreviewResponse {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

