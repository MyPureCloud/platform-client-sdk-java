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
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template body object.
 */
@ApiModel(description = "Template body object.")

public class ConversationNotificationTemplateBody  implements Serializable {
  
  private String text = null;
  private List<ConversationNotificationTemplateParameter> parameters = new ArrayList<ConversationNotificationTemplateParameter>();

  
  /**
   * Body text. For WhatsApp, ignored.
   **/
  public ConversationNotificationTemplateBody text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Body text. For WhatsApp, ignored.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Template parameters for placeholders in template.
   **/
  public ConversationNotificationTemplateBody parameters(List<ConversationNotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Template parameters for placeholders in template.")
  @JsonProperty("parameters")
  public List<ConversationNotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<ConversationNotificationTemplateParameter> parameters) {
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
    ConversationNotificationTemplateBody conversationNotificationTemplateBody = (ConversationNotificationTemplateBody) o;
    return Objects.equals(this.text, conversationNotificationTemplateBody.text) &&
        Objects.equals(this.parameters, conversationNotificationTemplateBody.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationTemplateBody {\n");
    
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

