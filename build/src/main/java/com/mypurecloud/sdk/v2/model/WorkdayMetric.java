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
import com.mypurecloud.sdk.v2.model.Metric;
import com.mypurecloud.sdk.v2.model.Objective;
import com.mypurecloud.sdk.v2.model.PunctualityEvent;
import com.mypurecloud.sdk.v2.model.QualityEvaluationScoreItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkdayMetric
 */

public class WorkdayMetric  implements Serializable {
  
  private Metric metric = null;
  private Objective objective = null;
  private Integer points = null;
  private Integer maxPoints = null;
  private Double value = null;
  private List<PunctualityEvent> punctualityEvents = null;
  private List<QualityEvaluationScoreItem> evaluationDetails = null;

  public WorkdayMetric() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      punctualityEvents = new ArrayList<PunctualityEvent>();
      evaluationDetails = new ArrayList<QualityEvaluationScoreItem>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "Gamification metric")
  @JsonProperty("metric")
  public Metric getMetric() {
    return metric;
  }


  @ApiModelProperty(example = "null", value = "Current objective for this metric")
  @JsonProperty("objective")
  public Objective getObjective() {
    return objective;
  }


  @ApiModelProperty(example = "null", value = "Gamification points earned for this metric")
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }


  @ApiModelProperty(example = "null", value = "The maximum Gamification points a user may earn for this metric")
  @JsonProperty("maxPoints")
  public Integer getMaxPoints() {
    return maxPoints;
  }


  @ApiModelProperty(example = "null", value = "Value of this metric")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }


  @ApiModelProperty(example = "null", value = "List of schedule activity events for punctuality metrics")
  @JsonProperty("punctualityEvents")
  public List<PunctualityEvent> getPunctualityEvents() {
    return punctualityEvents;
  }


  @ApiModelProperty(example = "null", value = "List of evaluations for quality evaluation score metrics")
  @JsonProperty("evaluationDetails")
  public List<QualityEvaluationScoreItem> getEvaluationDetails() {
    return evaluationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkdayMetric workdayMetric = (WorkdayMetric) o;

    return Objects.equals(this.metric, workdayMetric.metric) &&
            Objects.equals(this.objective, workdayMetric.objective) &&
            Objects.equals(this.points, workdayMetric.points) &&
            Objects.equals(this.maxPoints, workdayMetric.maxPoints) &&
            Objects.equals(this.value, workdayMetric.value) &&
            Objects.equals(this.punctualityEvents, workdayMetric.punctualityEvents) &&
            Objects.equals(this.evaluationDetails, workdayMetric.evaluationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, objective, points, maxPoints, value, punctualityEvents, evaluationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkdayMetric {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
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

