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
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationMessageEventTopicConversationRoutingData
 */

public class ConversationMessageEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationMessageEventTopicUriReference queue = null;
  private ConversationMessageEventTopicUriReference language = null;
  private Long priority = null;
  private List<ConversationMessageEventTopicUriReference> skills = null;
  private List<ConversationMessageEventTopicScoredAgent> scoredAgents = null;

  public ConversationMessageEventTopicConversationRoutingData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skills = new ArrayList<ConversationMessageEventTopicUriReference>();
      scoredAgents = new ArrayList<ConversationMessageEventTopicScoredAgent>();
    }
  }

  
  /**
   * A UriReference for a resource
   **/
  public ConversationMessageEventTopicConversationRoutingData queue(ConversationMessageEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("queue")
  public ConversationMessageEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationMessageEventTopicUriReference queue) {
    this.queue = queue;
  }


  /**
   * A UriReference for a resource
   **/
  public ConversationMessageEventTopicConversationRoutingData language(ConversationMessageEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("language")
  public ConversationMessageEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationMessageEventTopicUriReference language) {
    this.language = language;
  }


  /**
   * The priority of the conversation to use for routing decisions
   **/
  public ConversationMessageEventTopicConversationRoutingData priority(Long priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of the conversation to use for routing decisions")
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }
  public void setPriority(Long priority) {
    this.priority = priority;
  }


  /**
   * The skills to use for routing decisions
   **/
  public ConversationMessageEventTopicConversationRoutingData skills(List<ConversationMessageEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skills to use for routing decisions")
  @JsonProperty("skills")
  public List<ConversationMessageEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationMessageEventTopicUriReference> skills) {
    this.skills = skills;
  }


  /**
   * A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents
   **/
  public ConversationMessageEventTopicConversationRoutingData scoredAgents(List<ConversationMessageEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents")
  @JsonProperty("scoredAgents")
  public List<ConversationMessageEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationMessageEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageEventTopicConversationRoutingData conversationMessageEventTopicConversationRoutingData = (ConversationMessageEventTopicConversationRoutingData) o;

    return Objects.equals(this.queue, conversationMessageEventTopicConversationRoutingData.queue) &&
            Objects.equals(this.language, conversationMessageEventTopicConversationRoutingData.language) &&
            Objects.equals(this.priority, conversationMessageEventTopicConversationRoutingData.priority) &&
            Objects.equals(this.skills, conversationMessageEventTopicConversationRoutingData.skills) &&
            Objects.equals(this.scoredAgents, conversationMessageEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageEventTopicConversationRoutingData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
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

