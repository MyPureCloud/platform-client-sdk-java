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
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.LeaderboardItem;
import com.mypurecloud.sdk.v2.model.Metric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Leaderboard
 */

public class Leaderboard  implements Serializable {
  
  private Division division = null;
  private Metric metric = null;
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;
  private List<LeaderboardItem> leaders = new ArrayList<LeaderboardItem>();

  
  /**
   * The targeted division for this leaderboard
   **/
  public Leaderboard division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The targeted division for this leaderboard")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }

  
  /**
   * The metric id if the leaderboard is about a specific metric
   **/
  public Leaderboard metric(Metric metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric id if the leaderboard is about a specific metric")
  @JsonProperty("metric")
  public Metric getMetric() {
    return metric;
  }
  public void setMetric(Metric metric) {
    this.metric = metric;
  }

  
  @ApiModelProperty(example = "null", value = "Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }

  
  @ApiModelProperty(example = "null", value = "End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }

  
  /**
   * The list of leaders generated.
   **/
  public Leaderboard leaders(List<LeaderboardItem> leaders) {
    this.leaders = leaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of leaders generated.")
  @JsonProperty("leaders")
  public List<LeaderboardItem> getLeaders() {
    return leaders;
  }
  public void setLeaders(List<LeaderboardItem> leaders) {
    this.leaders = leaders;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leaderboard leaderboard = (Leaderboard) o;
    return Objects.equals(this.division, leaderboard.division) &&
        Objects.equals(this.metric, leaderboard.metric) &&
        Objects.equals(this.dateStartWorkday, leaderboard.dateStartWorkday) &&
        Objects.equals(this.dateEndWorkday, leaderboard.dateEndWorkday) &&
        Objects.equals(this.leaders, leaderboard.leaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, metric, dateStartWorkday, dateEndWorkday, leaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leaderboard {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
    sb.append("    leaders: ").append(toIndentedString(leaders)).append("\n");
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

