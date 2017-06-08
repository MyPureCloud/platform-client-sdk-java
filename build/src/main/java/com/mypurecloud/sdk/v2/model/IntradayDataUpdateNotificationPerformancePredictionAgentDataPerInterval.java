package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval
 */

public class IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval  implements Serializable {
  
  private BigDecimal interactingTimeSeconds = null;

  
  /**
   **/
  public IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval interactingTimeSeconds(BigDecimal interactingTimeSeconds) {
    this.interactingTimeSeconds = interactingTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interactingTimeSeconds")
  public BigDecimal getInteractingTimeSeconds() {
    return interactingTimeSeconds;
  }
  public void setInteractingTimeSeconds(BigDecimal interactingTimeSeconds) {
    this.interactingTimeSeconds = interactingTimeSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval intradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval = (IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval) o;
    return Objects.equals(this.interactingTimeSeconds, intradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval.interactingTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactingTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval {\n");
    
    sb.append("    interactingTimeSeconds: ").append(toIndentedString(interactingTimeSeconds)).append("\n");
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

