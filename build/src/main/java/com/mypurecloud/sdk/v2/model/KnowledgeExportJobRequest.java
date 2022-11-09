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
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeExportJobRequest
 */

public class KnowledgeExportJobRequest  implements Serializable {
  
  private KnowledgeExportJobFilter exportFilter = null;

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
   * File type of the document
   */
 @JsonDeserialize(using = FileTypeEnumDeserializer.class)
  public enum FileTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    JSON("Json"),
    CSV("Csv"),
    XLSX("Xlsx");

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
   * What to export.
   **/
  public KnowledgeExportJobRequest exportFilter(KnowledgeExportJobFilter exportFilter) {
    this.exportFilter = exportFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "What to export.")
  @JsonProperty("exportFilter")
  public KnowledgeExportJobFilter getExportFilter() {
    return exportFilter;
  }
  public void setExportFilter(KnowledgeExportJobFilter exportFilter) {
    this.exportFilter = exportFilter;
  }


  /**
   * File type of the document
   **/
  public KnowledgeExportJobRequest fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File type of the document")
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
    KnowledgeExportJobRequest knowledgeExportJobRequest = (KnowledgeExportJobRequest) o;

    return Objects.equals(this.exportFilter, knowledgeExportJobRequest.exportFilter) &&
            Objects.equals(this.fileType, knowledgeExportJobRequest.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportFilter, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeExportJobRequest {\n");
    
    sb.append("    exportFilter: ").append(toIndentedString(exportFilter)).append("\n");
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

