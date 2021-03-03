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
 * DialerCampaignRuleConfigChangeCampaignRuleActionEntities
 */

public class DialerCampaignRuleConfigChangeCampaignRuleActionEntities  implements Serializable {
  
  private List<DialerCampaignRuleConfigChangeUriReference> campaigns = new ArrayList<DialerCampaignRuleConfigChangeUriReference>();
  private List<DialerCampaignRuleConfigChangeUriReference> sequences = new ArrayList<DialerCampaignRuleConfigChangeUriReference>();
  private Boolean useTriggeringEntity = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities campaigns(List<DialerCampaignRuleConfigChangeUriReference> campaigns) {
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
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities sequences(List<DialerCampaignRuleConfigChangeUriReference> sequences) {
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

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities useTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("useTriggeringEntity")
  public Boolean getUseTriggeringEntity() {
    return useTriggeringEntity;
  }
  public void setUseTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
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
    return Objects.equals(this.campaigns, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.campaigns) &&
        Objects.equals(this.sequences, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.sequences) &&
        Objects.equals(this.useTriggeringEntity, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.useTriggeringEntity) &&
        Objects.equals(this.additionalProperties, dialerCampaignRuleConfigChangeCampaignRuleActionEntities.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, sequences, useTriggeringEntity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignRuleConfigChangeCampaignRuleActionEntities {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    useTriggeringEntity: ").append(toIndentedString(useTriggeringEntity)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

