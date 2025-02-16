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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ValidationErrorResponse
 */

public class ValidationErrorResponse  implements Serializable {
  
  private String message = null;
  private String errorType = null;
  private Map<String, String> arguments = null;

  
  /**
   * Message string of the validation error.
   **/
  public ValidationErrorResponse message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message string of the validation error.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Type of validation errror.
   **/
  public ValidationErrorResponse errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of validation errror.")
  @JsonProperty("errorType")
  public String getErrorType() {
    return errorType;
  }
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  /**
   * Map of argument names to corresponding values. Used for localization.
   **/
  public ValidationErrorResponse arguments(Map<String, String> arguments) {
    this.arguments = arguments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of argument names to corresponding values. Used for localization.")
  @JsonProperty("arguments")
  public Map<String, String> getArguments() {
    return arguments;
  }
  public void setArguments(Map<String, String> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorResponse validationErrorResponse = (ValidationErrorResponse) o;

    return Objects.equals(this.message, validationErrorResponse.message) &&
            Objects.equals(this.errorType, validationErrorResponse.errorType) &&
            Objects.equals(this.arguments, validationErrorResponse.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errorType, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

