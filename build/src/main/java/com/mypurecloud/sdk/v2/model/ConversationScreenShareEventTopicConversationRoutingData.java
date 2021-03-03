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
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationScreenShareEventTopicConversationRoutingData
 */

public class ConversationScreenShareEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationScreenShareEventTopicUriReference queue = null;
  private ConversationScreenShareEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationScreenShareEventTopicUriReference> skills = new ArrayList<ConversationScreenShareEventTopicUriReference>();
  private List<ConversationScreenShareEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationScreenShareEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationScreenShareEventTopicConversationRoutingData queue(ConversationScreenShareEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationScreenShareEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationScreenShareEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicConversationRoutingData language(ConversationScreenShareEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationScreenShareEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationScreenShareEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicConversationRoutingData priority(Integer priority) {
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
  public ConversationScreenShareEventTopicConversationRoutingData skills(List<ConversationScreenShareEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationScreenShareEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationScreenShareEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicConversationRoutingData scoredAgents(List<ConversationScreenShareEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationScreenShareEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationScreenShareEventTopicScoredAgent> scoredAgents) {
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
    ConversationScreenShareEventTopicConversationRoutingData conversationScreenShareEventTopicConversationRoutingData = (ConversationScreenShareEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationScreenShareEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationScreenShareEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationScreenShareEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationScreenShareEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationScreenShareEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScreenShareEventTopicConversationRoutingData {\n");
    
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

