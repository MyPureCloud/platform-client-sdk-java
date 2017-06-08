package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScheduleInterval;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SequenceSchedule
 */

public class SequenceSchedule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<ScheduleInterval> intervals = new ArrayList<ScheduleInterval>();
  private String timeZone = null;
  private UriReference sequence = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SequenceSchedule name(String name) {
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
  public SequenceSchedule version(Integer version) {
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
   * a list of start and end times
   **/
  public SequenceSchedule intervals(List<ScheduleInterval> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "a list of start and end times")
  @JsonProperty("intervals")
  public List<ScheduleInterval> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<ScheduleInterval> intervals) {
    this.intervals = intervals;
  }

  
  /**
   * time zone identifier to be applied to the intervals; for example Africa/Abidjan
   **/
  public SequenceSchedule timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "Africa/Abidjan", required = true, value = "time zone identifier to be applied to the intervals; for example Africa/Abidjan")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * identifier of the sequence to be scheduled
   **/
  public SequenceSchedule sequence(UriReference sequence) {
    this.sequence = sequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "identifier of the sequence to be scheduled")
  @JsonProperty("sequence")
  public UriReference getSequence() {
    return sequence;
  }
  public void setSequence(UriReference sequence) {
    this.sequence = sequence;
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
    SequenceSchedule sequenceSchedule = (SequenceSchedule) o;
    return Objects.equals(this.id, sequenceSchedule.id) &&
        Objects.equals(this.name, sequenceSchedule.name) &&
        Objects.equals(this.dateCreated, sequenceSchedule.dateCreated) &&
        Objects.equals(this.dateModified, sequenceSchedule.dateModified) &&
        Objects.equals(this.version, sequenceSchedule.version) &&
        Objects.equals(this.intervals, sequenceSchedule.intervals) &&
        Objects.equals(this.timeZone, sequenceSchedule.timeZone) &&
        Objects.equals(this.sequence, sequenceSchedule.sequence) &&
        Objects.equals(this.selfUri, sequenceSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, intervals, timeZone, sequence, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequenceSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

