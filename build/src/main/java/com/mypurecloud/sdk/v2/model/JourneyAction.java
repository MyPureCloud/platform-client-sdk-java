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
import com.mypurecloud.sdk.v2.model.JourneyActionMap;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyAction
 */

public class JourneyAction  implements Serializable {
  
  private String id = null;
  private JourneyActionMap actionMap = null;

  
  /**
   * The ID of an action from the Journey System (an action is spawned from an actionMap)
   **/
  public JourneyAction id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of an action from the Journey System (an action is spawned from an actionMap)")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Details about the action map from the Journey System which triggered this action
   **/
  public JourneyAction actionMap(JourneyActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Details about the action map from the Journey System which triggered this action")
  @JsonProperty("actionMap")
  public JourneyActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(JourneyActionMap actionMap) {
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
    JourneyAction journeyAction = (JourneyAction) o;
    return Objects.equals(this.id, journeyAction.id) &&
        Objects.equals(this.actionMap, journeyAction.actionMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAction {\n");
    
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

