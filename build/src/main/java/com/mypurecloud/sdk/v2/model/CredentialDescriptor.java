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
 * CredentialDescriptor
 */

public class CredentialDescriptor  implements Serializable {
  
  private String type = null;
  private String id = null;
  private List<String> transports = null;

  public CredentialDescriptor() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      transports = new ArrayList<String>();
    }
  }

  public CredentialDescriptor(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      transports = new ArrayList<String>();
    }
  }

  
  /**
   * The credential type (e.g., 'public-key').
   **/
  public CredentialDescriptor type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The credential type (e.g., 'public-key').")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * The credential identifier (base64url-encoded).
   **/
  public CredentialDescriptor id(String id) {
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
   * Hints regarding which transports the credential supports.
   **/
  public CredentialDescriptor transports(List<String> transports) {
    this.transports = transports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hints regarding which transports the credential supports.")
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
    CredentialDescriptor credentialDescriptor = (CredentialDescriptor) o;

    return Objects.equals(this.type, credentialDescriptor.type) &&
            Objects.equals(this.id, credentialDescriptor.id) &&
            Objects.equals(this.transports, credentialDescriptor.transports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, transports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialDescriptor {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

