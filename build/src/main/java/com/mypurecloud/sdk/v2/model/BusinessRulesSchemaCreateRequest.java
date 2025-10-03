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
 * Request to create a new Business Rules Schema
 */
@ApiModel(description = "Request to create a new Business Rules Schema")

public class BusinessRulesSchemaCreateRequest  implements Serializable {
  
  private JsonSchemaWithDefinitions jsonSchema = null;

  public BusinessRulesSchemaCreateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A JSON schema defining the extension to the built-in entity type.
   **/
  public BusinessRulesSchemaCreateRequest jsonSchema(JsonSchemaWithDefinitions jsonSchema) {
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
    BusinessRulesSchemaCreateRequest businessRulesSchemaCreateRequest = (BusinessRulesSchemaCreateRequest) o;

    return Objects.equals(this.jsonSchema, businessRulesSchemaCreateRequest.jsonSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRulesSchemaCreateRequest {\n");
    
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

