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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentVariationSearchChunkBlock
 */

public class DocumentVariationSearchChunkBlock  implements Serializable {
  
  private String id = null;
  private String text = null;
  private Float confidence = null;

  public DocumentVariationSearchChunkBlock() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the chunk.
   **/
  public DocumentVariationSearchChunkBlock id(String id) {
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
  public DocumentVariationSearchChunkBlock text(String text) {
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
  public DocumentVariationSearchChunkBlock confidence(Float confidence) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentVariationSearchChunkBlock documentVariationSearchChunkBlock = (DocumentVariationSearchChunkBlock) o;

    return Objects.equals(this.id, documentVariationSearchChunkBlock.id) &&
            Objects.equals(this.text, documentVariationSearchChunkBlock.text) &&
            Objects.equals(this.confidence, documentVariationSearchChunkBlock.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVariationSearchChunkBlock {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

