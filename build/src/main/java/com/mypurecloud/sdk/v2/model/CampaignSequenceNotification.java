package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignSequenceNotification
 */

public class CampaignSequenceNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<DocumentDataV2NotificationCreatedBy> campaigns = new ArrayList<DocumentDataV2NotificationCreatedBy>();
  private Integer currentCampaign = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("ON"),
    OFF("OFF"),
    COMPLETE("COMPLETE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String stopMessage = null;
  private Boolean repeat = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CampaignSequenceNotification id(String id) {
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
  public CampaignSequenceNotification name(String name) {
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
  public CampaignSequenceNotification dateCreated(Date dateCreated) {
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
  public CampaignSequenceNotification dateModified(Date dateModified) {
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
  public CampaignSequenceNotification version(Integer version) {
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
  public CampaignSequenceNotification campaigns(List<DocumentDataV2NotificationCreatedBy> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaigns")
  public List<DocumentDataV2NotificationCreatedBy> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<DocumentDataV2NotificationCreatedBy> campaigns) {
    this.campaigns = campaigns;
  }

  
  /**
   **/
  public CampaignSequenceNotification currentCampaign(Integer currentCampaign) {
    this.currentCampaign = currentCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentCampaign")
  public Integer getCurrentCampaign() {
    return currentCampaign;
  }
  public void setCurrentCampaign(Integer currentCampaign) {
    this.currentCampaign = currentCampaign;
  }

  
  /**
   **/
  public CampaignSequenceNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public CampaignSequenceNotification stopMessage(String stopMessage) {
    this.stopMessage = stopMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stopMessage")
  public String getStopMessage() {
    return stopMessage;
  }
  public void setStopMessage(String stopMessage) {
    this.stopMessage = stopMessage;
  }

  
  /**
   **/
  public CampaignSequenceNotification repeat(Boolean repeat) {
    this.repeat = repeat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repeat")
  public Boolean getRepeat() {
    return repeat;
  }
  public void setRepeat(Boolean repeat) {
    this.repeat = repeat;
  }

  
  /**
   **/
  public CampaignSequenceNotification additionalProperties(Object additionalProperties) {
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
    CampaignSequenceNotification campaignSequenceNotification = (CampaignSequenceNotification) o;
    return Objects.equals(this.id, campaignSequenceNotification.id) &&
        Objects.equals(this.name, campaignSequenceNotification.name) &&
        Objects.equals(this.dateCreated, campaignSequenceNotification.dateCreated) &&
        Objects.equals(this.dateModified, campaignSequenceNotification.dateModified) &&
        Objects.equals(this.version, campaignSequenceNotification.version) &&
        Objects.equals(this.campaigns, campaignSequenceNotification.campaigns) &&
        Objects.equals(this.currentCampaign, campaignSequenceNotification.currentCampaign) &&
        Objects.equals(this.status, campaignSequenceNotification.status) &&
        Objects.equals(this.stopMessage, campaignSequenceNotification.stopMessage) &&
        Objects.equals(this.repeat, campaignSequenceNotification.repeat) &&
        Objects.equals(this.additionalProperties, campaignSequenceNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, campaigns, currentCampaign, status, stopMessage, repeat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSequenceNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    currentCampaign: ").append(toIndentedString(currentCampaign)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stopMessage: ").append(toIndentedString(stopMessage)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
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

