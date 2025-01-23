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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DivisionedDomainEntityRef;
import com.mypurecloud.sdk.v2.model.Reoccurrence;
import com.mypurecloud.sdk.v2.model.ScheduleInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EmailCampaignSchedule
 */

public class EmailCampaignSchedule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<ScheduleInterval> intervals = new ArrayList<ScheduleInterval>();
  private List<Reoccurrence> recurrences = new ArrayList<Reoccurrence>();
  private String timeZone = null;
  private DivisionedDomainEntityRef emailCampaign = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public EmailCampaignSchedule name(String name) {
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
  public EmailCampaignSchedule version(Integer version) {
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
   * A list of intervals during which to run the associated Campaign.
   **/
  public EmailCampaignSchedule intervals(List<ScheduleInterval> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of intervals during which to run the associated Campaign.")
  @JsonProperty("intervals")
  public List<ScheduleInterval> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<ScheduleInterval> intervals) {
    this.intervals = intervals;
  }


  /**
   * Recurring schedules of the campaign
   **/
  public EmailCampaignSchedule recurrences(List<Reoccurrence> recurrences) {
    this.recurrences = recurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recurring schedules of the campaign")
  @JsonProperty("recurrences")
  public List<Reoccurrence> getRecurrences() {
    return recurrences;
  }
  public void setRecurrences(List<Reoccurrence> recurrences) {
    this.recurrences = recurrences;
  }


  /**
   * The time zone for this email campaign schedule. Defaults to UTC if empty or not provided. See here for a list of valid time zones https://www.iana.org/time-zones
   **/
  public EmailCampaignSchedule timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "Africa/Abidjan", value = "The time zone for this email campaign schedule. Defaults to UTC if empty or not provided. See here for a list of valid time zones https://www.iana.org/time-zones")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * The Campaign that this email campaign schedule is for.
   **/
  public EmailCampaignSchedule emailCampaign(DivisionedDomainEntityRef emailCampaign) {
    this.emailCampaign = emailCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Campaign that this email campaign schedule is for.")
  @JsonProperty("emailCampaign")
  public DivisionedDomainEntityRef getEmailCampaign() {
    return emailCampaign;
  }
  public void setEmailCampaign(DivisionedDomainEntityRef emailCampaign) {
    this.emailCampaign = emailCampaign;
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
    EmailCampaignSchedule emailCampaignSchedule = (EmailCampaignSchedule) o;

    return Objects.equals(this.id, emailCampaignSchedule.id) &&
            Objects.equals(this.name, emailCampaignSchedule.name) &&
            Objects.equals(this.dateCreated, emailCampaignSchedule.dateCreated) &&
            Objects.equals(this.dateModified, emailCampaignSchedule.dateModified) &&
            Objects.equals(this.version, emailCampaignSchedule.version) &&
            Objects.equals(this.intervals, emailCampaignSchedule.intervals) &&
            Objects.equals(this.recurrences, emailCampaignSchedule.recurrences) &&
            Objects.equals(this.timeZone, emailCampaignSchedule.timeZone) &&
            Objects.equals(this.emailCampaign, emailCampaignSchedule.emailCampaign) &&
            Objects.equals(this.selfUri, emailCampaignSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, intervals, recurrences, timeZone, emailCampaign, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCampaignSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    recurrences: ").append(toIndentedString(recurrences)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    emailCampaign: ").append(toIndentedString(emailCampaign)).append("\n");
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

