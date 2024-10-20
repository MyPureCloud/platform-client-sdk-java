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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ValidationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CsvUploadDetailsResponse
 */

public class CsvUploadDetailsResponse  implements Serializable {
  
  private String uploadId = null;
  private String fileName = null;
  private ValidationResult validationResult = null;

  
  /**
   * Id for the upload
   **/
  public CsvUploadDetailsResponse uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id for the upload")
  @JsonProperty("uploadId")
  public String getUploadId() {
    return uploadId;
  }
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  /**
   * File name for the upload
   **/
  public CsvUploadDetailsResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File name for the upload")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * Validation for the upload
   **/
  public CsvUploadDetailsResponse validationResult(ValidationResult validationResult) {
    this.validationResult = validationResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Validation for the upload")
  @JsonProperty("validationResult")
  public ValidationResult getValidationResult() {
    return validationResult;
  }
  public void setValidationResult(ValidationResult validationResult) {
    this.validationResult = validationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvUploadDetailsResponse csvUploadDetailsResponse = (CsvUploadDetailsResponse) o;

    return Objects.equals(this.uploadId, csvUploadDetailsResponse.uploadId) &&
            Objects.equals(this.fileName, csvUploadDetailsResponse.fileName) &&
            Objects.equals(this.validationResult, csvUploadDetailsResponse.validationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, fileName, validationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvUploadDetailsResponse {\n");
    
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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

