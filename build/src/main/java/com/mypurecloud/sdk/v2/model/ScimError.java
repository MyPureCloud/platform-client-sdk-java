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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines a SCIM error.
 */
@ApiModel(description = "Defines a SCIM error.")

public class ScimError  implements Serializable {
  
  private List<String> schemas = new ArrayList<String>();
  private String status = null;

  private static class ScimTypeEnumDeserializer extends StdDeserializer<ScimTypeEnum> {
    public ScimTypeEnumDeserializer() {
      super(ScimTypeEnumDeserializer.class);
    }

    @Override
    public ScimTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScimTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of SCIM error when httpStatus is a \"400\" error.
   */
 @JsonDeserialize(using = ScimTypeEnumDeserializer.class)
  public enum ScimTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INVALIDFILTER("invalidFilter"),
    TOOMANY("tooMany"),
    UNIQUENESS("uniqueness"),
    MUTABILITY("mutability"),
    INVALIDSYNTAX("invalidSyntax"),
    INVALIDPATH("invalidPath"),
    NOTARGET("noTarget"),
    INVALIDVALUE("invalidValue"),
    INVALIDVERS("invalidVers"),
    SENSITIVE("sensitive");

    private String value;

    ScimTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScimTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ScimTypeEnum value : ScimTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScimTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScimTypeEnum scimType = null;
  private String detail = null;

  
  @ApiModelProperty(example = "null", value = "The list of schemas for the SCIM error.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  
  @ApiModelProperty(example = "null", value = "The HTTP status code returned for the SCIM error.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "The type of SCIM error when httpStatus is a \"400\" error.")
  @JsonProperty("scimType")
  public ScimTypeEnum getScimType() {
    return scimType;
  }

  
  @ApiModelProperty(example = "null", value = "The detailed description of the SCIM error.")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimError scimError = (ScimError) o;
    return Objects.equals(this.schemas, scimError.schemas) &&
        Objects.equals(this.status, scimError.status) &&
        Objects.equals(this.scimType, scimError.scimType) &&
        Objects.equals(this.detail, scimError.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, status, scimType, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimError {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scimType: ").append(toIndentedString(scimType)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

