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
import com.mypurecloud.sdk.v2.model.ActionEventActionMap;
import com.mypurecloud.sdk.v2.model.GenericEventAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GenericActionEvent
 */

public class GenericActionEvent  implements Serializable {
  
  private GenericEventAction action = null;
  private ActionEventActionMap actionMap = null;
  private String errorCode = null;
  private String errorMessage = null;

  
  /**
   * The action that triggered the event.
   **/
  public GenericActionEvent action(GenericEventAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action that triggered the event.")
  @JsonProperty("action")
  public GenericEventAction getAction() {
    return action;
  }
  public void setAction(GenericEventAction action) {
    this.action = action;
  }


  /**
   * The action map that triggered the action.
   **/
  public GenericActionEvent actionMap(ActionEventActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action map that triggered the action.")
  @JsonProperty("actionMap")
  public ActionEventActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(ActionEventActionMap actionMap) {
    this.actionMap = actionMap;
  }


  /**
   * Code of the error returned when the action fails.
   **/
  public GenericActionEvent errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the error returned when the action fails.")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * Message of the error returned when the action fails.
   **/
  public GenericActionEvent errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message of the error returned when the action fails.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericActionEvent genericActionEvent = (GenericActionEvent) o;

    return Objects.equals(this.action, genericActionEvent.action) &&
            Objects.equals(this.actionMap, genericActionEvent.actionMap) &&
            Objects.equals(this.errorCode, genericActionEvent.errorCode) &&
            Objects.equals(this.errorMessage, genericActionEvent.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionMap, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericActionEvent {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionMap: ").append(toIndentedString(actionMap)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

