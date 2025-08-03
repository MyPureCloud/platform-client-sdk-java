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
 * LongTermRequirementsServiceGoal
 */

public class LongTermRequirementsServiceGoal  implements Serializable {
  
  private Boolean useAsaTarget = null;
  private Double targetAsaSec = null;
  private Boolean useServiceLevelTarget = null;
  private Double serviceLevelObjectiveSeconds = null;
  private Double serviceLevelGoalPercent = null;
  private Boolean useAbandonRateGoal = null;
  private Double abandonRateGoalPercent = null;

  public LongTermRequirementsServiceGoal() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Toggle for target average speed of answer from service goals
   **/
  public LongTermRequirementsServiceGoal useAsaTarget(Boolean useAsaTarget) {
    this.useAsaTarget = useAsaTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Toggle for target average speed of answer from service goals")
  @JsonProperty("useAsaTarget")
  public Boolean getUseAsaTarget() {
    return useAsaTarget;
  }
  public void setUseAsaTarget(Boolean useAsaTarget) {
    this.useAsaTarget = useAsaTarget;
  }


  /**
   * Value of target average speed of answer from service goals
   **/
  public LongTermRequirementsServiceGoal targetAsaSec(Double targetAsaSec) {
    this.targetAsaSec = targetAsaSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of target average speed of answer from service goals")
  @JsonProperty("targetAsaSec")
  public Double getTargetAsaSec() {
    return targetAsaSec;
  }
  public void setTargetAsaSec(Double targetAsaSec) {
    this.targetAsaSec = targetAsaSec;
  }


  /**
   * Toggle for service level objective from service goals
   **/
  public LongTermRequirementsServiceGoal useServiceLevelTarget(Boolean useServiceLevelTarget) {
    this.useServiceLevelTarget = useServiceLevelTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Toggle for service level objective from service goals")
  @JsonProperty("useServiceLevelTarget")
  public Boolean getUseServiceLevelTarget() {
    return useServiceLevelTarget;
  }
  public void setUseServiceLevelTarget(Boolean useServiceLevelTarget) {
    this.useServiceLevelTarget = useServiceLevelTarget;
  }


  /**
   * Value of service level objective seconds from service goals
   **/
  public LongTermRequirementsServiceGoal serviceLevelObjectiveSeconds(Double serviceLevelObjectiveSeconds) {
    this.serviceLevelObjectiveSeconds = serviceLevelObjectiveSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of service level objective seconds from service goals")
  @JsonProperty("serviceLevelObjectiveSeconds")
  public Double getServiceLevelObjectiveSeconds() {
    return serviceLevelObjectiveSeconds;
  }
  public void setServiceLevelObjectiveSeconds(Double serviceLevelObjectiveSeconds) {
    this.serviceLevelObjectiveSeconds = serviceLevelObjectiveSeconds;
  }


  /**
   * Value of service level objective percent from service goals
   **/
  public LongTermRequirementsServiceGoal serviceLevelGoalPercent(Double serviceLevelGoalPercent) {
    this.serviceLevelGoalPercent = serviceLevelGoalPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of service level objective percent from service goals")
  @JsonProperty("serviceLevelGoalPercent")
  public Double getServiceLevelGoalPercent() {
    return serviceLevelGoalPercent;
  }
  public void setServiceLevelGoalPercent(Double serviceLevelGoalPercent) {
    this.serviceLevelGoalPercent = serviceLevelGoalPercent;
  }


  /**
   * Toggle for abandon rate from service goals
   **/
  public LongTermRequirementsServiceGoal useAbandonRateGoal(Boolean useAbandonRateGoal) {
    this.useAbandonRateGoal = useAbandonRateGoal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Toggle for abandon rate from service goals")
  @JsonProperty("useAbandonRateGoal")
  public Boolean getUseAbandonRateGoal() {
    return useAbandonRateGoal;
  }
  public void setUseAbandonRateGoal(Boolean useAbandonRateGoal) {
    this.useAbandonRateGoal = useAbandonRateGoal;
  }


  /**
   * Value of abandon rate objective
   **/
  public LongTermRequirementsServiceGoal abandonRateGoalPercent(Double abandonRateGoalPercent) {
    this.abandonRateGoalPercent = abandonRateGoalPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of abandon rate objective")
  @JsonProperty("abandonRateGoalPercent")
  public Double getAbandonRateGoalPercent() {
    return abandonRateGoalPercent;
  }
  public void setAbandonRateGoalPercent(Double abandonRateGoalPercent) {
    this.abandonRateGoalPercent = abandonRateGoalPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTermRequirementsServiceGoal longTermRequirementsServiceGoal = (LongTermRequirementsServiceGoal) o;

    return Objects.equals(this.useAsaTarget, longTermRequirementsServiceGoal.useAsaTarget) &&
            Objects.equals(this.targetAsaSec, longTermRequirementsServiceGoal.targetAsaSec) &&
            Objects.equals(this.useServiceLevelTarget, longTermRequirementsServiceGoal.useServiceLevelTarget) &&
            Objects.equals(this.serviceLevelObjectiveSeconds, longTermRequirementsServiceGoal.serviceLevelObjectiveSeconds) &&
            Objects.equals(this.serviceLevelGoalPercent, longTermRequirementsServiceGoal.serviceLevelGoalPercent) &&
            Objects.equals(this.useAbandonRateGoal, longTermRequirementsServiceGoal.useAbandonRateGoal) &&
            Objects.equals(this.abandonRateGoalPercent, longTermRequirementsServiceGoal.abandonRateGoalPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAsaTarget, targetAsaSec, useServiceLevelTarget, serviceLevelObjectiveSeconds, serviceLevelGoalPercent, useAbandonRateGoal, abandonRateGoalPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermRequirementsServiceGoal {\n");
    
    sb.append("    useAsaTarget: ").append(toIndentedString(useAsaTarget)).append("\n");
    sb.append("    targetAsaSec: ").append(toIndentedString(targetAsaSec)).append("\n");
    sb.append("    useServiceLevelTarget: ").append(toIndentedString(useServiceLevelTarget)).append("\n");
    sb.append("    serviceLevelObjectiveSeconds: ").append(toIndentedString(serviceLevelObjectiveSeconds)).append("\n");
    sb.append("    serviceLevelGoalPercent: ").append(toIndentedString(serviceLevelGoalPercent)).append("\n");
    sb.append("    useAbandonRateGoal: ").append(toIndentedString(useAbandonRateGoal)).append("\n");
    sb.append("    abandonRateGoalPercent: ").append(toIndentedString(abandonRateGoalPercent)).append("\n");
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

