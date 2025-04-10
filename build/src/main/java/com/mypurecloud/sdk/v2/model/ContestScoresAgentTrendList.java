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
import com.mypurecloud.sdk.v2.model.ContestScoresAgentTrend;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestScoresAgentTrendList
 */

public class ContestScoresAgentTrendList  implements Serializable {
  
  private List<ContestScoresAgentTrend> entities = null;
  private UserReference user = null;

  public ContestScoresAgentTrendList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ContestScoresAgentTrend>();
    }
  }

  
  /**
   **/
  public ContestScoresAgentTrendList entities(List<ContestScoresAgentTrend> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ContestScoresAgentTrend> getEntities() {
    return entities;
  }
  public void setEntities(List<ContestScoresAgentTrend> entities) {
    this.entities = entities;
  }


  /**
   * The Contest Scores Leaderboard user
   **/
  public ContestScoresAgentTrendList user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Scores Leaderboard user")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestScoresAgentTrendList contestScoresAgentTrendList = (ContestScoresAgentTrendList) o;

    return Objects.equals(this.entities, contestScoresAgentTrendList.entities) &&
            Objects.equals(this.user, contestScoresAgentTrendList.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestScoresAgentTrendList {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

