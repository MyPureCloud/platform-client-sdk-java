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
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationMessageEventTopicScoredAgent
 */

public class ConversationMessageEventTopicScoredAgent  implements Serializable {
  
  private ConversationMessageEventTopicUriReference agent = null;
  private Integer score = null;

  
  /**
   **/
  public ConversationMessageEventTopicScoredAgent agent(ConversationMessageEventTopicUriReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public ConversationMessageEventTopicUriReference getAgent() {
    return agent;
  }
  public void setAgent(ConversationMessageEventTopicUriReference agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public ConversationMessageEventTopicScoredAgent score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
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
    ConversationMessageEventTopicScoredAgent conversationMessageEventTopicScoredAgent = (ConversationMessageEventTopicScoredAgent) o;
    return Objects.equals(this.agent, conversationMessageEventTopicScoredAgent.agent) &&
        Objects.equals(this.score, conversationMessageEventTopicScoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageEventTopicScoredAgent {\n");
    
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

