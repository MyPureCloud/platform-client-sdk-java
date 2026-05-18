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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActivityCodeStyle
 */

public class ActivityCodeStyle  implements Serializable {
  
  private String backgroundColor = null;

  private static class TextColorThemeEnumDeserializer extends StdDeserializer<TextColorThemeEnum> {
    public TextColorThemeEnumDeserializer() {
      super(TextColorThemeEnumDeserializer.class);
    }

    @Override
    public TextColorThemeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TextColorThemeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Text color theme for the activity code
   */
 @JsonDeserialize(using = TextColorThemeEnumDeserializer.class)
  public enum TextColorThemeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DARK("Dark"),
    LIGHT("Light");

    private String value;

    TextColorThemeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TextColorThemeEnum fromString(String key) {
      if (key == null) return null;

      for (TextColorThemeEnum value : TextColorThemeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TextColorThemeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TextColorThemeEnum textColorTheme = null;

  public ActivityCodeStyle() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ActivityCodeStyle(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Background color for the activity code in hex format starting with # followed by 6 hexadecimal characters (0-9, a-f, A-F)
   **/
  public ActivityCodeStyle backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Background color for the activity code in hex format starting with # followed by 6 hexadecimal characters (0-9, a-f, A-F)")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * Text color theme for the activity code
   **/
  public ActivityCodeStyle textColorTheme(TextColorThemeEnum textColorTheme) {
    this.textColorTheme = textColorTheme;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text color theme for the activity code")
  @JsonProperty("textColorTheme")
  public TextColorThemeEnum getTextColorTheme() {
    return textColorTheme;
  }
  public void setTextColorTheme(TextColorThemeEnum textColorTheme) {
    this.textColorTheme = textColorTheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityCodeStyle activityCodeStyle = (ActivityCodeStyle) o;

    return Objects.equals(this.backgroundColor, activityCodeStyle.backgroundColor) &&
            Objects.equals(this.textColorTheme, activityCodeStyle.textColorTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, textColorTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityCodeStyle {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    textColorTheme: ").append(toIndentedString(textColorTheme)).append("\n");
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

