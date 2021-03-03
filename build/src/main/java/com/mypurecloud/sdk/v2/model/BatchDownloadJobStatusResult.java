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
import com.mypurecloud.sdk.v2.model.BatchDownloadJobResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BatchDownloadJobStatusResult
 */

public class BatchDownloadJobStatusResult  implements Serializable {
  
  private String id = null;
  private String jobId = null;
  private Integer expectedResultCount = null;
  private Integer resultCount = null;
  private Integer errorCount = null;
  private List<BatchDownloadJobResult> results = new ArrayList<BatchDownloadJobResult>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * JobId returned when job was initially submitted
   **/
  public BatchDownloadJobStatusResult jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JobId returned when job was initially submitted")
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  
  /**
   * Number of results expected when job is completed
   **/
  public BatchDownloadJobStatusResult expectedResultCount(Integer expectedResultCount) {
    this.expectedResultCount = expectedResultCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of results expected when job is completed")
  @JsonProperty("expectedResultCount")
  public Integer getExpectedResultCount() {
    return expectedResultCount;
  }
  public void setExpectedResultCount(Integer expectedResultCount) {
    this.expectedResultCount = expectedResultCount;
  }

  
  /**
   * Current number of results available
   **/
  public BatchDownloadJobStatusResult resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current number of results available")
  @JsonProperty("resultCount")
  public Integer getResultCount() {
    return resultCount;
  }
  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }

  
  /**
   * Number of error results produced so far
   **/
  public BatchDownloadJobStatusResult errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of error results produced so far")
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  
  /**
   * Current set of results for the job
   **/
  public BatchDownloadJobStatusResult results(List<BatchDownloadJobResult> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current set of results for the job")
  @JsonProperty("results")
  public List<BatchDownloadJobResult> getResults() {
    return results;
  }
  public void setResults(List<BatchDownloadJobResult> results) {
    this.results = results;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDownloadJobStatusResult batchDownloadJobStatusResult = (BatchDownloadJobStatusResult) o;
    return Objects.equals(this.id, batchDownloadJobStatusResult.id) &&
        Objects.equals(this.jobId, batchDownloadJobStatusResult.jobId) &&
        Objects.equals(this.expectedResultCount, batchDownloadJobStatusResult.expectedResultCount) &&
        Objects.equals(this.resultCount, batchDownloadJobStatusResult.resultCount) &&
        Objects.equals(this.errorCount, batchDownloadJobStatusResult.errorCount) &&
        Objects.equals(this.results, batchDownloadJobStatusResult.results) &&
        Objects.equals(this.selfUri, batchDownloadJobStatusResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, expectedResultCount, resultCount, errorCount, results, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDownloadJobStatusResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    expectedResultCount: ").append(toIndentedString(expectedResultCount)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

