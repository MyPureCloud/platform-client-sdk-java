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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentBulkAddOpportunityEnrollment
 */

public class AgentBulkAddOpportunityEnrollment  implements Serializable {
  
  private String id = null;
  private String opportunityId = null;

  public AgentBulkAddOpportunityEnrollment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentBulkAddOpportunityEnrollment(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The ID of the opportunity in which the agent was enrolled
   **/
  public AgentBulkAddOpportunityEnrollment opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the opportunity in which the agent was enrolled")
  @JsonProperty("opportunityId")
  public String getOpportunityId() {
    return opportunityId;
  }
  public void setOpportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentBulkAddOpportunityEnrollment agentBulkAddOpportunityEnrollment = (AgentBulkAddOpportunityEnrollment) o;

    return Objects.equals(this.id, agentBulkAddOpportunityEnrollment.id) &&
            Objects.equals(this.opportunityId, agentBulkAddOpportunityEnrollment.opportunityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, opportunityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentBulkAddOpportunityEnrollment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    opportunityId: ").append(toIndentedString(opportunityId)).append("\n");
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

