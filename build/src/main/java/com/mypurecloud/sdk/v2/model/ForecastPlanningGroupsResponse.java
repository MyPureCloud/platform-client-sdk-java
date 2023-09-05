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
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupResponse;
import com.mypurecloud.sdk.v2.model.WfmServiceGoalImpactSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ForecastPlanningGroupsResponse
 */

public class ForecastPlanningGroupsResponse  implements Serializable {
  
  private List<ForecastPlanningGroupResponse> entities = new ArrayList<ForecastPlanningGroupResponse>();
  private WfmServiceGoalImpactSettings businessUnitServiceGoalImpact = null;

  
  /**
   **/
  public ForecastPlanningGroupsResponse entities(List<ForecastPlanningGroupResponse> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ForecastPlanningGroupResponse> getEntities() {
    return entities;
  }
  public void setEntities(List<ForecastPlanningGroupResponse> entities) {
    this.entities = entities;
  }


  /**
   * A snapshot of a business unit’s service goal impact settings taken at forecast generation time.
   **/
  public ForecastPlanningGroupsResponse businessUnitServiceGoalImpact(WfmServiceGoalImpactSettings businessUnitServiceGoalImpact) {
    this.businessUnitServiceGoalImpact = businessUnitServiceGoalImpact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A snapshot of a business unit’s service goal impact settings taken at forecast generation time.")
  @JsonProperty("businessUnitServiceGoalImpact")
  public WfmServiceGoalImpactSettings getBusinessUnitServiceGoalImpact() {
    return businessUnitServiceGoalImpact;
  }
  public void setBusinessUnitServiceGoalImpact(WfmServiceGoalImpactSettings businessUnitServiceGoalImpact) {
    this.businessUnitServiceGoalImpact = businessUnitServiceGoalImpact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastPlanningGroupsResponse forecastPlanningGroupsResponse = (ForecastPlanningGroupsResponse) o;

    return Objects.equals(this.entities, forecastPlanningGroupsResponse.entities) &&
            Objects.equals(this.businessUnitServiceGoalImpact, forecastPlanningGroupsResponse.businessUnitServiceGoalImpact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, businessUnitServiceGoalImpact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastPlanningGroupsResponse {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    businessUnitServiceGoalImpact: ").append(toIndentedString(businessUnitServiceGoalImpact)).append("\n");
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

