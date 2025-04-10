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
import com.mypurecloud.sdk.v2.model.WfmServiceGoalImpact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmServiceGoalImpactSettings
 */

public class WfmServiceGoalImpactSettings  implements Serializable {
  
  private WfmServiceGoalImpact serviceLevel = null;
  private WfmServiceGoalImpact averageSpeedOfAnswer = null;
  private WfmServiceGoalImpact abandonRate = null;

  public WfmServiceGoalImpactSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Allowed service level percent increase and decrease
   **/
  public WfmServiceGoalImpactSettings serviceLevel(WfmServiceGoalImpact serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Allowed service level percent increase and decrease")
  @JsonProperty("serviceLevel")
  public WfmServiceGoalImpact getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(WfmServiceGoalImpact serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  /**
   * Allowed average speed of answer percent increase and decrease
   **/
  public WfmServiceGoalImpactSettings averageSpeedOfAnswer(WfmServiceGoalImpact averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Allowed average speed of answer percent increase and decrease")
  @JsonProperty("averageSpeedOfAnswer")
  public WfmServiceGoalImpact getAverageSpeedOfAnswer() {
    return averageSpeedOfAnswer;
  }
  public void setAverageSpeedOfAnswer(WfmServiceGoalImpact averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
  }


  /**
   * Allowed abandon rate percent increase and decrease
   **/
  public WfmServiceGoalImpactSettings abandonRate(WfmServiceGoalImpact abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Allowed abandon rate percent increase and decrease")
  @JsonProperty("abandonRate")
  public WfmServiceGoalImpact getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(WfmServiceGoalImpact abandonRate) {
    this.abandonRate = abandonRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmServiceGoalImpactSettings wfmServiceGoalImpactSettings = (WfmServiceGoalImpactSettings) o;

    return Objects.equals(this.serviceLevel, wfmServiceGoalImpactSettings.serviceLevel) &&
            Objects.equals(this.averageSpeedOfAnswer, wfmServiceGoalImpactSettings.averageSpeedOfAnswer) &&
            Objects.equals(this.abandonRate, wfmServiceGoalImpactSettings.abandonRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevel, averageSpeedOfAnswer, abandonRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmServiceGoalImpactSettings {\n");
    
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    averageSpeedOfAnswer: ").append(toIndentedString(averageSpeedOfAnswer)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
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

