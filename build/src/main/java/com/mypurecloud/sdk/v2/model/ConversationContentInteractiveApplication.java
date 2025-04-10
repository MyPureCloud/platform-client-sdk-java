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
import com.mypurecloud.sdk.v2.model.ConversationContentReceivedReplyMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InteractiveApplication content object.
 */
@ApiModel(description = "InteractiveApplication content object.")

public class ConversationContentInteractiveApplication  implements Serializable {
  
  private String name = null;
  private String url = null;
  private ConversationContentReceivedReplyMessage receivedMessage = null;
  private ConversationContentReceivedReplyMessage replyMessage = null;

  public ConversationContentInteractiveApplication() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the message app.
   **/
  public ConversationContentInteractiveApplication name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the message app.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Contains the data that is sent to the message app.
   **/
  public ConversationContentInteractiveApplication url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains the data that is sent to the message app.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * The message displayed in the received message bubble.
   **/
  public ConversationContentInteractiveApplication receivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message displayed in the received message bubble.")
  @JsonProperty("receivedMessage")
  public ConversationContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The message displayed in the reply message bubble.
   **/
  public ConversationContentInteractiveApplication replyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message displayed in the reply message bubble.")
  @JsonProperty("replyMessage")
  public ConversationContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentInteractiveApplication conversationContentInteractiveApplication = (ConversationContentInteractiveApplication) o;

    return Objects.equals(this.name, conversationContentInteractiveApplication.name) &&
            Objects.equals(this.url, conversationContentInteractiveApplication.url) &&
            Objects.equals(this.receivedMessage, conversationContentInteractiveApplication.receivedMessage) &&
            Objects.equals(this.replyMessage, conversationContentInteractiveApplication.replyMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, receivedMessage, replyMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentInteractiveApplication {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
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

