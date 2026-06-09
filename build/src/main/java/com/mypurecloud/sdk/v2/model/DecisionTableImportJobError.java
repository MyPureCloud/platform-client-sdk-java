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
import com.mypurecloud.sdk.v2.model.DecisionTableJobValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Error details when a decision table import job fails
 */
@ApiModel(description = "Error details when a decision table import job fails")

public class DecisionTableImportJobError  implements Serializable {
  
  private String errorCode = null;
  private String errorMessage = null;
  private String messageWithParams = null;
  private Map<String, String> messageParams = null;
  private List<DecisionTableJobValidationError> validationErrors = null;

  public DecisionTableImportJobError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      validationErrors = new ArrayList<DecisionTableJobValidationError>();
    }
  }

  public DecisionTableImportJobError(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      validationErrors = new ArrayList<DecisionTableJobValidationError>();
    }
  }

  
  /**
   * The error code for this job failure.
   **/
  public DecisionTableImportJobError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error code for this job failure.")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * A human-readable error message.
   **/
  public DecisionTableImportJobError errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human-readable error message.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * Parameterized message template for the aggregate failure (when applicable)
   **/
  public DecisionTableImportJobError messageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameterized message template for the aggregate failure (when applicable)")
  @JsonProperty("messageWithParams")
  public String getMessageWithParams() {
    return messageWithParams;
  }
  public void setMessageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
  }


  /**
   * Parameters for messageWithParams
   **/
  public DecisionTableImportJobError messageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters for messageWithParams")
  @JsonProperty("messageParams")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }


  /**
   * Validation failures for individual rows or the file structure
   **/
  public DecisionTableImportJobError validationErrors(List<DecisionTableJobValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Validation failures for individual rows or the file structure")
  @JsonProperty("validationErrors")
  public List<DecisionTableJobValidationError> getValidationErrors() {
    return validationErrors;
  }
  public void setValidationErrors(List<DecisionTableJobValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableImportJobError decisionTableImportJobError = (DecisionTableImportJobError) o;

    return Objects.equals(this.errorCode, decisionTableImportJobError.errorCode) &&
            Objects.equals(this.errorMessage, decisionTableImportJobError.errorMessage) &&
            Objects.equals(this.messageWithParams, decisionTableImportJobError.messageWithParams) &&
            Objects.equals(this.messageParams, decisionTableImportJobError.messageParams) &&
            Objects.equals(this.validationErrors, decisionTableImportJobError.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, messageWithParams, messageParams, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableImportJobError {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

