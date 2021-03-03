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
 * NamedEntityTypeBinding
 */

public class NamedEntityTypeBinding  implements Serializable {
  
  private String entityType = null;
  private String entityName = null;

  
  /**
   * The named entity type of the binding. It can be a built-in one such as builtin:number or a custom entity type such as BeverageType.
   **/
  public NamedEntityTypeBinding entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The named entity type of the binding. It can be a built-in one such as builtin:number or a custom entity type such as BeverageType.")
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  
  /**
   * The name that this named entity type is bound to.
   **/
  public NamedEntityTypeBinding entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name that this named entity type is bound to.")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedEntityTypeBinding namedEntityTypeBinding = (NamedEntityTypeBinding) o;
    return Objects.equals(this.entityType, namedEntityTypeBinding.entityType) &&
        Objects.equals(this.entityName, namedEntityTypeBinding.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedEntityTypeBinding {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

