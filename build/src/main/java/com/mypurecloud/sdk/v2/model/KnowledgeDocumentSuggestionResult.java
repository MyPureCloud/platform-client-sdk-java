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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSuggestionResultDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentSuggestionResult
 */

public class KnowledgeDocumentSuggestionResult  implements Serializable {
  
  private String matchedPhrase = null;
  private KnowledgeDocumentSuggestionResultDocument document = null;

  
  /**
   * Matched phrase to the autocomplete suggestions query.
   **/
  public KnowledgeDocumentSuggestionResult matchedPhrase(String matchedPhrase) {
    this.matchedPhrase = matchedPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Matched phrase to the autocomplete suggestions query.")
  @JsonProperty("matchedPhrase")
  public String getMatchedPhrase() {
    return matchedPhrase;
  }
  public void setMatchedPhrase(String matchedPhrase) {
    this.matchedPhrase = matchedPhrase;
  }


  /**
   **/
  public KnowledgeDocumentSuggestionResult document(KnowledgeDocumentSuggestionResultDocument document) {
    this.document = document;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("document")
  public KnowledgeDocumentSuggestionResultDocument getDocument() {
    return document;
  }
  public void setDocument(KnowledgeDocumentSuggestionResultDocument document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentSuggestionResult knowledgeDocumentSuggestionResult = (KnowledgeDocumentSuggestionResult) o;

    return Objects.equals(this.matchedPhrase, knowledgeDocumentSuggestionResult.matchedPhrase) &&
            Objects.equals(this.document, knowledgeDocumentSuggestionResult.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchedPhrase, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentSuggestionResult {\n");
    
    sb.append("    matchedPhrase: ").append(toIndentedString(matchedPhrase)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

