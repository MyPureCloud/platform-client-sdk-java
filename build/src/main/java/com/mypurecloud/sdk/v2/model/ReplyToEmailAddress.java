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
 * ReplyToEmailAddress
 */

public class ReplyToEmailAddress  implements Serializable {
  
  private DomainEntityRef domain = null;
  private DomainEntityRef route = null;

  
  /**
   * The InboundDomain used for the email address.
   **/
  public ReplyToEmailAddress domain(DomainEntityRef domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The InboundDomain used for the email address.")
  @JsonProperty("domain")
  public DomainEntityRef getDomain() {
    return domain;
  }
  public void setDomain(DomainEntityRef domain) {
    this.domain = domain;
  }

  
  /**
   * The InboundRoute used for the email address.
   **/
  public ReplyToEmailAddress route(DomainEntityRef route) {
    this.route = route;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The InboundRoute used for the email address.")
  @JsonProperty("route")
  public DomainEntityRef getRoute() {
    return route;
  }
  public void setRoute(DomainEntityRef route) {
    this.route = route;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyToEmailAddress replyToEmailAddress = (ReplyToEmailAddress) o;
    return Objects.equals(this.domain, replyToEmailAddress.domain) &&
        Objects.equals(this.route, replyToEmailAddress.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyToEmailAddress {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

