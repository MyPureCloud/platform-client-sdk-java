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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeParseImportResult
 */

public class KnowledgeParseImportResult  implements Serializable {
  
  private Integer success = null;
  private Integer failure = null;
  private List<ErrorBody> errors = null;

  public KnowledgeParseImportResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      errors = new ArrayList<ErrorBody>();
    }
  }

  
  /**
   * Number of imported articles.
   **/
  public KnowledgeParseImportResult success(Integer success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of imported articles.")
  @JsonProperty("success")
  public Integer getSuccess() {
    return success;
  }
  public void setSuccess(Integer success) {
    this.success = success;
  }


  /**
   * Number of articles failed to import.
   **/
  public KnowledgeParseImportResult failure(Integer failure) {
    this.failure = failure;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of articles failed to import.")
  @JsonProperty("failure")
  public Integer getFailure() {
    return failure;
  }
  public void setFailure(Integer failure) {
    this.failure = failure;
  }


  /**
   * Error information about the failures.
   **/
  public KnowledgeParseImportResult errors(List<ErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error information about the failures.")
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
    KnowledgeParseImportResult knowledgeParseImportResult = (KnowledgeParseImportResult) o;

    return Objects.equals(this.success, knowledgeParseImportResult.success) &&
            Objects.equals(this.failure, knowledgeParseImportResult.failure) &&
            Objects.equals(this.errors, knowledgeParseImportResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, failure, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeParseImportResult {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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

