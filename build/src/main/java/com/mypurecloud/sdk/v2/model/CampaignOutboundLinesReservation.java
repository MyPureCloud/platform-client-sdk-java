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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignOutboundLinesReservation
 */

public class CampaignOutboundLinesReservation  implements Serializable {
  
  private DomainEntityRef campaign = null;
  private Integer linesReserved = null;

  public CampaignOutboundLinesReservation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Campaign
   **/
  public CampaignOutboundLinesReservation campaign(DomainEntityRef campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Campaign")
  @JsonProperty("campaign")
  public DomainEntityRef getCampaign() {
    return campaign;
  }
  public void setCampaign(DomainEntityRef campaign) {
    this.campaign = campaign;
  }


  /**
   * The number of lines reserved for the campaign
   **/
  public CampaignOutboundLinesReservation linesReserved(Integer linesReserved) {
    this.linesReserved = linesReserved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of lines reserved for the campaign")
  @JsonProperty("linesReserved")
  public Integer getLinesReserved() {
    return linesReserved;
  }
  public void setLinesReserved(Integer linesReserved) {
    this.linesReserved = linesReserved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignOutboundLinesReservation campaignOutboundLinesReservation = (CampaignOutboundLinesReservation) o;

    return Objects.equals(this.campaign, campaignOutboundLinesReservation.campaign) &&
            Objects.equals(this.linesReserved, campaignOutboundLinesReservation.linesReserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, linesReserved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignOutboundLinesReservation {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    linesReserved: ").append(toIndentedString(linesReserved)).append("\n");
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

