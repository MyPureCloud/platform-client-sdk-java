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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContestUserRank
 */

public class ContestUserRank  implements Serializable {
  
  private String id = null;
  private Integer rank = null;
  private Double score = null;
  private String selfUri = null;

  public ContestUserRank() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ContestUserRank id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The user's rank in contest, a lower rank is better (1 is the best)
   **/
  public ContestUserRank rank(Integer rank) {
    this.rank = rank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's rank in contest, a lower rank is better (1 is the best)")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }
  public void setRank(Integer rank) {
    this.rank = rank;
  }


  /**
   * The user's contest score
   **/
  public ContestUserRank score(Double score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's contest score")
  @JsonProperty("score")
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
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
    ContestUserRank contestUserRank = (ContestUserRank) o;

    return Objects.equals(this.id, contestUserRank.id) &&
            Objects.equals(this.rank, contestUserRank.rank) &&
            Objects.equals(this.score, contestUserRank.score) &&
            Objects.equals(this.selfUri, contestUserRank.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rank, score, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestUserRank {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

