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

import java.io.Serializable;
/**
 * V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction
 */

public class V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction  implements Serializable {
  
  private String text = null;
  private String description = null;
  private BigDecimal score = null;

  public V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction description(String description) {
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
  public V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction score(BigDecimal score) {
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
    V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction v2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction = (V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction) o;

    return Objects.equals(this.text, v2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction.text) &&
            Objects.equals(this.description, v2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction.description) &&
            Objects.equals(this.score, v2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, description, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

