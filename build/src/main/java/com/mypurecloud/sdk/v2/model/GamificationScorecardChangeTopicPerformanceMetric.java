package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.GamificationScorecardChangeTopicEvaluationDetail;
import com.mypurecloud.sdk.v2.model.GamificationScorecardChangeTopicMetric;
import com.mypurecloud.sdk.v2.model.GamificationScorecardChangeTopicPunctualityEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GamificationScorecardChangeTopicPerformanceMetric
 */

public class GamificationScorecardChangeTopicPerformanceMetric  implements Serializable {
  
  private GamificationScorecardChangeTopicMetric metric = null;
  private Long points = null;
  private BigDecimal value = null;
  private List<GamificationScorecardChangeTopicPunctualityEvent> punctualityEvents = null;
  private List<GamificationScorecardChangeTopicEvaluationDetail> evaluationDetails = null;

  public GamificationScorecardChangeTopicPerformanceMetric() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      punctualityEvents = new ArrayList<GamificationScorecardChangeTopicPunctualityEvent>();
      evaluationDetails = new ArrayList<GamificationScorecardChangeTopicEvaluationDetail>();
    }
  }

  
  /**
   **/
  public GamificationScorecardChangeTopicPerformanceMetric metric(GamificationScorecardChangeTopicMetric metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metric")
  public GamificationScorecardChangeTopicMetric getMetric() {
    return metric;
  }
  public void setMetric(GamificationScorecardChangeTopicMetric metric) {
    this.metric = metric;
  }


  /**
   **/
  public GamificationScorecardChangeTopicPerformanceMetric points(Long points) {
    this.points = points;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }
  public void setPoints(Long points) {
    this.points = points;
  }


  /**
   **/
  public GamificationScorecardChangeTopicPerformanceMetric value(BigDecimal value) {
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


  /**
   **/
  public GamificationScorecardChangeTopicPerformanceMetric punctualityEvents(List<GamificationScorecardChangeTopicPunctualityEvent> punctualityEvents) {
    this.punctualityEvents = punctualityEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("punctualityEvents")
  public List<GamificationScorecardChangeTopicPunctualityEvent> getPunctualityEvents() {
    return punctualityEvents;
  }
  public void setPunctualityEvents(List<GamificationScorecardChangeTopicPunctualityEvent> punctualityEvents) {
    this.punctualityEvents = punctualityEvents;
  }


  /**
   **/
  public GamificationScorecardChangeTopicPerformanceMetric evaluationDetails(List<GamificationScorecardChangeTopicEvaluationDetail> evaluationDetails) {
    this.evaluationDetails = evaluationDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationDetails")
  public List<GamificationScorecardChangeTopicEvaluationDetail> getEvaluationDetails() {
    return evaluationDetails;
  }
  public void setEvaluationDetails(List<GamificationScorecardChangeTopicEvaluationDetail> evaluationDetails) {
    this.evaluationDetails = evaluationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamificationScorecardChangeTopicPerformanceMetric gamificationScorecardChangeTopicPerformanceMetric = (GamificationScorecardChangeTopicPerformanceMetric) o;

    return Objects.equals(this.metric, gamificationScorecardChangeTopicPerformanceMetric.metric) &&
            Objects.equals(this.points, gamificationScorecardChangeTopicPerformanceMetric.points) &&
            Objects.equals(this.value, gamificationScorecardChangeTopicPerformanceMetric.value) &&
            Objects.equals(this.punctualityEvents, gamificationScorecardChangeTopicPerformanceMetric.punctualityEvents) &&
            Objects.equals(this.evaluationDetails, gamificationScorecardChangeTopicPerformanceMetric.evaluationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, points, value, punctualityEvents, evaluationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamificationScorecardChangeTopicPerformanceMetric {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    punctualityEvents: ").append(toIndentedString(punctualityEvents)).append("\n");
    sb.append("    evaluationDetails: ").append(toIndentedString(evaluationDetails)).append("\n");
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

