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
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationCallbackEventTopicScoredAgent
 */

public class ConversationCallbackEventTopicScoredAgent  implements Serializable {
  
  private ConversationCallbackEventTopicUriReference agent = null;
  private Integer score = null;

  
  /**
   **/
  public ConversationCallbackEventTopicScoredAgent agent(ConversationCallbackEventTopicUriReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public ConversationCallbackEventTopicUriReference getAgent() {
    return agent;
  }
  public void setAgent(ConversationCallbackEventTopicUriReference agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public ConversationCallbackEventTopicScoredAgent score(Integer score) {
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
    ConversationCallbackEventTopicScoredAgent conversationCallbackEventTopicScoredAgent = (ConversationCallbackEventTopicScoredAgent) o;
    return Objects.equals(this.agent, conversationCallbackEventTopicScoredAgent.agent) &&
        Objects.equals(this.score, conversationCallbackEventTopicScoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCallbackEventTopicScoredAgent {\n");
    
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

