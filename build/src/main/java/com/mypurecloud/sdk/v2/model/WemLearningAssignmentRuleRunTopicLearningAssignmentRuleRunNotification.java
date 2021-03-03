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
import com.mypurecloud.sdk.v2.model.WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification
 */

public class WemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification  implements Serializable {
  
  private List<WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated> entities = new ArrayList<WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated>();
  private Integer total = null;

  
  /**
   **/
  public WemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification entities(List<WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated> getEntities() {
    return entities;
  }
  public void setEntities(List<WemLearningAssignmentRuleRunTopicWemLearningAssignmentsCreated> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public WemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification total(Integer total) {
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
    WemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification wemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification = (WemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification) o;
    return Objects.equals(this.entities, wemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification.entities) &&
        Objects.equals(this.total, wemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemLearningAssignmentRuleRunTopicLearningAssignmentRuleRunNotification {\n");
    
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

