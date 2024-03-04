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
import com.mypurecloud.sdk.v2.model.DialogflowCXEnvironment;
import com.mypurecloud.sdk.v2.model.DialogflowCXProject;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialogflowCXAgent
 */

public class DialogflowCXAgent  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DialogflowCXProject project = null;
  private List<String> languages = new ArrayList<String>();
  private List<DialogflowCXEnvironment> environments = new ArrayList<DialogflowCXEnvironment>();
  private DomainEntityRef integration = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DialogflowCXAgent name(String name) {
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
  public DialogflowCXAgent project(DialogflowCXProject project) {
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
   * The supported languages of the Dialogflow CX agent.  Each value will be a language code in the country-locale format. e.g. en-us, es-us, fr-ca, etc.
   **/
  public DialogflowCXAgent languages(List<String> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The supported languages of the Dialogflow CX agent.  Each value will be a language code in the country-locale format. e.g. en-us, es-us, fr-ca, etc.")
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  /**
   * Available environments for this CX agent.
   **/
  public DialogflowCXAgent environments(List<DialogflowCXEnvironment> environments) {
    this.environments = environments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Available environments for this CX agent.")
  @JsonProperty("environments")
  public List<DialogflowCXEnvironment> getEnvironments() {
    return environments;
  }
  public void setEnvironments(List<DialogflowCXEnvironment> environments) {
    this.environments = environments;
  }


  /**
   * The Integration this Dialogflow CX agent was referenced from.
   **/
  public DialogflowCXAgent integration(DomainEntityRef integration) {
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
    DialogflowCXAgent dialogflowCXAgent = (DialogflowCXAgent) o;

    return Objects.equals(this.id, dialogflowCXAgent.id) &&
            Objects.equals(this.name, dialogflowCXAgent.name) &&
            Objects.equals(this.project, dialogflowCXAgent.project) &&
            Objects.equals(this.languages, dialogflowCXAgent.languages) &&
            Objects.equals(this.environments, dialogflowCXAgent.environments) &&
            Objects.equals(this.integration, dialogflowCXAgent.integration) &&
            Objects.equals(this.selfUri, dialogflowCXAgent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, project, languages, environments, integration, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowCXAgent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

