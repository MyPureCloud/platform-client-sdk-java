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
import com.mypurecloud.sdk.v2.model.PublicKeyCredentialCreationOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BeginWebAuthnRegistrationResponse
 */

public class BeginWebAuthnRegistrationResponse  implements Serializable {
  
  private PublicKeyCredentialCreationOptions publicKey = null;

  public BeginWebAuthnRegistrationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BeginWebAuthnRegistrationResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The public key credential creation options the client should pass to the WebAuthn API's navigator.credentials.create() call.
   **/
  public BeginWebAuthnRegistrationResponse publicKey(PublicKeyCredentialCreationOptions publicKey) {
    this.publicKey = publicKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The public key credential creation options the client should pass to the WebAuthn API's navigator.credentials.create() call.")
  @JsonProperty("publicKey")
  public PublicKeyCredentialCreationOptions getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(PublicKeyCredentialCreationOptions publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeginWebAuthnRegistrationResponse beginWebAuthnRegistrationResponse = (BeginWebAuthnRegistrationResponse) o;

    return Objects.equals(this.publicKey, beginWebAuthnRegistrationResponse.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeginWebAuthnRegistrationResponse {\n");
    
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

