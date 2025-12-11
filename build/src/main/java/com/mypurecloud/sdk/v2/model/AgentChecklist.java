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
import com.mypurecloud.sdk.v2.model.AgentChecklistItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentChecklist
 */

public class AgentChecklist  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String language = null;
  private List<AgentChecklistItem> checklistItems = null;
  private UserReference createdBy = null;
  private UserReference modifiedBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public AgentChecklist() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      checklistItems = new ArrayList<AgentChecklistItem>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "Agent Checklist ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Agent Checklist Name.
   **/
  public AgentChecklist name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Agent Checklist Name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Agent Checklist Language.
   **/
  public AgentChecklist language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Agent Checklist Language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Agent Checklist Items.
   **/
  public AgentChecklist checklistItems(List<AgentChecklistItem> checklistItems) {
    this.checklistItems = checklistItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Agent Checklist Items.")
  @JsonProperty("checklistItems")
  public List<AgentChecklistItem> getChecklistItems() {
    return checklistItems;
  }
  public void setChecklistItems(List<AgentChecklistItem> checklistItems) {
    this.checklistItems = checklistItems;
  }


  @ApiModelProperty(example = "null", value = "The user who created the agent checklist.")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The user who last modified the agent checklist.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  @ApiModelProperty(example = "null", value = "Date when the agent checklist was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date when the agent checklist was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    AgentChecklist agentChecklist = (AgentChecklist) o;

    return Objects.equals(this.id, agentChecklist.id) &&
            Objects.equals(this.name, agentChecklist.name) &&
            Objects.equals(this.language, agentChecklist.language) &&
            Objects.equals(this.checklistItems, agentChecklist.checklistItems) &&
            Objects.equals(this.createdBy, agentChecklist.createdBy) &&
            Objects.equals(this.modifiedBy, agentChecklist.modifiedBy) &&
            Objects.equals(this.dateCreated, agentChecklist.dateCreated) &&
            Objects.equals(this.dateModified, agentChecklist.dateModified) &&
            Objects.equals(this.selfUri, agentChecklist.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, checklistItems, createdBy, modifiedBy, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChecklist {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    checklistItems: ").append(toIndentedString(checklistItems)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

