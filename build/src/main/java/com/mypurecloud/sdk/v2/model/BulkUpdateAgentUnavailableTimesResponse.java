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
import com.mypurecloud.sdk.v2.model.BulkUpdateAgentUnavailableTimesResultItem;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkUpdateAgentUnavailableTimesResponse
 */

public class BulkUpdateAgentUnavailableTimesResponse  implements Serializable {
  
  private List<BulkUpdateAgentUnavailableTimesResultItem> results = null;
  private ErrorBody error = null;

  public BulkUpdateAgentUnavailableTimesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<BulkUpdateAgentUnavailableTimesResultItem>();
    }
  }

  public BulkUpdateAgentUnavailableTimesResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      results = new ArrayList<BulkUpdateAgentUnavailableTimesResultItem>();
    }
  }

  
  /**
   * The result of each unavailable time operation, in the order the operations were requested
   **/
  public BulkUpdateAgentUnavailableTimesResponse results(List<BulkUpdateAgentUnavailableTimesResultItem> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The result of each unavailable time operation, in the order the operations were requested")
  @JsonProperty("results")
  public List<BulkUpdateAgentUnavailableTimesResultItem> getResults() {
    return results;
  }
  public void setResults(List<BulkUpdateAgentUnavailableTimesResultItem> results) {
    this.results = results;
  }


  /**
   * The error that stopped processing, populated when one or more operations failed
   **/
  public BulkUpdateAgentUnavailableTimesResponse error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error that stopped processing, populated when one or more operations failed")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpdateAgentUnavailableTimesResponse bulkUpdateAgentUnavailableTimesResponse = (BulkUpdateAgentUnavailableTimesResponse) o;

    return Objects.equals(this.results, bulkUpdateAgentUnavailableTimesResponse.results) &&
            Objects.equals(this.error, bulkUpdateAgentUnavailableTimesResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateAgentUnavailableTimesResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

