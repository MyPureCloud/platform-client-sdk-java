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
import com.mypurecloud.sdk.v2.model.WfmIntegrationReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentIntegrationAssociationResponse
 */

public class AgentIntegrationAssociationResponse  implements Serializable {
  
  private String agentExternalId = null;
  private WfmIntegrationReference integration = null;
  private Boolean locked = null;

  public AgentIntegrationAssociationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * ID of the agent in external system
   **/
  public AgentIntegrationAssociationResponse agentExternalId(String agentExternalId) {
    this.agentExternalId = agentExternalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the agent in external system")
  @JsonProperty("agentExternalId")
  public String getAgentExternalId() {
    return agentExternalId;
  }
  public void setAgentExternalId(String agentExternalId) {
    this.agentExternalId = agentExternalId;
  }


  /**
   * The integration associated with the agent
   **/
  public AgentIntegrationAssociationResponse integration(WfmIntegrationReference integration) {
    this.integration = integration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The integration associated with the agent")
  @JsonProperty("integration")
  public WfmIntegrationReference getIntegration() {
    return integration;
  }
  public void setIntegration(WfmIntegrationReference integration) {
    this.integration = integration;
  }


  /**
   * Whether agentExternalId should be protected from update by automatic processes
   **/
  public AgentIntegrationAssociationResponse locked(Boolean locked) {
    this.locked = locked;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether agentExternalId should be protected from update by automatic processes")
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentIntegrationAssociationResponse agentIntegrationAssociationResponse = (AgentIntegrationAssociationResponse) o;

    return Objects.equals(this.agentExternalId, agentIntegrationAssociationResponse.agentExternalId) &&
            Objects.equals(this.integration, agentIntegrationAssociationResponse.integration) &&
            Objects.equals(this.locked, agentIntegrationAssociationResponse.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentExternalId, integration, locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentIntegrationAssociationResponse {\n");
    
    sb.append("    agentExternalId: ").append(toIndentedString(agentExternalId)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

