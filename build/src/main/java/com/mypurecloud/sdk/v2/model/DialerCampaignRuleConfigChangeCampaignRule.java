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
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeCampaignRuleAction;
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeCampaignRuleCondition;
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeCampaignRuleEntities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerCampaignRuleConfigChangeCampaignRule
 */

public class DialerCampaignRuleConfigChangeCampaignRule  implements Serializable {
  
  private DialerCampaignRuleConfigChangeCampaignRuleEntities campaignRuleEntities = null;
  private List<DialerCampaignRuleConfigChangeCampaignRuleCondition> campaignRuleConditions = null;
  private List<DialerCampaignRuleConfigChangeCampaignRuleAction> campaignRuleActions = null;
  private Boolean matchAnyConditions = null;
  private Boolean enabled = null;
  private Map<String, Object> additionalProperties = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;

  public DialerCampaignRuleConfigChangeCampaignRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      campaignRuleConditions = new ArrayList<DialerCampaignRuleConfigChangeCampaignRuleCondition>();
      campaignRuleActions = new ArrayList<DialerCampaignRuleConfigChangeCampaignRuleAction>();
    }
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
   * The list of conditions that will trigger this Campaign Rule
   **/
  public DialerCampaignRuleConfigChangeCampaignRule campaignRuleConditions(List<DialerCampaignRuleConfigChangeCampaignRuleCondition> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of conditions that will trigger this Campaign Rule")
  @JsonProperty("campaignRuleConditions")
  public List<DialerCampaignRuleConfigChangeCampaignRuleCondition> getCampaignRuleConditions() {
    return campaignRuleConditions;
  }
  public void setCampaignRuleConditions(List<DialerCampaignRuleConfigChangeCampaignRuleCondition> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
  }


  /**
   * The list of actions that will be taken when this Campaign Rule's conditions are met
   **/
  public DialerCampaignRuleConfigChangeCampaignRule campaignRuleActions(List<DialerCampaignRuleConfigChangeCampaignRuleAction> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of actions that will be taken when this Campaign Rule's conditions are met")
  @JsonProperty("campaignRuleActions")
  public List<DialerCampaignRuleConfigChangeCampaignRuleAction> getCampaignRuleActions() {
    return campaignRuleActions;
  }
  public void setCampaignRuleActions(List<DialerCampaignRuleConfigChangeCampaignRuleAction> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
  }


  /**
   * Whether this Campaign Rule should match any conditions (inclusive OR) or match all conditions (ALL)
   **/
  public DialerCampaignRuleConfigChangeCampaignRule matchAnyConditions(Boolean matchAnyConditions) {
    this.matchAnyConditions = matchAnyConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this Campaign Rule should match any conditions (inclusive OR) or match all conditions (ALL)")
  @JsonProperty("matchAnyConditions")
  public Boolean getMatchAnyConditions() {
    return matchAnyConditions;
  }
  public void setMatchAnyConditions(Boolean matchAnyConditions) {
    this.matchAnyConditions = matchAnyConditions;
  }


  /**
   * Whether this campaign rule is enabled
   **/
  public DialerCampaignRuleConfigChangeCampaignRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this campaign rule is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRule additionalProperties(Map<String, Object> additionalProperties) {
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
   * The globally unique identifier for the object.
   **/
  public DialerCampaignRuleConfigChangeCampaignRule id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The UI-visible name of the object
   **/
  public DialerCampaignRuleConfigChangeCampaignRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI-visible name of the object")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation time of the entity
   **/
  public DialerCampaignRuleConfigChangeCampaignRule dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation time of the entity")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Last modified time of the entity
   **/
  public DialerCampaignRuleConfigChangeCampaignRule dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DialerCampaignRuleConfigChangeCampaignRule version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
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

    return Objects.equals(this.campaignRuleEntities, dialerCampaignRuleConfigChangeCampaignRule.campaignRuleEntities) &&
            Objects.equals(this.campaignRuleConditions, dialerCampaignRuleConfigChangeCampaignRule.campaignRuleConditions) &&
            Objects.equals(this.campaignRuleActions, dialerCampaignRuleConfigChangeCampaignRule.campaignRuleActions) &&
            Objects.equals(this.matchAnyConditions, dialerCampaignRuleConfigChangeCampaignRule.matchAnyConditions) &&
            Objects.equals(this.enabled, dialerCampaignRuleConfigChangeCampaignRule.enabled) &&
            Objects.equals(this.additionalProperties, dialerCampaignRuleConfigChangeCampaignRule.additionalProperties) &&
            Objects.equals(this.id, dialerCampaignRuleConfigChangeCampaignRule.id) &&
            Objects.equals(this.name, dialerCampaignRuleConfigChangeCampaignRule.name) &&
            Objects.equals(this.dateCreated, dialerCampaignRuleConfigChangeCampaignRule.dateCreated) &&
            Objects.equals(this.dateModified, dialerCampaignRuleConfigChangeCampaignRule.dateModified) &&
            Objects.equals(this.version, dialerCampaignRuleConfigChangeCampaignRule.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignRuleEntities, campaignRuleConditions, campaignRuleActions, matchAnyConditions, enabled, additionalProperties, id, name, dateCreated, dateModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignRuleConfigChangeCampaignRule {\n");
    
    sb.append("    campaignRuleEntities: ").append(toIndentedString(campaignRuleEntities)).append("\n");
    sb.append("    campaignRuleConditions: ").append(toIndentedString(campaignRuleConditions)).append("\n");
    sb.append("    campaignRuleActions: ").append(toIndentedString(campaignRuleActions)).append("\n");
    sb.append("    matchAnyConditions: ").append(toIndentedString(matchAnyConditions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

