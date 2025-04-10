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
import com.mypurecloud.sdk.v2.model.ContestMetricScoreRanked;
import com.mypurecloud.sdk.v2.model.ContestScoreRanked;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestScoresAgentTrend
 */

public class ContestScoresAgentTrend  implements Serializable {
  
  private ContestScoreRanked contestScore = null;
  private List<ContestMetricScoreRanked> metricScores = null;
  private Boolean disqualified = null;
  private LocalDate dateWorkday = null;

  public ContestScoresAgentTrend() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metricScores = new ArrayList<ContestMetricScoreRanked>();
    }
  }

  
  /**
   * The Contest score
   **/
  public ContestScoresAgentTrend contestScore(ContestScoreRanked contestScore) {
    this.contestScore = contestScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest score")
  @JsonProperty("contestScore")
  public ContestScoreRanked getContestScore() {
    return contestScore;
  }
  public void setContestScore(ContestScoreRanked contestScore) {
    this.contestScore = contestScore;
  }


  /**
   * The Contest metric scores
   **/
  public ContestScoresAgentTrend metricScores(List<ContestMetricScoreRanked> metricScores) {
    this.metricScores = metricScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest metric scores")
  @JsonProperty("metricScores")
  public List<ContestMetricScoreRanked> getMetricScores() {
    return metricScores;
  }
  public void setMetricScores(List<ContestMetricScoreRanked> metricScores) {
    this.metricScores = metricScores;
  }


  /**
   * Indicates whether an agent is disqualified or not
   **/
  public ContestScoresAgentTrend disqualified(Boolean disqualified) {
    this.disqualified = disqualified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether an agent is disqualified or not")
  @JsonProperty("disqualified")
  public Boolean getDisqualified() {
    return disqualified;
  }
  public void setDisqualified(Boolean disqualified) {
    this.disqualified = disqualified;
  }


  /**
   * Workday of the contest scores leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestScoresAgentTrend dateWorkday(LocalDate dateWorkday) {
    this.dateWorkday = dateWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 00:00:00 UTC 2024", value = "Workday of the contest scores leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateWorkday")
  public LocalDate getDateWorkday() {
    return dateWorkday;
  }
  public void setDateWorkday(LocalDate dateWorkday) {
    this.dateWorkday = dateWorkday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestScoresAgentTrend contestScoresAgentTrend = (ContestScoresAgentTrend) o;

    return Objects.equals(this.contestScore, contestScoresAgentTrend.contestScore) &&
            Objects.equals(this.metricScores, contestScoresAgentTrend.metricScores) &&
            Objects.equals(this.disqualified, contestScoresAgentTrend.disqualified) &&
            Objects.equals(this.dateWorkday, contestScoresAgentTrend.dateWorkday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contestScore, metricScores, disqualified, dateWorkday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestScoresAgentTrend {\n");
    
    sb.append("    contestScore: ").append(toIndentedString(contestScore)).append("\n");
    sb.append("    metricScores: ").append(toIndentedString(metricScores)).append("\n");
    sb.append("    disqualified: ").append(toIndentedString(disqualified)).append("\n");
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
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

