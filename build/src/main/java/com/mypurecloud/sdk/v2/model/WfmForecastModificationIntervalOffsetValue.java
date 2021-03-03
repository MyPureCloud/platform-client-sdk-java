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
 * Override the value of a single interval in a forecast
 */
@ApiModel(description = "Override the value of a single interval in a forecast")

public class WfmForecastModificationIntervalOffsetValue  implements Serializable {
  
  private Integer intervalIndex = null;
  private Double value = null;

  
  /**
   * The number of 15 minute intervals past referenceStartDate to which to apply this modification
   **/
  public WfmForecastModificationIntervalOffsetValue intervalIndex(Integer intervalIndex) {
    this.intervalIndex = intervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of 15 minute intervals past referenceStartDate to which to apply this modification")
  @JsonProperty("intervalIndex")
  public Integer getIntervalIndex() {
    return intervalIndex;
  }
  public void setIntervalIndex(Integer intervalIndex) {
    this.intervalIndex = intervalIndex;
  }

  
  /**
   * The value to set for the given interval
   **/
  public WfmForecastModificationIntervalOffsetValue value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value to set for the given interval")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmForecastModificationIntervalOffsetValue wfmForecastModificationIntervalOffsetValue = (WfmForecastModificationIntervalOffsetValue) o;
    return Objects.equals(this.intervalIndex, wfmForecastModificationIntervalOffsetValue.intervalIndex) &&
        Objects.equals(this.value, wfmForecastModificationIntervalOffsetValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalIndex, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmForecastModificationIntervalOffsetValue {\n");
    
    sb.append("    intervalIndex: ").append(toIndentedString(intervalIndex)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

