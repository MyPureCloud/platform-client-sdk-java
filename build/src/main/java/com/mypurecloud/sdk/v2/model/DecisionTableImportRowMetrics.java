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
 * Progress metrics for a decision table import job
 */
@ApiModel(description = "Progress metrics for a decision table import job")

public class DecisionTableImportRowMetrics  implements Serializable {
  
  private Integer totalRows = null;
  private Integer rowsParsed = null;
  private Integer rowParseFailed = null;
  private Integer rowsCreated = null;
  private Integer rowsUpdated = null;
  private Integer rowsDeleted = null;
  private Integer rowCreateFailed = null;
  private Integer rowUpdateFailed = null;
  private Integer rowDeleteFailed = null;

  public DecisionTableImportRowMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DecisionTableImportRowMetrics(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Total number of rows in the import file (set after parsing completes)
   **/
  public DecisionTableImportRowMetrics totalRows(Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of rows in the import file (set after parsing completes)")
  @JsonProperty("totalRows")
  public Integer getTotalRows() {
    return totalRows;
  }
  public void setTotalRows(Integer totalRows) {
    this.totalRows = totalRows;
  }


  /**
   * Number of rows successfully parsed so far
   **/
  public DecisionTableImportRowMetrics rowsParsed(Integer rowsParsed) {
    this.rowsParsed = rowsParsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows successfully parsed so far")
  @JsonProperty("rowsParsed")
  public Integer getRowsParsed() {
    return rowsParsed;
  }
  public void setRowsParsed(Integer rowsParsed) {
    this.rowsParsed = rowsParsed;
  }


  /**
   * Number of rows that failed to parse
   **/
  public DecisionTableImportRowMetrics rowParseFailed(Integer rowParseFailed) {
    this.rowParseFailed = rowParseFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows that failed to parse")
  @JsonProperty("rowParseFailed")
  public Integer getRowParseFailed() {
    return rowParseFailed;
  }
  public void setRowParseFailed(Integer rowParseFailed) {
    this.rowParseFailed = rowParseFailed;
  }


  /**
   * Number of rows successfully created so far
   **/
  public DecisionTableImportRowMetrics rowsCreated(Integer rowsCreated) {
    this.rowsCreated = rowsCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows successfully created so far")
  @JsonProperty("rowsCreated")
  public Integer getRowsCreated() {
    return rowsCreated;
  }
  public void setRowsCreated(Integer rowsCreated) {
    this.rowsCreated = rowsCreated;
  }


  /**
   * Number of rows successfully updated so far
   **/
  public DecisionTableImportRowMetrics rowsUpdated(Integer rowsUpdated) {
    this.rowsUpdated = rowsUpdated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows successfully updated so far")
  @JsonProperty("rowsUpdated")
  public Integer getRowsUpdated() {
    return rowsUpdated;
  }
  public void setRowsUpdated(Integer rowsUpdated) {
    this.rowsUpdated = rowsUpdated;
  }


  /**
   * Number of rows deleted (Replace mode only)
   **/
  public DecisionTableImportRowMetrics rowsDeleted(Integer rowsDeleted) {
    this.rowsDeleted = rowsDeleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows deleted (Replace mode only)")
  @JsonProperty("rowsDeleted")
  public Integer getRowsDeleted() {
    return rowsDeleted;
  }
  public void setRowsDeleted(Integer rowsDeleted) {
    this.rowsDeleted = rowsDeleted;
  }


  /**
   * Number of rows that failed during batch create
   **/
  public DecisionTableImportRowMetrics rowCreateFailed(Integer rowCreateFailed) {
    this.rowCreateFailed = rowCreateFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows that failed during batch create")
  @JsonProperty("rowCreateFailed")
  public Integer getRowCreateFailed() {
    return rowCreateFailed;
  }
  public void setRowCreateFailed(Integer rowCreateFailed) {
    this.rowCreateFailed = rowCreateFailed;
  }


  /**
   * Number of rows that failed during batch update
   **/
  public DecisionTableImportRowMetrics rowUpdateFailed(Integer rowUpdateFailed) {
    this.rowUpdateFailed = rowUpdateFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows that failed during batch update")
  @JsonProperty("rowUpdateFailed")
  public Integer getRowUpdateFailed() {
    return rowUpdateFailed;
  }
  public void setRowUpdateFailed(Integer rowUpdateFailed) {
    this.rowUpdateFailed = rowUpdateFailed;
  }


  /**
   * Number of rows that failed during delete
   **/
  public DecisionTableImportRowMetrics rowDeleteFailed(Integer rowDeleteFailed) {
    this.rowDeleteFailed = rowDeleteFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of rows that failed during delete")
  @JsonProperty("rowDeleteFailed")
  public Integer getRowDeleteFailed() {
    return rowDeleteFailed;
  }
  public void setRowDeleteFailed(Integer rowDeleteFailed) {
    this.rowDeleteFailed = rowDeleteFailed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableImportRowMetrics decisionTableImportRowMetrics = (DecisionTableImportRowMetrics) o;

    return Objects.equals(this.totalRows, decisionTableImportRowMetrics.totalRows) &&
            Objects.equals(this.rowsParsed, decisionTableImportRowMetrics.rowsParsed) &&
            Objects.equals(this.rowParseFailed, decisionTableImportRowMetrics.rowParseFailed) &&
            Objects.equals(this.rowsCreated, decisionTableImportRowMetrics.rowsCreated) &&
            Objects.equals(this.rowsUpdated, decisionTableImportRowMetrics.rowsUpdated) &&
            Objects.equals(this.rowsDeleted, decisionTableImportRowMetrics.rowsDeleted) &&
            Objects.equals(this.rowCreateFailed, decisionTableImportRowMetrics.rowCreateFailed) &&
            Objects.equals(this.rowUpdateFailed, decisionTableImportRowMetrics.rowUpdateFailed) &&
            Objects.equals(this.rowDeleteFailed, decisionTableImportRowMetrics.rowDeleteFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRows, rowsParsed, rowParseFailed, rowsCreated, rowsUpdated, rowsDeleted, rowCreateFailed, rowUpdateFailed, rowDeleteFailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableImportRowMetrics {\n");
    
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    rowsParsed: ").append(toIndentedString(rowsParsed)).append("\n");
    sb.append("    rowParseFailed: ").append(toIndentedString(rowParseFailed)).append("\n");
    sb.append("    rowsCreated: ").append(toIndentedString(rowsCreated)).append("\n");
    sb.append("    rowsUpdated: ").append(toIndentedString(rowsUpdated)).append("\n");
    sb.append("    rowsDeleted: ").append(toIndentedString(rowsDeleted)).append("\n");
    sb.append("    rowCreateFailed: ").append(toIndentedString(rowCreateFailed)).append("\n");
    sb.append("    rowUpdateFailed: ").append(toIndentedString(rowUpdateFailed)).append("\n");
    sb.append("    rowDeleteFailed: ").append(toIndentedString(rowDeleteFailed)).append("\n");
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

