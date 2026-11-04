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
 * CredentialPropertiesOutput
 */

public class CredentialPropertiesOutput  implements Serializable {
  
  private Boolean rk = null;

  public CredentialPropertiesOutput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CredentialPropertiesOutput(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether the credential is a resident (discoverable) credential.
   **/
  public CredentialPropertiesOutput rk(Boolean rk) {
    this.rk = rk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the credential is a resident (discoverable) credential.")
  @JsonProperty("rk")
  public Boolean getRk() {
    return rk;
  }
  public void setRk(Boolean rk) {
    this.rk = rk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialPropertiesOutput credentialPropertiesOutput = (CredentialPropertiesOutput) o;

    return Objects.equals(this.rk, credentialPropertiesOutput.rk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialPropertiesOutput {\n");
    
    sb.append("    rk: ").append(toIndentedString(rk)).append("\n");
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

