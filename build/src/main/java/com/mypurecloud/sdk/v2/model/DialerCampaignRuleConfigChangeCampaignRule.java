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
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeCampaignRuleAction;
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeCampaignRuleCondition;
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeCampaignRuleEntities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCampaignRuleConfigChangeCampaignRule
 */

public class DialerCampaignRuleConfigChangeCampaignRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DialerCampaignRuleConfigChangeCampaignRuleEntities campaignRuleEntities = null;
  private List<DialerCampaignRuleConfigChangeCampaignRuleCondition> campaignRuleConditions = new ArrayList<DialerCampaignRuleConfigChangeCampaignRuleCondition>();
  private List<DialerCampaignRuleConfigChangeCampaignRuleAction> campaignRuleActions = new ArrayList<DialerCampaignRuleConfigChangeCampaignRuleAction>();
  private Boolean matchAnyConditions = null;
  private Boolean enabled = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule campaignRuleEntities(DialerCampaignRuleConfigChangeCampaignRuleEntities campaignRuleEntities) {
    this.campaignRuleEntities = campaignRuleEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleEntities")
  public DialerCampaignRuleConfigChangeCampaignRuleEntities getCampaignRuleEntities() {
    return campaignRuleEntities;
  }
  public void setCampaignRuleEntities(DialerCampaignRuleConfigChangeCampaignRuleEntities campaignRuleEntities) {
    this.campaignRuleEntities = campaignRuleEntities;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule campaignRuleConditions(List<DialerCampaignRuleConfigChangeCampaignRuleCondition> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleConditions")
  public List<DialerCampaignRuleConfigChangeCampaignRuleCondition> getCampaignRuleConditions() {
    return campaignRuleConditions;
  }
  public void setCampaignRuleConditions(List<DialerCampaignRuleConfigChangeCampaignRuleCondition> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule campaignRuleActions(List<DialerCampaignRuleConfigChangeCampaignRuleAction> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleActions")
  public List<DialerCampaignRuleConfigChangeCampaignRuleAction> getCampaignRuleActions() {
    return campaignRuleActions;
  }
  public void setCampaignRuleActions(List<DialerCampaignRuleConfigChangeCampaignRuleAction> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule matchAnyConditions(Boolean matchAnyConditions) {
    this.matchAnyConditions = matchAnyConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchAnyConditions")
  public Boolean getMatchAnyConditions() {
    return matchAnyConditions;
  }
  public void setMatchAnyConditions(Boolean matchAnyConditions) {
    this.matchAnyConditions = matchAnyConditions;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule additionalProperties(Object additionalProperties) {
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
    DialerCampaignRuleConfigChangeCampaignRule dialerCampaignRuleConfigChangeCampaignRule = (DialerCampaignRuleConfigChangeCampaignRule) o;
    return Objects.equals(this.id, dialerCampaignRuleConfigChangeCampaignRule.id) &&
        Objects.equals(this.name, dialerCampaignRuleConfigChangeCampaignRule.name) &&
        Objects.equals(this.dateCreated, dialerCampaignRuleConfigChangeCampaignRule.dateCreated) &&
        Objects.equals(this.dateModified, dialerCampaignRuleConfigChangeCampaignRule.dateModified) &&
        Objects.equals(this.version, dialerCampaignRuleConfigChangeCampaignRule.version) &&
        Objects.equals(this.campaignRuleEntities, dialerCampaignRuleConfigChangeCampaignRule.campaignRuleEntities) &&
        Objects.equals(this.campaignRuleConditions, dialerCampaignRuleConfigChangeCampaignRule.campaignRuleConditions) &&
        Objects.equals(this.campaignRuleActions, dialerCampaignRuleConfigChangeCampaignRule.campaignRuleActions) &&
        Objects.equals(this.matchAnyConditions, dialerCampaignRuleConfigChangeCampaignRule.matchAnyConditions) &&
        Objects.equals(this.enabled, dialerCampaignRuleConfigChangeCampaignRule.enabled) &&
        Objects.equals(this.additionalProperties, dialerCampaignRuleConfigChangeCampaignRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, campaignRuleEntities, campaignRuleConditions, campaignRuleActions, matchAnyConditions, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignRuleConfigChangeCampaignRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    campaignRuleEntities: ").append(toIndentedString(campaignRuleEntities)).append("\n");
    sb.append("    campaignRuleConditions: ").append(toIndentedString(campaignRuleConditions)).append("\n");
    sb.append("    campaignRuleActions: ").append(toIndentedString(campaignRuleActions)).append("\n");
    sb.append("    matchAnyConditions: ").append(toIndentedString(matchAnyConditions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

