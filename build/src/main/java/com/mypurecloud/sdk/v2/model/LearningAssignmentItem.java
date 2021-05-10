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
 * LearningAssignmentItem
 */

public class LearningAssignmentItem  implements Serializable {
  
  private String moduleId = null;
  private String userId = null;

  
  /**
   * The Learning Module ID associated with this assignment
   **/
  public LearningAssignmentItem moduleId(String moduleId) {
    this.moduleId = moduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Learning Module ID associated with this assignment")
  @JsonProperty("moduleId")
  public String getModuleId() {
    return moduleId;
  }
  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }

  
  /**
   * The User ID associated with this assignment
   **/
  public LearningAssignmentItem userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The User ID associated with this assignment")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentItem learningAssignmentItem = (LearningAssignmentItem) o;
    return Objects.equals(this.moduleId, learningAssignmentItem.moduleId) &&
        Objects.equals(this.userId, learningAssignmentItem.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentItem {\n");
    
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

