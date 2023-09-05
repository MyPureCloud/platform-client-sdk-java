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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TimeOffRequestLookup
 */

public class TimeOffRequestLookup  implements Serializable {
  
  private String timeOffRequestId = null;
  private String userId = null;

  
  /**
   * The ID of the time off request
   **/
  public TimeOffRequestLookup timeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the time off request")
  @JsonProperty("timeOffRequestId")
  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }
  public void setTimeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
  }


  /**
   * The ID of the user to whom the time off request belongs
   **/
  public TimeOffRequestLookup userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the user to whom the time off request belongs")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequestLookup timeOffRequestLookup = (TimeOffRequestLookup) o;

    return Objects.equals(this.timeOffRequestId, timeOffRequestLookup.timeOffRequestId) &&
            Objects.equals(this.userId, timeOffRequestLookup.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequestId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestLookup {\n");
    
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

