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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.SuggestionKnowledgeAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SuggestionKnowledgeSearch
 */

public class SuggestionKnowledgeSearch  implements Serializable {
  
  private String title = null;
  private List<String> snippets = new ArrayList<String>();
  private Float confidence = null;
  private String searchId = null;
  private AddressableEntityRef document = null;
  private AddressableEntityRef version = null;
  private SuggestionKnowledgeAnswer knowledgeAnswer = null;
  private List<AddressableEntityRef> variations = new ArrayList<AddressableEntityRef>();

  
  @ApiModelProperty(example = "null", value = "The article title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }


  @ApiModelProperty(example = "null", value = "Snippets of text from the article matching the query.")
  @JsonProperty("snippets")
  public List<String> getSnippets() {
    return snippets;
  }


  @ApiModelProperty(example = "null", value = "Value between 0 and 1. 1 corresponds to very confident, 0 to not confident at all.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }


  @ApiModelProperty(example = "null", value = "The search id.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }


  @ApiModelProperty(example = "null", value = "The article matching the query.")
  @JsonProperty("document")
  public AddressableEntityRef getDocument() {
    return document;
  }


  @ApiModelProperty(example = "null", value = "The version of the article.")
  @JsonProperty("version")
  public AddressableEntityRef getVersion() {
    return version;
  }


  @ApiModelProperty(example = "null", value = "The most relevant answer within a searched article for the searched query")
  @JsonProperty("knowledgeAnswer")
  public SuggestionKnowledgeAnswer getKnowledgeAnswer() {
    return knowledgeAnswer;
  }


  @ApiModelProperty(example = "null", value = "Variations of the article.")
  @JsonProperty("variations")
  public List<AddressableEntityRef> getVariations() {
    return variations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionKnowledgeSearch suggestionKnowledgeSearch = (SuggestionKnowledgeSearch) o;

    return Objects.equals(this.title, suggestionKnowledgeSearch.title) &&
            Objects.equals(this.snippets, suggestionKnowledgeSearch.snippets) &&
            Objects.equals(this.confidence, suggestionKnowledgeSearch.confidence) &&
            Objects.equals(this.searchId, suggestionKnowledgeSearch.searchId) &&
            Objects.equals(this.document, suggestionKnowledgeSearch.document) &&
            Objects.equals(this.version, suggestionKnowledgeSearch.version) &&
            Objects.equals(this.knowledgeAnswer, suggestionKnowledgeSearch.knowledgeAnswer) &&
            Objects.equals(this.variations, suggestionKnowledgeSearch.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, snippets, confidence, searchId, document, version, knowledgeAnswer, variations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionKnowledgeSearch {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    snippets: ").append(toIndentedString(snippets)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    knowledgeAnswer: ").append(toIndentedString(knowledgeAnswer)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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

