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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DocumentBodyListItemProperties;
import com.mypurecloud.sdk.v2.model.DocumentListContentBlock;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentBodyListBlock
 */

public class DocumentBodyListBlock  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the list block.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LISTITEM("ListItem");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private List<DocumentListContentBlock> blocks = new ArrayList<DocumentListContentBlock>();
  private DocumentBodyListItemProperties properties = null;

  
  /**
   * The type of the list block.
   **/
  public DocumentBodyListBlock type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the list block.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The list of items for an OrderedList or an UnorderedList.
   **/
  public DocumentBodyListBlock blocks(List<DocumentListContentBlock> blocks) {
    this.blocks = blocks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of items for an OrderedList or an UnorderedList.")
  @JsonProperty("blocks")
  public List<DocumentListContentBlock> getBlocks() {
    return blocks;
  }
  public void setBlocks(List<DocumentListContentBlock> blocks) {
    this.blocks = blocks;
  }


  /**
   * The properties for the list block.
   **/
  public DocumentBodyListBlock properties(DocumentBodyListItemProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The properties for the list block.")
  @JsonProperty("properties")
  public DocumentBodyListItemProperties getProperties() {
    return properties;
  }
  public void setProperties(DocumentBodyListItemProperties properties) {
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
    DocumentBodyListBlock documentBodyListBlock = (DocumentBodyListBlock) o;

    return Objects.equals(this.type, documentBodyListBlock.type) &&
            Objects.equals(this.blocks, documentBodyListBlock.blocks) &&
            Objects.equals(this.properties, documentBodyListBlock.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, blocks, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyListBlock {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

