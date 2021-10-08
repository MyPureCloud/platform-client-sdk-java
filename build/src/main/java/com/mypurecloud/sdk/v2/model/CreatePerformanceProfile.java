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
import com.mypurecloud.sdk.v2.model.ReportingInterval;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CreatePerformanceProfile
 */

public class CreatePerformanceProfile  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableDivision division = null;
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
  public CreatePerformanceProfile name(String name) {
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

  
  /**
   * The associated division for this Performance Profile
   **/
  public CreatePerformanceProfile division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The associated division for this Performance Profile")
  @JsonProperty("division")
  public WritableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableDivision division) {
    this.division = division;
  }

  
  /**
   * A description about this performance profile
   **/
  public CreatePerformanceProfile description(String description) {
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

  
  @ApiModelProperty(example = "null", value = "Order of the associated metrics. The list should contain valid ids for metrics")
  @JsonProperty("metricOrders")
  public List<String> getMetricOrders() {
    return metricOrders;
  }

  
  @ApiModelProperty(example = "null", value = "Creation date for this performance profile. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * The reporting interval periods for this performance profile
   **/
  public CreatePerformanceProfile reportingIntervals(List<ReportingInterval> reportingIntervals) {
    this.reportingIntervals = reportingIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reporting interval periods for this performance profile")
  @JsonProperty("reportingIntervals")
  public List<ReportingInterval> getReportingIntervals() {
    return reportingIntervals;
  }
  public void setReportingIntervals(List<ReportingInterval> reportingIntervals) {
    this.reportingIntervals = reportingIntervals;
  }

  
  /**
   * The flag for active profiles
   **/
  public CreatePerformanceProfile active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flag for active profiles")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  @ApiModelProperty(example = "null", value = "The number of members in this performance profile")
  @JsonProperty("memberCount")
  public Integer getMemberCount() {
    return memberCount;
  }

  
  /**
   * The maximum rank size for the leaderboard. This counts the number of ranks can be retrieved in a leaderboard queries
   **/
  public CreatePerformanceProfile maxLeaderboardRankSize(Integer maxLeaderboardRankSize) {
    this.maxLeaderboardRankSize = maxLeaderboardRankSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum rank size for the leaderboard. This counts the number of ranks can be retrieved in a leaderboard queries")
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
    CreatePerformanceProfile createPerformanceProfile = (CreatePerformanceProfile) o;
    return Objects.equals(this.id, createPerformanceProfile.id) &&
        Objects.equals(this.name, createPerformanceProfile.name) &&
        Objects.equals(this.division, createPerformanceProfile.division) &&
        Objects.equals(this.description, createPerformanceProfile.description) &&
        Objects.equals(this.metricOrders, createPerformanceProfile.metricOrders) &&
        Objects.equals(this.dateCreated, createPerformanceProfile.dateCreated) &&
        Objects.equals(this.reportingIntervals, createPerformanceProfile.reportingIntervals) &&
        Objects.equals(this.active, createPerformanceProfile.active) &&
        Objects.equals(this.memberCount, createPerformanceProfile.memberCount) &&
        Objects.equals(this.maxLeaderboardRankSize, createPerformanceProfile.maxLeaderboardRankSize) &&
        Objects.equals(this.selfUri, createPerformanceProfile.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, metricOrders, dateCreated, reportingIntervals, active, memberCount, maxLeaderboardRankSize, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePerformanceProfile {\n");
    
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

