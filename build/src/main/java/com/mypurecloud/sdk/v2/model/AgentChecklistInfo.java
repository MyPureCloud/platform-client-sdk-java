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
import com.mypurecloud.sdk.v2.model.ChecklistItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentChecklistInfo
 */

public class AgentChecklistInfo  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ChecklistItem> checklistItems = null;
  private String selfUri = null;

  public AgentChecklistInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      checklistItems = new ArrayList<ChecklistItem>();
    }
  }

  
  /**
   * ID of the checklist.
   **/
  public AgentChecklistInfo id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the checklist.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of the checklist.
   **/
  public AgentChecklistInfo name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the checklist.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * List of individual Checklist Items.
   **/
  public AgentChecklistInfo checklistItems(List<ChecklistItem> checklistItems) {
    this.checklistItems = checklistItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of individual Checklist Items.")
  @JsonProperty("checklistItems")
  public List<ChecklistItem> getChecklistItems() {
    return checklistItems;
  }
  public void setChecklistItems(List<ChecklistItem> checklistItems) {
    this.checklistItems = checklistItems;
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
    AgentChecklistInfo agentChecklistInfo = (AgentChecklistInfo) o;

    return Objects.equals(this.id, agentChecklistInfo.id) &&
            Objects.equals(this.name, agentChecklistInfo.name) &&
            Objects.equals(this.checklistItems, agentChecklistInfo.checklistItems) &&
            Objects.equals(this.selfUri, agentChecklistInfo.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, checklistItems, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChecklistInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checklistItems: ").append(toIndentedString(checklistItems)).append("\n");
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

