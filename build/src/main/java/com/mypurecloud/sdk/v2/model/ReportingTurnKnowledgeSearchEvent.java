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
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingTurnKnowledgeSearchEvent
 */

public class ReportingTurnKnowledgeSearchEvent  implements Serializable {
  
  private String searchId = null;
  private String knowledgeBaseId = null;
  private List<ReportingTurnKnowledgeDocument> documents = null;
  private String searchQuery = null;
  private String answerDocumentId = null;

  public ReportingTurnKnowledgeSearchEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      documents = new ArrayList<ReportingTurnKnowledgeDocument>();
    }
  }

  
  /**
   * The ID of this knowledge search.
   **/
  public ReportingTurnKnowledgeSearchEvent searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of this knowledge search.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  /**
   * The Knowledge Base ID that the captured knowledge data relates to.
   **/
  public ReportingTurnKnowledgeSearchEvent knowledgeBaseId(String knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Knowledge Base ID that the captured knowledge data relates to.")
  @JsonProperty("knowledgeBaseId")
  public String getKnowledgeBaseId() {
    return knowledgeBaseId;
  }
  public void setKnowledgeBaseId(String knowledgeBaseId) {
    this.knowledgeBaseId = knowledgeBaseId;
  }


  /**
   * The list of search documents that the feedback applies to.
   **/
  public ReportingTurnKnowledgeSearchEvent documents(List<ReportingTurnKnowledgeDocument> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of search documents that the feedback applies to.")
  @JsonProperty("documents")
  public List<ReportingTurnKnowledgeDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<ReportingTurnKnowledgeDocument> documents) {
    this.documents = documents;
  }


  /**
   * The search query that was used to search the Knowledge Base documents for a matching question.
   **/
  public ReportingTurnKnowledgeSearchEvent searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search query that was used to search the Knowledge Base documents for a matching question.")
  @JsonProperty("searchQuery")
  public String getSearchQuery() {
    return searchQuery;
  }
  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }


  /**
   * The document ID of the search answer.
   **/
  public ReportingTurnKnowledgeSearchEvent answerDocumentId(String answerDocumentId) {
    this.answerDocumentId = answerDocumentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The document ID of the search answer.")
  @JsonProperty("answerDocumentId")
  public String getAnswerDocumentId() {
    return answerDocumentId;
  }
  public void setAnswerDocumentId(String answerDocumentId) {
    this.answerDocumentId = answerDocumentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnKnowledgeSearchEvent reportingTurnKnowledgeSearchEvent = (ReportingTurnKnowledgeSearchEvent) o;

    return Objects.equals(this.searchId, reportingTurnKnowledgeSearchEvent.searchId) &&
            Objects.equals(this.knowledgeBaseId, reportingTurnKnowledgeSearchEvent.knowledgeBaseId) &&
            Objects.equals(this.documents, reportingTurnKnowledgeSearchEvent.documents) &&
            Objects.equals(this.searchQuery, reportingTurnKnowledgeSearchEvent.searchQuery) &&
            Objects.equals(this.answerDocumentId, reportingTurnKnowledgeSearchEvent.answerDocumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, knowledgeBaseId, documents, searchQuery, answerDocumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledgeSearchEvent {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    knowledgeBaseId: ").append(toIndentedString(knowledgeBaseId)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    answerDocumentId: ").append(toIndentedString(answerDocumentId)).append("\n");
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

