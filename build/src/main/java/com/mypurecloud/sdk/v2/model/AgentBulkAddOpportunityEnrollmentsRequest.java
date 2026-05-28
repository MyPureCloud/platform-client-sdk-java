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
import com.mypurecloud.sdk.v2.model.AgentAddOpportunityEnrollment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentBulkAddOpportunityEnrollmentsRequest
 */

public class AgentBulkAddOpportunityEnrollmentsRequest  implements Serializable {
  
  private List<AgentAddOpportunityEnrollment> enrollments = null;

  public AgentBulkAddOpportunityEnrollmentsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      enrollments = new ArrayList<AgentAddOpportunityEnrollment>();
    }
  }

  public AgentBulkAddOpportunityEnrollmentsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      enrollments = new ArrayList<AgentAddOpportunityEnrollment>();
    }
  }

  
  /**
   * The list of the enrollments to add
   **/
  public AgentBulkAddOpportunityEnrollmentsRequest enrollments(List<AgentAddOpportunityEnrollment> enrollments) {
    this.enrollments = enrollments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of the enrollments to add")
  @JsonProperty("enrollments")
  public List<AgentAddOpportunityEnrollment> getEnrollments() {
    return enrollments;
  }
  public void setEnrollments(List<AgentAddOpportunityEnrollment> enrollments) {
    this.enrollments = enrollments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentBulkAddOpportunityEnrollmentsRequest agentBulkAddOpportunityEnrollmentsRequest = (AgentBulkAddOpportunityEnrollmentsRequest) o;

    return Objects.equals(this.enrollments, agentBulkAddOpportunityEnrollmentsRequest.enrollments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentBulkAddOpportunityEnrollmentsRequest {\n");
    
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
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

