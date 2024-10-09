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

import java.io.Serializable;
/**
 * ConversationSummaryFollowup
 */

public class ConversationSummaryFollowup  implements Serializable {
  
  private String text = null;
  private String description = null;
  private Float confidence = null;

  
  /**
   * The text of the followup.
   **/
  public ConversationSummaryFollowup text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text of the followup.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * The description.
   **/
  public ConversationSummaryFollowup description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "The AI confidence value.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSummaryFollowup conversationSummaryFollowup = (ConversationSummaryFollowup) o;

    return Objects.equals(this.text, conversationSummaryFollowup.text) &&
            Objects.equals(this.description, conversationSummaryFollowup.description) &&
            Objects.equals(this.confidence, conversationSummaryFollowup.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, description, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummaryFollowup {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

