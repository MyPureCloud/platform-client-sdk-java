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
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupData;
import com.mypurecloud.sdk.v2.model.LongTermForecastPlanningGroupData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuImportShortTermForecastSchema
 */

public class BuImportShortTermForecastSchema  implements Serializable {
  
  private String description = null;
  private Integer weekCount = null;
  private List<ForecastPlanningGroupData> planningGroups = new ArrayList<ForecastPlanningGroupData>();
  private List<LongTermForecastPlanningGroupData> longTermPlanningGroups = new ArrayList<LongTermForecastPlanningGroupData>();
  private Boolean canUseForScheduling = null;

  
  /**
   * The description for the forecast
   **/
  public BuImportShortTermForecastSchema description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description for the forecast")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The number of weeks covered by the forecast
   **/
  public BuImportShortTermForecastSchema weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of weeks covered by the forecast")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   * The short term planning group data
   **/
  public BuImportShortTermForecastSchema planningGroups(List<ForecastPlanningGroupData> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The short term planning group data")
  @JsonProperty("planningGroups")
  public List<ForecastPlanningGroupData> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<ForecastPlanningGroupData> planningGroups) {
    this.planningGroups = planningGroups;
  }

  
  /**
   * The long term planning group data
   **/
  public BuImportShortTermForecastSchema longTermPlanningGroups(List<LongTermForecastPlanningGroupData> longTermPlanningGroups) {
    this.longTermPlanningGroups = longTermPlanningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The long term planning group data")
  @JsonProperty("longTermPlanningGroups")
  public List<LongTermForecastPlanningGroupData> getLongTermPlanningGroups() {
    return longTermPlanningGroups;
  }
  public void setLongTermPlanningGroups(List<LongTermForecastPlanningGroupData> longTermPlanningGroups) {
    this.longTermPlanningGroups = longTermPlanningGroups;
  }

  
  /**
   * Whether this forecast can be used for scheduling
   **/
  public BuImportShortTermForecastSchema canUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this forecast can be used for scheduling")
  @JsonProperty("canUseForScheduling")
  public Boolean getCanUseForScheduling() {
    return canUseForScheduling;
  }
  public void setCanUseForScheduling(Boolean canUseForScheduling) {
    this.canUseForScheduling = canUseForScheduling;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuImportShortTermForecastSchema buImportShortTermForecastSchema = (BuImportShortTermForecastSchema) o;
    return Objects.equals(this.description, buImportShortTermForecastSchema.description) &&
        Objects.equals(this.weekCount, buImportShortTermForecastSchema.weekCount) &&
        Objects.equals(this.planningGroups, buImportShortTermForecastSchema.planningGroups) &&
        Objects.equals(this.longTermPlanningGroups, buImportShortTermForecastSchema.longTermPlanningGroups) &&
        Objects.equals(this.canUseForScheduling, buImportShortTermForecastSchema.canUseForScheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, weekCount, planningGroups, longTermPlanningGroups, canUseForScheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuImportShortTermForecastSchema {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
    sb.append("    longTermPlanningGroups: ").append(toIndentedString(longTermPlanningGroups)).append("\n");
    sb.append("    canUseForScheduling: ").append(toIndentedString(canUseForScheduling)).append("\n");
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

