package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserRoutingStatusNotificationErrorInfoUserParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserRoutingStatusNotificationErrorInfo
 */

public class UserRoutingStatusNotificationErrorInfo  implements Serializable {
  
  private String errorCode = null;
  private Integer status = null;
  private String correlationId = null;
  private String userMessage = null;
  private String userParamsMessage = null;
  private List<UserRoutingStatusNotificationErrorInfoUserParams> userParams = new ArrayList<UserRoutingStatusNotificationErrorInfoUserParams>();

  
  /**
   **/
  public UserRoutingStatusNotificationErrorInfo errorCode(String errorCode) {
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
  public UserRoutingStatusNotificationErrorInfo status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  public UserRoutingStatusNotificationErrorInfo correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  
  /**
   **/
  public UserRoutingStatusNotificationErrorInfo userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userMessage")
  public String getUserMessage() {
    return userMessage;
  }
  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  
  /**
   **/
  public UserRoutingStatusNotificationErrorInfo userParamsMessage(String userParamsMessage) {
    this.userParamsMessage = userParamsMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userParamsMessage")
  public String getUserParamsMessage() {
    return userParamsMessage;
  }
  public void setUserParamsMessage(String userParamsMessage) {
    this.userParamsMessage = userParamsMessage;
  }

  
  /**
   **/
  public UserRoutingStatusNotificationErrorInfo userParams(List<UserRoutingStatusNotificationErrorInfoUserParams> userParams) {
    this.userParams = userParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userParams")
  public List<UserRoutingStatusNotificationErrorInfoUserParams> getUserParams() {
    return userParams;
  }
  public void setUserParams(List<UserRoutingStatusNotificationErrorInfoUserParams> userParams) {
    this.userParams = userParams;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoutingStatusNotificationErrorInfo userRoutingStatusNotificationErrorInfo = (UserRoutingStatusNotificationErrorInfo) o;
    return Objects.equals(this.errorCode, userRoutingStatusNotificationErrorInfo.errorCode) &&
        Objects.equals(this.status, userRoutingStatusNotificationErrorInfo.status) &&
        Objects.equals(this.correlationId, userRoutingStatusNotificationErrorInfo.correlationId) &&
        Objects.equals(this.userMessage, userRoutingStatusNotificationErrorInfo.userMessage) &&
        Objects.equals(this.userParamsMessage, userRoutingStatusNotificationErrorInfo.userParamsMessage) &&
        Objects.equals(this.userParams, userRoutingStatusNotificationErrorInfo.userParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, status, correlationId, userMessage, userParamsMessage, userParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoutingStatusNotificationErrorInfo {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    userParamsMessage: ").append(toIndentedString(userParamsMessage)).append("\n");
    sb.append("    userParams: ").append(toIndentedString(userParams)).append("\n");
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

