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
 * LocationImage
 */

public class LocationImage  implements Serializable {
  
  private String resolution = null;
  private String imageUri = null;

  
  /**
   * Height and/or width of image. ex: 640x480 or x128
   **/
  public LocationImage resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Height and/or width of image. ex: 640x480 or x128")
  @JsonProperty("resolution")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  
  /**
   **/
  public LocationImage imageUri(String imageUri) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationImage locationImage = (LocationImage) o;
    return Objects.equals(this.resolution, locationImage.resolution) &&
        Objects.equals(this.imageUri, locationImage.imageUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, imageUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationImage {\n");
    
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
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

