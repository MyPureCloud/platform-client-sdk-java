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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobFilter;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeExportJobResponse
 */

public class KnowledgeExportJobResponse  implements Serializable {
  
  private String id = null;
  private String downloadURL = null;

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
  private Integer jsonFileVersion = null;
  private Integer countDocumentProcessed = null;
  private KnowledgeExportJobFilter exportFilter = null;

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
   * The status of the export job.
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
  private KnowledgeBase knowledgeBase = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private ErrorBody errorInformation = null;
  private String selfUri = null;

  
  /**
   * Id of the export job.
   **/
  public KnowledgeExportJobResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the export job.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The URL of the location at which the caller can download the export file, when available.
   **/
  public KnowledgeExportJobResponse downloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can download the export file, when available.")
  @JsonProperty("downloadURL")
  public String getDownloadURL() {
    return downloadURL;
  }
  public void setDownloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
  }


  /**
   * File type of the document
   **/
  public KnowledgeExportJobResponse fileType(FileTypeEnum fileType) {
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
   * Requested version of the exported json file.
   **/
  public KnowledgeExportJobResponse jsonFileVersion(Integer jsonFileVersion) {
    this.jsonFileVersion = jsonFileVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Requested version of the exported json file.")
  @JsonProperty("jsonFileVersion")
  public Integer getJsonFileVersion() {
    return jsonFileVersion;
  }
  public void setJsonFileVersion(Integer jsonFileVersion) {
    this.jsonFileVersion = jsonFileVersion;
  }


  /**
   * The current count of the number of records processed.
   **/
  public KnowledgeExportJobResponse countDocumentProcessed(Integer countDocumentProcessed) {
    this.countDocumentProcessed = countDocumentProcessed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current count of the number of records processed.")
  @JsonProperty("countDocumentProcessed")
  public Integer getCountDocumentProcessed() {
    return countDocumentProcessed;
  }
  public void setCountDocumentProcessed(Integer countDocumentProcessed) {
    this.countDocumentProcessed = countDocumentProcessed;
  }


  /**
   * Filters to narrow down what to export.
   **/
  public KnowledgeExportJobResponse exportFilter(KnowledgeExportJobFilter exportFilter) {
    this.exportFilter = exportFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters to narrow down what to export.")
  @JsonProperty("exportFilter")
  public KnowledgeExportJobFilter getExportFilter() {
    return exportFilter;
  }
  public void setExportFilter(KnowledgeExportJobFilter exportFilter) {
    this.exportFilter = exportFilter;
  }


  /**
   * The status of the export job.
   **/
  public KnowledgeExportJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the export job.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Knowledge base which document export belongs to.
   **/
  public KnowledgeExportJobResponse knowledgeBase(KnowledgeBase knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base which document export belongs to.")
  @JsonProperty("knowledgeBase")
  public KnowledgeBase getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * The user who created the operation
   **/
  public KnowledgeExportJobResponse createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who created the operation")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeExportJobResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The timestamp of when the export stopped. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeExportJobResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the export stopped. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Any error information, or null of the processing is not in failed state.
   **/
  public KnowledgeExportJobResponse errorInformation(ErrorBody errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any error information, or null of the processing is not in failed state.")
  @JsonProperty("errorInformation")
  public ErrorBody getErrorInformation() {
    return errorInformation;
  }
  public void setErrorInformation(ErrorBody errorInformation) {
    this.errorInformation = errorInformation;
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
    KnowledgeExportJobResponse knowledgeExportJobResponse = (KnowledgeExportJobResponse) o;

    return Objects.equals(this.id, knowledgeExportJobResponse.id) &&
            Objects.equals(this.downloadURL, knowledgeExportJobResponse.downloadURL) &&
            Objects.equals(this.fileType, knowledgeExportJobResponse.fileType) &&
            Objects.equals(this.jsonFileVersion, knowledgeExportJobResponse.jsonFileVersion) &&
            Objects.equals(this.countDocumentProcessed, knowledgeExportJobResponse.countDocumentProcessed) &&
            Objects.equals(this.exportFilter, knowledgeExportJobResponse.exportFilter) &&
            Objects.equals(this.status, knowledgeExportJobResponse.status) &&
            Objects.equals(this.knowledgeBase, knowledgeExportJobResponse.knowledgeBase) &&
            Objects.equals(this.createdBy, knowledgeExportJobResponse.createdBy) &&
            Objects.equals(this.dateCreated, knowledgeExportJobResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeExportJobResponse.dateModified) &&
            Objects.equals(this.errorInformation, knowledgeExportJobResponse.errorInformation) &&
            Objects.equals(this.selfUri, knowledgeExportJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadURL, fileType, jsonFileVersion, countDocumentProcessed, exportFilter, status, knowledgeBase, createdBy, dateCreated, dateModified, errorInformation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeExportJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    jsonFileVersion: ").append(toIndentedString(jsonFileVersion)).append("\n");
    sb.append("    countDocumentProcessed: ").append(toIndentedString(countDocumentProcessed)).append("\n");
    sb.append("    exportFilter: ").append(toIndentedString(exportFilter)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

