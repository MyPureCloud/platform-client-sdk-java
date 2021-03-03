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
import com.mypurecloud.sdk.v2.model.ConversationChatEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationChatEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationChatEventTopicConversationRoutingData
 */

public class ConversationChatEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationChatEventTopicUriReference queue = null;
  private ConversationChatEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationChatEventTopicUriReference> skills = new ArrayList<ConversationChatEventTopicUriReference>();
  private List<ConversationChatEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationChatEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationChatEventTopicConversationRoutingData queue(ConversationChatEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationChatEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationChatEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationChatEventTopicConversationRoutingData language(ConversationChatEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationChatEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationChatEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationChatEventTopicConversationRoutingData priority(Integer priority) {
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
  public ConversationChatEventTopicConversationRoutingData skills(List<ConversationChatEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationChatEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationChatEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationChatEventTopicConversationRoutingData scoredAgents(List<ConversationChatEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationChatEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationChatEventTopicScoredAgent> scoredAgents) {
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
    ConversationChatEventTopicConversationRoutingData conversationChatEventTopicConversationRoutingData = (ConversationChatEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationChatEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationChatEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationChatEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationChatEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationChatEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationChatEventTopicConversationRoutingData {\n");
    
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

