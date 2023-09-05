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
import com.mypurecloud.sdk.v2.model.AgentIntegrationAssociationRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentIntegrationsRequest
 */

public class AgentIntegrationsRequest  implements Serializable {
  
  private String selectedIntegrationId = null;
  private List<AgentIntegrationAssociationRequest> associatedIntegrations = new ArrayList<AgentIntegrationAssociationRequest>();

  
  /**
   * The ID of the integration selected for the agent. If not set, no integration will be used for the agent
   **/
  public AgentIntegrationsRequest selectedIntegrationId(String selectedIntegrationId) {
    this.selectedIntegrationId = selectedIntegrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the integration selected for the agent. If not set, no integration will be used for the agent")
  @JsonProperty("selectedIntegrationId")
  public String getSelectedIntegrationId() {
    return selectedIntegrationId;
  }
  public void setSelectedIntegrationId(String selectedIntegrationId) {
    this.selectedIntegrationId = selectedIntegrationId;
  }


  /**
   * The list of integrations associated with the agent
   **/
  public AgentIntegrationsRequest associatedIntegrations(List<AgentIntegrationAssociationRequest> associatedIntegrations) {
    this.associatedIntegrations = associatedIntegrations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of integrations associated with the agent")
  @JsonProperty("associatedIntegrations")
  public List<AgentIntegrationAssociationRequest> getAssociatedIntegrations() {
    return associatedIntegrations;
  }
  public void setAssociatedIntegrations(List<AgentIntegrationAssociationRequest> associatedIntegrations) {
    this.associatedIntegrations = associatedIntegrations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentIntegrationsRequest agentIntegrationsRequest = (AgentIntegrationsRequest) o;

    return Objects.equals(this.selectedIntegrationId, agentIntegrationsRequest.selectedIntegrationId) &&
            Objects.equals(this.associatedIntegrations, agentIntegrationsRequest.associatedIntegrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedIntegrationId, associatedIntegrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentIntegrationsRequest {\n");
    
    sb.append("    selectedIntegrationId: ").append(toIndentedString(selectedIntegrationId)).append("\n");
    sb.append("    associatedIntegrations: ").append(toIndentedString(associatedIntegrations)).append("\n");
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

