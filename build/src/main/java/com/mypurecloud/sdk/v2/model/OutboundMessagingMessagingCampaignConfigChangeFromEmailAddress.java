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
 * OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress
 */

public class OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress  implements Serializable {
  
  private String friendlyName = null;
  private String localPart = null;
  private OutboundMessagingMessagingCampaignConfigChangeUriReference domain = null;

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress localPart(String localPart) {
    this.localPart = localPart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("localPart")
  public String getLocalPart() {
    return localPart;
  }
  public void setLocalPart(String localPart) {
    this.localPart = localPart;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress domain(OutboundMessagingMessagingCampaignConfigChangeUriReference domain) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress outboundMessagingMessagingCampaignConfigChangeFromEmailAddress = (OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress) o;
    return Objects.equals(this.friendlyName, outboundMessagingMessagingCampaignConfigChangeFromEmailAddress.friendlyName) &&
        Objects.equals(this.localPart, outboundMessagingMessagingCampaignConfigChangeFromEmailAddress.localPart) &&
        Objects.equals(this.domain, outboundMessagingMessagingCampaignConfigChangeFromEmailAddress.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friendlyName, localPart, domain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress {\n");
    
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    localPart: ").append(toIndentedString(localPart)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

