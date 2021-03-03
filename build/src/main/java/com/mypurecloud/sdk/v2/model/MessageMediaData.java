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
 * MessageMediaData
 */

public class MessageMediaData  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String url = null;
  private String mediaType = null;
  private Integer contentLengthBytes = null;
  private String uploadUrl = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the media, indicates if the media is in the process of uploading. If the upload fails, the media becomes invalid
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPLOADING("uploading"),
    VALID("valid"),
    INVALID("invalid");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public MessageMediaData name(String name) {
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
   * The location of the media, useful for retrieving it
   **/
  public MessageMediaData url(String url) {
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
   * The detected internet media type of the the media object.  If null then the media type should be dictated by the url.
   **/
  public MessageMediaData mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The detected internet media type of the the media object.  If null then the media type should be dictated by the url.")
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
  public MessageMediaData contentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional content length of the the media object, in bytes.")
  @JsonProperty("contentLengthBytes")
  public Integer getContentLengthBytes() {
    return contentLengthBytes;
  }
  public void setContentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
  }

  
  /**
   * The URL returned to upload an attachment
   **/
  public MessageMediaData uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL returned to upload an attachment")
  @JsonProperty("uploadUrl")
  public String getUploadUrl() {
    return uploadUrl;
  }
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  
  @ApiModelProperty(example = "null", value = "The status of the media, indicates if the media is in the process of uploading. If the upload fails, the media becomes invalid")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageMediaData messageMediaData = (MessageMediaData) o;
    return Objects.equals(this.id, messageMediaData.id) &&
        Objects.equals(this.name, messageMediaData.name) &&
        Objects.equals(this.url, messageMediaData.url) &&
        Objects.equals(this.mediaType, messageMediaData.mediaType) &&
        Objects.equals(this.contentLengthBytes, messageMediaData.contentLengthBytes) &&
        Objects.equals(this.uploadUrl, messageMediaData.uploadUrl) &&
        Objects.equals(this.status, messageMediaData.status) &&
        Objects.equals(this.selfUri, messageMediaData.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, mediaType, contentLengthBytes, uploadUrl, status, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageMediaData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    contentLengthBytes: ").append(toIndentedString(contentLengthBytes)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

