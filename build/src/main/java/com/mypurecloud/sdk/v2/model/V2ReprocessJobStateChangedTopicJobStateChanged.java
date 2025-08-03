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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ReprocessJobStateChangedTopicJobStateChanged
 */

public class V2ReprocessJobStateChangedTopicJobStateChanged  implements Serializable {
  
  private String organizationId = null;
  private String jobId = null;

  private static class JobStatusEnumDeserializer extends StdDeserializer<JobStatusEnum> {
    public JobStatusEnumDeserializer() {
      super(JobStatusEnumDeserializer.class);
    }

    @Override
    public JobStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return JobStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets jobStatus
   */
 @JsonDeserialize(using = JobStatusEnumDeserializer.class)
  public enum JobStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    QUEUED("Queued"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private String value;

    JobStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static JobStatusEnum fromString(String key) {
      if (key == null) return null;

      for (JobStatusEnum value : JobStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return JobStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private JobStatusEnum jobStatus = null;
  private Long processedInteractionsCount = null;
  private Long failedInteractionsCount = null;
  private Long totalInteractions = null;

  public V2ReprocessJobStateChangedTopicJobStateChanged() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2ReprocessJobStateChangedTopicJobStateChanged organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   **/
  public V2ReprocessJobStateChangedTopicJobStateChanged jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  /**
   **/
  public V2ReprocessJobStateChangedTopicJobStateChanged jobStatus(JobStatusEnum jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jobStatus")
  public JobStatusEnum getJobStatus() {
    return jobStatus;
  }
  public void setJobStatus(JobStatusEnum jobStatus) {
    this.jobStatus = jobStatus;
  }


  /**
   **/
  public V2ReprocessJobStateChangedTopicJobStateChanged processedInteractionsCount(Long processedInteractionsCount) {
    this.processedInteractionsCount = processedInteractionsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processedInteractionsCount")
  public Long getProcessedInteractionsCount() {
    return processedInteractionsCount;
  }
  public void setProcessedInteractionsCount(Long processedInteractionsCount) {
    this.processedInteractionsCount = processedInteractionsCount;
  }


  /**
   **/
  public V2ReprocessJobStateChangedTopicJobStateChanged failedInteractionsCount(Long failedInteractionsCount) {
    this.failedInteractionsCount = failedInteractionsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failedInteractionsCount")
  public Long getFailedInteractionsCount() {
    return failedInteractionsCount;
  }
  public void setFailedInteractionsCount(Long failedInteractionsCount) {
    this.failedInteractionsCount = failedInteractionsCount;
  }


  /**
   **/
  public V2ReprocessJobStateChangedTopicJobStateChanged totalInteractions(Long totalInteractions) {
    this.totalInteractions = totalInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalInteractions")
  public Long getTotalInteractions() {
    return totalInteractions;
  }
  public void setTotalInteractions(Long totalInteractions) {
    this.totalInteractions = totalInteractions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ReprocessJobStateChangedTopicJobStateChanged v2ReprocessJobStateChangedTopicJobStateChanged = (V2ReprocessJobStateChangedTopicJobStateChanged) o;

    return Objects.equals(this.organizationId, v2ReprocessJobStateChangedTopicJobStateChanged.organizationId) &&
            Objects.equals(this.jobId, v2ReprocessJobStateChangedTopicJobStateChanged.jobId) &&
            Objects.equals(this.jobStatus, v2ReprocessJobStateChangedTopicJobStateChanged.jobStatus) &&
            Objects.equals(this.processedInteractionsCount, v2ReprocessJobStateChangedTopicJobStateChanged.processedInteractionsCount) &&
            Objects.equals(this.failedInteractionsCount, v2ReprocessJobStateChangedTopicJobStateChanged.failedInteractionsCount) &&
            Objects.equals(this.totalInteractions, v2ReprocessJobStateChangedTopicJobStateChanged.totalInteractions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, jobId, jobStatus, processedInteractionsCount, failedInteractionsCount, totalInteractions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ReprocessJobStateChangedTopicJobStateChanged {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    processedInteractionsCount: ").append(toIndentedString(processedInteractionsCount)).append("\n");
    sb.append("    failedInteractionsCount: ").append(toIndentedString(failedInteractionsCount)).append("\n");
    sb.append("    totalInteractions: ").append(toIndentedString(totalInteractions)).append("\n");
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

