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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody
 */

public class V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody  implements Serializable {
  
  private String text = null;
  private List<V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateParameter> parameters = new ArrayList<V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateParameter>();

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody text(String text) {
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
  public V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody parameters(List<V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameters")
  public List<V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateParameter> parameters) {
    this.parameters = parameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody v2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody = (V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody) o;
    return Objects.equals(this.text, v2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody.text) &&
        Objects.equals(this.parameters, v2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

