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
 * UpdateRowIndexRequest
 */

public class UpdateRowIndexRequest  implements Serializable {
  
  private String rowId = null;
  private Integer rowIndex = null;

  public UpdateRowIndexRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The row UUID.
   **/
  public UpdateRowIndexRequest rowId(String rowId) {
    this.rowId = rowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The row UUID.")
  @JsonProperty("rowId")
  public String getRowId() {
    return rowId;
  }
  public void setRowId(String rowId) {
    this.rowId = rowId;
  }


  /**
   * The updated row index. Must be an integer value greater than or equal to 0. Must be less than or equal to x-1, where x is the number of rows in the decision table version.
   **/
  public UpdateRowIndexRequest rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The updated row index. Must be an integer value greater than or equal to 0. Must be less than or equal to x-1, where x is the number of rows in the decision table version.")
  @JsonProperty("rowIndex")
  public Integer getRowIndex() {
    return rowIndex;
  }
  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRowIndexRequest updateRowIndexRequest = (UpdateRowIndexRequest) o;

    return Objects.equals(this.rowId, updateRowIndexRequest.rowId) &&
            Objects.equals(this.rowIndex, updateRowIndexRequest.rowIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowId, rowIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRowIndexRequest {\n");
    
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
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

