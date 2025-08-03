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
import com.mypurecloud.sdk.v2.model.PlanningGroupRequirementOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StaffingRequirementResultResponseTemplate
 */

public class StaffingRequirementResultResponseTemplate  implements Serializable {
  
  private List<PlanningGroupRequirementOutput> requirementResults = null;

  public StaffingRequirementResultResponseTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requirementResults = new ArrayList<PlanningGroupRequirementOutput>();
    }
  }

  
  /**
   * List of staffing requirement results
   **/
  public StaffingRequirementResultResponseTemplate requirementResults(List<PlanningGroupRequirementOutput> requirementResults) {
    this.requirementResults = requirementResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of staffing requirement results")
  @JsonProperty("requirementResults")
  public List<PlanningGroupRequirementOutput> getRequirementResults() {
    return requirementResults;
  }
  public void setRequirementResults(List<PlanningGroupRequirementOutput> requirementResults) {
    this.requirementResults = requirementResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingRequirementResultResponseTemplate staffingRequirementResultResponseTemplate = (StaffingRequirementResultResponseTemplate) o;

    return Objects.equals(this.requirementResults, staffingRequirementResultResponseTemplate.requirementResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingRequirementResultResponseTemplate {\n");
    
    sb.append("    requirementResults: ").append(toIndentedString(requirementResults)).append("\n");
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

