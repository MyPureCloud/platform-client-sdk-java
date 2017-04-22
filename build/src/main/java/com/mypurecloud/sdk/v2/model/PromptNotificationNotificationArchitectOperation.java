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
 * PromptNotificationNotificationArchitectOperation
 */

public class PromptNotificationNotificationArchitectOperation  implements Serializable {
  
  private String id = null;
  private Boolean complete = null;
  private DependencyTrackingBuildNotificationNotificationUser user = null;

  /**
   * Gets or Sets actionName
   */
  public enum ActionNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CHECKIN("CHECKIN"),
    DEBUG("DEBUG"),
    DELETE("DELETE"),
    PUBLISH("PUBLISH"),
    STATE_CHANGE("STATE_CHANGE"),
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
  public PromptNotificationNotificationArchitectOperation id(String id) {
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
  public PromptNotificationNotificationArchitectOperation complete(Boolean complete) {
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
  public PromptNotificationNotificationArchitectOperation user(DependencyTrackingBuildNotificationNotificationUser user) {
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
  public PromptNotificationNotificationArchitectOperation actionName(ActionNameEnum actionName) {
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
  public PromptNotificationNotificationArchitectOperation actionStatus(ActionStatusEnum actionStatus) {
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
  public PromptNotificationNotificationArchitectOperation errorMessage(String errorMessage) {
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
  public PromptNotificationNotificationArchitectOperation errorCode(String errorCode) {
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
  public PromptNotificationNotificationArchitectOperation errorMessageParams(PromptNotificationNotificationCurrentOperationErrorMessageParams errorMessageParams) {
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
  public PromptNotificationNotificationArchitectOperation errorDetails(List<PromptNotificationNotificationCurrentOperationErrorDetails> errorDetails) {
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
    PromptNotificationNotificationArchitectOperation promptNotificationNotificationArchitectOperation = (PromptNotificationNotificationArchitectOperation) o;
    return Objects.equals(this.id, promptNotificationNotificationArchitectOperation.id) &&
        Objects.equals(this.complete, promptNotificationNotificationArchitectOperation.complete) &&
        Objects.equals(this.user, promptNotificationNotificationArchitectOperation.user) &&
        Objects.equals(this.actionName, promptNotificationNotificationArchitectOperation.actionName) &&
        Objects.equals(this.actionStatus, promptNotificationNotificationArchitectOperation.actionStatus) &&
        Objects.equals(this.errorMessage, promptNotificationNotificationArchitectOperation.errorMessage) &&
        Objects.equals(this.errorCode, promptNotificationNotificationArchitectOperation.errorCode) &&
        Objects.equals(this.errorMessageParams, promptNotificationNotificationArchitectOperation.errorMessageParams) &&
        Objects.equals(this.errorDetails, promptNotificationNotificationArchitectOperation.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complete, user, actionName, actionStatus, errorMessage, errorCode, errorMessageParams, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptNotificationNotificationArchitectOperation {\n");
    
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

