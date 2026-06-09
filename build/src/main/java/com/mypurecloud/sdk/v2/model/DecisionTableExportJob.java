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
import com.mypurecloud.sdk.v2.model.DecisionTableExportJobError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DecisionTableExportJob
 */

public class DecisionTableExportJob  implements Serializable {
  
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
   * Current status of the export job.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    COMPLETE("Complete"),
    FAILED("Failed");

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
  private AddressableEntityRef createdBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String fileName = null;
  private AddressableEntityRef download = null;
  private Date dateDownloadExpires = null;

  private static class ExportTypeEnumDeserializer extends StdDeserializer<ExportTypeEnum> {
    public ExportTypeEnumDeserializer() {
      super(ExportTypeEnumDeserializer.class);
    }

    @Override
    public ExportTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExportTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of export that was performed.
   */
 @JsonDeserialize(using = ExportTypeEnumDeserializer.class)
  public enum ExportTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEMPLATE("Template"),
    POPULATED("Populated");

    private String value;

    ExportTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExportTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ExportTypeEnum value : ExportTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExportTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExportTypeEnum exportType = null;
  private Integer totalRows = null;
  private Integer rowsExported = null;

  private static class FormatEnumDeserializer extends StdDeserializer<FormatEnum> {
    public FormatEnumDeserializer() {
      super(FormatEnumDeserializer.class);
    }

    @Override
    public FormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The format of the exported file.
   */
 @JsonDeserialize(using = FormatEnumDeserializer.class)
  public enum FormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CSV("Csv");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FormatEnum fromString(String key) {
      if (key == null) return null;

      for (FormatEnum value : FormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FormatEnum format = null;
  private DecisionTableExportJobError error = null;
  private String selfUri = null;

  public DecisionTableExportJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DecisionTableExportJob(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The version of the decision table that was exported.")
  @JsonProperty("tableVersion")
  public Integer getTableVersion() {
    return tableVersion;
  }


  @ApiModelProperty(example = "null", value = "Current status of the export job.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The user who created the export job.")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "Date when this export job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date when this export job was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "Name of the exported file.")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }


  @ApiModelProperty(example = "null", value = "Reference to the download resource for obtaining the exported file.")
  @JsonProperty("download")
  public AddressableEntityRef getDownload() {
    return download;
  }


  @ApiModelProperty(example = "null", value = "Date when the download link expires. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDownloadExpires")
  public Date getDateDownloadExpires() {
    return dateDownloadExpires;
  }


  @ApiModelProperty(example = "null", value = "The type of export that was performed.")
  @JsonProperty("exportType")
  public ExportTypeEnum getExportType() {
    return exportType;
  }


  @ApiModelProperty(example = "null", value = "Total number of rows to export (set when row loading begins).")
  @JsonProperty("totalRows")
  public Integer getTotalRows() {
    return totalRows;
  }


  @ApiModelProperty(example = "null", value = "The number of rows exported.")
  @JsonProperty("rowsExported")
  public Integer getRowsExported() {
    return rowsExported;
  }


  @ApiModelProperty(example = "null", value = "The format of the exported file.")
  @JsonProperty("format")
  public FormatEnum getFormat() {
    return format;
  }


  @ApiModelProperty(example = "null", value = "Error details if the export job failed.")
  @JsonProperty("error")
  public DecisionTableExportJobError getError() {
    return error;
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
    DecisionTableExportJob decisionTableExportJob = (DecisionTableExportJob) o;

    return Objects.equals(this.id, decisionTableExportJob.id) &&
            Objects.equals(this.tableVersion, decisionTableExportJob.tableVersion) &&
            Objects.equals(this.status, decisionTableExportJob.status) &&
            Objects.equals(this.createdBy, decisionTableExportJob.createdBy) &&
            Objects.equals(this.dateCreated, decisionTableExportJob.dateCreated) &&
            Objects.equals(this.dateModified, decisionTableExportJob.dateModified) &&
            Objects.equals(this.fileName, decisionTableExportJob.fileName) &&
            Objects.equals(this.download, decisionTableExportJob.download) &&
            Objects.equals(this.dateDownloadExpires, decisionTableExportJob.dateDownloadExpires) &&
            Objects.equals(this.exportType, decisionTableExportJob.exportType) &&
            Objects.equals(this.totalRows, decisionTableExportJob.totalRows) &&
            Objects.equals(this.rowsExported, decisionTableExportJob.rowsExported) &&
            Objects.equals(this.format, decisionTableExportJob.format) &&
            Objects.equals(this.error, decisionTableExportJob.error) &&
            Objects.equals(this.selfUri, decisionTableExportJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tableVersion, status, createdBy, dateCreated, dateModified, fileName, download, dateDownloadExpires, exportType, totalRows, rowsExported, format, error, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableExportJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tableVersion: ").append(toIndentedString(tableVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    dateDownloadExpires: ").append(toIndentedString(dateDownloadExpires)).append("\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    rowsExported: ").append(toIndentedString(rowsExported)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

