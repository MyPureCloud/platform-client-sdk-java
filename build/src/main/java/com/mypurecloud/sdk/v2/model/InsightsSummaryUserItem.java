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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.InsightsSummaryMetricItem;
import com.mypurecloud.sdk.v2.model.InsightsSummaryOverallItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * InsightsSummaryUserItem
 */

public class InsightsSummaryUserItem  implements Serializable {
  
  private UserReference user = null;
  private List<InsightsSummaryMetricItem> metricData = new ArrayList<InsightsSummaryMetricItem>();
  private InsightsSummaryOverallItem overallData = null;
  private Integer ranking = null;

  
  /**
   * Queried user
   **/
  public InsightsSummaryUserItem user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queried user")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The list of insights data for each metric of the user
   **/
  public InsightsSummaryUserItem metricData(List<InsightsSummaryMetricItem> metricData) {
    this.metricData = metricData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of insights data for each metric of the user")
  @JsonProperty("metricData")
  public List<InsightsSummaryMetricItem> getMetricData() {
    return metricData;
  }
  public void setMetricData(List<InsightsSummaryMetricItem> metricData) {
    this.metricData = metricData;
  }


  /**
   * Overall insights data of the user
   **/
  public InsightsSummaryUserItem overallData(InsightsSummaryOverallItem overallData) {
    this.overallData = overallData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overall insights data of the user")
  @JsonProperty("overallData")
  public InsightsSummaryOverallItem getOverallData() {
    return overallData;
  }
  public void setOverallData(InsightsSummaryOverallItem overallData) {
    this.overallData = overallData;
  }


  /**
   * Ranking of the user
   **/
  public InsightsSummaryUserItem ranking(Integer ranking) {
    this.ranking = ranking;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ranking of the user")
  @JsonProperty("ranking")
  public Integer getRanking() {
    return ranking;
  }
  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsSummaryUserItem insightsSummaryUserItem = (InsightsSummaryUserItem) o;

    return Objects.equals(this.user, insightsSummaryUserItem.user) &&
            Objects.equals(this.metricData, insightsSummaryUserItem.metricData) &&
            Objects.equals(this.overallData, insightsSummaryUserItem.overallData) &&
            Objects.equals(this.ranking, insightsSummaryUserItem.ranking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, metricData, overallData, ranking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsSummaryUserItem {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    metricData: ").append(toIndentedString(metricData)).append("\n");
    sb.append("    overallData: ").append(toIndentedString(overallData)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
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

