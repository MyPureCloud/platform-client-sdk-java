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
import com.mypurecloud.sdk.v2.model.BulkOpportunitiesEnrollmentResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentBulkStatusUpdateOpportunityEnrollmentsResponse
 */

public class AgentBulkStatusUpdateOpportunityEnrollmentsResponse  implements Serializable {
  
  private List<BulkOpportunitiesEnrollmentResult> results = null;
  private Integer errorCount = null;

  public AgentBulkStatusUpdateOpportunityEnrollmentsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<BulkOpportunitiesEnrollmentResult>();
    }
  }

  public AgentBulkStatusUpdateOpportunityEnrollmentsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      results = new ArrayList<BulkOpportunitiesEnrollmentResult>();
    }
  }

  
  /**
   * The result for each requested item
   **/
  public AgentBulkStatusUpdateOpportunityEnrollmentsResponse results(List<BulkOpportunitiesEnrollmentResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The result for each requested item")
  @JsonProperty("results")
  public List<BulkOpportunitiesEnrollmentResult> getResults() {
    return results;
  }
  public void setResults(List<BulkOpportunitiesEnrollmentResult> results) {
    this.results = results;
  }


  /**
   * The count of failed operations in the bulk request
   **/
  public AgentBulkStatusUpdateOpportunityEnrollmentsResponse errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of failed operations in the bulk request")
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentBulkStatusUpdateOpportunityEnrollmentsResponse agentBulkStatusUpdateOpportunityEnrollmentsResponse = (AgentBulkStatusUpdateOpportunityEnrollmentsResponse) o;

    return Objects.equals(this.results, agentBulkStatusUpdateOpportunityEnrollmentsResponse.results) &&
            Objects.equals(this.errorCount, agentBulkStatusUpdateOpportunityEnrollmentsResponse.errorCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errorCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentBulkStatusUpdateOpportunityEnrollmentsResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
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

