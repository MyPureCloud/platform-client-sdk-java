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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DecisionTableImportJobError;
import com.mypurecloud.sdk.v2.model.DecisionTableImportRowMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * State of a decision table row import job
 */
@ApiModel(description = "State of a decision table row import job")

public class DecisionTableImportJob  implements Serializable {
  
  private String id = null;
  private Integer tableVersion = null;

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
   * Current status of the import job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPLOADING("Uploading"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    FAILED("Failed"),
    CANCELLED("Cancelled");

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
  private String uploadUrl = null;
  private Map<String, String> uploadHeaders = null;

  private static class ImportModeEnumDeserializer extends StdDeserializer<ImportModeEnum> {
    public ImportModeEnumDeserializer() {
      super(ImportModeEnumDeserializer.class);
    }

    @Override
    public ImportModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ImportModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Whether rows are appended to existing rows or rows are replaced
   */
 @JsonDeserialize(using = ImportModeEnumDeserializer.class)
  public enum ImportModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPEND("Append"),
    REPLACE("Replace");

    private String value;

    ImportModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ImportModeEnum fromString(String key) {
      if (key == null) return null;

      for (ImportModeEnum value : ImportModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ImportModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ImportModeEnum importMode = null;
  private String fileName = null;
  private AddressableEntityRef createdBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date dateCompleted = null;
  private Date dateExpires = null;
  private DecisionTableImportRowMetrics rowMetrics = null;
  private DecisionTableImportJobError error = null;
  private String selfUri = null;

  public DecisionTableImportJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DecisionTableImportJob(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The table version to be replaced by this import
   **/
  public DecisionTableImportJob tableVersion(Integer tableVersion) {
    this.tableVersion = tableVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The table version to be replaced by this import")
  @JsonProperty("tableVersion")
  public Integer getTableVersion() {
    return tableVersion;
  }
  public void setTableVersion(Integer tableVersion) {
    this.tableVersion = tableVersion;
  }


  /**
   * Current status of the import job
   **/
  public DecisionTableImportJob status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current status of the import job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Pre-signed URL to upload the import file (PUT)
   **/
  public DecisionTableImportJob uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pre-signed URL to upload the import file (PUT)")
  @JsonProperty("uploadUrl")
  public String getUploadUrl() {
    return uploadUrl;
  }
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  /**
   * Headers required when uploading file with data to be imported to uploadUrl
   **/
  public DecisionTableImportJob uploadHeaders(Map<String, String> uploadHeaders) {
    this.uploadHeaders = uploadHeaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headers required when uploading file with data to be imported to uploadUrl")
  @JsonProperty("uploadHeaders")
  public Map<String, String> getUploadHeaders() {
    return uploadHeaders;
  }
  public void setUploadHeaders(Map<String, String> uploadHeaders) {
    this.uploadHeaders = uploadHeaders;
  }


  /**
   * Whether rows are appended to existing rows or rows are replaced
   **/
  public DecisionTableImportJob importMode(ImportModeEnum importMode) {
    this.importMode = importMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether rows are appended to existing rows or rows are replaced")
  @JsonProperty("importMode")
  public ImportModeEnum getImportMode() {
    return importMode;
  }
  public void setImportMode(ImportModeEnum importMode) {
    this.importMode = importMode;
  }


  /**
   * Original file name supplied when the job was created, including the file extension
   **/
  public DecisionTableImportJob fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Original file name supplied when the job was created, including the file extension")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @ApiModelProperty(example = "null", value = "The user who created the job")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
  }


  /**
   * When the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DecisionTableImportJob dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * When the job was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DecisionTableImportJob dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the job was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * When processing finished, successfully or not. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DecisionTableImportJob dateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When processing finished, successfully or not. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  /**
   * When upload credentials expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DecisionTableImportJob dateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When upload credentials expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }


  /**
   * Row-level metrics populated incrementally during import processing
   **/
  public DecisionTableImportJob rowMetrics(DecisionTableImportRowMetrics rowMetrics) {
    this.rowMetrics = rowMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Row-level metrics populated incrementally during import processing")
  @JsonProperty("rowMetrics")
  public DecisionTableImportRowMetrics getRowMetrics() {
    return rowMetrics;
  }
  public void setRowMetrics(DecisionTableImportRowMetrics rowMetrics) {
    this.rowMetrics = rowMetrics;
  }


  /**
   * Present when the import job could not be successfully finished
   **/
  public DecisionTableImportJob error(DecisionTableImportJobError error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Present when the import job could not be successfully finished")
  @JsonProperty("error")
  public DecisionTableImportJobError getError() {
    return error;
  }
  public void setError(DecisionTableImportJobError error) {
    this.error = error;
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
    DecisionTableImportJob decisionTableImportJob = (DecisionTableImportJob) o;

    return Objects.equals(this.id, decisionTableImportJob.id) &&
            Objects.equals(this.tableVersion, decisionTableImportJob.tableVersion) &&
            Objects.equals(this.status, decisionTableImportJob.status) &&
            Objects.equals(this.uploadUrl, decisionTableImportJob.uploadUrl) &&
            Objects.equals(this.uploadHeaders, decisionTableImportJob.uploadHeaders) &&
            Objects.equals(this.importMode, decisionTableImportJob.importMode) &&
            Objects.equals(this.fileName, decisionTableImportJob.fileName) &&
            Objects.equals(this.createdBy, decisionTableImportJob.createdBy) &&
            Objects.equals(this.dateCreated, decisionTableImportJob.dateCreated) &&
            Objects.equals(this.dateModified, decisionTableImportJob.dateModified) &&
            Objects.equals(this.dateCompleted, decisionTableImportJob.dateCompleted) &&
            Objects.equals(this.dateExpires, decisionTableImportJob.dateExpires) &&
            Objects.equals(this.rowMetrics, decisionTableImportJob.rowMetrics) &&
            Objects.equals(this.error, decisionTableImportJob.error) &&
            Objects.equals(this.selfUri, decisionTableImportJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tableVersion, status, uploadUrl, uploadHeaders, importMode, fileName, createdBy, dateCreated, dateModified, dateCompleted, dateExpires, rowMetrics, error, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableImportJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tableVersion: ").append(toIndentedString(tableVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    uploadHeaders: ").append(toIndentedString(uploadHeaders)).append("\n");
    sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    rowMetrics: ").append(toIndentedString(rowMetrics)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

