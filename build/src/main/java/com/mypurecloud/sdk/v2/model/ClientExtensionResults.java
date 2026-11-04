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
import com.mypurecloud.sdk.v2.model.AuthenticationExtensionsLargeBlobOutputs;
import com.mypurecloud.sdk.v2.model.AuthenticationExtensionsPRFOutputs;
import com.mypurecloud.sdk.v2.model.CredentialPropertiesOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ClientExtensionResults
 */

public class ClientExtensionResults  implements Serializable {
  
  private Boolean appid = null;
  private CredentialPropertiesOutput credProps = null;
  private Boolean hmacCreateSecret = null;
  private AuthenticationExtensionsLargeBlobOutputs largeBlob = null;
  private AuthenticationExtensionsPRFOutputs prf = null;

  public ClientExtensionResults() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ClientExtensionResults(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * App ID extension output (legacy U2F migration).
   **/
  public ClientExtensionResults appid(Boolean appid) {
    this.appid = appid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "App ID extension output (legacy U2F migration).")
  @JsonProperty("appid")
  public Boolean getAppid() {
    return appid;
  }
  public void setAppid(Boolean appid) {
    this.appid = appid;
  }


  /**
   * Credential properties extension output.
   **/
  public ClientExtensionResults credProps(CredentialPropertiesOutput credProps) {
    this.credProps = credProps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Credential properties extension output.")
  @JsonProperty("credProps")
  public CredentialPropertiesOutput getCredProps() {
    return credProps;
  }
  public void setCredProps(CredentialPropertiesOutput credProps) {
    this.credProps = credProps;
  }


  /**
   * HMAC secret extension output.
   **/
  public ClientExtensionResults hmacCreateSecret(Boolean hmacCreateSecret) {
    this.hmacCreateSecret = hmacCreateSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "HMAC secret extension output.")
  @JsonProperty("hmacCreateSecret")
  public Boolean getHmacCreateSecret() {
    return hmacCreateSecret;
  }
  public void setHmacCreateSecret(Boolean hmacCreateSecret) {
    this.hmacCreateSecret = hmacCreateSecret;
  }


  /**
   * Large blob extension outputs.
   **/
  public ClientExtensionResults largeBlob(AuthenticationExtensionsLargeBlobOutputs largeBlob) {
    this.largeBlob = largeBlob;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Large blob extension outputs.")
  @JsonProperty("largeBlob")
  public AuthenticationExtensionsLargeBlobOutputs getLargeBlob() {
    return largeBlob;
  }
  public void setLargeBlob(AuthenticationExtensionsLargeBlobOutputs largeBlob) {
    this.largeBlob = largeBlob;
  }


  /**
   * Pseudo-random function (PRF) extension outputs.
   **/
  public ClientExtensionResults prf(AuthenticationExtensionsPRFOutputs prf) {
    this.prf = prf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pseudo-random function (PRF) extension outputs.")
  @JsonProperty("prf")
  public AuthenticationExtensionsPRFOutputs getPrf() {
    return prf;
  }
  public void setPrf(AuthenticationExtensionsPRFOutputs prf) {
    this.prf = prf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientExtensionResults clientExtensionResults = (ClientExtensionResults) o;

    return Objects.equals(this.appid, clientExtensionResults.appid) &&
            Objects.equals(this.credProps, clientExtensionResults.credProps) &&
            Objects.equals(this.hmacCreateSecret, clientExtensionResults.hmacCreateSecret) &&
            Objects.equals(this.largeBlob, clientExtensionResults.largeBlob) &&
            Objects.equals(this.prf, clientExtensionResults.prf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, credProps, hmacCreateSecret, largeBlob, prf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientExtensionResults {\n");
    
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    credProps: ").append(toIndentedString(credProps)).append("\n");
    sb.append("    hmacCreateSecret: ").append(toIndentedString(hmacCreateSecret)).append("\n");
    sb.append("    largeBlob: ").append(toIndentedString(largeBlob)).append("\n");
    sb.append("    prf: ").append(toIndentedString(prf)).append("\n");
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

