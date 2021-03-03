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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Detail;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Operation
 */

public class Operation  implements Serializable {
  
  private String id = null;
  private Boolean complete = null;
  private User user = null;
  private DomainEntityRef client = null;
  private String errorMessage = null;
  private String errorCode = null;
  private List<Detail> errorDetails = new ArrayList<Detail>();
  private Map<String, String> errorMessageParams = null;

  private static class ActionNameEnumDeserializer extends StdDeserializer<ActionNameEnum> {
    public ActionNameEnumDeserializer() {
      super(ActionNameEnumDeserializer.class);
    }

    @Override
    public ActionNameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionNameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Action name
   */
 @JsonDeserialize(using = ActionNameEnumDeserializer.class)
  public enum ActionNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("CREATE"),
    CHECKIN("CHECKIN"),
    DEBUG("DEBUG"),
    DELETE("DELETE"),
    HISTORY("HISTORY"),
    PUBLISH("PUBLISH"),
    STATE_CHANGE("STATE_CHANGE"),
    UPDATE("UPDATE"),
    VALIDATE("VALIDATE");

    private String value;

    ActionNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionNameEnum fromString(String key) {
      if (key == null) return null;

      for (ActionNameEnum value : ActionNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionNameEnum actionName = null;

  private static class ActionStatusEnumDeserializer extends StdDeserializer<ActionStatusEnum> {
    public ActionStatusEnumDeserializer() {
      super(ActionStatusEnumDeserializer.class);
    }

    @Override
    public ActionStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Action status
   */
 @JsonDeserialize(using = ActionStatusEnumDeserializer.class)
  public enum ActionStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOCKED("LOCKED"),
    UNLOCKED("UNLOCKED"),
    STARTED("STARTED"),
    PENDING_GENERATION("PENDING_GENERATION"),
    PENDING_BACKEND_NOTIFICATION("PENDING_BACKEND_NOTIFICATION"),
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE");

    private String value;

    ActionStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ActionStatusEnum value : ActionStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionStatusEnum actionStatus = null;

  
  /**
   **/
  public Operation id(String id) {
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
  public Operation complete(Boolean complete) {
    this.complete = complete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  
  /**
   **/
  public Operation user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   **/
  public Operation client(DomainEntityRef client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("client")
  public DomainEntityRef getClient() {
    return client;
  }
  public void setClient(DomainEntityRef client) {
    this.client = client;
  }

  
  /**
   **/
  public Operation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  public Operation errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   **/
  public Operation errorDetails(List<Detail> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public List<Detail> getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(List<Detail> errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   **/
  public Operation errorMessageParams(Map<String, String> errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessageParams")
  public Map<String, String> getErrorMessageParams() {
    return errorMessageParams;
  }
  public void setErrorMessageParams(Map<String, String> errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
  }

  
  /**
   * Action name
   **/
  public Operation actionName(ActionNameEnum actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action name")
  @JsonProperty("actionName")
  public ActionNameEnum getActionName() {
    return actionName;
  }
  public void setActionName(ActionNameEnum actionName) {
    this.actionName = actionName;
  }

  
  /**
   * Action status
   **/
  public Operation actionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action status")
  @JsonProperty("actionStatus")
  public ActionStatusEnum getActionStatus() {
    return actionStatus;
  }
  public void setActionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.id, operation.id) &&
        Objects.equals(this.complete, operation.complete) &&
        Objects.equals(this.user, operation.user) &&
        Objects.equals(this.client, operation.client) &&
        Objects.equals(this.errorMessage, operation.errorMessage) &&
        Objects.equals(this.errorCode, operation.errorCode) &&
        Objects.equals(this.errorDetails, operation.errorDetails) &&
        Objects.equals(this.errorMessageParams, operation.errorMessageParams) &&
        Objects.equals(this.actionName, operation.actionName) &&
        Objects.equals(this.actionStatus, operation.actionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complete, user, client, errorMessage, errorCode, errorDetails, errorMessageParams, actionName, actionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    errorMessageParams: ").append(toIndentedString(errorMessageParams)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
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

