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
import com.mypurecloud.sdk.v2.model.WhatsappCampaignScheduleConfigChangeScheduleInterval;
import com.mypurecloud.sdk.v2.model.WhatsappCampaignScheduleConfigChangeScheduleRecurrence;
import com.mypurecloud.sdk.v2.model.WhatsappCampaignScheduleConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule
 */

public class WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule  implements Serializable {
  
  private List<WhatsappCampaignScheduleConfigChangeScheduleInterval> intervals = null;
  private List<WhatsappCampaignScheduleConfigChangeScheduleRecurrence> recurrences = null;
  private String timeZone = null;
  private WhatsappCampaignScheduleConfigChangeUriReference whatsAppCampaign = null;
  private Map<String, Object> additionalProperties = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;

  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intervals = new ArrayList<WhatsappCampaignScheduleConfigChangeScheduleInterval>();
      recurrences = new ArrayList<WhatsappCampaignScheduleConfigChangeScheduleRecurrence>();
    }
  }

  
  /**
   * a list of start and end times
   **/
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule intervals(List<WhatsappCampaignScheduleConfigChangeScheduleInterval> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of start and end times")
  @JsonProperty("intervals")
  public List<WhatsappCampaignScheduleConfigChangeScheduleInterval> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<WhatsappCampaignScheduleConfigChangeScheduleInterval> intervals) {
    this.intervals = intervals;
  }


  /**
   * a list of recurrences for a schedule
   **/
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule recurrences(List<WhatsappCampaignScheduleConfigChangeScheduleRecurrence> recurrences) {
    this.recurrences = recurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of recurrences for a schedule")
  @JsonProperty("recurrences")
  public List<WhatsappCampaignScheduleConfigChangeScheduleRecurrence> getRecurrences() {
    return recurrences;
  }
  public void setRecurrences(List<WhatsappCampaignScheduleConfigChangeScheduleRecurrence> recurrences) {
    this.recurrences = recurrences;
  }


  /**
   * time zone identifier to be applied to the intervals; for example Africa/Abidjan
   **/
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule timeZone(String timeZone) {
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
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule whatsAppCampaign(WhatsappCampaignScheduleConfigChangeUriReference whatsAppCampaign) {
    this.whatsAppCampaign = whatsAppCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppCampaign")
  public WhatsappCampaignScheduleConfigChangeUriReference getWhatsAppCampaign() {
    return whatsAppCampaign;
  }
  public void setWhatsAppCampaign(WhatsappCampaignScheduleConfigChangeUriReference whatsAppCampaign) {
    this.whatsAppCampaign = whatsAppCampaign;
  }


  /**
   **/
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule additionalProperties(Map<String, Object> additionalProperties) {
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
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule id(String id) {
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
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule name(String name) {
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
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule dateCreated(Date dateCreated) {
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
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule dateModified(Date dateModified) {
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
  public WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule version(Long version) {
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
    WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule = (WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule) o;

    return Objects.equals(this.intervals, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.intervals) &&
            Objects.equals(this.recurrences, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.recurrences) &&
            Objects.equals(this.timeZone, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.timeZone) &&
            Objects.equals(this.whatsAppCampaign, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.whatsAppCampaign) &&
            Objects.equals(this.additionalProperties, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.additionalProperties) &&
            Objects.equals(this.id, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.id) &&
            Objects.equals(this.name, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.name) &&
            Objects.equals(this.dateCreated, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.dateCreated) &&
            Objects.equals(this.dateModified, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.dateModified) &&
            Objects.equals(this.version, whatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, recurrences, timeZone, whatsAppCampaign, additionalProperties, id, name, dateCreated, dateModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappCampaignScheduleConfigChangeWhatsAppCampaignSchedule {\n");
    
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    recurrences: ").append(toIndentedString(recurrences)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    whatsAppCampaign: ").append(toIndentedString(whatsAppCampaign)).append("\n");
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

