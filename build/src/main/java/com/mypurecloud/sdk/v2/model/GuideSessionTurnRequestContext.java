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
import com.mypurecloud.sdk.v2.model.CustomConversationAttributeInput;
import com.mypurecloud.sdk.v2.model.GuideSessionMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Context provided to a guide session turn, including conversation custom attributes and prior conversation history.
 */
@ApiModel(description = "Context provided to a guide session turn, including conversation custom attributes and prior conversation history.")

public class GuideSessionTurnRequestContext  implements Serializable {
  
  private List<CustomConversationAttributeInput> customConversationAttributes = null;
  private List<GuideSessionMessage> messages = null;
  private Boolean knowledgeQueryDetected = null;

  public GuideSessionTurnRequestContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      customConversationAttributes = new ArrayList<CustomConversationAttributeInput>();
      messages = new ArrayList<GuideSessionMessage>();
    }
  }

  public GuideSessionTurnRequestContext(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      customConversationAttributes = new ArrayList<CustomConversationAttributeInput>();
      messages = new ArrayList<GuideSessionMessage>();
    }
  }

  
  /**
   * The Conversation Custom Attributes schemas and records available for this turn.
   **/
  public GuideSessionTurnRequestContext customConversationAttributes(List<CustomConversationAttributeInput> customConversationAttributes) {
    this.customConversationAttributes = customConversationAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Conversation Custom Attributes schemas and records available for this turn.")
  @JsonProperty("customConversationAttributes")
  public List<CustomConversationAttributeInput> getCustomConversationAttributes() {
    return customConversationAttributes;
  }
  public void setCustomConversationAttributes(List<CustomConversationAttributeInput> customConversationAttributes) {
    this.customConversationAttributes = customConversationAttributes;
  }


  /**
   * The conversation history that occurred before this guide session.
   **/
  public GuideSessionTurnRequestContext messages(List<GuideSessionMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation history that occurred before this guide session.")
  @JsonProperty("messages")
  public List<GuideSessionMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<GuideSessionMessage> messages) {
    this.messages = messages;
  }


  /**
   * Whether a knowledge query was detected in the previous conversation turns.
   **/
  public GuideSessionTurnRequestContext knowledgeQueryDetected(Boolean knowledgeQueryDetected) {
    this.knowledgeQueryDetected = knowledgeQueryDetected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether a knowledge query was detected in the previous conversation turns.")
  @JsonProperty("knowledgeQueryDetected")
  public Boolean getKnowledgeQueryDetected() {
    return knowledgeQueryDetected;
  }
  public void setKnowledgeQueryDetected(Boolean knowledgeQueryDetected) {
    this.knowledgeQueryDetected = knowledgeQueryDetected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideSessionTurnRequestContext guideSessionTurnRequestContext = (GuideSessionTurnRequestContext) o;

    return Objects.equals(this.customConversationAttributes, guideSessionTurnRequestContext.customConversationAttributes) &&
            Objects.equals(this.messages, guideSessionTurnRequestContext.messages) &&
            Objects.equals(this.knowledgeQueryDetected, guideSessionTurnRequestContext.knowledgeQueryDetected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customConversationAttributes, messages, knowledgeQueryDetected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionTurnRequestContext {\n");
    
    sb.append("    customConversationAttributes: ").append(toIndentedString(customConversationAttributes)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    knowledgeQueryDetected: ").append(toIndentedString(knowledgeQueryDetected)).append("\n");
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

