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
import com.mypurecloud.sdk.v2.model.DecisionTableRowEntityRef;
import com.mypurecloud.sdk.v2.model.DecisionTableRowExecutionOutput;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DecisionTableExecutionResponse
 */

public class DecisionTableExecutionResponse  implements Serializable {
  
  private DecisionTableVersionEntity table = null;
  private Integer totalMatchRowCount = null;
  private List<DecisionTableRowEntityRef> topMatchRows = null;
  private List<DecisionTableRowExecutionOutput> rowExecutionOutputs = null;

  public DecisionTableExecutionResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      topMatchRows = new ArrayList<DecisionTableRowEntityRef>();
      rowExecutionOutputs = new ArrayList<DecisionTableRowExecutionOutput>();
    }
  }

  
  /**
   * The decision table version entity that was executed.
   **/
  public DecisionTableExecutionResponse table(DecisionTableVersionEntity table) {
    this.table = table;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decision table version entity that was executed.")
  @JsonProperty("table")
  public DecisionTableVersionEntity getTable() {
    return table;
  }
  public void setTable(DecisionTableVersionEntity table) {
    this.table = table;
  }


  /**
   * Total number of rows that matched execution input and would return results
   **/
  public DecisionTableExecutionResponse totalMatchRowCount(Integer totalMatchRowCount) {
    this.totalMatchRowCount = totalMatchRowCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of rows that matched execution input and would return results")
  @JsonProperty("totalMatchRowCount")
  public Integer getTotalMatchRowCount() {
    return totalMatchRowCount;
  }
  public void setTotalMatchRowCount(Integer totalMatchRowCount) {
    this.totalMatchRowCount = totalMatchRowCount;
  }


  /**
   * Top 5 rows matching execution input, excluding the one produced the result.
   **/
  public DecisionTableExecutionResponse topMatchRows(List<DecisionTableRowEntityRef> topMatchRows) {
    this.topMatchRows = topMatchRows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Top 5 rows matching execution input, excluding the one produced the result.")
  @JsonProperty("topMatchRows")
  public List<DecisionTableRowEntityRef> getTopMatchRows() {
    return topMatchRows;
  }
  public void setTopMatchRows(List<DecisionTableRowEntityRef> topMatchRows) {
    this.topMatchRows = topMatchRows;
  }


  /**
   * The output data for each executed row for which output is collected.
   **/
  public DecisionTableExecutionResponse rowExecutionOutputs(List<DecisionTableRowExecutionOutput> rowExecutionOutputs) {
    this.rowExecutionOutputs = rowExecutionOutputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The output data for each executed row for which output is collected.")
  @JsonProperty("rowExecutionOutputs")
  public List<DecisionTableRowExecutionOutput> getRowExecutionOutputs() {
    return rowExecutionOutputs;
  }
  public void setRowExecutionOutputs(List<DecisionTableRowExecutionOutput> rowExecutionOutputs) {
    this.rowExecutionOutputs = rowExecutionOutputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableExecutionResponse decisionTableExecutionResponse = (DecisionTableExecutionResponse) o;

    return Objects.equals(this.table, decisionTableExecutionResponse.table) &&
            Objects.equals(this.totalMatchRowCount, decisionTableExecutionResponse.totalMatchRowCount) &&
            Objects.equals(this.topMatchRows, decisionTableExecutionResponse.topMatchRows) &&
            Objects.equals(this.rowExecutionOutputs, decisionTableExecutionResponse.rowExecutionOutputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table, totalMatchRowCount, topMatchRows, rowExecutionOutputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableExecutionResponse {\n");
    
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    totalMatchRowCount: ").append(toIndentedString(totalMatchRowCount)).append("\n");
    sb.append("    topMatchRows: ").append(toIndentedString(topMatchRows)).append("\n");
    sb.append("    rowExecutionOutputs: ").append(toIndentedString(rowExecutionOutputs)).append("\n");
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

