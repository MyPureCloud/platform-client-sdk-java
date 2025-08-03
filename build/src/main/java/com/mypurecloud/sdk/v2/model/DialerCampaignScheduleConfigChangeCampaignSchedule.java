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
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeScheduleInterval;
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeScheduleRecurrence;
import com.mypurecloud.sdk.v2.model.DialerCampaignScheduleConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerCampaignScheduleConfigChangeCampaignSchedule
 */

public class DialerCampaignScheduleConfigChangeCampaignSchedule  implements Serializable {
  
  private List<DialerCampaignScheduleConfigChangeScheduleInterval> intervals = null;
  private List<DialerCampaignScheduleConfigChangeScheduleRecurrence> recurrences = null;
  private String timeZone = null;
  private DialerCampaignScheduleConfigChangeUriReference campaign = null;
  private Map<String, Object> additionalProperties = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerCampaignScheduleConfigChangeCampaignSchedule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intervals = new ArrayList<DialerCampaignScheduleConfigChangeScheduleInterval>();
      recurrences = new ArrayList<DialerCampaignScheduleConfigChangeScheduleRecurrence>();
    }
  }

  
  /**
   * a list of start and end times
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule intervals(List<DialerCampaignScheduleConfigChangeScheduleInterval> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of start and end times")
  @JsonProperty("intervals")
  public List<DialerCampaignScheduleConfigChangeScheduleInterval> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<DialerCampaignScheduleConfigChangeScheduleInterval> intervals) {
    this.intervals = intervals;
  }


  /**
   * a list of recurrences for a schedule
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule recurrences(List<DialerCampaignScheduleConfigChangeScheduleRecurrence> recurrences) {
    this.recurrences = recurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of recurrences for a schedule")
  @JsonProperty("recurrences")
  public List<DialerCampaignScheduleConfigChangeScheduleRecurrence> getRecurrences() {
    return recurrences;
  }
  public void setRecurrences(List<DialerCampaignScheduleConfigChangeScheduleRecurrence> recurrences) {
    this.recurrences = recurrences;
  }


  /**
   * time zone identifier to be applied to the intervals; for example Africa/Abidjan
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "time zone identifier to be applied to the intervals; for example Africa/Abidjan")
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule additionalProperties(Map<String, Object> additionalProperties) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule id(String id) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule name(String name) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule dateCreated(Date dateCreated) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule dateModified(Date dateModified) {
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
  public DialerCampaignScheduleConfigChangeCampaignSchedule version(Long version) {
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


  /**
   **/
  public DialerCampaignScheduleConfigChangeCampaignSchedule getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
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

    return Objects.equals(this.intervals, dialerCampaignScheduleConfigChangeCampaignSchedule.intervals) &&
            Objects.equals(this.recurrences, dialerCampaignScheduleConfigChangeCampaignSchedule.recurrences) &&
            Objects.equals(this.timeZone, dialerCampaignScheduleConfigChangeCampaignSchedule.timeZone) &&
            Objects.equals(this.campaign, dialerCampaignScheduleConfigChangeCampaignSchedule.campaign) &&
            Objects.equals(this.additionalProperties, dialerCampaignScheduleConfigChangeCampaignSchedule.additionalProperties) &&
            Objects.equals(this.id, dialerCampaignScheduleConfigChangeCampaignSchedule.id) &&
            Objects.equals(this.name, dialerCampaignScheduleConfigChangeCampaignSchedule.name) &&
            Objects.equals(this.dateCreated, dialerCampaignScheduleConfigChangeCampaignSchedule.dateCreated) &&
            Objects.equals(this.dateModified, dialerCampaignScheduleConfigChangeCampaignSchedule.dateModified) &&
            Objects.equals(this.version, dialerCampaignScheduleConfigChangeCampaignSchedule.version) &&
            Objects.equals(this.getAdditionalProperties, dialerCampaignScheduleConfigChangeCampaignSchedule.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, recurrences, timeZone, campaign, additionalProperties, id, name, dateCreated, dateModified, version, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignScheduleConfigChangeCampaignSchedule {\n");
    
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    recurrences: ").append(toIndentedString(recurrences)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

