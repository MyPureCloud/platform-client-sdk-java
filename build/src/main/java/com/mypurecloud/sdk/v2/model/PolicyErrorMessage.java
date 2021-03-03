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
import com.mypurecloud.sdk.v2.model.UserParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PolicyErrorMessage
 */

public class PolicyErrorMessage  implements Serializable {
  
  private Integer statusCode = null;
  private Object userMessage = null;
  private String userParamsMessage = null;
  private String errorCode = null;
  private String correlationId = null;
  private List<UserParam> userParams = new ArrayList<UserParam>();
  private Date insertDate = null;

  
  /**
   **/
  public PolicyErrorMessage statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  
  /**
   **/
  public PolicyErrorMessage userMessage(Object userMessage) {
    this.userMessage = userMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userMessage")
  public Object getUserMessage() {
    return userMessage;
  }
  public void setUserMessage(Object userMessage) {
    this.userMessage = userMessage;
  }

  
  /**
   **/
  public PolicyErrorMessage userParamsMessage(String userParamsMessage) {
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
  public PolicyErrorMessage errorCode(String errorCode) {
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
  public PolicyErrorMessage correlationId(String correlationId) {
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
  public PolicyErrorMessage userParams(List<UserParam> userParams) {
    this.userParams = userParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userParams")
  public List<UserParam> getUserParams() {
    return userParams;
  }
  public void setUserParams(List<UserParam> userParams) {
    this.userParams = userParams;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PolicyErrorMessage insertDate(Date insertDate) {
    this.insertDate = insertDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("insertDate")
  public Date getInsertDate() {
    return insertDate;
  }
  public void setInsertDate(Date insertDate) {
    this.insertDate = insertDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyErrorMessage policyErrorMessage = (PolicyErrorMessage) o;
    return Objects.equals(this.statusCode, policyErrorMessage.statusCode) &&
        Objects.equals(this.userMessage, policyErrorMessage.userMessage) &&
        Objects.equals(this.userParamsMessage, policyErrorMessage.userParamsMessage) &&
        Objects.equals(this.errorCode, policyErrorMessage.errorCode) &&
        Objects.equals(this.correlationId, policyErrorMessage.correlationId) &&
        Objects.equals(this.userParams, policyErrorMessage.userParams) &&
        Objects.equals(this.insertDate, policyErrorMessage.insertDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, userMessage, userParamsMessage, errorCode, correlationId, userParams, insertDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyErrorMessage {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    userParamsMessage: ").append(toIndentedString(userParamsMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    userParams: ").append(toIndentedString(userParams)).append("\n");
    sb.append("    insertDate: ").append(toIndentedString(insertDate)).append("\n");
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

