package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DataColumn
 */

public class DataColumn  implements Serializable {
  
  private String columnName = null;

  /**
   * The type of column being requested
   */
  public enum DataColumnTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERVAL_START("INTERVAL_START"),
    INTERVAL_END("INTERVAL_END"),
    INTERVAL_COMPLETE("INTERVAL_COMPLETE"),
    MEDIA_TYPE("MEDIA_TYPE"),
    QUEUE_ID("QUEUE_ID"),
    QUEUE_NAME("QUEUE_NAME"),
    OFFER("OFFER"),
    ANSWER("ANSWER"),
    ANSWER_PERCENT("ANSWER_PERCENT"),
    ABANDON("ABANDON"),
    ABANDON_PERCENT("ABANDON_PERCENT"),
    TIME_TO_ABANDON("TIME_TO_ABANDON"),
    ASA("ASA"),
    SERVICE_LEVEL_PERCENT("SERVICE_LEVEL_PERCENT"),
    SLA_LEVEL_PERCENT_TARGET("SLA_LEVEL_PERCENT_TARGET"),
    AVERAGE_HANDLE("AVERAGE_HANDLE"),
    TOTAL_HANDLE("TOTAL_HANDLE"),
    AVERAGE_TALK("AVERAGE_TALK"),
    TOTAL_TALK("TOTAL_TALK"),
    AVERAGE_HOLD("AVERAGE_HOLD"),
    TOTAL_HOLD("TOTAL_HOLD"),
    AVERAGE_ACW("AVERAGE_ACW"),
    TOTAL_ACW("TOTAL_ACW"),
    HOLD("HOLD"),
    TRANSFER("TRANSFER"),
    TRANSFER_PERCENT("TRANSFER_PERCENT"),
    FLOW_OUT("FLOW_OUT"),
    HANDLE("HANDLE"),
    AVERAGE_WAIT("AVERAGE_WAIT");

    private String value;

    DataColumnTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DataColumnTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DataColumnTypeEnum value : DataColumnTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DataColumnTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DataColumnTypeEnum dataColumnType = null;

  
  /**
   * The localized value of the column name as provided by the client
   **/
  public DataColumn columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The localized value of the column name as provided by the client")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  
  /**
   * The type of column being requested
   **/
  public DataColumn dataColumnType(DataColumnTypeEnum dataColumnType) {
    this.dataColumnType = dataColumnType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of column being requested")
  @JsonProperty("dataColumnType")
  public DataColumnTypeEnum getDataColumnType() {
    return dataColumnType;
  }
  public void setDataColumnType(DataColumnTypeEnum dataColumnType) {
    this.dataColumnType = dataColumnType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataColumn dataColumn = (DataColumn) o;
    return Objects.equals(this.columnName, dataColumn.columnName) &&
        Objects.equals(this.dataColumnType, dataColumn.dataColumnType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, dataColumnType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataColumn {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    dataColumnType: ").append(toIndentedString(dataColumnType)).append("\n");
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

