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
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobReport;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobSettings;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeImportJobResponse
 */

public class KnowledgeImportJobResponse  implements Serializable {
  
  private String id = null;
  private String downloadURL = null;
  private String failedEntitiesURL = null;
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
   * Status of the import job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATED("Created"),
    VALIDATIONINPROGRESS("ValidationInProgress"),
    VALIDATIONCOMPLETED("ValidationCompleted"),
    VALIDATIONFAILED("ValidationFailed"),
    STARTED("Started"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    PARTIALCOMPLETED("PartialCompleted"),
    FAILED("Failed"),
    ABORTREQUESTED("AbortRequested"),
    ABORTED("Aborted");

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
  private KnowledgeImportJobReport report = null;
  private KnowledgeBase knowledgeBase = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Boolean skipConfirmationStep = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "Id of the import job")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The URL of the location at which the caller can download the imported file.
   **/
  public KnowledgeImportJobResponse downloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can download the imported file.")
  @JsonProperty("downloadURL")
  public String getDownloadURL() {
    return downloadURL;
  }
  public void setDownloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
  }


  /**
   * The URL of the location at which the caller can download the entities in json format that failed during the import.
   **/
  public KnowledgeImportJobResponse failedEntitiesURL(String failedEntitiesURL) {
    this.failedEntitiesURL = failedEntitiesURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can download the entities in json format that failed during the import.")
  @JsonProperty("failedEntitiesURL")
  public String getFailedEntitiesURL() {
    return failedEntitiesURL;
  }
  public void setFailedEntitiesURL(String failedEntitiesURL) {
    this.failedEntitiesURL = failedEntitiesURL;
  }


  /**
   * Upload key
   **/
  public KnowledgeImportJobResponse uploadKey(String uploadKey) {
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
  public KnowledgeImportJobResponse fileType(FileTypeEnum fileType) {
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
  public KnowledgeImportJobResponse settings(KnowledgeImportJobSettings settings) {
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


  @ApiModelProperty(example = "null", value = "Status of the import job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "Report of the import job")
  @JsonProperty("report")
  public KnowledgeImportJobReport getReport() {
    return report;
  }


  @ApiModelProperty(example = "null", value = "Knowledge base which document import does belong to")
  @JsonProperty("knowledgeBase")
  public KnowledgeBase getKnowledgeBase() {
    return knowledgeBase;
  }


  @ApiModelProperty(example = "null", value = "The user who created the operation")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "Created date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * If enabled pre-validation step will be skipped.
   **/
  public KnowledgeImportJobResponse skipConfirmationStep(Boolean skipConfirmationStep) {
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
    KnowledgeImportJobResponse knowledgeImportJobResponse = (KnowledgeImportJobResponse) o;

    return Objects.equals(this.id, knowledgeImportJobResponse.id) &&
            Objects.equals(this.downloadURL, knowledgeImportJobResponse.downloadURL) &&
            Objects.equals(this.failedEntitiesURL, knowledgeImportJobResponse.failedEntitiesURL) &&
            Objects.equals(this.uploadKey, knowledgeImportJobResponse.uploadKey) &&
            Objects.equals(this.fileType, knowledgeImportJobResponse.fileType) &&
            Objects.equals(this.settings, knowledgeImportJobResponse.settings) &&
            Objects.equals(this.status, knowledgeImportJobResponse.status) &&
            Objects.equals(this.report, knowledgeImportJobResponse.report) &&
            Objects.equals(this.knowledgeBase, knowledgeImportJobResponse.knowledgeBase) &&
            Objects.equals(this.createdBy, knowledgeImportJobResponse.createdBy) &&
            Objects.equals(this.dateCreated, knowledgeImportJobResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeImportJobResponse.dateModified) &&
            Objects.equals(this.skipConfirmationStep, knowledgeImportJobResponse.skipConfirmationStep) &&
            Objects.equals(this.selfUri, knowledgeImportJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadURL, failedEntitiesURL, uploadKey, fileType, settings, status, report, knowledgeBase, createdBy, dateCreated, dateModified, skipConfirmationStep, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeImportJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
    sb.append("    failedEntitiesURL: ").append(toIndentedString(failedEntitiesURL)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    skipConfirmationStep: ").append(toIndentedString(skipConfirmationStep)).append("\n");
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

