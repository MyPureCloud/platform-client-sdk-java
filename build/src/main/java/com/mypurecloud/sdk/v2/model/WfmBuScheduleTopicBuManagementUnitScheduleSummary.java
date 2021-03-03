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
import com.mypurecloud.sdk.v2.model.WfmBuScheduleTopicManagementUnit;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuScheduleTopicBuManagementUnitScheduleSummary
 */

public class WfmBuScheduleTopicBuManagementUnitScheduleSummary  implements Serializable {
  
  private WfmBuScheduleTopicManagementUnit managementUnit = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<WfmBuScheduleTopicUserReference> agents = new ArrayList<WfmBuScheduleTopicUserReference>();
  private Integer agentCount = null;

  
  /**
   **/
  public WfmBuScheduleTopicBuManagementUnitScheduleSummary managementUnit(WfmBuScheduleTopicManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnit")
  public WfmBuScheduleTopicManagementUnit getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(WfmBuScheduleTopicManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuManagementUnitScheduleSummary startDate(Date startDate) {
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
  public WfmBuScheduleTopicBuManagementUnitScheduleSummary endDate(Date endDate) {
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

  
  /**
   **/
  public WfmBuScheduleTopicBuManagementUnitScheduleSummary agents(List<WfmBuScheduleTopicUserReference> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agents")
  public List<WfmBuScheduleTopicUserReference> getAgents() {
    return agents;
  }
  public void setAgents(List<WfmBuScheduleTopicUserReference> agents) {
    this.agents = agents;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuManagementUnitScheduleSummary agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleTopicBuManagementUnitScheduleSummary wfmBuScheduleTopicBuManagementUnitScheduleSummary = (WfmBuScheduleTopicBuManagementUnitScheduleSummary) o;
    return Objects.equals(this.managementUnit, wfmBuScheduleTopicBuManagementUnitScheduleSummary.managementUnit) &&
        Objects.equals(this.startDate, wfmBuScheduleTopicBuManagementUnitScheduleSummary.startDate) &&
        Objects.equals(this.endDate, wfmBuScheduleTopicBuManagementUnitScheduleSummary.endDate) &&
        Objects.equals(this.agents, wfmBuScheduleTopicBuManagementUnitScheduleSummary.agents) &&
        Objects.equals(this.agentCount, wfmBuScheduleTopicBuManagementUnitScheduleSummary.agentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnit, startDate, endDate, agents, agentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleTopicBuManagementUnitScheduleSummary {\n");
    
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
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

