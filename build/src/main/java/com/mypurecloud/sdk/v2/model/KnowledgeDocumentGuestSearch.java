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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearchResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentGuestSearch
 */

public class KnowledgeDocumentGuestSearch  implements Serializable {
  
  private String query = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private String searchId = null;
  private Integer total = null;
  private Integer pageCount = null;

  private static class QueryTypeEnumDeserializer extends StdDeserializer<QueryTypeEnum> {
    public QueryTypeEnumDeserializer() {
      super(QueryTypeEnumDeserializer.class);
    }

    @Override
    public QueryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QueryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the query that initiates the search.
   */
 @JsonDeserialize(using = QueryTypeEnumDeserializer.class)
  public enum QueryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUTOSEARCH("AutoSearch"),
    MANUALSEARCH("ManualSearch"),
    SUGGESTION("Suggestion");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QueryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (QueryTypeEnum value : QueryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QueryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QueryTypeEnum queryType = null;
  private String sessionId = null;
  private List<KnowledgeDocumentGuestSearchResult> results = new ArrayList<KnowledgeDocumentGuestSearchResult>();

  
  /**
   * Query to search content in the knowledge base. Maximum of 30 records per query can be fetched.
   **/
  public KnowledgeDocumentGuestSearch query(String query) {
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
  public KnowledgeDocumentGuestSearch pageSize(Integer pageSize) {
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
  public KnowledgeDocumentGuestSearch pageNumber(Integer pageNumber) {
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


  /**
   * The type of the query that initiates the search.
   **/
  public KnowledgeDocumentGuestSearch queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the query that initiates the search.")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  @ApiModelProperty(example = "null", value = "Session ID of the search.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  @ApiModelProperty(example = "null", value = "Documents that matched the search query.")
  @JsonProperty("results")
  public List<KnowledgeDocumentGuestSearchResult> getResults() {
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
    KnowledgeDocumentGuestSearch knowledgeDocumentGuestSearch = (KnowledgeDocumentGuestSearch) o;

    return Objects.equals(this.query, knowledgeDocumentGuestSearch.query) &&
            Objects.equals(this.pageSize, knowledgeDocumentGuestSearch.pageSize) &&
            Objects.equals(this.pageNumber, knowledgeDocumentGuestSearch.pageNumber) &&
            Objects.equals(this.searchId, knowledgeDocumentGuestSearch.searchId) &&
            Objects.equals(this.total, knowledgeDocumentGuestSearch.total) &&
            Objects.equals(this.pageCount, knowledgeDocumentGuestSearch.pageCount) &&
            Objects.equals(this.queryType, knowledgeDocumentGuestSearch.queryType) &&
            Objects.equals(this.sessionId, knowledgeDocumentGuestSearch.sessionId) &&
            Objects.equals(this.results, knowledgeDocumentGuestSearch.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, pageNumber, searchId, total, pageCount, queryType, sessionId, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentGuestSearch {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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

