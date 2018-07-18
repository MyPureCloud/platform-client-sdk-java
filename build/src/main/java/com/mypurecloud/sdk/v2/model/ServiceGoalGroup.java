package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.QueueMediaAssociation;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroupGoals;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Service Goal Group
 */
@ApiModel(description = "Service Goal Group")

public class ServiceGoalGroup  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ServiceGoalGroupGoals goals = null;
  private List<QueueMediaAssociation> queueMediaAssociations = new ArrayList<QueueMediaAssociation>();
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ServiceGoalGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public ServiceGoalGroup goals(ServiceGoalGroupGoals goals) {
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
  public ServiceGoalGroup queueMediaAssociations(List<QueueMediaAssociation> queueMediaAssociations) {
    this.queueMediaAssociations = queueMediaAssociations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of queues and media types from that queue to associate with this service goal group")
  @JsonProperty("queueMediaAssociations")
  public List<QueueMediaAssociation> getQueueMediaAssociations() {
    return queueMediaAssociations;
  }
  public void setQueueMediaAssociations(List<QueueMediaAssociation> queueMediaAssociations) {
    this.queueMediaAssociations = queueMediaAssociations;
  }

  
  /**
   * Version metadata for the list of service goal groups for the associated management unit
   **/
  public ServiceGoalGroup metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the list of service goal groups for the associated management unit")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceGoalGroup serviceGoalGroup = (ServiceGoalGroup) o;
    return Objects.equals(this.id, serviceGoalGroup.id) &&
        Objects.equals(this.name, serviceGoalGroup.name) &&
        Objects.equals(this.goals, serviceGoalGroup.goals) &&
        Objects.equals(this.queueMediaAssociations, serviceGoalGroup.queueMediaAssociations) &&
        Objects.equals(this.metadata, serviceGoalGroup.metadata) &&
        Objects.equals(this.selfUri, serviceGoalGroup.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, goals, queueMediaAssociations, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGoalGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    queueMediaAssociations: ").append(toIndentedString(queueMediaAssociations)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

