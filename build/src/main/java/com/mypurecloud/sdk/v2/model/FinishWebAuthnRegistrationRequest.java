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
import com.mypurecloud.sdk.v2.model.PublicKeyCredentialCreationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FinishWebAuthnRegistrationRequest
 */

public class FinishWebAuthnRegistrationRequest  implements Serializable {
  
  private PublicKeyCredentialCreationResponse credential = null;
  private String name = null;
  private Boolean _default = null;

  public FinishWebAuthnRegistrationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public FinishWebAuthnRegistrationRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The credential creation response returned by the authenticator (i.e., the result of navigator.credentials.create()).
   **/
  public FinishWebAuthnRegistrationRequest credential(PublicKeyCredentialCreationResponse credential) {
    this.credential = credential;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The credential creation response returned by the authenticator (i.e., the result of navigator.credentials.create()).")
  @JsonProperty("credential")
  public PublicKeyCredentialCreationResponse getCredential() {
    return credential;
  }
  public void setCredential(PublicKeyCredentialCreationResponse credential) {
    this.credential = credential;
  }


  /**
   * The user-facing name for this verifier.
   **/
  public FinishWebAuthnRegistrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user-facing name for this verifier.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Indicates whether this should be set as the user's default verifier.
   **/
  public FinishWebAuthnRegistrationRequest _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this should be set as the user's default verifier.")
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest = (FinishWebAuthnRegistrationRequest) o;

    return Objects.equals(this.credential, finishWebAuthnRegistrationRequest.credential) &&
            Objects.equals(this.name, finishWebAuthnRegistrationRequest.name) &&
            Objects.equals(this._default, finishWebAuthnRegistrationRequest._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, name, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishWebAuthnRegistrationRequest {\n");
    
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

