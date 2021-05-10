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
 * Learning module summary data
 */
@ApiModel(description = "Learning module summary data")

public class LearningModuleSummary  implements Serializable {
  
  private Integer assignedCount = null;
  private Integer completedCount = null;
  private Integer passedCount = null;
  private Float completedSum = null;

  
  /**
   * The total number of assignments assigned for a learning module
   **/
  public LearningModuleSummary assignedCount(Integer assignedCount) {
    this.assignedCount = assignedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of assignments assigned for a learning module")
  @JsonProperty("assignedCount")
  public Integer getAssignedCount() {
    return assignedCount;
  }
  public void setAssignedCount(Integer assignedCount) {
    this.assignedCount = assignedCount;
  }

  
  /**
   * The number of assignments completed for a learning module
   **/
  public LearningModuleSummary completedCount(Integer completedCount) {
    this.completedCount = completedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of assignments completed for a learning module")
  @JsonProperty("completedCount")
  public Integer getCompletedCount() {
    return completedCount;
  }
  public void setCompletedCount(Integer completedCount) {
    this.completedCount = completedCount;
  }

  
  /**
   * The number of assignments passed for a learning module
   **/
  public LearningModuleSummary passedCount(Integer passedCount) {
    this.passedCount = passedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of assignments passed for a learning module")
  @JsonProperty("passedCount")
  public Integer getPassedCount() {
    return passedCount;
  }
  public void setPassedCount(Integer passedCount) {
    this.passedCount = passedCount;
  }

  
  /**
   * The sum of assignment scores for a learning module
   **/
  public LearningModuleSummary completedSum(Float completedSum) {
    this.completedSum = completedSum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sum of assignment scores for a learning module")
  @JsonProperty("completedSum")
  public Float getCompletedSum() {
    return completedSum;
  }
  public void setCompletedSum(Float completedSum) {
    this.completedSum = completedSum;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleSummary learningModuleSummary = (LearningModuleSummary) o;
    return Objects.equals(this.assignedCount, learningModuleSummary.assignedCount) &&
        Objects.equals(this.completedCount, learningModuleSummary.completedCount) &&
        Objects.equals(this.passedCount, learningModuleSummary.passedCount) &&
        Objects.equals(this.completedSum, learningModuleSummary.completedSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedCount, completedCount, passedCount, completedSum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleSummary {\n");
    
    sb.append("    assignedCount: ").append(toIndentedString(assignedCount)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    passedCount: ").append(toIndentedString(passedCount)).append("\n");
    sb.append("    completedSum: ").append(toIndentedString(completedSum)).append("\n");
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

