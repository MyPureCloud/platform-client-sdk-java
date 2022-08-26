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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeImportJobStatistics
 */

public class KnowledgeImportJobStatistics  implements Serializable {
  
  private Integer countDocumentImportActivityCreate = null;
  private Integer countDocumentImportActivityUpdate = null;
  private Integer countDocumentStateDraft = null;
  private Integer countDocumentStatePublished = null;
  private Integer countDocumentValidationSuccess = null;
  private Integer countDocumentValidationFailure = null;
  private Integer countDocumentImportSuccess = null;
  private Integer countDocumentImportFailure = null;

  
  /**
   * Number of documents will be created by the import.
   **/
  public KnowledgeImportJobStatistics countDocumentImportActivityCreate(Integer countDocumentImportActivityCreate) {
    this.countDocumentImportActivityCreate = countDocumentImportActivityCreate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents will be created by the import.")
  @JsonProperty("countDocumentImportActivityCreate")
  public Integer getCountDocumentImportActivityCreate() {
    return countDocumentImportActivityCreate;
  }
  public void setCountDocumentImportActivityCreate(Integer countDocumentImportActivityCreate) {
    this.countDocumentImportActivityCreate = countDocumentImportActivityCreate;
  }


  /**
   * Number of documents will be updated by the import.
   **/
  public KnowledgeImportJobStatistics countDocumentImportActivityUpdate(Integer countDocumentImportActivityUpdate) {
    this.countDocumentImportActivityUpdate = countDocumentImportActivityUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents will be updated by the import.")
  @JsonProperty("countDocumentImportActivityUpdate")
  public Integer getCountDocumentImportActivityUpdate() {
    return countDocumentImportActivityUpdate;
  }
  public void setCountDocumentImportActivityUpdate(Integer countDocumentImportActivityUpdate) {
    this.countDocumentImportActivityUpdate = countDocumentImportActivityUpdate;
  }


  /**
   * Number of documents will be imported as draft.
   **/
  public KnowledgeImportJobStatistics countDocumentStateDraft(Integer countDocumentStateDraft) {
    this.countDocumentStateDraft = countDocumentStateDraft;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents will be imported as draft.")
  @JsonProperty("countDocumentStateDraft")
  public Integer getCountDocumentStateDraft() {
    return countDocumentStateDraft;
  }
  public void setCountDocumentStateDraft(Integer countDocumentStateDraft) {
    this.countDocumentStateDraft = countDocumentStateDraft;
  }


  /**
   * Number of documents will be imported as published.
   **/
  public KnowledgeImportJobStatistics countDocumentStatePublished(Integer countDocumentStatePublished) {
    this.countDocumentStatePublished = countDocumentStatePublished;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents will be imported as published.")
  @JsonProperty("countDocumentStatePublished")
  public Integer getCountDocumentStatePublished() {
    return countDocumentStatePublished;
  }
  public void setCountDocumentStatePublished(Integer countDocumentStatePublished) {
    this.countDocumentStatePublished = countDocumentStatePublished;
  }


  /**
   * Number of documents that validated successfully for import.
   **/
  public KnowledgeImportJobStatistics countDocumentValidationSuccess(Integer countDocumentValidationSuccess) {
    this.countDocumentValidationSuccess = countDocumentValidationSuccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents that validated successfully for import.")
  @JsonProperty("countDocumentValidationSuccess")
  public Integer getCountDocumentValidationSuccess() {
    return countDocumentValidationSuccess;
  }
  public void setCountDocumentValidationSuccess(Integer countDocumentValidationSuccess) {
    this.countDocumentValidationSuccess = countDocumentValidationSuccess;
  }


  /**
   * Number of documents that failed validation for import.
   **/
  public KnowledgeImportJobStatistics countDocumentValidationFailure(Integer countDocumentValidationFailure) {
    this.countDocumentValidationFailure = countDocumentValidationFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents that failed validation for import.")
  @JsonProperty("countDocumentValidationFailure")
  public Integer getCountDocumentValidationFailure() {
    return countDocumentValidationFailure;
  }
  public void setCountDocumentValidationFailure(Integer countDocumentValidationFailure) {
    this.countDocumentValidationFailure = countDocumentValidationFailure;
  }


  /**
   * Number of imported documents.
   **/
  public KnowledgeImportJobStatistics countDocumentImportSuccess(Integer countDocumentImportSuccess) {
    this.countDocumentImportSuccess = countDocumentImportSuccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of imported documents.")
  @JsonProperty("countDocumentImportSuccess")
  public Integer getCountDocumentImportSuccess() {
    return countDocumentImportSuccess;
  }
  public void setCountDocumentImportSuccess(Integer countDocumentImportSuccess) {
    this.countDocumentImportSuccess = countDocumentImportSuccess;
  }


  /**
   * Number of documents failed to import.
   **/
  public KnowledgeImportJobStatistics countDocumentImportFailure(Integer countDocumentImportFailure) {
    this.countDocumentImportFailure = countDocumentImportFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents failed to import.")
  @JsonProperty("countDocumentImportFailure")
  public Integer getCountDocumentImportFailure() {
    return countDocumentImportFailure;
  }
  public void setCountDocumentImportFailure(Integer countDocumentImportFailure) {
    this.countDocumentImportFailure = countDocumentImportFailure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeImportJobStatistics knowledgeImportJobStatistics = (KnowledgeImportJobStatistics) o;

    return Objects.equals(this.countDocumentImportActivityCreate, knowledgeImportJobStatistics.countDocumentImportActivityCreate) &&
            Objects.equals(this.countDocumentImportActivityUpdate, knowledgeImportJobStatistics.countDocumentImportActivityUpdate) &&
            Objects.equals(this.countDocumentStateDraft, knowledgeImportJobStatistics.countDocumentStateDraft) &&
            Objects.equals(this.countDocumentStatePublished, knowledgeImportJobStatistics.countDocumentStatePublished) &&
            Objects.equals(this.countDocumentValidationSuccess, knowledgeImportJobStatistics.countDocumentValidationSuccess) &&
            Objects.equals(this.countDocumentValidationFailure, knowledgeImportJobStatistics.countDocumentValidationFailure) &&
            Objects.equals(this.countDocumentImportSuccess, knowledgeImportJobStatistics.countDocumentImportSuccess) &&
            Objects.equals(this.countDocumentImportFailure, knowledgeImportJobStatistics.countDocumentImportFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countDocumentImportActivityCreate, countDocumentImportActivityUpdate, countDocumentStateDraft, countDocumentStatePublished, countDocumentValidationSuccess, countDocumentValidationFailure, countDocumentImportSuccess, countDocumentImportFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeImportJobStatistics {\n");
    
    sb.append("    countDocumentImportActivityCreate: ").append(toIndentedString(countDocumentImportActivityCreate)).append("\n");
    sb.append("    countDocumentImportActivityUpdate: ").append(toIndentedString(countDocumentImportActivityUpdate)).append("\n");
    sb.append("    countDocumentStateDraft: ").append(toIndentedString(countDocumentStateDraft)).append("\n");
    sb.append("    countDocumentStatePublished: ").append(toIndentedString(countDocumentStatePublished)).append("\n");
    sb.append("    countDocumentValidationSuccess: ").append(toIndentedString(countDocumentValidationSuccess)).append("\n");
    sb.append("    countDocumentValidationFailure: ").append(toIndentedString(countDocumentValidationFailure)).append("\n");
    sb.append("    countDocumentImportSuccess: ").append(toIndentedString(countDocumentImportSuccess)).append("\n");
    sb.append("    countDocumentImportFailure: ").append(toIndentedString(countDocumentImportFailure)).append("\n");
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

