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
import com.mypurecloud.sdk.v2.model.DocumentChunkReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentChunkBlock
 */

public class DocumentChunkBlock  implements Serializable {
  
  private String id = null;
  private String text = null;
  private Float confidence = null;
  private DocumentChunkReference document = null;

  public DocumentChunkBlock() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the chunk.
   **/
  public DocumentChunkBlock id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the chunk.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The chunk text associated with the variation.
   **/
  public DocumentChunkBlock text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The chunk text associated with the variation.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * The confidence associated with a chunk with respect to a search query.
   **/
  public DocumentChunkBlock confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence associated with a chunk with respect to a search query.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }
  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }


  /**
   * Reference to document associated with a chunk
   **/
  public DocumentChunkBlock document(DocumentChunkReference document) {
    this.document = document;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to document associated with a chunk")
  @JsonProperty("document")
  public DocumentChunkReference getDocument() {
    return document;
  }
  public void setDocument(DocumentChunkReference document) {
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
    DocumentChunkBlock documentChunkBlock = (DocumentChunkBlock) o;

    return Objects.equals(this.id, documentChunkBlock.id) &&
            Objects.equals(this.text, documentChunkBlock.text) &&
            Objects.equals(this.confidence, documentChunkBlock.confidence) &&
            Objects.equals(this.document, documentChunkBlock.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, confidence, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentChunkBlock {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

