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
import java.util.List;

import java.io.Serializable;
/**
 * BulkDeleteDecisionTableRowsRequest
 */

public class BulkDeleteDecisionTableRowsRequest  implements Serializable {
  
  private List<String> rowIds = null;

  public BulkDeleteDecisionTableRowsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rowIds = new ArrayList<String>();
    }
  }

  public BulkDeleteDecisionTableRowsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      rowIds = new ArrayList<String>();
    }
  }

  
  /**
   * The set of unique row IDs to be deleted. Maximum 49 rows per request.
   **/
  public BulkDeleteDecisionTableRowsRequest rowIds(List<String> rowIds) {
    this.rowIds = rowIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of unique row IDs to be deleted. Maximum 49 rows per request.")
  @JsonProperty("rowIds")
  public List<String> getRowIds() {
    return rowIds;
  }
  public void setRowIds(List<String> rowIds) {
    this.rowIds = rowIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDeleteDecisionTableRowsRequest bulkDeleteDecisionTableRowsRequest = (BulkDeleteDecisionTableRowsRequest) o;

    return Objects.equals(this.rowIds, bulkDeleteDecisionTableRowsRequest.rowIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDeleteDecisionTableRowsRequest {\n");
    
    sb.append("    rowIds: ").append(toIndentedString(rowIds)).append("\n");
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

