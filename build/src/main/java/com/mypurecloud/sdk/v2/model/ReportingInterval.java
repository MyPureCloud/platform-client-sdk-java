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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReportingInterval
 */

public class ReportingInterval  implements Serializable {
  

  private static class IntervalTypeEnumDeserializer extends StdDeserializer<IntervalTypeEnum> {
    public IntervalTypeEnumDeserializer() {
      super(IntervalTypeEnumDeserializer.class);
    }

    @Override
    public IntervalTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IntervalTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The granularity of the reporting interval period
   */
 @JsonDeserialize(using = IntervalTypeEnumDeserializer.class)
  public enum IntervalTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAY("Day"),
    WEEK("Week"),
    MONTH("Month");

    private String value;

    IntervalTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IntervalTypeEnum fromString(String key) {
      if (key == null) return null;

      for (IntervalTypeEnum value : IntervalTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IntervalTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IntervalTypeEnum intervalType = null;
  private Integer intervalValue = null;

  
  /**
   * The granularity of the reporting interval period
   **/
  public ReportingInterval intervalType(IntervalTypeEnum intervalType) {
    this.intervalType = intervalType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The granularity of the reporting interval period")
  @JsonProperty("intervalType")
  public IntervalTypeEnum getIntervalType() {
    return intervalType;
  }
  public void setIntervalType(IntervalTypeEnum intervalType) {
    this.intervalType = intervalType;
  }

  
  /**
   * The value of the reporting interval period for a given interval type
   **/
  public ReportingInterval intervalValue(Integer intervalValue) {
    this.intervalValue = intervalValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the reporting interval period for a given interval type")
  @JsonProperty("intervalValue")
  public Integer getIntervalValue() {
    return intervalValue;
  }
  public void setIntervalValue(Integer intervalValue) {
    this.intervalValue = intervalValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingInterval reportingInterval = (ReportingInterval) o;
    return Objects.equals(this.intervalType, reportingInterval.intervalType) &&
        Objects.equals(this.intervalValue, reportingInterval.intervalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalType, intervalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingInterval {\n");
    
    sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
    sb.append("    intervalValue: ").append(toIndentedString(intervalValue)).append("\n");
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

