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
import com.mypurecloud.sdk.v2.model.ScoredAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingData
 */

public class RoutingData  implements Serializable {
  
  private String queueId = null;
  private String languageId = null;
  private Integer priority = null;
  private List<String> skillIds = new ArrayList<String>();
  private List<String> preferredAgentIds = new ArrayList<String>();
  private List<ScoredAgent> scoredAgents = new ArrayList<ScoredAgent>();
  private List<String> routingFlags = new ArrayList<String>();

  
  /**
   * The identifier of the routing queue
   **/
  public RoutingData queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the routing queue")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The identifier of a language to be considered in routing
   **/
  public RoutingData languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of a language to be considered in routing")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  
  /**
   * The priority for routing
   **/
  public RoutingData priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority for routing")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * A list of skill identifiers to be considered in routing
   **/
  public RoutingData skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of skill identifiers to be considered in routing")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * A list of agents to be preferred in routing
   **/
  public RoutingData preferredAgentIds(List<String> preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of agents to be preferred in routing")
  @JsonProperty("preferredAgentIds")
  public List<String> getPreferredAgentIds() {
    return preferredAgentIds;
  }
  public void setPreferredAgentIds(List<String> preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
  }

  
  /**
   * A list of scored agents for routing decisions
   **/
  public RoutingData scoredAgents(List<ScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of scored agents for routing decisions")
  @JsonProperty("scoredAgents")
  public List<ScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }

  
  /**
   * An array of flags indicating how the conversation should be routed
   **/
  public RoutingData routingFlags(List<String> routingFlags) {
    this.routingFlags = routingFlags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of flags indicating how the conversation should be routed")
  @JsonProperty("routingFlags")
  public List<String> getRoutingFlags() {
    return routingFlags;
  }
  public void setRoutingFlags(List<String> routingFlags) {
    this.routingFlags = routingFlags;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingData routingData = (RoutingData) o;
    return Objects.equals(this.queueId, routingData.queueId) &&
        Objects.equals(this.languageId, routingData.languageId) &&
        Objects.equals(this.priority, routingData.priority) &&
        Objects.equals(this.skillIds, routingData.skillIds) &&
        Objects.equals(this.preferredAgentIds, routingData.preferredAgentIds) &&
        Objects.equals(this.scoredAgents, routingData.scoredAgents) &&
        Objects.equals(this.routingFlags, routingData.routingFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, languageId, priority, skillIds, preferredAgentIds, scoredAgents, routingFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingData {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    preferredAgentIds: ").append(toIndentedString(preferredAgentIds)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
    sb.append("    routingFlags: ").append(toIndentedString(routingFlags)).append("\n");
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

