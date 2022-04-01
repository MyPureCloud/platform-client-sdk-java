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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody
 */

public class V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody  implements Serializable {
  
  private String text = null;
  private List<V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateParameter> parameters = new ArrayList<V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateParameter>();

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody text(String text) {
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
  public V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody parameters(List<V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameters")
  public List<V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateParameter> parameters) {
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
    V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody v2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody = (V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody) o;
    return Objects.equals(this.text, v2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody.text) &&
        Objects.equals(this.parameters, v2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationNotificationTemplateBody {\n");
    
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

