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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DynamicLineBalancingSettingsPatchRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * Campaign patch request
 */
@ApiModel(description = "Campaign patch request")

public class CampaignPatchRequest  implements Serializable {
  
  private Integer outboundLineCount = null;
  private BigDecimal abandonRate = null;
  private BigDecimal maxCallsPerAgent = null;
  private DynamicLineBalancingSettingsPatchRequest dynamicLineBalancingSettings = null;
  private AddressableEntityRef queue = null;

  
  /**
   * The number of outbound lines to be concurrently dialed.
   **/
  public CampaignPatchRequest outboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of outbound lines to be concurrently dialed.")
  @JsonProperty("outboundLineCount")
  public Integer getOutboundLineCount() {
    return outboundLineCount;
  }
  public void setOutboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
  }


  /**
   * The targeted compliance abandon rate percentage
   **/
  public CampaignPatchRequest abandonRate(BigDecimal abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The targeted compliance abandon rate percentage")
  @JsonProperty("abandonRate")
  public BigDecimal getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(BigDecimal abandonRate) {
    this.abandonRate = abandonRate;
  }


  /**
   * The maximum number of calls that can be placed per agent on this campaign
   **/
  public CampaignPatchRequest maxCallsPerAgent(BigDecimal maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of calls that can be placed per agent on this campaign")
  @JsonProperty("maxCallsPerAgent")
  public BigDecimal getMaxCallsPerAgent() {
    return maxCallsPerAgent;
  }
  public void setMaxCallsPerAgent(BigDecimal maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
  }


  /**
   * Dynamic line balancing settings
   **/
  public CampaignPatchRequest dynamicLineBalancingSettings(DynamicLineBalancingSettingsPatchRequest dynamicLineBalancingSettings) {
    this.dynamicLineBalancingSettings = dynamicLineBalancingSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dynamic line balancing settings")
  @JsonProperty("dynamicLineBalancingSettings")
  public DynamicLineBalancingSettingsPatchRequest getDynamicLineBalancingSettings() {
    return dynamicLineBalancingSettings;
  }
  public void setDynamicLineBalancingSettings(DynamicLineBalancingSettingsPatchRequest dynamicLineBalancingSettings) {
    this.dynamicLineBalancingSettings = dynamicLineBalancingSettings;
  }


  /**
   * The Queue for this Campaign to route calls to.
   **/
  public CampaignPatchRequest queue(AddressableEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Queue for this Campaign to route calls to.")
  @JsonProperty("queue")
  public AddressableEntityRef getQueue() {
    return queue;
  }
  public void setQueue(AddressableEntityRef queue) {
    this.queue = queue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPatchRequest campaignPatchRequest = (CampaignPatchRequest) o;

    return Objects.equals(this.outboundLineCount, campaignPatchRequest.outboundLineCount) &&
            Objects.equals(this.abandonRate, campaignPatchRequest.abandonRate) &&
            Objects.equals(this.maxCallsPerAgent, campaignPatchRequest.maxCallsPerAgent) &&
            Objects.equals(this.dynamicLineBalancingSettings, campaignPatchRequest.dynamicLineBalancingSettings) &&
            Objects.equals(this.queue, campaignPatchRequest.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outboundLineCount, abandonRate, maxCallsPerAgent, dynamicLineBalancingSettings, queue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPatchRequest {\n");
    
    sb.append("    outboundLineCount: ").append(toIndentedString(outboundLineCount)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
    sb.append("    maxCallsPerAgent: ").append(toIndentedString(maxCallsPerAgent)).append("\n");
    sb.append("    dynamicLineBalancingSettings: ").append(toIndentedString(dynamicLineBalancingSettings)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

