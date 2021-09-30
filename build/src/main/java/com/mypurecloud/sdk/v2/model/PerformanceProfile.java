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
import com.mypurecloud.sdk.v2.model.ReportingInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PerformanceProfile
 */

public class PerformanceProfile  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private String description = null;
  private List<String> metricOrders = new ArrayList<String>();
  private Date dateCreated = null;
  private List<ReportingInterval> reportingIntervals = new ArrayList<ReportingInterval>();
  private Boolean active = null;
  private Integer memberCount = null;
  private Integer maxLeaderboardRankSize = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * A name for this performance profile
   **/
  public PerformanceProfile name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A name for this performance profile")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "The division for this performance profile associate to")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }

  
  /**
   * A description about this performance profile
   **/
  public PerformanceProfile description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A description about this performance profile")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Order of the associated metrics. The list should contain valid ids for metrics
   **/
  public PerformanceProfile metricOrders(List<String> metricOrders) {
    this.metricOrders = metricOrders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Order of the associated metrics. The list should contain valid ids for metrics")
  @JsonProperty("metricOrders")
  public List<String> getMetricOrders() {
    return metricOrders;
  }
  public void setMetricOrders(List<String> metricOrders) {
    this.metricOrders = metricOrders;
  }

  
  @ApiModelProperty(example = "null", value = "Creation date for this performance profile. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * The reporting interval periods for this performance profile
   **/
  public PerformanceProfile reportingIntervals(List<ReportingInterval> reportingIntervals) {
    this.reportingIntervals = reportingIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reporting interval periods for this performance profile")
  @JsonProperty("reportingIntervals")
  public List<ReportingInterval> getReportingIntervals() {
    return reportingIntervals;
  }
  public void setReportingIntervals(List<ReportingInterval> reportingIntervals) {
    this.reportingIntervals = reportingIntervals;
  }

  
  @ApiModelProperty(example = "null", value = "The flag for active profiles")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  
  @ApiModelProperty(example = "null", value = "The number of members in this performance profile")
  @JsonProperty("memberCount")
  public Integer getMemberCount() {
    return memberCount;
  }

  
  /**
   * The maximum rank size for the leaderboard. This counts the number of ranks can be retrieved in a leaderboard queries
   **/
  public PerformanceProfile maxLeaderboardRankSize(Integer maxLeaderboardRankSize) {
    this.maxLeaderboardRankSize = maxLeaderboardRankSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum rank size for the leaderboard. This counts the number of ranks can be retrieved in a leaderboard queries")
  @JsonProperty("maxLeaderboardRankSize")
  public Integer getMaxLeaderboardRankSize() {
    return maxLeaderboardRankSize;
  }
  public void setMaxLeaderboardRankSize(Integer maxLeaderboardRankSize) {
    this.maxLeaderboardRankSize = maxLeaderboardRankSize;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceProfile performanceProfile = (PerformanceProfile) o;
    return Objects.equals(this.id, performanceProfile.id) &&
        Objects.equals(this.name, performanceProfile.name) &&
        Objects.equals(this.division, performanceProfile.division) &&
        Objects.equals(this.description, performanceProfile.description) &&
        Objects.equals(this.metricOrders, performanceProfile.metricOrders) &&
        Objects.equals(this.dateCreated, performanceProfile.dateCreated) &&
        Objects.equals(this.reportingIntervals, performanceProfile.reportingIntervals) &&
        Objects.equals(this.active, performanceProfile.active) &&
        Objects.equals(this.memberCount, performanceProfile.memberCount) &&
        Objects.equals(this.maxLeaderboardRankSize, performanceProfile.maxLeaderboardRankSize) &&
        Objects.equals(this.selfUri, performanceProfile.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, metricOrders, dateCreated, reportingIntervals, active, memberCount, maxLeaderboardRankSize, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metricOrders: ").append(toIndentedString(metricOrders)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    reportingIntervals: ").append(toIndentedString(reportingIntervals)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    maxLeaderboardRankSize: ").append(toIndentedString(maxLeaderboardRankSize)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

