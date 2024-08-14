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
import com.mypurecloud.sdk.v2.model.ActivityPlanAbandonRateImpactOverride;
import com.mypurecloud.sdk.v2.model.ActivityPlanAsaImpactOverride;
import com.mypurecloud.sdk.v2.model.ActivityPlanServiceLevelImpactOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActivityPlanServiceGoalImpactOverrides
 */

public class ActivityPlanServiceGoalImpactOverrides  implements Serializable {
  
  private ActivityPlanAbandonRateImpactOverride abandonRate = null;
  private ActivityPlanServiceLevelImpactOverride serviceLevel = null;
  private ActivityPlanAsaImpactOverride averageSpeedOfAnswer = null;

  
  /**
   * Abandon rate service goal override for the associated activity plan
   **/
  public ActivityPlanServiceGoalImpactOverrides abandonRate(ActivityPlanAbandonRateImpactOverride abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Abandon rate service goal override for the associated activity plan")
  @JsonProperty("abandonRate")
  public ActivityPlanAbandonRateImpactOverride getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(ActivityPlanAbandonRateImpactOverride abandonRate) {
    this.abandonRate = abandonRate;
  }


  /**
   * Service level goal override for the associated activity plan
   **/
  public ActivityPlanServiceGoalImpactOverrides serviceLevel(ActivityPlanServiceLevelImpactOverride serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Service level goal override for the associated activity plan")
  @JsonProperty("serviceLevel")
  public ActivityPlanServiceLevelImpactOverride getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ActivityPlanServiceLevelImpactOverride serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  /**
   * Average speed of answer service goal override for the associated activity plan
   **/
  public ActivityPlanServiceGoalImpactOverrides averageSpeedOfAnswer(ActivityPlanAsaImpactOverride averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average speed of answer service goal override for the associated activity plan")
  @JsonProperty("averageSpeedOfAnswer")
  public ActivityPlanAsaImpactOverride getAverageSpeedOfAnswer() {
    return averageSpeedOfAnswer;
  }
  public void setAverageSpeedOfAnswer(ActivityPlanAsaImpactOverride averageSpeedOfAnswer) {
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
    ActivityPlanServiceGoalImpactOverrides activityPlanServiceGoalImpactOverrides = (ActivityPlanServiceGoalImpactOverrides) o;

    return Objects.equals(this.abandonRate, activityPlanServiceGoalImpactOverrides.abandonRate) &&
            Objects.equals(this.serviceLevel, activityPlanServiceGoalImpactOverrides.serviceLevel) &&
            Objects.equals(this.averageSpeedOfAnswer, activityPlanServiceGoalImpactOverrides.averageSpeedOfAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonRate, serviceLevel, averageSpeedOfAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanServiceGoalImpactOverrides {\n");
    
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
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

