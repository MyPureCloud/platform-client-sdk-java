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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicScoredAgent
 */

public class QueueConversationCallEventTopicScoredAgent  implements Serializable {
  
  private QueueConversationCallEventTopicUriReference agent = null;
  private Long score = null;

  public QueueConversationCallEventTopicScoredAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A UriReference for a resource
   **/
  public QueueConversationCallEventTopicScoredAgent agent(QueueConversationCallEventTopicUriReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("agent")
  public QueueConversationCallEventTopicUriReference getAgent() {
    return agent;
  }
  public void setAgent(QueueConversationCallEventTopicUriReference agent) {
    this.agent = agent;
  }


  /**
   * Agent's score for the current conversation, from 0 - 100, higher being better
   **/
  public QueueConversationCallEventTopicScoredAgent score(Long score) {
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
    QueueConversationCallEventTopicScoredAgent queueConversationCallEventTopicScoredAgent = (QueueConversationCallEventTopicScoredAgent) o;

    return Objects.equals(this.agent, queueConversationCallEventTopicScoredAgent.agent) &&
            Objects.equals(this.score, queueConversationCallEventTopicScoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicScoredAgent {\n");
    
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

