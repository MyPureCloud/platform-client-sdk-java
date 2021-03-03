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
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationSocialExpressionEventTopicConversationRoutingData
 */

public class ConversationSocialExpressionEventTopicConversationRoutingData  implements Serializable {
  
  private ConversationSocialExpressionEventTopicUriReference queue = null;
  private ConversationSocialExpressionEventTopicUriReference language = null;
  private Integer priority = null;
  private List<ConversationSocialExpressionEventTopicUriReference> skills = new ArrayList<ConversationSocialExpressionEventTopicUriReference>();
  private List<ConversationSocialExpressionEventTopicScoredAgent> scoredAgents = new ArrayList<ConversationSocialExpressionEventTopicScoredAgent>();

  
  /**
   **/
  public ConversationSocialExpressionEventTopicConversationRoutingData queue(ConversationSocialExpressionEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public ConversationSocialExpressionEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(ConversationSocialExpressionEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public ConversationSocialExpressionEventTopicConversationRoutingData language(ConversationSocialExpressionEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public ConversationSocialExpressionEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(ConversationSocialExpressionEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public ConversationSocialExpressionEventTopicConversationRoutingData priority(Integer priority) {
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
  public ConversationSocialExpressionEventTopicConversationRoutingData skills(List<ConversationSocialExpressionEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<ConversationSocialExpressionEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<ConversationSocialExpressionEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public ConversationSocialExpressionEventTopicConversationRoutingData scoredAgents(List<ConversationSocialExpressionEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<ConversationSocialExpressionEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<ConversationSocialExpressionEventTopicScoredAgent> scoredAgents) {
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
    ConversationSocialExpressionEventTopicConversationRoutingData conversationSocialExpressionEventTopicConversationRoutingData = (ConversationSocialExpressionEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, conversationSocialExpressionEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, conversationSocialExpressionEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, conversationSocialExpressionEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, conversationSocialExpressionEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, conversationSocialExpressionEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSocialExpressionEventTopicConversationRoutingData {\n");
    
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

