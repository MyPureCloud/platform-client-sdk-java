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
import com.mypurecloud.sdk.v2.model.ConversationVideoEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationVideoEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationVideoEventTopicConversationRoutingData
 */

public class ConversationVideoEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationVideoEventTopicUriReference queue = null;
  private ConversationVideoEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationVideoEventTopicUriReference> skills = new ArrayList<ConversationVideoEventTopicUriReference>();
  private List<ConversationVideoEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationVideoEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationVideoEventTopicConversationRoutingData queue(ConversationVideoEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationVideoEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationVideoEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationVideoEventTopicConversationRoutingData language(ConversationVideoEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationVideoEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationVideoEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationVideoEventTopicConversationRoutingData priority(Integer priority) {
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
  public ConversationVideoEventTopicConversationRoutingData skills(List<ConversationVideoEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationVideoEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationVideoEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationVideoEventTopicConversationRoutingData scoredAgents(List<ConversationVideoEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationVideoEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationVideoEventTopicScoredAgent> scoredAgents) {
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
    ConversationVideoEventTopicConversationRoutingData conversationVideoEventTopicConversationRoutingData = (ConversationVideoEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationVideoEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationVideoEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationVideoEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationVideoEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationVideoEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationVideoEventTopicConversationRoutingData {\n");
    
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

