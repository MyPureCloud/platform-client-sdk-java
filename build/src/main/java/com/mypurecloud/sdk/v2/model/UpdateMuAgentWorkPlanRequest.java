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
import com.mypurecloud.sdk.v2.model.ValueWrapperString;
import com.mypurecloud.sdk.v2.model.WorkPlanOverrideListWrapperWorkPlanOverrideRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateMuAgentWorkPlanRequest
 */

public class UpdateMuAgentWorkPlanRequest  implements Serializable {
  
  private String userId = null;
  private ValueWrapperString workPlanId = null;
  private WorkPlanOverrideListWrapperWorkPlanOverrideRequest workPlanOverrides = null;

  
  /**
   * The agent id for whom the work plan is updated
   **/
  public UpdateMuAgentWorkPlanRequest userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agent id for whom the work plan is updated")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The current work plan ID for the agent
   **/
  public UpdateMuAgentWorkPlanRequest workPlanId(ValueWrapperString workPlanId) {
    this.workPlanId = workPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current work plan ID for the agent")
  @JsonProperty("workPlanId")
  public ValueWrapperString getWorkPlanId() {
    return workPlanId;
  }
  public void setWorkPlanId(ValueWrapperString workPlanId) {
    this.workPlanId = workPlanId;
  }


  /**
   * The list of work plan overrides for the agent
   **/
  public UpdateMuAgentWorkPlanRequest workPlanOverrides(WorkPlanOverrideListWrapperWorkPlanOverrideRequest workPlanOverrides) {
    this.workPlanOverrides = workPlanOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of work plan overrides for the agent")
  @JsonProperty("workPlanOverrides")
  public WorkPlanOverrideListWrapperWorkPlanOverrideRequest getWorkPlanOverrides() {
    return workPlanOverrides;
  }
  public void setWorkPlanOverrides(WorkPlanOverrideListWrapperWorkPlanOverrideRequest workPlanOverrides) {
    this.workPlanOverrides = workPlanOverrides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMuAgentWorkPlanRequest updateMuAgentWorkPlanRequest = (UpdateMuAgentWorkPlanRequest) o;

    return Objects.equals(this.userId, updateMuAgentWorkPlanRequest.userId) &&
            Objects.equals(this.workPlanId, updateMuAgentWorkPlanRequest.workPlanId) &&
            Objects.equals(this.workPlanOverrides, updateMuAgentWorkPlanRequest.workPlanOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, workPlanId, workPlanOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMuAgentWorkPlanRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    workPlanOverrides: ").append(toIndentedString(workPlanOverrides)).append("\n");
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

