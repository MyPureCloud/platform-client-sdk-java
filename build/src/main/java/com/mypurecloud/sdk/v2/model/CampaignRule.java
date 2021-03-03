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
import com.mypurecloud.sdk.v2.model.CampaignRuleAction;
import com.mypurecloud.sdk.v2.model.CampaignRuleCondition;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRule
 */

public class CampaignRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private CampaignRuleEntities campaignRuleEntities = null;
  private List<CampaignRuleCondition> campaignRuleConditions = new ArrayList<CampaignRuleCondition>();
  private List<CampaignRuleAction> campaignRuleActions = new ArrayList<CampaignRuleAction>();
  private Boolean matchAnyConditions = null;
  private Boolean enabled = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the CampaignRule.
   **/
  public CampaignRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the CampaignRule.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public CampaignRule version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The list of entities that this CampaignRule monitors.
   **/
  public CampaignRule campaignRuleEntities(CampaignRuleEntities campaignRuleEntities) {
    this.campaignRuleEntities = campaignRuleEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of entities that this CampaignRule monitors.")
  @JsonProperty("campaignRuleEntities")
  public CampaignRuleEntities getCampaignRuleEntities() {
    return campaignRuleEntities;
  }
  public void setCampaignRuleEntities(CampaignRuleEntities campaignRuleEntities) {
    this.campaignRuleEntities = campaignRuleEntities;
  }

  
  /**
   * The list of conditions that are evaluated on the entities.
   **/
  public CampaignRule campaignRuleConditions(List<CampaignRuleCondition> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of conditions that are evaluated on the entities.")
  @JsonProperty("campaignRuleConditions")
  public List<CampaignRuleCondition> getCampaignRuleConditions() {
    return campaignRuleConditions;
  }
  public void setCampaignRuleConditions(List<CampaignRuleCondition> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
  }

  
  /**
   * The list of actions that are executed if the conditions are satisfied.
   **/
  public CampaignRule campaignRuleActions(List<CampaignRuleAction> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of actions that are executed if the conditions are satisfied.")
  @JsonProperty("campaignRuleActions")
  public List<CampaignRuleAction> getCampaignRuleActions() {
    return campaignRuleActions;
  }
  public void setCampaignRuleActions(List<CampaignRuleAction> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
  }

  
  /**
   **/
  public CampaignRule matchAnyConditions(Boolean matchAnyConditions) {
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
   * Whether or not this CampaignRule is currently enabled. Required on updates.
   **/
  public CampaignRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not this CampaignRule is currently enabled. Required on updates.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRule campaignRule = (CampaignRule) o;
    return Objects.equals(this.id, campaignRule.id) &&
        Objects.equals(this.name, campaignRule.name) &&
        Objects.equals(this.dateCreated, campaignRule.dateCreated) &&
        Objects.equals(this.dateModified, campaignRule.dateModified) &&
        Objects.equals(this.version, campaignRule.version) &&
        Objects.equals(this.campaignRuleEntities, campaignRule.campaignRuleEntities) &&
        Objects.equals(this.campaignRuleConditions, campaignRule.campaignRuleConditions) &&
        Objects.equals(this.campaignRuleActions, campaignRule.campaignRuleActions) &&
        Objects.equals(this.matchAnyConditions, campaignRule.matchAnyConditions) &&
        Objects.equals(this.enabled, campaignRule.enabled) &&
        Objects.equals(this.selfUri, campaignRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, campaignRuleEntities, campaignRuleConditions, campaignRuleActions, matchAnyConditions, enabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRule {\n");
    
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
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

