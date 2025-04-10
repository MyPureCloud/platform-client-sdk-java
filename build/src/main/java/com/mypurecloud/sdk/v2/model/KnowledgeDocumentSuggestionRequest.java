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
import com.mypurecloud.sdk.v2.model.DocumentQuery;
import com.mypurecloud.sdk.v2.model.DocumentQueryInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentSuggestionRequest
 */

public class KnowledgeDocumentSuggestionRequest  implements Serializable {
  
  private String query = null;
  private Integer pageSize = null;
  private Boolean includeDraftDocuments = null;
  private DocumentQueryInterval interval = null;
  private DocumentQuery filter = null;

  public KnowledgeDocumentSuggestionRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Query to get autocomplete suggestions for the matching knowledge documents.
   **/
  public KnowledgeDocumentSuggestionRequest query(String query) {
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
  public KnowledgeDocumentSuggestionRequest pageSize(Integer pageSize) {
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
  public KnowledgeDocumentSuggestionRequest includeDraftDocuments(Boolean includeDraftDocuments) {
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


  /**
   * Retrieves the documents created/modified/published in specified date and time range.
   **/
  public KnowledgeDocumentSuggestionRequest interval(DocumentQueryInterval interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retrieves the documents created/modified/published in specified date and time range.")
  @JsonProperty("interval")
  public DocumentQueryInterval getInterval() {
    return interval;
  }
  public void setInterval(DocumentQueryInterval interval) {
    this.interval = interval;
  }


  /**
   * Filter for the document suggestions.
   **/
  public KnowledgeDocumentSuggestionRequest filter(DocumentQuery filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter for the document suggestions.")
  @JsonProperty("filter")
  public DocumentQuery getFilter() {
    return filter;
  }
  public void setFilter(DocumentQuery filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentSuggestionRequest knowledgeDocumentSuggestionRequest = (KnowledgeDocumentSuggestionRequest) o;

    return Objects.equals(this.query, knowledgeDocumentSuggestionRequest.query) &&
            Objects.equals(this.pageSize, knowledgeDocumentSuggestionRequest.pageSize) &&
            Objects.equals(this.includeDraftDocuments, knowledgeDocumentSuggestionRequest.includeDraftDocuments) &&
            Objects.equals(this.interval, knowledgeDocumentSuggestionRequest.interval) &&
            Objects.equals(this.filter, knowledgeDocumentSuggestionRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, includeDraftDocuments, interval, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentSuggestionRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    includeDraftDocuments: ").append(toIndentedString(includeDraftDocuments)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

