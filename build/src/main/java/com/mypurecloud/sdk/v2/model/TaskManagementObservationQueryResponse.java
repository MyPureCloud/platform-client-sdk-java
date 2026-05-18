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
import com.mypurecloud.sdk.v2.model.Cursors;
import com.mypurecloud.sdk.v2.model.TaskManagementObservationDetailContainer;
import com.mypurecloud.sdk.v2.model.TaskManagementObservationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TaskManagementObservationQueryResponse
 */

public class TaskManagementObservationQueryResponse  implements Serializable {
  
  private List<TaskManagementObservationResult> results = null;
  private TaskManagementObservationDetailContainer details = null;
  private Cursors cursors = null;
  private String nextUri = null;

  public TaskManagementObservationQueryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<TaskManagementObservationResult>();
    }
  }

  public TaskManagementObservationQueryResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      results = new ArrayList<TaskManagementObservationResult>();
    }
  }

  
  /**
   * Query results grouped by the specified dimensions supplied in the groupBy parameter. Each result contains metrics for a specific group combination.
   **/
  public TaskManagementObservationQueryResponse results(List<TaskManagementObservationResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query results grouped by the specified dimensions supplied in the groupBy parameter. Each result contains metrics for a specific group combination.")
  @JsonProperty("results")
  public List<TaskManagementObservationResult> getResults() {
    return results;
  }
  public void setResults(List<TaskManagementObservationResult> results) {
    this.results = results;
  }


  /**
   * Details about entities contained in results. Provides expanded information when requested through the expands parameter.
   **/
  public TaskManagementObservationQueryResponse details(TaskManagementObservationDetailContainer details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about entities contained in results. Provides expanded information when requested through the expands parameter.")
  @JsonProperty("details")
  public TaskManagementObservationDetailContainer getDetails() {
    return details;
  }
  public void setDetails(TaskManagementObservationDetailContainer details) {
    this.details = details;
  }


  /**
   * Cursor tokens to be used for navigating paginated results
   **/
  public TaskManagementObservationQueryResponse cursors(Cursors cursors) {
    this.cursors = cursors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cursor tokens to be used for navigating paginated results")
  @JsonProperty("cursors")
  public Cursors getCursors() {
    return cursors;
  }
  public void setCursors(Cursors cursors) {
    this.cursors = cursors;
  }


  /**
   * A URI to the next page in the listing.
   **/
  public TaskManagementObservationQueryResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URI to the next page in the listing.")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskManagementObservationQueryResponse taskManagementObservationQueryResponse = (TaskManagementObservationQueryResponse) o;

    return Objects.equals(this.results, taskManagementObservationQueryResponse.results) &&
            Objects.equals(this.details, taskManagementObservationQueryResponse.details) &&
            Objects.equals(this.cursors, taskManagementObservationQueryResponse.cursors) &&
            Objects.equals(this.nextUri, taskManagementObservationQueryResponse.nextUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, details, cursors, nextUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementObservationQueryResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    cursors: ").append(toIndentedString(cursors)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
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

