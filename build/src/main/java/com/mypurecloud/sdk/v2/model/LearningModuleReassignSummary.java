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

import java.io.Serializable;
/**
 * Learning module reassign summary data
 */
@ApiModel(description = "Learning module reassign summary data")

public class LearningModuleReassignSummary  implements Serializable {
  
  private Integer totalReassigned = null;
  private Integer completedCount = null;
  private Integer inProgressCount = null;
  private Integer assignedCount = null;
  private Integer notCompletedCount = null;

  
  /**
   * The total number of users for whom assignment is reassigned
   **/
  public LearningModuleReassignSummary totalReassigned(Integer totalReassigned) {
    this.totalReassigned = totalReassigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of users for whom assignment is reassigned")
  @JsonProperty("totalReassigned")
  public Integer getTotalReassigned() {
    return totalReassigned;
  }
  public void setTotalReassigned(Integer totalReassigned) {
    this.totalReassigned = totalReassigned;
  }

  
  /**
   * The total number of users who have the assignment in Completed state
   **/
  public LearningModuleReassignSummary completedCount(Integer completedCount) {
    this.completedCount = completedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of users who have the assignment in Completed state")
  @JsonProperty("completedCount")
  public Integer getCompletedCount() {
    return completedCount;
  }
  public void setCompletedCount(Integer completedCount) {
    this.completedCount = completedCount;
  }

  
  /**
   * The total number of users who have the assignment in InProgress state
   **/
  public LearningModuleReassignSummary inProgressCount(Integer inProgressCount) {
    this.inProgressCount = inProgressCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of users who have the assignment in InProgress state")
  @JsonProperty("inProgressCount")
  public Integer getInProgressCount() {
    return inProgressCount;
  }
  public void setInProgressCount(Integer inProgressCount) {
    this.inProgressCount = inProgressCount;
  }

  
  /**
   * The total number of users who have the assignment in Assigned state
   **/
  public LearningModuleReassignSummary assignedCount(Integer assignedCount) {
    this.assignedCount = assignedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of users who have the assignment in Assigned state")
  @JsonProperty("assignedCount")
  public Integer getAssignedCount() {
    return assignedCount;
  }
  public void setAssignedCount(Integer assignedCount) {
    this.assignedCount = assignedCount;
  }

  
  /**
   * The total number of users who have their assignment overdue
   **/
  public LearningModuleReassignSummary notCompletedCount(Integer notCompletedCount) {
    this.notCompletedCount = notCompletedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of users who have their assignment overdue")
  @JsonProperty("notCompletedCount")
  public Integer getNotCompletedCount() {
    return notCompletedCount;
  }
  public void setNotCompletedCount(Integer notCompletedCount) {
    this.notCompletedCount = notCompletedCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleReassignSummary learningModuleReassignSummary = (LearningModuleReassignSummary) o;
    return Objects.equals(this.totalReassigned, learningModuleReassignSummary.totalReassigned) &&
        Objects.equals(this.completedCount, learningModuleReassignSummary.completedCount) &&
        Objects.equals(this.inProgressCount, learningModuleReassignSummary.inProgressCount) &&
        Objects.equals(this.assignedCount, learningModuleReassignSummary.assignedCount) &&
        Objects.equals(this.notCompletedCount, learningModuleReassignSummary.notCompletedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalReassigned, completedCount, inProgressCount, assignedCount, notCompletedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleReassignSummary {\n");
    
    sb.append("    totalReassigned: ").append(toIndentedString(totalReassigned)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    inProgressCount: ").append(toIndentedString(inProgressCount)).append("\n");
    sb.append("    assignedCount: ").append(toIndentedString(assignedCount)).append("\n");
    sb.append("    notCompletedCount: ").append(toIndentedString(notCompletedCount)).append("\n");
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

