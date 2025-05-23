package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DisallowedEntityLearningAssignmentItem
 */

public class DisallowedEntityLearningAssignmentItem  implements Serializable {
  
  private String errorCode = null;
  private LearningAssignmentItem entity = null;

  public DisallowedEntityLearningAssignmentItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The error code associated with this disallowed entity
   **/
  public DisallowedEntityLearningAssignmentItem errorCode(String errorCode) {
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
  public DisallowedEntityLearningAssignmentItem entity(LearningAssignmentItem entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity that was disallowed")
  @JsonProperty("entity")
  public LearningAssignmentItem getEntity() {
    return entity;
  }
  public void setEntity(LearningAssignmentItem entity) {
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
    DisallowedEntityLearningAssignmentItem disallowedEntityLearningAssignmentItem = (DisallowedEntityLearningAssignmentItem) o;

    return Objects.equals(this.errorCode, disallowedEntityLearningAssignmentItem.errorCode) &&
            Objects.equals(this.entity, disallowedEntityLearningAssignmentItem.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisallowedEntityLearningAssignmentItem {\n");
    
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

