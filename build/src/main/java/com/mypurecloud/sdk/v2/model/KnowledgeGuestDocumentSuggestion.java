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
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestDocumentSuggestion
 */

public class KnowledgeGuestDocumentSuggestion  implements Serializable {
  
  private String query = null;
  private Integer pageSize = null;
  private String sessionId = null;
  private List<KnowledgeGuestDocumentSuggestionResult> results = null;

  public KnowledgeGuestDocumentSuggestion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<KnowledgeGuestDocumentSuggestionResult>();
    }
  }

  
  /**
   * Query to get autocomplete suggestions for the matching knowledge documents.
   **/
  public KnowledgeGuestDocumentSuggestion query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Query to get autocomplete suggestions for the matching knowledge documents.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * Page size of the returned results.
   **/
  public KnowledgeGuestDocumentSuggestion pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page size of the returned results.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @ApiModelProperty(example = "null", value = "Session ID of the guest suggestions.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  @ApiModelProperty(example = "null", value = "Suggestions matching the query.")
  @JsonProperty("results")
  public List<KnowledgeGuestDocumentSuggestionResult> getResults() {
    return results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestDocumentSuggestion knowledgeGuestDocumentSuggestion = (KnowledgeGuestDocumentSuggestion) o;

    return Objects.equals(this.query, knowledgeGuestDocumentSuggestion.query) &&
            Objects.equals(this.pageSize, knowledgeGuestDocumentSuggestion.pageSize) &&
            Objects.equals(this.sessionId, knowledgeGuestDocumentSuggestion.sessionId) &&
            Objects.equals(this.results, knowledgeGuestDocumentSuggestion.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, sessionId, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestDocumentSuggestion {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

