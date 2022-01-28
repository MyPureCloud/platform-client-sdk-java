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
import com.mypurecloud.sdk.v2.model.ConversationAppSettings;
import com.mypurecloud.sdk.v2.model.Knowledge;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The apps embedded in the messenger
 */
@ApiModel(description = "The apps embedded in the messenger")

public class MessengerApps  implements Serializable {
  
  private ConversationAppSettings conversations = null;
  private Knowledge knowledge = null;

  
  /**
   * The conversation settings that handles chats within the messenger
   **/
  public MessengerApps conversations(ConversationAppSettings conversations) {
    this.conversations = conversations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation settings that handles chats within the messenger")
  @JsonProperty("conversations")
  public ConversationAppSettings getConversations() {
    return conversations;
  }
  public void setConversations(ConversationAppSettings conversations) {
    this.conversations = conversations;
  }

  
  /**
   * The knowledge base config for messenger
   **/
  public MessengerApps knowledge(Knowledge knowledge) {
    this.knowledge = knowledge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge base config for messenger")
  @JsonProperty("knowledge")
  public Knowledge getKnowledge() {
    return knowledge;
  }
  public void setKnowledge(Knowledge knowledge) {
    this.knowledge = knowledge;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessengerApps messengerApps = (MessengerApps) o;
    return Objects.equals(this.conversations, messengerApps.conversations) &&
        Objects.equals(this.knowledge, messengerApps.knowledge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversations, knowledge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessengerApps {\n");
    
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
    sb.append("    knowledge: ").append(toIndentedString(knowledge)).append("\n");
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

