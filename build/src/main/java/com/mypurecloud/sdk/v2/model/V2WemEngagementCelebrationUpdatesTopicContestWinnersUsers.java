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
 * V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers
 */

public class V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers  implements Serializable {
  
  private String id = null;
  private Long rank = null;

  public V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers rank(Long rank) {
    this.rank = rank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rank")
  public Long getRank() {
    return rank;
  }
  public void setRank(Long rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers v2WemEngagementCelebrationUpdatesTopicContestWinnersUsers = (V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers) o;

    return Objects.equals(this.id, v2WemEngagementCelebrationUpdatesTopicContestWinnersUsers.id) &&
            Objects.equals(this.rank, v2WemEngagementCelebrationUpdatesTopicContestWinnersUsers.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WemEngagementCelebrationUpdatesTopicContestWinnersUsers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

