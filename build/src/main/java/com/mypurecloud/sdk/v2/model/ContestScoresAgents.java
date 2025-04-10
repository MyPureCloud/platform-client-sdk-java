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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestScoresAgents
 */

public class ContestScoresAgents  implements Serializable {
  
  private ContestScoreRanked contestScore = null;
  private List<ContestMetricScoreRanked> metricScores = null;
  private Boolean disqualified = null;
  private UserReference user = null;

  public ContestScoresAgents() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metricScores = new ArrayList<ContestMetricScoreRanked>();
    }
  }

  
  /**
   * The Contest score
   **/
  public ContestScoresAgents contestScore(ContestScoreRanked contestScore) {
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
  public ContestScoresAgents metricScores(List<ContestMetricScoreRanked> metricScores) {
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
  public ContestScoresAgents disqualified(Boolean disqualified) {
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
   * The Contest Scores Leaderboard user
   **/
  public ContestScoresAgents user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Scores Leaderboard user")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestScoresAgents contestScoresAgents = (ContestScoresAgents) o;

    return Objects.equals(this.contestScore, contestScoresAgents.contestScore) &&
            Objects.equals(this.metricScores, contestScoresAgents.metricScores) &&
            Objects.equals(this.disqualified, contestScoresAgents.disqualified) &&
            Objects.equals(this.user, contestScoresAgents.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contestScore, metricScores, disqualified, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestScoresAgents {\n");
    
    sb.append("    contestScore: ").append(toIndentedString(contestScore)).append("\n");
    sb.append("    metricScores: ").append(toIndentedString(metricScores)).append("\n");
    sb.append("    disqualified: ").append(toIndentedString(disqualified)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

