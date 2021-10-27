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
 * SchedulingTestingOptionsRequest
 */

public class SchedulingTestingOptionsRequest  implements Serializable {
  
  private Boolean fastScheduling = null;
  private Boolean delayScheduling = null;
  private Boolean failScheduling = null;
  private Boolean populateWarnings = null;
  private Boolean populateDeprecatedWarnings = null;

  
  /**
   * Whether to enable fast scheduling
   **/
  public SchedulingTestingOptionsRequest fastScheduling(Boolean fastScheduling) {
    this.fastScheduling = fastScheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enable fast scheduling")
  @JsonProperty("fastScheduling")
  public Boolean getFastScheduling() {
    return fastScheduling;
  }
  public void setFastScheduling(Boolean fastScheduling) {
    this.fastScheduling = fastScheduling;
  }

  
  /**
   * Whether to force delayed scheduling
   **/
  public SchedulingTestingOptionsRequest delayScheduling(Boolean delayScheduling) {
    this.delayScheduling = delayScheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to force delayed scheduling")
  @JsonProperty("delayScheduling")
  public Boolean getDelayScheduling() {
    return delayScheduling;
  }
  public void setDelayScheduling(Boolean delayScheduling) {
    this.delayScheduling = delayScheduling;
  }

  
  /**
   * Whether to force scheduling to fail
   **/
  public SchedulingTestingOptionsRequest failScheduling(Boolean failScheduling) {
    this.failScheduling = failScheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to force scheduling to fail")
  @JsonProperty("failScheduling")
  public Boolean getFailScheduling() {
    return failScheduling;
  }
  public void setFailScheduling(Boolean failScheduling) {
    this.failScheduling = failScheduling;
  }

  
  /**
   * Whether to populate warnings in the generated schedule
   **/
  public SchedulingTestingOptionsRequest populateWarnings(Boolean populateWarnings) {
    this.populateWarnings = populateWarnings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to populate warnings in the generated schedule")
  @JsonProperty("populateWarnings")
  public Boolean getPopulateWarnings() {
    return populateWarnings;
  }
  public void setPopulateWarnings(Boolean populateWarnings) {
    this.populateWarnings = populateWarnings;
  }

  
  /**
   * Whether to populate deprecated warnings in the generated schedule
   **/
  public SchedulingTestingOptionsRequest populateDeprecatedWarnings(Boolean populateDeprecatedWarnings) {
    this.populateDeprecatedWarnings = populateDeprecatedWarnings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to populate deprecated warnings in the generated schedule")
  @JsonProperty("populateDeprecatedWarnings")
  public Boolean getPopulateDeprecatedWarnings() {
    return populateDeprecatedWarnings;
  }
  public void setPopulateDeprecatedWarnings(Boolean populateDeprecatedWarnings) {
    this.populateDeprecatedWarnings = populateDeprecatedWarnings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulingTestingOptionsRequest schedulingTestingOptionsRequest = (SchedulingTestingOptionsRequest) o;
    return Objects.equals(this.fastScheduling, schedulingTestingOptionsRequest.fastScheduling) &&
        Objects.equals(this.delayScheduling, schedulingTestingOptionsRequest.delayScheduling) &&
        Objects.equals(this.failScheduling, schedulingTestingOptionsRequest.failScheduling) &&
        Objects.equals(this.populateWarnings, schedulingTestingOptionsRequest.populateWarnings) &&
        Objects.equals(this.populateDeprecatedWarnings, schedulingTestingOptionsRequest.populateDeprecatedWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fastScheduling, delayScheduling, failScheduling, populateWarnings, populateDeprecatedWarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingTestingOptionsRequest {\n");
    
    sb.append("    fastScheduling: ").append(toIndentedString(fastScheduling)).append("\n");
    sb.append("    delayScheduling: ").append(toIndentedString(delayScheduling)).append("\n");
    sb.append("    failScheduling: ").append(toIndentedString(failScheduling)).append("\n");
    sb.append("    populateWarnings: ").append(toIndentedString(populateWarnings)).append("\n");
    sb.append("    populateDeprecatedWarnings: ").append(toIndentedString(populateDeprecatedWarnings)).append("\n");
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

