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
import com.mypurecloud.sdk.v2.model.SupportCenterImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportCenterHeroStyle
 */

public class SupportCenterHeroStyle  implements Serializable {
  
  private String backgroundColor = null;
  private String textColor = null;
  private SupportCenterImage image = null;

  
  /**
   * Background color for hero section, in hexadecimal format, eg #ffffff
   **/
  public SupportCenterHeroStyle backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Background color for hero section, in hexadecimal format, eg #ffffff")
  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * Text color for hero section, in hexadecimal format, eg #ffffff
   **/
  public SupportCenterHeroStyle textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text color for hero section, in hexadecimal format, eg #ffffff")
  @JsonProperty("textColor")
  public String getTextColor() {
    return textColor;
  }
  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  /**
   * Background image for hero section
   **/
  public SupportCenterHeroStyle image(SupportCenterImage image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Background image for hero section")
  @JsonProperty("image")
  public SupportCenterImage getImage() {
    return image;
  }
  public void setImage(SupportCenterImage image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterHeroStyle supportCenterHeroStyle = (SupportCenterHeroStyle) o;

    return Objects.equals(this.backgroundColor, supportCenterHeroStyle.backgroundColor) &&
            Objects.equals(this.textColor, supportCenterHeroStyle.textColor) &&
            Objects.equals(this.image, supportCenterHeroStyle.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, textColor, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterHeroStyle {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

