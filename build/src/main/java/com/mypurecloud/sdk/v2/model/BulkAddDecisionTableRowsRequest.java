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
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkAddDecisionTableRowsRequest
 */

public class BulkAddDecisionTableRowsRequest  implements Serializable {
  
  private List<CreateDecisionTableRowRequest> rows = null;

  public BulkAddDecisionTableRowsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rows = new ArrayList<CreateDecisionTableRowRequest>();
    }
  }

  public BulkAddDecisionTableRowsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      rows = new ArrayList<CreateDecisionTableRowRequest>();
    }
  }

  
  /**
   * The list of rows to create. Maximum 15 rows per request. RowIndex is not supported for bulk add - all rows will be appended to the end of the table in the order provided.
   **/
  public BulkAddDecisionTableRowsRequest rows(List<CreateDecisionTableRowRequest> rows) {
    this.rows = rows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of rows to create. Maximum 15 rows per request. RowIndex is not supported for bulk add - all rows will be appended to the end of the table in the order provided.")
  @JsonProperty("rows")
  public List<CreateDecisionTableRowRequest> getRows() {
    return rows;
  }
  public void setRows(List<CreateDecisionTableRowRequest> rows) {
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
    BulkAddDecisionTableRowsRequest bulkAddDecisionTableRowsRequest = (BulkAddDecisionTableRowsRequest) o;

    return Objects.equals(this.rows, bulkAddDecisionTableRowsRequest.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkAddDecisionTableRowsRequest {\n");
    
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

