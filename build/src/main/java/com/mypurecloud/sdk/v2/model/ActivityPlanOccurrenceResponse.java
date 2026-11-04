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
import com.mypurecloud.sdk.v2.model.ActivityPlanOccurrenceSessionWithAttendees;
import com.mypurecloud.sdk.v2.model.ActivityPlanOccurrenceViolation;
import com.mypurecloud.sdk.v2.model.ActivityPlanUnscheduledAttendee;
import com.mypurecloud.sdk.v2.model.BuScheduleSummary;
import com.mypurecloud.sdk.v2.model.RequiredDateRange;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanOccurrenceResponse
 */

public class ActivityPlanOccurrenceResponse  implements Serializable {
  
  private String id = null;
  private Date runDate = null;
  private RequiredDateRange sessionDateRange = null;
  private Boolean facilitated = null;
  private Boolean edited = null;
  private List<ActivityPlanOccurrenceViolation> violations = null;
  private List<ActivityPlanOccurrenceSessionWithAttendees> sessions = null;
  private List<ActivityPlanUnscheduledAttendee> unscheduledAttendees = null;
  private List<BuScheduleSummary> affectedSchedules = null;
  private UserReference createdBy = null;
  private String selfUri = null;

  public ActivityPlanOccurrenceResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      violations = new ArrayList<ActivityPlanOccurrenceViolation>();
      sessions = new ArrayList<ActivityPlanOccurrenceSessionWithAttendees>();
      unscheduledAttendees = new ArrayList<ActivityPlanUnscheduledAttendee>();
      affectedSchedules = new ArrayList<BuScheduleSummary>();
    }
  }

  public ActivityPlanOccurrenceResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      violations = new ArrayList<ActivityPlanOccurrenceViolation>();
      sessions = new ArrayList<ActivityPlanOccurrenceSessionWithAttendees>();
      unscheduledAttendees = new ArrayList<ActivityPlanUnscheduledAttendee>();
      affectedSchedules = new ArrayList<BuScheduleSummary>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ActivityPlanOccurrenceResponse id(String id) {
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
  public ActivityPlanOccurrenceResponse runDate(Date runDate) {
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
  public ActivityPlanOccurrenceResponse sessionDateRange(RequiredDateRange sessionDateRange) {
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
  public ActivityPlanOccurrenceResponse facilitated(Boolean facilitated) {
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
   * Whether this occurrence is edited
   **/
  public ActivityPlanOccurrenceResponse edited(Boolean edited) {
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
   * The violations for this occurrence
   **/
  public ActivityPlanOccurrenceResponse violations(List<ActivityPlanOccurrenceViolation> violations) {
    this.violations = violations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The violations for this occurrence")
  @JsonProperty("violations")
  public List<ActivityPlanOccurrenceViolation> getViolations() {
    return violations;
  }
  public void setViolations(List<ActivityPlanOccurrenceViolation> violations) {
    this.violations = violations;
  }


  /**
   * The sessions scheduled by the run
   **/
  public ActivityPlanOccurrenceResponse sessions(List<ActivityPlanOccurrenceSessionWithAttendees> sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sessions scheduled by the run")
  @JsonProperty("sessions")
  public List<ActivityPlanOccurrenceSessionWithAttendees> getSessions() {
    return sessions;
  }
  public void setSessions(List<ActivityPlanOccurrenceSessionWithAttendees> sessions) {
    this.sessions = sessions;
  }


  /**
   * The attendees who could not be scheduled for this occurrence
   **/
  public ActivityPlanOccurrenceResponse unscheduledAttendees(List<ActivityPlanUnscheduledAttendee> unscheduledAttendees) {
    this.unscheduledAttendees = unscheduledAttendees;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attendees who could not be scheduled for this occurrence")
  @JsonProperty("unscheduledAttendees")
  public List<ActivityPlanUnscheduledAttendee> getUnscheduledAttendees() {
    return unscheduledAttendees;
  }
  public void setUnscheduledAttendees(List<ActivityPlanUnscheduledAttendee> unscheduledAttendees) {
    this.unscheduledAttendees = unscheduledAttendees;
  }


  /**
   * Summaries of the schedules affected by this occurrence
   **/
  public ActivityPlanOccurrenceResponse affectedSchedules(List<BuScheduleSummary> affectedSchedules) {
    this.affectedSchedules = affectedSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Summaries of the schedules affected by this occurrence")
  @JsonProperty("affectedSchedules")
  public List<BuScheduleSummary> getAffectedSchedules() {
    return affectedSchedules;
  }
  public void setAffectedSchedules(List<BuScheduleSummary> affectedSchedules) {
    this.affectedSchedules = affectedSchedules;
  }


  /**
   * The user who started the job which created this occurrence
   **/
  public ActivityPlanOccurrenceResponse createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who started the job which created this occurrence")
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
    ActivityPlanOccurrenceResponse activityPlanOccurrenceResponse = (ActivityPlanOccurrenceResponse) o;

    return Objects.equals(this.id, activityPlanOccurrenceResponse.id) &&
            Objects.equals(this.runDate, activityPlanOccurrenceResponse.runDate) &&
            Objects.equals(this.sessionDateRange, activityPlanOccurrenceResponse.sessionDateRange) &&
            Objects.equals(this.facilitated, activityPlanOccurrenceResponse.facilitated) &&
            Objects.equals(this.edited, activityPlanOccurrenceResponse.edited) &&
            Objects.equals(this.violations, activityPlanOccurrenceResponse.violations) &&
            Objects.equals(this.sessions, activityPlanOccurrenceResponse.sessions) &&
            Objects.equals(this.unscheduledAttendees, activityPlanOccurrenceResponse.unscheduledAttendees) &&
            Objects.equals(this.affectedSchedules, activityPlanOccurrenceResponse.affectedSchedules) &&
            Objects.equals(this.createdBy, activityPlanOccurrenceResponse.createdBy) &&
            Objects.equals(this.selfUri, activityPlanOccurrenceResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, runDate, sessionDateRange, facilitated, edited, violations, sessions, unscheduledAttendees, affectedSchedules, createdBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanOccurrenceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    runDate: ").append(toIndentedString(runDate)).append("\n");
    sb.append("    sessionDateRange: ").append(toIndentedString(sessionDateRange)).append("\n");
    sb.append("    facilitated: ").append(toIndentedString(facilitated)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    unscheduledAttendees: ").append(toIndentedString(unscheduledAttendees)).append("\n");
    sb.append("    affectedSchedules: ").append(toIndentedString(affectedSchedules)).append("\n");
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

