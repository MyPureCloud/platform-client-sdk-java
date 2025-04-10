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
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * An outbound-messaging messaging campaign email address
 */
@ApiModel(description = "An outbound-messaging messaging campaign email address")

public class OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress  implements Serializable {
  
  private OutboundMessagingEmailCampaignConfigChangeUriReference domain = null;
  private OutboundMessagingEmailCampaignConfigChangeUriReference route = null;

  public OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress domain(OutboundMessagingEmailCampaignConfigChangeUriReference domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("domain")
  public OutboundMessagingEmailCampaignConfigChangeUriReference getDomain() {
    return domain;
  }
  public void setDomain(OutboundMessagingEmailCampaignConfigChangeUriReference domain) {
    this.domain = domain;
  }


  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress route(OutboundMessagingEmailCampaignConfigChangeUriReference route) {
    this.route = route;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("route")
  public OutboundMessagingEmailCampaignConfigChangeUriReference getRoute() {
    return route;
  }
  public void setRoute(OutboundMessagingEmailCampaignConfigChangeUriReference route) {
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
    OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress outboundMessagingEmailCampaignConfigChangeReplyToEmailAddress = (OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress) o;

    return Objects.equals(this.domain, outboundMessagingEmailCampaignConfigChangeReplyToEmailAddress.domain) &&
            Objects.equals(this.route, outboundMessagingEmailCampaignConfigChangeReplyToEmailAddress.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress {\n");
    
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

