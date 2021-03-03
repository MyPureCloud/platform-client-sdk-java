package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CredentialType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Credential
 */

public class Credential  implements Serializable {
  
  private String id = null;
  private String name = null;
  private CredentialType type = null;
  private Map<String, String> credentialFields = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Credential name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The type of credential.
   **/
  public Credential type(CredentialType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of credential.")
  @JsonProperty("type")
  public CredentialType getType() {
    return type;
  }
  public void setType(CredentialType type) {
    this.type = type;
  }

  
  /**
   **/
  public Credential credentialFields(Map<String, String> credentialFields) {
    this.credentialFields = credentialFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("credentialFields")
  public Map<String, String> getCredentialFields() {
    return credentialFields;
  }
  public void setCredentialFields(Map<String, String> credentialFields) {
    this.credentialFields = credentialFields;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    return Objects.equals(this.id, credential.id) &&
        Objects.equals(this.name, credential.name) &&
        Objects.equals(this.type, credential.type) &&
        Objects.equals(this.credentialFields, credential.credentialFields) &&
        Objects.equals(this.selfUri, credential.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, credentialFields, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    credentialFields: ").append(toIndentedString(credentialFields)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

