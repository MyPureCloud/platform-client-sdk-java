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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FileUploadMode
 */

public class FileUploadMode  implements Serializable {
  

  private static class FileTypesEnumDeserializer extends StdDeserializer<FileTypesEnum> {
    public FileTypesEnumDeserializer() {
      super(FileTypesEnumDeserializer.class);
    }

    @Override
    public FileTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FileTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets fileTypes
   */
 @JsonDeserialize(using = FileTypesEnumDeserializer.class)
  public enum FileTypesEnum {
    IMAGE_JPEG("image/jpeg"),
    IMAGE_GIF("image/gif"),
    IMAGE_PNG("image/png");

    private String value;

    FileTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FileTypesEnum fromString(String key) {
      if (key == null) return null;

      for (FileTypesEnum value : FileTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FileTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FileTypesEnum> fileTypes = new ArrayList<FileTypesEnum>();
  private Long maxFileSizeKB = null;

  
  /**
   * A list of supported content types for uploading files
   **/
  public FileUploadMode fileTypes(List<FileTypesEnum> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of supported content types for uploading files")
  @JsonProperty("fileTypes")
  public List<FileTypesEnum> getFileTypes() {
    return fileTypes;
  }
  public void setFileTypes(List<FileTypesEnum> fileTypes) {
    this.fileTypes = fileTypes;
  }

  
  /**
   * The maximum file size for file uploads in kilobytes. Default is 10240 (10 MB)
   **/
  public FileUploadMode maxFileSizeKB(Long maxFileSizeKB) {
    this.maxFileSizeKB = maxFileSizeKB;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum file size for file uploads in kilobytes. Default is 10240 (10 MB)")
  @JsonProperty("maxFileSizeKB")
  public Long getMaxFileSizeKB() {
    return maxFileSizeKB;
  }
  public void setMaxFileSizeKB(Long maxFileSizeKB) {
    this.maxFileSizeKB = maxFileSizeKB;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadMode fileUploadMode = (FileUploadMode) o;
    return Objects.equals(this.fileTypes, fileUploadMode.fileTypes) &&
        Objects.equals(this.maxFileSizeKB, fileUploadMode.maxFileSizeKB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTypes, maxFileSizeKB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadMode {\n");
    
    sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
    sb.append("    maxFileSizeKB: ").append(toIndentedString(maxFileSizeKB)).append("\n");
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

