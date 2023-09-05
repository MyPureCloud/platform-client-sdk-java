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
import java.util.Date;

import java.io.Serializable;
/**
 * GrammarLanguageFileMetadata
 */

public class GrammarLanguageFileMetadata  implements Serializable {
  
  private String fileName = null;
  private Integer fileSizeBytes = null;
  private Date dateUploaded = null;

  private static class FileTypeEnumDeserializer extends StdDeserializer<FileTypeEnum> {
    public FileTypeEnumDeserializer() {
      super(FileTypeEnumDeserializer.class);
    }

    @Override
    public FileTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FileTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The extension of the file
   */
 @JsonDeserialize(using = FileTypeEnumDeserializer.class)
  public enum FileTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GRAM("Gram"),
    GRXML("Grxml");

    private String value;

    FileTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FileTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FileTypeEnum value : FileTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FileTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FileTypeEnum fileType = null;

  
  /**
   * The name of the file as defined by the user
   **/
  public GrammarLanguageFileMetadata fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the file as defined by the user")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * The size of the file in bytes
   **/
  public GrammarLanguageFileMetadata fileSizeBytes(Integer fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size of the file in bytes")
  @JsonProperty("fileSizeBytes")
  public Integer getFileSizeBytes() {
    return fileSizeBytes;
  }
  public void setFileSizeBytes(Integer fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
  }


  /**
   * The date the file was uploaded. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public GrammarLanguageFileMetadata dateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the file was uploaded. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateUploaded")
  public Date getDateUploaded() {
    return dateUploaded;
  }
  public void setDateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
  }


  /**
   * The extension of the file
   **/
  public GrammarLanguageFileMetadata fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The extension of the file")
  @JsonProperty("fileType")
  public FileTypeEnum getFileType() {
    return fileType;
  }
  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrammarLanguageFileMetadata grammarLanguageFileMetadata = (GrammarLanguageFileMetadata) o;

    return Objects.equals(this.fileName, grammarLanguageFileMetadata.fileName) &&
            Objects.equals(this.fileSizeBytes, grammarLanguageFileMetadata.fileSizeBytes) &&
            Objects.equals(this.dateUploaded, grammarLanguageFileMetadata.dateUploaded) &&
            Objects.equals(this.fileType, grammarLanguageFileMetadata.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileSizeBytes, dateUploaded, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrammarLanguageFileMetadata {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSizeBytes: ").append(toIndentedString(fileSizeBytes)).append("\n");
    sb.append("    dateUploaded: ").append(toIndentedString(dateUploaded)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

