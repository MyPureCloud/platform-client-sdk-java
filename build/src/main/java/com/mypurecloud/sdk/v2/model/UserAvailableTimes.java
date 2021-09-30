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
import com.mypurecloud.sdk.v2.model.AvailableTime;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserAvailableTimes
 */

public class UserAvailableTimes  implements Serializable {
  
  private UserReference user = null;
  private List<AvailableTime> availableTimes = new ArrayList<AvailableTime>();

  
  @ApiModelProperty(example = "null", value = "User reference")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }

  
  @ApiModelProperty(example = "null", value = "Periods of availability to schedule coaching appointment for an user")
  @JsonProperty("availableTimes")
  public List<AvailableTime> getAvailableTimes() {
    return availableTimes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAvailableTimes userAvailableTimes = (UserAvailableTimes) o;
    return Objects.equals(this.user, userAvailableTimes.user) &&
        Objects.equals(this.availableTimes, userAvailableTimes.availableTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, availableTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAvailableTimes {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    availableTimes: ").append(toIndentedString(availableTimes)).append("\n");
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

