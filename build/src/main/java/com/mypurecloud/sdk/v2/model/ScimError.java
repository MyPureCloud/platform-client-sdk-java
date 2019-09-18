package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SCIM Error
 */
@ApiModel(description = "SCIM Error")

public class ScimError  implements Serializable {
  
  private String status = null;

  /**
   * Optional SCIM Error Type when httpStatus is 400 error
   */
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
  private List<String> schemas = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "HTTP Status Code")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "Optional SCIM Error Type when httpStatus is 400 error")
  @JsonProperty("scimType")
  public ScimTypeEnum getScimType() {
    return scimType;
  }

  
  @ApiModelProperty(example = "null", value = "Optional detailed error description")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  
  /**
   * Schemas for the SCIM Error
   **/
  public ScimError schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schemas for the SCIM Error")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
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
    return Objects.equals(this.status, scimError.status) &&
        Objects.equals(this.scimType, scimError.scimType) &&
        Objects.equals(this.detail, scimError.detail) &&
        Objects.equals(this.schemas, scimError.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, scimType, detail, schemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimError {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scimType: ").append(toIndentedString(scimType)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

