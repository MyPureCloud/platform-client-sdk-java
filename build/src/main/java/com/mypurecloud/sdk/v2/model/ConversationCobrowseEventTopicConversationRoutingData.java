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
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationCobrowseEventTopicConversationRoutingData
 */

public class ConversationCobrowseEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationCobrowseEventTopicUriReference queue = null;
  private ConversationCobrowseEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationCobrowseEventTopicUriReference> skills = new ArrayList<ConversationCobrowseEventTopicUriReference>();
  private List<ConversationCobrowseEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationCobrowseEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationCobrowseEventTopicConversationRoutingData queue(ConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationCobrowseEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationCobrowseEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicConversationRoutingData language(ConversationCobrowseEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationCobrowseEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationCobrowseEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicConversationRoutingData priority(Integer priority) {
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
  public ConversationCobrowseEventTopicConversationRoutingData skills(List<ConversationCobrowseEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationCobrowseEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationCobrowseEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicConversationRoutingData scoredAgents(List<ConversationCobrowseEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationCobrowseEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationCobrowseEventTopicScoredAgent> scoredAgents) {
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
    ConversationCobrowseEventTopicConversationRoutingData conversationCobrowseEventTopicConversationRoutingData = (ConversationCobrowseEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationCobrowseEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationCobrowseEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationCobrowseEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationCobrowseEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationCobrowseEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCobrowseEventTopicConversationRoutingData {\n");
    
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

