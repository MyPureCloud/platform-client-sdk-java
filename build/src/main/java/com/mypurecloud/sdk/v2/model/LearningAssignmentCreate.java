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
import java.util.Date;

import java.io.Serializable;
/**
 * LearningAssignmentCreate
 */

public class LearningAssignmentCreate  implements Serializable {
  
  private String moduleId = null;
  private String userId = null;
  private Date recommendedCompletionDate = null;

  
  /**
   * The Learning module Id associated with this assignment
   **/
  public LearningAssignmentCreate moduleId(String moduleId) {
    this.moduleId = moduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Learning module Id associated with this assignment")
  @JsonProperty("moduleId")
  public String getModuleId() {
    return moduleId;
  }
  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }

  
  /**
   * The User for whom the assignment is assigned
   **/
  public LearningAssignmentCreate userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The User for whom the assignment is assigned")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The recommended completion date of assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LearningAssignmentCreate recommendedCompletionDate(Date recommendedCompletionDate) {
    this.recommendedCompletionDate = recommendedCompletionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recommended completion date of assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("recommendedCompletionDate")
  public Date getRecommendedCompletionDate() {
    return recommendedCompletionDate;
  }
  public void setRecommendedCompletionDate(Date recommendedCompletionDate) {
    this.recommendedCompletionDate = recommendedCompletionDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentCreate learningAssignmentCreate = (LearningAssignmentCreate) o;
    return Objects.equals(this.moduleId, learningAssignmentCreate.moduleId) &&
        Objects.equals(this.userId, learningAssignmentCreate.userId) &&
        Objects.equals(this.recommendedCompletionDate, learningAssignmentCreate.recommendedCompletionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleId, userId, recommendedCompletionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentCreate {\n");
    
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    recommendedCompletionDate: ").append(toIndentedString(recommendedCompletionDate)).append("\n");
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

