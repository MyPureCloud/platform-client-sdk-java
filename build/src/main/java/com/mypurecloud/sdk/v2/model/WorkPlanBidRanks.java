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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkPlanBidRanks
 */

public class WorkPlanBidRanks  implements Serializable {
  
  private String id = null;
  private Integer workPlanBiddingPerformance = null;
  private String biddingTieBreaker = null;
  private String selfUri = null;

  
  /**
   * The globally unique identifier for the user.
   **/
  public WorkPlanBidRanks id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the user.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Work plan bidding agent performance ranking. The range of values is between 0 and 9999.
   **/
  public WorkPlanBidRanks workPlanBiddingPerformance(Integer workPlanBiddingPerformance) {
    this.workPlanBiddingPerformance = workPlanBiddingPerformance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Work plan bidding agent performance ranking. The range of values is between 0 and 9999.")
  @JsonProperty("workPlanBiddingPerformance")
  public Integer getWorkPlanBiddingPerformance() {
    return workPlanBiddingPerformance;
  }
  public void setWorkPlanBiddingPerformance(Integer workPlanBiddingPerformance) {
    this.workPlanBiddingPerformance = workPlanBiddingPerformance;
  }


  /**
   * Custom agent ranking metric that some customers can use.
   **/
  public WorkPlanBidRanks biddingTieBreaker(String biddingTieBreaker) {
    this.biddingTieBreaker = biddingTieBreaker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom agent ranking metric that some customers can use.")
  @JsonProperty("biddingTieBreaker")
  public String getBiddingTieBreaker() {
    return biddingTieBreaker;
  }
  public void setBiddingTieBreaker(String biddingTieBreaker) {
    this.biddingTieBreaker = biddingTieBreaker;
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
    WorkPlanBidRanks workPlanBidRanks = (WorkPlanBidRanks) o;

    return Objects.equals(this.id, workPlanBidRanks.id) &&
            Objects.equals(this.workPlanBiddingPerformance, workPlanBidRanks.workPlanBiddingPerformance) &&
            Objects.equals(this.biddingTieBreaker, workPlanBidRanks.biddingTieBreaker) &&
            Objects.equals(this.selfUri, workPlanBidRanks.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workPlanBiddingPerformance, biddingTieBreaker, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBidRanks {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workPlanBiddingPerformance: ").append(toIndentedString(workPlanBiddingPerformance)).append("\n");
    sb.append("    biddingTieBreaker: ").append(toIndentedString(biddingTieBreaker)).append("\n");
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

