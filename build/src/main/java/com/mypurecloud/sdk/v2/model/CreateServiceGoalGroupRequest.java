package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CreateQueueMediaAssociationRequest;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroupGoals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Service Goal Group
 */
@ApiModel(description = "Service Goal Group")

public class CreateServiceGoalGroupRequest  implements Serializable {
  
  private String name = null;
  private ServiceGoalGroupGoals goals = null;
  private List<CreateQueueMediaAssociationRequest> queueMediaAssociations = new ArrayList<CreateQueueMediaAssociationRequest>();

  
  /**
   * name
   **/
  public CreateServiceGoalGroupRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Goals defined for this service goal group
   **/
  public CreateServiceGoalGroupRequest goals(ServiceGoalGroupGoals goals) {
    this.goals = goals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Goals defined for this service goal group")
  @JsonProperty("goals")
  public ServiceGoalGroupGoals getGoals() {
    return goals;
  }
  public void setGoals(ServiceGoalGroupGoals goals) {
    this.goals = goals;
  }

  
  /**
   * List of queues and media types from that queue to associate with this service goal group
   **/
  public CreateServiceGoalGroupRequest queueMediaAssociations(List<CreateQueueMediaAssociationRequest> queueMediaAssociations) {
    this.queueMediaAssociations = queueMediaAssociations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of queues and media types from that queue to associate with this service goal group")
  @JsonProperty("queueMediaAssociations")
  public List<CreateQueueMediaAssociationRequest> getQueueMediaAssociations() {
    return queueMediaAssociations;
  }
  public void setQueueMediaAssociations(List<CreateQueueMediaAssociationRequest> queueMediaAssociations) {
    this.queueMediaAssociations = queueMediaAssociations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceGoalGroupRequest createServiceGoalGroupRequest = (CreateServiceGoalGroupRequest) o;
    return Objects.equals(this.name, createServiceGoalGroupRequest.name) &&
        Objects.equals(this.goals, createServiceGoalGroupRequest.goals) &&
        Objects.equals(this.queueMediaAssociations, createServiceGoalGroupRequest.queueMediaAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, goals, queueMediaAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceGoalGroupRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    queueMediaAssociations: ").append(toIndentedString(queueMediaAssociations)).append("\n");
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

