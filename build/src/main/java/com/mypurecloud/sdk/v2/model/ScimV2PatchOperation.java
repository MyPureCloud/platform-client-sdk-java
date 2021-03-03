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
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Defines a SCIM PATCH operation. The path and value follow very specific rules based on operation types. See section 3.5.2 \&quot;Modifying with PATCH\&quot; in RFC 7644 for details.
 */
@ApiModel(description = "Defines a SCIM PATCH operation. The path and value follow very specific rules based on operation types. See section 3.5.2 \"Modifying with PATCH\" in RFC 7644 for details.")

public class ScimV2PatchOperation  implements Serializable {
  

  private static class OpEnumDeserializer extends StdDeserializer<OpEnum> {
    public OpEnumDeserializer() {
      super(OpEnumDeserializer.class);
    }

    @Override
    public OpEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OpEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The PATCH operation to perform.
   */
 @JsonDeserialize(using = OpEnumDeserializer.class)
  public enum OpEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADD("add"),
    REPLACE("replace"),
    REMOVE("remove");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OpEnum fromString(String key) {
      if (key == null) return null;

      for (OpEnum value : OpEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OpEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OpEnum op = null;
  private String path = null;
  private JsonNode value = null;

  
  /**
   * The PATCH operation to perform.
   **/
  public ScimV2PatchOperation op(OpEnum op) {
    this.op = op;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The PATCH operation to perform.")
  @JsonProperty("op")
  public OpEnum getOp() {
    return op;
  }
  public void setOp(OpEnum op) {
    this.op = op;
  }

  
  /**
   * The attribute path that describes the target of the operation. Required for a \"remove\" operation.
   **/
  public ScimV2PatchOperation path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attribute path that describes the target of the operation. Required for a \"remove\" operation.")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   * The value to set in the path.
   **/
  public ScimV2PatchOperation value(JsonNode value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value to set in the path.")
  @JsonProperty("value")
  public JsonNode getValue() {
    return value;
  }
  public void setValue(JsonNode value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2PatchOperation scimV2PatchOperation = (ScimV2PatchOperation) o;
    return Objects.equals(this.op, scimV2PatchOperation.op) &&
        Objects.equals(this.path, scimV2PatchOperation.path) &&
        Objects.equals(this.value, scimV2PatchOperation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2PatchOperation {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

