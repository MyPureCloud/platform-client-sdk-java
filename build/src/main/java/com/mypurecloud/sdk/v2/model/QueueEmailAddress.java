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
import com.mypurecloud.sdk.v2.model.InboundRoute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueEmailAddress
 */

public class QueueEmailAddress  implements Serializable {
  
  private DomainEntityRef domain = null;
  private InboundRoute route = null;

  
  /**
   **/
  public QueueEmailAddress domain(DomainEntityRef domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public DomainEntityRef getDomain() {
    return domain;
  }
  public void setDomain(DomainEntityRef domain) {
    this.domain = domain;
  }

  
  /**
   **/
  public QueueEmailAddress route(InboundRoute route) {
    this.route = route;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("route")
  public InboundRoute getRoute() {
    return route;
  }
  public void setRoute(InboundRoute route) {
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
    QueueEmailAddress queueEmailAddress = (QueueEmailAddress) o;
    return Objects.equals(this.domain, queueEmailAddress.domain) &&
        Objects.equals(this.route, queueEmailAddress.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueEmailAddress {\n");
    
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

