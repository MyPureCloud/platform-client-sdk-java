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
import com.mypurecloud.sdk.v2.model.PlanningGroupModel;
import com.mypurecloud.sdk.v2.model.SessionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ModelMetaDataResult
 */

public class ModelMetaDataResult  implements Serializable {
  
  private SessionInfo sessionInfo = null;
  private List<PlanningGroupModel> planningGroups = new ArrayList<PlanningGroupModel>();

  
  /**
   * Information about the continuous forecast session
   **/
  public ModelMetaDataResult sessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the continuous forecast session")
  @JsonProperty("sessionInfo")
  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }
  public void setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
  }


  /**
   * List of planning groups
   **/
  public ModelMetaDataResult planningGroups(List<PlanningGroupModel> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of planning groups")
  @JsonProperty("planningGroups")
  public List<PlanningGroupModel> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<PlanningGroupModel> planningGroups) {
    this.planningGroups = planningGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelMetaDataResult modelMetaDataResult = (ModelMetaDataResult) o;

    return Objects.equals(this.sessionInfo, modelMetaDataResult.sessionInfo) &&
            Objects.equals(this.planningGroups, modelMetaDataResult.planningGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionInfo, planningGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMetaDataResult {\n");
    
    sb.append("    sessionInfo: ").append(toIndentedString(sessionInfo)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
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

