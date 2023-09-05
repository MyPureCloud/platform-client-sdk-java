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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Attachment object.
 */
@ApiModel(description = "Attachment object.")

public class OpenContentAttachment  implements Serializable {
  
  private String id = null;

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
   * The type of attachment this instance represents.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IMAGE("Image"),
    VIDEO("Video"),
    AUDIO("Audio"),
    FILE("File"),
    LINK("Link");

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
  private String url = null;
  private String mime = null;
  private String text = null;
  private String sha256 = null;
  private String filename = null;

  
  /**
   * Provider specific ID for attachment. For example, middleware media UUID.
   **/
  public OpenContentAttachment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provider specific ID for attachment. For example, middleware media UUID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The type of attachment this instance represents.
   **/
  public OpenContentAttachment mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of attachment this instance represents.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * URL of the attachment.
   **/
  public OpenContentAttachment url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL of the attachment.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Attachment mime type (https://www.iana.org/assignments/media-types/media-types.xhtml).
   **/
  public OpenContentAttachment mime(String mime) {
    this.mime = mime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Attachment mime type (https://www.iana.org/assignments/media-types/media-types.xhtml).")
  @JsonProperty("mime")
  public String getMime() {
    return mime;
  }
  public void setMime(String mime) {
    this.mime = mime;
  }


  /**
   * Text associated with attachment such as an image caption.
   **/
  public OpenContentAttachment text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text associated with attachment such as an image caption.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Secure hash of the attachment content.
   **/
  public OpenContentAttachment sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Secure hash of the attachment content.")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  /**
   * Suggested file name for attachment.
   **/
  public OpenContentAttachment filename(String filename) {
    this.filename = filename;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Suggested file name for attachment.")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenContentAttachment openContentAttachment = (OpenContentAttachment) o;

    return Objects.equals(this.id, openContentAttachment.id) &&
            Objects.equals(this.mediaType, openContentAttachment.mediaType) &&
            Objects.equals(this.url, openContentAttachment.url) &&
            Objects.equals(this.mime, openContentAttachment.mime) &&
            Objects.equals(this.text, openContentAttachment.text) &&
            Objects.equals(this.sha256, openContentAttachment.sha256) &&
            Objects.equals(this.filename, openContentAttachment.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaType, url, mime, text, sha256, filename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenContentAttachment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

