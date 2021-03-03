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
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationCobrowseEventTopicConversationRoutingData
 */

public class QueueConversationCobrowseEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationCobrowseEventTopicUriReference queue = null;
  private QueueConversationCobrowseEventTopicUriReference language = null;
  private Integer priority = null;
  private List<QueueConversationCobrowseEventTopicUriReference> skills = new ArrayList<QueueConversationCobrowseEventTopicUriReference>();
  private List<QueueConversationCobrowseEventTopicScoredAgent> scoredAgents = new ArrayList<QueueConversationCobrowseEventTopicScoredAgent>();

  
  /**
   **/
  public QueueConversationCobrowseEventTopicConversationRoutingData queue(QueueConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationCobrowseEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationCobrowseEventTopicConversationRoutingData language(QueueConversationCobrowseEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public QueueConversationCobrowseEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationCobrowseEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public QueueConversationCobrowseEventTopicConversationRoutingData priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   **/
  public QueueConversationCobrowseEventTopicConversationRoutingData skills(List<QueueConversationCobrowseEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<QueueConversationCobrowseEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationCobrowseEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public QueueConversationCobrowseEventTopicConversationRoutingData scoredAgents(List<QueueConversationCobrowseEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<QueueConversationCobrowseEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationCobrowseEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationCobrowseEventTopicConversationRoutingData queueConversationCobrowseEventTopicConversationRoutingData = (QueueConversationCobrowseEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, queueConversationCobrowseEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, queueConversationCobrowseEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, queueConversationCobrowseEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, queueConversationCobrowseEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, queueConversationCobrowseEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCobrowseEventTopicConversationRoutingData {\n");
    
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

