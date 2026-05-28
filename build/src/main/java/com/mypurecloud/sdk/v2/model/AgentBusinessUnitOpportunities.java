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
import com.mypurecloud.sdk.v2.model.AgentQueryOpportunityResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentBusinessUnitOpportunities
 */

public class AgentBusinessUnitOpportunities  implements Serializable {
  
  private String id = null;
  private List<AgentQueryOpportunityResult> opportunities = null;
  private String selfUri = null;

  public AgentBusinessUnitOpportunities() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      opportunities = new ArrayList<AgentQueryOpportunityResult>();
    }
  }

  public AgentBusinessUnitOpportunities(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      opportunities = new ArrayList<AgentQueryOpportunityResult>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The opportunities for the agent in this business unit
   **/
  public AgentBusinessUnitOpportunities opportunities(List<AgentQueryOpportunityResult> opportunities) {
    this.opportunities = opportunities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The opportunities for the agent in this business unit")
  @JsonProperty("opportunities")
  public List<AgentQueryOpportunityResult> getOpportunities() {
    return opportunities;
  }
  public void setOpportunities(List<AgentQueryOpportunityResult> opportunities) {
    this.opportunities = opportunities;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentBusinessUnitOpportunities agentBusinessUnitOpportunities = (AgentBusinessUnitOpportunities) o;

    return Objects.equals(this.id, agentBusinessUnitOpportunities.id) &&
            Objects.equals(this.opportunities, agentBusinessUnitOpportunities.opportunities) &&
            Objects.equals(this.selfUri, agentBusinessUnitOpportunities.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, opportunities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentBusinessUnitOpportunities {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    opportunities: ").append(toIndentedString(opportunities)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

