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
import com.mypurecloud.sdk.v2.model.ScimV2PatchOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines a SCIM PATCH request. See section 3.5.2 \&quot;Modifying with PATCH\&quot; in RFC 7644 for details.
 */
@ApiModel(description = "Defines a SCIM PATCH request. See section 3.5.2 \"Modifying with PATCH\" in RFC 7644 for details.")

public class ScimV2PatchRequest  implements Serializable {
  
  private List<String> schemas = new ArrayList<String>();
  private List<ScimV2PatchOperation> operations = new ArrayList<ScimV2PatchOperation>();

  
  /**
   * The list of schemas used in the PATCH request.
   **/
  public ScimV2PatchRequest schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of schemas used in the PATCH request.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  /**
   * The list of operations to perform for the PATCH request.
   **/
  public ScimV2PatchRequest operations(List<ScimV2PatchOperation> operations) {
    this.operations = operations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of operations to perform for the PATCH request.")
  @JsonProperty("Operations")
  public List<ScimV2PatchOperation> getOperations() {
    return operations;
  }
  public void setOperations(List<ScimV2PatchOperation> operations) {
    this.operations = operations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2PatchRequest scimV2PatchRequest = (ScimV2PatchRequest) o;
    return Objects.equals(this.schemas, scimV2PatchRequest.schemas) &&
        Objects.equals(this.operations, scimV2PatchRequest.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2PatchRequest {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

