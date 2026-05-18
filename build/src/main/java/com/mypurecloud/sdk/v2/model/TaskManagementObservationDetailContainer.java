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
import com.mypurecloud.sdk.v2.model.UserReferenceWithName;
import com.mypurecloud.sdk.v2.model.WorktypeReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TaskManagementObservationDetailContainer
 */

public class TaskManagementObservationDetailContainer  implements Serializable {
  
  private List<WorktypeReference> typeDetails = null;
  private List<UserReferenceWithName> assigneeDetails = null;

  public TaskManagementObservationDetailContainer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      typeDetails = new ArrayList<WorktypeReference>();
      assigneeDetails = new ArrayList<UserReferenceWithName>();
    }
  }

  public TaskManagementObservationDetailContainer(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      typeDetails = new ArrayList<WorktypeReference>();
      assigneeDetails = new ArrayList<UserReferenceWithName>();
    }
  }

  
  /**
   * Information about worktypes referenced in the results. Present when 'type' is included in the expands parameter.
   **/
  public TaskManagementObservationDetailContainer typeDetails(List<WorktypeReference> typeDetails) {
    this.typeDetails = typeDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about worktypes referenced in the results. Present when 'type' is included in the expands parameter.")
  @JsonProperty("typeDetails")
  public List<WorktypeReference> getTypeDetails() {
    return typeDetails;
  }
  public void setTypeDetails(List<WorktypeReference> typeDetails) {
    this.typeDetails = typeDetails;
  }


  /**
   * Information about assignees referenced in the results. Present when 'assignee' is included in the expands parameter.
   **/
  public TaskManagementObservationDetailContainer assigneeDetails(List<UserReferenceWithName> assigneeDetails) {
    this.assigneeDetails = assigneeDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about assignees referenced in the results. Present when 'assignee' is included in the expands parameter.")
  @JsonProperty("assigneeDetails")
  public List<UserReferenceWithName> getAssigneeDetails() {
    return assigneeDetails;
  }
  public void setAssigneeDetails(List<UserReferenceWithName> assigneeDetails) {
    this.assigneeDetails = assigneeDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskManagementObservationDetailContainer taskManagementObservationDetailContainer = (TaskManagementObservationDetailContainer) o;

    return Objects.equals(this.typeDetails, taskManagementObservationDetailContainer.typeDetails) &&
            Objects.equals(this.assigneeDetails, taskManagementObservationDetailContainer.assigneeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeDetails, assigneeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementObservationDetailContainer {\n");
    
    sb.append("    typeDetails: ").append(toIndentedString(typeDetails)).append("\n");
    sb.append("    assigneeDetails: ").append(toIndentedString(assigneeDetails)).append("\n");
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

