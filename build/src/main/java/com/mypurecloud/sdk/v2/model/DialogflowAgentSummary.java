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
import com.mypurecloud.sdk.v2.model.DialogflowProject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialogflowAgentSummary
 */

public class DialogflowAgentSummary  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DialogflowProject project = null;
  private String description = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DialogflowAgentSummary name(String name) {
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
  public DialogflowAgentSummary project(DialogflowProject project) {
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
   * A description of the Dialogflow agent
   **/
  public DialogflowAgentSummary description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the Dialogflow agent")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
    DialogflowAgentSummary dialogflowAgentSummary = (DialogflowAgentSummary) o;
    return Objects.equals(this.id, dialogflowAgentSummary.id) &&
        Objects.equals(this.name, dialogflowAgentSummary.name) &&
        Objects.equals(this.project, dialogflowAgentSummary.project) &&
        Objects.equals(this.description, dialogflowAgentSummary.description) &&
        Objects.equals(this.selfUri, dialogflowAgentSummary.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, project, description, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowAgentSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

