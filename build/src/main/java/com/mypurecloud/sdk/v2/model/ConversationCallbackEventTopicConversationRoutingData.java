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
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationCallbackEventTopicConversationRoutingData
 */

public class ConversationCallbackEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationCallbackEventTopicUriReference queue = null;
  private ConversationCallbackEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationCallbackEventTopicUriReference> skills = new ArrayList<ConversationCallbackEventTopicUriReference>();
  private List<ConversationCallbackEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationCallbackEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationCallbackEventTopicConversationRoutingData queue(ConversationCallbackEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationCallbackEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationCallbackEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicConversationRoutingData language(ConversationCallbackEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationCallbackEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationCallbackEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicConversationRoutingData priority(Integer priority) {
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
  public ConversationCallbackEventTopicConversationRoutingData skills(List<ConversationCallbackEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationCallbackEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationCallbackEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicConversationRoutingData scoredAgents(List<ConversationCallbackEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationCallbackEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationCallbackEventTopicScoredAgent> scoredAgents) {
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
    ConversationCallbackEventTopicConversationRoutingData conversationCallbackEventTopicConversationRoutingData = (ConversationCallbackEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationCallbackEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationCallbackEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationCallbackEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationCallbackEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationCallbackEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCallbackEventTopicConversationRoutingData {\n");
    
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

