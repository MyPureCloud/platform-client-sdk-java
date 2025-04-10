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
 * MergeRequest
 */

public class MergeRequest  implements Serializable {
  
  private String sourceContactId = null;
  private String targetContactId = null;

  public MergeRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the source contact for the merge operation
   **/
  public MergeRequest sourceContactId(String sourceContactId) {
    this.sourceContactId = sourceContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the source contact for the merge operation")
  @JsonProperty("sourceContactId")
  public String getSourceContactId() {
    return sourceContactId;
  }
  public void setSourceContactId(String sourceContactId) {
    this.sourceContactId = sourceContactId;
  }


  /**
   * The ID of the target contact for the merge operation
   **/
  public MergeRequest targetContactId(String targetContactId) {
    this.targetContactId = targetContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the target contact for the merge operation")
  @JsonProperty("targetContactId")
  public String getTargetContactId() {
    return targetContactId;
  }
  public void setTargetContactId(String targetContactId) {
    this.targetContactId = targetContactId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeRequest mergeRequest = (MergeRequest) o;

    return Objects.equals(this.sourceContactId, mergeRequest.sourceContactId) &&
            Objects.equals(this.targetContactId, mergeRequest.targetContactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceContactId, targetContactId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeRequest {\n");
    
    sb.append("    sourceContactId: ").append(toIndentedString(sourceContactId)).append("\n");
    sb.append("    targetContactId: ").append(toIndentedString(targetContactId)).append("\n");
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

