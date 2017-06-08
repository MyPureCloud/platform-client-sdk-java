package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignSequence
 */

public class CampaignSequence  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<UriReference> campaigns = new ArrayList<UriReference>();
  private Integer currentCampaign = null;

  /**
   * status of the sequence
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("on"),
    OFF("off"),
    COMPLETE("complete");

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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public CampaignSequence name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public CampaignSequence version(Integer version) {
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
   * the ordered list of campaign identifiers
   **/
  public CampaignSequence campaigns(List<UriReference> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the ordered list of campaign identifiers")
  @JsonProperty("campaigns")
  public List<UriReference> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<UriReference> campaigns) {
    this.campaigns = campaigns;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "the zero-based index of the current campaign in the campaigns list")
  @JsonProperty("currentCampaign")
  public Integer getCurrentCampaign() {
    return currentCampaign;
  }

  
  /**
   * status of the sequence
   **/
  public CampaignSequence status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "status of the sequence")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  @ApiModelProperty(example = "null", value = "if a sequence has unexpectedly stopped, this message provides the reason")
  @JsonProperty("stopMessage")
  public String getStopMessage() {
    return stopMessage;
  }

  
  /**
   * indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false
   **/
  public CampaignSequence repeat(Boolean repeat) {
    this.repeat = repeat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false")
  @JsonProperty("repeat")
  public Boolean getRepeat() {
    return repeat;
  }
  public void setRepeat(Boolean repeat) {
    this.repeat = repeat;
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
    CampaignSequence campaignSequence = (CampaignSequence) o;
    return Objects.equals(this.id, campaignSequence.id) &&
        Objects.equals(this.name, campaignSequence.name) &&
        Objects.equals(this.dateCreated, campaignSequence.dateCreated) &&
        Objects.equals(this.dateModified, campaignSequence.dateModified) &&
        Objects.equals(this.version, campaignSequence.version) &&
        Objects.equals(this.campaigns, campaignSequence.campaigns) &&
        Objects.equals(this.currentCampaign, campaignSequence.currentCampaign) &&
        Objects.equals(this.status, campaignSequence.status) &&
        Objects.equals(this.stopMessage, campaignSequence.stopMessage) &&
        Objects.equals(this.repeat, campaignSequence.repeat) &&
        Objects.equals(this.selfUri, campaignSequence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, campaigns, currentCampaign, status, stopMessage, repeat, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSequence {\n");
    
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

