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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ScoredAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationRoutingData
 */

public class ConversationRoutingData  implements Serializable {
  
  private AddressableEntityRef queue = null;
  private AddressableEntityRef language = null;
  private Integer priority = null;
  private List<AddressableEntityRef> skills = null;
  private List<ScoredAgent> scoredAgents = null;
  private String label = null;

  public ConversationRoutingData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skills = new ArrayList<AddressableEntityRef>();
      scoredAgents = new ArrayList<ScoredAgent>();
    }
  }

  
  /**
   * The queue to use for routing decisions
   **/
  public ConversationRoutingData queue(AddressableEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue to use for routing decisions")
  @JsonProperty("queue")
  public AddressableEntityRef getQueue() {
    return queue;
  }
  public void setQueue(AddressableEntityRef queue) {
    this.queue = queue;
  }


  /**
   * The language to use for routing decisions
   **/
  public ConversationRoutingData language(AddressableEntityRef language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language to use for routing decisions")
  @JsonProperty("language")
  public AddressableEntityRef getLanguage() {
    return language;
  }
  public void setLanguage(AddressableEntityRef language) {
    this.language = language;
  }


  /**
   * The priority of the conversation to use for routing decisions
   **/
  public ConversationRoutingData priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of the conversation to use for routing decisions")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * The skills to use for routing decisions
   **/
  public ConversationRoutingData skills(List<AddressableEntityRef> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skills to use for routing decisions")
  @JsonProperty("skills")
  public List<AddressableEntityRef> getSkills() {
    return skills;
  }
  public void setSkills(List<AddressableEntityRef> skills) {
    this.skills = skills;
  }


  /**
   * A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents
   **/
  public ConversationRoutingData scoredAgents(List<ScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents")
  @JsonProperty("scoredAgents")
  public List<ScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  /**
   * An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level
   **/
  public ConversationRoutingData label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationRoutingData conversationRoutingData = (ConversationRoutingData) o;

    return Objects.equals(this.queue, conversationRoutingData.queue) &&
            Objects.equals(this.language, conversationRoutingData.language) &&
            Objects.equals(this.priority, conversationRoutingData.priority) &&
            Objects.equals(this.skills, conversationRoutingData.skills) &&
            Objects.equals(this.scoredAgents, conversationRoutingData.scoredAgents) &&
            Objects.equals(this.label, conversationRoutingData.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationRoutingData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

