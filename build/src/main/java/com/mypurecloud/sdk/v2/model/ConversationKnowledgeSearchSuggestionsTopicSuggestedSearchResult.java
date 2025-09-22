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
import com.mypurecloud.sdk.v2.model.ConversationKnowledgeSearchSuggestionsTopicKnowledgeAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult
 */

public class ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult  implements Serializable {
  
  private String title = null;
  private String uri = null;
  private List<String> snippets = null;
  private BigDecimal confidence = null;
  private Map<String, String> metadata = null;
  private String searchId = null;
  private String documentId = null;
  private String versionId = null;
  private List<String> variationIds = null;
  private ConversationKnowledgeSearchSuggestionsTopicKnowledgeAnswer knowledgeAnswer = null;

  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      snippets = new ArrayList<String>();
      variationIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult snippets(List<String> snippets) {
    this.snippets = snippets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("snippets")
  public List<String> getSnippets() {
    return snippets;
  }
  public void setSnippets(List<String> snippets) {
    this.snippets = snippets;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("confidence")
  public BigDecimal getConfidence() {
    return confidence;
  }
  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("versionId")
  public String getVersionId() {
    return versionId;
  }
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult variationIds(List<String> variationIds) {
    this.variationIds = variationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("variationIds")
  public List<String> getVariationIds() {
    return variationIds;
  }
  public void setVariationIds(List<String> variationIds) {
    this.variationIds = variationIds;
  }


  /**
   **/
  public ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult knowledgeAnswer(ConversationKnowledgeSearchSuggestionsTopicKnowledgeAnswer knowledgeAnswer) {
    this.knowledgeAnswer = knowledgeAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("knowledgeAnswer")
  public ConversationKnowledgeSearchSuggestionsTopicKnowledgeAnswer getKnowledgeAnswer() {
    return knowledgeAnswer;
  }
  public void setKnowledgeAnswer(ConversationKnowledgeSearchSuggestionsTopicKnowledgeAnswer knowledgeAnswer) {
    this.knowledgeAnswer = knowledgeAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult = (ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult) o;

    return Objects.equals(this.title, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.title) &&
            Objects.equals(this.uri, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.uri) &&
            Objects.equals(this.snippets, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.snippets) &&
            Objects.equals(this.confidence, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.confidence) &&
            Objects.equals(this.metadata, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.metadata) &&
            Objects.equals(this.searchId, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.searchId) &&
            Objects.equals(this.documentId, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.documentId) &&
            Objects.equals(this.versionId, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.versionId) &&
            Objects.equals(this.variationIds, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.variationIds) &&
            Objects.equals(this.knowledgeAnswer, conversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult.knowledgeAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, uri, snippets, confidence, metadata, searchId, documentId, versionId, variationIds, knowledgeAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    snippets: ").append(toIndentedString(snippets)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    variationIds: ").append(toIndentedString(variationIds)).append("\n");
    sb.append("    knowledgeAnswer: ").append(toIndentedString(knowledgeAnswer)).append("\n");
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

