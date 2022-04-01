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
import com.mypurecloud.sdk.v2.model.BulkError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkResult
 */

public class BulkResult  implements Serializable {
  
  private BulkError error = null;
  private Object entity = null;

  
  /**
   * Error details if the operation failed.
   **/
  public BulkResult error(BulkError error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details if the operation failed.")
  @JsonProperty("error")
  public BulkError getError() {
    return error;
  }
  public void setError(BulkError error) {
    this.error = error;
  }

  
  /**
   * The result of the operation if it succeeded.
   **/
  public BulkResult entity(Object entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the operation if it succeeded.")
  @JsonProperty("entity")
  public Object getEntity() {
    return entity;
  }
  public void setEntity(Object entity) {
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
    BulkResult bulkResult = (BulkResult) o;
    return Objects.equals(this.error, bulkResult.error) &&
        Objects.equals(this.entity, bulkResult.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResult {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

