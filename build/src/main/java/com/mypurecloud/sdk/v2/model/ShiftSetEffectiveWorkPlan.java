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
 * ShiftSetEffectiveWorkPlan
 */

public class ShiftSetEffectiveWorkPlan  implements Serializable {
  
  private String workPlanId = null;
  private String workPlanRotationId = null;
  private Integer positionInRotation = null;

  public ShiftSetEffectiveWorkPlan() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ShiftSetEffectiveWorkPlan(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the work plan
   **/
  public ShiftSetEffectiveWorkPlan workPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan")
  @JsonProperty("workPlanId")
  public String getWorkPlanId() {
    return workPlanId;
  }
  public void setWorkPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
  }


  /**
   * The ID of the work plan rotation
   **/
  public ShiftSetEffectiveWorkPlan workPlanRotationId(String workPlanRotationId) {
    this.workPlanRotationId = workPlanRotationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan rotation")
  @JsonProperty("workPlanRotationId")
  public String getWorkPlanRotationId() {
    return workPlanRotationId;
  }
  public void setWorkPlanRotationId(String workPlanRotationId) {
    this.workPlanRotationId = workPlanRotationId;
  }


  /**
   * The position in rotation
   **/
  public ShiftSetEffectiveWorkPlan positionInRotation(Integer positionInRotation) {
    this.positionInRotation = positionInRotation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The position in rotation")
  @JsonProperty("positionInRotation")
  public Integer getPositionInRotation() {
    return positionInRotation;
  }
  public void setPositionInRotation(Integer positionInRotation) {
    this.positionInRotation = positionInRotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftSetEffectiveWorkPlan shiftSetEffectiveWorkPlan = (ShiftSetEffectiveWorkPlan) o;

    return Objects.equals(this.workPlanId, shiftSetEffectiveWorkPlan.workPlanId) &&
            Objects.equals(this.workPlanRotationId, shiftSetEffectiveWorkPlan.workPlanRotationId) &&
            Objects.equals(this.positionInRotation, shiftSetEffectiveWorkPlan.positionInRotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlanId, workPlanRotationId, positionInRotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftSetEffectiveWorkPlan {\n");
    
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    workPlanRotationId: ").append(toIndentedString(workPlanRotationId)).append("\n");
    sb.append("    positionInRotation: ").append(toIndentedString(positionInRotation)).append("\n");
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

