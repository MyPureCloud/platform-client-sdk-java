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
 * KnowledgeSyncJobStatistics
 */

public class KnowledgeSyncJobStatistics  implements Serializable {
  
  private Integer countDocumentImportActivityCreate = null;
  private Integer countDocumentImportActivityUpdate = null;
  private Integer countDocumentStateDraft = null;
  private Integer countDocumentStatePublished = null;
  private Integer countDocumentImportSuccess = null;
  private Integer countDocumentImportFailure = null;
  private Integer countCategoryImportSuccess = null;
  private Integer countCategoryImportFailure = null;
  private Integer countLabelImportSuccess = null;
  private Integer countLabelImportFailure = null;
  private Integer countDocumentDeleteSuccess = null;
  private Integer countDocumentDeleteFailure = null;
  private Integer countCategoryDeleteSuccess = null;
  private Integer countCategoryDeleteFailure = null;
  private Integer countLabelDeleteSuccess = null;
  private Integer countLabelDeleteFailure = null;

  
  /**
   * Number of documents will be created by the sync.
   **/
  public KnowledgeSyncJobStatistics countDocumentImportActivityCreate(Integer countDocumentImportActivityCreate) {
    this.countDocumentImportActivityCreate = countDocumentImportActivityCreate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents will be created by the sync.")
  @JsonProperty("countDocumentImportActivityCreate")
  public Integer getCountDocumentImportActivityCreate() {
    return countDocumentImportActivityCreate;
  }
  public void setCountDocumentImportActivityCreate(Integer countDocumentImportActivityCreate) {
    this.countDocumentImportActivityCreate = countDocumentImportActivityCreate;
  }


  /**
   * Number of documents will be updated by the sync.
   **/
  public KnowledgeSyncJobStatistics countDocumentImportActivityUpdate(Integer countDocumentImportActivityUpdate) {
    this.countDocumentImportActivityUpdate = countDocumentImportActivityUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents will be updated by the sync.")
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
  public KnowledgeSyncJobStatistics countDocumentStateDraft(Integer countDocumentStateDraft) {
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
  public KnowledgeSyncJobStatistics countDocumentStatePublished(Integer countDocumentStatePublished) {
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
   * Number of imported documents.
   **/
  public KnowledgeSyncJobStatistics countDocumentImportSuccess(Integer countDocumentImportSuccess) {
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
  public KnowledgeSyncJobStatistics countDocumentImportFailure(Integer countDocumentImportFailure) {
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


  /**
   * Number of imported categories.
   **/
  public KnowledgeSyncJobStatistics countCategoryImportSuccess(Integer countCategoryImportSuccess) {
    this.countCategoryImportSuccess = countCategoryImportSuccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of imported categories.")
  @JsonProperty("countCategoryImportSuccess")
  public Integer getCountCategoryImportSuccess() {
    return countCategoryImportSuccess;
  }
  public void setCountCategoryImportSuccess(Integer countCategoryImportSuccess) {
    this.countCategoryImportSuccess = countCategoryImportSuccess;
  }


  /**
   * Number of categories failed to import.
   **/
  public KnowledgeSyncJobStatistics countCategoryImportFailure(Integer countCategoryImportFailure) {
    this.countCategoryImportFailure = countCategoryImportFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of categories failed to import.")
  @JsonProperty("countCategoryImportFailure")
  public Integer getCountCategoryImportFailure() {
    return countCategoryImportFailure;
  }
  public void setCountCategoryImportFailure(Integer countCategoryImportFailure) {
    this.countCategoryImportFailure = countCategoryImportFailure;
  }


  /**
   * Number of imported labels.
   **/
  public KnowledgeSyncJobStatistics countLabelImportSuccess(Integer countLabelImportSuccess) {
    this.countLabelImportSuccess = countLabelImportSuccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of imported labels.")
  @JsonProperty("countLabelImportSuccess")
  public Integer getCountLabelImportSuccess() {
    return countLabelImportSuccess;
  }
  public void setCountLabelImportSuccess(Integer countLabelImportSuccess) {
    this.countLabelImportSuccess = countLabelImportSuccess;
  }


  /**
   * Number of labels failed to import.
   **/
  public KnowledgeSyncJobStatistics countLabelImportFailure(Integer countLabelImportFailure) {
    this.countLabelImportFailure = countLabelImportFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of labels failed to import.")
  @JsonProperty("countLabelImportFailure")
  public Integer getCountLabelImportFailure() {
    return countLabelImportFailure;
  }
  public void setCountLabelImportFailure(Integer countLabelImportFailure) {
    this.countLabelImportFailure = countLabelImportFailure;
  }


  /**
   * Number of documents will be deleted by the sync.
   **/
  public KnowledgeSyncJobStatistics countDocumentDeleteSuccess(Integer countDocumentDeleteSuccess) {
    this.countDocumentDeleteSuccess = countDocumentDeleteSuccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents will be deleted by the sync.")
  @JsonProperty("countDocumentDeleteSuccess")
  public Integer getCountDocumentDeleteSuccess() {
    return countDocumentDeleteSuccess;
  }
  public void setCountDocumentDeleteSuccess(Integer countDocumentDeleteSuccess) {
    this.countDocumentDeleteSuccess = countDocumentDeleteSuccess;
  }


  /**
   * Number of documents failed to delete.
   **/
  public KnowledgeSyncJobStatistics countDocumentDeleteFailure(Integer countDocumentDeleteFailure) {
    this.countDocumentDeleteFailure = countDocumentDeleteFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents failed to delete.")
  @JsonProperty("countDocumentDeleteFailure")
  public Integer getCountDocumentDeleteFailure() {
    return countDocumentDeleteFailure;
  }
  public void setCountDocumentDeleteFailure(Integer countDocumentDeleteFailure) {
    this.countDocumentDeleteFailure = countDocumentDeleteFailure;
  }


  /**
   * Number of successfully deleted categories.
   **/
  public KnowledgeSyncJobStatistics countCategoryDeleteSuccess(Integer countCategoryDeleteSuccess) {
    this.countCategoryDeleteSuccess = countCategoryDeleteSuccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of successfully deleted categories.")
  @JsonProperty("countCategoryDeleteSuccess")
  public Integer getCountCategoryDeleteSuccess() {
    return countCategoryDeleteSuccess;
  }
  public void setCountCategoryDeleteSuccess(Integer countCategoryDeleteSuccess) {
    this.countCategoryDeleteSuccess = countCategoryDeleteSuccess;
  }


  /**
   * Number of categories failed to delete.
   **/
  public KnowledgeSyncJobStatistics countCategoryDeleteFailure(Integer countCategoryDeleteFailure) {
    this.countCategoryDeleteFailure = countCategoryDeleteFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of categories failed to delete.")
  @JsonProperty("countCategoryDeleteFailure")
  public Integer getCountCategoryDeleteFailure() {
    return countCategoryDeleteFailure;
  }
  public void setCountCategoryDeleteFailure(Integer countCategoryDeleteFailure) {
    this.countCategoryDeleteFailure = countCategoryDeleteFailure;
  }


  /**
   * Number of successfully deleted labels.
   **/
  public KnowledgeSyncJobStatistics countLabelDeleteSuccess(Integer countLabelDeleteSuccess) {
    this.countLabelDeleteSuccess = countLabelDeleteSuccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of successfully deleted labels.")
  @JsonProperty("countLabelDeleteSuccess")
  public Integer getCountLabelDeleteSuccess() {
    return countLabelDeleteSuccess;
  }
  public void setCountLabelDeleteSuccess(Integer countLabelDeleteSuccess) {
    this.countLabelDeleteSuccess = countLabelDeleteSuccess;
  }


  /**
   * Number of labels failed to delete.
   **/
  public KnowledgeSyncJobStatistics countLabelDeleteFailure(Integer countLabelDeleteFailure) {
    this.countLabelDeleteFailure = countLabelDeleteFailure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of labels failed to delete.")
  @JsonProperty("countLabelDeleteFailure")
  public Integer getCountLabelDeleteFailure() {
    return countLabelDeleteFailure;
  }
  public void setCountLabelDeleteFailure(Integer countLabelDeleteFailure) {
    this.countLabelDeleteFailure = countLabelDeleteFailure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSyncJobStatistics knowledgeSyncJobStatistics = (KnowledgeSyncJobStatistics) o;

    return Objects.equals(this.countDocumentImportActivityCreate, knowledgeSyncJobStatistics.countDocumentImportActivityCreate) &&
            Objects.equals(this.countDocumentImportActivityUpdate, knowledgeSyncJobStatistics.countDocumentImportActivityUpdate) &&
            Objects.equals(this.countDocumentStateDraft, knowledgeSyncJobStatistics.countDocumentStateDraft) &&
            Objects.equals(this.countDocumentStatePublished, knowledgeSyncJobStatistics.countDocumentStatePublished) &&
            Objects.equals(this.countDocumentImportSuccess, knowledgeSyncJobStatistics.countDocumentImportSuccess) &&
            Objects.equals(this.countDocumentImportFailure, knowledgeSyncJobStatistics.countDocumentImportFailure) &&
            Objects.equals(this.countCategoryImportSuccess, knowledgeSyncJobStatistics.countCategoryImportSuccess) &&
            Objects.equals(this.countCategoryImportFailure, knowledgeSyncJobStatistics.countCategoryImportFailure) &&
            Objects.equals(this.countLabelImportSuccess, knowledgeSyncJobStatistics.countLabelImportSuccess) &&
            Objects.equals(this.countLabelImportFailure, knowledgeSyncJobStatistics.countLabelImportFailure) &&
            Objects.equals(this.countDocumentDeleteSuccess, knowledgeSyncJobStatistics.countDocumentDeleteSuccess) &&
            Objects.equals(this.countDocumentDeleteFailure, knowledgeSyncJobStatistics.countDocumentDeleteFailure) &&
            Objects.equals(this.countCategoryDeleteSuccess, knowledgeSyncJobStatistics.countCategoryDeleteSuccess) &&
            Objects.equals(this.countCategoryDeleteFailure, knowledgeSyncJobStatistics.countCategoryDeleteFailure) &&
            Objects.equals(this.countLabelDeleteSuccess, knowledgeSyncJobStatistics.countLabelDeleteSuccess) &&
            Objects.equals(this.countLabelDeleteFailure, knowledgeSyncJobStatistics.countLabelDeleteFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countDocumentImportActivityCreate, countDocumentImportActivityUpdate, countDocumentStateDraft, countDocumentStatePublished, countDocumentImportSuccess, countDocumentImportFailure, countCategoryImportSuccess, countCategoryImportFailure, countLabelImportSuccess, countLabelImportFailure, countDocumentDeleteSuccess, countDocumentDeleteFailure, countCategoryDeleteSuccess, countCategoryDeleteFailure, countLabelDeleteSuccess, countLabelDeleteFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSyncJobStatistics {\n");
    
    sb.append("    countDocumentImportActivityCreate: ").append(toIndentedString(countDocumentImportActivityCreate)).append("\n");
    sb.append("    countDocumentImportActivityUpdate: ").append(toIndentedString(countDocumentImportActivityUpdate)).append("\n");
    sb.append("    countDocumentStateDraft: ").append(toIndentedString(countDocumentStateDraft)).append("\n");
    sb.append("    countDocumentStatePublished: ").append(toIndentedString(countDocumentStatePublished)).append("\n");
    sb.append("    countDocumentImportSuccess: ").append(toIndentedString(countDocumentImportSuccess)).append("\n");
    sb.append("    countDocumentImportFailure: ").append(toIndentedString(countDocumentImportFailure)).append("\n");
    sb.append("    countCategoryImportSuccess: ").append(toIndentedString(countCategoryImportSuccess)).append("\n");
    sb.append("    countCategoryImportFailure: ").append(toIndentedString(countCategoryImportFailure)).append("\n");
    sb.append("    countLabelImportSuccess: ").append(toIndentedString(countLabelImportSuccess)).append("\n");
    sb.append("    countLabelImportFailure: ").append(toIndentedString(countLabelImportFailure)).append("\n");
    sb.append("    countDocumentDeleteSuccess: ").append(toIndentedString(countDocumentDeleteSuccess)).append("\n");
    sb.append("    countDocumentDeleteFailure: ").append(toIndentedString(countDocumentDeleteFailure)).append("\n");
    sb.append("    countCategoryDeleteSuccess: ").append(toIndentedString(countCategoryDeleteSuccess)).append("\n");
    sb.append("    countCategoryDeleteFailure: ").append(toIndentedString(countCategoryDeleteFailure)).append("\n");
    sb.append("    countLabelDeleteSuccess: ").append(toIndentedString(countLabelDeleteSuccess)).append("\n");
    sb.append("    countLabelDeleteFailure: ").append(toIndentedString(countLabelDeleteFailure)).append("\n");
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

