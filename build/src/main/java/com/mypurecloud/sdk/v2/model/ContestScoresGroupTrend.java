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
import com.mypurecloud.sdk.v2.model.ContestMetricScore;
import com.mypurecloud.sdk.v2.model.ContestScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestScoresGroupTrend
 */

public class ContestScoresGroupTrend  implements Serializable {
  
  private LocalDate dateWorkday = null;
  private ContestScore contestScore = null;
  private List<ContestMetricScore> metricScores = null;

  public ContestScoresGroupTrend() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metricScores = new ArrayList<ContestMetricScore>();
    }
  }

  
  /**
   * Workday of the contest score. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestScoresGroupTrend dateWorkday(LocalDate dateWorkday) {
    this.dateWorkday = dateWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 01:00:00 CET 2024", value = "Workday of the contest score. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateWorkday")
  public LocalDate getDateWorkday() {
    return dateWorkday;
  }
  public void setDateWorkday(LocalDate dateWorkday) {
    this.dateWorkday = dateWorkday;
  }


  /**
   * The Contest score
   **/
  public ContestScoresGroupTrend contestScore(ContestScore contestScore) {
    this.contestScore = contestScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest score")
  @JsonProperty("contestScore")
  public ContestScore getContestScore() {
    return contestScore;
  }
  public void setContestScore(ContestScore contestScore) {
    this.contestScore = contestScore;
  }


  /**
   * The Contest metric scores
   **/
  public ContestScoresGroupTrend metricScores(List<ContestMetricScore> metricScores) {
    this.metricScores = metricScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest metric scores")
  @JsonProperty("metricScores")
  public List<ContestMetricScore> getMetricScores() {
    return metricScores;
  }
  public void setMetricScores(List<ContestMetricScore> metricScores) {
    this.metricScores = metricScores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestScoresGroupTrend contestScoresGroupTrend = (ContestScoresGroupTrend) o;

    return Objects.equals(this.dateWorkday, contestScoresGroupTrend.dateWorkday) &&
            Objects.equals(this.contestScore, contestScoresGroupTrend.contestScore) &&
            Objects.equals(this.metricScores, contestScoresGroupTrend.metricScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateWorkday, contestScore, metricScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestScoresGroupTrend {\n");
    
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
    sb.append("    contestScore: ").append(toIndentedString(contestScore)).append("\n");
    sb.append("    metricScores: ").append(toIndentedString(metricScores)).append("\n");
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

