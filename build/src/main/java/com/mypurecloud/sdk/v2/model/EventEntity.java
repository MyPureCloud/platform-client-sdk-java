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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EventEntity
 */

public class EventEntity  implements Serializable {
  
  private String entityType = null;
  private String id = null;

  
  /**
   * Type of entity the event pertains to. e.g. integration
   **/
  public EventEntity entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of entity the event pertains to. e.g. integration")
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  
  /**
   * ID of the entity the event pertains to.
   **/
  public EventEntity id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the entity the event pertains to.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEntity eventEntity = (EventEntity) o;
    return Objects.equals(this.entityType, eventEntity.entityType) &&
        Objects.equals(this.id, eventEntity.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEntity {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

