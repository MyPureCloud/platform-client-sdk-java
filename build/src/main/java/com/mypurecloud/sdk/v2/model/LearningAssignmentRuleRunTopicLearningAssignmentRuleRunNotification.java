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
import com.mypurecloud.sdk.v2.model.LearningAssignmentRuleRunTopicLearningAssignmentsCreated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification
 */

public class LearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification  implements Serializable {
  
  private List<LearningAssignmentRuleRunTopicLearningAssignmentsCreated> entities = new ArrayList<LearningAssignmentRuleRunTopicLearningAssignmentsCreated>();
  private Integer total = null;

  
  /**
   **/
  public LearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification entities(List<LearningAssignmentRuleRunTopicLearningAssignmentsCreated> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<LearningAssignmentRuleRunTopicLearningAssignmentsCreated> getEntities() {
    return entities;
  }
  public void setEntities(List<LearningAssignmentRuleRunTopicLearningAssignmentsCreated> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public LearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification total(Integer total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification learningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification = (LearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification) o;
    return Objects.equals(this.entities, learningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification.entities) &&
        Objects.equals(this.total, learningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

