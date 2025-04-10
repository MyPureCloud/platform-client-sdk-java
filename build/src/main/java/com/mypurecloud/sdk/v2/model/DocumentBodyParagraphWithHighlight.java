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
import com.mypurecloud.sdk.v2.model.DocumentBodyParagraphProperties;
import com.mypurecloud.sdk.v2.model.DocumentContentBlockWithHighlight;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentBodyParagraphWithHighlight
 */

public class DocumentBodyParagraphWithHighlight  implements Serializable {
  
  private List<DocumentContentBlockWithHighlight> blocks = null;
  private DocumentBodyParagraphProperties properties = null;

  public DocumentBodyParagraphWithHighlight() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      blocks = new ArrayList<DocumentContentBlockWithHighlight>();
    }
  }

  
  /**
   * The list of blocks for the paragraph.
   **/
  public DocumentBodyParagraphWithHighlight blocks(List<DocumentContentBlockWithHighlight> blocks) {
    this.blocks = blocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of blocks for the paragraph.")
  @JsonProperty("blocks")
  public List<DocumentContentBlockWithHighlight> getBlocks() {
    return blocks;
  }
  public void setBlocks(List<DocumentContentBlockWithHighlight> blocks) {
    this.blocks = blocks;
  }


  /**
   * The properties for the paragraph.
   **/
  public DocumentBodyParagraphWithHighlight properties(DocumentBodyParagraphProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The properties for the paragraph.")
  @JsonProperty("properties")
  public DocumentBodyParagraphProperties getProperties() {
    return properties;
  }
  public void setProperties(DocumentBodyParagraphProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyParagraphWithHighlight documentBodyParagraphWithHighlight = (DocumentBodyParagraphWithHighlight) o;

    return Objects.equals(this.blocks, documentBodyParagraphWithHighlight.blocks) &&
            Objects.equals(this.properties, documentBodyParagraphWithHighlight.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blocks, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyParagraphWithHighlight {\n");
    
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

