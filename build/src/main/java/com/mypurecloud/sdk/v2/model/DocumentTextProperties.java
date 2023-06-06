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
 * DocumentTextProperties
 */

public class DocumentTextProperties  implements Serializable {
  

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
   * The font size for the text. The valid values in 'em'.
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
  private String textColor = null;
  private String backgroundColor = null;

  
  /**
   * The font size for the text. The valid values in 'em'.
   **/
  public DocumentTextProperties fontSize(FontSizeEnum fontSize) {
    this.fontSize = fontSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The font size for the text. The valid values in 'em'.")
  @JsonProperty("fontSize")
  public FontSizeEnum getFontSize() {
    return fontSize;
  }
  public void setFontSize(FontSizeEnum fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * The text color for the text. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentTextProperties textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text color for the text. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("textColor")
  public String getTextColor() {
    return textColor;
  }
  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  /**
   * The background color for the text. The valid values in hex color code representation. For example black color - #000000
   **/
  public DocumentTextProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The background color for the text. The valid values in hex color code representation. For example black color - #000000")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTextProperties documentTextProperties = (DocumentTextProperties) o;

    return Objects.equals(this.fontSize, documentTextProperties.fontSize) &&
            Objects.equals(this.textColor, documentTextProperties.textColor) &&
            Objects.equals(this.backgroundColor, documentTextProperties.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontSize, textColor, backgroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTextProperties {\n");
    
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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

