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
import com.mypurecloud.sdk.v2.model.UserTimeOffRequestReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryWaitlistPositionsRequest
 */

public class QueryWaitlistPositionsRequest  implements Serializable {
  
  private List<UserTimeOffRequestReference> timeOffRequests = new ArrayList<UserTimeOffRequestReference>();

  
  /**
   * The list of the time off request ids for which to fetch the daily waitlist positions
   **/
  public QueryWaitlistPositionsRequest timeOffRequests(List<UserTimeOffRequestReference> timeOffRequests) {
    this.timeOffRequests = timeOffRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of the time off request ids for which to fetch the daily waitlist positions")
  @JsonProperty("timeOffRequests")
  public List<UserTimeOffRequestReference> getTimeOffRequests() {
    return timeOffRequests;
  }
  public void setTimeOffRequests(List<UserTimeOffRequestReference> timeOffRequests) {
    this.timeOffRequests = timeOffRequests;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryWaitlistPositionsRequest queryWaitlistPositionsRequest = (QueryWaitlistPositionsRequest) o;
    return Objects.equals(this.timeOffRequests, queryWaitlistPositionsRequest.timeOffRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryWaitlistPositionsRequest {\n");
    
    sb.append("    timeOffRequests: ").append(toIndentedString(timeOffRequests)).append("\n");
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

