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
 * State information for an export job of rows from a datatable
 */
@ApiModel(description = "State information for an export job of rows from a datatable")

public class DataTableExportJob  implements Serializable {
  
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
   * The status of the export job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private String downloadURI = null;
  private ErrorBody errorInformation = null;
  private Integer countRecordsProcessed = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DataTableExportJob name(String name) {
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
   * The PureCloud user who started the export job
   **/
  public DataTableExportJob owner(AddressableEntityRef owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud user who started the export job")
  @JsonProperty("owner")
  public AddressableEntityRef getOwner() {
    return owner;
  }
  public void setOwner(AddressableEntityRef owner) {
    this.owner = owner;
  }

  
  /**
   * The status of the export job
   **/
  public DataTableExportJob status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the export job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DataTableExportJob dateCreated(Date dateCreated) {
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
   * The timestamp of when the export stopped (either successfully or unsuccessfully). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DataTableExportJob dateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of when the export stopped (either successfully or unsuccessfully). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  
  /**
   * The URL of the location at which the caller can download the export file, when available
   **/
  public DataTableExportJob downloadURI(String downloadURI) {
    this.downloadURI = downloadURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can download the export file, when available")
  @JsonProperty("downloadURI")
  public String getDownloadURI() {
    return downloadURI;
  }
  public void setDownloadURI(String downloadURI) {
    this.downloadURI = downloadURI;
  }

  
  /**
   * Any error information, or null of the processing is not in an error state
   **/
  public DataTableExportJob errorInformation(ErrorBody errorInformation) {
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
  public DataTableExportJob countRecordsProcessed(Integer countRecordsProcessed) {
    this.countRecordsProcessed = countRecordsProcessed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current count of the number of records processed")
  @JsonProperty("countRecordsProcessed")
  public Integer getCountRecordsProcessed() {
    return countRecordsProcessed;
  }
  public void setCountRecordsProcessed(Integer countRecordsProcessed) {
    this.countRecordsProcessed = countRecordsProcessed;
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
    DataTableExportJob dataTableExportJob = (DataTableExportJob) o;
    return Objects.equals(this.id, dataTableExportJob.id) &&
        Objects.equals(this.name, dataTableExportJob.name) &&
        Objects.equals(this.owner, dataTableExportJob.owner) &&
        Objects.equals(this.status, dataTableExportJob.status) &&
        Objects.equals(this.dateCreated, dataTableExportJob.dateCreated) &&
        Objects.equals(this.dateCompleted, dataTableExportJob.dateCompleted) &&
        Objects.equals(this.downloadURI, dataTableExportJob.downloadURI) &&
        Objects.equals(this.errorInformation, dataTableExportJob.errorInformation) &&
        Objects.equals(this.countRecordsProcessed, dataTableExportJob.countRecordsProcessed) &&
        Objects.equals(this.selfUri, dataTableExportJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, status, dateCreated, dateCompleted, downloadURI, errorInformation, countRecordsProcessed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTableExportJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    downloadURI: ").append(toIndentedString(downloadURI)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    countRecordsProcessed: ").append(toIndentedString(countRecordsProcessed)).append("\n");
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

