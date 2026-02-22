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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * A Conversation Custom Attributes JSON Schema
 */
@ApiModel(description = "A Conversation Custom Attributes JSON Schema")

public class ConversationJsonSchemaDocument  implements Serializable {
  
  private String schema = null;
  private String title = null;
  private String description = null;
  private List<String> required = null;
  private Map<String, Object> properties = null;

  public ConversationJsonSchemaDocument() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      required = new ArrayList<String>();
    }
  }

  
  /**
   * The JSON Schema specification link. The only value currently supported is \"http://json-schema.org/draft-04/schema#\".
   **/
  public ConversationJsonSchemaDocument schema(String schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The JSON Schema specification link. The only value currently supported is \"http://json-schema.org/draft-04/schema#\".")
  @JsonProperty("$schema")
  public String getSchema() {
    return schema;
  }
  public void setSchema(String schema) {
    this.schema = schema;
  }


  /**
   * The title of the schema. Must be unique across all enabled Custom Attributes Schemas.
   **/
  public ConversationJsonSchemaDocument title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The title of the schema. Must be unique across all enabled Custom Attributes Schemas.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The schema description.
   **/
  public ConversationJsonSchemaDocument description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The list of required schema properties. All fields are optional unless listed. New fields added after initial schema creation must be optional before being able to update to required.
   **/
  public ConversationJsonSchemaDocument required(List<String> required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of required schema properties. All fields are optional unless listed. New fields added after initial schema creation must be optional before being able to update to required.")
  @JsonProperty("required")
  public List<String> getRequired() {
    return required;
  }
  public void setRequired(List<String> required) {
    this.required = required;
  }


  /**
   * The map of schema properties and their limits.
   **/
  public ConversationJsonSchemaDocument properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The map of schema properties and their limits.")
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationJsonSchemaDocument conversationJsonSchemaDocument = (ConversationJsonSchemaDocument) o;

    return Objects.equals(this.schema, conversationJsonSchemaDocument.schema) &&
            Objects.equals(this.title, conversationJsonSchemaDocument.title) &&
            Objects.equals(this.description, conversationJsonSchemaDocument.description) &&
            Objects.equals(this.required, conversationJsonSchemaDocument.required) &&
            Objects.equals(this.properties, conversationJsonSchemaDocument.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, title, description, required, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationJsonSchemaDocument {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

