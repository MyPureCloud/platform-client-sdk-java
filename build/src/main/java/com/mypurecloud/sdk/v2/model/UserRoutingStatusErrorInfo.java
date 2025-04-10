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
import com.mypurecloud.sdk.v2.model.UserRoutingStatusUserParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Error information that the Public API will receive in a response body. This allows backend services to pass an error message to consumers of the Public API.
 */
@ApiModel(description = "Error information that the Public API will receive in a response body. This allows backend services to pass an error message to consumers of the Public API.")

public class UserRoutingStatusErrorInfo  implements Serializable {
  
  private String errorCode = null;
  private Long status = null;
  private String correlationId = null;
  private String userMessage = null;
  private String userParamsMessage = null;
  private List<UserRoutingStatusUserParam> userParams = null;

  public UserRoutingStatusErrorInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userParams = new ArrayList<UserRoutingStatusUserParam>();
    }
  }

  
  /**
   * A code unique to this error. Typically prefixed with the service that originated the error. For example CONFIG_USER_NOT_FOUND
   **/
  public UserRoutingStatusErrorInfo errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A code unique to this error. Typically prefixed with the service that originated the error. For example CONFIG_USER_NOT_FOUND")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * The HTTP status code for this message. If left blank the status code from the HTTP response is used.
   **/
  public UserRoutingStatusErrorInfo status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The HTTP status code for this message. If left blank the status code from the HTTP response is used.")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }


  /**
   * The correlation Id or context Id for this message. If left blank the Public API will look at the HTTP response header 'ININ-Correlation-Id' instead.
   **/
  public UserRoutingStatusErrorInfo correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The correlation Id or context Id for this message. If left blank the Public API will look at the HTTP response header 'ININ-Correlation-Id' instead.")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  /**
   * A customer friendly message. This should be a complete sentence, use proper grammar and only include information useful to a customer. This is not a dev message and should not include things like Org Id
   **/
  public UserRoutingStatusErrorInfo userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A customer friendly message. This should be a complete sentence, use proper grammar and only include information useful to a customer. This is not a dev message and should not include things like Org Id")
  @JsonProperty("userMessage")
  public String getUserMessage() {
    return userMessage;
  }
  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }


  /**
   * This is the same as userMessage except it uses template fields for variable replacement. For instance: 'User {username} was not found'
   **/
  public UserRoutingStatusErrorInfo userParamsMessage(String userParamsMessage) {
    this.userParamsMessage = userParamsMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the same as userMessage except it uses template fields for variable replacement. For instance: 'User {username} was not found'")
  @JsonProperty("userParamsMessage")
  public String getUserParamsMessage() {
    return userParamsMessage;
  }
  public void setUserParamsMessage(String userParamsMessage) {
    this.userParamsMessage = userParamsMessage;
  }


  /**
   * Used in conjunction with userParamsMessage. These are the template parameters. For instance: UserParam.key = 'username', UserParam.value = 'chuck.pulfer'
   **/
  public UserRoutingStatusErrorInfo userParams(List<UserRoutingStatusUserParam> userParams) {
    this.userParams = userParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Used in conjunction with userParamsMessage. These are the template parameters. For instance: UserParam.key = 'username', UserParam.value = 'chuck.pulfer'")
  @JsonProperty("userParams")
  public List<UserRoutingStatusUserParam> getUserParams() {
    return userParams;
  }
  public void setUserParams(List<UserRoutingStatusUserParam> userParams) {
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
    UserRoutingStatusErrorInfo userRoutingStatusErrorInfo = (UserRoutingStatusErrorInfo) o;

    return Objects.equals(this.errorCode, userRoutingStatusErrorInfo.errorCode) &&
            Objects.equals(this.status, userRoutingStatusErrorInfo.status) &&
            Objects.equals(this.correlationId, userRoutingStatusErrorInfo.correlationId) &&
            Objects.equals(this.userMessage, userRoutingStatusErrorInfo.userMessage) &&
            Objects.equals(this.userParamsMessage, userRoutingStatusErrorInfo.userParamsMessage) &&
            Objects.equals(this.userParams, userRoutingStatusErrorInfo.userParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, status, correlationId, userMessage, userParamsMessage, userParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoutingStatusErrorInfo {\n");
    
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

