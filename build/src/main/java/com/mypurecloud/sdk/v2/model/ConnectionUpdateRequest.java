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
 * ConnectionUpdateRequest
 */

public class ConnectionUpdateRequest  implements Serializable {
  
  private String code = null;
  private String error = null;
  private String errorDescription = null;

  public ConnectionUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ConnectionUpdateRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Unique code that allows to be connected
   **/
  public ConnectionUpdateRequest code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique code that allows to be connected")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Name of the received error
   **/
  public ConnectionUpdateRequest error(String error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the received error")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }


  /**
   * Detailed description of the error
   **/
  public ConnectionUpdateRequest errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed description of the error")
  @JsonProperty("errorDescription")
  public String getErrorDescription() {
    return errorDescription;
  }
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionUpdateRequest connectionUpdateRequest = (ConnectionUpdateRequest) o;

    return Objects.equals(this.code, connectionUpdateRequest.code) &&
            Objects.equals(this.error, connectionUpdateRequest.error) &&
            Objects.equals(this.errorDescription, connectionUpdateRequest.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionUpdateRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

