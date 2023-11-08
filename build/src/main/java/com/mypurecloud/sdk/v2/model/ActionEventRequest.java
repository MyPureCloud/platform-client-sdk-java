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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActionEventRequest
 */

public class ActionEventRequest  implements Serializable {
  
  private String id = null;
  private String sessionId = null;
  private String actionId = null;

  private static class ActionStateEnumDeserializer extends StdDeserializer<ActionStateEnum> {
    public ActionStateEnumDeserializer() {
      super(ActionStateEnumDeserializer.class);
    }

    @Override
    public ActionStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * State the action is transitioning to.
   */
 @JsonDeserialize(using = ActionStateEnumDeserializer.class)
  public enum ActionStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACCEPTED("accepted"),
    REJECTED("rejected"),
    TIMEDOUT("timedout"),
    ERRORED("errored"),
    IGNORED("ignored"),
    QUALIFIED("qualified"),
    OFFERED("offered"),
    STARTED("started"),
    ENGAGED("engaged"),
    QUALIFIEDOUTSIDESCHEDULE("qualifiedOutsideSchedule"),
    OFFEREDOUTSIDESCHEDULE("offeredOutsideSchedule"),
    ABANDONED("abandoned"),
    COMPLETED("completed"),
    FREQUENCYCAPREACHED("frequencyCapReached");

    private String value;

    ActionStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionStateEnum fromString(String key) {
      if (key == null) return null;

      for (ActionStateEnum value : ActionStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionStateEnum actionState = null;
  private String errorCode = null;
  private String errorMessage = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * UUID of the customer session for this action.
   **/
  public ActionEventRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UUID of the customer session for this action.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * UUID for the action, as returned by the Ping endpoint when the action was qualified.
   **/
  public ActionEventRequest actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UUID for the action, as returned by the Ping endpoint when the action was qualified.")
  @JsonProperty("actionId")
  public String getActionId() {
    return actionId;
  }
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  /**
   * State the action is transitioning to.
   **/
  public ActionEventRequest actionState(ActionStateEnum actionState) {
    this.actionState = actionState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "State the action is transitioning to.")
  @JsonProperty("actionState")
  public ActionStateEnum getActionState() {
    return actionState;
  }
  public void setActionState(ActionStateEnum actionState) {
    this.actionState = actionState;
  }


  /**
   * Client defined error code (when state transitions to errored)
   **/
  public ActionEventRequest errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Client defined error code (when state transitions to errored)")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * Message of the error returned when the action fails (when state transitions to errored)
   **/
  public ActionEventRequest errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message of the error returned when the action fails (when state transitions to errored)")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionEventRequest actionEventRequest = (ActionEventRequest) o;

    return Objects.equals(this.id, actionEventRequest.id) &&
            Objects.equals(this.sessionId, actionEventRequest.sessionId) &&
            Objects.equals(this.actionId, actionEventRequest.actionId) &&
            Objects.equals(this.actionState, actionEventRequest.actionState) &&
            Objects.equals(this.errorCode, actionEventRequest.errorCode) &&
            Objects.equals(this.errorMessage, actionEventRequest.errorMessage) &&
            Objects.equals(this.selfUri, actionEventRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessionId, actionId, actionState, errorCode, errorMessage, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionEventRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionState: ").append(toIndentedString(actionState)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

