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
import com.mypurecloud.sdk.v2.model.AddOpportunityBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkAddOpportunitiesRequest
 */

public class BulkAddOpportunitiesRequest  implements Serializable {
  
  private List<AddOpportunityBody> opportunities = null;
  private List<String> agentIds = null;

  public BulkAddOpportunitiesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      opportunities = new ArrayList<AddOpportunityBody>();
      agentIds = new ArrayList<String>();
    }
  }

  public BulkAddOpportunitiesRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      opportunities = new ArrayList<AddOpportunityBody>();
      agentIds = new ArrayList<String>();
    }
  }

  
  /**
   * The opportunities to add
   **/
  public BulkAddOpportunitiesRequest opportunities(List<AddOpportunityBody> opportunities) {
    this.opportunities = opportunities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The opportunities to add")
  @JsonProperty("opportunities")
  public List<AddOpportunityBody> getOpportunities() {
    return opportunities;
  }
  public void setOpportunities(List<AddOpportunityBody> opportunities) {
    this.opportunities = opportunities;
  }


  /**
   * The IDs of the agents who are invited to the opportunities being added
   **/
  public BulkAddOpportunitiesRequest agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the agents who are invited to the opportunities being added")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkAddOpportunitiesRequest bulkAddOpportunitiesRequest = (BulkAddOpportunitiesRequest) o;

    return Objects.equals(this.opportunities, bulkAddOpportunitiesRequest.opportunities) &&
            Objects.equals(this.agentIds, bulkAddOpportunitiesRequest.agentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opportunities, agentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkAddOpportunitiesRequest {\n");
    
    sb.append("    opportunities: ").append(toIndentedString(opportunities)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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

