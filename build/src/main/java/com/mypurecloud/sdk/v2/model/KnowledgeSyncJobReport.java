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
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSyncJobReport
 */

public class KnowledgeSyncJobReport  implements Serializable {
  
  private List<ErrorBody> errors = null;
  private KnowledgeSyncJobStatistics statistics = null;

  public KnowledgeSyncJobReport() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      errors = new ArrayList<ErrorBody>();
    }
  }

  
  /**
   * List of errors occurred during processing sync.
   **/
  public KnowledgeSyncJobReport errors(List<ErrorBody> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of errors occurred during processing sync.")
  @JsonProperty("errors")
  public List<ErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorBody> errors) {
    this.errors = errors;
  }


  /**
   * Statistics related to the sync job.
   **/
  public KnowledgeSyncJobReport statistics(KnowledgeSyncJobStatistics statistics) {
    this.statistics = statistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Statistics related to the sync job.")
  @JsonProperty("statistics")
  public KnowledgeSyncJobStatistics getStatistics() {
    return statistics;
  }
  public void setStatistics(KnowledgeSyncJobStatistics statistics) {
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
    KnowledgeSyncJobReport knowledgeSyncJobReport = (KnowledgeSyncJobReport) o;

    return Objects.equals(this.errors, knowledgeSyncJobReport.errors) &&
            Objects.equals(this.statistics, knowledgeSyncJobReport.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSyncJobReport {\n");
    
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

