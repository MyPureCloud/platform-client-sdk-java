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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkPlanRotationAgentResponse
 */

public class WorkPlanRotationAgentResponse  implements Serializable {
  
  private UserReference user = null;
  private DateRangeWithOptionalEnd dateRange = null;
  private Integer position = null;

  
  /**
   * The user associated with this work plan rotation
   **/
  public WorkPlanRotationAgentResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user associated with this work plan rotation")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }

  
  /**
   * The date range to which this agent is effective in the work plan rotation
   **/
  public WorkPlanRotationAgentResponse dateRange(DateRangeWithOptionalEnd dateRange) {
    this.dateRange = dateRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date range to which this agent is effective in the work plan rotation")
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
  public WorkPlanRotationAgentResponse position(Integer position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start position of the work plan in the pattern for this agent in the work plan rotation. Position value starts from 0")
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
    WorkPlanRotationAgentResponse workPlanRotationAgentResponse = (WorkPlanRotationAgentResponse) o;
    return Objects.equals(this.user, workPlanRotationAgentResponse.user) &&
        Objects.equals(this.dateRange, workPlanRotationAgentResponse.dateRange) &&
        Objects.equals(this.position, workPlanRotationAgentResponse.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, dateRange, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanRotationAgentResponse {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

