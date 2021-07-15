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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FromEmailAddress
 */

public class FromEmailAddress  implements Serializable {
  
  private DomainEntityRef domain = null;
  private String friendlyName = null;
  private String localPart = null;

  
  /**
   * The OutboundDomain used for the email address.
   **/
  public FromEmailAddress domain(DomainEntityRef domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The OutboundDomain used for the email address.")
  @JsonProperty("domain")
  public DomainEntityRef getDomain() {
    return domain;
  }
  public void setDomain(DomainEntityRef domain) {
    this.domain = domain;
  }

  
  /**
   * The friendly name of the email address.
   **/
  public FromEmailAddress friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The friendly name of the email address.")
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  
  /**
   * The local part of the email address.
   **/
  public FromEmailAddress localPart(String localPart) {
    this.localPart = localPart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The local part of the email address.")
  @JsonProperty("localPart")
  public String getLocalPart() {
    return localPart;
  }
  public void setLocalPart(String localPart) {
    this.localPart = localPart;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FromEmailAddress fromEmailAddress = (FromEmailAddress) o;
    return Objects.equals(this.domain, fromEmailAddress.domain) &&
        Objects.equals(this.friendlyName, fromEmailAddress.friendlyName) &&
        Objects.equals(this.localPart, fromEmailAddress.localPart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, friendlyName, localPart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FromEmailAddress {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    localPart: ").append(toIndentedString(localPart)).append("\n");
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

