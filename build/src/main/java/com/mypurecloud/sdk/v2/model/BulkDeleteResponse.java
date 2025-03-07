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
import com.mypurecloud.sdk.v2.model.BulkResponseResultVoidEntityBulkEntityErrorEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkDeleteResponse
 */

public class BulkDeleteResponse  implements Serializable {
  
  private List<BulkResponseResultVoidEntityBulkEntityErrorEntity> results = new ArrayList<BulkResponseResultVoidEntityBulkEntityErrorEntity>();
  private Integer errorCount = null;
  private List<Integer> errorIndexes = new ArrayList<Integer>();

  
  /**
   * A list of results for all of the Bulk operations specified in the request. Includes both successes and failures. Ordering is NOT guaranteed - may be in a different order from the request.
   **/
  public BulkDeleteResponse results(List<BulkResponseResultVoidEntityBulkEntityErrorEntity> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of results for all of the Bulk operations specified in the request. Includes both successes and failures. Ordering is NOT guaranteed - may be in a different order from the request.")
  @JsonProperty("results")
  public List<BulkResponseResultVoidEntityBulkEntityErrorEntity> getResults() {
    return results;
  }
  public void setResults(List<BulkResponseResultVoidEntityBulkEntityErrorEntity> results) {
    this.results = results;
  }


  /**
   * The number of failed operations in the results.
   **/
  public BulkDeleteResponse errorCount(Integer errorCount) {
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
  public BulkDeleteResponse errorIndexes(List<Integer> errorIndexes) {
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
    BulkDeleteResponse bulkDeleteResponse = (BulkDeleteResponse) o;

    return Objects.equals(this.results, bulkDeleteResponse.results) &&
            Objects.equals(this.errorCount, bulkDeleteResponse.errorCount) &&
            Objects.equals(this.errorIndexes, bulkDeleteResponse.errorIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errorCount, errorIndexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDeleteResponse {\n");
    
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

