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
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsSessionMetric
 */

public class AnalyticsSessionMetric  implements Serializable {
  
  private Date emitDate = null;
  private String name = null;
  private Long value = null;

  
  /**
   * Metric emission date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsSessionMetric emitDate(Date emitDate) {
    this.emitDate = emitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric emission date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("emitDate")
  public Date getEmitDate() {
    return emitDate;
  }
  public void setEmitDate(Date emitDate) {
    this.emitDate = emitDate;
  }

  
  /**
   * Unique name of this metric
   **/
  public AnalyticsSessionMetric name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique name of this metric")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The metric value
   **/
  public AnalyticsSessionMetric value(Long value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric value")
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
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
    AnalyticsSessionMetric analyticsSessionMetric = (AnalyticsSessionMetric) o;
    return Objects.equals(this.emitDate, analyticsSessionMetric.emitDate) &&
        Objects.equals(this.name, analyticsSessionMetric.name) &&
        Objects.equals(this.value, analyticsSessionMetric.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emitDate, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSessionMetric {\n");
    
    sb.append("    emitDate: ").append(toIndentedString(emitDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

