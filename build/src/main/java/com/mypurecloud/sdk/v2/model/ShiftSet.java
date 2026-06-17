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
import com.mypurecloud.sdk.v2.model.ScheduleBidScheduledShift;
import com.mypurecloud.sdk.v2.model.ShiftSetEffectiveWorkPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ShiftSet
 */

public class ShiftSet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ShiftSetEffectiveWorkPlan effectiveWorkPlan = null;
  private List<ScheduleBidScheduledShift> shifts = null;
  private Integer suggestedAgentCount = null;
  private Integer overrideAgentCount = null;

  public ShiftSet() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shifts = new ArrayList<ScheduleBidScheduledShift>();
    }
  }

  public ShiftSet(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      shifts = new ArrayList<ScheduleBidScheduledShift>();
    }
  }

  
  /**
   * The ID of the shift set
   **/
  public ShiftSet id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the shift set")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name given for the shift set
   **/
  public ShiftSet name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name given for the shift set")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The work plan or work plan rotation used for generating the shift set
   **/
  public ShiftSet effectiveWorkPlan(ShiftSetEffectiveWorkPlan effectiveWorkPlan) {
    this.effectiveWorkPlan = effectiveWorkPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The work plan or work plan rotation used for generating the shift set")
  @JsonProperty("effectiveWorkPlan")
  public ShiftSetEffectiveWorkPlan getEffectiveWorkPlan() {
    return effectiveWorkPlan;
  }
  public void setEffectiveWorkPlan(ShiftSetEffectiveWorkPlan effectiveWorkPlan) {
    this.effectiveWorkPlan = effectiveWorkPlan;
  }


  /**
   * The scheduled shifts
   **/
  public ShiftSet shifts(List<ScheduleBidScheduledShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The scheduled shifts")
  @JsonProperty("shifts")
  public List<ScheduleBidScheduledShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<ScheduleBidScheduledShift> shifts) {
    this.shifts = shifts;
  }


  /**
   * The suggested agent count
   **/
  public ShiftSet suggestedAgentCount(Integer suggestedAgentCount) {
    this.suggestedAgentCount = suggestedAgentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The suggested agent count")
  @JsonProperty("suggestedAgentCount")
  public Integer getSuggestedAgentCount() {
    return suggestedAgentCount;
  }
  public void setSuggestedAgentCount(Integer suggestedAgentCount) {
    this.suggestedAgentCount = suggestedAgentCount;
  }


  /**
   * The override agent count. If it is null, it falls back to using the suggestedAgentCount
   **/
  public ShiftSet overrideAgentCount(Integer overrideAgentCount) {
    this.overrideAgentCount = overrideAgentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The override agent count. If it is null, it falls back to using the suggestedAgentCount")
  @JsonProperty("overrideAgentCount")
  public Integer getOverrideAgentCount() {
    return overrideAgentCount;
  }
  public void setOverrideAgentCount(Integer overrideAgentCount) {
    this.overrideAgentCount = overrideAgentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftSet shiftSet = (ShiftSet) o;

    return Objects.equals(this.id, shiftSet.id) &&
            Objects.equals(this.name, shiftSet.name) &&
            Objects.equals(this.effectiveWorkPlan, shiftSet.effectiveWorkPlan) &&
            Objects.equals(this.shifts, shiftSet.shifts) &&
            Objects.equals(this.suggestedAgentCount, shiftSet.suggestedAgentCount) &&
            Objects.equals(this.overrideAgentCount, shiftSet.overrideAgentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, effectiveWorkPlan, shifts, suggestedAgentCount, overrideAgentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effectiveWorkPlan: ").append(toIndentedString(effectiveWorkPlan)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    suggestedAgentCount: ").append(toIndentedString(suggestedAgentCount)).append("\n");
    sb.append("    overrideAgentCount: ").append(toIndentedString(overrideAgentCount)).append("\n");
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

