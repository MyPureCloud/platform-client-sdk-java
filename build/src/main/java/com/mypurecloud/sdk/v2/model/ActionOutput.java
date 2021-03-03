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
 * Output definition of Action.
 */
@ApiModel(description = "Output definition of Action.")

public class ActionOutput  implements Serializable {
  
  private JsonSchemaDocument successSchema = null;
  private String successSchemaUri = null;
  private JsonSchemaDocument errorSchema = null;
  private String errorSchemaUri = null;
  private JsonSchemaDocument successSchemaFlattened = null;
  private Object errorSchemaFlattened = null;

  
  /**
   * JSON schema that defines the transformed, successful result that will be sent back to the caller. If the 'flatten' query parameter is omitted or false, this field will be returned. Either successSchema or successSchemaFlattened will be returned, not both.
   **/
  public ActionOutput successSchema(JsonSchemaDocument successSchema) {
    this.successSchema = successSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON schema that defines the transformed, successful result that will be sent back to the caller. If the 'flatten' query parameter is omitted or false, this field will be returned. Either successSchema or successSchemaFlattened will be returned, not both.")
  @JsonProperty("successSchema")
  public JsonSchemaDocument getSuccessSchema() {
    return successSchema;
  }
  public void setSuccessSchema(JsonSchemaDocument successSchema) {
    this.successSchema = successSchema;
  }

  
  /**
   * URI to retrieve success schema
   **/
  public ActionOutput successSchemaUri(String successSchemaUri) {
    this.successSchemaUri = successSchemaUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI to retrieve success schema")
  @JsonProperty("successSchemaUri")
  public String getSuccessSchemaUri() {
    return successSchemaUri;
  }
  public void setSuccessSchemaUri(String successSchemaUri) {
    this.successSchemaUri = successSchemaUri;
  }

  
  /**
   * JSON schema that defines the body of response when request is not successful. If the 'flatten' query parameter is omitted or false, this field will be returned. Either errorSchema or errorSchemaFlattened will be returned, not both.
   **/
  public ActionOutput errorSchema(JsonSchemaDocument errorSchema) {
    this.errorSchema = errorSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON schema that defines the body of response when request is not successful. If the 'flatten' query parameter is omitted or false, this field will be returned. Either errorSchema or errorSchemaFlattened will be returned, not both.")
  @JsonProperty("errorSchema")
  public JsonSchemaDocument getErrorSchema() {
    return errorSchema;
  }
  public void setErrorSchema(JsonSchemaDocument errorSchema) {
    this.errorSchema = errorSchema;
  }

  
  /**
   * URI to retrieve error schema
   **/
  public ActionOutput errorSchemaUri(String errorSchemaUri) {
    this.errorSchemaUri = errorSchemaUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI to retrieve error schema")
  @JsonProperty("errorSchemaUri")
  public String getErrorSchemaUri() {
    return errorSchemaUri;
  }
  public void setErrorSchemaUri(String errorSchemaUri) {
    this.errorSchemaUri = errorSchemaUri;
  }

  
  /**
   * JSON schema that defines the transformed, successful result that will be sent back to the caller. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either successSchema or successSchemaFlattened will be returned, not both.
   **/
  public ActionOutput successSchemaFlattened(JsonSchemaDocument successSchemaFlattened) {
    this.successSchemaFlattened = successSchemaFlattened;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON schema that defines the transformed, successful result that will be sent back to the caller. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either successSchema or successSchemaFlattened will be returned, not both.")
  @JsonProperty("successSchemaFlattened")
  public JsonSchemaDocument getSuccessSchemaFlattened() {
    return successSchemaFlattened;
  }
  public void setSuccessSchemaFlattened(JsonSchemaDocument successSchemaFlattened) {
    this.successSchemaFlattened = successSchemaFlattened;
  }

  
  /**
   * JSON schema that defines the body of response when request is not successful. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either errorSchema or errorSchemaFlattened will be returned, not both.
   **/
  public ActionOutput errorSchemaFlattened(Object errorSchemaFlattened) {
    this.errorSchemaFlattened = errorSchemaFlattened;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON schema that defines the body of response when request is not successful. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either errorSchema or errorSchemaFlattened will be returned, not both.")
  @JsonProperty("errorSchemaFlattened")
  public Object getErrorSchemaFlattened() {
    return errorSchemaFlattened;
  }
  public void setErrorSchemaFlattened(Object errorSchemaFlattened) {
    this.errorSchemaFlattened = errorSchemaFlattened;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionOutput actionOutput = (ActionOutput) o;
    return Objects.equals(this.successSchema, actionOutput.successSchema) &&
        Objects.equals(this.successSchemaUri, actionOutput.successSchemaUri) &&
        Objects.equals(this.errorSchema, actionOutput.errorSchema) &&
        Objects.equals(this.errorSchemaUri, actionOutput.errorSchemaUri) &&
        Objects.equals(this.successSchemaFlattened, actionOutput.successSchemaFlattened) &&
        Objects.equals(this.errorSchemaFlattened, actionOutput.errorSchemaFlattened);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successSchema, successSchemaUri, errorSchema, errorSchemaUri, successSchemaFlattened, errorSchemaFlattened);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionOutput {\n");
    
    sb.append("    successSchema: ").append(toIndentedString(successSchema)).append("\n");
    sb.append("    successSchemaUri: ").append(toIndentedString(successSchemaUri)).append("\n");
    sb.append("    errorSchema: ").append(toIndentedString(errorSchema)).append("\n");
    sb.append("    errorSchemaUri: ").append(toIndentedString(errorSchemaUri)).append("\n");
    sb.append("    successSchemaFlattened: ").append(toIndentedString(successSchemaFlattened)).append("\n");
    sb.append("    errorSchemaFlattened: ").append(toIndentedString(errorSchemaFlattened)).append("\n");
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

