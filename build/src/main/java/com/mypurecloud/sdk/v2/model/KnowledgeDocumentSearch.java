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
import com.mypurecloud.sdk.v2.model.KnowledgeAnswerGenerationResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeConversationContextResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearchResult;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchClientApplication;
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
  private List<KnowledgeDocumentSearchResult> results = null;
  private KnowledgeSearchClientApplication application = null;
  private KnowledgeConversationContextResponse conversationContext = null;
  private Float confidenceThreshold = null;
  private KnowledgeAnswerGenerationResponse answerGeneration = null;
  private Boolean preprocessQuery = null;

  public KnowledgeDocumentSearch() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<KnowledgeDocumentSearchResult>();
    }
  }

  
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


  /**
   * The type of the query that initiates the search.
   **/
  public KnowledgeDocumentSearch queryType(QueryTypeEnum queryType) {
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


  @ApiModelProperty(example = "null", value = "Documents matching the search query.")
  @JsonProperty("results")
  public List<KnowledgeDocumentSearchResult> getResults() {
    return results;
  }


  /**
   * The client application details from which search happened.
   **/
  public KnowledgeDocumentSearch application(KnowledgeSearchClientApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client application details from which search happened.")
  @JsonProperty("application")
  public KnowledgeSearchClientApplication getApplication() {
    return application;
  }
  public void setApplication(KnowledgeSearchClientApplication application) {
    this.application = application;
  }


  /**
   * Conversation context information if the search is initiated in the context of a conversation.
   **/
  public KnowledgeDocumentSearch conversationContext(KnowledgeConversationContextResponse conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation context information if the search is initiated in the context of a conversation.")
  @JsonProperty("conversationContext")
  public KnowledgeConversationContextResponse getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(KnowledgeConversationContextResponse conversationContext) {
    this.conversationContext = conversationContext;
  }


  /**
   * The confidence threshold for the search results. If applied, the returned results will have an equal or higher confidence than the threshold.
   **/
  public KnowledgeDocumentSearch confidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence threshold for the search results. If applied, the returned results will have an equal or higher confidence than the threshold.")
  @JsonProperty("confidenceThreshold")
  public Float getConfidenceThreshold() {
    return confidenceThreshold;
  }
  public void setConfidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }


  /**
   * The results with AI-generated answer if the answerMode request property contains \"AnswerGeneration\".
   **/
  public KnowledgeDocumentSearch answerGeneration(KnowledgeAnswerGenerationResponse answerGeneration) {
    this.answerGeneration = answerGeneration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results with AI-generated answer if the answerMode request property contains \"AnswerGeneration\".")
  @JsonProperty("answerGeneration")
  public KnowledgeAnswerGenerationResponse getAnswerGeneration() {
    return answerGeneration;
  }
  public void setAnswerGeneration(KnowledgeAnswerGenerationResponse answerGeneration) {
    this.answerGeneration = answerGeneration;
  }


  /**
   * Indicates whether the search query should be preprocessed.
   **/
  public KnowledgeDocumentSearch preprocessQuery(Boolean preprocessQuery) {
    this.preprocessQuery = preprocessQuery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the search query should be preprocessed.")
  @JsonProperty("preprocessQuery")
  public Boolean getPreprocessQuery() {
    return preprocessQuery;
  }
  public void setPreprocessQuery(Boolean preprocessQuery) {
    this.preprocessQuery = preprocessQuery;
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
            Objects.equals(this.queryType, knowledgeDocumentSearch.queryType) &&
            Objects.equals(this.results, knowledgeDocumentSearch.results) &&
            Objects.equals(this.application, knowledgeDocumentSearch.application) &&
            Objects.equals(this.conversationContext, knowledgeDocumentSearch.conversationContext) &&
            Objects.equals(this.confidenceThreshold, knowledgeDocumentSearch.confidenceThreshold) &&
            Objects.equals(this.answerGeneration, knowledgeDocumentSearch.answerGeneration) &&
            Objects.equals(this.preprocessQuery, knowledgeDocumentSearch.preprocessQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, pageNumber, searchId, total, pageCount, queryType, results, application, conversationContext, confidenceThreshold, answerGeneration, preprocessQuery);
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
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
    sb.append("    confidenceThreshold: ").append(toIndentedString(confidenceThreshold)).append("\n");
    sb.append("    answerGeneration: ").append(toIndentedString(answerGeneration)).append("\n");
    sb.append("    preprocessQuery: ").append(toIndentedString(preprocessQuery)).append("\n");
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

