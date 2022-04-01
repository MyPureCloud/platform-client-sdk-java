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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationContentActions
 */

public class V2ConversationMessageTypingEventForUserTopicConversationContentActions  implements Serializable {
  
  private String url = null;
  private String urlTarget = null;
  private String textback = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentActions url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentActions urlTarget(String urlTarget) {
    this.urlTarget = urlTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("urlTarget")
  public String getUrlTarget() {
    return urlTarget;
  }
  public void setUrlTarget(String urlTarget) {
    this.urlTarget = urlTarget;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentActions textback(String textback) {
    this.textback = textback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("textback")
  public String getTextback() {
    return textback;
  }
  public void setTextback(String textback) {
    this.textback = textback;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationContentActions v2ConversationMessageTypingEventForUserTopicConversationContentActions = (V2ConversationMessageTypingEventForUserTopicConversationContentActions) o;
    return Objects.equals(this.url, v2ConversationMessageTypingEventForUserTopicConversationContentActions.url) &&
        Objects.equals(this.urlTarget, v2ConversationMessageTypingEventForUserTopicConversationContentActions.urlTarget) &&
        Objects.equals(this.textback, v2ConversationMessageTypingEventForUserTopicConversationContentActions.textback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlTarget, textback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationContentActions {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlTarget: ").append(toIndentedString(urlTarget)).append("\n");
    sb.append("    textback: ").append(toIndentedString(textback)).append("\n");
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

