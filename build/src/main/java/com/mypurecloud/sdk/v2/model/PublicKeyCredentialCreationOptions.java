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
import com.mypurecloud.sdk.v2.model.AuthenticatorSelection;
import com.mypurecloud.sdk.v2.model.CredentialDescriptor;
import com.mypurecloud.sdk.v2.model.CredentialParameter;
import com.mypurecloud.sdk.v2.model.RelyingPartyEntity;
import com.mypurecloud.sdk.v2.model.UserEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PublicKeyCredentialCreationOptions
 */

public class PublicKeyCredentialCreationOptions  implements Serializable {
  
  private String challenge = null;
  private RelyingPartyEntity rp = null;
  private UserEntity user = null;
  private List<CredentialParameter> pubKeyCredParams = null;
  private Integer timeout = null;
  private List<CredentialDescriptor> excludeCredentials = null;
  private AuthenticatorSelection authenticatorSelection = null;
  private List<String> hints = null;
  private String attestation = null;
  private List<String> attestationFormats = null;
  private Map<String, Object> extensions = null;

  public PublicKeyCredentialCreationOptions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      pubKeyCredParams = new ArrayList<CredentialParameter>();
      excludeCredentials = new ArrayList<CredentialDescriptor>();
      hints = new ArrayList<String>();
      attestationFormats = new ArrayList<String>();
    }
  }

  public PublicKeyCredentialCreationOptions(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      pubKeyCredParams = new ArrayList<CredentialParameter>();
      excludeCredentials = new ArrayList<CredentialDescriptor>();
      hints = new ArrayList<String>();
      attestationFormats = new ArrayList<String>();
    }
  }

  
  /**
   * Cryptographic challenge from the relying party (base64url-encoded). Must be returned to the relying party in the authenticator's response.
   **/
  public PublicKeyCredentialCreationOptions challenge(String challenge) {
    this.challenge = challenge;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Cryptographic challenge from the relying party (base64url-encoded). Must be returned to the relying party in the authenticator's response.")
  @JsonProperty("challenge")
  public String getChallenge() {
    return challenge;
  }
  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  /**
   * Information about the relying party.
   **/
  public PublicKeyCredentialCreationOptions rp(RelyingPartyEntity rp) {
    this.rp = rp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the relying party.")
  @JsonProperty("rp")
  public RelyingPartyEntity getRp() {
    return rp;
  }
  public void setRp(RelyingPartyEntity rp) {
    this.rp = rp;
  }


  /**
   * Information about the user being registered.
   **/
  public PublicKeyCredentialCreationOptions user(UserEntity user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the user being registered.")
  @JsonProperty("user")
  public UserEntity getUser() {
    return user;
  }
  public void setUser(UserEntity user) {
    this.user = user;
  }


  /**
   * Public key credential parameters acceptable to the relying party, in order of preference.
   **/
  public PublicKeyCredentialCreationOptions pubKeyCredParams(List<CredentialParameter> pubKeyCredParams) {
    this.pubKeyCredParams = pubKeyCredParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Public key credential parameters acceptable to the relying party, in order of preference.")
  @JsonProperty("pubKeyCredParams")
  public List<CredentialParameter> getPubKeyCredParams() {
    return pubKeyCredParams;
  }
  public void setPubKeyCredParams(List<CredentialParameter> pubKeyCredParams) {
    this.pubKeyCredParams = pubKeyCredParams;
  }


  /**
   * Time in milliseconds the relying party is willing to wait for the registration operation to complete.
   **/
  public PublicKeyCredentialCreationOptions timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time in milliseconds the relying party is willing to wait for the registration operation to complete.")
  @JsonProperty("timeout")
  public Integer getTimeout() {
    return timeout;
  }
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  /**
   * Credentials that should be excluded from registration (e.g., to prevent re-registering an existing authenticator).
   **/
  public PublicKeyCredentialCreationOptions excludeCredentials(List<CredentialDescriptor> excludeCredentials) {
    this.excludeCredentials = excludeCredentials;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Credentials that should be excluded from registration (e.g., to prevent re-registering an existing authenticator).")
  @JsonProperty("excludeCredentials")
  public List<CredentialDescriptor> getExcludeCredentials() {
    return excludeCredentials;
  }
  public void setExcludeCredentials(List<CredentialDescriptor> excludeCredentials) {
    this.excludeCredentials = excludeCredentials;
  }


  /**
   * Constraints on the type of authenticator that can be used.
   **/
  public PublicKeyCredentialCreationOptions authenticatorSelection(AuthenticatorSelection authenticatorSelection) {
    this.authenticatorSelection = authenticatorSelection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Constraints on the type of authenticator that can be used.")
  @JsonProperty("authenticatorSelection")
  public AuthenticatorSelection getAuthenticatorSelection() {
    return authenticatorSelection;
  }
  public void setAuthenticatorSelection(AuthenticatorSelection authenticatorSelection) {
    this.authenticatorSelection = authenticatorSelection;
  }


  /**
   * Hints about the type of authenticator the user should use (e.g., 'security-key', 'client-device', 'hybrid').
   **/
  public PublicKeyCredentialCreationOptions hints(List<String> hints) {
    this.hints = hints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hints about the type of authenticator the user should use (e.g., 'security-key', 'client-device', 'hybrid').")
  @JsonProperty("hints")
  public List<String> getHints() {
    return hints;
  }
  public void setHints(List<String> hints) {
    this.hints = hints;
  }


  /**
   * The relying party's attestation conveyance preference ('none', 'indirect', 'direct', or 'enterprise').
   **/
  public PublicKeyCredentialCreationOptions attestation(String attestation) {
    this.attestation = attestation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The relying party's attestation conveyance preference ('none', 'indirect', 'direct', or 'enterprise').")
  @JsonProperty("attestation")
  public String getAttestation() {
    return attestation;
  }
  public void setAttestation(String attestation) {
    this.attestation = attestation;
  }


  /**
   * Acceptable attestation statement formats, in order of preference.
   **/
  public PublicKeyCredentialCreationOptions attestationFormats(List<String> attestationFormats) {
    this.attestationFormats = attestationFormats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Acceptable attestation statement formats, in order of preference.")
  @JsonProperty("attestationFormats")
  public List<String> getAttestationFormats() {
    return attestationFormats;
  }
  public void setAttestationFormats(List<String> attestationFormats) {
    this.attestationFormats = attestationFormats;
  }


  /**
   * Inputs to client-side WebAuthn extensions.
   **/
  public PublicKeyCredentialCreationOptions extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inputs to client-side WebAuthn extensions.")
  @JsonProperty("extensions")
  public Map<String, Object> getExtensions() {
    return extensions;
  }
  public void setExtensions(Map<String, Object> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) o;

    return Objects.equals(this.challenge, publicKeyCredentialCreationOptions.challenge) &&
            Objects.equals(this.rp, publicKeyCredentialCreationOptions.rp) &&
            Objects.equals(this.user, publicKeyCredentialCreationOptions.user) &&
            Objects.equals(this.pubKeyCredParams, publicKeyCredentialCreationOptions.pubKeyCredParams) &&
            Objects.equals(this.timeout, publicKeyCredentialCreationOptions.timeout) &&
            Objects.equals(this.excludeCredentials, publicKeyCredentialCreationOptions.excludeCredentials) &&
            Objects.equals(this.authenticatorSelection, publicKeyCredentialCreationOptions.authenticatorSelection) &&
            Objects.equals(this.hints, publicKeyCredentialCreationOptions.hints) &&
            Objects.equals(this.attestation, publicKeyCredentialCreationOptions.attestation) &&
            Objects.equals(this.attestationFormats, publicKeyCredentialCreationOptions.attestationFormats) &&
            Objects.equals(this.extensions, publicKeyCredentialCreationOptions.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenge, rp, user, pubKeyCredParams, timeout, excludeCredentials, authenticatorSelection, hints, attestation, attestationFormats, extensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKeyCredentialCreationOptions {\n");
    
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    rp: ").append(toIndentedString(rp)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    pubKeyCredParams: ").append(toIndentedString(pubKeyCredParams)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    excludeCredentials: ").append(toIndentedString(excludeCredentials)).append("\n");
    sb.append("    authenticatorSelection: ").append(toIndentedString(authenticatorSelection)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
    sb.append("    attestation: ").append(toIndentedString(attestation)).append("\n");
    sb.append("    attestationFormats: ").append(toIndentedString(attestationFormats)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

