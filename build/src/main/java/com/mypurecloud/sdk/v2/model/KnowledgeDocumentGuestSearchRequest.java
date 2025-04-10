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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentGuestSearchRequest
 */

public class KnowledgeDocumentGuestSearchRequest  implements Serializable {
  
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
  private Integer answerHighlightTopResults = null;
  private Boolean includeDraftDocuments = null;

  public KnowledgeDocumentGuestSearchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Query to search content in the knowledge base. Maximum of 30 records per query can be fetched.
   **/
  public KnowledgeDocumentGuestSearchRequest query(String query) {
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
  public KnowledgeDocumentGuestSearchRequest pageSize(Integer pageSize) {
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
  public KnowledgeDocumentGuestSearchRequest pageNumber(Integer pageNumber) {
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
  public KnowledgeDocumentGuestSearchRequest queryType(QueryTypeEnum queryType) {
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


  /**
   * The number of articles to be sent for answer-highlighting. Can range from 1-5.
   * minimum: 1
   * maximum: 5
   **/
  public KnowledgeDocumentGuestSearchRequest answerHighlightTopResults(Integer answerHighlightTopResults) {
    this.answerHighlightTopResults = answerHighlightTopResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of articles to be sent for answer-highlighting. Can range from 1-5.")
  @JsonProperty("answerHighlightTopResults")
  public Integer getAnswerHighlightTopResults() {
    return answerHighlightTopResults;
  }
  public void setAnswerHighlightTopResults(Integer answerHighlightTopResults) {
    this.answerHighlightTopResults = answerHighlightTopResults;
  }


  /**
   * Indicates whether the search results would also include draft documents.
   **/
  public KnowledgeDocumentGuestSearchRequest includeDraftDocuments(Boolean includeDraftDocuments) {
    this.includeDraftDocuments = includeDraftDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the search results would also include draft documents.")
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
    KnowledgeDocumentGuestSearchRequest knowledgeDocumentGuestSearchRequest = (KnowledgeDocumentGuestSearchRequest) o;

    return Objects.equals(this.query, knowledgeDocumentGuestSearchRequest.query) &&
            Objects.equals(this.pageSize, knowledgeDocumentGuestSearchRequest.pageSize) &&
            Objects.equals(this.pageNumber, knowledgeDocumentGuestSearchRequest.pageNumber) &&
            Objects.equals(this.searchId, knowledgeDocumentGuestSearchRequest.searchId) &&
            Objects.equals(this.total, knowledgeDocumentGuestSearchRequest.total) &&
            Objects.equals(this.pageCount, knowledgeDocumentGuestSearchRequest.pageCount) &&
            Objects.equals(this.queryType, knowledgeDocumentGuestSearchRequest.queryType) &&
            Objects.equals(this.sessionId, knowledgeDocumentGuestSearchRequest.sessionId) &&
            Objects.equals(this.answerHighlightTopResults, knowledgeDocumentGuestSearchRequest.answerHighlightTopResults) &&
            Objects.equals(this.includeDraftDocuments, knowledgeDocumentGuestSearchRequest.includeDraftDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, pageNumber, searchId, total, pageCount, queryType, sessionId, answerHighlightTopResults, includeDraftDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentGuestSearchRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    answerHighlightTopResults: ").append(toIndentedString(answerHighlightTopResults)).append("\n");
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

