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
 * QueueConversationEmailEventTopicAttachment
 */

public class QueueConversationEmailEventTopicAttachment  implements Serializable {
  
  private String attachmentId = null;
  private String name = null;
  private String contentUri = null;
  private String contentType = null;
  private Integer contentLength = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationEmailEventTopicAttachment attachmentId(String attachmentId) {
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
  public QueueConversationEmailEventTopicAttachment name(String name) {
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
  public QueueConversationEmailEventTopicAttachment contentUri(String contentUri) {
    this.contentUri = contentUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentUri")
  public String getContentUri() {
    return contentUri;
  }
  public void setContentUri(String contentUri) {
    this.contentUri = contentUri;
  }

  
  /**
   **/
  public QueueConversationEmailEventTopicAttachment contentType(String contentType) {
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
  public QueueConversationEmailEventTopicAttachment contentLength(Integer contentLength) {
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

  
  /**
   **/
  public QueueConversationEmailEventTopicAttachment additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEmailEventTopicAttachment queueConversationEmailEventTopicAttachment = (QueueConversationEmailEventTopicAttachment) o;
    return Objects.equals(this.attachmentId, queueConversationEmailEventTopicAttachment.attachmentId) &&
        Objects.equals(this.name, queueConversationEmailEventTopicAttachment.name) &&
        Objects.equals(this.contentUri, queueConversationEmailEventTopicAttachment.contentUri) &&
        Objects.equals(this.contentType, queueConversationEmailEventTopicAttachment.contentType) &&
        Objects.equals(this.contentLength, queueConversationEmailEventTopicAttachment.contentLength) &&
        Objects.equals(this.additionalProperties, queueConversationEmailEventTopicAttachment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, name, contentUri, contentType, contentLength, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEmailEventTopicAttachment {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

