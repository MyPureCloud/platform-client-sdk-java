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
import com.mypurecloud.sdk.v2.model.DocumentChunkBlock;
import com.mypurecloud.sdk.v2.model.KnowledgeConversationContextResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchClientApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentChunkResponse
 */

public class KnowledgeDocumentChunkResponse  implements Serializable {
  
  private String query = null;
  private Integer total = null;
  private Integer pageCount = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;

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
   * The type of the query that initiates the chunks search.
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
  private String searchId = null;
  private Boolean preprocessQuery = null;
  private Float confidenceThreshold = null;
  private List<DocumentChunkBlock> results = null;
  private KnowledgeSearchClientApplication application = null;
  private KnowledgeConversationContextResponse conversationContext = null;

  public KnowledgeDocumentChunkResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<DocumentChunkBlock>();
    }
  }

  
  /**
   * Query to search chunks in the knowledge base.
   **/
  public KnowledgeDocumentChunkResponse query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query to search chunks in the knowledge base.")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  @ApiModelProperty(example = "null", value = "The total number of chunks matching the query.")
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
   * Page size of the returned results.
   **/
  public KnowledgeDocumentChunkResponse pageSize(Integer pageSize) {
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
  public KnowledgeDocumentChunkResponse pageNumber(Integer pageNumber) {
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


  /**
   * The type of the query that initiates the chunks search.
   **/
  public KnowledgeDocumentChunkResponse queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the query that initiates the chunks search.")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  @ApiModelProperty(example = "null", value = "The globally unique identifier for the chunks search.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }


  /**
   * Indicates whether the chunks search query should be preprocessed.
   **/
  public KnowledgeDocumentChunkResponse preprocessQuery(Boolean preprocessQuery) {
    this.preprocessQuery = preprocessQuery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the chunks search query should be preprocessed.")
  @JsonProperty("preprocessQuery")
  public Boolean getPreprocessQuery() {
    return preprocessQuery;
  }
  public void setPreprocessQuery(Boolean preprocessQuery) {
    this.preprocessQuery = preprocessQuery;
  }


  /**
   * The confidence threshold for the chunk results. If applied, the returned results will have an equal or higher chunk confidence than the threshold.
   **/
  public KnowledgeDocumentChunkResponse confidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence threshold for the chunk results. If applied, the returned results will have an equal or higher chunk confidence than the threshold.")
  @JsonProperty("confidenceThreshold")
  public Float getConfidenceThreshold() {
    return confidenceThreshold;
  }
  public void setConfidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }


  /**
   * Chunks matching the search query.
   **/
  public KnowledgeDocumentChunkResponse results(List<DocumentChunkBlock> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Chunks matching the search query.")
  @JsonProperty("results")
  public List<DocumentChunkBlock> getResults() {
    return results;
  }
  public void setResults(List<DocumentChunkBlock> results) {
    this.results = results;
  }


  /**
   * The client application details from which chunks search happened.
   **/
  public KnowledgeDocumentChunkResponse application(KnowledgeSearchClientApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client application details from which chunks search happened.")
  @JsonProperty("application")
  public KnowledgeSearchClientApplication getApplication() {
    return application;
  }
  public void setApplication(KnowledgeSearchClientApplication application) {
    this.application = application;
  }


  /**
   * Conversation context information if the chunks search is initiated in the context of a conversation.
   **/
  public KnowledgeDocumentChunkResponse conversationContext(KnowledgeConversationContextResponse conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation context information if the chunks search is initiated in the context of a conversation.")
  @JsonProperty("conversationContext")
  public KnowledgeConversationContextResponse getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(KnowledgeConversationContextResponse conversationContext) {
    this.conversationContext = conversationContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentChunkResponse knowledgeDocumentChunkResponse = (KnowledgeDocumentChunkResponse) o;

    return Objects.equals(this.query, knowledgeDocumentChunkResponse.query) &&
            Objects.equals(this.total, knowledgeDocumentChunkResponse.total) &&
            Objects.equals(this.pageCount, knowledgeDocumentChunkResponse.pageCount) &&
            Objects.equals(this.pageSize, knowledgeDocumentChunkResponse.pageSize) &&
            Objects.equals(this.pageNumber, knowledgeDocumentChunkResponse.pageNumber) &&
            Objects.equals(this.queryType, knowledgeDocumentChunkResponse.queryType) &&
            Objects.equals(this.searchId, knowledgeDocumentChunkResponse.searchId) &&
            Objects.equals(this.preprocessQuery, knowledgeDocumentChunkResponse.preprocessQuery) &&
            Objects.equals(this.confidenceThreshold, knowledgeDocumentChunkResponse.confidenceThreshold) &&
            Objects.equals(this.results, knowledgeDocumentChunkResponse.results) &&
            Objects.equals(this.application, knowledgeDocumentChunkResponse.application) &&
            Objects.equals(this.conversationContext, knowledgeDocumentChunkResponse.conversationContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, total, pageCount, pageSize, pageNumber, queryType, searchId, preprocessQuery, confidenceThreshold, results, application, conversationContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentChunkResponse {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    preprocessQuery: ").append(toIndentedString(preprocessQuery)).append("\n");
    sb.append("    confidenceThreshold: ").append(toIndentedString(confidenceThreshold)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
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

