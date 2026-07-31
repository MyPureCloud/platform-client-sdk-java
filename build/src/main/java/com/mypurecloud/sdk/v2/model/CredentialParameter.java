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
 * CredentialParameter
 */

public class CredentialParameter  implements Serializable {
  
  private String type = null;
  private Integer alg = null;

  public CredentialParameter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CredentialParameter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The public key credential type (e.g., 'public-key').
   **/
  public CredentialParameter type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The public key credential type (e.g., 'public-key').")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * The COSE algorithm identifier (e.g., -7 for ES256, -257 for RS256).
   **/
  public CredentialParameter alg(Integer alg) {
    this.alg = alg;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The COSE algorithm identifier (e.g., -7 for ES256, -257 for RS256).")
  @JsonProperty("alg")
  public Integer getAlg() {
    return alg;
  }
  public void setAlg(Integer alg) {
    this.alg = alg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialParameter credentialParameter = (CredentialParameter) o;

    return Objects.equals(this.type, credentialParameter.type) &&
            Objects.equals(this.alg, credentialParameter.alg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, alg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialParameter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
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

