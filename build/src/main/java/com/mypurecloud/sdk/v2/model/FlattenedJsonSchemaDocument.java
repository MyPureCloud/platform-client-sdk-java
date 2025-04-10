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
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JSON schema that defines the transformed result that will be sent back to the caller. The schema is transformed based on Architect&#39;s flattened format. If the &#39;flatten&#39; query parameter is supplied as true, this field will be returned.
 */
@ApiModel(description = "JSON schema that defines the transformed result that will be sent back to the caller. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned.")

public class FlattenedJsonSchemaDocument  implements Serializable {
  
  private JsonSchemaDocument schema = null;
  private List<String> arrayProperties = null;

  public FlattenedJsonSchemaDocument() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      arrayProperties = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public FlattenedJsonSchemaDocument schema(JsonSchemaDocument schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schema")
  public JsonSchemaDocument getSchema() {
    return schema;
  }
  public void setSchema(JsonSchemaDocument schema) {
    this.schema = schema;
  }


  /**
   * Properties in the original document that were arrays
   **/
  public FlattenedJsonSchemaDocument arrayProperties(List<String> arrayProperties) {
    this.arrayProperties = arrayProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties in the original document that were arrays")
  @JsonProperty("arrayProperties")
  public List<String> getArrayProperties() {
    return arrayProperties;
  }
  public void setArrayProperties(List<String> arrayProperties) {
    this.arrayProperties = arrayProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlattenedJsonSchemaDocument flattenedJsonSchemaDocument = (FlattenedJsonSchemaDocument) o;

    return Objects.equals(this.schema, flattenedJsonSchemaDocument.schema) &&
            Objects.equals(this.arrayProperties, flattenedJsonSchemaDocument.arrayProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, arrayProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlattenedJsonSchemaDocument {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    arrayProperties: ").append(toIndentedString(arrayProperties)).append("\n");
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

