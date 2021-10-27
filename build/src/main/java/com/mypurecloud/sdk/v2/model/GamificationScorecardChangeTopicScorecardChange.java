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
import com.mypurecloud.sdk.v2.model.GamificationScorecardChangeTopicPerformanceMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GamificationScorecardChangeTopicScorecardChange
 */

public class GamificationScorecardChangeTopicScorecardChange  implements Serializable {
  
  private String workday = null;
  private String divisionId = null;
  private String teamId = null;
  private String performanceProfileId = null;
  private String userId = null;
  private List<GamificationScorecardChangeTopicPerformanceMetric> performanceMetrics = new ArrayList<GamificationScorecardChangeTopicPerformanceMetric>();

  
  /**
   **/
  public GamificationScorecardChangeTopicScorecardChange workday(String workday) {
    this.workday = workday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workday")
  public String getWorkday() {
    return workday;
  }
  public void setWorkday(String workday) {
    this.workday = workday;
  }

  
  /**
   **/
  public GamificationScorecardChangeTopicScorecardChange divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  
  /**
   **/
  public GamificationScorecardChangeTopicScorecardChange teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  
  /**
   **/
  public GamificationScorecardChangeTopicScorecardChange performanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performanceProfileId")
  public String getPerformanceProfileId() {
    return performanceProfileId;
  }
  public void setPerformanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
  }

  
  /**
   **/
  public GamificationScorecardChangeTopicScorecardChange userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public GamificationScorecardChangeTopicScorecardChange performanceMetrics(List<GamificationScorecardChangeTopicPerformanceMetric> performanceMetrics) {
    this.performanceMetrics = performanceMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performanceMetrics")
  public List<GamificationScorecardChangeTopicPerformanceMetric> getPerformanceMetrics() {
    return performanceMetrics;
  }
  public void setPerformanceMetrics(List<GamificationScorecardChangeTopicPerformanceMetric> performanceMetrics) {
    this.performanceMetrics = performanceMetrics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamificationScorecardChangeTopicScorecardChange gamificationScorecardChangeTopicScorecardChange = (GamificationScorecardChangeTopicScorecardChange) o;
    return Objects.equals(this.workday, gamificationScorecardChangeTopicScorecardChange.workday) &&
        Objects.equals(this.divisionId, gamificationScorecardChangeTopicScorecardChange.divisionId) &&
        Objects.equals(this.teamId, gamificationScorecardChangeTopicScorecardChange.teamId) &&
        Objects.equals(this.performanceProfileId, gamificationScorecardChangeTopicScorecardChange.performanceProfileId) &&
        Objects.equals(this.userId, gamificationScorecardChangeTopicScorecardChange.userId) &&
        Objects.equals(this.performanceMetrics, gamificationScorecardChangeTopicScorecardChange.performanceMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workday, divisionId, teamId, performanceProfileId, userId, performanceMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamificationScorecardChangeTopicScorecardChange {\n");
    
    sb.append("    workday: ").append(toIndentedString(workday)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    performanceProfileId: ").append(toIndentedString(performanceProfileId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    performanceMetrics: ").append(toIndentedString(performanceMetrics)).append("\n");
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

