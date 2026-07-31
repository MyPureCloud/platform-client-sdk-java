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
 * ValidateVerifierRequest
 */

public class ValidateVerifierRequest  implements Serializable {
  
  private Boolean enable = null;
  private String token = null;

  public ValidateVerifierRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ValidateVerifierRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether to enable the verifier upon successful validation.
   **/
  public ValidateVerifierRequest enable(Boolean enable) {
    this.enable = enable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enable the verifier upon successful validation.")
  @JsonProperty("enable")
  public Boolean getEnable() {
    return enable;
  }
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  /**
   * The verification token to validate against the verifier.
   **/
  public ValidateVerifierRequest token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The verification token to validate against the verifier.")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateVerifierRequest validateVerifierRequest = (ValidateVerifierRequest) o;

    return Objects.equals(this.enable, validateVerifierRequest.enable) &&
            Objects.equals(this.token, validateVerifierRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateVerifierRequest {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

