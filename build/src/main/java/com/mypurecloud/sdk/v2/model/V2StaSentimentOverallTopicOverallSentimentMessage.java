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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2StaSentimentOverallTopicOverallSentimentMessage
 */

public class V2StaSentimentOverallTopicOverallSentimentMessage  implements Serializable {
  
  private String conversationId = null;
  private BigDecimal sentimentOverallScore = null;
  private BigDecimal sentimentTrendScore = null;
  private List<String> queueIds = null;
  private List<String> divisionIds = null;

  public V2StaSentimentOverallTopicOverallSentimentMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      queueIds = new ArrayList<String>();
      divisionIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public V2StaSentimentOverallTopicOverallSentimentMessage conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public V2StaSentimentOverallTopicOverallSentimentMessage sentimentOverallScore(BigDecimal sentimentOverallScore) {
    this.sentimentOverallScore = sentimentOverallScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sentimentOverallScore")
  public BigDecimal getSentimentOverallScore() {
    return sentimentOverallScore;
  }
  public void setSentimentOverallScore(BigDecimal sentimentOverallScore) {
    this.sentimentOverallScore = sentimentOverallScore;
  }


  /**
   **/
  public V2StaSentimentOverallTopicOverallSentimentMessage sentimentTrendScore(BigDecimal sentimentTrendScore) {
    this.sentimentTrendScore = sentimentTrendScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sentimentTrendScore")
  public BigDecimal getSentimentTrendScore() {
    return sentimentTrendScore;
  }
  public void setSentimentTrendScore(BigDecimal sentimentTrendScore) {
    this.sentimentTrendScore = sentimentTrendScore;
  }


  /**
   **/
  public V2StaSentimentOverallTopicOverallSentimentMessage queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }


  /**
   **/
  public V2StaSentimentOverallTopicOverallSentimentMessage divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaSentimentOverallTopicOverallSentimentMessage v2StaSentimentOverallTopicOverallSentimentMessage = (V2StaSentimentOverallTopicOverallSentimentMessage) o;

    return Objects.equals(this.conversationId, v2StaSentimentOverallTopicOverallSentimentMessage.conversationId) &&
            Objects.equals(this.sentimentOverallScore, v2StaSentimentOverallTopicOverallSentimentMessage.sentimentOverallScore) &&
            Objects.equals(this.sentimentTrendScore, v2StaSentimentOverallTopicOverallSentimentMessage.sentimentTrendScore) &&
            Objects.equals(this.queueIds, v2StaSentimentOverallTopicOverallSentimentMessage.queueIds) &&
            Objects.equals(this.divisionIds, v2StaSentimentOverallTopicOverallSentimentMessage.divisionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, sentimentOverallScore, sentimentTrendScore, queueIds, divisionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaSentimentOverallTopicOverallSentimentMessage {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    sentimentOverallScore: ").append(toIndentedString(sentimentOverallScore)).append("\n");
    sb.append("    sentimentTrendScore: ").append(toIndentedString(sentimentTrendScore)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
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

