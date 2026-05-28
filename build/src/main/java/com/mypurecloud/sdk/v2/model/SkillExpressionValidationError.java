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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A validation error found in the expression
 */
@ApiModel(description = "A validation error found in the expression")

public class SkillExpressionValidationError  implements Serializable {
  
  private String code = null;
  private String message = null;
  private Integer position = null;

  public SkillExpressionValidationError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SkillExpressionValidationError(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Error code
   **/
  public SkillExpressionValidationError code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "SYNTAX_ERROR", value = "Error code")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Human-readable error message
   **/
  public SkillExpressionValidationError message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "Invalid SpEL expression: unexpected token", value = "Human-readable error message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Position in the expression where the error occurred (null if not applicable)
   **/
  public SkillExpressionValidationError position(Integer position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "15", value = "Position in the expression where the error occurred (null if not applicable)")
  @JsonProperty("position")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillExpressionValidationError skillExpressionValidationError = (SkillExpressionValidationError) o;

    return Objects.equals(this.code, skillExpressionValidationError.code) &&
            Objects.equals(this.message, skillExpressionValidationError.message) &&
            Objects.equals(this.position, skillExpressionValidationError.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillExpressionValidationError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

