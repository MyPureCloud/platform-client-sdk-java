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
 * UserProfilesInDateRangeRequest
 */

public class UserProfilesInDateRangeRequest  implements Serializable {
  
  private String startWorkday = null;
  private String endWorkday = null;

  public UserProfilesInDateRangeRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Start work day in ISO-8601 format used in the date range.
   **/
  public UserProfilesInDateRangeRequest startWorkday(String startWorkday) {
    this.startWorkday = startWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "2022-11-07", required = true, value = "Start work day in ISO-8601 format used in the date range.")
  @JsonProperty("startWorkday")
  public String getStartWorkday() {
    return startWorkday;
  }
  public void setStartWorkday(String startWorkday) {
    this.startWorkday = startWorkday;
  }


  /**
   * End work day in ISO-8601 format used in the date range.
   **/
  public UserProfilesInDateRangeRequest endWorkday(String endWorkday) {
    this.endWorkday = endWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "2022-11-11", required = true, value = "End work day in ISO-8601 format used in the date range.")
  @JsonProperty("endWorkday")
  public String getEndWorkday() {
    return endWorkday;
  }
  public void setEndWorkday(String endWorkday) {
    this.endWorkday = endWorkday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfilesInDateRangeRequest userProfilesInDateRangeRequest = (UserProfilesInDateRangeRequest) o;

    return Objects.equals(this.startWorkday, userProfilesInDateRangeRequest.startWorkday) &&
            Objects.equals(this.endWorkday, userProfilesInDateRangeRequest.endWorkday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startWorkday, endWorkday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfilesInDateRangeRequest {\n");
    
    sb.append("    startWorkday: ").append(toIndentedString(startWorkday)).append("\n");
    sb.append("    endWorkday: ").append(toIndentedString(endWorkday)).append("\n");
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

