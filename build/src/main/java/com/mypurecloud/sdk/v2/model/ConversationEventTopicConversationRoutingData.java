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
import com.mypurecloud.sdk.v2.model.ConversationEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationEventTopicConversationRoutingData
 */

public class ConversationEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationEventTopicUriReference queue = null;
  private ConversationEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationEventTopicUriReference> skills = new ArrayList<ConversationEventTopicUriReference>();
  private List<ConversationEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationEventTopicConversationRoutingData queue(ConversationEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationEventTopicConversationRoutingData language(ConversationEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationEventTopicConversationRoutingData priority(Integer priority) {
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
  public ConversationEventTopicConversationRoutingData skills(List<ConversationEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationEventTopicConversationRoutingData scoredAgents(List<ConversationEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationEventTopicScoredAgent> scoredAgents) {
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
    ConversationEventTopicConversationRoutingData conversationEventTopicConversationRoutingData = (ConversationEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicConversationRoutingData {\n");
    
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

