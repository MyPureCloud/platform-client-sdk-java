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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScheduleSetRequest
 */

public class ScheduleSetRequest  implements Serializable {
  
  private String scheduleSetId = null;
  private Integer overrideAgentCount = null;

  public ScheduleSetRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleSetRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the schedule set
   **/
  public ScheduleSetRequest scheduleSetId(String scheduleSetId) {
    this.scheduleSetId = scheduleSetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the schedule set")
  @JsonProperty("scheduleSetId")
  public String getScheduleSetId() {
    return scheduleSetId;
  }
  public void setScheduleSetId(String scheduleSetId) {
    this.scheduleSetId = scheduleSetId;
  }


  /**
   * The overridden agent count for the schedule set
   **/
  public ScheduleSetRequest overrideAgentCount(Integer overrideAgentCount) {
    this.overrideAgentCount = overrideAgentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The overridden agent count for the schedule set")
  @JsonProperty("overrideAgentCount")
  public Integer getOverrideAgentCount() {
    return overrideAgentCount;
  }
  public void setOverrideAgentCount(Integer overrideAgentCount) {
    this.overrideAgentCount = overrideAgentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleSetRequest scheduleSetRequest = (ScheduleSetRequest) o;

    return Objects.equals(this.scheduleSetId, scheduleSetRequest.scheduleSetId) &&
            Objects.equals(this.overrideAgentCount, scheduleSetRequest.overrideAgentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleSetId, overrideAgentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleSetRequest {\n");
    
    sb.append("    scheduleSetId: ").append(toIndentedString(scheduleSetId)).append("\n");
    sb.append("    overrideAgentCount: ").append(toIndentedString(overrideAgentCount)).append("\n");
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

