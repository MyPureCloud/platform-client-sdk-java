package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchTextStyleProperties
 */

public class PatchTextStyleProperties  implements Serializable {
  
  private String color = null;
  private String font = null;
  private String fontSize = null;

  private static class TextAlignEnumDeserializer extends StdDeserializer<TextAlignEnum> {
    public TextAlignEnumDeserializer() {
      super(TextAlignEnumDeserializer.class);
    }

    @Override
    public TextAlignEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TextAlignEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Text alignment.
   */
 @JsonDeserialize(using = TextAlignEnumDeserializer.class)
  public enum TextAlignEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LEFT("Left"),
    RIGHT("Right"),
    CENTER("Center");

    private String value;

    TextAlignEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TextAlignEnum fromString(String key) {
      if (key == null) return null;

      for (TextAlignEnum value : TextAlignEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TextAlignEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TextAlignEnum textAlign = null;

  
  /**
   * Color of the text. (eg. #FFFFFF)
   **/
  public PatchTextStyleProperties color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Color of the text. (eg. #FFFFFF)")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   * Font of the text. (eg. Helvetica)
   **/
  public PatchTextStyleProperties font(String font) {
    this.font = font;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Font of the text. (eg. Helvetica)")
  @JsonProperty("font")
  public String getFont() {
    return font;
  }
  public void setFont(String font) {
    this.font = font;
  }

  
  /**
   * Font size of the text. (eg. '12')
   **/
  public PatchTextStyleProperties fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Font size of the text. (eg. '12')")
  @JsonProperty("fontSize")
  public String getFontSize() {
    return fontSize;
  }
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  
  /**
   * Text alignment.
   **/
  public PatchTextStyleProperties textAlign(TextAlignEnum textAlign) {
    this.textAlign = textAlign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text alignment.")
  @JsonProperty("textAlign")
  public TextAlignEnum getTextAlign() {
    return textAlign;
  }
  public void setTextAlign(TextAlignEnum textAlign) {
    this.textAlign = textAlign;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchTextStyleProperties patchTextStyleProperties = (PatchTextStyleProperties) o;
    return Objects.equals(this.color, patchTextStyleProperties.color) &&
        Objects.equals(this.font, patchTextStyleProperties.font) &&
        Objects.equals(this.fontSize, patchTextStyleProperties.fontSize) &&
        Objects.equals(this.textAlign, patchTextStyleProperties.textAlign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, font, fontSize, textAlign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchTextStyleProperties {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
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

