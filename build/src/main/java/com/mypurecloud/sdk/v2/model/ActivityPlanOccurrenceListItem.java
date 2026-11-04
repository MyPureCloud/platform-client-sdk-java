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
import com.mypurecloud.sdk.v2.model.RequiredDateRange;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanOccurrenceListItem
 */

public class ActivityPlanOccurrenceListItem  implements Serializable {
  
  private String id = null;
  private Date runDate = null;
  private RequiredDateRange sessionDateRange = null;
  private Boolean facilitated = null;
  private Integer sessionCount = null;
  private Integer scheduledAttendeesCount = null;
  private Integer unscheduledAttendeesCount = null;
  private Boolean edited = null;
  private Integer violationCount = null;
  private List<Integer> affectedScheduleIndexes = null;
  private UserReference createdBy = null;
  private String selfUri = null;

  public ActivityPlanOccurrenceListItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      affectedScheduleIndexes = new ArrayList<Integer>();
    }
  }

  public ActivityPlanOccurrenceListItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      affectedScheduleIndexes = new ArrayList<Integer>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ActivityPlanOccurrenceListItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The date the associated activity plan was run, in ISO-8601 format
   **/
  public ActivityPlanOccurrenceListItem runDate(Date runDate) {
    this.runDate = runDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the associated activity plan was run, in ISO-8601 format")
  @JsonProperty("runDate")
  public Date getRunDate() {
    return runDate;
  }
  public void setRunDate(Date runDate) {
    this.runDate = runDate;
  }


  /**
   * The dates potentially spanned by the sessions in this occurrence, even if no sessions currently exist
   **/
  public ActivityPlanOccurrenceListItem sessionDateRange(RequiredDateRange sessionDateRange) {
    this.sessionDateRange = sessionDateRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The dates potentially spanned by the sessions in this occurrence, even if no sessions currently exist")
  @JsonProperty("sessionDateRange")
  public RequiredDateRange getSessionDateRange() {
    return sessionDateRange;
  }
  public void setSessionDateRange(RequiredDateRange sessionDateRange) {
    this.sessionDateRange = sessionDateRange;
  }


  /**
   * Whether the run sessions are facilitated
   **/
  public ActivityPlanOccurrenceListItem facilitated(Boolean facilitated) {
    this.facilitated = facilitated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the run sessions are facilitated")
  @JsonProperty("facilitated")
  public Boolean getFacilitated() {
    return facilitated;
  }
  public void setFacilitated(Boolean facilitated) {
    this.facilitated = facilitated;
  }


  /**
   * The number of sessions that were scheduled
   **/
  public ActivityPlanOccurrenceListItem sessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of sessions that were scheduled")
  @JsonProperty("sessionCount")
  public Integer getSessionCount() {
    return sessionCount;
  }
  public void setSessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
  }


  /**
   * The number of attendees that were scheduled for this occurrence
   **/
  public ActivityPlanOccurrenceListItem scheduledAttendeesCount(Integer scheduledAttendeesCount) {
    this.scheduledAttendeesCount = scheduledAttendeesCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of attendees that were scheduled for this occurrence")
  @JsonProperty("scheduledAttendeesCount")
  public Integer getScheduledAttendeesCount() {
    return scheduledAttendeesCount;
  }
  public void setScheduledAttendeesCount(Integer scheduledAttendeesCount) {
    this.scheduledAttendeesCount = scheduledAttendeesCount;
  }


  /**
   * The number of attendees that were unable to be scheduled for this occurrence
   **/
  public ActivityPlanOccurrenceListItem unscheduledAttendeesCount(Integer unscheduledAttendeesCount) {
    this.unscheduledAttendeesCount = unscheduledAttendeesCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of attendees that were unable to be scheduled for this occurrence")
  @JsonProperty("unscheduledAttendeesCount")
  public Integer getUnscheduledAttendeesCount() {
    return unscheduledAttendeesCount;
  }
  public void setUnscheduledAttendeesCount(Integer unscheduledAttendeesCount) {
    this.unscheduledAttendeesCount = unscheduledAttendeesCount;
  }


  /**
   * Whether this occurrence is edited
   **/
  public ActivityPlanOccurrenceListItem edited(Boolean edited) {
    this.edited = edited;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this occurrence is edited")
  @JsonProperty("edited")
  public Boolean getEdited() {
    return edited;
  }
  public void setEdited(Boolean edited) {
    this.edited = edited;
  }


  /**
   * The number of violations for this occurrence
   **/
  public ActivityPlanOccurrenceListItem violationCount(Integer violationCount) {
    this.violationCount = violationCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of violations for this occurrence")
  @JsonProperty("violationCount")
  public Integer getViolationCount() {
    return violationCount;
  }
  public void setViolationCount(Integer violationCount) {
    this.violationCount = violationCount;
  }


  /**
   * The index of the affected schedule summary in the schedules list
   **/
  public ActivityPlanOccurrenceListItem affectedScheduleIndexes(List<Integer> affectedScheduleIndexes) {
    this.affectedScheduleIndexes = affectedScheduleIndexes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The index of the affected schedule summary in the schedules list")
  @JsonProperty("affectedScheduleIndexes")
  public List<Integer> getAffectedScheduleIndexes() {
    return affectedScheduleIndexes;
  }
  public void setAffectedScheduleIndexes(List<Integer> affectedScheduleIndexes) {
    this.affectedScheduleIndexes = affectedScheduleIndexes;
  }


  /**
   * The user who started the job which created this occurrence. The id may be 'System' if it was an automated process
   **/
  public ActivityPlanOccurrenceListItem createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who started the job which created this occurrence. The id may be 'System' if it was an automated process")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
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
    ActivityPlanOccurrenceListItem activityPlanOccurrenceListItem = (ActivityPlanOccurrenceListItem) o;

    return Objects.equals(this.id, activityPlanOccurrenceListItem.id) &&
            Objects.equals(this.runDate, activityPlanOccurrenceListItem.runDate) &&
            Objects.equals(this.sessionDateRange, activityPlanOccurrenceListItem.sessionDateRange) &&
            Objects.equals(this.facilitated, activityPlanOccurrenceListItem.facilitated) &&
            Objects.equals(this.sessionCount, activityPlanOccurrenceListItem.sessionCount) &&
            Objects.equals(this.scheduledAttendeesCount, activityPlanOccurrenceListItem.scheduledAttendeesCount) &&
            Objects.equals(this.unscheduledAttendeesCount, activityPlanOccurrenceListItem.unscheduledAttendeesCount) &&
            Objects.equals(this.edited, activityPlanOccurrenceListItem.edited) &&
            Objects.equals(this.violationCount, activityPlanOccurrenceListItem.violationCount) &&
            Objects.equals(this.affectedScheduleIndexes, activityPlanOccurrenceListItem.affectedScheduleIndexes) &&
            Objects.equals(this.createdBy, activityPlanOccurrenceListItem.createdBy) &&
            Objects.equals(this.selfUri, activityPlanOccurrenceListItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, runDate, sessionDateRange, facilitated, sessionCount, scheduledAttendeesCount, unscheduledAttendeesCount, edited, violationCount, affectedScheduleIndexes, createdBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanOccurrenceListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    runDate: ").append(toIndentedString(runDate)).append("\n");
    sb.append("    sessionDateRange: ").append(toIndentedString(sessionDateRange)).append("\n");
    sb.append("    facilitated: ").append(toIndentedString(facilitated)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    scheduledAttendeesCount: ").append(toIndentedString(scheduledAttendeesCount)).append("\n");
    sb.append("    unscheduledAttendeesCount: ").append(toIndentedString(unscheduledAttendeesCount)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    violationCount: ").append(toIndentedString(violationCount)).append("\n");
    sb.append("    affectedScheduleIndexes: ").append(toIndentedString(affectedScheduleIndexes)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

