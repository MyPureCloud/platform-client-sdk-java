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
import com.mypurecloud.sdk.v2.model.DisallowedEntityLearningAssignmentReference;
import com.mypurecloud.sdk.v2.model.LearningAssignmentEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningAssignmentBulkRemoveResponse
 */

public class LearningAssignmentBulkRemoveResponse  implements Serializable {
  
  private List<LearningAssignmentEntity> entities = new ArrayList<LearningAssignmentEntity>();
  private List<DisallowedEntityLearningAssignmentReference> disallowedEntities = new ArrayList<DisallowedEntityLearningAssignmentReference>();

  
  /**
   * The learning assignments that were removed successfully
   **/
  public LearningAssignmentBulkRemoveResponse entities(List<LearningAssignmentEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The learning assignments that were removed successfully")
  @JsonProperty("entities")
  public List<LearningAssignmentEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<LearningAssignmentEntity> entities) {
    this.entities = entities;
  }

  
  /**
   * The learning assignments that were not removed due to missing permissions
   **/
  public LearningAssignmentBulkRemoveResponse disallowedEntities(List<DisallowedEntityLearningAssignmentReference> disallowedEntities) {
    this.disallowedEntities = disallowedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The learning assignments that were not removed due to missing permissions")
  @JsonProperty("disallowedEntities")
  public List<DisallowedEntityLearningAssignmentReference> getDisallowedEntities() {
    return disallowedEntities;
  }
  public void setDisallowedEntities(List<DisallowedEntityLearningAssignmentReference> disallowedEntities) {
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
    LearningAssignmentBulkRemoveResponse learningAssignmentBulkRemoveResponse = (LearningAssignmentBulkRemoveResponse) o;
    return Objects.equals(this.entities, learningAssignmentBulkRemoveResponse.entities) &&
        Objects.equals(this.disallowedEntities, learningAssignmentBulkRemoveResponse.disallowedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, disallowedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentBulkRemoveResponse {\n");
    
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

