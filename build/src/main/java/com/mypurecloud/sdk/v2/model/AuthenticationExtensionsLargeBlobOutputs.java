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
 * AuthenticationExtensionsLargeBlobOutputs
 */

public class AuthenticationExtensionsLargeBlobOutputs  implements Serializable {
  
  private Boolean supported = null;
  private Boolean blob = null;

  public AuthenticationExtensionsLargeBlobOutputs() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AuthenticationExtensionsLargeBlobOutputs(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether large blob support was negotiated for this credential.
   **/
  public AuthenticationExtensionsLargeBlobOutputs supported(Boolean supported) {
    this.supported = supported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether large blob support was negotiated for this credential.")
  @JsonProperty("supported")
  public Boolean getSupported() {
    return supported;
  }
  public void setSupported(Boolean supported) {
    this.supported = supported;
  }


  /**
   * Whether a large blob was read or written during the ceremony.
   **/
  public AuthenticationExtensionsLargeBlobOutputs blob(Boolean blob) {
    this.blob = blob;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether a large blob was read or written during the ceremony.")
  @JsonProperty("blob")
  public Boolean getBlob() {
    return blob;
  }
  public void setBlob(Boolean blob) {
    this.blob = blob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationExtensionsLargeBlobOutputs authenticationExtensionsLargeBlobOutputs = (AuthenticationExtensionsLargeBlobOutputs) o;

    return Objects.equals(this.supported, authenticationExtensionsLargeBlobOutputs.supported) &&
            Objects.equals(this.blob, authenticationExtensionsLargeBlobOutputs.blob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, blob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationExtensionsLargeBlobOutputs {\n");
    
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    blob: ").append(toIndentedString(blob)).append("\n");
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

