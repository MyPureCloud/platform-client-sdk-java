package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.TrunkMetricsCalls;
import com.mypurecloud.sdk.v2.model.TrunkMetricsQoS;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * TrunkMetrics
 */

public class TrunkMetrics  implements Serializable {
  
  private Date eventTime = null;
  private UriReference logicalInterface = null;
  private UriReference trunk = null;
  private TrunkMetricsCalls calls = null;
  private TrunkMetricsQoS qos = null;

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public TrunkMetrics eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  
  /**
   **/
  public TrunkMetrics logicalInterface(UriReference logicalInterface) {
    this.logicalInterface = logicalInterface;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("logicalInterface")
  public UriReference getLogicalInterface() {
    return logicalInterface;
  }
  public void setLogicalInterface(UriReference logicalInterface) {
    this.logicalInterface = logicalInterface;
  }

  
  /**
   **/
  public TrunkMetrics trunk(UriReference trunk) {
    this.trunk = trunk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trunk")
  public UriReference getTrunk() {
    return trunk;
  }
  public void setTrunk(UriReference trunk) {
    this.trunk = trunk;
  }

  
  /**
   **/
  public TrunkMetrics calls(TrunkMetricsCalls calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public TrunkMetricsCalls getCalls() {
    return calls;
  }
  public void setCalls(TrunkMetricsCalls calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public TrunkMetrics qos(TrunkMetricsQoS qos) {
    this.qos = qos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qos")
  public TrunkMetricsQoS getQos() {
    return qos;
  }
  public void setQos(TrunkMetricsQoS qos) {
    this.qos = qos;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkMetrics trunkMetrics = (TrunkMetrics) o;
    return Objects.equals(this.eventTime, trunkMetrics.eventTime) &&
        Objects.equals(this.logicalInterface, trunkMetrics.logicalInterface) &&
        Objects.equals(this.trunk, trunkMetrics.trunk) &&
        Objects.equals(this.calls, trunkMetrics.calls) &&
        Objects.equals(this.qos, trunkMetrics.qos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, logicalInterface, trunk, calls, qos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetrics {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    logicalInterface: ").append(toIndentedString(logicalInterface)).append("\n");
    sb.append("    trunk: ").append(toIndentedString(trunk)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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

