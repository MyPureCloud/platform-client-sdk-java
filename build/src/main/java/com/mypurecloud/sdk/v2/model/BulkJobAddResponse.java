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
import com.mypurecloud.sdk.v2.model.BulkJobAddResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkJobAddResponse
 */

public class BulkJobAddResponse  implements Serializable {
  
  private List<BulkJobAddResult> results = null;
  private Integer errorCount = null;
  private List<Integer> errorIndexes = null;

  public BulkJobAddResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<BulkJobAddResult>();
      errorIndexes = new ArrayList<Integer>();
    }
  }

  
  /**
   * A list of the results from the bulk operation.
   **/
  public BulkJobAddResponse results(List<BulkJobAddResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of the results from the bulk operation.")
  @JsonProperty("results")
  public List<BulkJobAddResult> getResults() {
    return results;
  }
  public void setResults(List<BulkJobAddResult> results) {
    this.results = results;
  }


  /**
   * The number of errors from the bulk operation.
   **/
  public BulkJobAddResponse errorCount(Integer errorCount) {
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
  public BulkJobAddResponse errorIndexes(List<Integer> errorIndexes) {
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
    BulkJobAddResponse bulkJobAddResponse = (BulkJobAddResponse) o;

    return Objects.equals(this.results, bulkJobAddResponse.results) &&
            Objects.equals(this.errorCount, bulkJobAddResponse.errorCount) &&
            Objects.equals(this.errorIndexes, bulkJobAddResponse.errorIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errorCount, errorIndexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkJobAddResponse {\n");
    
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

