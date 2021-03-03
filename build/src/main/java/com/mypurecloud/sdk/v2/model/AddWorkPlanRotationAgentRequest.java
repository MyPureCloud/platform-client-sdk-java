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
import com.mypurecloud.sdk.v2.model.DateRangeWithOptionalEnd;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AddWorkPlanRotationAgentRequest
 */

public class AddWorkPlanRotationAgentRequest  implements Serializable {
  
  private String userId = null;
  private DateRangeWithOptionalEnd dateRange = null;
  private Integer position = null;

  
  /**
   * The ID of an agent in this work plan rotation
   **/
  public AddWorkPlanRotationAgentRequest userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of an agent in this work plan rotation")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The date range to which this agent is effective in the work plan rotation
   **/
  public AddWorkPlanRotationAgentRequest dateRange(DateRangeWithOptionalEnd dateRange) {
    this.dateRange = dateRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date range to which this agent is effective in the work plan rotation")
  @JsonProperty("dateRange")
  public DateRangeWithOptionalEnd getDateRange() {
    return dateRange;
  }
  public void setDateRange(DateRangeWithOptionalEnd dateRange) {
    this.dateRange = dateRange;
  }

  
  /**
   * Start position of the work plan in the pattern for this agent in the work plan rotation. Position value starts from 0
   **/
  public AddWorkPlanRotationAgentRequest position(Integer position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start position of the work plan in the pattern for this agent in the work plan rotation. Position value starts from 0")
  @JsonProperty("position")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddWorkPlanRotationAgentRequest addWorkPlanRotationAgentRequest = (AddWorkPlanRotationAgentRequest) o;
    return Objects.equals(this.userId, addWorkPlanRotationAgentRequest.userId) &&
        Objects.equals(this.dateRange, addWorkPlanRotationAgentRequest.dateRange) &&
        Objects.equals(this.position, addWorkPlanRotationAgentRequest.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, dateRange, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWorkPlanRotationAgentRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

