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
import com.mypurecloud.sdk.v2.model.Row;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkUpdateDecisionTableRowsRequest
 */

public class BulkUpdateDecisionTableRowsRequest  implements Serializable {
  
  private List<Row> rows = null;

  public BulkUpdateDecisionTableRowsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rows = new ArrayList<Row>();
    }
  }

  public BulkUpdateDecisionTableRowsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      rows = new ArrayList<Row>();
    }
  }

  
  /**
   * The list of rows to update. Maximum 15 rows per request. Each row must have a unique rowId.
   **/
  public BulkUpdateDecisionTableRowsRequest rows(List<Row> rows) {
    this.rows = rows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of rows to update. Maximum 15 rows per request. Each row must have a unique rowId.")
  @JsonProperty("rows")
  public List<Row> getRows() {
    return rows;
  }
  public void setRows(List<Row> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpdateDecisionTableRowsRequest bulkUpdateDecisionTableRowsRequest = (BulkUpdateDecisionTableRowsRequest) o;

    return Objects.equals(this.rows, bulkUpdateDecisionTableRowsRequest.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateDecisionTableRowsRequest {\n");
    
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

