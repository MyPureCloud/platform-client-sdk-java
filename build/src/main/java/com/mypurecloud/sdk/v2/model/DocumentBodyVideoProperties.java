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
import com.mypurecloud.sdk.v2.model.DocumentElementLength;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentBodyVideoProperties
 */

public class DocumentBodyVideoProperties  implements Serializable {
  
  private String backgroundColor = null;

  private static class AlignEnumDeserializer extends StdDeserializer<AlignEnum> {
    public AlignEnumDeserializer() {
      super(AlignEnumDeserializer.class);
    }

    @Override
    public AlignEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlignEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The align type for the video.
   */
 @JsonDeserialize(using = AlignEnumDeserializer.class)
  public enum AlignEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CENTER("Center"),
    LEFT("Left"),
    RIGHT("Right"),
    JUSTIFY("Justify");

    private String value;

    AlignEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlignEnum fromString(String key) {
      if (key == null) return null;

      for (AlignEnum value : AlignEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlignEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AlignEnum align = null;
  private Float indentation = null;
  private DocumentElementLength width = null;
  private DocumentElementLength height = null;

  
  /**
   * The background color for the video. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentBodyVideoProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The background color for the video. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * The align type for the video.
   **/
  public DocumentBodyVideoProperties align(AlignEnum align) {
    this.align = align;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The align type for the video.")
  @JsonProperty("align")
  public AlignEnum getAlign() {
    return align;
  }
  public void setAlign(AlignEnum align) {
    this.align = align;
  }


  /**
   * The indentation for the video. The valid values in 'em'.
   **/
  public DocumentBodyVideoProperties indentation(Float indentation) {
    this.indentation = indentation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The indentation for the video. The valid values in 'em'.")
  @JsonProperty("indentation")
  public Float getIndentation() {
    return indentation;
  }
  public void setIndentation(Float indentation) {
    this.indentation = indentation;
  }


  /**
   * The width of the video in the specified unit.
   **/
  public DocumentBodyVideoProperties width(DocumentElementLength width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The width of the video in the specified unit.")
  @JsonProperty("width")
  public DocumentElementLength getWidth() {
    return width;
  }
  public void setWidth(DocumentElementLength width) {
    this.width = width;
  }


  /**
   * The height of the video in the specified unit.
   **/
  public DocumentBodyVideoProperties height(DocumentElementLength height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The height of the video in the specified unit.")
  @JsonProperty("height")
  public DocumentElementLength getHeight() {
    return height;
  }
  public void setHeight(DocumentElementLength height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyVideoProperties documentBodyVideoProperties = (DocumentBodyVideoProperties) o;

    return Objects.equals(this.backgroundColor, documentBodyVideoProperties.backgroundColor) &&
            Objects.equals(this.align, documentBodyVideoProperties.align) &&
            Objects.equals(this.indentation, documentBodyVideoProperties.indentation) &&
            Objects.equals(this.width, documentBodyVideoProperties.width) &&
            Objects.equals(this.height, documentBodyVideoProperties.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, align, indentation, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyVideoProperties {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    indentation: ").append(toIndentedString(indentation)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

