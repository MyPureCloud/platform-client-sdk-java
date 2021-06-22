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
import com.mypurecloud.sdk.v2.model.PredictorSchedule;
import com.mypurecloud.sdk.v2.model.PredictorWorkloadBalancing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreatePredictorRequest
 */

public class CreatePredictorRequest  implements Serializable {
  
  private List<String> queueIds = new ArrayList<String>();
  private String kpi = null;
  private Integer routingTimeoutSeconds = null;
  private PredictorSchedule schedule = null;
  private PredictorWorkloadBalancing workloadBalancingConfig = null;

  
  /**
   * The queue IDs associated with the predictor.
   **/
  public CreatePredictorRequest queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The queue IDs associated with the predictor.")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }

  
  /**
   * The KPI that the predictor attempts to maximize/minimize.
   **/
  public CreatePredictorRequest kpi(String kpi) {
    this.kpi = kpi;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The KPI that the predictor attempts to maximize/minimize.")
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }
  public void setKpi(String kpi) {
    this.kpi = kpi;
  }

  
  /**
   * Number of seconds allocated to predictive routing before attempting a different routing method. This is a value between 12 and 900 seconds.
   **/
  public CreatePredictorRequest routingTimeoutSeconds(Integer routingTimeoutSeconds) {
    this.routingTimeoutSeconds = routingTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of seconds allocated to predictive routing before attempting a different routing method. This is a value between 12 and 900 seconds.")
  @JsonProperty("routingTimeoutSeconds")
  public Integer getRoutingTimeoutSeconds() {
    return routingTimeoutSeconds;
  }
  public void setRoutingTimeoutSeconds(Integer routingTimeoutSeconds) {
    this.routingTimeoutSeconds = routingTimeoutSeconds;
  }

  
  /**
   * The predictor schedule that determines when the predictor is used for routing interactions.
   **/
  public CreatePredictorRequest schedule(PredictorSchedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The predictor schedule that determines when the predictor is used for routing interactions.")
  @JsonProperty("schedule")
  public PredictorSchedule getSchedule() {
    return schedule;
  }
  public void setSchedule(PredictorSchedule schedule) {
    this.schedule = schedule;
  }

  
  /**
   * The predictor balancing configuration to enable workload balancing
   **/
  public CreatePredictorRequest workloadBalancingConfig(PredictorWorkloadBalancing workloadBalancingConfig) {
    this.workloadBalancingConfig = workloadBalancingConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The predictor balancing configuration to enable workload balancing")
  @JsonProperty("workloadBalancingConfig")
  public PredictorWorkloadBalancing getWorkloadBalancingConfig() {
    return workloadBalancingConfig;
  }
  public void setWorkloadBalancingConfig(PredictorWorkloadBalancing workloadBalancingConfig) {
    this.workloadBalancingConfig = workloadBalancingConfig;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePredictorRequest createPredictorRequest = (CreatePredictorRequest) o;
    return Objects.equals(this.queueIds, createPredictorRequest.queueIds) &&
        Objects.equals(this.kpi, createPredictorRequest.kpi) &&
        Objects.equals(this.routingTimeoutSeconds, createPredictorRequest.routingTimeoutSeconds) &&
        Objects.equals(this.schedule, createPredictorRequest.schedule) &&
        Objects.equals(this.workloadBalancingConfig, createPredictorRequest.workloadBalancingConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueIds, kpi, routingTimeoutSeconds, schedule, workloadBalancingConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePredictorRequest {\n");
    
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    routingTimeoutSeconds: ").append(toIndentedString(routingTimeoutSeconds)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    workloadBalancingConfig: ").append(toIndentedString(workloadBalancingConfig)).append("\n");
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

