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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuManagementUnitScheduleSummary
 */

public class BuManagementUnitScheduleSummary  implements Serializable {
  
  private ManagementUnitReference managementUnit = null;
  private Integer agentCount = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<UserReference> agents = new ArrayList<UserReference>();

  
  /**
   * The management unit to which this summary applies
   **/
  public BuManagementUnitScheduleSummary managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit to which this summary applies")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }

  
  /**
   * The number of agents from this management unit that are in the schedule
   **/
  public BuManagementUnitScheduleSummary agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of agents from this management unit that are in the schedule")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }

  
  /**
   * The start of the schedule change in the management unit. Only populated in schedule update notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuManagementUnitScheduleSummary startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start of the schedule change in the management unit. Only populated in schedule update notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The end of the schedule change in the management unit. Only populated in schedule update notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuManagementUnitScheduleSummary endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end of the schedule change in the management unit. Only populated in schedule update notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The agents in the management unit who are part of this schedule, or in schedule change notifications, the agents that were changed. Note this will come back as an empty list unless the appropriate expand query parameter is passed
   **/
  public BuManagementUnitScheduleSummary agents(List<UserReference> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agents in the management unit who are part of this schedule, or in schedule change notifications, the agents that were changed. Note this will come back as an empty list unless the appropriate expand query parameter is passed")
  @JsonProperty("agents")
  public List<UserReference> getAgents() {
    return agents;
  }
  public void setAgents(List<UserReference> agents) {
    this.agents = agents;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuManagementUnitScheduleSummary buManagementUnitScheduleSummary = (BuManagementUnitScheduleSummary) o;
    return Objects.equals(this.managementUnit, buManagementUnitScheduleSummary.managementUnit) &&
        Objects.equals(this.agentCount, buManagementUnitScheduleSummary.agentCount) &&
        Objects.equals(this.startDate, buManagementUnitScheduleSummary.startDate) &&
        Objects.equals(this.endDate, buManagementUnitScheduleSummary.endDate) &&
        Objects.equals(this.agents, buManagementUnitScheduleSummary.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnit, agentCount, startDate, endDate, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuManagementUnitScheduleSummary {\n");
    
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

