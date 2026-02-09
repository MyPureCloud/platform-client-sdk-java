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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SwapRowIndexRequest
 */

public class SwapRowIndexRequest  implements Serializable {
  
  private String sourceRowId = null;
  private Integer sourceRowIndex = null;
  private String targetRowId = null;
  private Integer targetRowIndex = null;

  public SwapRowIndexRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier of the source row to swap
   **/
  public SwapRowIndexRequest sourceRowId(String sourceRowId) {
    this.sourceRowId = sourceRowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier of the source row to swap")
  @JsonProperty("sourceRowId")
  public String getSourceRowId() {
    return sourceRowId;
  }
  public void setSourceRowId(String sourceRowId) {
    this.sourceRowId = sourceRowId;
  }


  /**
   * The current index position of the source row. Must be positive, starting from 1 and less than or equal to the size of the table
   * minimum: 1
   **/
  public SwapRowIndexRequest sourceRowIndex(Integer sourceRowIndex) {
    this.sourceRowIndex = sourceRowIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current index position of the source row. Must be positive, starting from 1 and less than or equal to the size of the table")
  @JsonProperty("sourceRowIndex")
  public Integer getSourceRowIndex() {
    return sourceRowIndex;
  }
  public void setSourceRowIndex(Integer sourceRowIndex) {
    this.sourceRowIndex = sourceRowIndex;
  }


  /**
   * Unique identifier of the target row to swap
   **/
  public SwapRowIndexRequest targetRowId(String targetRowId) {
    this.targetRowId = targetRowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier of the target row to swap")
  @JsonProperty("targetRowId")
  public String getTargetRowId() {
    return targetRowId;
  }
  public void setTargetRowId(String targetRowId) {
    this.targetRowId = targetRowId;
  }


  /**
   * The current index position of the target row. Must be positive, starting from 1 and less than or equal to the size of the table
   * minimum: 1
   **/
  public SwapRowIndexRequest targetRowIndex(Integer targetRowIndex) {
    this.targetRowIndex = targetRowIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current index position of the target row. Must be positive, starting from 1 and less than or equal to the size of the table")
  @JsonProperty("targetRowIndex")
  public Integer getTargetRowIndex() {
    return targetRowIndex;
  }
  public void setTargetRowIndex(Integer targetRowIndex) {
    this.targetRowIndex = targetRowIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwapRowIndexRequest swapRowIndexRequest = (SwapRowIndexRequest) o;

    return Objects.equals(this.sourceRowId, swapRowIndexRequest.sourceRowId) &&
            Objects.equals(this.sourceRowIndex, swapRowIndexRequest.sourceRowIndex) &&
            Objects.equals(this.targetRowId, swapRowIndexRequest.targetRowId) &&
            Objects.equals(this.targetRowIndex, swapRowIndexRequest.targetRowIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceRowId, sourceRowIndex, targetRowId, targetRowIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwapRowIndexRequest {\n");
    
    sb.append("    sourceRowId: ").append(toIndentedString(sourceRowId)).append("\n");
    sb.append("    sourceRowIndex: ").append(toIndentedString(sourceRowIndex)).append("\n");
    sb.append("    targetRowId: ").append(toIndentedString(targetRowId)).append("\n");
    sb.append("    targetRowIndex: ").append(toIndentedString(targetRowIndex)).append("\n");
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

