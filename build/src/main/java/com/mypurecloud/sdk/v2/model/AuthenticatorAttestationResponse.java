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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuthenticatorAttestationResponse
 */

public class AuthenticatorAttestationResponse  implements Serializable {
  
  private String clientDataJSON = null;
  private String attestationObject = null;
  private List<String> transports = null;

  public AuthenticatorAttestationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      transports = new ArrayList<String>();
    }
  }

  public AuthenticatorAttestationResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      transports = new ArrayList<String>();
    }
  }

  
  /**
   * The JSON-serialized client data passed to the authenticator (base64url-encoded).
   **/
  public AuthenticatorAttestationResponse clientDataJSON(String clientDataJSON) {
    this.clientDataJSON = clientDataJSON;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The JSON-serialized client data passed to the authenticator (base64url-encoded).")
  @JsonProperty("clientDataJSON")
  public String getClientDataJSON() {
    return clientDataJSON;
  }
  public void setClientDataJSON(String clientDataJSON) {
    this.clientDataJSON = clientDataJSON;
  }


  /**
   * The attestation object containing the credential public key and attestation statement (base64url-encoded CBOR).
   **/
  public AuthenticatorAttestationResponse attestationObject(String attestationObject) {
    this.attestationObject = attestationObject;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attestation object containing the credential public key and attestation statement (base64url-encoded CBOR).")
  @JsonProperty("attestationObject")
  public String getAttestationObject() {
    return attestationObject;
  }
  public void setAttestationObject(String attestationObject) {
    this.attestationObject = attestationObject;
  }


  /**
   * The transports the authenticator is believed to support.
   **/
  public AuthenticatorAttestationResponse transports(List<String> transports) {
    this.transports = transports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The transports the authenticator is believed to support.")
  @JsonProperty("transports")
  public List<String> getTransports() {
    return transports;
  }
  public void setTransports(List<String> transports) {
    this.transports = transports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) o;

    return Objects.equals(this.clientDataJSON, authenticatorAttestationResponse.clientDataJSON) &&
            Objects.equals(this.attestationObject, authenticatorAttestationResponse.attestationObject) &&
            Objects.equals(this.transports, authenticatorAttestationResponse.transports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDataJSON, attestationObject, transports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatorAttestationResponse {\n");
    
    sb.append("    clientDataJSON: ").append(toIndentedString(clientDataJSON)).append("\n");
    sb.append("    attestationObject: ").append(toIndentedString(attestationObject)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
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

