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
import com.mypurecloud.sdk.v2.model.DocumentBodyListBlock;
import com.mypurecloud.sdk.v2.model.DocumentBodyListBlockProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentBodyList
 */

public class DocumentBodyList  implements Serializable {
  
  private DocumentBodyListBlockProperties properties = null;
  private List<DocumentBodyListBlock> blocks = null;

  public DocumentBodyList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      blocks = new ArrayList<DocumentBodyListBlock>();
    }
  }

  
  /**
   * Properties for the UnorderedList or OrderedList.
   **/
  public DocumentBodyList properties(DocumentBodyListBlockProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for the UnorderedList or OrderedList.")
  @JsonProperty("properties")
  public DocumentBodyListBlockProperties getProperties() {
    return properties;
  }
  public void setProperties(DocumentBodyListBlockProperties properties) {
    this.properties = properties;
  }


  /**
   * The list of items for an OrderedList or an UnorderedList.
   **/
  public DocumentBodyList blocks(List<DocumentBodyListBlock> blocks) {
    this.blocks = blocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of items for an OrderedList or an UnorderedList.")
  @JsonProperty("blocks")
  public List<DocumentBodyListBlock> getBlocks() {
    return blocks;
  }
  public void setBlocks(List<DocumentBodyListBlock> blocks) {
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
    DocumentBodyList documentBodyList = (DocumentBodyList) o;

    return Objects.equals(this.properties, documentBodyList.properties) &&
            Objects.equals(this.blocks, documentBodyList.blocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, blocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyList {\n");
    
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

