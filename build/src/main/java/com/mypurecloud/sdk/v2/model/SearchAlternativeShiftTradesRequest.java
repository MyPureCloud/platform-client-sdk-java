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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchAlternativeShiftTradesRequest
 */

public class SearchAlternativeShiftTradesRequest  implements Serializable {
  
  private List<String> managementUnitIds = new ArrayList<String>();
  private List<String> agentIds = new ArrayList<String>();

  
  /**
   * The list of management unit IDs for this alternative shift trade search. Either managementUnitIds or agentIds is required
   **/
  public SearchAlternativeShiftTradesRequest managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of management unit IDs for this alternative shift trade search. Either managementUnitIds or agentIds is required")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }


  /**
   * The list of agent IDs for this alternative shift trade search. Either managementUnitIds or agentIds is required
   **/
  public SearchAlternativeShiftTradesRequest agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of agent IDs for this alternative shift trade search. Either managementUnitIds or agentIds is required")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAlternativeShiftTradesRequest searchAlternativeShiftTradesRequest = (SearchAlternativeShiftTradesRequest) o;

    return Objects.equals(this.managementUnitIds, searchAlternativeShiftTradesRequest.managementUnitIds) &&
            Objects.equals(this.agentIds, searchAlternativeShiftTradesRequest.agentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitIds, agentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAlternativeShiftTradesRequest {\n");
    
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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

