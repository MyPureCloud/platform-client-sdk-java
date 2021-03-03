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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * State information for an import job of rows to a datatable
 */
@ApiModel(description = "State information for an import job of rows to a datatable")

public class DataTableImportJob  implements Serializable {
  
  private String id = null;
  private String name = null;
  private AddressableEntityRef owner = null;

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
   * The status of the import job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WAITINGFORUPLOAD("WaitingForUpload"),
    PROCESSING("Processing"),
    FAILED("Failed"),
    SUCCEEDED("Succeeded");

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
  private Date dateCreated = null;
  private Date dateCompleted = null;
  private String uploadURI = null;

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
   * The indication of whether the processing should remove rows that don't appear in the import file
   */
 @JsonDeserialize(using = ImportModeEnumDeserializer.class)
  public enum ImportModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REPLACEALL("ReplaceAll"),
    APPEND("Append");

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
  private ErrorBody errorInformation = null;
  private Integer countRecordsUpdated = null;
  private Integer countRecordsDeleted = null;
  private Integer countRecordsFailed = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DataTableImportJob name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The PureCloud user who started the import job
   **/
  public DataTableImportJob owner(AddressableEntityRef owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud user who started the import job")
  @JsonProperty("owner")
  public AddressableEntityRef getOwner() {
    return owner;
  }
  public void setOwner(AddressableEntityRef owner) {
    this.owner = owner;
  }

  
  /**
   * The status of the import job
   **/
  public DataTableImportJob status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the import job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The timestamp of when the import began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DataTableImportJob dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the import began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The timestamp of when the import stopped (either successfully or unsuccessfully). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DataTableImportJob dateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the import stopped (either successfully or unsuccessfully). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  
  /**
   * The URL of the location at which the caller can upload the file to be imported
   **/
  public DataTableImportJob uploadURI(String uploadURI) {
    this.uploadURI = uploadURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can upload the file to be imported")
  @JsonProperty("uploadURI")
  public String getUploadURI() {
    return uploadURI;
  }
  public void setUploadURI(String uploadURI) {
    this.uploadURI = uploadURI;
  }

  
  /**
   * The indication of whether the processing should remove rows that don't appear in the import file
   **/
  public DataTableImportJob importMode(ImportModeEnum importMode) {
    this.importMode = importMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The indication of whether the processing should remove rows that don't appear in the import file")
  @JsonProperty("importMode")
  public ImportModeEnum getImportMode() {
    return importMode;
  }
  public void setImportMode(ImportModeEnum importMode) {
    this.importMode = importMode;
  }

  
  /**
   * Any error information, or null of the processing is not in an error state
   **/
  public DataTableImportJob errorInformation(ErrorBody errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any error information, or null of the processing is not in an error state")
  @JsonProperty("errorInformation")
  public ErrorBody getErrorInformation() {
    return errorInformation;
  }
  public void setErrorInformation(ErrorBody errorInformation) {
    this.errorInformation = errorInformation;
  }

  
  /**
   * The current count of the number of records processed
   **/
  public DataTableImportJob countRecordsUpdated(Integer countRecordsUpdated) {
    this.countRecordsUpdated = countRecordsUpdated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current count of the number of records processed")
  @JsonProperty("countRecordsUpdated")
  public Integer getCountRecordsUpdated() {
    return countRecordsUpdated;
  }
  public void setCountRecordsUpdated(Integer countRecordsUpdated) {
    this.countRecordsUpdated = countRecordsUpdated;
  }

  
  /**
   * The current count of the number of records deleted
   **/
  public DataTableImportJob countRecordsDeleted(Integer countRecordsDeleted) {
    this.countRecordsDeleted = countRecordsDeleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current count of the number of records deleted")
  @JsonProperty("countRecordsDeleted")
  public Integer getCountRecordsDeleted() {
    return countRecordsDeleted;
  }
  public void setCountRecordsDeleted(Integer countRecordsDeleted) {
    this.countRecordsDeleted = countRecordsDeleted;
  }

  
  /**
   * The current count of the number of records that failed to import
   **/
  public DataTableImportJob countRecordsFailed(Integer countRecordsFailed) {
    this.countRecordsFailed = countRecordsFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current count of the number of records that failed to import")
  @JsonProperty("countRecordsFailed")
  public Integer getCountRecordsFailed() {
    return countRecordsFailed;
  }
  public void setCountRecordsFailed(Integer countRecordsFailed) {
    this.countRecordsFailed = countRecordsFailed;
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
    DataTableImportJob dataTableImportJob = (DataTableImportJob) o;
    return Objects.equals(this.id, dataTableImportJob.id) &&
        Objects.equals(this.name, dataTableImportJob.name) &&
        Objects.equals(this.owner, dataTableImportJob.owner) &&
        Objects.equals(this.status, dataTableImportJob.status) &&
        Objects.equals(this.dateCreated, dataTableImportJob.dateCreated) &&
        Objects.equals(this.dateCompleted, dataTableImportJob.dateCompleted) &&
        Objects.equals(this.uploadURI, dataTableImportJob.uploadURI) &&
        Objects.equals(this.importMode, dataTableImportJob.importMode) &&
        Objects.equals(this.errorInformation, dataTableImportJob.errorInformation) &&
        Objects.equals(this.countRecordsUpdated, dataTableImportJob.countRecordsUpdated) &&
        Objects.equals(this.countRecordsDeleted, dataTableImportJob.countRecordsDeleted) &&
        Objects.equals(this.countRecordsFailed, dataTableImportJob.countRecordsFailed) &&
        Objects.equals(this.selfUri, dataTableImportJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, status, dateCreated, dateCompleted, uploadURI, importMode, errorInformation, countRecordsUpdated, countRecordsDeleted, countRecordsFailed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTableImportJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    uploadURI: ").append(toIndentedString(uploadURI)).append("\n");
    sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    countRecordsUpdated: ").append(toIndentedString(countRecordsUpdated)).append("\n");
    sb.append("    countRecordsDeleted: ").append(toIndentedString(countRecordsDeleted)).append("\n");
    sb.append("    countRecordsFailed: ").append(toIndentedString(countRecordsFailed)).append("\n");
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

