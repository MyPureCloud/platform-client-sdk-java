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
import com.mypurecloud.sdk.v2.model.BulkResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkSourceIntentsResponse
 */

public class BulkSourceIntentsResponse  implements Serializable {
  
  private List<BulkResults> results = null;
  private Integer errorCount = null;
  private List<String> errorResultIds = null;

  public BulkSourceIntentsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<BulkResults>();
      errorResultIds = new ArrayList<String>();
    }
  }

  
  /**
   * Results of operation
   **/
  public BulkSourceIntentsResponse results(List<BulkResults> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Results of operation")
  @JsonProperty("results")
  public List<BulkResults> getResults() {
    return results;
  }
  public void setResults(List<BulkResults> results) {
    this.results = results;
  }


  /**
   * Count of errors
   **/
  public BulkSourceIntentsResponse errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of errors")
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  /**
   * List of ids failed to be added or removed
   **/
  public BulkSourceIntentsResponse errorResultIds(List<String> errorResultIds) {
    this.errorResultIds = errorResultIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of ids failed to be added or removed")
  @JsonProperty("errorResultIds")
  public List<String> getErrorResultIds() {
    return errorResultIds;
  }
  public void setErrorResultIds(List<String> errorResultIds) {
    this.errorResultIds = errorResultIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSourceIntentsResponse bulkSourceIntentsResponse = (BulkSourceIntentsResponse) o;

    return Objects.equals(this.results, bulkSourceIntentsResponse.results) &&
            Objects.equals(this.errorCount, bulkSourceIntentsResponse.errorCount) &&
            Objects.equals(this.errorResultIds, bulkSourceIntentsResponse.errorResultIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errorCount, errorResultIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSourceIntentsResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    errorResultIds: ").append(toIndentedString(errorResultIds)).append("\n");
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

