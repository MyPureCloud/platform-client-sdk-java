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
import com.mypurecloud.sdk.v2.model.DisallowedEntityLearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningAssignmentBulkAddResponse
 */

public class LearningAssignmentBulkAddResponse  implements Serializable {
  
  private List<LearningAssignment> entities = new ArrayList<LearningAssignment>();
  private List<DisallowedEntityLearningAssignmentItem> disallowedEntities = new ArrayList<DisallowedEntityLearningAssignmentItem>();

  
  /**
   * The learning assignments that were assigned correctly
   **/
  public LearningAssignmentBulkAddResponse entities(List<LearningAssignment> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The learning assignments that were assigned correctly")
  @JsonProperty("entities")
  public List<LearningAssignment> getEntities() {
    return entities;
  }
  public void setEntities(List<LearningAssignment> entities) {
    this.entities = entities;
  }

  
  /**
   * The items that were not allowed to be assigned
   **/
  public LearningAssignmentBulkAddResponse disallowedEntities(List<DisallowedEntityLearningAssignmentItem> disallowedEntities) {
    this.disallowedEntities = disallowedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The items that were not allowed to be assigned")
  @JsonProperty("disallowedEntities")
  public List<DisallowedEntityLearningAssignmentItem> getDisallowedEntities() {
    return disallowedEntities;
  }
  public void setDisallowedEntities(List<DisallowedEntityLearningAssignmentItem> disallowedEntities) {
    this.disallowedEntities = disallowedEntities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentBulkAddResponse learningAssignmentBulkAddResponse = (LearningAssignmentBulkAddResponse) o;
    return Objects.equals(this.entities, learningAssignmentBulkAddResponse.entities) &&
        Objects.equals(this.disallowedEntities, learningAssignmentBulkAddResponse.disallowedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, disallowedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentBulkAddResponse {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    disallowedEntities: ").append(toIndentedString(disallowedEntities)).append("\n");
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

