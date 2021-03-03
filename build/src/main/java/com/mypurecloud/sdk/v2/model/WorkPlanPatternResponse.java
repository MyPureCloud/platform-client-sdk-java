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
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanPatternResponse
 */

public class WorkPlanPatternResponse  implements Serializable {
  
  private List<WorkPlanReference> workPlans = new ArrayList<WorkPlanReference>();

  
  /**
   * List of work plans in order of rotation on a weekly basis
   **/
  public WorkPlanPatternResponse workPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of work plans in order of rotation on a weekly basis")
  @JsonProperty("workPlans")
  public List<WorkPlanReference> getWorkPlans() {
    return workPlans;
  }
  public void setWorkPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanPatternResponse workPlanPatternResponse = (WorkPlanPatternResponse) o;
    return Objects.equals(this.workPlans, workPlanPatternResponse.workPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanPatternResponse {\n");
    
    sb.append("    workPlans: ").append(toIndentedString(workPlans)).append("\n");
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

