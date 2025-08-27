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
import com.mypurecloud.sdk.v2.model.ConversationMessageContent;
import com.mypurecloud.sdk.v2.model.ConversationMessageEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RichMedia Input to the bot.
 */
@ApiModel(description = "RichMedia Input to the bot.")

public class TextBotsRichMediaInputEvent  implements Serializable {
  
  private List<ConversationMessageContent> inputs = null;
  private List<ConversationMessageEvent> messages = null;

  public TextBotsRichMediaInputEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inputs = new ArrayList<ConversationMessageContent>();
      messages = new ArrayList<ConversationMessageEvent>();
    }
  }

  
  /**
   * The Rich Media content inputs.
   **/
  public TextBotsRichMediaInputEvent inputs(List<ConversationMessageContent> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Rich Media content inputs.")
  @JsonProperty("inputs")
  public List<ConversationMessageContent> getInputs() {
    return inputs;
  }
  public void setInputs(List<ConversationMessageContent> inputs) {
    this.inputs = inputs;
  }


  /**
   * The Rich Media message events.
   **/
  public TextBotsRichMediaInputEvent messages(List<ConversationMessageEvent> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Rich Media message events.")
  @JsonProperty("messages")
  public List<ConversationMessageEvent> getMessages() {
    return messages;
  }
  public void setMessages(List<ConversationMessageEvent> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotsRichMediaInputEvent textBotsRichMediaInputEvent = (TextBotsRichMediaInputEvent) o;

    return Objects.equals(this.inputs, textBotsRichMediaInputEvent.inputs) &&
            Objects.equals(this.messages, textBotsRichMediaInputEvent.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotsRichMediaInputEvent {\n");
    
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

