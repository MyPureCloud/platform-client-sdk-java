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
 * Column
 */

public class Column  implements Serializable {
  
  private String columnName = null;
  private Integer columnNumber = null;
  private Integer startPosition = null;
  private Integer length = null;

  public Column() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Column name. Mandatory for Fixed position/length file format.
   **/
  public Column columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Column name. Mandatory for Fixed position/length file format.")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   * 0 based column number in delimited file format
   **/
  public Column columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "0 based column number in delimited file format")
  @JsonProperty("columnNumber")
  public Integer getColumnNumber() {
    return columnNumber;
  }
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }


  /**
   * Zero-based position of the first column's character. Mandatory for Fixed position/length file format.
   **/
  public Column startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Zero-based position of the first column's character. Mandatory for Fixed position/length file format.")
  @JsonProperty("startPosition")
  public Integer getStartPosition() {
    return startPosition;
  }
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * Column width. Mandatory for Fixed position/length file format.
   **/
  public Column length(Integer length) {
    this.length = length;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Column width. Mandatory for Fixed position/length file format.")
  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }
  public void setLength(Integer length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Column column = (Column) o;

    return Objects.equals(this.columnName, column.columnName) &&
            Objects.equals(this.columnNumber, column.columnNumber) &&
            Objects.equals(this.startPosition, column.startPosition) &&
            Objects.equals(this.length, column.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnNumber, startPosition, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Column {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnNumber: ").append(toIndentedString(columnNumber)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

