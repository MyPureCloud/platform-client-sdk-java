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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue
 */

public class WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue  implements Serializable {
  
  private Integer intervalIndex = null;
  private BigDecimal value = null;

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue intervalIndex(Integer intervalIndex) {
    this.intervalIndex = intervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intervalIndex")
  public Integer getIntervalIndex() {
    return intervalIndex;
  }
  public void setIntervalIndex(Integer intervalIndex) {
    this.intervalIndex = intervalIndex;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue value(BigDecimal value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
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
    WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue wfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue = (WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue) o;
    return Objects.equals(this.intervalIndex, wfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue.intervalIndex) &&
        Objects.equals(this.value, wfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalIndex, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue {\n");
    
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

