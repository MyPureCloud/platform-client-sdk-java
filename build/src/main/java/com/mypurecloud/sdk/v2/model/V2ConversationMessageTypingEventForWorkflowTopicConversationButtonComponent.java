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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent
 */

public class V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent  implements Serializable {
  
  private String title = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions actions = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent actions(V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actions")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions getActions() {
    return actions;
  }
  public void setActions(V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions actions) {
    this.actions = actions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent v2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent = (V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent) o;
    return Objects.equals(this.title, v2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent.title) &&
        Objects.equals(this.actions, v2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

