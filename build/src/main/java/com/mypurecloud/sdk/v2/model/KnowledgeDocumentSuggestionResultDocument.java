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
import com.mypurecloud.sdk.v2.model.KnowledgeBaseReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentSuggestionResultDocument
 */

public class KnowledgeDocumentSuggestionResultDocument  implements Serializable {
  
  private String id = null;
  private KnowledgeBaseReference knowledgeBase = null;
  private String title = null;
  private String selfUri = null;

  public KnowledgeDocumentSuggestionResultDocument() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the document.
   **/
  public KnowledgeDocumentSuggestionResultDocument id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the document.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The knowledge base that the document belongs to.
   **/
  public KnowledgeDocumentSuggestionResultDocument knowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The knowledge base that the document belongs to.")
  @JsonProperty("knowledgeBase")
  public KnowledgeBaseReference getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * The title of the document.
   **/
  public KnowledgeDocumentSuggestionResultDocument title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The title of the document.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentSuggestionResultDocument knowledgeDocumentSuggestionResultDocument = (KnowledgeDocumentSuggestionResultDocument) o;

    return Objects.equals(this.id, knowledgeDocumentSuggestionResultDocument.id) &&
            Objects.equals(this.knowledgeBase, knowledgeDocumentSuggestionResultDocument.knowledgeBase) &&
            Objects.equals(this.title, knowledgeDocumentSuggestionResultDocument.title) &&
            Objects.equals(this.selfUri, knowledgeDocumentSuggestionResultDocument.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, knowledgeBase, title, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentSuggestionResultDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

