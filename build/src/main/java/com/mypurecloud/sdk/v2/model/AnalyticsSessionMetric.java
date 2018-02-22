package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsSessionMetric
 */

public class AnalyticsSessionMetric  implements Serializable {
  
  private String name = null;
  private Long value = null;
  private Date emitDate = null;

  
  /**
   * Unique name of this metric
   **/
  public AnalyticsSessionMetric name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique name of this metric")
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
  
  @ApiModelProperty(example = "null", required = true, value = "The metric value")
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }

  
  /**
   * Metric emission date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsSessionMetric emitDate(Date emitDate) {
    this.emitDate = emitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metric emission date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("emitDate")
  public Date getEmitDate() {
    return emitDate;
  }
  public void setEmitDate(Date emitDate) {
    this.emitDate = emitDate;
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
    return Objects.equals(this.name, analyticsSessionMetric.name) &&
        Objects.equals(this.value, analyticsSessionMetric.value) &&
        Objects.equals(this.emitDate, analyticsSessionMetric.emitDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, emitDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSessionMetric {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    emitDate: ").append(toIndentedString(emitDate)).append("\n");
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

