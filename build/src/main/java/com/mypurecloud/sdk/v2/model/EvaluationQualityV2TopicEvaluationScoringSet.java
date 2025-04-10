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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EvaluationQualityV2TopicEvaluationScoringSet
 */

public class EvaluationQualityV2TopicEvaluationScoringSet  implements Serializable {
  
  private Long totalScore = null;
  private Long totalCriticalScore = null;

  public EvaluationQualityV2TopicEvaluationScoringSet() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public EvaluationQualityV2TopicEvaluationScoringSet totalScore(Long totalScore) {
    this.totalScore = totalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalScore")
  public Long getTotalScore() {
    return totalScore;
  }
  public void setTotalScore(Long totalScore) {
    this.totalScore = totalScore;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationScoringSet totalCriticalScore(Long totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalCriticalScore")
  public Long getTotalCriticalScore() {
    return totalCriticalScore;
  }
  public void setTotalCriticalScore(Long totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationQualityV2TopicEvaluationScoringSet evaluationQualityV2TopicEvaluationScoringSet = (EvaluationQualityV2TopicEvaluationScoringSet) o;

    return Objects.equals(this.totalScore, evaluationQualityV2TopicEvaluationScoringSet.totalScore) &&
            Objects.equals(this.totalCriticalScore, evaluationQualityV2TopicEvaluationScoringSet.totalCriticalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalScore, totalCriticalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationQualityV2TopicEvaluationScoringSet {\n");
    
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
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

