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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Thumbnail image metadata for the attachment content.
 */
@ApiModel(description = "Thumbnail image metadata for the attachment content.")

public class ConversationContentThumbnail  implements Serializable {
  
  private String url = null;
  private String mime = null;
  private String sha256 = null;
  private Long contentSizeBytes = null;

  public ConversationContentThumbnail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ConversationContentThumbnail(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * URL of the thumbnail image.
   **/
  public ConversationContentThumbnail url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL of the thumbnail image.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Thumbnail mime type (e.g. image/jpeg).
   **/
  public ConversationContentThumbnail mime(String mime) {
    this.mime = mime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Thumbnail mime type (e.g. image/jpeg).")
  @JsonProperty("mime")
  public String getMime() {
    return mime;
  }
  public void setMime(String mime) {
    this.mime = mime;
  }


  /**
   * Secure hash of the thumbnail content.
   **/
  public ConversationContentThumbnail sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Secure hash of the thumbnail content.")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  /**
   * Size in bytes of the thumbnail content.
   **/
  public ConversationContentThumbnail contentSizeBytes(Long contentSizeBytes) {
    this.contentSizeBytes = contentSizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Size in bytes of the thumbnail content.")
  @JsonProperty("contentSizeBytes")
  public Long getContentSizeBytes() {
    return contentSizeBytes;
  }
  public void setContentSizeBytes(Long contentSizeBytes) {
    this.contentSizeBytes = contentSizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentThumbnail conversationContentThumbnail = (ConversationContentThumbnail) o;

    return Objects.equals(this.url, conversationContentThumbnail.url) &&
            Objects.equals(this.mime, conversationContentThumbnail.mime) &&
            Objects.equals(this.sha256, conversationContentThumbnail.sha256) &&
            Objects.equals(this.contentSizeBytes, conversationContentThumbnail.contentSizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, mime, sha256, contentSizeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentThumbnail {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    contentSizeBytes: ").append(toIndentedString(contentSizeBytes)).append("\n");
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

