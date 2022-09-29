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
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobError;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeImportJobReport
 */

public class KnowledgeImportJobReport  implements Serializable {
  
  private List<KnowledgeImportJobError> errors = null;
  private KnowledgeImportJobStatistics statistics = null;

  
  /**
   * List of errors occurred during processing import.
   **/
  public KnowledgeImportJobReport errors(List<KnowledgeImportJobError> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of errors occurred during processing import.")
  @JsonProperty("errors")
  public List<KnowledgeImportJobError> getErrors() {
    return errors;
  }
  public void setErrors(List<KnowledgeImportJobError> errors) {
    this.errors = errors;
  }


  /**
   * Statistics related to the import job.
   **/
  public KnowledgeImportJobReport statistics(KnowledgeImportJobStatistics statistics) {
    this.statistics = statistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Statistics related to the import job.")
  @JsonProperty("statistics")
  public KnowledgeImportJobStatistics getStatistics() {
    return statistics;
  }
  public void setStatistics(KnowledgeImportJobStatistics statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeImportJobReport knowledgeImportJobReport = (KnowledgeImportJobReport) o;

    return Objects.equals(this.errors, knowledgeImportJobReport.errors) &&
            Objects.equals(this.statistics, knowledgeImportJobReport.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeImportJobReport {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

