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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ConversationContentQuickReply;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Quick reply object V2.
 */
@ApiModel(description = "Quick reply object V2.")

public class ConversationContentQuickReplyV2  implements Serializable {
  
  private String title = null;
  private List<ConversationContentQuickReply> actions = new ArrayList<ConversationContentQuickReply>();

  
  /**
   * Text to show as the title of the quick reply.
   **/
  public ConversationContentQuickReplyV2 title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text to show as the title of the quick reply.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * An array of quick reply objects.
   **/
  public ConversationContentQuickReplyV2 actions(List<ConversationContentQuickReply> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of quick reply objects.")
  @JsonProperty("actions")
  public List<ConversationContentQuickReply> getActions() {
    return actions;
  }
  public void setActions(List<ConversationContentQuickReply> actions) {
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
    ConversationContentQuickReplyV2 conversationContentQuickReplyV2 = (ConversationContentQuickReplyV2) o;

    return Objects.equals(this.title, conversationContentQuickReplyV2.title) &&
            Objects.equals(this.actions, conversationContentQuickReplyV2.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentQuickReplyV2 {\n");
    
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

