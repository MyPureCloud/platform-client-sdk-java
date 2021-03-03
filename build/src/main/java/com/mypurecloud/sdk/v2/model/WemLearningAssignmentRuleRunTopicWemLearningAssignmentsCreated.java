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
import com.mypurecloud.sdk.v2.model.WemLearningAssignmentRuleRunTopicLearningModuleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated
 */

public class WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated  implements Serializable {
  
  private WemLearningAssignmentRuleRunTopicLearningModuleReference module = null;

  
  /**
   **/
  public WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated module(WemLearningAssignmentRuleRunTopicLearningModuleReference module) {
    this.module = module;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("module")
  public WemLearningAssignmentRuleRunTopicLearningModuleReference getModule() {
    return module;
  }
  public void setModule(WemLearningAssignmentRuleRunTopicLearningModuleReference module) {
    this.module = module;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated wemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated = (WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated) o;
    return Objects.equals(this.module, wemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated.module);
  }

  @Override
  public int hashCode() {
    return Objects.hash(module);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated {\n");
    
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
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

