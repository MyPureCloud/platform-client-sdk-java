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
import com.mypurecloud.sdk.v2.model.SetWrapperActivityCategory;
import com.mypurecloud.sdk.v2.model.SetWrapperString;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SelfScheduleManagementUnitSettingsRequest
 */

public class SelfScheduleManagementUnitSettingsRequest  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean checkWorkPlanConstraints = null;
  private Integer minimumMinutesBeforeEarliestScheduleChange = null;
  private SetWrapperActivityCategory movableActivityCategories = null;
  private SetWrapperString movableActivityCodeIds = null;
  private WfmVersionedEntityMetadata metadata = null;

  public SelfScheduleManagementUnitSettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SelfScheduleManagementUnitSettingsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether agent self-scheduling is enabled for this management unit
   **/
  public SelfScheduleManagementUnitSettingsRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether agent self-scheduling is enabled for this management unit")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Whether self-scheduling is further restricted by work plan constraints
   **/
  public SelfScheduleManagementUnitSettingsRequest checkWorkPlanConstraints(Boolean checkWorkPlanConstraints) {
    this.checkWorkPlanConstraints = checkWorkPlanConstraints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether self-scheduling is further restricted by work plan constraints")
  @JsonProperty("checkWorkPlanConstraints")
  public Boolean getCheckWorkPlanConstraints() {
    return checkWorkPlanConstraints;
  }
  public void setCheckWorkPlanConstraints(Boolean checkWorkPlanConstraints) {
    this.checkWorkPlanConstraints = checkWorkPlanConstraints;
  }


  /**
   * The minimum number of minutes before the new activity start time to which the agent is allowed to self-schedule
   **/
  public SelfScheduleManagementUnitSettingsRequest minimumMinutesBeforeEarliestScheduleChange(Integer minimumMinutesBeforeEarliestScheduleChange) {
    this.minimumMinutesBeforeEarliestScheduleChange = minimumMinutesBeforeEarliestScheduleChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum number of minutes before the new activity start time to which the agent is allowed to self-schedule")
  @JsonProperty("minimumMinutesBeforeEarliestScheduleChange")
  public Integer getMinimumMinutesBeforeEarliestScheduleChange() {
    return minimumMinutesBeforeEarliestScheduleChange;
  }
  public void setMinimumMinutesBeforeEarliestScheduleChange(Integer minimumMinutesBeforeEarliestScheduleChange) {
    this.minimumMinutesBeforeEarliestScheduleChange = minimumMinutesBeforeEarliestScheduleChange;
  }


  /**
   * Movable activity categories enabled for self-scheduling
   **/
  public SelfScheduleManagementUnitSettingsRequest movableActivityCategories(SetWrapperActivityCategory movableActivityCategories) {
    this.movableActivityCategories = movableActivityCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Movable activity categories enabled for self-scheduling")
  @JsonProperty("movableActivityCategories")
  public SetWrapperActivityCategory getMovableActivityCategories() {
    return movableActivityCategories;
  }
  public void setMovableActivityCategories(SetWrapperActivityCategory movableActivityCategories) {
    this.movableActivityCategories = movableActivityCategories;
  }


  /**
   * Movable activity codes enabled for self-scheduling
   **/
  public SelfScheduleManagementUnitSettingsRequest movableActivityCodeIds(SetWrapperString movableActivityCodeIds) {
    this.movableActivityCodeIds = movableActivityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Movable activity codes enabled for self-scheduling")
  @JsonProperty("movableActivityCodeIds")
  public SetWrapperString getMovableActivityCodeIds() {
    return movableActivityCodeIds;
  }
  public void setMovableActivityCodeIds(SetWrapperString movableActivityCodeIds) {
    this.movableActivityCodeIds = movableActivityCodeIds;
  }


  /**
   * Version metadata for this management unit's self-scheduling settings
   **/
  public SelfScheduleManagementUnitSettingsRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this management unit's self-scheduling settings")
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
    SelfScheduleManagementUnitSettingsRequest selfScheduleManagementUnitSettingsRequest = (SelfScheduleManagementUnitSettingsRequest) o;

    return Objects.equals(this.enabled, selfScheduleManagementUnitSettingsRequest.enabled) &&
            Objects.equals(this.checkWorkPlanConstraints, selfScheduleManagementUnitSettingsRequest.checkWorkPlanConstraints) &&
            Objects.equals(this.minimumMinutesBeforeEarliestScheduleChange, selfScheduleManagementUnitSettingsRequest.minimumMinutesBeforeEarliestScheduleChange) &&
            Objects.equals(this.movableActivityCategories, selfScheduleManagementUnitSettingsRequest.movableActivityCategories) &&
            Objects.equals(this.movableActivityCodeIds, selfScheduleManagementUnitSettingsRequest.movableActivityCodeIds) &&
            Objects.equals(this.metadata, selfScheduleManagementUnitSettingsRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, checkWorkPlanConstraints, minimumMinutesBeforeEarliestScheduleChange, movableActivityCategories, movableActivityCodeIds, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleManagementUnitSettingsRequest {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    checkWorkPlanConstraints: ").append(toIndentedString(checkWorkPlanConstraints)).append("\n");
    sb.append("    minimumMinutesBeforeEarliestScheduleChange: ").append(toIndentedString(minimumMinutesBeforeEarliestScheduleChange)).append("\n");
    sb.append("    movableActivityCategories: ").append(toIndentedString(movableActivityCategories)).append("\n");
    sb.append("    movableActivityCodeIds: ").append(toIndentedString(movableActivityCodeIds)).append("\n");
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

