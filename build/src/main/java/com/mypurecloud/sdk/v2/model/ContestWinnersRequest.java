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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestWinnersRequest
 */

public class ContestWinnersRequest  implements Serializable {
  
  private Integer tier = null;
  private List<String> userIds = null;

  public ContestWinnersRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userIds = new ArrayList<String>();
    }
  }

  
  /**
   * The Contest Winner tier
   **/
  public ContestWinnersRequest tier(Integer tier) {
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
  public ContestWinnersRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Winner users at the tier")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestWinnersRequest contestWinnersRequest = (ContestWinnersRequest) o;

    return Objects.equals(this.tier, contestWinnersRequest.tier) &&
            Objects.equals(this.userIds, contestWinnersRequest.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestWinnersRequest {\n");
    
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

