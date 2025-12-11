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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentChecklistItem
 */

public class AgentChecklistItem  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean automatedCheckEnabled = null;
  private Boolean important = null;
  private String selfUri = null;

  public AgentChecklistItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "ID of the checklist item.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Name of the checklist item.
   **/
  public AgentChecklistItem name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the checklist item.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Description of the checklist item.
   **/
  public AgentChecklistItem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the checklist item.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Flag to indicate whether automated check is enabled for this checklist item.
   **/
  public AgentChecklistItem automatedCheckEnabled(Boolean automatedCheckEnabled) {
    this.automatedCheckEnabled = automatedCheckEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag to indicate whether automated check is enabled for this checklist item.")
  @JsonProperty("automatedCheckEnabled")
  public Boolean getAutomatedCheckEnabled() {
    return automatedCheckEnabled;
  }
  public void setAutomatedCheckEnabled(Boolean automatedCheckEnabled) {
    this.automatedCheckEnabled = automatedCheckEnabled;
  }


  /**
   * Flag to indicate whether this checklist item is marked as important.
   **/
  public AgentChecklistItem important(Boolean important) {
    this.important = important;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag to indicate whether this checklist item is marked as important.")
  @JsonProperty("important")
  public Boolean getImportant() {
    return important;
  }
  public void setImportant(Boolean important) {
    this.important = important;
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
    AgentChecklistItem agentChecklistItem = (AgentChecklistItem) o;

    return Objects.equals(this.id, agentChecklistItem.id) &&
            Objects.equals(this.name, agentChecklistItem.name) &&
            Objects.equals(this.description, agentChecklistItem.description) &&
            Objects.equals(this.automatedCheckEnabled, agentChecklistItem.automatedCheckEnabled) &&
            Objects.equals(this.important, agentChecklistItem.important) &&
            Objects.equals(this.selfUri, agentChecklistItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, automatedCheckEnabled, important, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChecklistItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    automatedCheckEnabled: ").append(toIndentedString(automatedCheckEnabled)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
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

