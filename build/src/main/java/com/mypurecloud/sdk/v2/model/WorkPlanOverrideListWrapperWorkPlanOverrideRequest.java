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
import com.mypurecloud.sdk.v2.model.WorkPlanOverrideRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanOverrideListWrapperWorkPlanOverrideRequest
 */

public class WorkPlanOverrideListWrapperWorkPlanOverrideRequest  implements Serializable {
  
  private List<WorkPlanOverrideRequest> values = new ArrayList<WorkPlanOverrideRequest>();
  private Boolean deleteAll = null;

  
  /**
   **/
  public WorkPlanOverrideListWrapperWorkPlanOverrideRequest values(List<WorkPlanOverrideRequest> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<WorkPlanOverrideRequest> getValues() {
    return values;
  }
  public void setValues(List<WorkPlanOverrideRequest> values) {
    this.values = values;
  }


  /**
   * if true, should delete all existing overrides for the agent and update the given overrides
   **/
  public WorkPlanOverrideListWrapperWorkPlanOverrideRequest deleteAll(Boolean deleteAll) {
    this.deleteAll = deleteAll;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "if true, should delete all existing overrides for the agent and update the given overrides")
  @JsonProperty("deleteAll")
  public Boolean getDeleteAll() {
    return deleteAll;
  }
  public void setDeleteAll(Boolean deleteAll) {
    this.deleteAll = deleteAll;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanOverrideListWrapperWorkPlanOverrideRequest workPlanOverrideListWrapperWorkPlanOverrideRequest = (WorkPlanOverrideListWrapperWorkPlanOverrideRequest) o;

    return Objects.equals(this.values, workPlanOverrideListWrapperWorkPlanOverrideRequest.values) &&
            Objects.equals(this.deleteAll, workPlanOverrideListWrapperWorkPlanOverrideRequest.deleteAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, deleteAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanOverrideListWrapperWorkPlanOverrideRequest {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    deleteAll: ").append(toIndentedString(deleteAll)).append("\n");
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

