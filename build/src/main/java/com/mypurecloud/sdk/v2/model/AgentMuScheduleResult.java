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
import com.mypurecloud.sdk.v2.model.AgentMuScheduleItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentMuScheduleResult
 */

public class AgentMuScheduleResult  implements Serializable {
  
  private Date referenceStartDate = null;
  private List<AgentMuScheduleItem> agentSchedules = null;

  public AgentMuScheduleResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentSchedules = new ArrayList<AgentMuScheduleItem>();
    }
  }

  
  /**
   * The reference start date to use when calculating offsets for shifts and activities. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentMuScheduleResult referenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference start date to use when calculating offsets for shifts and activities. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("referenceStartDate")
  public Date getReferenceStartDate() {
    return referenceStartDate;
  }
  public void setReferenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
  }


  /**
   * The list of agent schedules for the management unit
   **/
  public AgentMuScheduleResult agentSchedules(List<AgentMuScheduleItem> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of agent schedules for the management unit")
  @JsonProperty("agentSchedules")
  public List<AgentMuScheduleItem> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<AgentMuScheduleItem> agentSchedules) {
    this.agentSchedules = agentSchedules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentMuScheduleResult agentMuScheduleResult = (AgentMuScheduleResult) o;

    return Objects.equals(this.referenceStartDate, agentMuScheduleResult.referenceStartDate) &&
            Objects.equals(this.agentSchedules, agentMuScheduleResult.agentSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceStartDate, agentSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentMuScheduleResult {\n");
    
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
    sb.append("    agentSchedules: ").append(toIndentedString(agentSchedules)).append("\n");
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

