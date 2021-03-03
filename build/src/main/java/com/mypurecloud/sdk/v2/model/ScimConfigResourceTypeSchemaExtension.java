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
 * Defines a SCIM resource type&#39;s schema extension.
 */
@ApiModel(description = "Defines a SCIM resource type's schema extension.")

public class ScimConfigResourceTypeSchemaExtension  implements Serializable {
  
  private String schema = null;
  private Boolean required = null;

  
  @ApiModelProperty(example = "null", value = "The URI of an extended schema, for example, \"urn:edu:2.0:Staff\". Must be equal to the \"id\" attribute of a schema.")
  @JsonProperty("schema")
  public String getSchema() {
    return schema;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates whether a schema extension is required.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimConfigResourceTypeSchemaExtension scimConfigResourceTypeSchemaExtension = (ScimConfigResourceTypeSchemaExtension) o;
    return Objects.equals(this.schema, scimConfigResourceTypeSchemaExtension.schema) &&
        Objects.equals(this.required, scimConfigResourceTypeSchemaExtension.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimConfigResourceTypeSchemaExtension {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

