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
import com.mypurecloud.sdk.v2.model.AgentScheduleShiftActivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentMuScheduleShift
 */

public class AgentMuScheduleShift  implements Serializable {
  
  private Integer startOffsetMinutes = null;
  private Integer lengthMinutes = null;
  private List<AgentScheduleShiftActivity> activities = null;

  public AgentMuScheduleShift() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activities = new ArrayList<AgentScheduleShiftActivity>();
    }
  }

  
  /**
   * The start offset of the shift, relative to referenceStartDate at the top level
   **/
  public AgentMuScheduleShift startOffsetMinutes(Integer startOffsetMinutes) {
    this.startOffsetMinutes = startOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start offset of the shift, relative to referenceStartDate at the top level")
  @JsonProperty("startOffsetMinutes")
  public Integer getStartOffsetMinutes() {
    return startOffsetMinutes;
  }
  public void setStartOffsetMinutes(Integer startOffsetMinutes) {
    this.startOffsetMinutes = startOffsetMinutes;
  }


  /**
   * The length of the shift in minutes
   **/
  public AgentMuScheduleShift lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the shift in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The activities associated with this shift
   **/
  public AgentMuScheduleShift activities(List<AgentScheduleShiftActivity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activities associated with this shift")
  @JsonProperty("activities")
  public List<AgentScheduleShiftActivity> getActivities() {
    return activities;
  }
  public void setActivities(List<AgentScheduleShiftActivity> activities) {
    this.activities = activities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentMuScheduleShift agentMuScheduleShift = (AgentMuScheduleShift) o;

    return Objects.equals(this.startOffsetMinutes, agentMuScheduleShift.startOffsetMinutes) &&
            Objects.equals(this.lengthMinutes, agentMuScheduleShift.lengthMinutes) &&
            Objects.equals(this.activities, agentMuScheduleShift.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startOffsetMinutes, lengthMinutes, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentMuScheduleShift {\n");
    
    sb.append("    startOffsetMinutes: ").append(toIndentedString(startOffsetMinutes)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

