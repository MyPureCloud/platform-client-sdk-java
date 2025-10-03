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
import com.mypurecloud.sdk.v2.model.JsonSchemaWithDefinitions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Request to update an existing Business Rules Schema
 */
@ApiModel(description = "Request to update an existing Business Rules Schema")

public class BusinessRulesSchemaUpdateRequest  implements Serializable {
  
  private Integer version = null;
  private Boolean enabled = null;
  private JsonSchemaWithDefinitions jsonSchema = null;

  public BusinessRulesSchemaUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The schema's version, a positive integer. Required for updates.
   **/
  public BusinessRulesSchemaUpdateRequest version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schema's version, a positive integer. Required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The schema's enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists.
   **/
  public BusinessRulesSchemaUpdateRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema's enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * A JSON schema defining the extension to the built-in entity type.
   **/
  public BusinessRulesSchemaUpdateRequest jsonSchema(JsonSchemaWithDefinitions jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A JSON schema defining the extension to the built-in entity type.")
  @JsonProperty("jsonSchema")
  public JsonSchemaWithDefinitions getJsonSchema() {
    return jsonSchema;
  }
  public void setJsonSchema(JsonSchemaWithDefinitions jsonSchema) {
    this.jsonSchema = jsonSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRulesSchemaUpdateRequest businessRulesSchemaUpdateRequest = (BusinessRulesSchemaUpdateRequest) o;

    return Objects.equals(this.version, businessRulesSchemaUpdateRequest.version) &&
            Objects.equals(this.enabled, businessRulesSchemaUpdateRequest.enabled) &&
            Objects.equals(this.jsonSchema, businessRulesSchemaUpdateRequest.jsonSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, enabled, jsonSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRulesSchemaUpdateRequest {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
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

