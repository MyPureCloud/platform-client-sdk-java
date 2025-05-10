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
import com.mypurecloud.sdk.v2.model.UpdateRowIndexRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateDecisionTableVersionRequest
 */

public class UpdateDecisionTableVersionRequest  implements Serializable {
  
  private UpdateRowIndexRequest rowIndexUpdate = null;

  public UpdateDecisionTableVersionRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * An update to a decision table version row index, which moves the row to a new position in the table. Execution output is returned based on the first matching row.
   **/
  public UpdateDecisionTableVersionRequest rowIndexUpdate(UpdateRowIndexRequest rowIndexUpdate) {
    this.rowIndexUpdate = rowIndexUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An update to a decision table version row index, which moves the row to a new position in the table. Execution output is returned based on the first matching row.")
  @JsonProperty("rowIndexUpdate")
  public UpdateRowIndexRequest getRowIndexUpdate() {
    return rowIndexUpdate;
  }
  public void setRowIndexUpdate(UpdateRowIndexRequest rowIndexUpdate) {
    this.rowIndexUpdate = rowIndexUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDecisionTableVersionRequest updateDecisionTableVersionRequest = (UpdateDecisionTableVersionRequest) o;

    return Objects.equals(this.rowIndexUpdate, updateDecisionTableVersionRequest.rowIndexUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowIndexUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDecisionTableVersionRequest {\n");
    
    sb.append("    rowIndexUpdate: ").append(toIndentedString(rowIndexUpdate)).append("\n");
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

