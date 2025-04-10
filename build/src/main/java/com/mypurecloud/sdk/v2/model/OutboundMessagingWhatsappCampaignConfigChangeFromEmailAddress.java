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
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * An outbound-messaging messaging campaign email address
 */
@ApiModel(description = "An outbound-messaging messaging campaign email address")

public class OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress  implements Serializable {
  
  private String friendlyName = null;
  private String localPart = null;
  private OutboundMessagingWhatsappCampaignConfigChangeUriReference domain = null;

  public OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The friendly name of the email address.
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress friendlyName(String friendlyName) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress localPart(String localPart) {
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


  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress domain(OutboundMessagingWhatsappCampaignConfigChangeUriReference domain) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress outboundMessagingWhatsappCampaignConfigChangeFromEmailAddress = (OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress) o;

    return Objects.equals(this.friendlyName, outboundMessagingWhatsappCampaignConfigChangeFromEmailAddress.friendlyName) &&
            Objects.equals(this.localPart, outboundMessagingWhatsappCampaignConfigChangeFromEmailAddress.localPart) &&
            Objects.equals(this.domain, outboundMessagingWhatsappCampaignConfigChangeFromEmailAddress.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friendlyName, localPart, domain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingWhatsappCampaignConfigChangeFromEmailAddress {\n");
    
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

