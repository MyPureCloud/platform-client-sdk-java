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
import com.mypurecloud.sdk.v2.model.ExternalEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UnprocessedExternalEvent
 */

public class UnprocessedExternalEvent  implements Serializable {
  
  private ExternalEvent event = null;
  private Integer originalRequestIndex = null;
  private Boolean isRetryable = null;
  private String errorMessage = null;
  private Integer statusCode = null;

  public UnprocessedExternalEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UnprocessedExternalEvent(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The event that failed processing.
   **/
  public UnprocessedExternalEvent event(ExternalEvent event) {
    this.event = event;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The event that failed processing.")
  @JsonProperty("event")
  public ExternalEvent getEvent() {
    return event;
  }
  public void setEvent(ExternalEvent event) {
    this.event = event;
  }


  /**
   * The index of the event in the original request.
   **/
  public UnprocessedExternalEvent originalRequestIndex(Integer originalRequestIndex) {
    this.originalRequestIndex = originalRequestIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The index of the event in the original request.")
  @JsonProperty("originalRequestIndex")
  public Integer getOriginalRequestIndex() {
    return originalRequestIndex;
  }
  public void setOriginalRequestIndex(Integer originalRequestIndex) {
    this.originalRequestIndex = originalRequestIndex;
  }


  /**
   * Whether the error is retryable.
   **/
  public UnprocessedExternalEvent isRetryable(Boolean isRetryable) {
    this.isRetryable = isRetryable;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the error is retryable.")
  @JsonProperty("isRetryable")
  public Boolean getIsRetryable() {
    return isRetryable;
  }
  public void setIsRetryable(Boolean isRetryable) {
    this.isRetryable = isRetryable;
  }


  /**
   * The error message.
   **/
  public UnprocessedExternalEvent errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The error message.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * The HTTP status code associated with the error.
   **/
  public UnprocessedExternalEvent statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The HTTP status code associated with the error.")
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnprocessedExternalEvent unprocessedExternalEvent = (UnprocessedExternalEvent) o;

    return Objects.equals(this.event, unprocessedExternalEvent.event) &&
            Objects.equals(this.originalRequestIndex, unprocessedExternalEvent.originalRequestIndex) &&
            Objects.equals(this.isRetryable, unprocessedExternalEvent.isRetryable) &&
            Objects.equals(this.errorMessage, unprocessedExternalEvent.errorMessage) &&
            Objects.equals(this.statusCode, unprocessedExternalEvent.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, originalRequestIndex, isRetryable, errorMessage, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnprocessedExternalEvent {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    originalRequestIndex: ").append(toIndentedString(originalRequestIndex)).append("\n");
    sb.append("    isRetryable: ").append(toIndentedString(isRetryable)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

