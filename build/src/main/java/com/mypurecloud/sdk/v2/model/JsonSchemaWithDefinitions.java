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
import com.mypurecloud.sdk.v2.model.Definition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * A JSON Schema document.
 */
@ApiModel(description = "A JSON Schema document.")

public class JsonSchemaWithDefinitions  implements Serializable {
  
  private String id = null;
  private String schema = null;
  private String title = null;
  private String description = null;
  private String type = null;
  private List<String> required = null;
  private Map<String, Object> properties = null;
  private Object additionalProperties = null;
  private Map<String, Definition> definitions = null;

  public JsonSchemaWithDefinitions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      required = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public JsonSchemaWithDefinitions id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public JsonSchemaWithDefinitions schema(String schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("$schema")
  public String getSchema() {
    return schema;
  }
  public void setSchema(String schema) {
    this.schema = schema;
  }


  /**
   **/
  public JsonSchemaWithDefinitions title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public JsonSchemaWithDefinitions description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public JsonSchemaWithDefinitions type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public JsonSchemaWithDefinitions required(List<String> required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("required")
  public List<String> getRequired() {
    return required;
  }
  public void setRequired(List<String> required) {
    this.required = required;
  }


  /**
   **/
  public JsonSchemaWithDefinitions properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }


  /**
   **/
  public JsonSchemaWithDefinitions additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   **/
  public JsonSchemaWithDefinitions definitions(Map<String, Definition> definitions) {
    this.definitions = definitions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("definitions")
  public Map<String, Definition> getDefinitions() {
    return definitions;
  }
  public void setDefinitions(Map<String, Definition> definitions) {
    this.definitions = definitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaWithDefinitions jsonSchemaWithDefinitions = (JsonSchemaWithDefinitions) o;

    return Objects.equals(this.id, jsonSchemaWithDefinitions.id) &&
            Objects.equals(this.schema, jsonSchemaWithDefinitions.schema) &&
            Objects.equals(this.title, jsonSchemaWithDefinitions.title) &&
            Objects.equals(this.description, jsonSchemaWithDefinitions.description) &&
            Objects.equals(this.type, jsonSchemaWithDefinitions.type) &&
            Objects.equals(this.required, jsonSchemaWithDefinitions.required) &&
            Objects.equals(this.properties, jsonSchemaWithDefinitions.properties) &&
            Objects.equals(this.additionalProperties, jsonSchemaWithDefinitions.additionalProperties) &&
            Objects.equals(this.definitions, jsonSchemaWithDefinitions.definitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schema, title, description, type, required, properties, additionalProperties, definitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaWithDefinitions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
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

