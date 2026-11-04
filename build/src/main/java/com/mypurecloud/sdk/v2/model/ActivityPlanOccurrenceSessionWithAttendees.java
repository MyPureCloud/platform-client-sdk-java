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
import com.mypurecloud.sdk.v2.model.ActivityPlanSessionViolation;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanOccurrenceSessionWithAttendees
 */

public class ActivityPlanOccurrenceSessionWithAttendees  implements Serializable {
  
  private String id = null;
  private Boolean edited = null;
  private List<ActivityPlanSessionViolation> violations = null;
  private List<UserReference> attendees = null;
  private String selfUri = null;

  public ActivityPlanOccurrenceSessionWithAttendees() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      violations = new ArrayList<ActivityPlanSessionViolation>();
      attendees = new ArrayList<UserReference>();
    }
  }

  public ActivityPlanOccurrenceSessionWithAttendees(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      violations = new ArrayList<ActivityPlanSessionViolation>();
      attendees = new ArrayList<UserReference>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ActivityPlanOccurrenceSessionWithAttendees id(String id) {
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
   * Whether this session is edited
   **/
  public ActivityPlanOccurrenceSessionWithAttendees edited(Boolean edited) {
    this.edited = edited;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this session is edited")
  @JsonProperty("edited")
  public Boolean getEdited() {
    return edited;
  }
  public void setEdited(Boolean edited) {
    this.edited = edited;
  }


  /**
   * The violations for this session
   **/
  public ActivityPlanOccurrenceSessionWithAttendees violations(List<ActivityPlanSessionViolation> violations) {
    this.violations = violations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The violations for this session")
  @JsonProperty("violations")
  public List<ActivityPlanSessionViolation> getViolations() {
    return violations;
  }
  public void setViolations(List<ActivityPlanSessionViolation> violations) {
    this.violations = violations;
  }


  /**
   * The attendees associated with this session
   **/
  public ActivityPlanOccurrenceSessionWithAttendees attendees(List<UserReference> attendees) {
    this.attendees = attendees;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attendees associated with this session")
  @JsonProperty("attendees")
  public List<UserReference> getAttendees() {
    return attendees;
  }
  public void setAttendees(List<UserReference> attendees) {
    this.attendees = attendees;
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
    ActivityPlanOccurrenceSessionWithAttendees activityPlanOccurrenceSessionWithAttendees = (ActivityPlanOccurrenceSessionWithAttendees) o;

    return Objects.equals(this.id, activityPlanOccurrenceSessionWithAttendees.id) &&
            Objects.equals(this.edited, activityPlanOccurrenceSessionWithAttendees.edited) &&
            Objects.equals(this.violations, activityPlanOccurrenceSessionWithAttendees.violations) &&
            Objects.equals(this.attendees, activityPlanOccurrenceSessionWithAttendees.attendees) &&
            Objects.equals(this.selfUri, activityPlanOccurrenceSessionWithAttendees.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, edited, violations, attendees, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanOccurrenceSessionWithAttendees {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
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

