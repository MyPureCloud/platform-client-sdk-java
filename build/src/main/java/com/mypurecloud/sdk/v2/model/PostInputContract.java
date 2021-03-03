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
 * The schemas defining all of the expected requests/inputs.
 */
@ApiModel(description = "The schemas defining all of the expected requests/inputs.")

public class PostInputContract  implements Serializable {
  
  private JsonSchemaDocument inputSchema = null;

  
  /**
   * JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path.
   **/
  public PostInputContract inputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path.")
  @JsonProperty("inputSchema")
  public JsonSchemaDocument getInputSchema() {
    return inputSchema;
  }
  public void setInputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInputContract postInputContract = (PostInputContract) o;
    return Objects.equals(this.inputSchema, postInputContract.inputSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInputContract {\n");
    
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
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

