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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BulkJobTerminateResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkJobTerminateResultsResponse
 */

public class BulkJobTerminateResultsResponse  implements Serializable {
  
  private List<BulkJobTerminateResult> results = new ArrayList<BulkJobTerminateResult>();
  private Integer errorCount = null;
  private List<Integer> errorIndexes = new ArrayList<Integer>();

  
  /**
   * A list of the results from the bulk operation.
   **/
  public BulkJobTerminateResultsResponse results(List<BulkJobTerminateResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of the results from the bulk operation.")
  @JsonProperty("results")
  public List<BulkJobTerminateResult> getResults() {
    return results;
  }
  public void setResults(List<BulkJobTerminateResult> results) {
    this.results = results;
  }


  /**
   * The number of errors from the bulk operation.
   **/
  public BulkJobTerminateResultsResponse errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of errors from the bulk operation.")
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  /**
   * An index of where the errors are in the listing.
   **/
  public BulkJobTerminateResultsResponse errorIndexes(List<Integer> errorIndexes) {
    this.errorIndexes = errorIndexes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An index of where the errors are in the listing.")
  @JsonProperty("errorIndexes")
  public List<Integer> getErrorIndexes() {
    return errorIndexes;
  }
  public void setErrorIndexes(List<Integer> errorIndexes) {
    this.errorIndexes = errorIndexes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkJobTerminateResultsResponse bulkJobTerminateResultsResponse = (BulkJobTerminateResultsResponse) o;

    return Objects.equals(this.results, bulkJobTerminateResultsResponse.results) &&
            Objects.equals(this.errorCount, bulkJobTerminateResultsResponse.errorCount) &&
            Objects.equals(this.errorIndexes, bulkJobTerminateResultsResponse.errorIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errorCount, errorIndexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkJobTerminateResultsResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    errorIndexes: ").append(toIndentedString(errorIndexes)).append("\n");
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

