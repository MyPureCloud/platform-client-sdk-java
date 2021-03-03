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
import com.mypurecloud.sdk.v2.model.AuditLogMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditQueryExecutionResultsResponse
 */

public class AuditQueryExecutionResultsResponse  implements Serializable {
  
  private String id = null;
  private Integer pageSize = null;
  private String cursor = null;
  private List<AuditLogMessage> entities = new ArrayList<AuditLogMessage>();

  
  /**
   * Id of the audit query execution request.
   **/
  public AuditQueryExecutionResultsResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the audit query execution request.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Number of results in a page.
   **/
  public AuditQueryExecutionResultsResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of results in a page.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * Optional cursor to indicate where to resume the results.
   **/
  public AuditQueryExecutionResultsResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional cursor to indicate where to resume the results.")
  @JsonProperty("cursor")
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  /**
   * List of audit messages.
   **/
  public AuditQueryExecutionResultsResponse entities(List<AuditLogMessage> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of audit messages.")
  @JsonProperty("entities")
  public List<AuditLogMessage> getEntities() {
    return entities;
  }
  public void setEntities(List<AuditLogMessage> entities) {
    this.entities = entities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditQueryExecutionResultsResponse auditQueryExecutionResultsResponse = (AuditQueryExecutionResultsResponse) o;
    return Objects.equals(this.id, auditQueryExecutionResultsResponse.id) &&
        Objects.equals(this.pageSize, auditQueryExecutionResultsResponse.pageSize) &&
        Objects.equals(this.cursor, auditQueryExecutionResultsResponse.cursor) &&
        Objects.equals(this.entities, auditQueryExecutionResultsResponse.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pageSize, cursor, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditQueryExecutionResultsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

