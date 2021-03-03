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
 * DocumentThumbnail
 */

public class DocumentThumbnail  implements Serializable {
  
  private String resolution = null;
  private String imageUri = null;
  private Integer height = null;
  private Integer width = null;

  
  /**
   **/
  public DocumentThumbnail resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resolution")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  
  /**
   **/
  public DocumentThumbnail imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("imageUri")
  public String getImageUri() {
    return imageUri;
  }
  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }

  
  /**
   **/
  public DocumentThumbnail height(Integer height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   **/
  public DocumentThumbnail width(Integer width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentThumbnail documentThumbnail = (DocumentThumbnail) o;
    return Objects.equals(this.resolution, documentThumbnail.resolution) &&
        Objects.equals(this.imageUri, documentThumbnail.imageUri) &&
        Objects.equals(this.height, documentThumbnail.height) &&
        Objects.equals(this.width, documentThumbnail.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, imageUri, height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentThumbnail {\n");
    
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

