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
 * UploadAttachmentRequest
 */

public class UploadAttachmentRequest  implements Serializable {
  
  private String name = null;
  private Integer contentLengthBytes = null;
  private String contentMd5 = null;
  private Boolean inlineImage = null;

  public UploadAttachmentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UploadAttachmentRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Name of the attachment file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|
   **/
  public UploadAttachmentRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the attachment file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The length of the file to upload in bytes
   **/
  public UploadAttachmentRequest contentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the file to upload in bytes")
  @JsonProperty("contentLengthBytes")
  public Integer getContentLengthBytes() {
    return contentLengthBytes;
  }
  public void setContentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
  }


  /**
   * Content MD5 of the file to upload
   **/
  public UploadAttachmentRequest contentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content MD5 of the file to upload")
  @JsonProperty("contentMd5")
  public String getContentMd5() {
    return contentMd5;
  }
  public void setContentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
  }


  /**
   * Whether or not the attachment should be attached inline
   **/
  public UploadAttachmentRequest inlineImage(Boolean inlineImage) {
    this.inlineImage = inlineImage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the attachment should be attached inline")
  @JsonProperty("inlineImage")
  public Boolean getInlineImage() {
    return inlineImage;
  }
  public void setInlineImage(Boolean inlineImage) {
    this.inlineImage = inlineImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadAttachmentRequest uploadAttachmentRequest = (UploadAttachmentRequest) o;

    return Objects.equals(this.name, uploadAttachmentRequest.name) &&
            Objects.equals(this.contentLengthBytes, uploadAttachmentRequest.contentLengthBytes) &&
            Objects.equals(this.contentMd5, uploadAttachmentRequest.contentMd5) &&
            Objects.equals(this.inlineImage, uploadAttachmentRequest.inlineImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentLengthBytes, contentMd5, inlineImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadAttachmentRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentLengthBytes: ").append(toIndentedString(contentLengthBytes)).append("\n");
    sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
    sb.append("    inlineImage: ").append(toIndentedString(inlineImage)).append("\n");
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

