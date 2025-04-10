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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DocumentBodyImage;
import com.mypurecloud.sdk.v2.model.DocumentBodyVideo;
import com.mypurecloud.sdk.v2.model.DocumentText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentContentBlock
 */

public class DocumentContentBlock  implements Serializable {
  

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
   * The type of the paragraph block.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXT("Text"),
    IMAGE("Image"),
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
  private DocumentBodyVideo video = null;

  public DocumentContentBlock() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The type of the paragraph block.
   **/
  public DocumentContentBlock type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the paragraph block.")
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
  public DocumentContentBlock text(DocumentText text) {
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
  public DocumentContentBlock image(DocumentBodyImage image) {
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
  public DocumentContentBlock video(DocumentBodyVideo video) {
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
    DocumentContentBlock documentContentBlock = (DocumentContentBlock) o;

    return Objects.equals(this.type, documentContentBlock.type) &&
            Objects.equals(this.text, documentContentBlock.text) &&
            Objects.equals(this.image, documentContentBlock.image) &&
            Objects.equals(this.video, documentContentBlock.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, image, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentContentBlock {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

