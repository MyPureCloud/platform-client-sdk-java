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
import com.mypurecloud.sdk.v2.model.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeExportJobDocumentsFilter
 */

public class KnowledgeExportJobDocumentsFilter  implements Serializable {
  
  private String interval = null;
  private List<Entity> entities = new ArrayList<Entity>();
  private String sourceId = null;

  
  /**
   * Retrieves the documents modified in specified date and time range. Cannot be used together with entities filter. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public KnowledgeExportJobDocumentsFilter interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retrieves the documents modified in specified date and time range. Cannot be used together with entities filter. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * Retrieves the documents with the given ids. Cannot be used together with internal filter.
   **/
  public KnowledgeExportJobDocumentsFilter entities(List<Entity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retrieves the documents with the given ids. Cannot be used together with internal filter.")
  @JsonProperty("entities")
  public List<Entity> getEntities() {
    return entities;
  }
  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }


  /**
   **/
  public KnowledgeExportJobDocumentsFilter sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeExportJobDocumentsFilter knowledgeExportJobDocumentsFilter = (KnowledgeExportJobDocumentsFilter) o;

    return Objects.equals(this.interval, knowledgeExportJobDocumentsFilter.interval) &&
            Objects.equals(this.entities, knowledgeExportJobDocumentsFilter.entities) &&
            Objects.equals(this.sourceId, knowledgeExportJobDocumentsFilter.sourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, entities, sourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeExportJobDocumentsFilter {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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

