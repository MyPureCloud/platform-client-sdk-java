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
import com.mypurecloud.sdk.v2.model.BulkResponseResultPrefixPrefixBulkEntityErrorPrefix;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkPrefixesResponse
 */

public class BulkPrefixesResponse  implements Serializable {
  
  private List<BulkResponseResultPrefixPrefixBulkEntityErrorPrefix> results = null;
  private Integer errorCount = null;
  private List<Integer> errorIndexes = null;

  public BulkPrefixesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<BulkResponseResultPrefixPrefixBulkEntityErrorPrefix>();
      errorIndexes = new ArrayList<Integer>();
    }
  }

  public BulkPrefixesResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      results = new ArrayList<BulkResponseResultPrefixPrefixBulkEntityErrorPrefix>();
      errorIndexes = new ArrayList<Integer>();
    }
  }

  
  /**
   * A list of results for all of the Bulk operations specified in the request. Includes both successes and failures. Ordering is NOT guaranteed - may be in a different order from the request.
   **/
  public BulkPrefixesResponse results(List<BulkResponseResultPrefixPrefixBulkEntityErrorPrefix> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of results for all of the Bulk operations specified in the request. Includes both successes and failures. Ordering is NOT guaranteed - may be in a different order from the request.")
  @JsonProperty("results")
  public List<BulkResponseResultPrefixPrefixBulkEntityErrorPrefix> getResults() {
    return results;
  }
  public void setResults(List<BulkResponseResultPrefixPrefixBulkEntityErrorPrefix> results) {
    this.results = results;
  }


  /**
   * The number of failed operations in the results.
   **/
  public BulkPrefixesResponse errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of failed operations in the results.")
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  /**
   * The indexes of all failed operations in the results field.
   **/
  public BulkPrefixesResponse errorIndexes(List<Integer> errorIndexes) {
    this.errorIndexes = errorIndexes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The indexes of all failed operations in the results field.")
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
    BulkPrefixesResponse bulkPrefixesResponse = (BulkPrefixesResponse) o;

    return Objects.equals(this.results, bulkPrefixesResponse.results) &&
            Objects.equals(this.errorCount, bulkPrefixesResponse.errorCount) &&
            Objects.equals(this.errorIndexes, bulkPrefixesResponse.errorIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errorCount, errorIndexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPrefixesResponse {\n");
    
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

