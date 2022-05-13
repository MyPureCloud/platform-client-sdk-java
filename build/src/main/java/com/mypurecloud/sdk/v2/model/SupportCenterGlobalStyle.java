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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportCenterGlobalStyle
 */

public class SupportCenterGlobalStyle  implements Serializable {
  
  private String backgroundColor = null;
  private String primaryColor = null;
  private String primaryColorDark = null;
  private String primaryColorLight = null;
  private String textColor = null;
  private String fontFamily = null;

  
  /**
   * Global background color, in hexadecimal format, eg #ffffff
   **/
  public SupportCenterGlobalStyle backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Global background color, in hexadecimal format, eg #ffffff")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * Global primary color, in hexadecimal format, eg #ffffff
   **/
  public SupportCenterGlobalStyle primaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Global primary color, in hexadecimal format, eg #ffffff")
  @JsonProperty("primaryColor")
  public String getPrimaryColor() {
    return primaryColor;
  }
  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }


  /**
   * Global dark primary color, in hexadecimal format, eg #ffffff
   **/
  public SupportCenterGlobalStyle primaryColorDark(String primaryColorDark) {
    this.primaryColorDark = primaryColorDark;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Global dark primary color, in hexadecimal format, eg #ffffff")
  @JsonProperty("primaryColorDark")
  public String getPrimaryColorDark() {
    return primaryColorDark;
  }
  public void setPrimaryColorDark(String primaryColorDark) {
    this.primaryColorDark = primaryColorDark;
  }


  /**
   * Global light primary color, in hexadecimal format, eg #ffffff
   **/
  public SupportCenterGlobalStyle primaryColorLight(String primaryColorLight) {
    this.primaryColorLight = primaryColorLight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Global light primary color, in hexadecimal format, eg #ffffff")
  @JsonProperty("primaryColorLight")
  public String getPrimaryColorLight() {
    return primaryColorLight;
  }
  public void setPrimaryColorLight(String primaryColorLight) {
    this.primaryColorLight = primaryColorLight;
  }


  /**
   * Global text color, in hexadecimal format, eg #ffffff
   **/
  public SupportCenterGlobalStyle textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Global text color, in hexadecimal format, eg #ffffff")
  @JsonProperty("textColor")
  public String getTextColor() {
    return textColor;
  }
  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  /**
   * Global font family
   **/
  public SupportCenterGlobalStyle fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Global font family")
  @JsonProperty("fontFamily")
  public String getFontFamily() {
    return fontFamily;
  }
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterGlobalStyle supportCenterGlobalStyle = (SupportCenterGlobalStyle) o;

    return Objects.equals(this.backgroundColor, supportCenterGlobalStyle.backgroundColor) &&
            Objects.equals(this.primaryColor, supportCenterGlobalStyle.primaryColor) &&
            Objects.equals(this.primaryColorDark, supportCenterGlobalStyle.primaryColorDark) &&
            Objects.equals(this.primaryColorLight, supportCenterGlobalStyle.primaryColorLight) &&
            Objects.equals(this.textColor, supportCenterGlobalStyle.textColor) &&
            Objects.equals(this.fontFamily, supportCenterGlobalStyle.fontFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, primaryColor, primaryColorDark, primaryColorLight, textColor, fontFamily);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterGlobalStyle {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    primaryColorDark: ").append(toIndentedString(primaryColorDark)).append("\n");
    sb.append("    primaryColorLight: ").append(toIndentedString(primaryColorLight)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
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

