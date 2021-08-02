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
import com.mypurecloud.sdk.v2.model.ImportError;
import com.mypurecloud.sdk.v2.model.ResultCounters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ImportReport
 */

public class ImportReport  implements Serializable {
  
  private List<ImportError> errors = new ArrayList<ImportError>();
  private ResultCounters validated = null;
  private ResultCounters imported = null;
  private Integer totalDocuments = null;

  
  /**
   **/
  public ImportReport errors(List<ImportError> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ImportError> getErrors() {
    return errors;
  }
  public void setErrors(List<ImportError> errors) {
    this.errors = errors;
  }

  
  /**
   **/
  public ImportReport validated(ResultCounters validated) {
    this.validated = validated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("validated")
  public ResultCounters getValidated() {
    return validated;
  }
  public void setValidated(ResultCounters validated) {
    this.validated = validated;
  }

  
  /**
   **/
  public ImportReport imported(ResultCounters imported) {
    this.imported = imported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("imported")
  public ResultCounters getImported() {
    return imported;
  }
  public void setImported(ResultCounters imported) {
    this.imported = imported;
  }

  
  /**
   **/
  public ImportReport totalDocuments(Integer totalDocuments) {
    this.totalDocuments = totalDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalDocuments")
  public Integer getTotalDocuments() {
    return totalDocuments;
  }
  public void setTotalDocuments(Integer totalDocuments) {
    this.totalDocuments = totalDocuments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportReport importReport = (ImportReport) o;
    return Objects.equals(this.errors, importReport.errors) &&
        Objects.equals(this.validated, importReport.validated) &&
        Objects.equals(this.imported, importReport.imported) &&
        Objects.equals(this.totalDocuments, importReport.totalDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, validated, imported, totalDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportReport {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    imported: ").append(toIndentedString(imported)).append("\n");
    sb.append("    totalDocuments: ").append(toIndentedString(totalDocuments)).append("\n");
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

