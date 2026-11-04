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
import com.mypurecloud.sdk.v2.model.Verifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DeleteVerifierResponse
 */

public class DeleteVerifierResponse  implements Serializable {
  
  private Verifier defaultVerifier = null;

  public DeleteVerifierResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DeleteVerifierResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The verifier that is now the default, or null if no default verifier remains.
   **/
  public DeleteVerifierResponse defaultVerifier(Verifier defaultVerifier) {
    this.defaultVerifier = defaultVerifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The verifier that is now the default, or null if no default verifier remains.")
  @JsonProperty("defaultVerifier")
  public Verifier getDefaultVerifier() {
    return defaultVerifier;
  }
  public void setDefaultVerifier(Verifier defaultVerifier) {
    this.defaultVerifier = defaultVerifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteVerifierResponse deleteVerifierResponse = (DeleteVerifierResponse) o;

    return Objects.equals(this.defaultVerifier, deleteVerifierResponse.defaultVerifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultVerifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteVerifierResponse {\n");
    
    sb.append("    defaultVerifier: ").append(toIndentedString(defaultVerifier)).append("\n");
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

