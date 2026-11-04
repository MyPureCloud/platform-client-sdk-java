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
import com.mypurecloud.sdk.v2.model.ActivityPlanOccurrenceListItem;
import com.mypurecloud.sdk.v2.model.BuScheduleSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityPlanOccurrenceListing
 */

public class ActivityPlanOccurrenceListing  implements Serializable {
  
  private List<ActivityPlanOccurrenceListItem> entities = null;
  private List<BuScheduleSummary> schedules = null;

  public ActivityPlanOccurrenceListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ActivityPlanOccurrenceListItem>();
      schedules = new ArrayList<BuScheduleSummary>();
    }
  }

  public ActivityPlanOccurrenceListing(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<ActivityPlanOccurrenceListItem>();
      schedules = new ArrayList<BuScheduleSummary>();
    }
  }

  
  /**
   **/
  public ActivityPlanOccurrenceListing entities(List<ActivityPlanOccurrenceListItem> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ActivityPlanOccurrenceListItem> getEntities() {
    return entities;
  }
  public void setEntities(List<ActivityPlanOccurrenceListItem> entities) {
    this.entities = entities;
  }


  /**
   * A list of schedules to which the sessions are attached. Reference this by index to resolve the schedule for a particular session
   **/
  public ActivityPlanOccurrenceListing schedules(List<BuScheduleSummary> schedules) {
    this.schedules = schedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of schedules to which the sessions are attached. Reference this by index to resolve the schedule for a particular session")
  @JsonProperty("schedules")
  public List<BuScheduleSummary> getSchedules() {
    return schedules;
  }
  public void setSchedules(List<BuScheduleSummary> schedules) {
    this.schedules = schedules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityPlanOccurrenceListing activityPlanOccurrenceListing = (ActivityPlanOccurrenceListing) o;

    return Objects.equals(this.entities, activityPlanOccurrenceListing.entities) &&
            Objects.equals(this.schedules, activityPlanOccurrenceListing.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanOccurrenceListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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

