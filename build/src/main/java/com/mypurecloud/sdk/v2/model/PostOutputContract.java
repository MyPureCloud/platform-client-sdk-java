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
 * The schemas defining all of the expected responses/outputs.
 */
@ApiModel(description = "The schemas defining all of the expected responses/outputs.")

public class PostOutputContract  implements Serializable {
  
  private JsonSchemaDocument successSchema = null;

  
  /**
   * JSON schema that defines the transformed, successful result that will be sent back to the caller.
   **/
  public PostOutputContract successSchema(JsonSchemaDocument successSchema) {
    this.successSchema = successSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "JSON schema that defines the transformed, successful result that will be sent back to the caller.")
  @JsonProperty("successSchema")
  public JsonSchemaDocument getSuccessSchema() {
    return successSchema;
  }
  public void setSuccessSchema(JsonSchemaDocument successSchema) {
    this.successSchema = successSchema;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOutputContract postOutputContract = (PostOutputContract) o;
    return Objects.equals(this.successSchema, postOutputContract.successSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOutputContract {\n");
    
    sb.append("    successSchema: ").append(toIndentedString(successSchema)).append("\n");
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

