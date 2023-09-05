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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentIntegrationAssociationRequest
 */

public class AgentIntegrationAssociationRequest  implements Serializable {
  
  private String agentExternalId = null;
  private String integrationId = null;
  private Boolean locked = null;

  
  /**
   * The ID of the agent in external system
   **/
  public AgentIntegrationAssociationRequest agentExternalId(String agentExternalId) {
    this.agentExternalId = agentExternalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the agent in external system")
  @JsonProperty("agentExternalId")
  public String getAgentExternalId() {
    return agentExternalId;
  }
  public void setAgentExternalId(String agentExternalId) {
    this.agentExternalId = agentExternalId;
  }


  /**
   * The ID of the integration associated with the agent
   **/
  public AgentIntegrationAssociationRequest integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the integration associated with the agent")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * Whether agentExternalId should be protected from update by automatic processes
   **/
  public AgentIntegrationAssociationRequest locked(Boolean locked) {
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
    AgentIntegrationAssociationRequest agentIntegrationAssociationRequest = (AgentIntegrationAssociationRequest) o;

    return Objects.equals(this.agentExternalId, agentIntegrationAssociationRequest.agentExternalId) &&
            Objects.equals(this.integrationId, agentIntegrationAssociationRequest.integrationId) &&
            Objects.equals(this.locked, agentIntegrationAssociationRequest.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentExternalId, integrationId, locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentIntegrationAssociationRequest {\n");
    
    sb.append("    agentExternalId: ").append(toIndentedString(agentExternalId)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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

