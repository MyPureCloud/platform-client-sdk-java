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
import com.mypurecloud.sdk.v2.model.ContestScoreRanked;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * ContestRequesingParticipantDailyInfo
 */

public class ContestRequesingParticipantDailyInfo  implements Serializable {
  
  private LocalDate dateWorkday = null;
  private ContestScoreRanked contestScore = null;

  public ContestRequesingParticipantDailyInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Workday of the contest info. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestRequesingParticipantDailyInfo dateWorkday(LocalDate dateWorkday) {
    this.dateWorkday = dateWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 01:00:00 CET 2024", value = "Workday of the contest info. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
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
  public ContestRequesingParticipantDailyInfo contestScore(ContestScoreRanked contestScore) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestRequesingParticipantDailyInfo contestRequesingParticipantDailyInfo = (ContestRequesingParticipantDailyInfo) o;

    return Objects.equals(this.dateWorkday, contestRequesingParticipantDailyInfo.dateWorkday) &&
            Objects.equals(this.contestScore, contestRequesingParticipantDailyInfo.contestScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateWorkday, contestScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestRequesingParticipantDailyInfo {\n");
    
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
    sb.append("    contestScore: ").append(toIndentedString(contestScore)).append("\n");
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

