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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SelectedColumns
 */

public class SelectedColumns  implements Serializable {
  
  private Integer columnOrder = null;
  private String columnName = null;

  
  /**
   * Indicates the order/position of the selected column
   **/
  public SelectedColumns columnOrder(Integer columnOrder) {
    this.columnOrder = columnOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the order/position of the selected column")
  @JsonProperty("columnOrder")
  public Integer getColumnOrder() {
    return columnOrder;
  }
  public void setColumnOrder(Integer columnOrder) {
    this.columnOrder = columnOrder;
  }

  
  /**
   * Indicates enum name of the column from the export view
   **/
  public SelectedColumns columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates enum name of the column from the export view")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectedColumns selectedColumns = (SelectedColumns) o;
    return Objects.equals(this.columnOrder, selectedColumns.columnOrder) &&
        Objects.equals(this.columnName, selectedColumns.columnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnOrder, columnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedColumns {\n");
    
    sb.append("    columnOrder: ").append(toIndentedString(columnOrder)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
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

