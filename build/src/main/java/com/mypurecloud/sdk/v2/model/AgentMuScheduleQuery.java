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
import java.util.Date;

import java.io.Serializable;
/**
 * AgentMuScheduleQuery
 */

public class AgentMuScheduleQuery  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;

  public AgentMuScheduleQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The start date for the range to query the schedule's for the agent's management unit. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentMuScheduleQuery startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for the range to query the schedule's for the agent's management unit. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The end date for the range to query the schedule's for the agent's management unit. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AgentMuScheduleQuery endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date for the range to query the schedule's for the agent's management unit. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentMuScheduleQuery agentMuScheduleQuery = (AgentMuScheduleQuery) o;

    return Objects.equals(this.startDate, agentMuScheduleQuery.startDate) &&
            Objects.equals(this.endDate, agentMuScheduleQuery.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentMuScheduleQuery {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

