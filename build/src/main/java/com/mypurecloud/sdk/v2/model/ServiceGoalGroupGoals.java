package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmAverageSpeedOfAnswer;
import com.mypurecloud.sdk.v2.model.WfmServiceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Goals defined for the service goal group
 */
@ApiModel(description = "Goals defined for the service goal group")

public class ServiceGoalGroupGoals  implements Serializable {
  
  private WfmServiceLevel serviceLevel = null;
  private WfmAverageSpeedOfAnswer averageSpeedOfAnswer = null;

  
  /**
   * Service level targets for this service goal group
   **/
  public ServiceGoalGroupGoals serviceLevel(WfmServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Service level targets for this service goal group")
  @JsonProperty("serviceLevel")
  public WfmServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(WfmServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  
  /**
   * Average speed of answer targets for this service goal group
   **/
  public ServiceGoalGroupGoals averageSpeedOfAnswer(WfmAverageSpeedOfAnswer averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average speed of answer targets for this service goal group")
  @JsonProperty("averageSpeedOfAnswer")
  public WfmAverageSpeedOfAnswer getAverageSpeedOfAnswer() {
    return averageSpeedOfAnswer;
  }
  public void setAverageSpeedOfAnswer(WfmAverageSpeedOfAnswer averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceGoalGroupGoals serviceGoalGroupGoals = (ServiceGoalGroupGoals) o;
    return Objects.equals(this.serviceLevel, serviceGoalGroupGoals.serviceLevel) &&
        Objects.equals(this.averageSpeedOfAnswer, serviceGoalGroupGoals.averageSpeedOfAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevel, averageSpeedOfAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGoalGroupGoals {\n");
    
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    averageSpeedOfAnswer: ").append(toIndentedString(averageSpeedOfAnswer)).append("\n");
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

