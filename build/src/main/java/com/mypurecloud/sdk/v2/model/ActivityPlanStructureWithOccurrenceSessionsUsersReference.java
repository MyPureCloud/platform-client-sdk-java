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
import com.mypurecloud.sdk.v2.model.ActivityPlanOccurrenceSessionsUsersStructureReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanStructureWithOccurrenceSessionsUsersReference
 */

public class ActivityPlanStructureWithOccurrenceSessionsUsersReference  implements Serializable {
  
  private String id = null;
  private List<ActivityPlanOccurrenceSessionsUsersStructureReference> occurrences = null;
  private String selfUri = null;

  public ActivityPlanStructureWithOccurrenceSessionsUsersReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      occurrences = new ArrayList<ActivityPlanOccurrenceSessionsUsersStructureReference>();
    }
  }

  public ActivityPlanStructureWithOccurrenceSessionsUsersReference(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      occurrences = new ArrayList<ActivityPlanOccurrenceSessionsUsersStructureReference>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ActivityPlanStructureWithOccurrenceSessionsUsersReference id(String id) {
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
   * The occurrences to delete from this activity plan
   **/
  public ActivityPlanStructureWithOccurrenceSessionsUsersReference occurrences(List<ActivityPlanOccurrenceSessionsUsersStructureReference> occurrences) {
    this.occurrences = occurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The occurrences to delete from this activity plan")
  @JsonProperty("occurrences")
  public List<ActivityPlanOccurrenceSessionsUsersStructureReference> getOccurrences() {
    return occurrences;
  }
  public void setOccurrences(List<ActivityPlanOccurrenceSessionsUsersStructureReference> occurrences) {
    this.occurrences = occurrences;
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
    ActivityPlanStructureWithOccurrenceSessionsUsersReference activityPlanStructureWithOccurrenceSessionsUsersReference = (ActivityPlanStructureWithOccurrenceSessionsUsersReference) o;

    return Objects.equals(this.id, activityPlanStructureWithOccurrenceSessionsUsersReference.id) &&
            Objects.equals(this.occurrences, activityPlanStructureWithOccurrenceSessionsUsersReference.occurrences) &&
            Objects.equals(this.selfUri, activityPlanStructureWithOccurrenceSessionsUsersReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, occurrences, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanStructureWithOccurrenceSessionsUsersReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
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

