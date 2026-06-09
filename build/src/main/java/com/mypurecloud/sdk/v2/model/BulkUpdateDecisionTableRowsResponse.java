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
 * BulkUpdateDecisionTableRowsResponse
 */

public class BulkUpdateDecisionTableRowsResponse  implements Serializable {
  
  private Integer totalUpdated = null;
  private List<DecisionTableRow> rows = null;

  public BulkUpdateDecisionTableRowsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rows = new ArrayList<DecisionTableRow>();
    }
  }

  public BulkUpdateDecisionTableRowsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      rows = new ArrayList<DecisionTableRow>();
    }
  }

  
  /**
   * The total number of rows successfully updated
   **/
  public BulkUpdateDecisionTableRowsResponse totalUpdated(Integer totalUpdated) {
    this.totalUpdated = totalUpdated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of rows successfully updated")
  @JsonProperty("totalUpdated")
  public Integer getTotalUpdated() {
    return totalUpdated;
  }
  public void setTotalUpdated(Integer totalUpdated) {
    this.totalUpdated = totalUpdated;
  }


  /**
   * The list of updated decision table rows
   **/
  public BulkUpdateDecisionTableRowsResponse rows(List<DecisionTableRow> rows) {
    this.rows = rows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of updated decision table rows")
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
    BulkUpdateDecisionTableRowsResponse bulkUpdateDecisionTableRowsResponse = (BulkUpdateDecisionTableRowsResponse) o;

    return Objects.equals(this.totalUpdated, bulkUpdateDecisionTableRowsResponse.totalUpdated) &&
            Objects.equals(this.rows, bulkUpdateDecisionTableRowsResponse.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUpdated, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateDecisionTableRowsResponse {\n");
    
    sb.append("    totalUpdated: ").append(toIndentedString(totalUpdated)).append("\n");
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

