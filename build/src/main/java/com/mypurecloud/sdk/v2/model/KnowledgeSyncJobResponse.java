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
import com.mypurecloud.sdk.v2.model.KnowledgeBaseReference;
import com.mypurecloud.sdk.v2.model.KnowledgeOperationSource;
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobReport;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeSyncJobResponse
 */

public class KnowledgeSyncJobResponse  implements Serializable {
  
  private String id = null;
  private String uploadKey = null;

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
  private KnowledgeSyncJobReport report = null;
  private KnowledgeBaseReference knowledgeBase = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private UserReference createdBy = null;
  private String downloadURL = null;
  private String failedEntitiesURL = null;
  private KnowledgeOperationSource source = null;
  private String selfUri = null;

  public KnowledgeSyncJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Id of the sync job.
   **/
  public KnowledgeSyncJobResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the sync job.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public KnowledgeSyncJobResponse uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   * The status of the export job.
   **/
  public KnowledgeSyncJobResponse status(StatusEnum status) {
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
   * Report of the sync job
   **/
  public KnowledgeSyncJobResponse report(KnowledgeSyncJobReport report) {
    this.report = report;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Report of the sync job")
  @JsonProperty("report")
  public KnowledgeSyncJobReport getReport() {
    return report;
  }
  public void setReport(KnowledgeSyncJobReport report) {
    this.report = report;
  }


  /**
   * Knowledge base which document export belongs to.
   **/
  public KnowledgeSyncJobResponse knowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base which document export belongs to.")
  @JsonProperty("knowledgeBase")
  public KnowledgeBaseReference getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeSyncJobResponse dateCreated(Date dateCreated) {
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
  public KnowledgeSyncJobResponse dateModified(Date dateModified) {
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
   * The user who created the operation
   **/
  public KnowledgeSyncJobResponse createdBy(UserReference createdBy) {
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
   * The URL of the location at which the caller can download the sync file, when available.
   **/
  public KnowledgeSyncJobResponse downloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can download the sync file, when available.")
  @JsonProperty("downloadURL")
  public String getDownloadURL() {
    return downloadURL;
  }
  public void setDownloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
  }


  /**
   * The URL of the location at which the caller can download the entities in json format that failed during the sync.
   **/
  public KnowledgeSyncJobResponse failedEntitiesURL(String failedEntitiesURL) {
    this.failedEntitiesURL = failedEntitiesURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can download the entities in json format that failed during the sync.")
  @JsonProperty("failedEntitiesURL")
  public String getFailedEntitiesURL() {
    return failedEntitiesURL;
  }
  public void setFailedEntitiesURL(String failedEntitiesURL) {
    this.failedEntitiesURL = failedEntitiesURL;
  }


  /**
   * Source of the sync job.
   **/
  public KnowledgeSyncJobResponse source(KnowledgeOperationSource source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source of the sync job.")
  @JsonProperty("source")
  public KnowledgeOperationSource getSource() {
    return source;
  }
  public void setSource(KnowledgeOperationSource source) {
    this.source = source;
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
    KnowledgeSyncJobResponse knowledgeSyncJobResponse = (KnowledgeSyncJobResponse) o;

    return Objects.equals(this.id, knowledgeSyncJobResponse.id) &&
            Objects.equals(this.uploadKey, knowledgeSyncJobResponse.uploadKey) &&
            Objects.equals(this.status, knowledgeSyncJobResponse.status) &&
            Objects.equals(this.report, knowledgeSyncJobResponse.report) &&
            Objects.equals(this.knowledgeBase, knowledgeSyncJobResponse.knowledgeBase) &&
            Objects.equals(this.dateCreated, knowledgeSyncJobResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeSyncJobResponse.dateModified) &&
            Objects.equals(this.createdBy, knowledgeSyncJobResponse.createdBy) &&
            Objects.equals(this.downloadURL, knowledgeSyncJobResponse.downloadURL) &&
            Objects.equals(this.failedEntitiesURL, knowledgeSyncJobResponse.failedEntitiesURL) &&
            Objects.equals(this.source, knowledgeSyncJobResponse.source) &&
            Objects.equals(this.selfUri, knowledgeSyncJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uploadKey, status, report, knowledgeBase, dateCreated, dateModified, createdBy, downloadURL, failedEntitiesURL, source, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSyncJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
    sb.append("    failedEntitiesURL: ").append(toIndentedString(failedEntitiesURL)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

