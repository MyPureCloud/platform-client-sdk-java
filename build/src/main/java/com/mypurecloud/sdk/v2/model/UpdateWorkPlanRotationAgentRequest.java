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
 * UpdateWorkPlanRotationAgentRequest
 */

public class UpdateWorkPlanRotationAgentRequest  implements Serializable {
  
  private String userId = null;
  private DateRangeWithOptionalEnd dateRange = null;
  private Integer position = null;
  private Boolean delete = null;

  
  /**
   * The ID of an agent in this work plan rotation
   **/
  public UpdateWorkPlanRotationAgentRequest userId(String userId) {
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
  public UpdateWorkPlanRotationAgentRequest dateRange(DateRangeWithOptionalEnd dateRange) {
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
  public UpdateWorkPlanRotationAgentRequest position(Integer position) {
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

  
  /**
   * If marked true for this agent when updating, then this agent will be removed from this work plan rotation
   **/
  public UpdateWorkPlanRotationAgentRequest delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If marked true for this agent when updating, then this agent will be removed from this work plan rotation")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkPlanRotationAgentRequest updateWorkPlanRotationAgentRequest = (UpdateWorkPlanRotationAgentRequest) o;
    return Objects.equals(this.userId, updateWorkPlanRotationAgentRequest.userId) &&
        Objects.equals(this.dateRange, updateWorkPlanRotationAgentRequest.dateRange) &&
        Objects.equals(this.position, updateWorkPlanRotationAgentRequest.position) &&
        Objects.equals(this.delete, updateWorkPlanRotationAgentRequest.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, dateRange, position, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkPlanRotationAgentRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

