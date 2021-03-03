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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CloseButtonStyleProperties
 */

public class CloseButtonStyleProperties  implements Serializable {
  
  private String color = null;
  private Float opacity = null;

  
  /**
   * Color of button. (eg. #FF0000)
   **/
  public CloseButtonStyleProperties color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Color of button. (eg. #FF0000)")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   * Opacity of button.
   **/
  public CloseButtonStyleProperties opacity(Float opacity) {
    this.opacity = opacity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Opacity of button.")
  @JsonProperty("opacity")
  public Float getOpacity() {
    return opacity;
  }
  public void setOpacity(Float opacity) {
    this.opacity = opacity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloseButtonStyleProperties closeButtonStyleProperties = (CloseButtonStyleProperties) o;
    return Objects.equals(this.color, closeButtonStyleProperties.color) &&
        Objects.equals(this.opacity, closeButtonStyleProperties.opacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, opacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseButtonStyleProperties {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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

