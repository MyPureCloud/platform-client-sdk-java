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
import com.mypurecloud.sdk.v2.model.DocumentThumbnail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DownloadResponse
 */

public class DownloadResponse  implements Serializable {
  
  private String contentLocationUri = null;
  private String imageUri = null;
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();

  
  /**
   **/
  public DownloadResponse contentLocationUri(String contentLocationUri) {
    this.contentLocationUri = contentLocationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentLocationUri")
  public String getContentLocationUri() {
    return contentLocationUri;
  }
  public void setContentLocationUri(String contentLocationUri) {
    this.contentLocationUri = contentLocationUri;
  }

  
  /**
   **/
  public DownloadResponse imageUri(String imageUri) {
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
  public DownloadResponse thumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thumbnails")
  public List<DocumentThumbnail> getThumbnails() {
    return thumbnails;
  }
  public void setThumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadResponse downloadResponse = (DownloadResponse) o;
    return Objects.equals(this.contentLocationUri, downloadResponse.contentLocationUri) &&
        Objects.equals(this.imageUri, downloadResponse.imageUri) &&
        Objects.equals(this.thumbnails, downloadResponse.thumbnails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLocationUri, imageUri, thumbnails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadResponse {\n");
    
    sb.append("    contentLocationUri: ").append(toIndentedString(contentLocationUri)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
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

