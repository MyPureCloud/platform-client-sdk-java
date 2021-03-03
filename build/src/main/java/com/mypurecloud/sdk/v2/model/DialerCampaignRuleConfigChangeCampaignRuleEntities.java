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
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCampaignRuleConfigChangeCampaignRuleEntities
 */

public class DialerCampaignRuleConfigChangeCampaignRuleEntities  implements Serializable {
  
  private List<DialerCampaignRuleConfigChangeUriReference> campaigns = new ArrayList<DialerCampaignRuleConfigChangeUriReference>();
  private List<DialerCampaignRuleConfigChangeUriReference> sequences = new ArrayList<DialerCampaignRuleConfigChangeUriReference>();

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleEntities campaigns(List<DialerCampaignRuleConfigChangeUriReference> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaigns")
  public List<DialerCampaignRuleConfigChangeUriReference> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<DialerCampaignRuleConfigChangeUriReference> campaigns) {
    this.campaigns = campaigns;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleEntities sequences(List<DialerCampaignRuleConfigChangeUriReference> sequences) {
    this.sequences = sequences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sequences")
  public List<DialerCampaignRuleConfigChangeUriReference> getSequences() {
    return sequences;
  }
  public void setSequences(List<DialerCampaignRuleConfigChangeUriReference> sequences) {
    this.sequences = sequences;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignRuleConfigChangeCampaignRuleEntities dialerCampaignRuleConfigChangeCampaignRuleEntities = (DialerCampaignRuleConfigChangeCampaignRuleEntities) o;
    return Objects.equals(this.campaigns, dialerCampaignRuleConfigChangeCampaignRuleEntities.campaigns) &&
        Objects.equals(this.sequences, dialerCampaignRuleConfigChangeCampaignRuleEntities.sequences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, sequences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignRuleConfigChangeCampaignRuleEntities {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
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

