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
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkAddDecisionTableRowsResponse
 */

public class BulkAddDecisionTableRowsResponse  implements Serializable {
  
  private Integer totalCreated = null;
  private List<DecisionTableRow> rows = null;

  public BulkAddDecisionTableRowsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rows = new ArrayList<DecisionTableRow>();
    }
  }

  public BulkAddDecisionTableRowsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      rows = new ArrayList<DecisionTableRow>();
    }
  }

  
  /**
   * The total number of rows successfully created
   **/
  public BulkAddDecisionTableRowsResponse totalCreated(Integer totalCreated) {
    this.totalCreated = totalCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of rows successfully created")
  @JsonProperty("totalCreated")
  public Integer getTotalCreated() {
    return totalCreated;
  }
  public void setTotalCreated(Integer totalCreated) {
    this.totalCreated = totalCreated;
  }


  /**
   * The list of created decision table rows
   **/
  public BulkAddDecisionTableRowsResponse rows(List<DecisionTableRow> rows) {
    this.rows = rows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of created decision table rows")
  @JsonProperty("rows")
  public List<DecisionTableRow> getRows() {
    return rows;
  }
  public void setRows(List<DecisionTableRow> rows) {
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
    BulkAddDecisionTableRowsResponse bulkAddDecisionTableRowsResponse = (BulkAddDecisionTableRowsResponse) o;

    return Objects.equals(this.totalCreated, bulkAddDecisionTableRowsResponse.totalCreated) &&
            Objects.equals(this.rows, bulkAddDecisionTableRowsResponse.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCreated, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkAddDecisionTableRowsResponse {\n");
    
    sb.append("    totalCreated: ").append(toIndentedString(totalCreated)).append("\n");
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

