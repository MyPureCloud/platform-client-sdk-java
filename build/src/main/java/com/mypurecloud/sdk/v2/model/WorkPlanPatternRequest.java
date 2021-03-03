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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanPatternRequest
 */

public class WorkPlanPatternRequest  implements Serializable {
  
  private List<String> workPlanIds = new ArrayList<String>();

  
  /**
   * List of work plan IDs in order of rotation on a weekly basis. Values in the list cannot be null or empty
   **/
  public WorkPlanPatternRequest workPlanIds(List<String> workPlanIds) {
    this.workPlanIds = workPlanIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of work plan IDs in order of rotation on a weekly basis. Values in the list cannot be null or empty")
  @JsonProperty("workPlanIds")
  public List<String> getWorkPlanIds() {
    return workPlanIds;
  }
  public void setWorkPlanIds(List<String> workPlanIds) {
    this.workPlanIds = workPlanIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanPatternRequest workPlanPatternRequest = (WorkPlanPatternRequest) o;
    return Objects.equals(this.workPlanIds, workPlanPatternRequest.workPlanIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlanIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanPatternRequest {\n");
    
    sb.append("    workPlanIds: ").append(toIndentedString(workPlanIds)).append("\n");
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

