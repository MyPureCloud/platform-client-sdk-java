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
 * AuthenticatorSelection
 */

public class AuthenticatorSelection  implements Serializable {
  
  private String authenticatorAttachment = null;
  private Boolean requireResidentKey = null;
  private String residentKey = null;
  private String userVerification = null;

  public AuthenticatorSelection() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AuthenticatorSelection(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Desired authenticator attachment modality ('platform' or 'cross-platform').
   **/
  public AuthenticatorSelection authenticatorAttachment(String authenticatorAttachment) {
    this.authenticatorAttachment = authenticatorAttachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Desired authenticator attachment modality ('platform' or 'cross-platform').")
  @JsonProperty("authenticatorAttachment")
  public String getAuthenticatorAttachment() {
    return authenticatorAttachment;
  }
  public void setAuthenticatorAttachment(String authenticatorAttachment) {
    this.authenticatorAttachment = authenticatorAttachment;
  }


  /**
   * Whether a resident (discoverable) credential is required. Deprecated by the WebAuthn spec in favor of residentKey.
   **/
  public AuthenticatorSelection requireResidentKey(Boolean requireResidentKey) {
    this.requireResidentKey = requireResidentKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether a resident (discoverable) credential is required. Deprecated by the WebAuthn spec in favor of residentKey.")
  @JsonProperty("requireResidentKey")
  public Boolean getRequireResidentKey() {
    return requireResidentKey;
  }
  public void setRequireResidentKey(Boolean requireResidentKey) {
    this.requireResidentKey = requireResidentKey;
  }


  /**
   * The relying party's requirement for resident (discoverable) credentials ('discouraged', 'preferred', or 'required').
   **/
  public AuthenticatorSelection residentKey(String residentKey) {
    this.residentKey = residentKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The relying party's requirement for resident (discoverable) credentials ('discouraged', 'preferred', or 'required').")
  @JsonProperty("residentKey")
  public String getResidentKey() {
    return residentKey;
  }
  public void setResidentKey(String residentKey) {
    this.residentKey = residentKey;
  }


  /**
   * The user verification requirement ('discouraged', 'preferred', or 'required').
   **/
  public AuthenticatorSelection userVerification(String userVerification) {
    this.userVerification = userVerification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user verification requirement ('discouraged', 'preferred', or 'required').")
  @JsonProperty("userVerification")
  public String getUserVerification() {
    return userVerification;
  }
  public void setUserVerification(String userVerification) {
    this.userVerification = userVerification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatorSelection authenticatorSelection = (AuthenticatorSelection) o;

    return Objects.equals(this.authenticatorAttachment, authenticatorSelection.authenticatorAttachment) &&
            Objects.equals(this.requireResidentKey, authenticatorSelection.requireResidentKey) &&
            Objects.equals(this.residentKey, authenticatorSelection.residentKey) &&
            Objects.equals(this.userVerification, authenticatorSelection.userVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatorAttachment, requireResidentKey, residentKey, userVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatorSelection {\n");
    
    sb.append("    authenticatorAttachment: ").append(toIndentedString(authenticatorAttachment)).append("\n");
    sb.append("    requireResidentKey: ").append(toIndentedString(requireResidentKey)).append("\n");
    sb.append("    residentKey: ").append(toIndentedString(residentKey)).append("\n");
    sb.append("    userVerification: ").append(toIndentedString(userVerification)).append("\n");
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

