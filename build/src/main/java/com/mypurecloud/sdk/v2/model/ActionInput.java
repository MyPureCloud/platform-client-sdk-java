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
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Input requirements of Action.
 */
@ApiModel(description = "Input requirements of Action.")

public class ActionInput  implements Serializable {
  
  private JsonSchemaDocument inputSchema = null;
  private JsonSchemaDocument inputSchemaFlattened = null;
  private String inputSchemaUri = null;

  
  /**
   * JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path. If the 'flatten' query parameter is omitted or false, this field will be returned. Either inputSchema or inputSchemaFlattened will be returned, not both.
   **/
  public ActionInput inputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path. If the 'flatten' query parameter is omitted or false, this field will be returned. Either inputSchema or inputSchemaFlattened will be returned, not both.")
  @JsonProperty("inputSchema")
  public JsonSchemaDocument getInputSchema() {
    return inputSchema;
  }
  public void setInputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
  }

  
  /**
   * JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either inputSchema or inputSchemaFlattened will be returned, not both.
   **/
  public ActionInput inputSchemaFlattened(JsonSchemaDocument inputSchemaFlattened) {
    this.inputSchemaFlattened = inputSchemaFlattened;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either inputSchema or inputSchemaFlattened will be returned, not both.")
  @JsonProperty("inputSchemaFlattened")
  public JsonSchemaDocument getInputSchemaFlattened() {
    return inputSchemaFlattened;
  }
  public void setInputSchemaFlattened(JsonSchemaDocument inputSchemaFlattened) {
    this.inputSchemaFlattened = inputSchemaFlattened;
  }

  
  /**
   * The URI of the input schema
   **/
  public ActionInput inputSchemaUri(String inputSchemaUri) {
    this.inputSchemaUri = inputSchemaUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the input schema")
  @JsonProperty("inputSchemaUri")
  public String getInputSchemaUri() {
    return inputSchemaUri;
  }
  public void setInputSchemaUri(String inputSchemaUri) {
    this.inputSchemaUri = inputSchemaUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionInput actionInput = (ActionInput) o;
    return Objects.equals(this.inputSchema, actionInput.inputSchema) &&
        Objects.equals(this.inputSchemaFlattened, actionInput.inputSchemaFlattened) &&
        Objects.equals(this.inputSchemaUri, actionInput.inputSchemaUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputSchema, inputSchemaFlattened, inputSchemaUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionInput {\n");
    
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    inputSchemaFlattened: ").append(toIndentedString(inputSchemaFlattened)).append("\n");
    sb.append("    inputSchemaUri: ").append(toIndentedString(inputSchemaUri)).append("\n");
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

