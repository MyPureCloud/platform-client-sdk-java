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
import com.mypurecloud.sdk.v2.model.AgentScheduleBid;
import com.mypurecloud.sdk.v2.model.BusinessUnitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentScheduleBids
 */

public class AgentScheduleBids  implements Serializable {
  
  private String id = null;
  private BusinessUnitReference businessUnit = null;
  private List<AgentScheduleBid> agentScheduleBids = null;
  private String selfUri = null;

  public AgentScheduleBids() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentScheduleBids = new ArrayList<AgentScheduleBid>();
    }
  }

  public AgentScheduleBids(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentScheduleBids = new ArrayList<AgentScheduleBid>();
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
  public AgentScheduleBids businessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The business unit to which the bids belong")
  @JsonProperty("businessUnit")
  public BusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   * Schedule bid summaries associated with this agent
   **/
  public AgentScheduleBids agentScheduleBids(List<AgentScheduleBid> agentScheduleBids) {
    this.agentScheduleBids = agentScheduleBids;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Schedule bid summaries associated with this agent")
  @JsonProperty("agentScheduleBids")
  public List<AgentScheduleBid> getAgentScheduleBids() {
    return agentScheduleBids;
  }
  public void setAgentScheduleBids(List<AgentScheduleBid> agentScheduleBids) {
    this.agentScheduleBids = agentScheduleBids;
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
    AgentScheduleBids agentScheduleBids = (AgentScheduleBids) o;

    return Objects.equals(this.id, agentScheduleBids.id) &&
            Objects.equals(this.businessUnit, agentScheduleBids.businessUnit) &&
            Objects.equals(this.agentScheduleBids, agentScheduleBids.agentScheduleBids) &&
            Objects.equals(this.selfUri, agentScheduleBids.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, businessUnit, agentScheduleBids, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleBids {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    agentScheduleBids: ").append(toIndentedString(agentScheduleBids)).append("\n");
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

