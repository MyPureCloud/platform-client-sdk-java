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
import com.mypurecloud.sdk.v2.model.BulkJobAddWorkitemSummary;
import com.mypurecloud.sdk.v2.model.BulkJobError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkJobAddResult
 */

public class BulkJobAddResult  implements Serializable {
  
  private BulkJobError error = null;
  private BulkJobAddWorkitemSummary entity = null;

  
  /**
   * Error details if the operation failed.
   **/
  public BulkJobAddResult error(BulkJobError error) {
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
   * The result of the operation if it succeeded. For Workitem Bulk Add this is a summary.
   **/
  public BulkJobAddResult entity(BulkJobAddWorkitemSummary entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the operation if it succeeded. For Workitem Bulk Add this is a summary.")
  @JsonProperty("entity")
  public BulkJobAddWorkitemSummary getEntity() {
    return entity;
  }
  public void setEntity(BulkJobAddWorkitemSummary entity) {
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
    BulkJobAddResult bulkJobAddResult = (BulkJobAddResult) o;

    return Objects.equals(this.error, bulkJobAddResult.error) &&
            Objects.equals(this.entity, bulkJobAddResult.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkJobAddResult {\n");
    
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

