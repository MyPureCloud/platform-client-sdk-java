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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LeaderboardItem
 */

public class LeaderboardItem  implements Serializable {
  
  private UserReference user = null;
  private Integer rank = null;
  private Long points = null;

  
  @ApiModelProperty(example = "null", value = "The user object for this leaderboard rank")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }

  
  @ApiModelProperty(example = "null", value = "The rank of the user")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }

  
  @ApiModelProperty(example = "null", value = "The points collected by the user")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardItem leaderboardItem = (LeaderboardItem) o;
    return Objects.equals(this.user, leaderboardItem.user) &&
        Objects.equals(this.rank, leaderboardItem.rank) &&
        Objects.equals(this.points, leaderboardItem.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, rank, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardItem {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

