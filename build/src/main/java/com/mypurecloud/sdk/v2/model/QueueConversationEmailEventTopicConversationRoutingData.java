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
import com.mypurecloud.sdk.v2.model.QueueConversationEmailEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationEmailEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEmailEventTopicConversationRoutingData
 */

public class QueueConversationEmailEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationEmailEventTopicUriReference queue = null;
  private QueueConversationEmailEventTopicUriReference language = null;
  private Long priority = null;
  private List<QueueConversationEmailEventTopicUriReference> skills = null;
  private List<QueueConversationEmailEventTopicScoredAgent> scoredAgents = null;

  public QueueConversationEmailEventTopicConversationRoutingData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skills = new ArrayList<QueueConversationEmailEventTopicUriReference>();
      scoredAgents = new ArrayList<QueueConversationEmailEventTopicScoredAgent>();
    }
  }

  
  /**
   * A UriReference for a resource
   **/
  public QueueConversationEmailEventTopicConversationRoutingData queue(QueueConversationEmailEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("queue")
  public QueueConversationEmailEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationEmailEventTopicUriReference queue) {
    this.queue = queue;
  }


  /**
   * A UriReference for a resource
   **/
  public QueueConversationEmailEventTopicConversationRoutingData language(QueueConversationEmailEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("language")
  public QueueConversationEmailEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationEmailEventTopicUriReference language) {
    this.language = language;
  }


  /**
   * The priority of the conversation to use for routing decisions
   **/
  public QueueConversationEmailEventTopicConversationRoutingData priority(Long priority) {
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
  public QueueConversationEmailEventTopicConversationRoutingData skills(List<QueueConversationEmailEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skills to use for routing decisions")
  @JsonProperty("skills")
  public List<QueueConversationEmailEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationEmailEventTopicUriReference> skills) {
    this.skills = skills;
  }


  /**
   * A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents
   **/
  public QueueConversationEmailEventTopicConversationRoutingData scoredAgents(List<QueueConversationEmailEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents")
  @JsonProperty("scoredAgents")
  public List<QueueConversationEmailEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationEmailEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationEmailEventTopicConversationRoutingData queueConversationEmailEventTopicConversationRoutingData = (QueueConversationEmailEventTopicConversationRoutingData) o;

    return Objects.equals(this.queue, queueConversationEmailEventTopicConversationRoutingData.queue) &&
            Objects.equals(this.language, queueConversationEmailEventTopicConversationRoutingData.language) &&
            Objects.equals(this.priority, queueConversationEmailEventTopicConversationRoutingData.priority) &&
            Objects.equals(this.skills, queueConversationEmailEventTopicConversationRoutingData.skills) &&
            Objects.equals(this.scoredAgents, queueConversationEmailEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEmailEventTopicConversationRoutingData {\n");
    
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

