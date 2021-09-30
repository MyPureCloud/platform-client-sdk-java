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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.RecordingJobsQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * RecordingJob
 */

public class RecordingJob  implements Serializable {
  
  private String id = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current state of the job.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FULFILLED("FULFILLED"),
    PENDING("PENDING"),
    READY("READY"),
    PROCESSING("PROCESSING"),
    CANCELLED("CANCELLED"),
    FAILED("FAILED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private RecordingJobsQuery recordingJobsQuery = null;
  private Date dateCreated = null;
  private Integer totalConversations = null;
  private Integer totalRecordings = null;
  private Integer totalSkippedRecordings = null;
  private Integer totalFailedRecordings = null;
  private Integer totalProcessedRecordings = null;
  private Integer percentProgress = null;
  private String errorMessage = null;
  private String failedRecordings = null;
  private String selfUri = null;
  private AddressableEntityRef user = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The current state of the job.
   **/
  public RecordingJob state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current state of the job.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  @ApiModelProperty(example = "null", value = "Original query of the job.")
  @JsonProperty("recordingJobsQuery")
  public RecordingJobsQuery getRecordingJobsQuery() {
    return recordingJobsQuery;
  }

  
  @ApiModelProperty(example = "null", value = "Date when the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Total number of conversations affected.")
  @JsonProperty("totalConversations")
  public Integer getTotalConversations() {
    return totalConversations;
  }

  
  @ApiModelProperty(example = "null", value = "Total number of recordings affected.")
  @JsonProperty("totalRecordings")
  public Integer getTotalRecordings() {
    return totalRecordings;
  }

  
  @ApiModelProperty(example = "null", value = "Total number of recordings that have been skipped.")
  @JsonProperty("totalSkippedRecordings")
  public Integer getTotalSkippedRecordings() {
    return totalSkippedRecordings;
  }

  
  @ApiModelProperty(example = "null", value = "Total number of recordings that the bulk job failed to process.")
  @JsonProperty("totalFailedRecordings")
  public Integer getTotalFailedRecordings() {
    return totalFailedRecordings;
  }

  
  @ApiModelProperty(example = "null", value = "Total number of recordings have been processed.")
  @JsonProperty("totalProcessedRecordings")
  public Integer getTotalProcessedRecordings() {
    return totalProcessedRecordings;
  }

  
  @ApiModelProperty(example = "null", value = "Progress in percentage based on the number of recordings")
  @JsonProperty("percentProgress")
  public Integer getPercentProgress() {
    return percentProgress;
  }

  
  @ApiModelProperty(example = "null", value = "Error occurred during the job execution")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  
  @ApiModelProperty(example = "null", value = "Get IDs of recordings that the bulk job failed for")
  @JsonProperty("failedRecordings")
  public String getFailedRecordings() {
    return failedRecordings;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  @ApiModelProperty(example = "null", value = "Details of the user created the job")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingJob recordingJob = (RecordingJob) o;
    return Objects.equals(this.id, recordingJob.id) &&
        Objects.equals(this.state, recordingJob.state) &&
        Objects.equals(this.recordingJobsQuery, recordingJob.recordingJobsQuery) &&
        Objects.equals(this.dateCreated, recordingJob.dateCreated) &&
        Objects.equals(this.totalConversations, recordingJob.totalConversations) &&
        Objects.equals(this.totalRecordings, recordingJob.totalRecordings) &&
        Objects.equals(this.totalSkippedRecordings, recordingJob.totalSkippedRecordings) &&
        Objects.equals(this.totalFailedRecordings, recordingJob.totalFailedRecordings) &&
        Objects.equals(this.totalProcessedRecordings, recordingJob.totalProcessedRecordings) &&
        Objects.equals(this.percentProgress, recordingJob.percentProgress) &&
        Objects.equals(this.errorMessage, recordingJob.errorMessage) &&
        Objects.equals(this.failedRecordings, recordingJob.failedRecordings) &&
        Objects.equals(this.selfUri, recordingJob.selfUri) &&
        Objects.equals(this.user, recordingJob.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, recordingJobsQuery, dateCreated, totalConversations, totalRecordings, totalSkippedRecordings, totalFailedRecordings, totalProcessedRecordings, percentProgress, errorMessage, failedRecordings, selfUri, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    recordingJobsQuery: ").append(toIndentedString(recordingJobsQuery)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    totalConversations: ").append(toIndentedString(totalConversations)).append("\n");
    sb.append("    totalRecordings: ").append(toIndentedString(totalRecordings)).append("\n");
    sb.append("    totalSkippedRecordings: ").append(toIndentedString(totalSkippedRecordings)).append("\n");
    sb.append("    totalFailedRecordings: ").append(toIndentedString(totalFailedRecordings)).append("\n");
    sb.append("    totalProcessedRecordings: ").append(toIndentedString(totalProcessedRecordings)).append("\n");
    sb.append("    percentProgress: ").append(toIndentedString(percentProgress)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    failedRecordings: ").append(toIndentedString(failedRecordings)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

