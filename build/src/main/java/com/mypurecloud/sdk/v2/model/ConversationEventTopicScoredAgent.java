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
import com.mypurecloud.sdk.v2.model.ConversationEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationEventTopicScoredAgent
 */

public class ConversationEventTopicScoredAgent  implements Serializable {
  
  private ConversationEventTopicUriReference agent = null;
  private Long score = null;

  public ConversationEventTopicScoredAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A UriReference for a resource
   **/
  public ConversationEventTopicScoredAgent agent(ConversationEventTopicUriReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("agent")
  public ConversationEventTopicUriReference getAgent() {
    return agent;
  }
  public void setAgent(ConversationEventTopicUriReference agent) {
    this.agent = agent;
  }


  /**
   * Agent's score for the current conversation, from 0 - 100, higher being better
   **/
  public ConversationEventTopicScoredAgent score(Long score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agent's score for the current conversation, from 0 - 100, higher being better")
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventTopicScoredAgent conversationEventTopicScoredAgent = (ConversationEventTopicScoredAgent) o;

    return Objects.equals(this.agent, conversationEventTopicScoredAgent.agent) &&
            Objects.equals(this.score, conversationEventTopicScoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicScoredAgent {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

