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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ServiceLevel
 */

public class ServiceLevel  implements Serializable {
  
  private Double percentage = null;
  private Long durationMs = null;

  
  /**
   * The desired Service Level. A value between 0 and 1.
   **/
  public ServiceLevel percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The desired Service Level. A value between 0 and 1.")
  @JsonProperty("percentage")
  public Double getPercentage() {
    return percentage;
  }
  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  
  /**
   * Service Level target in milliseconds.
   **/
  public ServiceLevel durationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service Level target in milliseconds.")
  @JsonProperty("durationMs")
  public Long getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevel serviceLevel = (ServiceLevel) o;
    return Objects.equals(this.percentage, serviceLevel.percentage) &&
        Objects.equals(this.durationMs, serviceLevel.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevel {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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

