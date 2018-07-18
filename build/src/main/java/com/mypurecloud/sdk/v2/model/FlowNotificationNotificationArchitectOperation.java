package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DependencyTrackingBuildNotificationNotificationUser;
import com.mypurecloud.sdk.v2.model.PromptNotificationNotificationCurrentOperationErrorDetails;
import com.mypurecloud.sdk.v2.model.PromptNotificationNotificationCurrentOperationErrorMessageParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowNotificationNotificationArchitectOperation
 */

public class FlowNotificationNotificationArchitectOperation  implements Serializable {
  
  private String id = null;
  private Boolean complete = null;
  private DependencyTrackingBuildNotificationNotificationUser user = null;

  /**
   * Gets or Sets actionName
   */
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

  /**
   * Gets or Sets actionStatus
   */
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
  private PromptNotificationNotificationCurrentOperationErrorMessageParams errorMessageParams = null;
  private List<PromptNotificationNotificationCurrentOperationErrorDetails> errorDetails = new ArrayList<PromptNotificationNotificationCurrentOperationErrorDetails>();

  
  /**
   **/
  public FlowNotificationNotificationArchitectOperation id(String id) {
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
  public FlowNotificationNotificationArchitectOperation complete(Boolean complete) {
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
  public FlowNotificationNotificationArchitectOperation user(DependencyTrackingBuildNotificationNotificationUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DependencyTrackingBuildNotificationNotificationUser getUser() {
    return user;
  }
  public void setUser(DependencyTrackingBuildNotificationNotificationUser user) {
    this.user = user;
  }

  
  /**
   **/
  public FlowNotificationNotificationArchitectOperation actionName(ActionNameEnum actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionName")
  public ActionNameEnum getActionName() {
    return actionName;
  }
  public void setActionName(ActionNameEnum actionName) {
    this.actionName = actionName;
  }

  
  /**
   **/
  public FlowNotificationNotificationArchitectOperation actionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionStatus")
  public ActionStatusEnum getActionStatus() {
    return actionStatus;
  }
  public void setActionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
  }

  
  /**
   **/
  public FlowNotificationNotificationArchitectOperation errorMessage(String errorMessage) {
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
  public FlowNotificationNotificationArchitectOperation errorCode(String errorCode) {
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
  public FlowNotificationNotificationArchitectOperation errorMessageParams(PromptNotificationNotificationCurrentOperationErrorMessageParams errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessageParams")
  public PromptNotificationNotificationCurrentOperationErrorMessageParams getErrorMessageParams() {
    return errorMessageParams;
  }
  public void setErrorMessageParams(PromptNotificationNotificationCurrentOperationErrorMessageParams errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
  }

  
  /**
   **/
  public FlowNotificationNotificationArchitectOperation errorDetails(List<PromptNotificationNotificationCurrentOperationErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public List<PromptNotificationNotificationCurrentOperationErrorDetails> getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(List<PromptNotificationNotificationCurrentOperationErrorDetails> errorDetails) {
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
    FlowNotificationNotificationArchitectOperation flowNotificationNotificationArchitectOperation = (FlowNotificationNotificationArchitectOperation) o;
    return Objects.equals(this.id, flowNotificationNotificationArchitectOperation.id) &&
        Objects.equals(this.complete, flowNotificationNotificationArchitectOperation.complete) &&
        Objects.equals(this.user, flowNotificationNotificationArchitectOperation.user) &&
        Objects.equals(this.actionName, flowNotificationNotificationArchitectOperation.actionName) &&
        Objects.equals(this.actionStatus, flowNotificationNotificationArchitectOperation.actionStatus) &&
        Objects.equals(this.errorMessage, flowNotificationNotificationArchitectOperation.errorMessage) &&
        Objects.equals(this.errorCode, flowNotificationNotificationArchitectOperation.errorCode) &&
        Objects.equals(this.errorMessageParams, flowNotificationNotificationArchitectOperation.errorMessageParams) &&
        Objects.equals(this.errorDetails, flowNotificationNotificationArchitectOperation.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complete, user, actionName, actionStatus, errorMessage, errorCode, errorMessageParams, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowNotificationNotificationArchitectOperation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

