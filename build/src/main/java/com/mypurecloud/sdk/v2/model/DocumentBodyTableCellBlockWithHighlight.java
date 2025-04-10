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
import com.mypurecloud.sdk.v2.model.DocumentBodyTableCellBlockProperties;
import com.mypurecloud.sdk.v2.model.DocumentTableContentBlockWithHighlight;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentBodyTableCellBlockWithHighlight
 */

public class DocumentBodyTableCellBlockWithHighlight  implements Serializable {
  
  private DocumentBodyTableCellBlockProperties properties = null;
  private List<DocumentTableContentBlockWithHighlight> blocks = null;

  public DocumentBodyTableCellBlockWithHighlight() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      blocks = new ArrayList<DocumentTableContentBlockWithHighlight>();
    }
  }

  
  /**
   * The properties for the table cell.
   **/
  public DocumentBodyTableCellBlockWithHighlight properties(DocumentBodyTableCellBlockProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The properties for the table cell.")
  @JsonProperty("properties")
  public DocumentBodyTableCellBlockProperties getProperties() {
    return properties;
  }
  public void setProperties(DocumentBodyTableCellBlockProperties properties) {
    this.properties = properties;
  }


  /**
   * The list of content blocks for the table.
   **/
  public DocumentBodyTableCellBlockWithHighlight blocks(List<DocumentTableContentBlockWithHighlight> blocks) {
    this.blocks = blocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of content blocks for the table.")
  @JsonProperty("blocks")
  public List<DocumentTableContentBlockWithHighlight> getBlocks() {
    return blocks;
  }
  public void setBlocks(List<DocumentTableContentBlockWithHighlight> blocks) {
    this.blocks = blocks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyTableCellBlockWithHighlight documentBodyTableCellBlockWithHighlight = (DocumentBodyTableCellBlockWithHighlight) o;

    return Objects.equals(this.properties, documentBodyTableCellBlockWithHighlight.properties) &&
            Objects.equals(this.blocks, documentBodyTableCellBlockWithHighlight.blocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, blocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyTableCellBlockWithHighlight {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
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

