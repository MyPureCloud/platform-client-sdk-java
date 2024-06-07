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
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingTurnKnowledgeFeedbackEvent
 */

public class ReportingTurnKnowledgeFeedbackEvent  implements Serializable {
  
  private String searchId = null;
  private String knowledgeBaseId = null;
  private List<ReportingTurnKnowledgeDocument> documents = new ArrayList<ReportingTurnKnowledgeDocument>();
  private Integer feedbackRating = null;
  private String documentVariationId = null;
  private String documentVersionId = null;

  
  /**
   * The ID of this knowledge search.
   **/
  public ReportingTurnKnowledgeFeedbackEvent searchId(String searchId) {
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
  public ReportingTurnKnowledgeFeedbackEvent knowledgeBaseId(String knowledgeBaseId) {
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
  public ReportingTurnKnowledgeFeedbackEvent documents(List<ReportingTurnKnowledgeDocument> documents) {
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
   * The feedback rating for the search (1.0 - 5.0). 1 = Negative, 5 = Positive.
   **/
  public ReportingTurnKnowledgeFeedbackEvent feedbackRating(Integer feedbackRating) {
    this.feedbackRating = feedbackRating;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The feedback rating for the search (1.0 - 5.0). 1 = Negative, 5 = Positive.")
  @JsonProperty("feedbackRating")
  public Integer getFeedbackRating() {
    return feedbackRating;
  }
  public void setFeedbackRating(Integer feedbackRating) {
    this.feedbackRating = feedbackRating;
  }


  /**
   * The variation of the document.
   **/
  public ReportingTurnKnowledgeFeedbackEvent documentVariationId(String documentVariationId) {
    this.documentVariationId = documentVariationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The variation of the document.")
  @JsonProperty("documentVariationId")
  public String getDocumentVariationId() {
    return documentVariationId;
  }
  public void setDocumentVariationId(String documentVariationId) {
    this.documentVariationId = documentVariationId;
  }


  /**
   * The version of the document.
   **/
  public ReportingTurnKnowledgeFeedbackEvent documentVersionId(String documentVersionId) {
    this.documentVersionId = documentVersionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the document.")
  @JsonProperty("documentVersionId")
  public String getDocumentVersionId() {
    return documentVersionId;
  }
  public void setDocumentVersionId(String documentVersionId) {
    this.documentVersionId = documentVersionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnKnowledgeFeedbackEvent reportingTurnKnowledgeFeedbackEvent = (ReportingTurnKnowledgeFeedbackEvent) o;

    return Objects.equals(this.searchId, reportingTurnKnowledgeFeedbackEvent.searchId) &&
            Objects.equals(this.knowledgeBaseId, reportingTurnKnowledgeFeedbackEvent.knowledgeBaseId) &&
            Objects.equals(this.documents, reportingTurnKnowledgeFeedbackEvent.documents) &&
            Objects.equals(this.feedbackRating, reportingTurnKnowledgeFeedbackEvent.feedbackRating) &&
            Objects.equals(this.documentVariationId, reportingTurnKnowledgeFeedbackEvent.documentVariationId) &&
            Objects.equals(this.documentVersionId, reportingTurnKnowledgeFeedbackEvent.documentVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, knowledgeBaseId, documents, feedbackRating, documentVariationId, documentVersionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledgeFeedbackEvent {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    knowledgeBaseId: ").append(toIndentedString(knowledgeBaseId)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    feedbackRating: ").append(toIndentedString(feedbackRating)).append("\n");
    sb.append("    documentVariationId: ").append(toIndentedString(documentVariationId)).append("\n");
    sb.append("    documentVersionId: ").append(toIndentedString(documentVersionId)).append("\n");
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

