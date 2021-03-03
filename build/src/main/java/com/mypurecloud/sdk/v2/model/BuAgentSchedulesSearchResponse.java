package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BuAgentSchedulePublishedScheduleReference;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleSearchResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentSchedulesSearchResponse
 */

public class BuAgentSchedulesSearchResponse  implements Serializable {
  
  private List<BuAgentScheduleSearchResponse> agentSchedules = new ArrayList<BuAgentScheduleSearchResponse>();
  private String businessUnitTimeZone = null;
  private List<BuAgentSchedulePublishedScheduleReference> publishedSchedules = new ArrayList<BuAgentSchedulePublishedScheduleReference>();

  
  /**
   * The requested agent schedules
   **/
  public BuAgentSchedulesSearchResponse agentSchedules(List<BuAgentScheduleSearchResponse> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The requested agent schedules")
  @JsonProperty("agentSchedules")
  public List<BuAgentScheduleSearchResponse> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<BuAgentScheduleSearchResponse> agentSchedules) {
    this.agentSchedules = agentSchedules;
  }

  
  /**
   * The time zone configured for the business unit to which this schedule applies
   **/
  public BuAgentSchedulesSearchResponse businessUnitTimeZone(String businessUnitTimeZone) {
    this.businessUnitTimeZone = businessUnitTimeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone configured for the business unit to which this schedule applies")
  @JsonProperty("businessUnitTimeZone")
  public String getBusinessUnitTimeZone() {
    return businessUnitTimeZone;
  }
  public void setBusinessUnitTimeZone(String businessUnitTimeZone) {
    this.businessUnitTimeZone = businessUnitTimeZone;
  }

  
  /**
   * References to all published week schedules overlapping the start/end date query parameters
   **/
  public BuAgentSchedulesSearchResponse publishedSchedules(List<BuAgentSchedulePublishedScheduleReference> publishedSchedules) {
    this.publishedSchedules = publishedSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "References to all published week schedules overlapping the start/end date query parameters")
  @JsonProperty("publishedSchedules")
  public List<BuAgentSchedulePublishedScheduleReference> getPublishedSchedules() {
    return publishedSchedules;
  }
  public void setPublishedSchedules(List<BuAgentSchedulePublishedScheduleReference> publishedSchedules) {
    this.publishedSchedules = publishedSchedules;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentSchedulesSearchResponse buAgentSchedulesSearchResponse = (BuAgentSchedulesSearchResponse) o;
    return Objects.equals(this.agentSchedules, buAgentSchedulesSearchResponse.agentSchedules) &&
        Objects.equals(this.businessUnitTimeZone, buAgentSchedulesSearchResponse.businessUnitTimeZone) &&
        Objects.equals(this.publishedSchedules, buAgentSchedulesSearchResponse.publishedSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSchedules, businessUnitTimeZone, publishedSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentSchedulesSearchResponse {\n");
    
    sb.append("    agentSchedules: ").append(toIndentedString(agentSchedules)).append("\n");
    sb.append("    businessUnitTimeZone: ").append(toIndentedString(businessUnitTimeZone)).append("\n");
    sb.append("    publishedSchedules: ").append(toIndentedString(publishedSchedules)).append("\n");
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

