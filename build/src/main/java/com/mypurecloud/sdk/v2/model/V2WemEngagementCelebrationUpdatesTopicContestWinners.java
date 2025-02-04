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
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicContestWinnersScore;
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2WemEngagementCelebrationUpdatesTopicContestWinners
 */

public class V2WemEngagementCelebrationUpdatesTopicContestWinners  implements Serializable {
  
  private Integer tier = null;
  private Integer winnersCount = null;
  private V2WemEngagementCelebrationUpdatesTopicContestWinnersScore contestScore = null;
  private List<V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers> users = new ArrayList<V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers>();

  
  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestWinners tier(Integer tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tier")
  public Integer getTier() {
    return tier;
  }
  public void setTier(Integer tier) {
    this.tier = tier;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestWinners winnersCount(Integer winnersCount) {
    this.winnersCount = winnersCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("winnersCount")
  public Integer getWinnersCount() {
    return winnersCount;
  }
  public void setWinnersCount(Integer winnersCount) {
    this.winnersCount = winnersCount;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestWinners contestScore(V2WemEngagementCelebrationUpdatesTopicContestWinnersScore contestScore) {
    this.contestScore = contestScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contestScore")
  public V2WemEngagementCelebrationUpdatesTopicContestWinnersScore getContestScore() {
    return contestScore;
  }
  public void setContestScore(V2WemEngagementCelebrationUpdatesTopicContestWinnersScore contestScore) {
    this.contestScore = contestScore;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestWinners users(List<V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("users")
  public List<V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers> getUsers() {
    return users;
  }
  public void setUsers(List<V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WemEngagementCelebrationUpdatesTopicContestWinners v2WemEngagementCelebrationUpdatesTopicContestWinners = (V2WemEngagementCelebrationUpdatesTopicContestWinners) o;

    return Objects.equals(this.tier, v2WemEngagementCelebrationUpdatesTopicContestWinners.tier) &&
            Objects.equals(this.winnersCount, v2WemEngagementCelebrationUpdatesTopicContestWinners.winnersCount) &&
            Objects.equals(this.contestScore, v2WemEngagementCelebrationUpdatesTopicContestWinners.contestScore) &&
            Objects.equals(this.users, v2WemEngagementCelebrationUpdatesTopicContestWinners.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, winnersCount, contestScore, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WemEngagementCelebrationUpdatesTopicContestWinners {\n");
    
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    winnersCount: ").append(toIndentedString(winnersCount)).append("\n");
    sb.append("    contestScore: ").append(toIndentedString(contestScore)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

