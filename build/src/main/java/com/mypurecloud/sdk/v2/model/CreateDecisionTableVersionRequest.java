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
 * CreateDecisionTableVersionRequest
 */

public class CreateDecisionTableVersionRequest  implements Serializable {
  
  private Integer sourceVersion = null;

  public CreateDecisionTableVersionRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateDecisionTableVersionRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The published, superseded, or snapshot version to create the new draft from. When not provided or null, the published version is used. Must be at least 1 when provided.
   * minimum: 1
   **/
  public CreateDecisionTableVersionRequest sourceVersion(Integer sourceVersion) {
    this.sourceVersion = sourceVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The published, superseded, or snapshot version to create the new draft from. When not provided or null, the published version is used. Must be at least 1 when provided.")
  @JsonProperty("sourceVersion")
  public Integer getSourceVersion() {
    return sourceVersion;
  }
  public void setSourceVersion(Integer sourceVersion) {
    this.sourceVersion = sourceVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDecisionTableVersionRequest createDecisionTableVersionRequest = (CreateDecisionTableVersionRequest) o;

    return Objects.equals(this.sourceVersion, createDecisionTableVersionRequest.sourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDecisionTableVersionRequest {\n");
    
    sb.append("    sourceVersion: ").append(toIndentedString(sourceVersion)).append("\n");
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

