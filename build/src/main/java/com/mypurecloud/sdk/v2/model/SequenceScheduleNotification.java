package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CampaignScheduleNotificationIntervals;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SequenceScheduleNotification
 */

public class SequenceScheduleNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<CampaignScheduleNotificationIntervals> intervals = new ArrayList<CampaignScheduleNotificationIntervals>();
  private String timeZone = null;
  private DocumentDataV2NotificationCreatedBy sequence = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public SequenceScheduleNotification id(String id) {
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
  public SequenceScheduleNotification name(String name) {
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
  public SequenceScheduleNotification dateCreated(Date dateCreated) {
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
  public SequenceScheduleNotification dateModified(Date dateModified) {
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
  public SequenceScheduleNotification version(Integer version) {
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
  public SequenceScheduleNotification intervals(List<CampaignScheduleNotificationIntervals> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intervals")
  public List<CampaignScheduleNotificationIntervals> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<CampaignScheduleNotificationIntervals> intervals) {
    this.intervals = intervals;
  }

  
  /**
   **/
  public SequenceScheduleNotification timeZone(String timeZone) {
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
  public SequenceScheduleNotification sequence(DocumentDataV2NotificationCreatedBy sequence) {
    this.sequence = sequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sequence")
  public DocumentDataV2NotificationCreatedBy getSequence() {
    return sequence;
  }
  public void setSequence(DocumentDataV2NotificationCreatedBy sequence) {
    this.sequence = sequence;
  }

  
  /**
   **/
  public SequenceScheduleNotification additionalProperties(Object additionalProperties) {
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
    SequenceScheduleNotification sequenceScheduleNotification = (SequenceScheduleNotification) o;
    return Objects.equals(this.id, sequenceScheduleNotification.id) &&
        Objects.equals(this.name, sequenceScheduleNotification.name) &&
        Objects.equals(this.dateCreated, sequenceScheduleNotification.dateCreated) &&
        Objects.equals(this.dateModified, sequenceScheduleNotification.dateModified) &&
        Objects.equals(this.version, sequenceScheduleNotification.version) &&
        Objects.equals(this.intervals, sequenceScheduleNotification.intervals) &&
        Objects.equals(this.timeZone, sequenceScheduleNotification.timeZone) &&
        Objects.equals(this.sequence, sequenceScheduleNotification.sequence) &&
        Objects.equals(this.additionalProperties, sequenceScheduleNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, intervals, timeZone, sequence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequenceScheduleNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

