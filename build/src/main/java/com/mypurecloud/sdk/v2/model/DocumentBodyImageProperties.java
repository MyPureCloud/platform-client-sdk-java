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
 * DocumentBodyImageProperties
 */

public class DocumentBodyImageProperties  implements Serializable {
  
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
   * The align property for the image.
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
  private Float width = null;
  private DocumentElementLength widthWithUnit = null;
  private String altText = null;

  
  /**
   * The background color property for the image. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentBodyImageProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The background color property for the image. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * The align property for the image.
   **/
  public DocumentBodyImageProperties align(AlignEnum align) {
    this.align = align;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The align property for the image.")
  @JsonProperty("align")
  public AlignEnum getAlign() {
    return align;
  }
  public void setAlign(AlignEnum align) {
    this.align = align;
  }


  /**
   * The indentation property for the image. The valid values in 'em'.
   **/
  public DocumentBodyImageProperties indentation(Float indentation) {
    this.indentation = indentation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The indentation property for the image. The valid values in 'em'.")
  @JsonProperty("indentation")
  public Float getIndentation() {
    return indentation;
  }
  public void setIndentation(Float indentation) {
    this.indentation = indentation;
  }


  /**
   * The width of the image converted to em unit.
   **/
  public DocumentBodyImageProperties width(Float width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The width of the image converted to em unit.")
  @JsonProperty("width")
  public Float getWidth() {
    return width;
  }
  public void setWidth(Float width) {
    this.width = width;
  }


  /**
   * The width of the image in the specified unit.
   **/
  public DocumentBodyImageProperties widthWithUnit(DocumentElementLength widthWithUnit) {
    this.widthWithUnit = widthWithUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The width of the image in the specified unit.")
  @JsonProperty("widthWithUnit")
  public DocumentElementLength getWidthWithUnit() {
    return widthWithUnit;
  }
  public void setWidthWithUnit(DocumentElementLength widthWithUnit) {
    this.widthWithUnit = widthWithUnit;
  }


  /**
   * Alternate text for the image for accessibility and when the image can't be loaded.
   **/
  public DocumentBodyImageProperties altText(String altText) {
    this.altText = altText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alternate text for the image for accessibility and when the image can't be loaded.")
  @JsonProperty("altText")
  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyImageProperties documentBodyImageProperties = (DocumentBodyImageProperties) o;

    return Objects.equals(this.backgroundColor, documentBodyImageProperties.backgroundColor) &&
            Objects.equals(this.align, documentBodyImageProperties.align) &&
            Objects.equals(this.indentation, documentBodyImageProperties.indentation) &&
            Objects.equals(this.width, documentBodyImageProperties.width) &&
            Objects.equals(this.widthWithUnit, documentBodyImageProperties.widthWithUnit) &&
            Objects.equals(this.altText, documentBodyImageProperties.altText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, align, indentation, width, widthWithUnit, altText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyImageProperties {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    indentation: ").append(toIndentedString(indentation)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    widthWithUnit: ").append(toIndentedString(widthWithUnit)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
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

