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
import com.mypurecloud.sdk.v2.model.DialogflowCXProject;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialogflowCXAgentSummary
 */

public class DialogflowCXAgentSummary  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DialogflowCXProject project = null;
  private String description = null;
  private DomainEntityRef integration = null;
  private String selfUri = null;

  public DialogflowCXAgentSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DialogflowCXAgentSummary name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The project this Dialogflow CX agent belongs to.
   **/
  public DialogflowCXAgentSummary project(DialogflowCXProject project) {
    this.project = project;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The project this Dialogflow CX agent belongs to.")
  @JsonProperty("project")
  public DialogflowCXProject getProject() {
    return project;
  }
  public void setProject(DialogflowCXProject project) {
    this.project = project;
  }


  /**
   * A description of the Dialogflow CX agent.
   **/
  public DialogflowCXAgentSummary description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the Dialogflow CX agent.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The Integration this Dialogflow CX agent was referenced from.
   **/
  public DialogflowCXAgentSummary integration(DomainEntityRef integration) {
    this.integration = integration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Integration this Dialogflow CX agent was referenced from.")
  @JsonProperty("integration")
  public DomainEntityRef getIntegration() {
    return integration;
  }
  public void setIntegration(DomainEntityRef integration) {
    this.integration = integration;
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
    DialogflowCXAgentSummary dialogflowCXAgentSummary = (DialogflowCXAgentSummary) o;

    return Objects.equals(this.id, dialogflowCXAgentSummary.id) &&
            Objects.equals(this.name, dialogflowCXAgentSummary.name) &&
            Objects.equals(this.project, dialogflowCXAgentSummary.project) &&
            Objects.equals(this.description, dialogflowCXAgentSummary.description) &&
            Objects.equals(this.integration, dialogflowCXAgentSummary.integration) &&
            Objects.equals(this.selfUri, dialogflowCXAgentSummary.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, project, description, integration, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowCXAgentSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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

