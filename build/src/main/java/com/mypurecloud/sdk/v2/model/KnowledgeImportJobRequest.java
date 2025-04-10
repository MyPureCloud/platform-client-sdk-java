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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeImportJobRequest
 */

public class KnowledgeImportJobRequest  implements Serializable {
  
  private String uploadKey = null;

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
  private KnowledgeImportJobSettings settings = null;
  private Boolean skipConfirmationStep = null;

  public KnowledgeImportJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Upload key
   **/
  public KnowledgeImportJobRequest uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Upload key")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   * File type of the document
   **/
  public KnowledgeImportJobRequest fileType(FileTypeEnum fileType) {
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


  /**
   * Additional optional settings
   **/
  public KnowledgeImportJobRequest settings(KnowledgeImportJobSettings settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional optional settings")
  @JsonProperty("settings")
  public KnowledgeImportJobSettings getSettings() {
    return settings;
  }
  public void setSettings(KnowledgeImportJobSettings settings) {
    this.settings = settings;
  }


  /**
   * If enabled pre-validation step will be skipped.
   **/
  public KnowledgeImportJobRequest skipConfirmationStep(Boolean skipConfirmationStep) {
    this.skipConfirmationStep = skipConfirmationStep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If enabled pre-validation step will be skipped.")
  @JsonProperty("skipConfirmationStep")
  public Boolean getSkipConfirmationStep() {
    return skipConfirmationStep;
  }
  public void setSkipConfirmationStep(Boolean skipConfirmationStep) {
    this.skipConfirmationStep = skipConfirmationStep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeImportJobRequest knowledgeImportJobRequest = (KnowledgeImportJobRequest) o;

    return Objects.equals(this.uploadKey, knowledgeImportJobRequest.uploadKey) &&
            Objects.equals(this.fileType, knowledgeImportJobRequest.fileType) &&
            Objects.equals(this.settings, knowledgeImportJobRequest.settings) &&
            Objects.equals(this.skipConfirmationStep, knowledgeImportJobRequest.skipConfirmationStep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadKey, fileType, settings, skipConfirmationStep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeImportJobRequest {\n");
    
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    skipConfirmationStep: ").append(toIndentedString(skipConfirmationStep)).append("\n");
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

