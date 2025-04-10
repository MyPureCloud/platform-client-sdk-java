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
import com.mypurecloud.sdk.v2.model.DocumentBodyTableCaptionItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentBodyTableCaptionBlock
 */

public class DocumentBodyTableCaptionBlock  implements Serializable {
  
  private List<DocumentBodyTableCaptionItem> blocks = null;

  public DocumentBodyTableCaptionBlock() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      blocks = new ArrayList<DocumentBodyTableCaptionItem>();
    }
  }

  
  /**
   * The list of building blocks for the caption property.
   **/
  public DocumentBodyTableCaptionBlock blocks(List<DocumentBodyTableCaptionItem> blocks) {
    this.blocks = blocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of building blocks for the caption property.")
  @JsonProperty("blocks")
  public List<DocumentBodyTableCaptionItem> getBlocks() {
    return blocks;
  }
  public void setBlocks(List<DocumentBodyTableCaptionItem> blocks) {
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
    DocumentBodyTableCaptionBlock documentBodyTableCaptionBlock = (DocumentBodyTableCaptionBlock) o;

    return Objects.equals(this.blocks, documentBodyTableCaptionBlock.blocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyTableCaptionBlock {\n");
    
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

