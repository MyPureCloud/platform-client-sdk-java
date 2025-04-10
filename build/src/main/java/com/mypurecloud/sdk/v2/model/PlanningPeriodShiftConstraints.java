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

import java.io.Serializable;
/**
 * PlanningPeriodShiftConstraints
 */

public class PlanningPeriodShiftConstraints  implements Serializable {
  
  private Boolean enabled = null;
  private Integer minimumCount = null;
  private Integer maximumCount = null;

  public PlanningPeriodShiftConstraints() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether shifts per planning period is enabled. This field is non-nullable on the response
   **/
  public PlanningPeriodShiftConstraints enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether shifts per planning period is enabled. This field is non-nullable on the response")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The minimum number of shifts required per planning period. This field is non-nullable on the response
   **/
  public PlanningPeriodShiftConstraints minimumCount(Integer minimumCount) {
    this.minimumCount = minimumCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum number of shifts required per planning period. This field is non-nullable on the response")
  @JsonProperty("minimumCount")
  public Integer getMinimumCount() {
    return minimumCount;
  }
  public void setMinimumCount(Integer minimumCount) {
    this.minimumCount = minimumCount;
  }


  /**
   * The maximum number of shifts allowed per planning period. This field is non-nullable on the response
   **/
  public PlanningPeriodShiftConstraints maximumCount(Integer maximumCount) {
    this.maximumCount = maximumCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of shifts allowed per planning period. This field is non-nullable on the response")
  @JsonProperty("maximumCount")
  public Integer getMaximumCount() {
    return maximumCount;
  }
  public void setMaximumCount(Integer maximumCount) {
    this.maximumCount = maximumCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanningPeriodShiftConstraints planningPeriodShiftConstraints = (PlanningPeriodShiftConstraints) o;

    return Objects.equals(this.enabled, planningPeriodShiftConstraints.enabled) &&
            Objects.equals(this.minimumCount, planningPeriodShiftConstraints.minimumCount) &&
            Objects.equals(this.maximumCount, planningPeriodShiftConstraints.maximumCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minimumCount, maximumCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningPeriodShiftConstraints {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minimumCount: ").append(toIndentedString(minimumCount)).append("\n");
    sb.append("    maximumCount: ").append(toIndentedString(maximumCount)).append("\n");
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

