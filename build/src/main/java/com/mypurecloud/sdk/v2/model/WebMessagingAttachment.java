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
 * Attachment object.
 */
@ApiModel(description = "Attachment object.")

public class WebMessagingAttachment  implements Serializable {
  
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
    FILE("File");

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
  private Integer fileSize = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The type of attachment this instance represents.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  
  @ApiModelProperty(example = "null", value = "URL of the attachment.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  
  @ApiModelProperty(example = "null", value = "Attachment mime type (https://www.iana.org/assignments/media-types/media-types.xhtml).")
  @JsonProperty("mime")
  public String getMime() {
    return mime;
  }

  
  @ApiModelProperty(example = "null", value = "Text associated with attachment such as an image caption.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  
  @ApiModelProperty(example = "null", value = "Secure hash of the attachment content.")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }

  
  @ApiModelProperty(example = "null", value = "Suggested file name for attachment.")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  
  @ApiModelProperty(example = "null", value = "The file size associated with the file")
  @JsonProperty("fileSize")
  public Integer getFileSize() {
    return fileSize;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingAttachment webMessagingAttachment = (WebMessagingAttachment) o;
    return Objects.equals(this.id, webMessagingAttachment.id) &&
        Objects.equals(this.mediaType, webMessagingAttachment.mediaType) &&
        Objects.equals(this.url, webMessagingAttachment.url) &&
        Objects.equals(this.mime, webMessagingAttachment.mime) &&
        Objects.equals(this.text, webMessagingAttachment.text) &&
        Objects.equals(this.sha256, webMessagingAttachment.sha256) &&
        Objects.equals(this.filename, webMessagingAttachment.filename) &&
        Objects.equals(this.fileSize, webMessagingAttachment.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaType, url, mime, text, sha256, filename, fileSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingAttachment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

