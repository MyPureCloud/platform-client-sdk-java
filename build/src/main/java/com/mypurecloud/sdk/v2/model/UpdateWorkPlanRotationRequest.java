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
import com.mypurecloud.sdk.v2.model.UpdateWorkPlanRotationAgentRequest;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import com.mypurecloud.sdk.v2.model.WorkPlanPatternRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateWorkPlanRotationRequest
 */

public class UpdateWorkPlanRotationRequest  implements Serializable {
  
  private String name = null;
  private Boolean enabled = null;
  private DateRangeWithOptionalEnd dateRange = null;
  private List<UpdateWorkPlanRotationAgentRequest> agents = new ArrayList<UpdateWorkPlanRotationAgentRequest>();
  private WorkPlanPatternRequest pattern = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * Name of this work plan rotation
   **/
  public UpdateWorkPlanRotationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of this work plan rotation")
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
  public UpdateWorkPlanRotationRequest enabled(Boolean enabled) {
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
  public UpdateWorkPlanRotationRequest dateRange(DateRangeWithOptionalEnd dateRange) {
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
   * Agents in this work plan rotation
   **/
  public UpdateWorkPlanRotationRequest agents(List<UpdateWorkPlanRotationAgentRequest> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agents in this work plan rotation")
  @JsonProperty("agents")
  public List<UpdateWorkPlanRotationAgentRequest> getAgents() {
    return agents;
  }
  public void setAgents(List<UpdateWorkPlanRotationAgentRequest> agents) {
    this.agents = agents;
  }

  
  /**
   * Pattern with list of work plan IDs that rotate on a weekly basis
   **/
  public UpdateWorkPlanRotationRequest pattern(WorkPlanPatternRequest pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pattern with list of work plan IDs that rotate on a weekly basis")
  @JsonProperty("pattern")
  public WorkPlanPatternRequest getPattern() {
    return pattern;
  }
  public void setPattern(WorkPlanPatternRequest pattern) {
    this.pattern = pattern;
  }

  
  /**
   * Version metadata for this work plan rotation
   **/
  public UpdateWorkPlanRotationRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this work plan rotation")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkPlanRotationRequest updateWorkPlanRotationRequest = (UpdateWorkPlanRotationRequest) o;
    return Objects.equals(this.name, updateWorkPlanRotationRequest.name) &&
        Objects.equals(this.enabled, updateWorkPlanRotationRequest.enabled) &&
        Objects.equals(this.dateRange, updateWorkPlanRotationRequest.dateRange) &&
        Objects.equals(this.agents, updateWorkPlanRotationRequest.agents) &&
        Objects.equals(this.pattern, updateWorkPlanRotationRequest.pattern) &&
        Objects.equals(this.metadata, updateWorkPlanRotationRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enabled, dateRange, agents, pattern, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkPlanRotationRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

