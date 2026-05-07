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
import com.mypurecloud.sdk.v2.model.ActivityPlanSessionStructureReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanOccurrenceSessionsUsersStructureReference
 */

public class ActivityPlanOccurrenceSessionsUsersStructureReference  implements Serializable {
  
  private String id = null;
  private List<ActivityPlanSessionStructureReference> sessions = null;
  private String selfUri = null;

  public ActivityPlanOccurrenceSessionsUsersStructureReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sessions = new ArrayList<ActivityPlanSessionStructureReference>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ActivityPlanOccurrenceSessionsUsersStructureReference id(String id) {
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
   * The sessions to delete from this activity plan occurrence
   **/
  public ActivityPlanOccurrenceSessionsUsersStructureReference sessions(List<ActivityPlanSessionStructureReference> sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sessions to delete from this activity plan occurrence")
  @JsonProperty("sessions")
  public List<ActivityPlanSessionStructureReference> getSessions() {
    return sessions;
  }
  public void setSessions(List<ActivityPlanSessionStructureReference> sessions) {
    this.sessions = sessions;
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
    ActivityPlanOccurrenceSessionsUsersStructureReference activityPlanOccurrenceSessionsUsersStructureReference = (ActivityPlanOccurrenceSessionsUsersStructureReference) o;

    return Objects.equals(this.id, activityPlanOccurrenceSessionsUsersStructureReference.id) &&
            Objects.equals(this.sessions, activityPlanOccurrenceSessionsUsersStructureReference.sessions) &&
            Objects.equals(this.selfUri, activityPlanOccurrenceSessionsUsersStructureReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanOccurrenceSessionsUsersStructureReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

