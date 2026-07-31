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
import com.mypurecloud.sdk.v2.model.DecisionMetricsJobReference;
import com.mypurecloud.sdk.v2.model.DecisionMetricsUpdateError;
import com.mypurecloud.sdk.v2.model.WfmEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DecisionMetricsUpdateJobResponse
 */

public class DecisionMetricsUpdateJobResponse  implements Serializable {
  
  private String uploadKey = null;
  private DecisionMetricsJobReference job = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the update job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private WfmEntityMetadata metadata = null;
  private List<DecisionMetricsUpdateError> updateErrors = null;

  public DecisionMetricsUpdateJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      updateErrors = new ArrayList<DecisionMetricsUpdateError>();
    }
  }

  public DecisionMetricsUpdateJobResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      updateErrors = new ArrayList<DecisionMetricsUpdateError>();
    }
  }

  
  /**
   * The S3 key for the uploaded decision metrics file
   **/
  public DecisionMetricsUpdateJobResponse uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The S3 key for the uploaded decision metrics file")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   * The update job
   **/
  public DecisionMetricsUpdateJobResponse job(DecisionMetricsJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The update job")
  @JsonProperty("job")
  public DecisionMetricsJobReference getJob() {
    return job;
  }
  public void setJob(DecisionMetricsJobReference job) {
    this.job = job;
  }


  /**
   * The status of the update job
   **/
  public DecisionMetricsUpdateJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the update job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The metadata of the update job
   **/
  public DecisionMetricsUpdateJobResponse metadata(WfmEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata of the update job")
  @JsonProperty("metadata")
  public WfmEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmEntityMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * Errors occurred during update process, which will be non empty when status is `Error`
   **/
  public DecisionMetricsUpdateJobResponse updateErrors(List<DecisionMetricsUpdateError> updateErrors) {
    this.updateErrors = updateErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Errors occurred during update process, which will be non empty when status is `Error`")
  @JsonProperty("updateErrors")
  public List<DecisionMetricsUpdateError> getUpdateErrors() {
    return updateErrors;
  }
  public void setUpdateErrors(List<DecisionMetricsUpdateError> updateErrors) {
    this.updateErrors = updateErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionMetricsUpdateJobResponse decisionMetricsUpdateJobResponse = (DecisionMetricsUpdateJobResponse) o;

    return Objects.equals(this.uploadKey, decisionMetricsUpdateJobResponse.uploadKey) &&
            Objects.equals(this.job, decisionMetricsUpdateJobResponse.job) &&
            Objects.equals(this.status, decisionMetricsUpdateJobResponse.status) &&
            Objects.equals(this.metadata, decisionMetricsUpdateJobResponse.metadata) &&
            Objects.equals(this.updateErrors, decisionMetricsUpdateJobResponse.updateErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadKey, job, status, metadata, updateErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionMetricsUpdateJobResponse {\n");
    
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    updateErrors: ").append(toIndentedString(updateErrors)).append("\n");
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

