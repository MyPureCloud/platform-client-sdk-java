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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemStatusFilter
 */

public class WorkitemStatusFilter  implements Serializable {
  
  private String worktypeId = null;
  private String workitemStatusId = null;

  public WorkitemStatusFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Worktype ID belonging to the selected workitem status
   **/
  public WorkitemStatusFilter worktypeId(String worktypeId) {
    this.worktypeId = worktypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Worktype ID belonging to the selected workitem status")
  @JsonProperty("worktypeId")
  public String getWorktypeId() {
    return worktypeId;
  }
  public void setWorktypeId(String worktypeId) {
    this.worktypeId = worktypeId;
  }


  /**
   * Workitem status ID
   **/
  public WorkitemStatusFilter workitemStatusId(String workitemStatusId) {
    this.workitemStatusId = workitemStatusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Workitem status ID")
  @JsonProperty("workitemStatusId")
  public String getWorkitemStatusId() {
    return workitemStatusId;
  }
  public void setWorkitemStatusId(String workitemStatusId) {
    this.workitemStatusId = workitemStatusId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemStatusFilter workitemStatusFilter = (WorkitemStatusFilter) o;

    return Objects.equals(this.worktypeId, workitemStatusFilter.worktypeId) &&
            Objects.equals(this.workitemStatusId, workitemStatusFilter.workitemStatusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worktypeId, workitemStatusId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemStatusFilter {\n");
    
    sb.append("    worktypeId: ").append(toIndentedString(worktypeId)).append("\n");
    sb.append("    workitemStatusId: ").append(toIndentedString(workitemStatusId)).append("\n");
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

