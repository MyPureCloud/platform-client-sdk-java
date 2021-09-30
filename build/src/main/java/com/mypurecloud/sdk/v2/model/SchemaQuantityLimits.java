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
 * SchemaQuantityLimits
 */

public class SchemaQuantityLimits  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer minFieldNameCharacters = null;
  private Integer maxFieldNameCharacters = null;
  private Integer minFieldDescriptionCharacters = null;
  private Integer maxFieldDescriptionCharacters = null;
  private Integer minSchemaNameCharacters = null;
  private Integer maxSchemaNameCharacters = null;
  private Integer minSchemaDescriptionCharacters = null;
  private Integer maxSchemaDescriptionCharacters = null;
  private Integer maxNumberOfSchemasPerOrg = null;
  private Integer maxNumberOfFieldsPerSchema = null;
  private Integer maxNumberOfFieldsPerOrg = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SchemaQuantityLimits name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "\"minFieldNameCharacters\":1", value = "The minimum number of schema field name characters allowed.")
  @JsonProperty("minFieldNameCharacters")
  public Integer getMinFieldNameCharacters() {
    return minFieldNameCharacters;
  }

  
  @ApiModelProperty(example = "\"minFieldNameCharacters\":100", value = "The maximum number of schema field name characters allowed.")
  @JsonProperty("maxFieldNameCharacters")
  public Integer getMaxFieldNameCharacters() {
    return maxFieldNameCharacters;
  }

  
  @ApiModelProperty(example = "\"minFieldDescriptionCharacters\":0", value = "The minimum number of schema field description characters allowed.")
  @JsonProperty("minFieldDescriptionCharacters")
  public Integer getMinFieldDescriptionCharacters() {
    return minFieldDescriptionCharacters;
  }

  
  @ApiModelProperty(example = "\"maxFieldDescriptionCharacters\":200", value = "The maximum number of schema field description characters allowed.")
  @JsonProperty("maxFieldDescriptionCharacters")
  public Integer getMaxFieldDescriptionCharacters() {
    return maxFieldDescriptionCharacters;
  }

  
  @ApiModelProperty(example = "\"minSchemaNameCharacters\":1", value = "The minimum number of schema name characters allowed.")
  @JsonProperty("minSchemaNameCharacters")
  public Integer getMinSchemaNameCharacters() {
    return minSchemaNameCharacters;
  }

  
  @ApiModelProperty(example = "\"maxSchemaNameCharacters\":50", value = "The maximum number of schema name characters allowed.")
  @JsonProperty("maxSchemaNameCharacters")
  public Integer getMaxSchemaNameCharacters() {
    return maxSchemaNameCharacters;
  }

  
  @ApiModelProperty(example = "\"minSchemaDescriptionCharacters\":0", value = "The minimum number of schema description characters allowed.")
  @JsonProperty("minSchemaDescriptionCharacters")
  public Integer getMinSchemaDescriptionCharacters() {
    return minSchemaDescriptionCharacters;
  }

  
  @ApiModelProperty(example = "\"maxSchemaDescriptionCharacters\":200", value = "The maximum number of schema description characters allowed.")
  @JsonProperty("maxSchemaDescriptionCharacters")
  public Integer getMaxSchemaDescriptionCharacters() {
    return maxSchemaDescriptionCharacters;
  }

  
  @ApiModelProperty(example = "\"maxNumberOfSchemasPerOrg\":20", value = "The maximum number of schema allowed per org.")
  @JsonProperty("maxNumberOfSchemasPerOrg")
  public Integer getMaxNumberOfSchemasPerOrg() {
    return maxNumberOfSchemasPerOrg;
  }

  
  @ApiModelProperty(example = "\"maxNumberOfFieldsPerSchema\":25", value = "The maximum number of schema fields allowed per schema.")
  @JsonProperty("maxNumberOfFieldsPerSchema")
  public Integer getMaxNumberOfFieldsPerSchema() {
    return maxNumberOfFieldsPerSchema;
  }

  
  @ApiModelProperty(example = "\"maxNumberOfFieldsPerOrg\":500", value = "The maximum number of schema fields allowed per organization across all of their schemas.")
  @JsonProperty("maxNumberOfFieldsPerOrg")
  public Integer getMaxNumberOfFieldsPerOrg() {
    return maxNumberOfFieldsPerOrg;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaQuantityLimits schemaQuantityLimits = (SchemaQuantityLimits) o;
    return Objects.equals(this.id, schemaQuantityLimits.id) &&
        Objects.equals(this.name, schemaQuantityLimits.name) &&
        Objects.equals(this.minFieldNameCharacters, schemaQuantityLimits.minFieldNameCharacters) &&
        Objects.equals(this.maxFieldNameCharacters, schemaQuantityLimits.maxFieldNameCharacters) &&
        Objects.equals(this.minFieldDescriptionCharacters, schemaQuantityLimits.minFieldDescriptionCharacters) &&
        Objects.equals(this.maxFieldDescriptionCharacters, schemaQuantityLimits.maxFieldDescriptionCharacters) &&
        Objects.equals(this.minSchemaNameCharacters, schemaQuantityLimits.minSchemaNameCharacters) &&
        Objects.equals(this.maxSchemaNameCharacters, schemaQuantityLimits.maxSchemaNameCharacters) &&
        Objects.equals(this.minSchemaDescriptionCharacters, schemaQuantityLimits.minSchemaDescriptionCharacters) &&
        Objects.equals(this.maxSchemaDescriptionCharacters, schemaQuantityLimits.maxSchemaDescriptionCharacters) &&
        Objects.equals(this.maxNumberOfSchemasPerOrg, schemaQuantityLimits.maxNumberOfSchemasPerOrg) &&
        Objects.equals(this.maxNumberOfFieldsPerSchema, schemaQuantityLimits.maxNumberOfFieldsPerSchema) &&
        Objects.equals(this.maxNumberOfFieldsPerOrg, schemaQuantityLimits.maxNumberOfFieldsPerOrg) &&
        Objects.equals(this.selfUri, schemaQuantityLimits.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, minFieldNameCharacters, maxFieldNameCharacters, minFieldDescriptionCharacters, maxFieldDescriptionCharacters, minSchemaNameCharacters, maxSchemaNameCharacters, minSchemaDescriptionCharacters, maxSchemaDescriptionCharacters, maxNumberOfSchemasPerOrg, maxNumberOfFieldsPerSchema, maxNumberOfFieldsPerOrg, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaQuantityLimits {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    minFieldNameCharacters: ").append(toIndentedString(minFieldNameCharacters)).append("\n");
    sb.append("    maxFieldNameCharacters: ").append(toIndentedString(maxFieldNameCharacters)).append("\n");
    sb.append("    minFieldDescriptionCharacters: ").append(toIndentedString(minFieldDescriptionCharacters)).append("\n");
    sb.append("    maxFieldDescriptionCharacters: ").append(toIndentedString(maxFieldDescriptionCharacters)).append("\n");
    sb.append("    minSchemaNameCharacters: ").append(toIndentedString(minSchemaNameCharacters)).append("\n");
    sb.append("    maxSchemaNameCharacters: ").append(toIndentedString(maxSchemaNameCharacters)).append("\n");
    sb.append("    minSchemaDescriptionCharacters: ").append(toIndentedString(minSchemaDescriptionCharacters)).append("\n");
    sb.append("    maxSchemaDescriptionCharacters: ").append(toIndentedString(maxSchemaDescriptionCharacters)).append("\n");
    sb.append("    maxNumberOfSchemasPerOrg: ").append(toIndentedString(maxNumberOfSchemasPerOrg)).append("\n");
    sb.append("    maxNumberOfFieldsPerSchema: ").append(toIndentedString(maxNumberOfFieldsPerSchema)).append("\n");
    sb.append("    maxNumberOfFieldsPerOrg: ").append(toIndentedString(maxNumberOfFieldsPerOrg)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

