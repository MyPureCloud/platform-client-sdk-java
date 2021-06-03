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
import com.mypurecloud.sdk.v2.model.QualityAuditLogMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QualityAuditQueryExecutionResultsResponse
 */

public class QualityAuditQueryExecutionResultsResponse  implements Serializable {
  
  private String id = null;
  private Integer pageSize = null;
  private String cursor = null;
  private List<QualityAuditLogMessage> entities = new ArrayList<QualityAuditLogMessage>();

  
  /**
   * Id of the audit query execution request.
   **/
  public QualityAuditQueryExecutionResultsResponse id(String id) {
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
  public QualityAuditQueryExecutionResultsResponse pageSize(Integer pageSize) {
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
  public QualityAuditQueryExecutionResultsResponse cursor(String cursor) {
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
  public QualityAuditQueryExecutionResultsResponse entities(List<QualityAuditLogMessage> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of audit messages.")
  @JsonProperty("entities")
  public List<QualityAuditLogMessage> getEntities() {
    return entities;
  }
  public void setEntities(List<QualityAuditLogMessage> entities) {
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
    QualityAuditQueryExecutionResultsResponse qualityAuditQueryExecutionResultsResponse = (QualityAuditQueryExecutionResultsResponse) o;
    return Objects.equals(this.id, qualityAuditQueryExecutionResultsResponse.id) &&
        Objects.equals(this.pageSize, qualityAuditQueryExecutionResultsResponse.pageSize) &&
        Objects.equals(this.cursor, qualityAuditQueryExecutionResultsResponse.cursor) &&
        Objects.equals(this.entities, qualityAuditQueryExecutionResultsResponse.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pageSize, cursor, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityAuditQueryExecutionResultsResponse {\n");
    
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

