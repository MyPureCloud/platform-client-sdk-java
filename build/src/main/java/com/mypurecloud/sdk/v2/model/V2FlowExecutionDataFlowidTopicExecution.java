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
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * V2FlowExecutionDataFlowidTopicExecution
 */

public class V2FlowExecutionDataFlowidTopicExecution  implements Serializable {
  
  private String objectType = null;
  private String objectId = null;
  private String outputPathId = null;
  private String executionId = null;
  private Date startDateTime = null;
  private V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo error = null;
  private V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo warning = null;
  private String languageTag = null;

  public V2FlowExecutionDataFlowidTopicExecution() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The type of executionItem that was executed.
   **/
  public V2FlowExecutionDataFlowidTopicExecution objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of executionItem that was executed.")
  @JsonProperty("objectType")
  public String getObjectType() {
    return objectType;
  }
  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  /**
   * If applicable, the actionId, menuId or taskId for the executionItem.
   **/
  public V2FlowExecutionDataFlowidTopicExecution objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If applicable, the actionId, menuId or taskId for the executionItem.")
  @JsonProperty("objectId")
  public String getObjectId() {
    return objectId;
  }
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  /**
   * If applicable, the identifier of the OutputPath that was taken.
   **/
  public V2FlowExecutionDataFlowidTopicExecution outputPathId(String outputPathId) {
    this.outputPathId = outputPathId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If applicable, the identifier of the OutputPath that was taken.")
  @JsonProperty("outputPathId")
  public String getOutputPathId() {
    return outputPathId;
  }
  public void setOutputPathId(String outputPathId) {
    this.outputPathId = outputPathId;
  }


  /**
   * If applicable, the executionId for the executionItem.
   **/
  public V2FlowExecutionDataFlowidTopicExecution executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If applicable, the executionId for the executionItem.")
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }
  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  /**
   * This is the starting time of the executionItem.
   **/
  public V2FlowExecutionDataFlowidTopicExecution startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the starting time of the executionItem.")
  @JsonProperty("startDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }


  /**
   * Event generated when a Flow's Execution History is received and logged.
   **/
  public V2FlowExecutionDataFlowidTopicExecution error(V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event generated when a Flow's Execution History is received and logged.")
  @JsonProperty("error")
  public V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo getError() {
    return error;
  }
  public void setError(V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo error) {
    this.error = error;
  }


  /**
   * Event generated when a Flow's Execution History is received and logged.
   **/
  public V2FlowExecutionDataFlowidTopicExecution warning(V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo warning) {
    this.warning = warning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event generated when a Flow's Execution History is received and logged.")
  @JsonProperty("warning")
  public V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo getWarning() {
    return warning;
  }
  public void setWarning(V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo warning) {
    this.warning = warning;
  }


  /**
   * If applicable, the language tag associated set by the execution.
   **/
  public V2FlowExecutionDataFlowidTopicExecution languageTag(String languageTag) {
    this.languageTag = languageTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If applicable, the language tag associated set by the execution.")
  @JsonProperty("languageTag")
  public String getLanguageTag() {
    return languageTag;
  }
  public void setLanguageTag(String languageTag) {
    this.languageTag = languageTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicExecution v2FlowExecutionDataFlowidTopicExecution = (V2FlowExecutionDataFlowidTopicExecution) o;

    return Objects.equals(this.objectType, v2FlowExecutionDataFlowidTopicExecution.objectType) &&
            Objects.equals(this.objectId, v2FlowExecutionDataFlowidTopicExecution.objectId) &&
            Objects.equals(this.outputPathId, v2FlowExecutionDataFlowidTopicExecution.outputPathId) &&
            Objects.equals(this.executionId, v2FlowExecutionDataFlowidTopicExecution.executionId) &&
            Objects.equals(this.startDateTime, v2FlowExecutionDataFlowidTopicExecution.startDateTime) &&
            Objects.equals(this.error, v2FlowExecutionDataFlowidTopicExecution.error) &&
            Objects.equals(this.warning, v2FlowExecutionDataFlowidTopicExecution.warning) &&
            Objects.equals(this.languageTag, v2FlowExecutionDataFlowidTopicExecution.languageTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, objectId, outputPathId, executionId, startDateTime, error, warning, languageTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicExecution {\n");
    
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    outputPathId: ").append(toIndentedString(outputPathId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    languageTag: ").append(toIndentedString(languageTag)).append("\n");
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

