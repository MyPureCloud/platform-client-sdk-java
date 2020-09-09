package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationMetrics
 */

public class ConversationMetrics  implements Serializable {
  
  private AddressableEntityRef conversation = null;
  private Double sentimentScore = null;
  private Double sentimentTrend = null;

  
  /**
   * The Conversation Reference
   **/
  public ConversationMetrics conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Conversation Reference")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }

  
  /**
   * The Sentiment Score
   **/
  public ConversationMetrics sentimentScore(Double sentimentScore) {
    this.sentimentScore = sentimentScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Sentiment Score")
  @JsonProperty("sentimentScore")
  public Double getSentimentScore() {
    return sentimentScore;
  }
  public void setSentimentScore(Double sentimentScore) {
    this.sentimentScore = sentimentScore;
  }

  
  /**
   * The Sentiment Trend
   **/
  public ConversationMetrics sentimentTrend(Double sentimentTrend) {
    this.sentimentTrend = sentimentTrend;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Sentiment Trend")
  @JsonProperty("sentimentTrend")
  public Double getSentimentTrend() {
    return sentimentTrend;
  }
  public void setSentimentTrend(Double sentimentTrend) {
    this.sentimentTrend = sentimentTrend;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMetrics conversationMetrics = (ConversationMetrics) o;
    return Objects.equals(this.conversation, conversationMetrics.conversation) &&
        Objects.equals(this.sentimentScore, conversationMetrics.sentimentScore) &&
        Objects.equals(this.sentimentTrend, conversationMetrics.sentimentTrend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, sentimentScore, sentimentTrend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMetrics {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    sentimentScore: ").append(toIndentedString(sentimentScore)).append("\n");
    sb.append("    sentimentTrend: ").append(toIndentedString(sentimentTrend)).append("\n");
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

