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
import com.mypurecloud.sdk.v2.model.ConversationCallbackEventTopicJourneyActionMap;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationCallbackEventTopicJourneyAction
 */

public class ConversationCallbackEventTopicJourneyAction  implements Serializable {
  
  private String id = null;
  private ConversationCallbackEventTopicJourneyActionMap actionMap = null;

  
  /**
   **/
  public ConversationCallbackEventTopicJourneyAction id(String id) {
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
  public ConversationCallbackEventTopicJourneyAction actionMap(ConversationCallbackEventTopicJourneyActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public ConversationCallbackEventTopicJourneyActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(ConversationCallbackEventTopicJourneyActionMap actionMap) {
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
    ConversationCallbackEventTopicJourneyAction conversationCallbackEventTopicJourneyAction = (ConversationCallbackEventTopicJourneyAction) o;
    return Objects.equals(this.id, conversationCallbackEventTopicJourneyAction.id) &&
        Objects.equals(this.actionMap, conversationCallbackEventTopicJourneyAction.actionMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCallbackEventTopicJourneyAction {\n");
    
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

