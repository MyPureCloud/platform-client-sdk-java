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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Validation results
 */
@ApiModel(description = "Validation results")

public class DraftValidationResult  implements Serializable {
  
  private Boolean valid = null;
  private List<ErrorBody> errors = new ArrayList<ErrorBody>();

  
  /**
   * Indicates if configuration is valid
   **/
  public DraftValidationResult valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if configuration is valid")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  
  /**
   * List of errors causing validation failure
   **/
  public DraftValidationResult errors(List<ErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of errors causing validation failure")
  @JsonProperty("errors")
  public List<ErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorBody> errors) {
    this.errors = errors;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftValidationResult draftValidationResult = (DraftValidationResult) o;
    return Objects.equals(this.valid, draftValidationResult.valid) &&
        Objects.equals(this.errors, draftValidationResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftValidationResult {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

