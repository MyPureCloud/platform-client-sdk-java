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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * An outbound-messaging messaging campaign email address
 */
@ApiModel(description = "An outbound-messaging messaging campaign email address")

public class OutboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress  implements Serializable {
  
  private OutboundMessagingWhatsappCampaignConfigChangeUriReference domain = null;
  private OutboundMessagingWhatsappCampaignConfigChangeUriReference route = null;

  
  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress domain(OutboundMessagingWhatsappCampaignConfigChangeUriReference domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("domain")
  public OutboundMessagingWhatsappCampaignConfigChangeUriReference getDomain() {
    return domain;
  }
  public void setDomain(OutboundMessagingWhatsappCampaignConfigChangeUriReference domain) {
    this.domain = domain;
  }


  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress route(OutboundMessagingWhatsappCampaignConfigChangeUriReference route) {
    this.route = route;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("route")
  public OutboundMessagingWhatsappCampaignConfigChangeUriReference getRoute() {
    return route;
  }
  public void setRoute(OutboundMessagingWhatsappCampaignConfigChangeUriReference route) {
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
    OutboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress outboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress = (OutboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress) o;

    return Objects.equals(this.domain, outboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress.domain) &&
            Objects.equals(this.route, outboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingWhatsappCampaignConfigChangeReplyToEmailAddress {\n");
    
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

