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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundBlendingSettings
 */

public class OutboundBlendingSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Integer campaignReservationPercentage = null;

  public OutboundBlendingSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OutboundBlendingSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether Enhanced Blending is enabled for the queue.
   **/
  public OutboundBlendingSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether Enhanced Blending is enabled for the queue.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The proportion of on-queue agents to reserve for outbound campaign calls. Allowable range 1 - 100 (inclusive).
   **/
  public OutboundBlendingSettings campaignReservationPercentage(Integer campaignReservationPercentage) {
    this.campaignReservationPercentage = campaignReservationPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The proportion of on-queue agents to reserve for outbound campaign calls. Allowable range 1 - 100 (inclusive).")
  @JsonProperty("campaignReservationPercentage")
  public Integer getCampaignReservationPercentage() {
    return campaignReservationPercentage;
  }
  public void setCampaignReservationPercentage(Integer campaignReservationPercentage) {
    this.campaignReservationPercentage = campaignReservationPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundBlendingSettings outboundBlendingSettings = (OutboundBlendingSettings) o;

    return Objects.equals(this.enabled, outboundBlendingSettings.enabled) &&
            Objects.equals(this.campaignReservationPercentage, outboundBlendingSettings.campaignReservationPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, campaignReservationPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundBlendingSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    campaignReservationPercentage: ").append(toIndentedString(campaignReservationPercentage)).append("\n");
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

