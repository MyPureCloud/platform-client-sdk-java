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
import com.mypurecloud.sdk.v2.model.AgentIntegrationAssociationResponse;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmIntegrationReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentIntegrationsResponse
 */

public class AgentIntegrationsResponse  implements Serializable {
  
  private UserReference agent = null;
  private WfmIntegrationReference selectedIntegration = null;
  private Boolean userSelected = null;
  private List<AgentIntegrationAssociationResponse> associatedIntegrations = null;

  public AgentIntegrationsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      associatedIntegrations = new ArrayList<AgentIntegrationAssociationResponse>();
    }
  }

  
  /**
   * The user associated with the integrations
   **/
  public AgentIntegrationsResponse agent(UserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user associated with the integrations")
  @JsonProperty("agent")
  public UserReference getAgent() {
    return agent;
  }
  public void setAgent(UserReference agent) {
    this.agent = agent;
  }


  /**
   * The integration selected for the agent. If not set, no integration will be used for the agent
   **/
  public AgentIntegrationsResponse selectedIntegration(WfmIntegrationReference selectedIntegration) {
    this.selectedIntegration = selectedIntegration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The integration selected for the agent. If not set, no integration will be used for the agent")
  @JsonProperty("selectedIntegration")
  public WfmIntegrationReference getSelectedIntegration() {
    return selectedIntegration;
  }
  public void setSelectedIntegration(WfmIntegrationReference selectedIntegration) {
    this.selectedIntegration = selectedIntegration;
  }


  /**
   * Whether the integration association has been manually selected
   **/
  public AgentIntegrationsResponse userSelected(Boolean userSelected) {
    this.userSelected = userSelected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the integration association has been manually selected")
  @JsonProperty("userSelected")
  public Boolean getUserSelected() {
    return userSelected;
  }
  public void setUserSelected(Boolean userSelected) {
    this.userSelected = userSelected;
  }


  /**
   * The list of integrations associated with the agent
   **/
  public AgentIntegrationsResponse associatedIntegrations(List<AgentIntegrationAssociationResponse> associatedIntegrations) {
    this.associatedIntegrations = associatedIntegrations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of integrations associated with the agent")
  @JsonProperty("associatedIntegrations")
  public List<AgentIntegrationAssociationResponse> getAssociatedIntegrations() {
    return associatedIntegrations;
  }
  public void setAssociatedIntegrations(List<AgentIntegrationAssociationResponse> associatedIntegrations) {
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
    AgentIntegrationsResponse agentIntegrationsResponse = (AgentIntegrationsResponse) o;

    return Objects.equals(this.agent, agentIntegrationsResponse.agent) &&
            Objects.equals(this.selectedIntegration, agentIntegrationsResponse.selectedIntegration) &&
            Objects.equals(this.userSelected, agentIntegrationsResponse.userSelected) &&
            Objects.equals(this.associatedIntegrations, agentIntegrationsResponse.associatedIntegrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, selectedIntegration, userSelected, associatedIntegrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentIntegrationsResponse {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    selectedIntegration: ").append(toIndentedString(selectedIntegration)).append("\n");
    sb.append("    userSelected: ").append(toIndentedString(userSelected)).append("\n");
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

