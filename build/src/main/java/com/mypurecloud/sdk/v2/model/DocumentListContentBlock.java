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
import com.mypurecloud.sdk.v2.model.DocumentBodyVideo;
import com.mypurecloud.sdk.v2.model.DocumentText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentListContentBlock
 */

public class DocumentListContentBlock  implements Serializable {
  

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
    TEXT("Text"),
    IMAGE("Image"),
    ORDEREDLIST("OrderedList"),
    UNORDEREDLIST("UnorderedList"),
    VIDEO("Video");

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
  private DocumentText text = null;
  private DocumentBodyImage image = null;
  private DocumentBodyList list = null;
  private DocumentBodyVideo video = null;

  
  /**
   * The type of the list block.
   **/
  public DocumentListContentBlock type(TypeEnum type) {
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
   * Text. It must contain a value if the type of the block is Text.
   **/
  public DocumentListContentBlock text(DocumentText text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text. It must contain a value if the type of the block is Text.")
  @JsonProperty("text")
  public DocumentText getText() {
    return text;
  }
  public void setText(DocumentText text) {
    this.text = text;
  }


  /**
   * Image. It must contain a value if the type of the block is Image.
   **/
  public DocumentListContentBlock image(DocumentBodyImage image) {
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
   * List. It must contain a value if the type of the block is UnorderedList or OrderedList.
   **/
  public DocumentListContentBlock list(DocumentBodyList list) {
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
   * Video. It must contain a value if the type of the block is Video.
   **/
  public DocumentListContentBlock video(DocumentBodyVideo video) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentListContentBlock documentListContentBlock = (DocumentListContentBlock) o;

    return Objects.equals(this.type, documentListContentBlock.type) &&
            Objects.equals(this.text, documentListContentBlock.text) &&
            Objects.equals(this.image, documentListContentBlock.image) &&
            Objects.equals(this.list, documentListContentBlock.list) &&
            Objects.equals(this.video, documentListContentBlock.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, image, list, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentListContentBlock {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

