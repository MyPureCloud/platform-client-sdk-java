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
import com.mypurecloud.sdk.v2.model.LearningAssignmentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DisallowedEntityLearningAssignmentReference
 */

public class DisallowedEntityLearningAssignmentReference  implements Serializable {
  
  private String errorCode = null;
  private LearningAssignmentReference entity = null;

  
  /**
   * The error code associated with this disallowed entity
   **/
  public DisallowedEntityLearningAssignmentReference errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error code associated with this disallowed entity")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   * The entity that was disallowed
   **/
  public DisallowedEntityLearningAssignmentReference entity(LearningAssignmentReference entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity that was disallowed")
  @JsonProperty("entity")
  public LearningAssignmentReference getEntity() {
    return entity;
  }
  public void setEntity(LearningAssignmentReference entity) {
    this.entity = entity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisallowedEntityLearningAssignmentReference disallowedEntityLearningAssignmentReference = (DisallowedEntityLearningAssignmentReference) o;
    return Objects.equals(this.errorCode, disallowedEntityLearningAssignmentReference.errorCode) &&
        Objects.equals(this.entity, disallowedEntityLearningAssignmentReference.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisallowedEntityLearningAssignmentReference {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

