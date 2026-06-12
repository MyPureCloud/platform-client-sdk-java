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
 * WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged
 */

public class WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged  implements Serializable {
  
  private String agentId = null;
  private Date startDate = null;
  private Date endDate = null;

  public WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   **/
  public WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   **/
  public WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged wfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged = (WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged) o;

    return Objects.equals(this.agentId, wfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged.agentId) &&
            Objects.equals(this.startDate, wfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged.startDate) &&
            Objects.equals(this.endDate, wfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
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

