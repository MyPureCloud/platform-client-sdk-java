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
 * PatchContentOfferStyleProperties
 */

public class PatchContentOfferStyleProperties  implements Serializable {
  
  private String padding = null;
  private String color = null;
  private String backgroundColor = null;

  
  /**
   * Padding of the offer. (eg. 10px)
   **/
  public PatchContentOfferStyleProperties padding(String padding) {
    this.padding = padding;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Padding of the offer. (eg. 10px)")
  @JsonProperty("padding")
  public String getPadding() {
    return padding;
  }
  public void setPadding(String padding) {
    this.padding = padding;
  }

  
  /**
   * Text color of the offer. (eg. #FF0000)
   **/
  public PatchContentOfferStyleProperties color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text color of the offer. (eg. #FF0000)")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   * Background color of the offer. (eg. #000000)
   **/
  public PatchContentOfferStyleProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Background color of the offer. (eg. #000000)")
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
    PatchContentOfferStyleProperties patchContentOfferStyleProperties = (PatchContentOfferStyleProperties) o;
    return Objects.equals(this.padding, patchContentOfferStyleProperties.padding) &&
        Objects.equals(this.color, patchContentOfferStyleProperties.color) &&
        Objects.equals(this.backgroundColor, patchContentOfferStyleProperties.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(padding, color, backgroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchContentOfferStyleProperties {\n");
    
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

