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
import com.mypurecloud.sdk.v2.model.ConversationEmailEventTopicJourneyActionMap;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A subset of the Journey System&#39;s action data relevant to a part of a conversation (for external linkage and internal usage/context)
 */
@ApiModel(description = "A subset of the Journey System's action data relevant to a part of a conversation (for external linkage and internal usage/context)")

public class ConversationEmailEventTopicJourneyAction  implements Serializable {
  
  private String id = null;
  private ConversationEmailEventTopicJourneyActionMap actionMap = null;

  public ConversationEmailEventTopicJourneyAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of an action from the Journey System (an action is spawned from an actionMap)
   **/
  public ConversationEmailEventTopicJourneyAction id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of an action from the Journey System (an action is spawned from an actionMap)")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ConversationEmailEventTopicJourneyAction actionMap(ConversationEmailEventTopicJourneyActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public ConversationEmailEventTopicJourneyActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(ConversationEmailEventTopicJourneyActionMap actionMap) {
    this.actionMap = actionMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEmailEventTopicJourneyAction conversationEmailEventTopicJourneyAction = (ConversationEmailEventTopicJourneyAction) o;

    return Objects.equals(this.id, conversationEmailEventTopicJourneyAction.id) &&
            Objects.equals(this.actionMap, conversationEmailEventTopicJourneyAction.actionMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEmailEventTopicJourneyAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actionMap: ").append(toIndentedString(actionMap)).append("\n");
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

