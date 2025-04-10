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
import com.mypurecloud.sdk.v2.model.ContestUserRank;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestWinners
 */

public class ContestWinners  implements Serializable {
  
  private Integer tier = null;
  private List<ContestUserRank> users = null;

  public ContestWinners() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      users = new ArrayList<ContestUserRank>();
    }
  }

  
  /**
   * The Contest Winner tier
   **/
  public ContestWinners tier(Integer tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Winner tier")
  @JsonProperty("tier")
  public Integer getTier() {
    return tier;
  }
  public void setTier(Integer tier) {
    this.tier = tier;
  }


  /**
   * The Contest Winner users at the tier
   **/
  public ContestWinners users(List<ContestUserRank> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Winner users at the tier")
  @JsonProperty("users")
  public List<ContestUserRank> getUsers() {
    return users;
  }
  public void setUsers(List<ContestUserRank> users) {
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
    ContestWinners contestWinners = (ContestWinners) o;

    return Objects.equals(this.tier, contestWinners.tier) &&
            Objects.equals(this.users, contestWinners.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestWinners {\n");
    
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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

