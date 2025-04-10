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
 * ExternalContactsUnresolvedContactChangedTopicMergeOperation
 */

public class ExternalContactsUnresolvedContactChangedTopicMergeOperation  implements Serializable {
  
  private String sourceContactId = null;
  private String targetContactId = null;
  private String resultingContactId = null;

  public ExternalContactsUnresolvedContactChangedTopicMergeOperation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicMergeOperation sourceContactId(String sourceContactId) {
    this.sourceContactId = sourceContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceContactId")
  public String getSourceContactId() {
    return sourceContactId;
  }
  public void setSourceContactId(String sourceContactId) {
    this.sourceContactId = sourceContactId;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicMergeOperation targetContactId(String targetContactId) {
    this.targetContactId = targetContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetContactId")
  public String getTargetContactId() {
    return targetContactId;
  }
  public void setTargetContactId(String targetContactId) {
    this.targetContactId = targetContactId;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicMergeOperation resultingContactId(String resultingContactId) {
    this.resultingContactId = resultingContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resultingContactId")
  public String getResultingContactId() {
    return resultingContactId;
  }
  public void setResultingContactId(String resultingContactId) {
    this.resultingContactId = resultingContactId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsUnresolvedContactChangedTopicMergeOperation externalContactsUnresolvedContactChangedTopicMergeOperation = (ExternalContactsUnresolvedContactChangedTopicMergeOperation) o;

    return Objects.equals(this.sourceContactId, externalContactsUnresolvedContactChangedTopicMergeOperation.sourceContactId) &&
            Objects.equals(this.targetContactId, externalContactsUnresolvedContactChangedTopicMergeOperation.targetContactId) &&
            Objects.equals(this.resultingContactId, externalContactsUnresolvedContactChangedTopicMergeOperation.resultingContactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceContactId, targetContactId, resultingContactId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsUnresolvedContactChangedTopicMergeOperation {\n");
    
    sb.append("    sourceContactId: ").append(toIndentedString(sourceContactId)).append("\n");
    sb.append("    targetContactId: ").append(toIndentedString(targetContactId)).append("\n");
    sb.append("    resultingContactId: ").append(toIndentedString(resultingContactId)).append("\n");
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

