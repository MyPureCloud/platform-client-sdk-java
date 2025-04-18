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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ArchitectFlowNotificationClient;
import com.mypurecloud.sdk.v2.model.ArchitectFlowNotificationErrorDetail;
import com.mypurecloud.sdk.v2.model.ArchitectFlowNotificationErrorMessageParams;
import com.mypurecloud.sdk.v2.model.ArchitectFlowNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Describes an operation being performed on an Architect object
 */
@ApiModel(description = "Describes an operation being performed on an Architect object")

public class ArchitectFlowNotificationArchitectOperation  implements Serializable {
  
  private String id = null;
  private Boolean complete = null;
  private ArchitectFlowNotificationUser user = null;
  private ArchitectFlowNotificationClient client = null;

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
   * The action being performed
   */
 @JsonDeserialize(using = ActionNameEnumDeserializer.class)
  public enum ActionNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("CREATE"),
    CHECKIN("CHECKIN"),
    CHECKOUT("CHECKOUT"),
    DEACTIVATE("DEACTIVATE"),
    DEBUG("DEBUG"),
    DELETE("DELETE"),
    HISTORY("HISTORY"),
    PUBLISH("PUBLISH"),
    REVERT("REVERT"),
    SAVE("SAVE"),
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
   * The action status
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
  private String errorMessage = null;
  private String errorCode = null;
  private ArchitectFlowNotificationErrorMessageParams errorMessageParams = null;
  private List<ArchitectFlowNotificationErrorDetail> errorDetails = null;

  public ArchitectFlowNotificationArchitectOperation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      errorDetails = new ArrayList<ArchitectFlowNotificationErrorDetail>();
    }
  }

  
  /**
   * A unique identifier for this operation, as generated by the initiating client
   **/
  public ArchitectFlowNotificationArchitectOperation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for this operation, as generated by the initiating client")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Indicates if the operation is complete
   **/
  public ArchitectFlowNotificationArchitectOperation complete(Boolean complete) {
    this.complete = complete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the operation is complete")
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  /**
   **/
  public ArchitectFlowNotificationArchitectOperation user(ArchitectFlowNotificationUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public ArchitectFlowNotificationUser getUser() {
    return user;
  }
  public void setUser(ArchitectFlowNotificationUser user) {
    this.user = user;
  }


  /**
   **/
  public ArchitectFlowNotificationArchitectOperation client(ArchitectFlowNotificationClient client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("client")
  public ArchitectFlowNotificationClient getClient() {
    return client;
  }
  public void setClient(ArchitectFlowNotificationClient client) {
    this.client = client;
  }


  /**
   * The action being performed
   **/
  public ArchitectFlowNotificationArchitectOperation actionName(ActionNameEnum actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action being performed")
  @JsonProperty("actionName")
  public ActionNameEnum getActionName() {
    return actionName;
  }
  public void setActionName(ActionNameEnum actionName) {
    this.actionName = actionName;
  }


  /**
   * The action status
   **/
  public ArchitectFlowNotificationArchitectOperation actionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action status")
  @JsonProperty("actionStatus")
  public ActionStatusEnum getActionStatus() {
    return actionStatus;
  }
  public void setActionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
  }


  /**
   * The error message, if the action failed
   **/
  public ArchitectFlowNotificationArchitectOperation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error message, if the action failed")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * The error code, if the action failed
   **/
  public ArchitectFlowNotificationArchitectOperation errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error code, if the action failed")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   **/
  public ArchitectFlowNotificationArchitectOperation errorMessageParams(ArchitectFlowNotificationErrorMessageParams errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessageParams")
  public ArchitectFlowNotificationErrorMessageParams getErrorMessageParams() {
    return errorMessageParams;
  }
  public void setErrorMessageParams(ArchitectFlowNotificationErrorMessageParams errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
  }


  /**
   * The error details, if the action failed
   **/
  public ArchitectFlowNotificationArchitectOperation errorDetails(List<ArchitectFlowNotificationErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error details, if the action failed")
  @JsonProperty("errorDetails")
  public List<ArchitectFlowNotificationErrorDetail> getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(List<ArchitectFlowNotificationErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectFlowNotificationArchitectOperation architectFlowNotificationArchitectOperation = (ArchitectFlowNotificationArchitectOperation) o;

    return Objects.equals(this.id, architectFlowNotificationArchitectOperation.id) &&
            Objects.equals(this.complete, architectFlowNotificationArchitectOperation.complete) &&
            Objects.equals(this.user, architectFlowNotificationArchitectOperation.user) &&
            Objects.equals(this.client, architectFlowNotificationArchitectOperation.client) &&
            Objects.equals(this.actionName, architectFlowNotificationArchitectOperation.actionName) &&
            Objects.equals(this.actionStatus, architectFlowNotificationArchitectOperation.actionStatus) &&
            Objects.equals(this.errorMessage, architectFlowNotificationArchitectOperation.errorMessage) &&
            Objects.equals(this.errorCode, architectFlowNotificationArchitectOperation.errorCode) &&
            Objects.equals(this.errorMessageParams, architectFlowNotificationArchitectOperation.errorMessageParams) &&
            Objects.equals(this.errorDetails, architectFlowNotificationArchitectOperation.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complete, user, client, actionName, actionStatus, errorMessage, errorCode, errorMessageParams, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectFlowNotificationArchitectOperation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessageParams: ").append(toIndentedString(errorMessageParams)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

