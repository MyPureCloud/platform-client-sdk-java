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
import com.mypurecloud.sdk.v2.model.UserBestPointsItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserBestPoints
 */

public class UserBestPoints  implements Serializable {
  
  private UserReference user = null;
  private List<UserBestPointsItem> bestPoints = new ArrayList<UserBestPointsItem>();

  
  @ApiModelProperty(example = "null", value = "The requested user for the best points")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }

  
  @ApiModelProperty(example = "null", value = "List of best point for the requested user")
  @JsonProperty("bestPoints")
  public List<UserBestPointsItem> getBestPoints() {
    return bestPoints;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBestPoints userBestPoints = (UserBestPoints) o;
    return Objects.equals(this.user, userBestPoints.user) &&
        Objects.equals(this.bestPoints, userBestPoints.bestPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, bestPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBestPoints {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    bestPoints: ").append(toIndentedString(bestPoints)).append("\n");
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

