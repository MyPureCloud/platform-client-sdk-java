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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.SuggestionKnowledgeAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SuggestionKnowledgeArticle
 */

public class SuggestionKnowledgeArticle  implements Serializable {
  
  private String title = null;
  private List<String> snippets = null;
  private AddressableEntityRef document = null;
  private AddressableEntityRef version = null;
  private SuggestionKnowledgeAnswer knowledgeAnswer = null;
  private List<AddressableEntityRef> variations = null;

  public SuggestionKnowledgeArticle() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      snippets = new ArrayList<String>();
      variations = new ArrayList<AddressableEntityRef>();
    }
  }

  
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


  @ApiModelProperty(example = "null", value = "The article.")
  @JsonProperty("document")
  public AddressableEntityRef getDocument() {
    return document;
  }


  @ApiModelProperty(example = "null", value = "The version of the article.")
  @JsonProperty("version")
  public AddressableEntityRef getVersion() {
    return version;
  }


  @ApiModelProperty(example = "null", value = "The most relevant answer within the suggested article.")
  @JsonProperty("knowledgeAnswer")
  public SuggestionKnowledgeAnswer getKnowledgeAnswer() {
    return knowledgeAnswer;
  }


  @ApiModelProperty(example = "null", value = "The variations of the article.")
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
    SuggestionKnowledgeArticle suggestionKnowledgeArticle = (SuggestionKnowledgeArticle) o;

    return Objects.equals(this.title, suggestionKnowledgeArticle.title) &&
            Objects.equals(this.snippets, suggestionKnowledgeArticle.snippets) &&
            Objects.equals(this.document, suggestionKnowledgeArticle.document) &&
            Objects.equals(this.version, suggestionKnowledgeArticle.version) &&
            Objects.equals(this.knowledgeAnswer, suggestionKnowledgeArticle.knowledgeAnswer) &&
            Objects.equals(this.variations, suggestionKnowledgeArticle.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, snippets, document, version, knowledgeAnswer, variations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionKnowledgeArticle {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    snippets: ").append(toIndentedString(snippets)).append("\n");
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

