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
import com.mypurecloud.sdk.v2.model.KnowledgeSearchDocumentResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentSearchResult
 */

public class KnowledgeDocumentSearchResult  implements Serializable {
  
  private Double confidence = null;
  private KnowledgeSearchDocumentResponse document = null;

  public KnowledgeDocumentSearchResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The confidence associated with a document with respect to a search query.
   **/
  public KnowledgeDocumentSearchResult confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence associated with a document with respect to a search query.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  /**
   * Document that matched the query.
   **/
  public KnowledgeDocumentSearchResult document(KnowledgeSearchDocumentResponse document) {
    this.document = document;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document that matched the query.")
  @JsonProperty("document")
  public KnowledgeSearchDocumentResponse getDocument() {
    return document;
  }
  public void setDocument(KnowledgeSearchDocumentResponse document) {
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
    KnowledgeDocumentSearchResult knowledgeDocumentSearchResult = (KnowledgeDocumentSearchResult) o;

    return Objects.equals(this.confidence, knowledgeDocumentSearchResult.confidence) &&
            Objects.equals(this.document, knowledgeDocumentSearchResult.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentSearchResult {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

