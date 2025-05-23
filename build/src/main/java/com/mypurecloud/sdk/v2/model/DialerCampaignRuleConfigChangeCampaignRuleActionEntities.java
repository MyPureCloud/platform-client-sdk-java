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
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * the campaign/sequence entities that this action acts on
 */
@ApiModel(description = "the campaign/sequence entities that this action acts on")

public class DialerCampaignRuleConfigChangeCampaignRuleActionEntities  implements Serializable {
  
  private Boolean useTriggeringEntity = null;
  private Map<String, Object> additionalProperties = null;
  private List<DialerCampaignRuleConfigChangeUriReference> campaigns = null;
  private List<DialerCampaignRuleConfigChangeUriReference> sequences = null;

  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      campaigns = new ArrayList<DialerCampaignRuleConfigChangeUriReference>();
      sequences = new ArrayList<DialerCampaignRuleConfigChangeUriReference>();
    }
  }

  
  /**
   * Whether this action should act on the entity that triggered it
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities useTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this action should act on the entity that triggered it")
  @JsonProperty("useTriggeringEntity")
  public Boolean getUseTriggeringEntity() {
    return useTriggeringEntity;
  }
  public void setUseTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
  }


  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   * A list of campaignIds to act on
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities campaigns(List<DialerCampaignRuleConfigChangeUriReference> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of campaignIds to act on")
  @JsonProperty("campaigns")
  public List<DialerCampaignRuleConfigChangeUriReference> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<DialerCampaignRuleConfigChangeUriReference> campaigns) {
    this.campaigns = campaigns;
  }


  /**
   * A list of sequenceIds to act on
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities sequences(List<DialerCampaignRuleConfigChangeUriReference> sequences) {
    this.sequences = sequences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of sequenceIds to act on")
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
    DialerCampaignRuleConfigChangeCampaignRuleActionEntities dialerCampaignRuleConfigChangeCampaignRuleActionEntities = (DialerCampaignRuleConfigChangeCampaignRuleActionEntities) o;

    return Objects.equals(this.useTriggeringEntity, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.useTriggeringEntity) &&
            Objects.equals(this.additionalProperties, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.additionalProperties) &&
            Objects.equals(this.campaigns, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.campaigns) &&
            Objects.equals(this.sequences, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.sequences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useTriggeringEntity, additionalProperties, campaigns, sequences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignRuleConfigChangeCampaignRuleActionEntities {\n");
    
    sb.append("    useTriggeringEntity: ").append(toIndentedString(useTriggeringEntity)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

