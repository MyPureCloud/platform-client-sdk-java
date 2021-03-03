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
import com.mypurecloud.sdk.v2.model.CalibrationAssignment;
import com.mypurecloud.sdk.v2.model.EvaluationAssignment;
import com.mypurecloud.sdk.v2.model.IntegrationExport;
import com.mypurecloud.sdk.v2.model.MediaTranscription;
import com.mypurecloud.sdk.v2.model.MeteredAssignmentByAgent;
import com.mypurecloud.sdk.v2.model.MeteredEvaluationAssignment;
import com.mypurecloud.sdk.v2.model.RetentionDuration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CrossPlatformPolicyActions
 */

public class CrossPlatformPolicyActions  implements Serializable {
  
  private Boolean retainRecording = null;
  private Boolean deleteRecording = null;
  private Boolean alwaysDelete = null;
  private List<EvaluationAssignment> assignEvaluations = new ArrayList<EvaluationAssignment>();
  private List<MeteredEvaluationAssignment> assignMeteredEvaluations = new ArrayList<MeteredEvaluationAssignment>();
  private List<MeteredAssignmentByAgent> assignMeteredAssignmentByAgent = new ArrayList<MeteredAssignmentByAgent>();
  private List<CalibrationAssignment> assignCalibrations = new ArrayList<CalibrationAssignment>();
  private RetentionDuration retentionDuration = null;
  private List<MediaTranscription> mediaTranscriptions = new ArrayList<MediaTranscription>();
  private IntegrationExport integrationExport = null;

  
  /**
   * true to retain the recording associated with the conversation. Default = true
   **/
  public CrossPlatformPolicyActions retainRecording(Boolean retainRecording) {
    this.retainRecording = retainRecording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true to retain the recording associated with the conversation. Default = true")
  @JsonProperty("retainRecording")
  public Boolean getRetainRecording() {
    return retainRecording;
  }
  public void setRetainRecording(Boolean retainRecording) {
    this.retainRecording = retainRecording;
  }

  
  /**
   * true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false
   **/
  public CrossPlatformPolicyActions deleteRecording(Boolean deleteRecording) {
    this.deleteRecording = deleteRecording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false")
  @JsonProperty("deleteRecording")
  public Boolean getDeleteRecording() {
    return deleteRecording;
  }
  public void setDeleteRecording(Boolean deleteRecording) {
    this.deleteRecording = deleteRecording;
  }

  
  /**
   * true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false
   **/
  public CrossPlatformPolicyActions alwaysDelete(Boolean alwaysDelete) {
    this.alwaysDelete = alwaysDelete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false")
  @JsonProperty("alwaysDelete")
  public Boolean getAlwaysDelete() {
    return alwaysDelete;
  }
  public void setAlwaysDelete(Boolean alwaysDelete) {
    this.alwaysDelete = alwaysDelete;
  }

  
  /**
   **/
  public CrossPlatformPolicyActions assignEvaluations(List<EvaluationAssignment> assignEvaluations) {
    this.assignEvaluations = assignEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignEvaluations")
  public List<EvaluationAssignment> getAssignEvaluations() {
    return assignEvaluations;
  }
  public void setAssignEvaluations(List<EvaluationAssignment> assignEvaluations) {
    this.assignEvaluations = assignEvaluations;
  }

  
  /**
   **/
  public CrossPlatformPolicyActions assignMeteredEvaluations(List<MeteredEvaluationAssignment> assignMeteredEvaluations) {
    this.assignMeteredEvaluations = assignMeteredEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignMeteredEvaluations")
  public List<MeteredEvaluationAssignment> getAssignMeteredEvaluations() {
    return assignMeteredEvaluations;
  }
  public void setAssignMeteredEvaluations(List<MeteredEvaluationAssignment> assignMeteredEvaluations) {
    this.assignMeteredEvaluations = assignMeteredEvaluations;
  }

  
  /**
   **/
  public CrossPlatformPolicyActions assignMeteredAssignmentByAgent(List<MeteredAssignmentByAgent> assignMeteredAssignmentByAgent) {
    this.assignMeteredAssignmentByAgent = assignMeteredAssignmentByAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignMeteredAssignmentByAgent")
  public List<MeteredAssignmentByAgent> getAssignMeteredAssignmentByAgent() {
    return assignMeteredAssignmentByAgent;
  }
  public void setAssignMeteredAssignmentByAgent(List<MeteredAssignmentByAgent> assignMeteredAssignmentByAgent) {
    this.assignMeteredAssignmentByAgent = assignMeteredAssignmentByAgent;
  }

  
  /**
   **/
  public CrossPlatformPolicyActions assignCalibrations(List<CalibrationAssignment> assignCalibrations) {
    this.assignCalibrations = assignCalibrations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignCalibrations")
  public List<CalibrationAssignment> getAssignCalibrations() {
    return assignCalibrations;
  }
  public void setAssignCalibrations(List<CalibrationAssignment> assignCalibrations) {
    this.assignCalibrations = assignCalibrations;
  }

  
  /**
   **/
  public CrossPlatformPolicyActions retentionDuration(RetentionDuration retentionDuration) {
    this.retentionDuration = retentionDuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retentionDuration")
  public RetentionDuration getRetentionDuration() {
    return retentionDuration;
  }
  public void setRetentionDuration(RetentionDuration retentionDuration) {
    this.retentionDuration = retentionDuration;
  }

  
  /**
   **/
  public CrossPlatformPolicyActions mediaTranscriptions(List<MediaTranscription> mediaTranscriptions) {
    this.mediaTranscriptions = mediaTranscriptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaTranscriptions")
  public List<MediaTranscription> getMediaTranscriptions() {
    return mediaTranscriptions;
  }
  public void setMediaTranscriptions(List<MediaTranscription> mediaTranscriptions) {
    this.mediaTranscriptions = mediaTranscriptions;
  }

  
  /**
   * Policy action for exporting recordings using an integration to 3rd party s3.
   **/
  public CrossPlatformPolicyActions integrationExport(IntegrationExport integrationExport) {
    this.integrationExport = integrationExport;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Policy action for exporting recordings using an integration to 3rd party s3.")
  @JsonProperty("integrationExport")
  public IntegrationExport getIntegrationExport() {
    return integrationExport;
  }
  public void setIntegrationExport(IntegrationExport integrationExport) {
    this.integrationExport = integrationExport;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossPlatformPolicyActions crossPlatformPolicyActions = (CrossPlatformPolicyActions) o;
    return Objects.equals(this.retainRecording, crossPlatformPolicyActions.retainRecording) &&
        Objects.equals(this.deleteRecording, crossPlatformPolicyActions.deleteRecording) &&
        Objects.equals(this.alwaysDelete, crossPlatformPolicyActions.alwaysDelete) &&
        Objects.equals(this.assignEvaluations, crossPlatformPolicyActions.assignEvaluations) &&
        Objects.equals(this.assignMeteredEvaluations, crossPlatformPolicyActions.assignMeteredEvaluations) &&
        Objects.equals(this.assignMeteredAssignmentByAgent, crossPlatformPolicyActions.assignMeteredAssignmentByAgent) &&
        Objects.equals(this.assignCalibrations, crossPlatformPolicyActions.assignCalibrations) &&
        Objects.equals(this.retentionDuration, crossPlatformPolicyActions.retentionDuration) &&
        Objects.equals(this.mediaTranscriptions, crossPlatformPolicyActions.mediaTranscriptions) &&
        Objects.equals(this.integrationExport, crossPlatformPolicyActions.integrationExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retainRecording, deleteRecording, alwaysDelete, assignEvaluations, assignMeteredEvaluations, assignMeteredAssignmentByAgent, assignCalibrations, retentionDuration, mediaTranscriptions, integrationExport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossPlatformPolicyActions {\n");
    
    sb.append("    retainRecording: ").append(toIndentedString(retainRecording)).append("\n");
    sb.append("    deleteRecording: ").append(toIndentedString(deleteRecording)).append("\n");
    sb.append("    alwaysDelete: ").append(toIndentedString(alwaysDelete)).append("\n");
    sb.append("    assignEvaluations: ").append(toIndentedString(assignEvaluations)).append("\n");
    sb.append("    assignMeteredEvaluations: ").append(toIndentedString(assignMeteredEvaluations)).append("\n");
    sb.append("    assignMeteredAssignmentByAgent: ").append(toIndentedString(assignMeteredAssignmentByAgent)).append("\n");
    sb.append("    assignCalibrations: ").append(toIndentedString(assignCalibrations)).append("\n");
    sb.append("    retentionDuration: ").append(toIndentedString(retentionDuration)).append("\n");
    sb.append("    mediaTranscriptions: ").append(toIndentedString(mediaTranscriptions)).append("\n");
    sb.append("    integrationExport: ").append(toIndentedString(integrationExport)).append("\n");
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

