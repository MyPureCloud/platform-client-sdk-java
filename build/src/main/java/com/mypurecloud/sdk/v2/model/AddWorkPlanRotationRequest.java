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
import com.mypurecloud.sdk.v2.model.AddWorkPlanRotationAgentRequest;
import com.mypurecloud.sdk.v2.model.DateRangeWithOptionalEnd;
import com.mypurecloud.sdk.v2.model.WorkPlanPatternRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AddWorkPlanRotationRequest
 */

public class AddWorkPlanRotationRequest  implements Serializable {
  
  private String name = null;
  private DateRangeWithOptionalEnd dateRange = null;
  private List<AddWorkPlanRotationAgentRequest> agents = new ArrayList<AddWorkPlanRotationAgentRequest>();
  private WorkPlanPatternRequest pattern = null;

  
  /**
   * Name of this work plan rotation
   **/
  public AddWorkPlanRotationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of this work plan rotation")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The date range to which this work plan rotation applies
   **/
  public AddWorkPlanRotationRequest dateRange(DateRangeWithOptionalEnd dateRange) {
    this.dateRange = dateRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date range to which this work plan rotation applies")
  @JsonProperty("dateRange")
  public DateRangeWithOptionalEnd getDateRange() {
    return dateRange;
  }
  public void setDateRange(DateRangeWithOptionalEnd dateRange) {
    this.dateRange = dateRange;
  }

  
  /**
   * Agents in this work plan rotation
   **/
  public AddWorkPlanRotationRequest agents(List<AddWorkPlanRotationAgentRequest> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agents in this work plan rotation")
  @JsonProperty("agents")
  public List<AddWorkPlanRotationAgentRequest> getAgents() {
    return agents;
  }
  public void setAgents(List<AddWorkPlanRotationAgentRequest> agents) {
    this.agents = agents;
  }

  
  /**
   * Pattern with list of work plan IDs that rotate on a weekly basis
   **/
  public AddWorkPlanRotationRequest pattern(WorkPlanPatternRequest pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pattern with list of work plan IDs that rotate on a weekly basis")
  @JsonProperty("pattern")
  public WorkPlanPatternRequest getPattern() {
    return pattern;
  }
  public void setPattern(WorkPlanPatternRequest pattern) {
    this.pattern = pattern;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddWorkPlanRotationRequest addWorkPlanRotationRequest = (AddWorkPlanRotationRequest) o;
    return Objects.equals(this.name, addWorkPlanRotationRequest.name) &&
        Objects.equals(this.dateRange, addWorkPlanRotationRequest.dateRange) &&
        Objects.equals(this.agents, addWorkPlanRotationRequest.agents) &&
        Objects.equals(this.pattern, addWorkPlanRotationRequest.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dateRange, agents, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWorkPlanRotationRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

