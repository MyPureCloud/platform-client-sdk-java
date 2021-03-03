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
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeScheduleInterval;
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCampaignScheduleConfigChangeCampaignSchedule
 */

public class DialerCampaignScheduleConfigChangeCampaignSchedule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<DialerCampaignScheduleConfigChangeScheduleInterval> intervals = new ArrayList<DialerCampaignScheduleConfigChangeScheduleInterval>();
  private String timeZone = null;
  private DialerCampaignScheduleConfigChangeUriReference campaign = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule id(String id) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule name(String name) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule dateCreated(Date dateCreated) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule dateModified(Date dateModified) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule version(Integer version) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule intervals(List<DialerCampaignScheduleConfigChangeScheduleInterval> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intervals")
  public List<DialerCampaignScheduleConfigChangeScheduleInterval> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<DialerCampaignScheduleConfigChangeScheduleInterval> intervals) {
    this.intervals = intervals;
  }

  
  /**
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule campaign(DialerCampaignScheduleConfigChangeUriReference campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public DialerCampaignScheduleConfigChangeUriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(DialerCampaignScheduleConfigChangeUriReference campaign) {
    this.campaign = campaign;
  }

  
  /**
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule additionalProperties(Object additionalProperties) {
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
    DialerCampaignScheduleConfigChangeCampaignSchedule dialerCampaignScheduleConfigChangeCampaignSchedule = (DialerCampaignScheduleConfigChangeCampaignSchedule) o;
    return Objects.equals(this.id, dialerCampaignScheduleConfigChangeCampaignSchedule.id) &&
        Objects.equals(this.name, dialerCampaignScheduleConfigChangeCampaignSchedule.name) &&
        Objects.equals(this.dateCreated, dialerCampaignScheduleConfigChangeCampaignSchedule.dateCreated) &&
        Objects.equals(this.dateModified, dialerCampaignScheduleConfigChangeCampaignSchedule.dateModified) &&
        Objects.equals(this.version, dialerCampaignScheduleConfigChangeCampaignSchedule.version) &&
        Objects.equals(this.intervals, dialerCampaignScheduleConfigChangeCampaignSchedule.intervals) &&
        Objects.equals(this.timeZone, dialerCampaignScheduleConfigChangeCampaignSchedule.timeZone) &&
        Objects.equals(this.campaign, dialerCampaignScheduleConfigChangeCampaignSchedule.campaign) &&
        Objects.equals(this.additionalProperties, dialerCampaignScheduleConfigChangeCampaignSchedule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, intervals, timeZone, campaign, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignScheduleConfigChangeCampaignSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

