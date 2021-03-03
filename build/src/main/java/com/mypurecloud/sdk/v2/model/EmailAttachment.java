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
 * EmailAttachment
 */

public class EmailAttachment  implements Serializable {
  
  private String name = null;
  private String contentPath = null;
  private String contentType = null;
  private String attachmentId = null;
  private Integer contentLength = null;

  
  /**
   **/
  public EmailAttachment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public EmailAttachment contentPath(String contentPath) {
    this.contentPath = contentPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentPath")
  public String getContentPath() {
    return contentPath;
  }
  public void setContentPath(String contentPath) {
    this.contentPath = contentPath;
  }

  
  /**
   **/
  public EmailAttachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   **/
  public EmailAttachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachmentId")
  public String getAttachmentId() {
    return attachmentId;
  }
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  
  /**
   **/
  public EmailAttachment contentLength(Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentLength")
  public Integer getContentLength() {
    return contentLength;
  }
  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAttachment emailAttachment = (EmailAttachment) o;
    return Objects.equals(this.name, emailAttachment.name) &&
        Objects.equals(this.contentPath, emailAttachment.contentPath) &&
        Objects.equals(this.contentType, emailAttachment.contentType) &&
        Objects.equals(this.attachmentId, emailAttachment.attachmentId) &&
        Objects.equals(this.contentLength, emailAttachment.contentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentPath, contentType, attachmentId, contentLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAttachment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentPath: ").append(toIndentedString(contentPath)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
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

