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
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress
 */

public class OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress  implements Serializable {
  
  private OutboundMessagingMessagingCampaignConfigChangeUriReference domain = null;
  private OutboundMessagingMessagingCampaignConfigChangeUriReference routeId = null;

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress domain(OutboundMessagingMessagingCampaignConfigChangeUriReference domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public OutboundMessagingMessagingCampaignConfigChangeUriReference getDomain() {
    return domain;
  }
  public void setDomain(OutboundMessagingMessagingCampaignConfigChangeUriReference domain) {
    this.domain = domain;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress routeId(OutboundMessagingMessagingCampaignConfigChangeUriReference routeId) {
    this.routeId = routeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routeId")
  public OutboundMessagingMessagingCampaignConfigChangeUriReference getRouteId() {
    return routeId;
  }
  public void setRouteId(OutboundMessagingMessagingCampaignConfigChangeUriReference routeId) {
    this.routeId = routeId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress outboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress = (OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress) o;
    return Objects.equals(this.domain, outboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress.domain) &&
        Objects.equals(this.routeId, outboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress.routeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, routeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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

