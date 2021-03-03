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
 * QueueConversationEventTopicMessageMedia
 */

public class QueueConversationEventTopicMessageMedia  implements Serializable {
  
  private String url = null;
  private String mediaType = null;
  private Integer contentLengthBytes = null;
  private String name = null;
  private String id = null;

  
  /**
   **/
  public QueueConversationEventTopicMessageMedia url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public QueueConversationEventTopicMessageMedia mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   **/
  public QueueConversationEventTopicMessageMedia contentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentLengthBytes")
  public Integer getContentLengthBytes() {
    return contentLengthBytes;
  }
  public void setContentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
  }

  
  /**
   **/
  public QueueConversationEventTopicMessageMedia name(String name) {
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
  public QueueConversationEventTopicMessageMedia id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicMessageMedia queueConversationEventTopicMessageMedia = (QueueConversationEventTopicMessageMedia) o;
    return Objects.equals(this.url, queueConversationEventTopicMessageMedia.url) &&
        Objects.equals(this.mediaType, queueConversationEventTopicMessageMedia.mediaType) &&
        Objects.equals(this.contentLengthBytes, queueConversationEventTopicMessageMedia.contentLengthBytes) &&
        Objects.equals(this.name, queueConversationEventTopicMessageMedia.name) &&
        Objects.equals(this.id, queueConversationEventTopicMessageMedia.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, mediaType, contentLengthBytes, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicMessageMedia {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    contentLengthBytes: ").append(toIndentedString(contentLengthBytes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

