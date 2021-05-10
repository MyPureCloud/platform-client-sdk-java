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
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Learning module users query request model
 */
@ApiModel(description = "Learning module users query request model")

public class LearningAssignmentUserQuery  implements Serializable {
  
  private LearningModuleRule rule = null;
  private String searchTerm = null;

  
  /**
   * Learning module rule object
   **/
  public LearningAssignmentUserQuery rule(LearningModuleRule rule) {
    this.rule = rule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Learning module rule object")
  @JsonProperty("rule")
  public LearningModuleRule getRule() {
    return rule;
  }
  public void setRule(LearningModuleRule rule) {
    this.rule = rule;
  }

  
  /**
   * The user name to be searched for
   **/
  public LearningAssignmentUserQuery searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user name to be searched for")
  @JsonProperty("searchTerm")
  public String getSearchTerm() {
    return searchTerm;
  }
  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentUserQuery learningAssignmentUserQuery = (LearningAssignmentUserQuery) o;
    return Objects.equals(this.rule, learningAssignmentUserQuery.rule) &&
        Objects.equals(this.searchTerm, learningAssignmentUserQuery.searchTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, searchTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentUserQuery {\n");
    
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
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

