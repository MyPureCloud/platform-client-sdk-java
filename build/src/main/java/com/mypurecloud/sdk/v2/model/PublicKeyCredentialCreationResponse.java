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
import com.mypurecloud.sdk.v2.model.AuthenticatorAttestationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PublicKeyCredentialCreationResponse
 */

public class PublicKeyCredentialCreationResponse  implements Serializable {
  
  private String id = null;
  private String type = null;
  private String rawId = null;
  private String authenticatorAttachment = null;
  private Map<String, Object> clientExtensionResults = null;
  private AuthenticatorAttestationResponse response = null;

  public PublicKeyCredentialCreationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public PublicKeyCredentialCreationResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The credential identifier (base64url-encoded).
   **/
  public PublicKeyCredentialCreationResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The credential identifier (base64url-encoded).")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The credential type (must be 'public-key').
   **/
  public PublicKeyCredentialCreationResponse type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The credential type (must be 'public-key').")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * The raw credential identifier as a binary value (base64url-encoded).
   **/
  public PublicKeyCredentialCreationResponse rawId(String rawId) {
    this.rawId = rawId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The raw credential identifier as a binary value (base64url-encoded).")
  @JsonProperty("rawId")
  public String getRawId() {
    return rawId;
  }
  public void setRawId(String rawId) {
    this.rawId = rawId;
  }


  /**
   * The authenticator attachment modality used ('platform' or 'cross-platform').
   **/
  public PublicKeyCredentialCreationResponse authenticatorAttachment(String authenticatorAttachment) {
    this.authenticatorAttachment = authenticatorAttachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The authenticator attachment modality used ('platform' or 'cross-platform').")
  @JsonProperty("authenticatorAttachment")
  public String getAuthenticatorAttachment() {
    return authenticatorAttachment;
  }
  public void setAuthenticatorAttachment(String authenticatorAttachment) {
    this.authenticatorAttachment = authenticatorAttachment;
  }


  /**
   * Outputs from client-side WebAuthn extensions.
   **/
  public PublicKeyCredentialCreationResponse clientExtensionResults(Map<String, Object> clientExtensionResults) {
    this.clientExtensionResults = clientExtensionResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Outputs from client-side WebAuthn extensions.")
  @JsonProperty("clientExtensionResults")
  public Map<String, Object> getClientExtensionResults() {
    return clientExtensionResults;
  }
  public void setClientExtensionResults(Map<String, Object> clientExtensionResults) {
    this.clientExtensionResults = clientExtensionResults;
  }


  /**
   * The authenticator's attestation response.
   **/
  public PublicKeyCredentialCreationResponse response(AuthenticatorAttestationResponse response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The authenticator's attestation response.")
  @JsonProperty("response")
  public AuthenticatorAttestationResponse getResponse() {
    return response;
  }
  public void setResponse(AuthenticatorAttestationResponse response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKeyCredentialCreationResponse publicKeyCredentialCreationResponse = (PublicKeyCredentialCreationResponse) o;

    return Objects.equals(this.id, publicKeyCredentialCreationResponse.id) &&
            Objects.equals(this.type, publicKeyCredentialCreationResponse.type) &&
            Objects.equals(this.rawId, publicKeyCredentialCreationResponse.rawId) &&
            Objects.equals(this.authenticatorAttachment, publicKeyCredentialCreationResponse.authenticatorAttachment) &&
            Objects.equals(this.clientExtensionResults, publicKeyCredentialCreationResponse.clientExtensionResults) &&
            Objects.equals(this.response, publicKeyCredentialCreationResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, rawId, authenticatorAttachment, clientExtensionResults, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKeyCredentialCreationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rawId: ").append(toIndentedString(rawId)).append("\n");
    sb.append("    authenticatorAttachment: ").append(toIndentedString(authenticatorAttachment)).append("\n");
    sb.append("    clientExtensionResults: ").append(toIndentedString(clientExtensionResults)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

