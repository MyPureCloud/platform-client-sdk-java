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
 * QueueConversationVideoEventTopicAttachment
 */

public class QueueConversationVideoEventTopicAttachment  implements Serializable {
  
  private String attachmentId = null;
  private String name = null;
  private String contentUri = null;
  private String contentType = null;
  private Integer contentLength = null;

  
  /**
   * The unique identifier for the attachment.
   **/
  public QueueConversationVideoEventTopicAttachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the attachment.")
  @JsonProperty("attachmentId")
  public String getAttachmentId() {
    return attachmentId;
  }
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  
  /**
   * The name of the attachment.
   **/
  public QueueConversationVideoEventTopicAttachment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the attachment.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The content uri of the attachment. If set, this is commonly a public api download location.
   **/
  public QueueConversationVideoEventTopicAttachment contentUri(String contentUri) {
    this.contentUri = contentUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content uri of the attachment. If set, this is commonly a public api download location.")
  @JsonProperty("contentUri")
  public String getContentUri() {
    return contentUri;
  }
  public void setContentUri(String contentUri) {
    this.contentUri = contentUri;
  }

  
  /**
   * The type of file the attachment is.
   **/
  public QueueConversationVideoEventTopicAttachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of file the attachment is.")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   * The length of the attachment file.
   **/
  public QueueConversationVideoEventTopicAttachment contentLength(Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length of the attachment file.")
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
    QueueConversationVideoEventTopicAttachment queueConversationVideoEventTopicAttachment = (QueueConversationVideoEventTopicAttachment) o;
    return Objects.equals(this.attachmentId, queueConversationVideoEventTopicAttachment.attachmentId) &&
        Objects.equals(this.name, queueConversationVideoEventTopicAttachment.name) &&
        Objects.equals(this.contentUri, queueConversationVideoEventTopicAttachment.contentUri) &&
        Objects.equals(this.contentType, queueConversationVideoEventTopicAttachment.contentType) &&
        Objects.equals(this.contentLength, queueConversationVideoEventTopicAttachment.contentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, name, contentUri, contentType, contentLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicAttachment {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

