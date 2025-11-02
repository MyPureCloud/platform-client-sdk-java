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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SuggestedSearchChunk
 */

public class SuggestedSearchChunk  implements Serializable {
  
  private String title = null;
  private String uri = null;
  private String chunkId = null;
  private String text = null;
  private Float confidence = null;
  private AddressableEntityRef document = null;

  public SuggestedSearchChunk() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The document title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }


  @ApiModelProperty(example = "null", value = "The document uri.")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }


  @ApiModelProperty(example = "null", value = "The chunk ID.")
  @JsonProperty("chunkId")
  public String getChunkId() {
    return chunkId;
  }


  @ApiModelProperty(example = "null", value = "The text of the knowledge chunk.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }


  @ApiModelProperty(example = "null", value = "Value between 0 and 1. 1 corresponds to very confident, 0 to not confident at all.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }


  @ApiModelProperty(example = "null", value = "The article.")
  @JsonProperty("document")
  public AddressableEntityRef getDocument() {
    return document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedSearchChunk suggestedSearchChunk = (SuggestedSearchChunk) o;

    return Objects.equals(this.title, suggestedSearchChunk.title) &&
            Objects.equals(this.uri, suggestedSearchChunk.uri) &&
            Objects.equals(this.chunkId, suggestedSearchChunk.chunkId) &&
            Objects.equals(this.text, suggestedSearchChunk.text) &&
            Objects.equals(this.confidence, suggestedSearchChunk.confidence) &&
            Objects.equals(this.document, suggestedSearchChunk.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, uri, chunkId, text, confidence, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedSearchChunk {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
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

