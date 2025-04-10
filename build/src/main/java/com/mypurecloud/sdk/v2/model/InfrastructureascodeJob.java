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
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Information about a CX infrastructure as code job
 */
@ApiModel(description = "Information about a CX infrastructure as code job")

public class InfrastructureascodeJob  implements Serializable {
  
  private String id = null;
  private Boolean dryRun = null;
  private String acceleratorId = null;
  private Date dateSubmitted = null;
  private UserReference submittedBy = null;

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
   * Job status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATED("Created"),
    QUEUED("Queued"),
    RUNNING("Running"),
    COMPLETE("Complete"),
    INTERNALERROR("InternalError"),
    INCOMPLETE("Incomplete"),
    FAILED("Failed"),
    ROLLBACKFAILED("RollbackFailed"),
    ROLLBACKCOMPLETE("RollbackComplete");

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
  private ErrorInfo errorInfo = null;
  private String results = null;
  private String rollbackResults = null;
  private String selfUri = null;

  public InfrastructureascodeJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Whether or not the job was a dry run
   **/
  public InfrastructureascodeJob dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the job was a dry run")
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  @ApiModelProperty(example = "null", value = "Accelerator associated with the job")
  @JsonProperty("acceleratorId")
  public String getAcceleratorId() {
    return acceleratorId;
  }


  @ApiModelProperty(example = "null", value = "Date and time on which job was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSubmitted")
  public Date getDateSubmitted() {
    return dateSubmitted;
  }


  @ApiModelProperty(example = "null", value = "User who submitted the job")
  @JsonProperty("submittedBy")
  public UserReference getSubmittedBy() {
    return submittedBy;
  }


  @ApiModelProperty(example = "null", value = "Job status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "Information about errors, if any")
  @JsonProperty("errorInfo")
  public ErrorInfo getErrorInfo() {
    return errorInfo;
  }


  @ApiModelProperty(example = "null", value = "The output results of the terraform job")
  @JsonProperty("results")
  public String getResults() {
    return results;
  }


  @ApiModelProperty(example = "null", value = "The results of rolling back the job if there were errors.  Not returned if job was successful.")
  @JsonProperty("rollbackResults")
  public String getRollbackResults() {
    return rollbackResults;
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
    InfrastructureascodeJob infrastructureascodeJob = (InfrastructureascodeJob) o;

    return Objects.equals(this.id, infrastructureascodeJob.id) &&
            Objects.equals(this.dryRun, infrastructureascodeJob.dryRun) &&
            Objects.equals(this.acceleratorId, infrastructureascodeJob.acceleratorId) &&
            Objects.equals(this.dateSubmitted, infrastructureascodeJob.dateSubmitted) &&
            Objects.equals(this.submittedBy, infrastructureascodeJob.submittedBy) &&
            Objects.equals(this.status, infrastructureascodeJob.status) &&
            Objects.equals(this.errorInfo, infrastructureascodeJob.errorInfo) &&
            Objects.equals(this.results, infrastructureascodeJob.results) &&
            Objects.equals(this.rollbackResults, infrastructureascodeJob.rollbackResults) &&
            Objects.equals(this.selfUri, infrastructureascodeJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dryRun, acceleratorId, dateSubmitted, submittedBy, status, errorInfo, results, rollbackResults, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfrastructureascodeJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    rollbackResults: ").append(toIndentedString(rollbackResults)).append("\n");
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

