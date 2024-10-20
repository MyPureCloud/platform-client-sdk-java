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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * ConversationSummaryTopicVirtualAgentsConversationWrapUpCode
 */

public class ConversationSummaryTopicVirtualAgentsConversationWrapUpCode  implements Serializable {
  
  private String wrapUpCodeId = null;
  private String name = null;
  private String description = null;
  private BigDecimal score = null;

  
  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationWrapUpCode wrapUpCodeId(String wrapUpCodeId) {
    this.wrapUpCodeId = wrapUpCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapUpCodeId")
  public String getWrapUpCodeId() {
    return wrapUpCodeId;
  }
  public void setWrapUpCodeId(String wrapUpCodeId) {
    this.wrapUpCodeId = wrapUpCodeId;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationWrapUpCode name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationWrapUpCode description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public ConversationSummaryTopicVirtualAgentsConversationWrapUpCode score(BigDecimal score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
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
    ConversationSummaryTopicVirtualAgentsConversationWrapUpCode conversationSummaryTopicVirtualAgentsConversationWrapUpCode = (ConversationSummaryTopicVirtualAgentsConversationWrapUpCode) o;

    return Objects.equals(this.wrapUpCodeId, conversationSummaryTopicVirtualAgentsConversationWrapUpCode.wrapUpCodeId) &&
            Objects.equals(this.name, conversationSummaryTopicVirtualAgentsConversationWrapUpCode.name) &&
            Objects.equals(this.description, conversationSummaryTopicVirtualAgentsConversationWrapUpCode.description) &&
            Objects.equals(this.score, conversationSummaryTopicVirtualAgentsConversationWrapUpCode.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wrapUpCodeId, name, description, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummaryTopicVirtualAgentsConversationWrapUpCode {\n");
    
    sb.append("    wrapUpCodeId: ").append(toIndentedString(wrapUpCodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

