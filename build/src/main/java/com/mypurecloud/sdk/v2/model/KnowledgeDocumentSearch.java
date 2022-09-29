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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearchResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentSearch
 */

public class KnowledgeDocumentSearch  implements Serializable {
  
  private String query = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private String searchId = null;
  private Integer total = null;
  private Integer pageCount = null;
  private List<KnowledgeDocumentSearchResult> results = null;

  
  /**
   * Query to search content in the knowledge base. Maximum of 30 records per query can be fetched.
   **/
  public KnowledgeDocumentSearch query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Query to search content in the knowledge base. Maximum of 30 records per query can be fetched.")
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
  public KnowledgeDocumentSearch pageSize(Integer pageSize) {
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
   * Page number of the returned results.
   **/
  public KnowledgeDocumentSearch pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page number of the returned results.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  @ApiModelProperty(example = "null", value = "The globally unique identifier for the search.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }


  @ApiModelProperty(example = "null", value = "The total number of documents matching the query.")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }


  @ApiModelProperty(example = "null", value = "Number of pages returned in the result calculated according to the pageSize and the total")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }


  @ApiModelProperty(example = "null", value = "Documents matching the search query.")
  @JsonProperty("results")
  public List<KnowledgeDocumentSearchResult> getResults() {
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
    KnowledgeDocumentSearch knowledgeDocumentSearch = (KnowledgeDocumentSearch) o;

    return Objects.equals(this.query, knowledgeDocumentSearch.query) &&
            Objects.equals(this.pageSize, knowledgeDocumentSearch.pageSize) &&
            Objects.equals(this.pageNumber, knowledgeDocumentSearch.pageNumber) &&
            Objects.equals(this.searchId, knowledgeDocumentSearch.searchId) &&
            Objects.equals(this.total, knowledgeDocumentSearch.total) &&
            Objects.equals(this.pageCount, knowledgeDocumentSearch.pageCount) &&
            Objects.equals(this.results, knowledgeDocumentSearch.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, pageNumber, searchId, total, pageCount, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentSearch {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

