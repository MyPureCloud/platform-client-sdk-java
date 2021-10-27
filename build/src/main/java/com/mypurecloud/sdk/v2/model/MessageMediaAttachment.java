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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MessageMediaAttachment
 */

public class MessageMediaAttachment  implements Serializable {
  
  private String url = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The optional internet media type of the the media object.If null then the media type should be dictated by the url.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IMAGE_PNG("image/png"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_GIF("image/gif");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private Long contentLength = null;
  private String name = null;
  private String id = null;

  
  /**
   * The location of the media, useful for retrieving it
   **/
  public MessageMediaAttachment url(String url) {
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
   * The optional internet media type of the the media object.If null then the media type should be dictated by the url.
   **/
  public MessageMediaAttachment mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional internet media type of the the media object.If null then the media type should be dictated by the url.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * The optional content length of the the media object, in bytes.
   **/
  public MessageMediaAttachment contentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional content length of the the media object, in bytes.")
  @JsonProperty("contentLength")
  public Long getContentLength() {
    return contentLength;
  }
  public void setContentLength(Long contentLength) {
    this.contentLength = contentLength;
  }

  
  /**
   * The name of the media object.
   **/
  public MessageMediaAttachment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the media object.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A globally unique identifier for the media object.
   **/
  public MessageMediaAttachment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the media object.")
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
    MessageMediaAttachment messageMediaAttachment = (MessageMediaAttachment) o;
    return Objects.equals(this.url, messageMediaAttachment.url) &&
        Objects.equals(this.mediaType, messageMediaAttachment.mediaType) &&
        Objects.equals(this.contentLength, messageMediaAttachment.contentLength) &&
        Objects.equals(this.name, messageMediaAttachment.name) &&
        Objects.equals(this.id, messageMediaAttachment.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, mediaType, contentLength, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageMediaAttachment {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
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

