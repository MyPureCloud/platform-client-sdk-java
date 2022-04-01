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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateFooter;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate
 */

public class V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate  implements Serializable {
  
  private String id = null;
  private String language = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateHeader header = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody body = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateFooter footer = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate header(V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("header")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateHeader getHeader() {
    return header;
  }
  public void setHeader(V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateHeader header) {
    this.header = header;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate body(V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("body")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody getBody() {
    return body;
  }
  public void setBody(V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateBody body) {
    this.body = body;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate footer(V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateFooter footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("footer")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateFooter getFooter() {
    return footer;
  }
  public void setFooter(V2ConversationMessageTypingEventForWorkflowTopicConversationNotificationTemplateFooter footer) {
    this.footer = footer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate v2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate = (V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate) o;
    return Objects.equals(this.id, v2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate.id) &&
        Objects.equals(this.language, v2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate.language) &&
        Objects.equals(this.header, v2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate.header) &&
        Objects.equals(this.body, v2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate.body) &&
        Objects.equals(this.footer, v2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, header, body, footer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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

