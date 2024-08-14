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
import com.mypurecloud.sdk.v2.model.WorkPlanBidGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanBidGroupSummaryList
 */

public class WorkPlanBidGroupSummaryList  implements Serializable {
  
  private List<WorkPlanBidGroupSummary> workPlanBidGroupSummaryList = new ArrayList<WorkPlanBidGroupSummary>();

  
  /**
   * List of work plan bid group summary
   **/
  public WorkPlanBidGroupSummaryList workPlanBidGroupSummaryList(List<WorkPlanBidGroupSummary> workPlanBidGroupSummaryList) {
    this.workPlanBidGroupSummaryList = workPlanBidGroupSummaryList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of work plan bid group summary")
  @JsonProperty("workPlanBidGroupSummaryList")
  public List<WorkPlanBidGroupSummary> getWorkPlanBidGroupSummaryList() {
    return workPlanBidGroupSummaryList;
  }
  public void setWorkPlanBidGroupSummaryList(List<WorkPlanBidGroupSummary> workPlanBidGroupSummaryList) {
    this.workPlanBidGroupSummaryList = workPlanBidGroupSummaryList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanBidGroupSummaryList workPlanBidGroupSummaryList = (WorkPlanBidGroupSummaryList) o;

    return Objects.equals(this.workPlanBidGroupSummaryList, workPlanBidGroupSummaryList.workPlanBidGroupSummaryList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlanBidGroupSummaryList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBidGroupSummaryList {\n");
    
    sb.append("    workPlanBidGroupSummaryList: ").append(toIndentedString(workPlanBidGroupSummaryList)).append("\n");
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

