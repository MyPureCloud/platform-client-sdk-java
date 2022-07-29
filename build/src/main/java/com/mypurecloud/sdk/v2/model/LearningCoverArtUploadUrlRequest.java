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
 * LearningCoverArtUploadUrlRequest
 */

public class LearningCoverArtUploadUrlRequest  implements Serializable {
  
  private String fileName = null;
  private String contentMd5 = null;
  private Integer signedUrlTimeoutSeconds = null;

  private static class ContentTypeEnumDeserializer extends StdDeserializer<ContentTypeEnum> {
    public ContentTypeEnumDeserializer() {
      super(ContentTypeEnumDeserializer.class);
    }

    @Override
    public ContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The content type of the file to upload.
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IMAGE_BMP("image/bmp"),
    IMAGE_GIF("image/gif"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_JPG("image/jpg"),
    IMAGE_PNG("image/png");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContentTypeEnum value : ContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContentTypeEnum contentType = null;

  private static class ServerSideEncryptionEnumDeserializer extends StdDeserializer<ServerSideEncryptionEnum> {
    public ServerSideEncryptionEnumDeserializer() {
      super(ServerSideEncryptionEnumDeserializer.class);
    }

    @Override
    public ServerSideEncryptionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ServerSideEncryptionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets serverSideEncryption
   */
 @JsonDeserialize(using = ServerSideEncryptionEnumDeserializer.class)
  public enum ServerSideEncryptionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AES256("AES256");

    private String value;

    ServerSideEncryptionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ServerSideEncryptionEnum fromString(String key) {
      if (key == null) return null;

      for (ServerSideEncryptionEnum value : ServerSideEncryptionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ServerSideEncryptionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ServerSideEncryptionEnum serverSideEncryption = null;

  
  /**
   * Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|
   **/
  public LearningCoverArtUploadUrlRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * Content MD5 of the file to upload
   **/
  public LearningCoverArtUploadUrlRequest contentMd5(String contentMd5) {
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
   * The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds
   **/
  public LearningCoverArtUploadUrlRequest signedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
    this.signedUrlTimeoutSeconds = signedUrlTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds")
  @JsonProperty("signedUrlTimeoutSeconds")
  public Integer getSignedUrlTimeoutSeconds() {
    return signedUrlTimeoutSeconds;
  }
  public void setSignedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
    this.signedUrlTimeoutSeconds = signedUrlTimeoutSeconds;
  }


  /**
   * The content type of the file to upload.
   **/
  public LearningCoverArtUploadUrlRequest contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The content type of the file to upload.")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  /**
   **/
  public LearningCoverArtUploadUrlRequest serverSideEncryption(ServerSideEncryptionEnum serverSideEncryption) {
    this.serverSideEncryption = serverSideEncryption;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serverSideEncryption")
  public ServerSideEncryptionEnum getServerSideEncryption() {
    return serverSideEncryption;
  }
  public void setServerSideEncryption(ServerSideEncryptionEnum serverSideEncryption) {
    this.serverSideEncryption = serverSideEncryption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningCoverArtUploadUrlRequest learningCoverArtUploadUrlRequest = (LearningCoverArtUploadUrlRequest) o;

    return Objects.equals(this.fileName, learningCoverArtUploadUrlRequest.fileName) &&
            Objects.equals(this.contentMd5, learningCoverArtUploadUrlRequest.contentMd5) &&
            Objects.equals(this.signedUrlTimeoutSeconds, learningCoverArtUploadUrlRequest.signedUrlTimeoutSeconds) &&
            Objects.equals(this.contentType, learningCoverArtUploadUrlRequest.contentType) &&
            Objects.equals(this.serverSideEncryption, learningCoverArtUploadUrlRequest.serverSideEncryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, contentMd5, signedUrlTimeoutSeconds, contentType, serverSideEncryption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningCoverArtUploadUrlRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
    sb.append("    signedUrlTimeoutSeconds: ").append(toIndentedString(signedUrlTimeoutSeconds)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    serverSideEncryption: ").append(toIndentedString(serverSideEncryption)).append("\n");
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

