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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactImportJobMetadata
 */

public class ContactImportJobMetadata  implements Serializable {
  
  private String fileName = null;
  private Integer dryRunFailedCount = null;
  private Integer dryRunSuccessCount = null;
  private String dryRunReportDownloadUrl = null;
  private Integer importFailedCount = null;
  private Integer importSuccessCount = null;
  private String importReportDownloadUrl = null;

  public ContactImportJobMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ContactImportJobMetadata fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   **/
  public ContactImportJobMetadata dryRunFailedCount(Integer dryRunFailedCount) {
    this.dryRunFailedCount = dryRunFailedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dryRunFailedCount")
  public Integer getDryRunFailedCount() {
    return dryRunFailedCount;
  }
  public void setDryRunFailedCount(Integer dryRunFailedCount) {
    this.dryRunFailedCount = dryRunFailedCount;
  }


  /**
   **/
  public ContactImportJobMetadata dryRunSuccessCount(Integer dryRunSuccessCount) {
    this.dryRunSuccessCount = dryRunSuccessCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dryRunSuccessCount")
  public Integer getDryRunSuccessCount() {
    return dryRunSuccessCount;
  }
  public void setDryRunSuccessCount(Integer dryRunSuccessCount) {
    this.dryRunSuccessCount = dryRunSuccessCount;
  }


  /**
   **/
  public ContactImportJobMetadata dryRunReportDownloadUrl(String dryRunReportDownloadUrl) {
    this.dryRunReportDownloadUrl = dryRunReportDownloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dryRunReportDownloadUrl")
  public String getDryRunReportDownloadUrl() {
    return dryRunReportDownloadUrl;
  }
  public void setDryRunReportDownloadUrl(String dryRunReportDownloadUrl) {
    this.dryRunReportDownloadUrl = dryRunReportDownloadUrl;
  }


  /**
   **/
  public ContactImportJobMetadata importFailedCount(Integer importFailedCount) {
    this.importFailedCount = importFailedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importFailedCount")
  public Integer getImportFailedCount() {
    return importFailedCount;
  }
  public void setImportFailedCount(Integer importFailedCount) {
    this.importFailedCount = importFailedCount;
  }


  /**
   **/
  public ContactImportJobMetadata importSuccessCount(Integer importSuccessCount) {
    this.importSuccessCount = importSuccessCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importSuccessCount")
  public Integer getImportSuccessCount() {
    return importSuccessCount;
  }
  public void setImportSuccessCount(Integer importSuccessCount) {
    this.importSuccessCount = importSuccessCount;
  }


  /**
   **/
  public ContactImportJobMetadata importReportDownloadUrl(String importReportDownloadUrl) {
    this.importReportDownloadUrl = importReportDownloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importReportDownloadUrl")
  public String getImportReportDownloadUrl() {
    return importReportDownloadUrl;
  }
  public void setImportReportDownloadUrl(String importReportDownloadUrl) {
    this.importReportDownloadUrl = importReportDownloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactImportJobMetadata contactImportJobMetadata = (ContactImportJobMetadata) o;

    return Objects.equals(this.fileName, contactImportJobMetadata.fileName) &&
            Objects.equals(this.dryRunFailedCount, contactImportJobMetadata.dryRunFailedCount) &&
            Objects.equals(this.dryRunSuccessCount, contactImportJobMetadata.dryRunSuccessCount) &&
            Objects.equals(this.dryRunReportDownloadUrl, contactImportJobMetadata.dryRunReportDownloadUrl) &&
            Objects.equals(this.importFailedCount, contactImportJobMetadata.importFailedCount) &&
            Objects.equals(this.importSuccessCount, contactImportJobMetadata.importSuccessCount) &&
            Objects.equals(this.importReportDownloadUrl, contactImportJobMetadata.importReportDownloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, dryRunFailedCount, dryRunSuccessCount, dryRunReportDownloadUrl, importFailedCount, importSuccessCount, importReportDownloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactImportJobMetadata {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    dryRunFailedCount: ").append(toIndentedString(dryRunFailedCount)).append("\n");
    sb.append("    dryRunSuccessCount: ").append(toIndentedString(dryRunSuccessCount)).append("\n");
    sb.append("    dryRunReportDownloadUrl: ").append(toIndentedString(dryRunReportDownloadUrl)).append("\n");
    sb.append("    importFailedCount: ").append(toIndentedString(importFailedCount)).append("\n");
    sb.append("    importSuccessCount: ").append(toIndentedString(importSuccessCount)).append("\n");
    sb.append("    importReportDownloadUrl: ").append(toIndentedString(importReportDownloadUrl)).append("\n");
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

