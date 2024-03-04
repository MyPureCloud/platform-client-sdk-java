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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.SchedulerMessageTypeSeverity;
import com.mypurecloud.sdk.v2.model.SetWrapperSyncTimeOffProperty;
import com.mypurecloud.sdk.v2.model.WfmServiceGoalImpactSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuSchedulingSettingsRequest
 */

public class BuSchedulingSettingsRequest  implements Serializable {
  
  private List<SchedulerMessageTypeSeverity> messageSeverities = new ArrayList<SchedulerMessageTypeSeverity>();
  private SetWrapperSyncTimeOffProperty syncTimeOffProperties = null;
  private WfmServiceGoalImpactSettings serviceGoalImpact = null;
  private Boolean allowWorkPlanPerMinuteGranularity = null;

  
  /**
   * Schedule generation message severity configuration
   **/
  public BuSchedulingSettingsRequest messageSeverities(List<SchedulerMessageTypeSeverity> messageSeverities) {
    this.messageSeverities = messageSeverities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule generation message severity configuration")
  @JsonProperty("messageSeverities")
  public List<SchedulerMessageTypeSeverity> getMessageSeverities() {
    return messageSeverities;
  }
  public void setMessageSeverities(List<SchedulerMessageTypeSeverity> messageSeverities) {
    this.messageSeverities = messageSeverities;
  }


  /**
   * Synchronize set of time off properties from scheduled activities to time off requests when the schedule is published.
   **/
  public BuSchedulingSettingsRequest syncTimeOffProperties(SetWrapperSyncTimeOffProperty syncTimeOffProperties) {
    this.syncTimeOffProperties = syncTimeOffProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Synchronize set of time off properties from scheduled activities to time off requests when the schedule is published.")
  @JsonProperty("syncTimeOffProperties")
  public SetWrapperSyncTimeOffProperty getSyncTimeOffProperties() {
    return syncTimeOffProperties;
  }
  public void setSyncTimeOffProperties(SetWrapperSyncTimeOffProperty syncTimeOffProperties) {
    this.syncTimeOffProperties = syncTimeOffProperties;
  }


  /**
   * Configures the max percent increase and decrease of service goals for this business unit
   **/
  public BuSchedulingSettingsRequest serviceGoalImpact(WfmServiceGoalImpactSettings serviceGoalImpact) {
    this.serviceGoalImpact = serviceGoalImpact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configures the max percent increase and decrease of service goals for this business unit")
  @JsonProperty("serviceGoalImpact")
  public WfmServiceGoalImpactSettings getServiceGoalImpact() {
    return serviceGoalImpact;
  }
  public void setServiceGoalImpact(WfmServiceGoalImpactSettings serviceGoalImpact) {
    this.serviceGoalImpact = serviceGoalImpact;
  }


  /**
   * Indicates whether or not per minute granularity for scheduling will be enabled for this business unit. Defaults to false.
   **/
  public BuSchedulingSettingsRequest allowWorkPlanPerMinuteGranularity(Boolean allowWorkPlanPerMinuteGranularity) {
    this.allowWorkPlanPerMinuteGranularity = allowWorkPlanPerMinuteGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not per minute granularity for scheduling will be enabled for this business unit. Defaults to false.")
  @JsonProperty("allowWorkPlanPerMinuteGranularity")
  public Boolean getAllowWorkPlanPerMinuteGranularity() {
    return allowWorkPlanPerMinuteGranularity;
  }
  public void setAllowWorkPlanPerMinuteGranularity(Boolean allowWorkPlanPerMinuteGranularity) {
    this.allowWorkPlanPerMinuteGranularity = allowWorkPlanPerMinuteGranularity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuSchedulingSettingsRequest buSchedulingSettingsRequest = (BuSchedulingSettingsRequest) o;

    return Objects.equals(this.messageSeverities, buSchedulingSettingsRequest.messageSeverities) &&
            Objects.equals(this.syncTimeOffProperties, buSchedulingSettingsRequest.syncTimeOffProperties) &&
            Objects.equals(this.serviceGoalImpact, buSchedulingSettingsRequest.serviceGoalImpact) &&
            Objects.equals(this.allowWorkPlanPerMinuteGranularity, buSchedulingSettingsRequest.allowWorkPlanPerMinuteGranularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSeverities, syncTimeOffProperties, serviceGoalImpact, allowWorkPlanPerMinuteGranularity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuSchedulingSettingsRequest {\n");
    
    sb.append("    messageSeverities: ").append(toIndentedString(messageSeverities)).append("\n");
    sb.append("    syncTimeOffProperties: ").append(toIndentedString(syncTimeOffProperties)).append("\n");
    sb.append("    serviceGoalImpact: ").append(toIndentedString(serviceGoalImpact)).append("\n");
    sb.append("    allowWorkPlanPerMinuteGranularity: ").append(toIndentedString(allowWorkPlanPerMinuteGranularity)).append("\n");
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

