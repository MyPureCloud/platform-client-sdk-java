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
import com.mypurecloud.sdk.v2.model.DateRangeWithOptionalEnd;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import com.mypurecloud.sdk.v2.model.WorkPlanPatternResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanRotationAgentResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanRotationResponse
 */

public class WorkPlanRotationResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean enabled = null;
  private DateRangeWithOptionalEnd dateRange = null;
  private WorkPlanPatternResponse pattern = null;
  private Integer agentCount = null;
  private List<WorkPlanRotationAgentResponse> agents = new ArrayList<WorkPlanRotationAgentResponse>();
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WorkPlanRotationResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Whether the work plan rotation is enabled for scheduling
   **/
  public WorkPlanRotationResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the work plan rotation is enabled for scheduling")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The date range to which this work plan rotation applies
   **/
  public WorkPlanRotationResponse dateRange(DateRangeWithOptionalEnd dateRange) {
    this.dateRange = dateRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date range to which this work plan rotation applies")
  @JsonProperty("dateRange")
  public DateRangeWithOptionalEnd getDateRange() {
    return dateRange;
  }
  public void setDateRange(DateRangeWithOptionalEnd dateRange) {
    this.dateRange = dateRange;
  }

  
  /**
   * Pattern with ordered list of work plans that rotate on a weekly basis
   **/
  public WorkPlanRotationResponse pattern(WorkPlanPatternResponse pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pattern with ordered list of work plans that rotate on a weekly basis")
  @JsonProperty("pattern")
  public WorkPlanPatternResponse getPattern() {
    return pattern;
  }
  public void setPattern(WorkPlanPatternResponse pattern) {
    this.pattern = pattern;
  }

  
  /**
   * Number of agents in this work plan rotation
   **/
  public WorkPlanRotationResponse agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of agents in this work plan rotation")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }

  
  /**
   * Agents in this work plan rotation. Populate with expand=agents for GET WorkPlanRotationsList (defaults to empty list)
   **/
  public WorkPlanRotationResponse agents(List<WorkPlanRotationAgentResponse> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agents in this work plan rotation. Populate with expand=agents for GET WorkPlanRotationsList (defaults to empty list)")
  @JsonProperty("agents")
  public List<WorkPlanRotationAgentResponse> getAgents() {
    return agents;
  }
  public void setAgents(List<WorkPlanRotationAgentResponse> agents) {
    this.agents = agents;
  }

  
  /**
   * Version metadata for this work plan rotation
   **/
  public WorkPlanRotationResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for this work plan rotation")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanRotationResponse workPlanRotationResponse = (WorkPlanRotationResponse) o;
    return Objects.equals(this.id, workPlanRotationResponse.id) &&
        Objects.equals(this.name, workPlanRotationResponse.name) &&
        Objects.equals(this.enabled, workPlanRotationResponse.enabled) &&
        Objects.equals(this.dateRange, workPlanRotationResponse.dateRange) &&
        Objects.equals(this.pattern, workPlanRotationResponse.pattern) &&
        Objects.equals(this.agentCount, workPlanRotationResponse.agentCount) &&
        Objects.equals(this.agents, workPlanRotationResponse.agents) &&
        Objects.equals(this.metadata, workPlanRotationResponse.metadata) &&
        Objects.equals(this.selfUri, workPlanRotationResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, dateRange, pattern, agentCount, agents, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanRotationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

