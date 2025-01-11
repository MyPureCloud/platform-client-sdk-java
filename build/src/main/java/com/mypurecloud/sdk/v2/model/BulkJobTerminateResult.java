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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BulkJobError;
import com.mypurecloud.sdk.v2.model.BulkJobTerminateResultEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkJobTerminateResult
 */

public class BulkJobTerminateResult  implements Serializable {
  
  private BulkJobError error = null;
  private BulkJobTerminateResultEntity entity = null;

  
  /**
   * Error details if the operation failed.
   **/
  public BulkJobTerminateResult error(BulkJobError error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details if the operation failed.")
  @JsonProperty("error")
  public BulkJobError getError() {
    return error;
  }
  public void setError(BulkJobError error) {
    this.error = error;
  }


  /**
   * The result of the operation if it succeeded. For Workitem Bulk Terminate this is a summary.
   **/
  public BulkJobTerminateResult entity(BulkJobTerminateResultEntity entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the operation if it succeeded. For Workitem Bulk Terminate this is a summary.")
  @JsonProperty("entity")
  public BulkJobTerminateResultEntity getEntity() {
    return entity;
  }
  public void setEntity(BulkJobTerminateResultEntity entity) {
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
    BulkJobTerminateResult bulkJobTerminateResult = (BulkJobTerminateResult) o;

    return Objects.equals(this.error, bulkJobTerminateResult.error) &&
            Objects.equals(this.entity, bulkJobTerminateResult.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkJobTerminateResult {\n");
    
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

