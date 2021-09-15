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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * External Identifiers of user. The external identifier must be unique within the organization and the &#39;authority&#39;
 */
@ApiModel(description = "External Identifiers of user. The external identifier must be unique within the organization and the 'authority'")

public class ScimGenesysUserExternalId  implements Serializable {
  
  private String authority = null;
  private String value = null;

  
  /**
   * Authority, or scope, of \"externalId\". Allows multiple external identifiers to be defined. Represents the source of the external identifier.
   **/
  public ScimGenesysUserExternalId authority(String authority) {
    this.authority = authority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Authority, or scope, of \"externalId\". Allows multiple external identifiers to be defined. Represents the source of the external identifier.")
  @JsonProperty("authority")
  public String getAuthority() {
    return authority;
  }
  public void setAuthority(String authority) {
    this.authority = authority;
  }

  
  /**
   * Identifier of the user in an external system.
   **/
  public ScimGenesysUserExternalId value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the user in an external system.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGenesysUserExternalId scimGenesysUserExternalId = (ScimGenesysUserExternalId) o;
    return Objects.equals(this.authority, scimGenesysUserExternalId.authority) &&
        Objects.equals(this.value, scimGenesysUserExternalId.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGenesysUserExternalId {\n");
    
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

