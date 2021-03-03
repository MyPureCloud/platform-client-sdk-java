package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DialogflowIntent;
import com.mypurecloud.sdk.v2.model.DialogflowProject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialogflowAgent
 */

public class DialogflowAgent  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DialogflowProject project = null;
  private List<String> languages = new ArrayList<String>();
  private List<DialogflowIntent> intents = new ArrayList<DialogflowIntent>();
  private List<String> environments = new ArrayList<String>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DialogflowAgent name(String name) {
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
   * The project this Dialogflow agent belongs to
   **/
  public DialogflowAgent project(DialogflowProject project) {
    this.project = project;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The project this Dialogflow agent belongs to")
  @JsonProperty("project")
  public DialogflowProject getProject() {
    return project;
  }
  public void setProject(DialogflowProject project) {
    this.project = project;
  }

  
  /**
   * The supported languages of the Dialogflow agent
   **/
  public DialogflowAgent languages(List<String> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The supported languages of the Dialogflow agent")
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  
  /**
   * An array of Intents associated with this agent
   **/
  public DialogflowAgent intents(List<DialogflowIntent> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of Intents associated with this agent")
  @JsonProperty("intents")
  public List<DialogflowIntent> getIntents() {
    return intents;
  }
  public void setIntents(List<DialogflowIntent> intents) {
    this.intents = intents;
  }

  
  /**
   * Available environments for this agent
   **/
  public DialogflowAgent environments(List<String> environments) {
    this.environments = environments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Available environments for this agent")
  @JsonProperty("environments")
  public List<String> getEnvironments() {
    return environments;
  }
  public void setEnvironments(List<String> environments) {
    this.environments = environments;
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
    DialogflowAgent dialogflowAgent = (DialogflowAgent) o;
    return Objects.equals(this.id, dialogflowAgent.id) &&
        Objects.equals(this.name, dialogflowAgent.name) &&
        Objects.equals(this.project, dialogflowAgent.project) &&
        Objects.equals(this.languages, dialogflowAgent.languages) &&
        Objects.equals(this.intents, dialogflowAgent.intents) &&
        Objects.equals(this.environments, dialogflowAgent.environments) &&
        Objects.equals(this.selfUri, dialogflowAgent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, project, languages, intents, environments, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowAgent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

