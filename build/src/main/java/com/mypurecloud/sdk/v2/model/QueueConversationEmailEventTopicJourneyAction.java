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
import com.mypurecloud.sdk.v2.model.QueueConversationEmailEventTopicJourneyActionMap;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationEmailEventTopicJourneyAction
 */

public class QueueConversationEmailEventTopicJourneyAction  implements Serializable {
  
  private String id = null;
  private QueueConversationEmailEventTopicJourneyActionMap actionMap = null;

  
  /**
   **/
  public QueueConversationEmailEventTopicJourneyAction id(String id) {
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
  public QueueConversationEmailEventTopicJourneyAction actionMap(QueueConversationEmailEventTopicJourneyActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public QueueConversationEmailEventTopicJourneyActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(QueueConversationEmailEventTopicJourneyActionMap actionMap) {
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
    QueueConversationEmailEventTopicJourneyAction queueConversationEmailEventTopicJourneyAction = (QueueConversationEmailEventTopicJourneyAction) o;
    return Objects.equals(this.id, queueConversationEmailEventTopicJourneyAction.id) &&
        Objects.equals(this.actionMap, queueConversationEmailEventTopicJourneyAction.actionMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEmailEventTopicJourneyAction {\n");
    
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

