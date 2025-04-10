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
import com.mypurecloud.sdk.v2.model.AgentWorkPlanBid;
import com.mypurecloud.sdk.v2.model.BusinessUnitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentWorkPlanBids
 */

public class AgentWorkPlanBids  implements Serializable {
  
  private String id = null;
  private BusinessUnitReference businessUnit = null;
  private List<AgentWorkPlanBid> agentWorkPlanBids = null;
  private String selfUri = null;

  public AgentWorkPlanBids() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentWorkPlanBids = new ArrayList<AgentWorkPlanBid>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The business unit to which the bids belong
   **/
  public AgentWorkPlanBids businessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The business unit to which the bids belong")
  @JsonProperty("businessUnit")
  public BusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   * Work plan bid summaries associated with this agent
   **/
  public AgentWorkPlanBids agentWorkPlanBids(List<AgentWorkPlanBid> agentWorkPlanBids) {
    this.agentWorkPlanBids = agentWorkPlanBids;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Work plan bid summaries associated with this agent")
  @JsonProperty("agentWorkPlanBids")
  public List<AgentWorkPlanBid> getAgentWorkPlanBids() {
    return agentWorkPlanBids;
  }
  public void setAgentWorkPlanBids(List<AgentWorkPlanBid> agentWorkPlanBids) {
    this.agentWorkPlanBids = agentWorkPlanBids;
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
    AgentWorkPlanBids agentWorkPlanBids = (AgentWorkPlanBids) o;

    return Objects.equals(this.id, agentWorkPlanBids.id) &&
            Objects.equals(this.businessUnit, agentWorkPlanBids.businessUnit) &&
            Objects.equals(this.agentWorkPlanBids, agentWorkPlanBids.agentWorkPlanBids) &&
            Objects.equals(this.selfUri, agentWorkPlanBids.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, businessUnit, agentWorkPlanBids, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWorkPlanBids {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    agentWorkPlanBids: ").append(toIndentedString(agentWorkPlanBids)).append("\n");
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

