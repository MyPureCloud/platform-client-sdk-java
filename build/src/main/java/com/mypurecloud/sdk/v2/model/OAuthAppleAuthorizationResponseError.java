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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OAuthAppleAuthorizationResponseError
 */

public class OAuthAppleAuthorizationResponseError  implements Serializable {
  
  private String code = null;
  private String message = null;
  private Object details = null;

  public OAuthAppleAuthorizationResponseError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The error code
   **/
  public OAuthAppleAuthorizationResponseError code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The error code")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * The error message
   **/
  public OAuthAppleAuthorizationResponseError message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The error message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * The error details
   **/
  public OAuthAppleAuthorizationResponseError details(Object details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error details")
  @JsonProperty("details")
  public Object getDetails() {
    return details;
  }
  public void setDetails(Object details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthAppleAuthorizationResponseError oAuthAppleAuthorizationResponseError = (OAuthAppleAuthorizationResponseError) o;

    return Objects.equals(this.code, oAuthAppleAuthorizationResponseError.code) &&
            Objects.equals(this.message, oAuthAppleAuthorizationResponseError.message) &&
            Objects.equals(this.details, oAuthAppleAuthorizationResponseError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthAppleAuthorizationResponseError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

