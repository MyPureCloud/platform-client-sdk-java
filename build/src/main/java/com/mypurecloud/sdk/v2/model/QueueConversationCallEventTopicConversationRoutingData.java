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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicConversationRoutingData
 */

public class QueueConversationCallEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationCallEventTopicUriReference queue = null;
  private QueueConversationCallEventTopicUriReference language = null;
  private Long priority = null;
  private List<QueueConversationCallEventTopicUriReference> skills = null;
  private List<QueueConversationCallEventTopicScoredAgent> scoredAgents = null;

  public QueueConversationCallEventTopicConversationRoutingData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skills = new ArrayList<QueueConversationCallEventTopicUriReference>();
      scoredAgents = new ArrayList<QueueConversationCallEventTopicScoredAgent>();
    }
  }

  
  /**
   * A UriReference for a resource
   **/
  public QueueConversationCallEventTopicConversationRoutingData queue(QueueConversationCallEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("queue")
  public QueueConversationCallEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationCallEventTopicUriReference queue) {
    this.queue = queue;
  }


  /**
   * A UriReference for a resource
   **/
  public QueueConversationCallEventTopicConversationRoutingData language(QueueConversationCallEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("language")
  public QueueConversationCallEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationCallEventTopicUriReference language) {
    this.language = language;
  }


  /**
   * The priority of the conversation to use for routing decisions
   **/
  public QueueConversationCallEventTopicConversationRoutingData priority(Long priority) {
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
  public QueueConversationCallEventTopicConversationRoutingData skills(List<QueueConversationCallEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skills to use for routing decisions")
  @JsonProperty("skills")
  public List<QueueConversationCallEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationCallEventTopicUriReference> skills) {
    this.skills = skills;
  }


  /**
   * A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents
   **/
  public QueueConversationCallEventTopicConversationRoutingData scoredAgents(List<QueueConversationCallEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents")
  @JsonProperty("scoredAgents")
  public List<QueueConversationCallEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationCallEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationCallEventTopicConversationRoutingData queueConversationCallEventTopicConversationRoutingData = (QueueConversationCallEventTopicConversationRoutingData) o;

    return Objects.equals(this.queue, queueConversationCallEventTopicConversationRoutingData.queue) &&
            Objects.equals(this.language, queueConversationCallEventTopicConversationRoutingData.language) &&
            Objects.equals(this.priority, queueConversationCallEventTopicConversationRoutingData.priority) &&
            Objects.equals(this.skills, queueConversationCallEventTopicConversationRoutingData.skills) &&
            Objects.equals(this.scoredAgents, queueConversationCallEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicConversationRoutingData {\n");
    
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

