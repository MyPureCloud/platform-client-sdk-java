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
import com.mypurecloud.sdk.v2.model.ContestCompleteDataScore;
import com.mypurecloud.sdk.v2.model.ContestDataWinnersUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestDataWinners
 */

public class ContestDataWinners  implements Serializable {
  
  private Integer tier = null;
  private Integer winnersCount = null;
  private ContestCompleteDataScore contestScore = null;
  private List<ContestDataWinnersUsers> users = new ArrayList<ContestDataWinnersUsers>();

  
  /**
   * Tier of the winners
   **/
  public ContestDataWinners tier(Integer tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tier of the winners")
  @JsonProperty("tier")
  public Integer getTier() {
    return tier;
  }
  public void setTier(Integer tier) {
    this.tier = tier;
  }


  /**
   * Number of winners in this tier
   **/
  public ContestDataWinners winnersCount(Integer winnersCount) {
    this.winnersCount = winnersCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of winners in this tier")
  @JsonProperty("winnersCount")
  public Integer getWinnersCount() {
    return winnersCount;
  }
  public void setWinnersCount(Integer winnersCount) {
    this.winnersCount = winnersCount;
  }


  /**
   * Number of winners in this tier
   **/
  public ContestDataWinners contestScore(ContestCompleteDataScore contestScore) {
    this.contestScore = contestScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of winners in this tier")
  @JsonProperty("contestScore")
  public ContestCompleteDataScore getContestScore() {
    return contestScore;
  }
  public void setContestScore(ContestCompleteDataScore contestScore) {
    this.contestScore = contestScore;
  }


  /**
   * List of users in this tier
   **/
  public ContestDataWinners users(List<ContestDataWinnersUsers> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of users in this tier")
  @JsonProperty("users")
  public List<ContestDataWinnersUsers> getUsers() {
    return users;
  }
  public void setUsers(List<ContestDataWinnersUsers> users) {
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
    ContestDataWinners contestDataWinners = (ContestDataWinners) o;

    return Objects.equals(this.tier, contestDataWinners.tier) &&
            Objects.equals(this.winnersCount, contestDataWinners.winnersCount) &&
            Objects.equals(this.contestScore, contestDataWinners.contestScore) &&
            Objects.equals(this.users, contestDataWinners.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, winnersCount, contestScore, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestDataWinners {\n");
    
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

