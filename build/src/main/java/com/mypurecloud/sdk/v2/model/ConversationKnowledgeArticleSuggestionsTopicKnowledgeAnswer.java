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

import java.io.Serializable;
/**
 * ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer
 */

public class ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer  implements Serializable {
  
  private String answer = null;
  private Long startIndex = null;
  private Long endIndex = null;

  public ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer answer(String answer) {
    this.answer = answer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }


  /**
   **/
  public ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer startIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startIndex")
  public Long getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
  }


  /**
   **/
  public ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer endIndex(Long endIndex) {
    this.endIndex = endIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endIndex")
  public Long getEndIndex() {
    return endIndex;
  }
  public void setEndIndex(Long endIndex) {
    this.endIndex = endIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer conversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer = (ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer) o;

    return Objects.equals(this.answer, conversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer.answer) &&
            Objects.equals(this.startIndex, conversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer.startIndex) &&
            Objects.equals(this.endIndex, conversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationKnowledgeArticleSuggestionsTopicKnowledgeAnswer {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

