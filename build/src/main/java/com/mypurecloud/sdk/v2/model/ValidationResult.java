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
import com.mypurecloud.sdk.v2.model.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ValidationResult
 */

public class ValidationResult  implements Serializable {
  
  private Boolean separatorValid = null;
  private Boolean fileEncodingValid = null;
  private List<ValidationError> errors = null;

  public ValidationResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      errors = new ArrayList<ValidationError>();
    }
  }

  
  /**
   * Separator valid in the upload
   **/
  public ValidationResult separatorValid(Boolean separatorValid) {
    this.separatorValid = separatorValid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Separator valid in the upload")
  @JsonProperty("separatorValid")
  public Boolean getSeparatorValid() {
    return separatorValid;
  }
  public void setSeparatorValid(Boolean separatorValid) {
    this.separatorValid = separatorValid;
  }


  /**
   * File encoding valid for the upload
   **/
  public ValidationResult fileEncodingValid(Boolean fileEncodingValid) {
    this.fileEncodingValid = fileEncodingValid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File encoding valid for the upload")
  @JsonProperty("fileEncodingValid")
  public Boolean getFileEncodingValid() {
    return fileEncodingValid;
  }
  public void setFileEncodingValid(Boolean fileEncodingValid) {
    this.fileEncodingValid = fileEncodingValid;
  }


  /**
   * List of errors for the upload
   **/
  public ValidationResult errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of errors for the upload")
  @JsonProperty("errors")
  public List<ValidationError> getErrors() {
    return errors;
  }
  public void setErrors(List<ValidationError> errors) {
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
    ValidationResult validationResult = (ValidationResult) o;

    return Objects.equals(this.separatorValid, validationResult.separatorValid) &&
            Objects.equals(this.fileEncodingValid, validationResult.fileEncodingValid) &&
            Objects.equals(this.errors, validationResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(separatorValid, fileEncodingValid, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    
    sb.append("    separatorValid: ").append(toIndentedString(separatorValid)).append("\n");
    sb.append("    fileEncodingValid: ").append(toIndentedString(fileEncodingValid)).append("\n");
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

