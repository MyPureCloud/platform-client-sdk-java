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
import com.mypurecloud.sdk.v2.model.ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle
 */

public class ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle  implements Serializable {
  
  private String title = null;
  private String uri = null;
  private List<String> snippets = null;
  private Map<String, String> metadata = null;
  private String documentId = null;
  private String versionId = null;
  private List<String> variationIds = null;
  private ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer knowledgeAnswer = null;

  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      snippets = new ArrayList<String>();
      variationIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle title(String title) {
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
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle uri(String uri) {
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
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle snippets(List<String> snippets) {
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
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle metadata(Map<String, String> metadata) {
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
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle documentId(String documentId) {
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
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle versionId(String versionId) {
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
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle variationIds(List<String> variationIds) {
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
  public ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle knowledgeAnswer(ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer knowledgeAnswer) {
    this.knowledgeAnswer = knowledgeAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("knowledgeAnswer")
  public ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer getKnowledgeAnswer() {
    return knowledgeAnswer;
  }
  public void setKnowledgeAnswer(ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer knowledgeAnswer) {
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
    ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle conversationKnowledgeArticleSuggestionsTopicSuggestedArticle = (ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle) o;

    return Objects.equals(this.title, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.title) &&
            Objects.equals(this.uri, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.uri) &&
            Objects.equals(this.snippets, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.snippets) &&
            Objects.equals(this.metadata, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.metadata) &&
            Objects.equals(this.documentId, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.documentId) &&
            Objects.equals(this.versionId, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.versionId) &&
            Objects.equals(this.variationIds, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.variationIds) &&
            Objects.equals(this.knowledgeAnswer, conversationKnowledgeArticleSuggestionsTopicSuggestedArticle.knowledgeAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, uri, snippets, metadata, documentId, versionId, variationIds, knowledgeAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationKnowledgeArticleSuggestionsTopicSuggestedArticle {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    snippets: ").append(toIndentedString(snippets)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

