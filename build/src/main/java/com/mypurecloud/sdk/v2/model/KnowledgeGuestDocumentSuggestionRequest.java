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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeGuestDocumentSuggestionRequest
 */

public class KnowledgeGuestDocumentSuggestionRequest  implements Serializable {
  
  private String query = null;
  private Integer pageSize = null;
  private Boolean includeDraftDocuments = null;

  public KnowledgeGuestDocumentSuggestionRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Query to get autocomplete suggestions for the matching knowledge documents.
   **/
  public KnowledgeGuestDocumentSuggestionRequest query(String query) {
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
  public KnowledgeGuestDocumentSuggestionRequest pageSize(Integer pageSize) {
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


  /**
   * Indicates whether the suggestion results would also include draft documents.
   **/
  public KnowledgeGuestDocumentSuggestionRequest includeDraftDocuments(Boolean includeDraftDocuments) {
    this.includeDraftDocuments = includeDraftDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the suggestion results would also include draft documents.")
  @JsonProperty("includeDraftDocuments")
  public Boolean getIncludeDraftDocuments() {
    return includeDraftDocuments;
  }
  public void setIncludeDraftDocuments(Boolean includeDraftDocuments) {
    this.includeDraftDocuments = includeDraftDocuments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestDocumentSuggestionRequest knowledgeGuestDocumentSuggestionRequest = (KnowledgeGuestDocumentSuggestionRequest) o;

    return Objects.equals(this.query, knowledgeGuestDocumentSuggestionRequest.query) &&
            Objects.equals(this.pageSize, knowledgeGuestDocumentSuggestionRequest.pageSize) &&
            Objects.equals(this.includeDraftDocuments, knowledgeGuestDocumentSuggestionRequest.includeDraftDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, includeDraftDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestDocumentSuggestionRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    includeDraftDocuments: ").append(toIndentedString(includeDraftDocuments)).append("\n");
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

