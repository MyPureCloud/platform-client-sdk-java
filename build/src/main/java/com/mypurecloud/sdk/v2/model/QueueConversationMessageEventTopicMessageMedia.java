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
 * QueueConversationMessageEventTopicMessageMedia
 */

public class QueueConversationMessageEventTopicMessageMedia  implements Serializable {
  
  private String url = null;
  private String mediaType = null;
  private Long contentLengthBytes = null;
  private String name = null;
  private String id = null;

  public QueueConversationMessageEventTopicMessageMedia() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The location of the media, useful for retrieving it
   **/
  public QueueConversationMessageEventTopicMessageMedia url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the media, useful for retrieving it")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * The optional internet media type of the the media object.  If null then the media type should be dictated by the url
   **/
  public QueueConversationMessageEventTopicMessageMedia mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional internet media type of the the media object.  If null then the media type should be dictated by the url")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * The optional content length of the the media object, in bytes.
   **/
  public QueueConversationMessageEventTopicMessageMedia contentLengthBytes(Long contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional content length of the the media object, in bytes.")
  @JsonProperty("contentLengthBytes")
  public Long getContentLengthBytes() {
    return contentLengthBytes;
  }
  public void setContentLengthBytes(Long contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
  }


  /**
   * The optional name of the the media object.
   **/
  public QueueConversationMessageEventTopicMessageMedia name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional name of the the media object.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The optional id of the the media object.
   **/
  public QueueConversationMessageEventTopicMessageMedia id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional id of the the media object.")
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
    QueueConversationMessageEventTopicMessageMedia queueConversationMessageEventTopicMessageMedia = (QueueConversationMessageEventTopicMessageMedia) o;

    return Objects.equals(this.url, queueConversationMessageEventTopicMessageMedia.url) &&
            Objects.equals(this.mediaType, queueConversationMessageEventTopicMessageMedia.mediaType) &&
            Objects.equals(this.contentLengthBytes, queueConversationMessageEventTopicMessageMedia.contentLengthBytes) &&
            Objects.equals(this.name, queueConversationMessageEventTopicMessageMedia.name) &&
            Objects.equals(this.id, queueConversationMessageEventTopicMessageMedia.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, mediaType, contentLengthBytes, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicMessageMedia {\n");
    
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

