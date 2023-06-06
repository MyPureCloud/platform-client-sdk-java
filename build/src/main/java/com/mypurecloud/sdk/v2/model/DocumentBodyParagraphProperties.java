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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DocumentBodyParagraphProperties
 */

public class DocumentBodyParagraphProperties  implements Serializable {
  

  private static class FontSizeEnumDeserializer extends StdDeserializer<FontSizeEnum> {
    public FontSizeEnumDeserializer() {
      super(FontSizeEnumDeserializer.class);
    }

    @Override
    public FontSizeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FontSizeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The font size for the paragraph. The valid values in 'em'.
   */
 @JsonDeserialize(using = FontSizeEnumDeserializer.class)
  public enum FontSizeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    XXSMALL("XxSmall"),
    XSMALL("XSmall"),
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large"),
    XLARGE("XLarge"),
    XXLARGE("XxLarge"),
    XXXLARGE("XxxLarge");

    private String value;

    FontSizeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FontSizeEnum fromString(String key) {
      if (key == null) return null;

      for (FontSizeEnum value : FontSizeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FontSizeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FontSizeEnum fontSize = null;

  private static class FontTypeEnumDeserializer extends StdDeserializer<FontTypeEnum> {
    public FontTypeEnumDeserializer() {
      super(FontTypeEnumDeserializer.class);
    }

    @Override
    public FontTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FontTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The font type for the paragraph.
   */
 @JsonDeserialize(using = FontTypeEnumDeserializer.class)
  public enum FontTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PARAGRAPH("Paragraph"),
    HEADING1("Heading1"),
    HEADING2("Heading2"),
    HEADING3("Heading3"),
    HEADING4("Heading4"),
    HEADING5("Heading5"),
    HEADING6("Heading6"),
    PREFORMATTED("Preformatted");

    private String value;

    FontTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FontTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FontTypeEnum value : FontTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FontTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FontTypeEnum fontType = null;
  private String textColor = null;
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
   * The align type for the paragraph.
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

  
  /**
   * The font size for the paragraph. The valid values in 'em'.
   **/
  public DocumentBodyParagraphProperties fontSize(FontSizeEnum fontSize) {
    this.fontSize = fontSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The font size for the paragraph. The valid values in 'em'.")
  @JsonProperty("fontSize")
  public FontSizeEnum getFontSize() {
    return fontSize;
  }
  public void setFontSize(FontSizeEnum fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * The font type for the paragraph.
   **/
  public DocumentBodyParagraphProperties fontType(FontTypeEnum fontType) {
    this.fontType = fontType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The font type for the paragraph.")
  @JsonProperty("fontType")
  public FontTypeEnum getFontType() {
    return fontType;
  }
  public void setFontType(FontTypeEnum fontType) {
    this.fontType = fontType;
  }


  /**
   * The text color for the paragraph. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentBodyParagraphProperties textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text color for the paragraph. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("textColor")
  public String getTextColor() {
    return textColor;
  }
  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  /**
   * The background color for the paragraph. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentBodyParagraphProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The background color for the paragraph. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * The align type for the paragraph.
   **/
  public DocumentBodyParagraphProperties align(AlignEnum align) {
    this.align = align;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The align type for the paragraph.")
  @JsonProperty("align")
  public AlignEnum getAlign() {
    return align;
  }
  public void setAlign(AlignEnum align) {
    this.align = align;
  }


  /**
   * The indentation color for the paragraph. The valid values in 'em'.
   **/
  public DocumentBodyParagraphProperties indentation(Float indentation) {
    this.indentation = indentation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The indentation color for the paragraph. The valid values in 'em'.")
  @JsonProperty("indentation")
  public Float getIndentation() {
    return indentation;
  }
  public void setIndentation(Float indentation) {
    this.indentation = indentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyParagraphProperties documentBodyParagraphProperties = (DocumentBodyParagraphProperties) o;

    return Objects.equals(this.fontSize, documentBodyParagraphProperties.fontSize) &&
            Objects.equals(this.fontType, documentBodyParagraphProperties.fontType) &&
            Objects.equals(this.textColor, documentBodyParagraphProperties.textColor) &&
            Objects.equals(this.backgroundColor, documentBodyParagraphProperties.backgroundColor) &&
            Objects.equals(this.align, documentBodyParagraphProperties.align) &&
            Objects.equals(this.indentation, documentBodyParagraphProperties.indentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontSize, fontType, textColor, backgroundColor, align, indentation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyParagraphProperties {\n");
    
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontType: ").append(toIndentedString(fontType)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    indentation: ").append(toIndentedString(indentation)).append("\n");
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

