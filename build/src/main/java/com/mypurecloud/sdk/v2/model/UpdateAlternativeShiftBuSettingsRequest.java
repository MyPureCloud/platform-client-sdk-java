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
import com.mypurecloud.sdk.v2.model.ListWrapperAlternativeShiftBuSettingsActivityCategory;
import com.mypurecloud.sdk.v2.model.ListWrapperAlternativeShiftBuSettingsGranularity;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateAlternativeShiftBuSettingsRequest
 */

public class UpdateAlternativeShiftBuSettingsRequest  implements Serializable {
  
  private ListWrapperAlternativeShiftBuSettingsGranularity enabledGranularities = null;
  private Integer minMinutesBeforeStartTime = null;
  private ListWrapperAlternativeShiftBuSettingsActivityCategory retainedActivityCategories = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The granularity at which alternative shifts is allowed. An empty list as the wrapped value will indicate alternative shifts is disabled
   **/
  public UpdateAlternativeShiftBuSettingsRequest enabledGranularities(ListWrapperAlternativeShiftBuSettingsGranularity enabledGranularities) {
    this.enabledGranularities = enabledGranularities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The granularity at which alternative shifts is allowed. An empty list as the wrapped value will indicate alternative shifts is disabled")
  @JsonProperty("enabledGranularities")
  public ListWrapperAlternativeShiftBuSettingsGranularity getEnabledGranularities() {
    return enabledGranularities;
  }
  public void setEnabledGranularities(ListWrapperAlternativeShiftBuSettingsGranularity enabledGranularities) {
    this.enabledGranularities = enabledGranularities;
  }


  /**
   * The minimum number of minutes before the start of a shift that an alternative shift can be automatically approved
   **/
  public UpdateAlternativeShiftBuSettingsRequest minMinutesBeforeStartTime(Integer minMinutesBeforeStartTime) {
    this.minMinutesBeforeStartTime = minMinutesBeforeStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum number of minutes before the start of a shift that an alternative shift can be automatically approved")
  @JsonProperty("minMinutesBeforeStartTime")
  public Integer getMinMinutesBeforeStartTime() {
    return minMinutesBeforeStartTime;
  }
  public void setMinMinutesBeforeStartTime(Integer minMinutesBeforeStartTime) {
    this.minMinutesBeforeStartTime = minMinutesBeforeStartTime;
  }


  /**
   * Categories of activities that are required to remain at the same time slot for the alternative shifts offered. An empty list indicates no retained activities
   **/
  public UpdateAlternativeShiftBuSettingsRequest retainedActivityCategories(ListWrapperAlternativeShiftBuSettingsActivityCategory retainedActivityCategories) {
    this.retainedActivityCategories = retainedActivityCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Categories of activities that are required to remain at the same time slot for the alternative shifts offered. An empty list indicates no retained activities")
  @JsonProperty("retainedActivityCategories")
  public ListWrapperAlternativeShiftBuSettingsActivityCategory getRetainedActivityCategories() {
    return retainedActivityCategories;
  }
  public void setRetainedActivityCategories(ListWrapperAlternativeShiftBuSettingsActivityCategory retainedActivityCategories) {
    this.retainedActivityCategories = retainedActivityCategories;
  }


  /**
   * Version metadata for this business unit's alternative shift settings
   **/
  public UpdateAlternativeShiftBuSettingsRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this business unit's alternative shift settings")
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
    UpdateAlternativeShiftBuSettingsRequest updateAlternativeShiftBuSettingsRequest = (UpdateAlternativeShiftBuSettingsRequest) o;

    return Objects.equals(this.enabledGranularities, updateAlternativeShiftBuSettingsRequest.enabledGranularities) &&
            Objects.equals(this.minMinutesBeforeStartTime, updateAlternativeShiftBuSettingsRequest.minMinutesBeforeStartTime) &&
            Objects.equals(this.retainedActivityCategories, updateAlternativeShiftBuSettingsRequest.retainedActivityCategories) &&
            Objects.equals(this.metadata, updateAlternativeShiftBuSettingsRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledGranularities, minMinutesBeforeStartTime, retainedActivityCategories, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAlternativeShiftBuSettingsRequest {\n");
    
    sb.append("    enabledGranularities: ").append(toIndentedString(enabledGranularities)).append("\n");
    sb.append("    minMinutesBeforeStartTime: ").append(toIndentedString(minMinutesBeforeStartTime)).append("\n");
    sb.append("    retainedActivityCategories: ").append(toIndentedString(retainedActivityCategories)).append("\n");
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

