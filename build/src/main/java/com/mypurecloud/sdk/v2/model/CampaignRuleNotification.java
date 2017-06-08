package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CampaignRuleNotificationCampaignRuleActions;
import com.mypurecloud.sdk.v2.model.CampaignRuleNotificationCampaignRuleConditions;
import com.mypurecloud.sdk.v2.model.CampaignRuleNotificationCampaignRuleEntities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleNotification
 */

public class CampaignRuleNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private CampaignRuleNotificationCampaignRuleEntities campaignRuleEntities = null;
  private List<CampaignRuleNotificationCampaignRuleConditions> campaignRuleConditions = new ArrayList<CampaignRuleNotificationCampaignRuleConditions>();
  private List<CampaignRuleNotificationCampaignRuleActions> campaignRuleActions = new ArrayList<CampaignRuleNotificationCampaignRuleActions>();
  private Boolean matchAnyConditions = null;
  private Boolean enabled = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CampaignRuleNotification id(String id) {
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
  public CampaignRuleNotification name(String name) {
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
  public CampaignRuleNotification dateCreated(Date dateCreated) {
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
  public CampaignRuleNotification dateModified(Date dateModified) {
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
  public CampaignRuleNotification version(Integer version) {
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
  public CampaignRuleNotification campaignRuleEntities(CampaignRuleNotificationCampaignRuleEntities campaignRuleEntities) {
    this.campaignRuleEntities = campaignRuleEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleEntities")
  public CampaignRuleNotificationCampaignRuleEntities getCampaignRuleEntities() {
    return campaignRuleEntities;
  }
  public void setCampaignRuleEntities(CampaignRuleNotificationCampaignRuleEntities campaignRuleEntities) {
    this.campaignRuleEntities = campaignRuleEntities;
  }

  
  /**
   **/
  public CampaignRuleNotification campaignRuleConditions(List<CampaignRuleNotificationCampaignRuleConditions> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleConditions")
  public List<CampaignRuleNotificationCampaignRuleConditions> getCampaignRuleConditions() {
    return campaignRuleConditions;
  }
  public void setCampaignRuleConditions(List<CampaignRuleNotificationCampaignRuleConditions> campaignRuleConditions) {
    this.campaignRuleConditions = campaignRuleConditions;
  }

  
  /**
   **/
  public CampaignRuleNotification campaignRuleActions(List<CampaignRuleNotificationCampaignRuleActions> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleActions")
  public List<CampaignRuleNotificationCampaignRuleActions> getCampaignRuleActions() {
    return campaignRuleActions;
  }
  public void setCampaignRuleActions(List<CampaignRuleNotificationCampaignRuleActions> campaignRuleActions) {
    this.campaignRuleActions = campaignRuleActions;
  }

  
  /**
   **/
  public CampaignRuleNotification matchAnyConditions(Boolean matchAnyConditions) {
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
  public CampaignRuleNotification enabled(Boolean enabled) {
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
  public CampaignRuleNotification additionalProperties(Object additionalProperties) {
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
    CampaignRuleNotification campaignRuleNotification = (CampaignRuleNotification) o;
    return Objects.equals(this.id, campaignRuleNotification.id) &&
        Objects.equals(this.name, campaignRuleNotification.name) &&
        Objects.equals(this.dateCreated, campaignRuleNotification.dateCreated) &&
        Objects.equals(this.dateModified, campaignRuleNotification.dateModified) &&
        Objects.equals(this.version, campaignRuleNotification.version) &&
        Objects.equals(this.campaignRuleEntities, campaignRuleNotification.campaignRuleEntities) &&
        Objects.equals(this.campaignRuleConditions, campaignRuleNotification.campaignRuleConditions) &&
        Objects.equals(this.campaignRuleActions, campaignRuleNotification.campaignRuleActions) &&
        Objects.equals(this.matchAnyConditions, campaignRuleNotification.matchAnyConditions) &&
        Objects.equals(this.enabled, campaignRuleNotification.enabled) &&
        Objects.equals(this.additionalProperties, campaignRuleNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, campaignRuleEntities, campaignRuleConditions, campaignRuleActions, matchAnyConditions, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleNotification {\n");
    
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

