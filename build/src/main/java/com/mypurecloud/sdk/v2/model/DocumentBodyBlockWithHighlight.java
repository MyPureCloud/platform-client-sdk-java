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
import com.mypurecloud.sdk.v2.model.DocumentBodyImage;
import com.mypurecloud.sdk.v2.model.DocumentBodyList;
import com.mypurecloud.sdk.v2.model.DocumentBodyParagraphWithHighlight;
import com.mypurecloud.sdk.v2.model.DocumentBodyTable;
import com.mypurecloud.sdk.v2.model.DocumentBodyVideo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentBodyBlockWithHighlight
 */

public class DocumentBodyBlockWithHighlight  implements Serializable {
  

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
   * The type of the block for the body. This determines which body block object (paragraph, list, video, image or table) would have a value.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PARAGRAPH("Paragraph"),
    IMAGE("Image"),
    VIDEO("Video"),
    ORDEREDLIST("OrderedList"),
    UNORDEREDLIST("UnorderedList"),
    TABLE("Table");

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
  private DocumentBodyImage image = null;
  private DocumentBodyVideo video = null;
  private DocumentBodyList list = null;
  private DocumentBodyTable table = null;
  private DocumentBodyParagraphWithHighlight paragraph = null;

  
  /**
   * The type of the block for the body. This determines which body block object (paragraph, list, video, image or table) would have a value.
   **/
  public DocumentBodyBlockWithHighlight type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the block for the body. This determines which body block object (paragraph, list, video, image or table) would have a value.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Image. It must contain a value if the type of the block is Image.
   **/
  public DocumentBodyBlockWithHighlight image(DocumentBodyImage image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Image. It must contain a value if the type of the block is Image.")
  @JsonProperty("image")
  public DocumentBodyImage getImage() {
    return image;
  }
  public void setImage(DocumentBodyImage image) {
    this.image = image;
  }


  /**
   * Video. It must contain a value if the type of the block is Video.
   **/
  public DocumentBodyBlockWithHighlight video(DocumentBodyVideo video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Video. It must contain a value if the type of the block is Video.")
  @JsonProperty("video")
  public DocumentBodyVideo getVideo() {
    return video;
  }
  public void setVideo(DocumentBodyVideo video) {
    this.video = video;
  }


  /**
   * List. It must contain a value if the type of the block is UnorderedList or OrderedList.
   **/
  public DocumentBodyBlockWithHighlight list(DocumentBodyList list) {
    this.list = list;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List. It must contain a value if the type of the block is UnorderedList or OrderedList.")
  @JsonProperty("list")
  public DocumentBodyList getList() {
    return list;
  }
  public void setList(DocumentBodyList list) {
    this.list = list;
  }


  /**
   * Table. It must contain a value if type of the block is Table.
   **/
  public DocumentBodyBlockWithHighlight table(DocumentBodyTable table) {
    this.table = table;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Table. It must contain a value if type of the block is Table.")
  @JsonProperty("table")
  public DocumentBodyTable getTable() {
    return table;
  }
  public void setTable(DocumentBodyTable table) {
    this.table = table;
  }


  /**
   * Paragraph. It must contain a value if the type of the block is Paragraph.
   **/
  public DocumentBodyBlockWithHighlight paragraph(DocumentBodyParagraphWithHighlight paragraph) {
    this.paragraph = paragraph;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Paragraph. It must contain a value if the type of the block is Paragraph.")
  @JsonProperty("paragraph")
  public DocumentBodyParagraphWithHighlight getParagraph() {
    return paragraph;
  }
  public void setParagraph(DocumentBodyParagraphWithHighlight paragraph) {
    this.paragraph = paragraph;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyBlockWithHighlight documentBodyBlockWithHighlight = (DocumentBodyBlockWithHighlight) o;

    return Objects.equals(this.type, documentBodyBlockWithHighlight.type) &&
            Objects.equals(this.image, documentBodyBlockWithHighlight.image) &&
            Objects.equals(this.video, documentBodyBlockWithHighlight.video) &&
            Objects.equals(this.list, documentBodyBlockWithHighlight.list) &&
            Objects.equals(this.table, documentBodyBlockWithHighlight.table) &&
            Objects.equals(this.paragraph, documentBodyBlockWithHighlight.paragraph);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, image, video, list, table, paragraph);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyBlockWithHighlight {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    paragraph: ").append(toIndentedString(paragraph)).append("\n");
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

