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
import com.mypurecloud.sdk.v2.model.DocumentQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeConversationContext;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchClientApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentChunkRequest
 */

public class KnowledgeDocumentChunkRequest  implements Serializable {
  
  private String query = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private DocumentQuery filter = null;

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
  private Boolean preprocessQuery = null;
  private Boolean includeDraftDocuments = null;
  private KnowledgeSearchClientApplication application = null;
  private KnowledgeConversationContext conversationContext = null;
  private Float confidenceThreshold = null;

  public KnowledgeDocumentChunkRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Query to search chunks in the knowledge base.
   **/
  public KnowledgeDocumentChunkRequest query(String query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Query to search chunks in the knowledge base.")
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
  public KnowledgeDocumentChunkRequest pageSize(Integer pageSize) {
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
  public KnowledgeDocumentChunkRequest pageNumber(Integer pageNumber) {
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
   * Filter for the document chunks.
   **/
  public KnowledgeDocumentChunkRequest filter(DocumentQuery filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter for the document chunks.")
  @JsonProperty("filter")
  public DocumentQuery getFilter() {
    return filter;
  }
  public void setFilter(DocumentQuery filter) {
    this.filter = filter;
  }


  /**
   * The type of the query that initiates the chunks search.
   **/
  public KnowledgeDocumentChunkRequest queryType(QueryTypeEnum queryType) {
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


  /**
   * Indicates whether the chunks search query should be preprocessed.
   **/
  public KnowledgeDocumentChunkRequest preprocessQuery(Boolean preprocessQuery) {
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
   * Indicates whether the chunk results would also include draft documents.
   **/
  public KnowledgeDocumentChunkRequest includeDraftDocuments(Boolean includeDraftDocuments) {
    this.includeDraftDocuments = includeDraftDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the chunk results would also include draft documents.")
  @JsonProperty("includeDraftDocuments")
  public Boolean getIncludeDraftDocuments() {
    return includeDraftDocuments;
  }
  public void setIncludeDraftDocuments(Boolean includeDraftDocuments) {
    this.includeDraftDocuments = includeDraftDocuments;
  }


  /**
   * The client application details from which chunks request was sent.
   **/
  public KnowledgeDocumentChunkRequest application(KnowledgeSearchClientApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client application details from which chunks request was sent.")
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
  public KnowledgeDocumentChunkRequest conversationContext(KnowledgeConversationContext conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation context information if the chunks search is initiated in the context of a conversation.")
  @JsonProperty("conversationContext")
  public KnowledgeConversationContext getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(KnowledgeConversationContext conversationContext) {
    this.conversationContext = conversationContext;
  }


  /**
   * The confidence threshold for the chunk results. If applied, the returned results will have an equal or higher confidence than the threshold. The value should be between 0 to 1.
   **/
  public KnowledgeDocumentChunkRequest confidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence threshold for the chunk results. If applied, the returned results will have an equal or higher confidence than the threshold. The value should be between 0 to 1.")
  @JsonProperty("confidenceThreshold")
  public Float getConfidenceThreshold() {
    return confidenceThreshold;
  }
  public void setConfidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentChunkRequest knowledgeDocumentChunkRequest = (KnowledgeDocumentChunkRequest) o;

    return Objects.equals(this.query, knowledgeDocumentChunkRequest.query) &&
            Objects.equals(this.pageSize, knowledgeDocumentChunkRequest.pageSize) &&
            Objects.equals(this.pageNumber, knowledgeDocumentChunkRequest.pageNumber) &&
            Objects.equals(this.filter, knowledgeDocumentChunkRequest.filter) &&
            Objects.equals(this.queryType, knowledgeDocumentChunkRequest.queryType) &&
            Objects.equals(this.preprocessQuery, knowledgeDocumentChunkRequest.preprocessQuery) &&
            Objects.equals(this.includeDraftDocuments, knowledgeDocumentChunkRequest.includeDraftDocuments) &&
            Objects.equals(this.application, knowledgeDocumentChunkRequest.application) &&
            Objects.equals(this.conversationContext, knowledgeDocumentChunkRequest.conversationContext) &&
            Objects.equals(this.confidenceThreshold, knowledgeDocumentChunkRequest.confidenceThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, pageNumber, filter, queryType, preprocessQuery, includeDraftDocuments, application, conversationContext, confidenceThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentChunkRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    preprocessQuery: ").append(toIndentedString(preprocessQuery)).append("\n");
    sb.append("    includeDraftDocuments: ").append(toIndentedString(includeDraftDocuments)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
    sb.append("    confidenceThreshold: ").append(toIndentedString(confidenceThreshold)).append("\n");
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

