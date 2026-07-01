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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScreenMonitoringUserDetails
 */

public class ScreenMonitoringUserDetails  implements Serializable {
  
  private Integer count = null;
  private AddressableEntityRef targetUser = null;

  public ScreenMonitoringUserDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScreenMonitoringUserDetails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public ScreenMonitoringUserDetails count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   * The user being monitored
   **/
  public ScreenMonitoringUserDetails targetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user being monitored")
  @JsonProperty("targetUser")
  public AddressableEntityRef getTargetUser() {
    return targetUser;
  }
  public void setTargetUser(AddressableEntityRef targetUser) {
    this.targetUser = targetUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenMonitoringUserDetails screenMonitoringUserDetails = (ScreenMonitoringUserDetails) o;

    return Objects.equals(this.count, screenMonitoringUserDetails.count) &&
            Objects.equals(this.targetUser, screenMonitoringUserDetails.targetUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, targetUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenMonitoringUserDetails {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    targetUser: ").append(toIndentedString(targetUser)).append("\n");
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

