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
import com.mypurecloud.sdk.v2.model.RowSearchFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SearchDecisionTableRowsRequest
 */

public class SearchDecisionTableRowsRequest  implements Serializable {
  
  private RowSearchFilter filter = null;

  public SearchDecisionTableRowsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The filter criteria for searching decision table rows
   **/
  public SearchDecisionTableRowsRequest filter(RowSearchFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The filter criteria for searching decision table rows")
  @JsonProperty("filter")
  public RowSearchFilter getFilter() {
    return filter;
  }
  public void setFilter(RowSearchFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchDecisionTableRowsRequest searchDecisionTableRowsRequest = (SearchDecisionTableRowsRequest) o;

    return Objects.equals(this.filter, searchDecisionTableRowsRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchDecisionTableRowsRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

